/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pawel
 */
public class Type2 {
    
    private int width;      // cm 
    private int length;
    private int height;
    private int grade;
    
    private int color;
    
    private int boxArea;
    private double cost;
    
    public Type2(int width, int length, int height, int grade, int color) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.grade = grade;
        this.color = color;
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
    
    public void totalBoxArea() {
        boxArea = (2 * length * width) + (2 * length * height) + (2 * width * height);
        System.out.println("Box area: " + boxArea);
         System.out.println("Type 2");
    }
    
    public void cost() {
        if(grade == 2) {
            //cost = boxArea * 0.50  + ((boxArea * 0.50) * 0.13);   38 + 4.94 = 42.94  // 76 * 0.50 + ((76 * 0.50) * 0.13) = 38 + 4.94 = 42.94
            cost = boxArea * 0.60 + ((boxArea * 0.60) * 0.13);      // 76 * 0.6 + (( 76 * 0.6) * 0.13) = 45.6 + 5.928 = 51.528 (to correct, two places after comma
            System.out.println("Box cost: " + cost);
        }
        else if(grade == 3) {
            cost = boxArea * 0.72 + ((boxArea * 0.72) * 0.13);
            System.out.println("Box cost: " + cost);
        }
        else if(grade == 4) {
            cost = boxArea * 0.90 + ((boxArea * 0.90) * 0.13);
            System.out.println("Box cost: " + cost);
        }
    }
}
