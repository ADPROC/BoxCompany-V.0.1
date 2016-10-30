/**
 *
 * @author Pawel
 */
public class Type1 {
    
    private int width;      // cm 
    private int length;
    private int height;
    private int grade;
    
    private int boxArea;
    private double cost;
    
    public Type1(int width, int length, int height, int grade) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.grade = grade;
    }
    
    // access methods
    public int getWidth() {
        return width;
    }
    
    public int getLength() {
        return length;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getGrade() {
        return grade;
    }
    
    // update methods
    public void setWidth(int widthIn) {
        this.width = widthIn;
    }
    
    public void setLength(int lengthIn) {
        this.length = lengthIn;
    }
    
    public void setHeight(int heightIn) {
        this.height = heightIn;
    }
    
    public void setGrade(int gradeIn) {
        this.grade = gradeIn;
    }
    
    public void totalBoxArea() {
        boxArea = (2 * length * width) + (2 * length * height) + (2 * width * height);
        System.out.println("Box area: " + boxArea);
        System.out.println("Type 1");
    }
    
    public void cost() {
        if(grade == 1) {
            cost = boxArea * 0.50;                          // 76 * 0.5 = 38
            System.out.println("Box cost: " + cost);
        }
        else if(grade == 2) {
            cost = boxArea * 0.60;
            System.out.println("Box cost: " + cost);
        }
        else if(grade == 3) {
            cost = boxArea * 0.72;
            System.out.println("Box cost: " + cost);
        }
    }
}
