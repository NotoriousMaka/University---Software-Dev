/**
 * This is the class that calculates the length of the array given and then returns it.
 * @author Alexe Tataru
 */

public class ArrayProcessor {
    /**
     * This is the class that calculates the length of the array given and then returns it.
     * @param array it is the array that is used in the driver class.
     * @return length
     */
    int getArrayLength(Object[] array) {
        int length = 0;
        
        try {
            while (true) {
                Object element = array[length];
                length++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        return length;            
    }
}
