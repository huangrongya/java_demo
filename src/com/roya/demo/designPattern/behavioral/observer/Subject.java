package com.roya.demo.designPattern.behavioral.observer;

public interface Subject {
    /**
     * @author Royle.Huang
     * @date 2019/1/1 17:10
     * @description: 增加订阅
     */
    void attach(Observer observer);
    /**
     * @author Royle.Huang
     * @date 2019/1/1 17:11
     * @description: 删除订阅
     */
    void dettach(Observer observer);
    /**
     * @author Royle.Huang
     * @date 2019/1/1 17:11
     * @description: 通知订阅者
     */
    void notify(String massage);
}
