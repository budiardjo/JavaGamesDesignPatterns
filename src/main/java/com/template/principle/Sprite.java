package com.template.principle;

class Sprite {
    protected int x ; // x coordinate of Canvas
    protected int y ; // y coordinate of Canvas
    protected String name ;
    public Sprite(String name, int x, int y) {
        this .name = name;
        this .x = x;
        this .y = y;
    }
    public void draw() {
        String text = this .name + " draw on (" + this .x + " , " + this .y + ")" ;
        System.out .println(text);
    }
    // distanceX: distance moved in the x-axis
// distanceX: distance moved in the y-axis
    public void move(int distanceX, int distanceY) {
        String text = this .name +" move distance (" +distanceX+" , " + distanceY+")" ;
        System.out .println(text);
    }
}