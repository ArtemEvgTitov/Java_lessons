package Lesson_01;
import java.util.Scanner; // для ввода в терминал
/* Многострочные комментарии
 * пишутся так
 */
public class programm { // однострочный комментарий
    public static void main(String[] args) {
        short age = 10;
        int salary = 123_456; // Для больших значений можно разделять разряды нижним подчёркиванием
        float e = 2.7f; // float ОБЯЗАТЕЛЬНО с суффиксом f
        double pi = 3.1415; // Для double тоже есть суффикс - D. Но он не является обязательным
        char ch = '}';
        boolean flag = 123 < 234;
        String msg = "Hello World";
        int[] arr = new int[] {1, 2, 3};


        Scanner iScanner = new Scanner(System.in); // работа с вводом в терминал
        System.out.println("int a: ");
        int x = iScanner.nextInt();
        System.out.println(x);
        iScanner.close();

    }
}
