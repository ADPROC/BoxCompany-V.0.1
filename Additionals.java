/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

/**
 *
 * @author up794190
 */
public class Additionals extends Box {

    protected double Cost;

    public Additionals(int width, int length, int height, int grade,  int qty,int color, String Bottom, String Corners, String sealTop) {
        super(width, length, height, grade, qty, color, Bottom, Corners, sealTop);//, sealTop);//, reinBottom, reinCorners);

    }

    @Override
    public double additional() {
        System.out.println("add");
        if (color == 2) {
            System.out.println("color add");
            System.out.println("color: 2");
            System.out.println("color type ");
            if (reinBottom == "yes") {
                System.out.println("Reinforced Bottoms: yes");
                Cost = cost + ((16 / 100) * cost);
                System.out.println("reinforce type4");
                additional();

            }
        } else if (color == 1) {
            Cost = ((13 / 100) * cost) + cost;
            {
                System.out.println("No color selected.");
            }
        }
        System.out.println("no additionals");
        return 10;
    }
    
}
