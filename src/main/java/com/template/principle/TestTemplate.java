package com.template.principle;

public class TestTemplate {
    public static void main(String[] args) {
        BluePlane bluePlane = new BluePlane("BluePlane" , 50,150);
        bluePlane.draw();
        bluePlane.move(5, 5);
    }
}
