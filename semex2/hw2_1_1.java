package semex2;
/**
     * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
     * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению 
     * приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */
    
//import java.util.NoSuchElementException;
import java.util.Scanner;

public class hw2_1_1 {
    public static void main(String[] args) {
        run();
    }   

    public static void run() {
        Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Введите дробное число (через точку):");
                String line = scanner.nextLine(); 
                float number1=Float.parseFloat(line);   
                //float number1 = scanner.nextFloat();
                    //scanner.nextLine();
                    //scanner.close();
                    System.out.println(number1);
                    //float number2 = scanner.nextFloat();

            } catch (NumberFormatException e) {
                    System.err.println("Неправильный формат ввода числа");
                    try {
                        System.out.println("Введите дробное число еще раз (через точку):");
                        //Scanner scan = new Scanner(System.in);
                        String line = scanner.nextLine(); 
                        float number2=Float.parseFloat(line); 
                        //scanner.nextLine();
                        scanner.close();
                        System.out.println(number2);
                    
                        } catch (NumberFormatException ex) {
                        System.err.println("Неправильный формат ввода числа снова");
                        }
            }
            scanner.close();  
        }      
}
