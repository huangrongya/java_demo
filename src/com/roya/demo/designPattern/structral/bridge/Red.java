package com.roya.demo.designPattern.structral.bridge;

/**
 * @author Royle.Huang
 * @date 2018/12/30 11:54
 * @description: 修正抽象化角色 Refined Abstraction
 */
public class Red implements Color{
    @Override
    public void paint() {
        System.out.print("red ");
    }
}
