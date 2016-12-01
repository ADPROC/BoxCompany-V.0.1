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
public class Type5 extends Box{
    
     protected double finalCost;
     
     public Type5(){
         
     }

    public Type5(int width, int length, int height, int grade, int color, int qty, Boolean sealTop,Boolean reinBottom, Boolean reinCorners) {
        super(width, length, height, grade, qty, color, sealTop, reinBottom, reinCorners);
    }

//    public void additionals() {
//        if (color == 2) {
//            System.out.println("color: 2 hi 5");
//        }else{
//            System.out.println("No color selected.");
//        }
//       if(reinBottom =="yes"){
//            System.out.println("Reinforced Bottoms: yes");
//        }
//       if(reinCorners== "yes"){
//           System.out.println("Reinforced Corners:  yes");
//       }
//
//    }

     @Override
    public void cost() {
        System.out.println("Enter type cost 5");
        if (boxArea() >1) {
            System.out.println("Enter box 5");
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
            if (color == 2) {
               finalCost = ((13 / 100) * cost) + cost;
                
                //additionals();
            }
           
//            if(reinCorners=="yes"){
//                finalCost=finalCost+ ((10/100)* cost);
//                additionals();
//                
//            }
//            
//            
            // catch needed for if any number entered it would not be able to have colour message to display
        }else{
            System.out.println("No such box 5 exist.");
        }
        System.out.println("Total Cost 5:" + finalCost+ cost);

    }
}
    
