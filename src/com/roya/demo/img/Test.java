package com.roya.demo.img;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.text.AttributedString;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        try {
            int multi=3;
            String img = "http://wx2.sinaimg.cn/mw600/00869HDlly1gkd38r2l2yj30fl0flam1.jpg";
            URL imgUrl = new URL(img);
            ImgBean headImgBean = new ImgBean();
            headImgBean.setStream(imgUrl.openStream());
            headImgBean.setLeft(0);
            headImgBean.setTop(0);
            headImgBean.setImg_width(320*multi);
            headImgBean.setImg_height(320*multi);

            URL qrCodeUrl= new URL("http://img.mx.cqssds.com/unified-platform/upload/qrCode/2020/10/6FACE3DBB4E583FBBA5A882473972515.png");
            ImgBean qrCodeBean = new ImgBean();
            qrCodeBean.setStream(qrCodeUrl.openStream());
            qrCodeBean.setLeft(204*multi);
            qrCodeBean.setTop(336*multi);
            qrCodeBean.setImg_height(100*multi);
            qrCodeBean.setImg_width(100*multi);

            //文字
            TextBean pNameBean = new TextBean();
            pNameBean.setText("幻想家·哑面磨砂啄木嘴 玻璃内胆保温壶");
//            pNameBean.setText("幻想家·哑面");
            pNameBean.setLeft(16*multi);
            pNameBean.setTop(365*multi);
            pNameBean.setMax_width(182*multi);
            Font pNameFont = new Font("PingFang SC Regular", Font.PLAIN, 16*multi);
            pNameBean.setFont(pNameFont);
            pNameBean.setColor(new Color(0xFF262626, true));

            TextBean priceBean = new TextBean();
            priceBean.setText("￥44.5");
            priceBean.setLeft(16*multi);
            priceBean.setTop(407*multi);
            Font priceFont = new Font("PingFang SC Medium", Font.PLAIN, 16*multi);
            priceBean.setFont(priceFont);
            priceBean.setColor(new Color(0xFFFD7A00,true));

            TextBean delPriceBean = new TextBean();
            delPriceBean.setText("￥11.5");
            delPriceBean.setLeft(78*multi);
            delPriceBean.setTop(407*multi);
            delPriceBean.setDelLine(true);
            Font delPriceFont = new Font("PingFang SC Regular", Font.PLAIN, 12*multi);
            delPriceBean.setFont(delPriceFont);
            delPriceBean.setColor(new Color(0x99262626, true));

            TextBean descBean = new TextBean();
            descBean.setText("长按或扫描二维码");
            descBean.setLeft(206*multi);
            descBean.setTop(450*multi);
            Font descFont = new Font("PingFang SC Regular", Font.PLAIN, 12*multi);
            descBean.setFont(descFont);
            descBean.setColor(new Color(0xCC262626, true));


            List<ImgBean> imgBeans = new ArrayList<>();
            imgBeans.add(headImgBean);
            imgBeans.add(qrCodeBean);

            List<TextBean> textBeans = new ArrayList<>();
            textBeans.add(pNameBean);
            textBeans.add(priceBean);
            textBeans.add(delPriceBean);
            textBeans.add(descBean);
            BufferedImage bufferedImage = ImgJoinUtil.createColorImg(320*multi, 462*multi, new Color(255,255,255), imgBeans, textBeans);
            ImageIO.write(bufferedImage, "png",new File("C:\\temp\\1.png"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
