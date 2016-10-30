
/**
 *
 * @author Pawel
 */
public class Type5 {
    
     
    private int width;      // cm 
    private int length;
    private int height;
    private int grade;
    
    private int color;
    private String reinBottom;
   // private Boolean reinBottom;
    private String reinCorners;
    
    private int boxArea;
    private double cost;
    
    //public Type4(int width, int length, int height, int grade, int color, Boolean reinBottom) {
    public Type5(int width, int length, int height, int grade, int color, String reinBottom, String reinCorners) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.grade = grade;
        this.color = color;
        this.reinBottom = reinBottom;
        this.reinCorners = reinCorners;
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
    
    public int getColor() {
        return color;
    }
    
    public String getReinforcedBottom() {
   // public Boolean getReinforcedBottom() {
        return reinBottom;
    }
    
    public String getReinforcedCorners() {
        return reinCorners;
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
    
    public void setColor(int colorIn) {
        this.color = colorIn;
    }
    
    public void setReinforcedBottom(String reinBottom) {
    // public void setReinforcedBottom(Boolean reinBottom) {
        this.reinBottom = reinBottom;
    }
    
    public void setReinforcedCorners(String reinCorners) {
        this.reinCorners = reinCorners;
    }
    
    
    // Calculations
    public void totalBoxArea() {
        boxArea = (2 * length * width) + (2 * length * height) + (2 * width * height);
        System.out.println("Box area: " + boxArea);
        
        System.out.println("Type 5");
    }
   
    
    public void cost() {
        if(grade == 2) {
            double boxCost = boxArea * 0.60;
            cost = boxCost + ((boxCost) * 0.16) + (boxCost * 0.14) + (boxCost * 0.10);     
            System.out.println("Box cost: " + cost);
        }
        else if(grade == 3) {
            double boxCost = boxArea * 0.72;
            cost = boxCost + ((boxCost) * 0.16) + (boxCost * 0.14) + (boxCost * 0.10);
            System.out.println("Box cost: " + cost);
        }
        else if(grade == 4) {
            double boxCost = boxArea * 0.90;
            cost = boxCost + ((boxCost) * 0.16) + (boxCost * 0.14) + (boxCost * 0.10);
            System.out.println("Box cost: " + cost);
        }
        else if(grade == 5) {
            double boxCost = boxArea * 1.4;
            cost = boxCost + ((boxCost) * 0.16) + (boxCost * 0.14) + (boxCost * 0.10);
            System.out.println("Box cost: " + cost);
        }
    }
}
