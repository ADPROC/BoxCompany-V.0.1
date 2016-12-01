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
public class Type4 extends Box {

    protected double finalCost;
    //protected int color = 2;
    //protected String reinBottom = "yes";

    public Type4(){
        
    }
    public Type4(int width, int length, int height, int grade, int qty,int color, Boolean sealTop, Boolean reinBottom, Boolean reinCorners) {//int color, , String sealTop,, String reinCorners) {
        super(width, length, height, grade, qty, color, sealTop, reinBottom, reinCorners); 
    }

    @Override
    public void cost() {
        System.out.println("enter cost type 4");
        //if (reinBottom == "yes") {
        if (super.boxArea() > 1) {
            System.out.println("cost type 4");
            if (grade == 2) {
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
            
        }else{
            System.out.println("no such box 4 exist.");
        }
        
     finalCost= cost;

        // return cost;  
//            if (color == 1) {
//                finalCost = ((13 / 100) * cost) + cost;
        // additionals();
        //}
        // catch needed for if any number entered it would not be able to have colour message to display
        // }
        
        //additional();
        System.out.println("Total Cost type 4:" + finalCost +cost);

    }

//    public void additionals() {
//        if (color == 2) {
//            System.out.println("color: 2");
//            System.out.println("color type ");
//            if (reinBottom == "yes") {
//                finalCost = finalCost + ((16 / 100) * cost);
//                System.out.println("reinforce type4");
//                additionals();
//
//            }
//        } else {
//            System.out.println("No color selected.");
//        }
//
//        if (reinBottom == "yes") {
//            System.out.println("Reinforced Bottoms: yes");
//
//        }
    //}
}
