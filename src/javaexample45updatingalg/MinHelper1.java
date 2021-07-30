
package javaexample45updatingalg;


public class MinHelper1 {
    
    public static int Min(int[] array) throws IllegalArgumentException
    {
        if(array.length==0)
            throw new IllegalArgumentException();
        if(array.length==1)
            return array[0];
        
        int min=array[0];
        for (int i = 1; i < array.length; i++) {
            if(min>array[i])
                min=array[i];
        }
        return min;
    }
}
