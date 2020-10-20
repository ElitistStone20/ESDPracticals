package week1esd;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Callum
 */
public class Triangle {
    private int[] sides = new int[3];
    private List<Integer> angles = new ArrayList<>();
    String triangleType = null;
    public Triangle(int side1, int side2, int side3){   //Constructor 
        sides[0] = side1;
        sides[1] = side2;
        sides[2] = side3;    
        CalculateTriangleType();
    }
    public String GetType(){       
        return triangleType;    //Returns the type of triangle
    }
    private void CalculateTriangleType(){   //Determines the type of triangle
        int equalSides = 0;        
        for (int i = 0; i < sides.length-1; i++){   //Calculates the number of equal sides
            if (sides[i+1] == sides[i]) {
                equalSides++;
            }
        }
        switch (equalSides){                           
            case 1:
                triangleType = "Isosceles"; 
                break;
            case 2:
                triangleType = "Equilateral";
                break;
            default:
                triangleType = "Scalene";
                break;
        }
    }           
}
