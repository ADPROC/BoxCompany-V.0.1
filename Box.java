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
public class Box {     // ? maybe should be ... extends Type ?

    protected int grade;
    protected int color;
    protected int qty;
    protected int totalOrders;

    protected String reinBottom; //boolean
    protected String reinCorners;
    protected String sealableTop;

    protected int width;
    double fCost;
    protected int length;
    protected int height;

    protected int boxArea;
    protected double cost;
    protected int AreaOfBox;

    ArrayList<Box> box1 = new ArrayList<>();
//    Box attend = new Box();

    // ArrayList Linked ?
    public Box() {

    }

    public Box(int widthIn, int lengthIn, int heightIn, int gradeIn, int qtyIn, String Bottom) {//, String Corners
        width = widthIn;
        length = lengthIn;
        height = heightIn;
        grade = gradeIn;
        reinBottom = Bottom;
        //reinCorners= Corners;
        qty = qtyIn;
    }

    public Box(int widthIn, int lengthIn, int heightIn, int gradeIn, int qtyIn, int colorIn) {//, String Corners
        width = widthIn;
        length = lengthIn;
        height = heightIn;
        grade = gradeIn;
        color = colorIn;
        //reinBottom = Bottom;
        //reinCorners= Corners;
        qty = qtyIn;
    }

    public Box(int width, int length, int height, int grade, int qty) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.grade = grade;
        this.sealableTop = sealableTop;
        this.qty = qty;
    }

    public Box(int width, int length, int height, int grade, int color, int qty, String Bottom, String Corners, String sealTop) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.grade = grade;
        this.sealableTop = sealTop;
        this.reinCorners = Corners;
        this.reinBottom = Bottom;
        this.qty = qty;
    }

    public String getBottom() {
        return reinBottom;
    }

    public void setBottom(String Bottom) {
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

    //objects
//       // Box flexBox = new Box(width, length, height, grade, color, reinBottom, reinCorners, sealTop);
//Type1 flexBoxType1 = new Type1(width, length, height, grade, qty, sealableTop);
//    }45
    public double boxArea() {
        //System.out.println("enter box area of box");
        int Area = ((2 * (this.height * this.width)) + (2 * (this.height * this.length)) + (2 * (this.length * this.width)));
        AreaOfBox = Area / 100;
        return AreaOfBox;
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

    public double additional() {
        System.out.println("add");
        if (color == 2) {
            System.out.println("color add");
            System.out.println("color: 2");
            System.out.println("color type ");
            if (reinBottom == "yes") {
                System.out.println("Reinforced Bottoms: yes");
                fCost = fCost + ((16 / 100));// * cost);
                System.out.println("reinforce type4");
                additional();

            }
        } else if (color == 1) {
            fCost = ((13 / 100) * cost) + cost;
            {
                System.out.println("No color selected.");
            }
        }
        System.out.println("no additionals");
        return fCost;
    //System.out.println ("box add ");

//return 0;

    }

    public void getInfo() {
        boxArea();
        System.out.println("enter additions");
        additional();
        cost();
    }

//    public void addBox(Box boc){
//        box1.add(boc);
//        totalOrders ++;
//        int i=0;
////        for (i = 0; i <50; i++) {
////            boxType.add(boxes.get(i));
////        }
//    }
//    public void printInfo(){
//        System.out.println("\ncourse name=" + order());
//        System.out.println("\taverage=" + boxArea());
//        //System.out.println("\t Number of students=" + getStudCourseNum());
//        for (int i = 0;i < order();i++) {
//            boxType= box1.get(i);
//            System.out.println("\t" + boxType.AreaOfBox);
//            
//    }
//         int ind =  maxAverage();
//        attend =studentList.get(ind);
//        attend.printOut();
    //  }
    public void cost() {
        System.out.println("enter cost");
        if (boxArea() < 550) {
            if (grade == 1) {
                cost = (boxArea() * 0.50 * qty);                          // 76 * 0.5 = 38
                System.out.println("Box cost: " + cost);
            } else if (grade == 2) {
                cost = (boxArea() * 0.60 * qty);
                System.out.println("Box Cost:" + cost);
            } else if (grade == 3) {
                cost = (boxArea() * 0.72 * qty);
                System.out.println("Box Cost:" + cost);

            } else if (grade == 4) {
                cost = (boxArea() * 0.90 * qty);
                System.out.println("Box Cost:" + cost);
            } else if (grade == 5) {
                cost = boxArea() * 1.4 * qty;
                System.out.println("Box Cost:" + cost);
            }

            // return cost;  
            if (color == 0) {
                System.out.println("Box has no color Box");
            }
            // catch needed for if any number entered it would not be able to have colour message to display
        }
        System.out.println("Total Cost:" + cost);
        //InputOutput intput = new InputOutput();
////         Type1 type= new Type1();45
//    public void boxInfo() {
//        System.out.println("Box size:" + getWidth() + "x" + getHeight() + "x" + getLength());
//    }

    }
}
