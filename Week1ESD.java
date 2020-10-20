package week1esd;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author Group17
 */
public class Week1ESD {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //Declare scanner
        boolean keepRunning = true; 
        while (keepRunning){    //Loop if user wants to keep running
            CreateTriangle();       //Create the triangle by getting user inputs
            System.out.println("Do you want to keep running. y/n"); //Check if user wants to keep running
            String response = sc.nextLine();        
            if ("n".equals(response.toLowerCase())) 
                keepRunning = false;
        }
    } 
    private static void CreateTriangle(){
        Scanner sc = new Scanner(System.in);    //Declare scanner
        List<Integer> sides = new ArrayList<>();
        for (int i = 0; i < 3; i++){        //Loop and get inputs
            System.out.println("Please enter a side length");
            sides.add(sc.nextInt());    //Add input to list
        }        
        if (CheckValidity(sides.get(0), sides.get(1), sides.get(2))){   //Check validity of triangle
            Triangle triangle = new Triangle(sides.get(0), sides.get(1), sides.get(2)); //If valid create new triangle instance
            System.out.println(triangle.GetType());     //Get the type of triangle
        }   
        else{
            System.out.println("Invalid triangle");
        }
    }
    private static boolean CheckValidity(int side1, int side2, int side3){
        return !(side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1);   //Checks validity
    }
}
