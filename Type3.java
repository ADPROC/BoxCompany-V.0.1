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

    public Type3(int width, int length, int height, int grade, int qty, String reinBottom) {//, String reinBottom, String reinCorners){//,int color, String sealTop, String reinBottom, String reinCorners) {
        super(width, length, height, grade, qty, reinBottom);//,reinBottom,reinCorners),color,sealTop ,reinBottom, reinCorners);
    }

//    public void additionals() {
//        System.out.println("color: 22");
//    }

    /**
     *
     */
    @Override
    public void cost() {
        if (boxArea() < 80) {
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
            System.out.println("Total Cost:" + finalCost);
            // catch needed for if any number entered it would not be able to have colour message to display
        } else {
            System.out.println("no such box of type 3 exist.");
        }

    }
}
