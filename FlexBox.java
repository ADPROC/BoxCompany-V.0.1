import java.io.*;
/**
 *
 * @author Pawel
 */
public class FlexBox {
    
    private static int grade;
    private static int width;      // cm 
    private static int length;
    private static int height;
    private static String input;
    
    private static int color;
    
    private static String reinBottom;
   // private static Boolean reinBottom;
    private static String reinCorners;
    
    public static void main(String[] args) throws IOException {
        
        // IO stream
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        // Input/Output (I/O)
        // grade
        System.out.println("\n Enter grade: ");
        input = br.readLine();
        grade = Integer.valueOf(input).intValue();
        
        //width
        System.out.print("\n Enter width of the box: ");
        input = br.readLine();
        width = Integer.valueOf(input).intValue();
        
        //length
        System.out.print("\n Enter length of the box: ");
        input = br.readLine();
        length = Integer.valueOf(input).intValue();
        
        //height
        System.out.print("\n Enter height of the box: ");
        input = br.readLine();
        height = Integer.valueOf(input).intValue();
        
        //color
        System.out.println("\n How many colors whould you like to have, please enter value from 0 to 2: ");
        input = br.readLine();
        color = Integer.valueOf(input).intValue();
        
        //reinforced bottom
        System.out.println("\n Would you like to have reinforced bottom? (Please answer: yes/no):  ");
        reinBottom = br.readLine();
       // input = br.readLine();
       // reinBottom = Boolean.valueOf(input);
        
        //reinforced corners
        System.out.println("\n Would you like to have reinforced corners? (Please answer: yes/no): ");
        reinCorners = br.readLine();
        
        //sealable tops
        
        
        
        
        // objects
        Type1 boxTypeOne = new Type1(width, length, height, grade);           // 2, 5, 4  = 76 m2
        Type2 boxTypeTwo = new Type2(width, length, height, grade, color);
        Type3 boxTypeThree = new Type3(width, length, height, grade, color);
        Type4 boxTypeFour = new Type4(width, length, height, grade, color, reinBottom);  
        Type5 boxTypeFive = new Type5(width, length, height, grade, color, reinBottom, reinCorners);
        
        // check grades and display type
        if(grade >= 1 && grade < 4 && color == 0) {
            boxTypeOne.totalBoxArea();
            boxTypeOne.cost();
            //add sealable top + 8% extra
        }
        else if(grade > 1 && grade < 5 && color == 1) {
            boxTypeTwo.totalBoxArea();
            boxTypeTwo.cost();
        }
        else if(grade > 1 && grade <= 5 && color == 2 && ("no".equals(reinBottom))) {
            boxTypeThree.totalBoxArea();
            boxTypeThree.cost();
        }
        
        else if((grade > 1 && grade <= 5 && color == 2) && ("yes".equals(reinBottom)) && ("no".equals(reinCorners)) ) {
            boxTypeFour.totalBoxArea();
            boxTypeFour.cost();
        }
        else if(grade > 2 && grade <= 5 && color == 2 && ("yes".equals(reinBottom)) && ("yes".equals(reinCorners))) {
            boxTypeFive.totalBoxArea();
            boxTypeFive.cost();
        }
        
        
    }
    
}
