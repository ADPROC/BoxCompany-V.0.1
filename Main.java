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
import java.io.*;
import java.util.*;

public class Main {

    public Main() {

    }

    static Scanner console = new Scanner(System.in);

    protected String stName;
    protected int grade;
    protected int color;
    protected int qty;

    protected int width;
    protected int length;
    protected int height;

    public static void main(String[] args) throws IOException {
        String again;
        boolean excep, answer;
        //String lenght, width, height, again;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<Box> boxes = new ArrayList<>();
        Box boxType;

        for (int noOfBoxes = 0; noOfBoxes < boxes.size(); noOfBoxes++) {
            boxType = boxes.get(noOfBoxes);
        }

        String input;
        Boolean TopIn = true;
        String Bottom, Corner, Top;
        int widthIn, lengthIn, heightIn, color, gradeIn, qtyIn;

        do {

            do {
                Boolean CornerIn = false;
                Boolean BottomIn = false;
                excep = false;
                try {

                    //1 width
                    System.out.print("\n Enter width of the box: ");
                    widthIn = console.nextInt();

                    //2 length
                    System.out.print("\n Enter length of the box: ");
                    lengthIn = console.nextInt();

                    //3 height
                    System.out.print("\n Enter height of the box: ");
                    heightIn = console.nextInt();

                    //4  grade
                    System.out.println("\n Enter grade: ");
                    gradeIn = console.nextInt();

                    //5 color
                    System.out.println("\n How many colors whould you like to have, please enter value from 0 to 2: ");
                    color = console.nextInt();

                    System.out.print("\n Product quantity: ");
                    qtyIn = console.nextInt();

                    System.out.println("\n seal Top?");
                    Top = console.nextLine();
//
                    System.out.println("\n bottom ? ");
                    Bottom = console.nextLine();
//
                    System.out.println("\n corners? ");
                    Corner = console.nextLine();

                    //System.out.println(BottomIn);
                    if (Bottom == "yes") {
                        BottomIn = true;
                    } else if (Bottom == "no") {
                        BottomIn = false;
                    }

                    if (Corner == "yes") {
                        CornerIn = true;
                    } else if (Corner == "no") {
                        CornerIn = false;
                    }
                    if (Top == "yes") {
                        TopIn = true;
                    } else if (Top == "no") {
                        TopIn = false;
                    }
                    if (color == 0 && (gradeIn == 1 || gradeIn == 2 || gradeIn == 3) && BottomIn && CornerIn) {
                        Type1 Box1 = new Type1(heightIn, lengthIn, widthIn, gradeIn, qtyIn, 0, TopIn, false, false);
                        Box1.getInfo();
                        boxes.add(Box1);
                        } else if (color == 1 && (gradeIn == 2 || gradeIn == 3 || gradeIn == 4) && BottomIn && CornerIn) {
                        Type2 Box2 = new Type2(heightIn, lengthIn, widthIn, gradeIn, qtyIn, 1, false, false, false);
                        Box2.getInfo();
                        boxes.add(Box2);
                    } else if (color == 2 && (gradeIn == 2 || gradeIn == 3 || gradeIn == 4 || gradeIn == 5) && BottomIn == false && CornerIn == false) {
                        Type3 Box3 = new Type3(widthIn, lengthIn, heightIn, gradeIn, qtyIn, 2, TopIn, false, false);
                        Box3.getInfo();
                        boxes.add(Box3);
                        } else if (BottomIn == true && CornerIn == false && color == 2 && (gradeIn == 2 || gradeIn == 3 || gradeIn == 4 || gradeIn == 5)) {
                        Type4 Box4 = new Type4(widthIn, lengthIn, heightIn, gradeIn, qtyIn, 2, true, false, TopIn);
                        Box4.getInfo();
                        boxes.add(Box4);
                    } else if (BottomIn == true && CornerIn == true && color == 2 && (gradeIn == 3 || gradeIn == 4 || gradeIn == 5)) {
                        Type5 Box5 = new Type5(widthIn, lengthIn, heightIn, gradeIn, qtyIn, 2, TopIn, true, true);
                        Box5.getInfo();
                        boxes.add(Box5);
                    } else {
                        System.out.println("No such box exsit");
                    }
                } catch (Exception exRef) {
                    System.err.println(exRef);
                    System.out.println("Marks should be numbers!!");
                    excep = true;
                }
            } while (excep);

            System.out.println("arraylist");
            System.out.println("another?(y(/n)");
            again = console.nextLine();
            answer = false;
            System.out.println("vb");
            if (again.charAt(0) == 'y') {
                System.out.println("qc");
                answer = true;

            } else {
                break;
            }
        } while (answer);
        System.out.println("Thank you for shopping with FlexBox!");
    }

}
