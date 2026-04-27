package Materi.pertemuan7;

import java.util.*;

public class main {
    static Scanner sc = new Scanner(System.in);
    static int size = 5;
    static int[] stack = new int[size];

    public static void main(String[] args) {
        // stack();
        stack = new int[] { 4, 5, 6, 7, 8 };
        pop();
    }

    public static void stackin() {
        System.out.println("Default Array" + Arrays.toString(stack));
        for (int top = 0; top < stack.length; top++) {
            // Input user kedalam index stack yang ke top dari 0 - size
            System.out.printf("Masukkan nilai ke x[%d] : ", top);
            stack[top] = sc.nextInt();

            // Pengecekan isFull
            System.out.println(top < stack.length - 1 ? "Belum full" : "Sudah Full");
        }
        System.out.println("Hasil Array" + Arrays.toString(stack));
    }

    public static void pop() {
        System.out.println("Default Array pop" + Arrays.toString(stack));
        int min = -1;
        System.out.println(stack.length);
        for (int top = stack.length - 1; top > min; top--) {
            // Input user kedalam index stack yang ke top dari 0 - size
            System.out.printf("Menghapus nilai di x[%d] : %d -> 0%n", top, stack[top]);
            stack[top] = 0;
        }

        System.out.println("Hasil Array " + Arrays.toString(stack));
    }
}
