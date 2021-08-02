package com.template.game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

class Sprite {
    protected int x ; // x coordinate of Canvas
    protected int y ; // y coordinate of Canvas
    protected BufferedImage image ;
    public Sprite(int x, int y, BufferedImage image){
        this .x = x;
        this .y = y;
        this .image = image;
    }
    public void draw(Graphics g){
        g.drawImage(image , this .x , this .y , null );
    }
    public void move(int distanceX, int distanceY){
        this .x = this .x + distanceX;
        this .y = this .y + distanceY;
    }
}
