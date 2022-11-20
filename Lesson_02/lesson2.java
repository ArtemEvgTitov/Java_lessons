package Lesson_02;

import java.util.concurrent.ForkJoinPool;

public class lesson2 {

    // Создать строку из миллиона плюсиков

    // String str = "";
    // for(int i = 0;i<1_000_000;i++)
    // {
    // str += "+";
    // }

    // ≈41000 ms

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 1000000; i++) {
            sb.append("+");
        }

        // ≈9 ms
    }

}
