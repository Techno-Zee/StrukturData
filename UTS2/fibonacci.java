import java.util.Scanner;

public class fibonacci {

    public static int fbc(int n) {
        if (n <= 1) return n;
        return fbc(n - 1) + fbc(n - 2);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Jumlah suku Fibonacci : ");
        int n = inp.nextInt();
        System.out.printf("Deret Fibonacci hingga suku ke-%d adalah: \n",n);
        
        for (int i = 0; i <= n; i++) {
            System.out.print(fbc(i) + (i==n ? "" : ", "));
        }

    }
}