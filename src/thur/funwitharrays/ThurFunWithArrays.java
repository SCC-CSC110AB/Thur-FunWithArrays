package thur.funwitharrays;

/**
 *
 * @author john
 */
public class ThurFunWithArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] myIntArray = { 7, 8, 9, 10 };
        
        System.out.println(myIntArray[2]);
        
        myIntArray[2] = 3;
        
        System.out.println(myIntArray[2]);
        
        int tempSwapValue = myIntArray[2];
        
        myIntArray[2] = myIntArray[0];
        
        myIntArray[0] = tempSwapValue;
        
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[2]);
        
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println(myIntArray[i]);
        }
        
        System.out.println("------");
        
        int[] myOtherArray = new int[5];
        
        for (int i = 0; i < myOtherArray.length; i++) {
            myOtherArray[i] = (int)(Math.random() * 100);
        }
        
        for (int i = 0; i < myOtherArray.length; i++) {
            System.out.println(myOtherArray[i]);
        }
        
        // Write a for loop that prints the array backwards
        // Write a for loop that sums the array
        // Write a for loop that gets the average
        // Write a for loop that finds the largest value
        // Write a for loop that finds the smallest value
        // Write a for loop that swaps the smallest value into the [0] slot
        // Write a method that takes in an array and a value and returns true if the value exists in the array
        
        // --------------------- Extra Credit -------------------------
        // Write a method that sorts the array
        // --------------------- Extra Extra Credit -------------------------
        // Write a method that sorts the array in N log N time
    }
    
}
