package ua.step.homework;
import java.util.Collections;
import java.util.Arrays;

/**
 * В массиве хранится n явно заданных текстовых строк.
 * <p>
 * Создать методы:
 * • Возвращает содержимое массива в виде строки через пробел (join)
 * • Возвращает содержимое массива в виде строки через заданный разделитель (перегруженный join)
 * • Сортирующий массив обратном порядке (без учёта регистра) от z до a (sortDesc);
 * • Сортирующий массив по количеству слов в строке (слова разделены пробелами) (sortByWordCount).
 *
 * Примечание: Не использовать методы строк и стандартную сортировку
 */
public class Task02 {

    public static void main(String[] args) {
        String[] str = new String[] {"one", "two", "three"};
        String st;
        st = join(str);
        System.out.println(st);
        st = "->";
        st = join(str,st);
        System.out.println(st);
        sortDesc(str);
    }

    public static String join(String[] strings) {
        String g= "";
        g = String.join(" ", strings[0],strings[1],strings[2]);
        return g;
    }

    /**
     * Соединяет массив строк в одну строку разделенную соединителем glue
     *
     * @param strings - массив строк
     * @param glue    - соединитель
     * @return строка состоящая из элементов массива
     */
    public static String join(String[] strings, String glue) {
        String str="";
        for (int i = 0; i < strings.length; i++) {
            str += strings[i];
            if(i<strings.length-1)
                str+=glue;
        }
        return str;
    }

    /**
     * Сортирует массив строк в порядке обратном алфавитному
     *
     * @param strings - массив строк для сортировки
     */
    public static void sortDesc(String[] strings) {
        Arrays.sort(strings, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        for(int i = 0; i < strings.length; i++)
            System.out.println(strings[i]);

    }

    /**
     * Сортирует массив строк по количеству слов в строке
     *
     * @param strings - массив строк для сортировки
     */
    public static void sortByWordCount(String[] strings) {
    }
}
