package semex2;
import java.io.*;

/**
 * Заставьте выполниться следующий код
 */
    
public class t2_4 {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
            String str = strings[1];
            int a = 1 / 1;
            test();

            inputStream = new FileInputStream("sdafgdsaf");
        } catch (ArithmeticException e) {
            System.err.println("Делить на ноль нельзя");
        } catch (StackOverflowError error) {
            System.err.println("stack overflow error");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я жив!");
    }

    private static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }    
}
