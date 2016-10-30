/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pawel
 */
public class Type4 {
    
    private int width;      // cm 
    private int length;
    private int height;
    private int grade;
    
    private int color;
    private String reinBottom;
   // private Boolean reinBottom;
    
    private int boxArea;
    private double cost;
    
    //public Type4(int width, int length, int height, int grade, int color, Boolean reinBottom) {
    public Type4(int width, int length, int height, int grade, int color, String reinBottom) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.grade = grade;
        this.color = color;
        this.reinBottom = reinBottom;
    }
    
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
    
    public int getGrade() {
        return grade;
    }
    
    public int getColor() {
        return color;
    }
    
    public String getReinforcedBottom() {
   // public Boolean getReinforcedBottom() {
        return reinBottom;
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
    
    public void setGrade(int gradeIn) {
        this.grade = gradeIn;
    }
    
    public void setColor(int colorIn) {
        this.color = colorIn;
    }
    
    public void setReinforcedBottom(String reinBottom) {
    // public void setReinforcedBottom(Boolean reinBottom) {
        this.reinBottom = reinBottom;
    }
    
    public void totalBoxArea() {
        boxArea = (2 * length * width) + (2 * length * height) + (2 * width * height);
        System.out.println("Box area: " + boxArea);
         System.out.println("Type 4");
    }
   
    
    public void cost() {
        if(grade == 2) {
            double boxCost = boxArea * 0.60;
            cost = boxCost + ((boxCost) * 0.16) + (boxCost * 0.14);      // 76 * 0.6 + (( 76 * 0.6) * 0.16) + ((76 * 0.6) * 0.14) = 45.6 + 7.296 + 6.384 = 59.28 (to correct, two places after comma
            System.out.println("Box cost: " + cost);
        }
        else if(grade == 3) {
            double boxCost = boxArea * 0.72;
            cost = boxCost + ((boxCost) * 0.16) + (boxCost * 0.14);
            System.out.println("Box cost: " + cost);
        }
        else if(grade == 4) {
            double boxCost = boxArea * 0.90;
            cost = boxCost + ((boxCost) * 0.16) + (boxCost * 0.14);
            System.out.println("Box cost: " + cost);
        }
        else if(grade == 5) {
            double boxCost = boxArea * 1.4;
            cost = boxCost + ((boxCost) * 0.16) + (boxCost * 0.14);
            System.out.println("Box cost: " + cost);
        }
    }

}
