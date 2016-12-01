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
public class Type3 extends Box {

    protected double finalCost;
    //private int color = 2;
    
    public Type3(){
        
    }

    public Type3(int width, int length, int height, int grade, int qty,int color, Boolean sealTop, Boolean reinBottom, Boolean reinCorners) {
        super(width, length, height, grade, qty,color,  sealTop, reinBottom, reinCorners);
    }

//    public void additionals() {
//        System.out.println("color: 22");
//    }

    /**
     *
     */
    @Override
    public void cost() {
        if (super.boxArea() < 80) {
            System.out.println("cost type 3");
            //if (reinBottom == "no") {
                if (grade == 2) {
                    cost = (boxArea() * 0.60 * qty);
                    System.out.println("Box Cost:" + qty + "x 0.60=" + cost);
                } else if (grade == 3) {
                    cost = (boxArea() * 0.72 * qty);
                    System.out.println("Box Cost:" + qty + "x 0.72=" + cost);

                } else if (grade == 4) {
                    cost = (boxArea() * 0.90 * qty);
                    System.out.println("Box Cost:" + qty + "x 0.90=" + cost);
                } else if (grade == 5) {
                    cost = boxArea() * 1.4 * qty;
                    System.out.println("Box Cost:" + qty + "x 1.4=" + cost);
                }
            //}

            // return cost;  
//            if (color == 2) {
//                finalCost = ((16 / 100) * cost) + cost;
//                System.out.println("Box 3 exsit");
//
//                additionals();
//            }
            System.out.println("Total Cost 3:"  + cost);
            // catch needed for if any number entered it would not be able to have colour message to display
        } else {
            System.out.println("no such box of type 3 exist.");
        }

    }
}
