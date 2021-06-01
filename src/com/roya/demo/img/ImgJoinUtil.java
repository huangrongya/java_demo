package com.roya.demo.img;


import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.TextAttribute;
import java.awt.image.BufferedImage;
import java.text.AttributedString;
import java.util.List;

/**
 * @Author royle.huang
 * @Date 15:34 2020/2/12
 * @Description 图片拼接
 **/
public class ImgJoinUtil {

    public static BufferedImage createColorImg(final int width, final int height, final Color color, List<ImgBean> imgBeanList, List<TextBean> textBeanList) {
        return createColorImg(width, height, color, null, imgBeanList, textBeanList);
    }

    /**
     * @param width        图片宽度
     * @param height 图片高度
     * @param color 背景颜色
     * @param outPath 输出路径，可为空
     * @param imgBeanList 图片列表
     * @param textBeanList 文字列表
     * @return
     */
    public static BufferedImage createColorImg(final int width, final int height, final Color color, String outPath, List<ImgBean> imgBeanList, List<TextBean> textBeanList) {
        if (width < 1 || height < 1) {
            return null;
        }

        BufferedImage bufferedImage = createColorImg(width, height, color);
        try {
            //构造一个类型为预定义图像类型之一的 BufferedImage。 宽度为第一只的宽度，高度为各个图片高度之和
            //进行图片的处理
            if (CollectionUtils.isNotEmptyCollection(imgBeanList)) {
                Graphics graphics = bufferedImage.createGraphics();
                for (ImgBean imgBean : imgBeanList) {
                    if (null == imgBean.getFile()&&null==imgBean.getStream()&&null==imgBean.getBufferedImage()) {
                        continue;
                    }
                    BufferedImage image = null;
                    if (imgBean.getBufferedImage()!=null){
                        image = imgBean.getBufferedImage();
                    }else if (imgBean.getStream()!=null){
                        image = ImageIO.read(imgBean.getStream());
                    }else {
                        image = ImageIO.read(imgBean.getFile());
                    }
                    int img_height = imgBean.getImg_height();
                    int img_width = imgBean.getImg_width();
                    if (img_height < 1) {
                        img_height = image.getHeight();
                    }
                    if (img_width < 1) {
                        img_width = image.getWidth();
                    }
                    graphics.drawImage(image, imgBean.getLeft(), imgBean.getTop(), img_width, img_height, null);
                }

                // 释放此图形的上下文以及它使用的所有系统资源。
                graphics.dispose();
            }

            //进行文字的处理
            if (CollectionUtils.isNotEmptyCollection(textBeanList)) {
                for (TextBean textBean : textBeanList) {
                    if (StringUtils.isEmpty(textBean.getText())) {
                        continue;
                    }
                    //字体
                    Graphics2D graphics2D = bufferedImage.createGraphics();
                    Font font = null;
                    if (null != textBean.getFont()) {
                        font = textBean.getFont();
                    } else {
                        font = FontUtil.getDefaultFont();
                    }
                    graphics2D.setFont(font);

                    graphics2D.setColor(textBean.getColor());
                    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    //获取字符高度
                    int strHeight = graphics2D.getFontMetrics().getHeight();

                    //得到文字的长度
                    int maxLength = FontUtil.getStringLength(font, textBean.getText());
                    //判断是否控制了文字长度
                    if (textBean.getMax_width() > 0 && maxLength > textBean.getMax_width()) {

                        //循环得到字符串的长度
                        String newStr = textBean.getText();

                        //计算增加了几行
                        int addLines = maxLength/textBean.getMax_width();
                        //重新设置坐标
                        textBean.setTop(textBean.getTop()-addLines*strHeight/2);
                        //初始高度
                        int inity = textBean.getTop();


                        //如果不是最后的长度
                        while (!FontUtil.isMaxStr(font, newStr, textBean.getMax_width())) {
                            String istr = FontUtil.strSplitMaxLenth(font, newStr, textBean.getMax_width());
                            //直接绘制
                            graphics2D.drawString(istr, textBean.getLeft(), inity);
                            //完成后，进行初始化
                            newStr = newStr.replaceFirst(istr, "");

                            //高度再次重构
                            inity += strHeight + textBean.getLine_height();
                        }
                        //最后补一次
                        if (newStr.length() > 0) {
                            graphics2D.drawString(newStr, textBean.getLeft(), inity);
                        }

                    } else {
                        if (textBean.getDelLine()){
                            AttributedString attributedString = new AttributedString(textBean.getText());
                            attributedString.addAttribute(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
                            attributedString.addAttribute(TextAttribute.FONT, font);
                            graphics2D.drawString(attributedString.getIterator(),textBean.getLeft(), textBean.getTop());
                        }else {
                            graphics2D.drawString(textBean.getText(), textBean.getLeft(), textBean.getTop());
                        }
                    }
                    // 释放此图形的上下文以及它使用的所有系统资源。
                    graphics2D.dispose();
                }
            }


            //将绘制的图像生成至输出流
//            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
//            encoder.encode(bufferedImage);
            return bufferedImage;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return bufferedImage;
    }

    //创建一张底图
    public static BufferedImage createColorImg(int width, int height, Color color) {
        //创建一个图片缓冲区
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
        //获取图片处理对象
        Graphics graphics = bufferedImage.getGraphics();
        //填充背景色
        graphics.setColor(color);
        graphics.fillRect(0, 0, width, height);

        return bufferedImage;
    }

}
