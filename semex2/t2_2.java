package semex2;
/**
 * Обработайте возможные исключительные ситуации. "Битые" значения
 * в исходном массиве считайте нулями. Можно внести в код правки,
 * которые считаете необходимыми
 */

public class t2_2 {
    public static void main(String[] args) {
        String[][] arr0 = new String[][]{
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"}
        };

        String[][] arr = new String[][]{
                {"1", "1", "1", "1", "1"},
                {"1", "1", "3"},
                {"1", "2"},
                {"3", "3"},
                {"2", "6"}
        };
        String[][] arr1 = null;
        System.out.println(sum2d(arr0));
    }
    private static int sum2d(String[][] arr) {
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 5; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        } catch (ArrayIndexOutOfBoundsException ext) {
            System.err.println("Выход за пределы массива");
        } catch (NumberFormatException err) {
            System.err.println("Введено не корректное значение");
        } catch (NullPointerException ext) {
            System.err.println("Значение отсутствует");
        }
        return sum;
    }
}    

