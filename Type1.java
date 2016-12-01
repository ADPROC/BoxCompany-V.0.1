/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

/**
 *
 * @author britt
 */
public class Type1 extends Box {

    private int color = 0;
    
    public Type1(){
        
    }

    public Type1(int width, int length, int height, int grade, int qty, int color, Boolean sealTop, Boolean reinBottom, Boolean reinCorners) {
        super(width, length, height, grade, qty, color, sealTop, reinBottom, reinCorners);
    }

    @Override
    public void cost() {
        System.out.println("enter cost of type 1");
        if (boxArea() > 30) {
            System.out.println("Cost type 1");
            if (grade == 1) {
                cost = (boxArea() * 0.50 * qty);                          // 76 * 0.5 = 38
                System.out.println("Box cost: " + cost);
            } else if (grade == 2) {
                cost = (boxArea() * 0.60 * qty);
                System.out.println("Box Cost:" + cost);
            } else if (grade == 3) {
                cost = (boxArea() * 0.72 * qty);
                System.out.println("Box Cost:" + cost);

            }
            // return cost;  
            if (color == 0) {
                System.out.println("Box has no color");
            }
            System.out.println("Total Cost:" + cost);
            // catch needed for if any number entered it would not be able to have colour message to display
        } else {
            System.out.println("Box 1 of size does not exist");
        }
    }

}
