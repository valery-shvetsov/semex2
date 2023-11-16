package semex2;
/**
 * Если необходимо, исправьте данный код 
 * (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 */
public class hw2_2 {
    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
        // Так как мы не знаем количество элементов массива intArray, 
        // то можем предположить возможность наличия ошибки  IndexOutOfBoundsException

    } catch (IndexOutOfBoundsException e1) {
        System.out.println("Catching exception1: " + e1);
    }

     
}
