package semex2;
import java.io.*;
import java.util.*;

/**
 * Запишите в файл следующие строки:
 * <p>
 * Анна=4
 * Елена=5
 * Марина=6
 * Владимир=?
 * Полина=?
 * Константин=?
 * Иван=4
 * <p>
 * Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap,
 * если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных,
 * если сохранено значение ?, заменить его на соответствующее число.Если на каком-то месте
 * встречается символ, отличный от числа или ?, бросить подходящее исключение.
 * Записать в тот же файл данные с замененными символами ?.
 */

public class t2_3 {
private static final List<String> strings = List.of
            ("Анна=4", "Елена=5", "Марина=6", "Полина=?", "Владимир=?", "Константин=?", "Иван=4");
    //для проверки, заменить какое-то из значений на null

    public static void main(String[] args) {
        write("task3.txt", strings);
        //read("task3.txt");
        rewrite("task3.txt");
    }

    public static void write(String path, List<String> strings) {
        File file = new File(path);
        try {
            try (FileWriter writer = new FileWriter(file)) {
                for (String str : strings) {
                    writer.write(str);
                    writer.write("\n");
                }
                writer.flush();
            }
        } catch (IOException e) {
            System.err.println("Ошибка файловой системы");
        }
    }

    public static Map<String, Integer> read(String path) {
        File file = new File(path);
        Map<String, Integer> result = new LinkedHashMap<>();
        BufferedReader buffer = null;
        try {
            buffer = new BufferedReader(new FileReader(file));
            String line;
            while ((line = buffer.readLine()) != null) {
                String[] array = line.split("=");
                String name = array[0];
                String temp = array[1];
                int number;
                if (temp.equals("?")) {
                    number = name.length();
                } else {
                    number = Integer.parseInt(temp);
                }
                result.put(name, number);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            System.err.println("не допустимое значение");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("выход за пределы массива");
        } finally {
            try {
                System.out.println("Это блок Finally");
                buffer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }

    private static void rewrite(String path) {
        Map<String, Integer> map = read(path);
        List<String> toWrite = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            toWrite.add(entry.toString());
        }
        write(path, toWrite);
    }    
}
