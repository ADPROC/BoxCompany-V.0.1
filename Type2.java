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
public class Type2 extends Box{
    public double finalCost;
    private int color=1;
    
    public Type2(){
        
    }
     public Type2(int width, int length, int height, int grade , int qty,int color, Boolean sealTop, Boolean reinBottom, Boolean reinCorners) {
        super(width, length, height, grade, qty,color, sealTop, reinBottom, reinCorners);
    }
//    public void additionals(){
//        System.out.println("color: 1");
//    }
    @Override
    public void cost() {
        System.out.println("enter  type 2 cost");
        if(super.boxArea()>100){
            System.out.println("cost type 2");
             if(grade==2){
                cost=(super.boxArea() *0.60 * qty);
                System.out.println("Box Cost:"  + cost);
            }
            else if(grade==3){
                cost=(super.boxArea() *0.72 * qty);
                System.out.println("Box Cost:"  + cost);
                
            }
            else if(grade==4){
                cost=(super.boxArea() *0.90 * qty);
                System.out.println("Box Cost:"  + cost);
            }
            
           // return cost;  
           if(color==1){
                finalCost= ((13/100)* cost) + cost;
                System.out.println("Box 2 does exist");
                
                //additionals();
            }
           System.out.println("Total Cost:" + finalCost);
           // catch needed for if any number entered it would not be able to have colour message to display
        }
        
    
}
}