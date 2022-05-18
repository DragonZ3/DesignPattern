package com.atguigu.builder.stuApplyBuilder;

import java.awt.*;
import javax.swing.*;
//产品：客厅
public class Parlour {
    private String wall;    //墙
    private String TV;    //电视
    private String sofa;    //沙发
    private String floor;    //地板

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    //用于显示图片(将装修效果图显示出来)
    public void show() {
        System.out.println("客厅有:"+wall+","+TV+","+sofa+","+floor);

    }
}
