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

    protected String reinforcedBottom; //boolean
    protected String reinforcedCorners;
    protected String sealableTop;

    protected int width;
    protected int length;
    protected int height;
    //ArrayList<Box> box = new ArrayList<>();
    //Box boxes = new Box();

    public static void main(String[] args) throws IOException {
        String again;
        boolean excep, answer;
        //String lenght, width, height, again;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList< Box> boxes = new ArrayList<>();
        Box boxType = new Box();

        //
        String input, reinBottom, reinCorners, sealTop, TopIn, CornerIn, BottomIn;
        int widthIn, lengthIn, heightIn, color, gradeIn, qtyIn;

        do {
            do {
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
                    TopIn = console.nextLine();

                    System.out.println("\n bottom ?");
                    BottomIn = console.nextLine();

                    System.out.println("\n corners?");
                    CornerIn = console.nextLine();
                    
                    System.out.println(BottomIn);
                    
                    /// type 3/4/5 does not go into cost because it does not validate the bottom nor corners
                    if (color == 0 && (gradeIn == 1 || gradeIn == 2 || gradeIn == 3)&& "no".equals(BottomIn)&& "no".equals(CornerIn) ) {// && BottomIn == "no" && CornerIn == "no") {
                        boxType = new Type1(heightIn, lengthIn, widthIn, gradeIn, qtyIn);
                        boxType.getInfo();
                    } else if (color == 1 && (gradeIn == 2 || gradeIn == 3 || gradeIn == 4) && "no".equals(CornerIn) &&"no".equals(BottomIn)) {// && (BottomIn == "no" && CornerIn == "no")) {
                        boxType = new Type2(heightIn, lengthIn, widthIn, gradeIn, qtyIn);
                        boxType.getInfo();
                    } else if ("no".equals(BottomIn) &&  "no".equals(CornerIn) && color == 2 && (gradeIn == 2 || gradeIn == 3 || gradeIn == 4 || gradeIn == 5)) {// && boxType.setBottom() =="no"&& (BottomIn == "no" && CornerIn == "no")) {
                        //System.out.println("hola from 3");
                        boxType = new Type3(heightIn, lengthIn, widthIn, gradeIn, qtyIn, BottomIn);
                        boxType.getInfo();
                    } else if ("yes".equals(BottomIn) && "no".equals(CornerIn) && color == 2 && (gradeIn == 2 || gradeIn == 3 || gradeIn == 4 || gradeIn == 5)) {
                        boxType = new Type4(widthIn, lengthIn, heightIn, gradeIn, qtyIn, BottomIn);
                        
                        boxType.getInfo();
                        boxType.additional();
                    } else if ("yes".equals(BottomIn) && "yes".equals(CornerIn) && color == 2 && (gradeIn == 3 || gradeIn == 4 || gradeIn == 5)) {
                        boxType= new Type5(widthIn, lengthIn, heightIn, gradeIn, qtyIn, color, TopIn, BottomIn,CornerIn);
                        boxType.getInfo();
                    }
                        else {
                        System.out.println("No such box exsit");
                    }
                    }catch (Exception exRef) {
                    System.err.println(exRef);
                    System.out.println("Marks should be numbers!!");
                    excep = true;
                }

                }
                while (excep);

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
            System.out.println("hi/bye");
//        for (int i = 1; i > 0; i++) {
//            boxes.add(boxType);
//        }
            //System.out.println(boxes);

        }


    }
