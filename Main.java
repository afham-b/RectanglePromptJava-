import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        // Display prompt for rectangle width
        System.out.println("Please enter the width of the rectangle: ");
        
        // Read width of rectangle
        double width = in.nextDouble();
        
        // Display prompt for rectangle height
        System.out.println("Please enter the height of the rectangle: ");
        
        // Read height of rectangle
        double height = in.nextDouble(); 
        
        in.close(); 
        
        double area = height*width; 
        
        System.out.println("Area is: ");
        System.out.println(area);

    }
}