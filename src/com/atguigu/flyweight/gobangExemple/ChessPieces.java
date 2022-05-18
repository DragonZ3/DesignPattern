package com.atguigu.flyweight.gobangExemple;

import java.awt.*;

//抽象享元角色：棋子
interface ChessPieces {
    public void DownPieces(Graphics g, Point pt);    //下子
}