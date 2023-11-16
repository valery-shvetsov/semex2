package semex2;
import java.util.Scanner;
public class hw2_4_2 {

 
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку символов (Внимание! Строка не должна быть пустой):");
        String string = in.nextLine();
        in.close();
        string = string.trim();
        if(string.isEmpty())
            throw new IllegalArgumentException("Строка пустая!");
        else
            System.out.println("Строка не пустая!"+ string);
    }
}
    

