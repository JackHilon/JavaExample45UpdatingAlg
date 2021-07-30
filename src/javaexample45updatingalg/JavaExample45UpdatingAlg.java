
package javaexample45updatingalg;

import java.util.Arrays;


public class JavaExample45UpdatingAlg {

    
    public static void main(String[] args) {
        
        int[] a=new int[] {1,6,3,0,7,2,9,8};
        
        System.out.println("The array is: "+Arrays.toString(a));
        System.out.println("The min item in this array is (one way): "+MinHelper1.Min(a));
        System.out.println("The min item in this array is (another way): "+MinHelper2.Min(a));
        
        
        
    }
    
}
