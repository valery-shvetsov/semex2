package semex2;
import java.util.Scanner;
/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class hw2_4_1 {

    public static void main(String[] args) {
        run();
    }
    public static void run() {

        Scanner scanner = new Scanner(System.in);

                System.out.println("Введите строку символов (Внимание! Строка не должна быть пустой):");
                String line = scanner.nextLine();
                scanner.close();
                int strLength=line.length();
                try {float result=10/strLength;
                    System.out.println("Строка не пустая: " + line);    
                } catch (ArithmeticException e) {
                    System.err.println("Недопустимая операция. Введена пустая строка");
                }
                //System.err.println("Строка не пустая" + line);
           
            
    }
}
