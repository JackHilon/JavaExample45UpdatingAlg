
package javaexample45updatingalg;


public class MinHelper2 {
    
     public static int Min(int[] array) throws IllegalArgumentException
    {
        if(array.length==0)
            throw new IllegalArgumentException();
        if(array.length==1)
            return array[0];
        
        int minPos=0;
        for (int i = 1; i < array.length; i++) {
            if(array[minPos]>array[i])
                minPos=i;
        }
        return array[minPos];
    }
}
