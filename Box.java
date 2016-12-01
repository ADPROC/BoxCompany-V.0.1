/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

import java.io.*;
import java.util.*;

/**
 *
 * @author britt
 */
public abstract class Box {     // ? maybe should be ... extends Type ?

    protected int grade;
    protected int color;
    protected int qty;
    protected int totalOrders;

    protected Boolean reinBottom; //boolean
    protected Boolean reinCorners;
    protected Boolean sealableTop;

    protected int width;
    double fCost;
    protected int length;
    protected int height;

    protected int boxArea;// change this to double 
    protected double cost;
    protected int AreaOfBox;// change this to double 

    ArrayList<Box> box1 = new ArrayList<>();
//    Box attend = new Box();

    // ArrayList Linked ?
    public Box() {

    }

    public Box(int widthIn, int lengthIn, int heightIn, int gradeIn, int qtyIn, int colorIn) {
        width = widthIn;
        length = lengthIn;
        height = heightIn;
        grade = gradeIn;
        color = colorIn;
        qty = qtyIn;
    }

    public Box(int width, int length, int height, int grade,  int qty,int color, Boolean Bottom, Boolean Corners, Boolean sealTop) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.grade = grade;
        this.sealableTop = sealTop;
        this.reinCorners = Corners;
        this.reinBottom = Bottom;
        this.qty = qty;
    }

    public abstract void cost();
    //public abstract double additional();

    public double boxArea() {
        //System.out.println("enter box area of box");
        int Area = ((2 * (this.height * this.width)) + (2 * (this.height * this.length)) + (2 * (this.length * this.width)));
        AreaOfBox = Area / 100;
        return AreaOfBox;
    }

    public Boolean getBottom() {
        return reinBottom;
    }

    public void setBottom(Boolean Bottom) {
        this.reinBottom = Bottom;
    }

//    public String BottomIn(String Bottom){
//        String In= Bottom;
//        return In;
//    }
    // access methods
    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    // update methods
    public void setWidth(int widthIn) {
        this.width = widthIn;
    }

    public void setLength(int lengthIn) {
        this.length = lengthIn;
    }

    public void setHeight(int heightIn) {
        this.height = heightIn;
    }

    public void boxCost() {
        cost = (0.5 * qty);
        System.out.println("Cost:" + cost);
    }

    public int color() {
        return color;
    }

    public int order() {
        int orders = 0;
        totalOrders = orders + 1;
        return totalOrders;
    }

    public void getInfo() {
        boxArea();
        System.out.println("enter additions");
        //additional();
        cost();
    }
}
