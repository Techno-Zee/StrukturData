package Tugas.tugas_1;

public class selection_shorting {
    public static void main(String[] args) {
        // deklarasi variabel utama
        int[] x = { 20, 15, 90, 13, 26 };
        int n = x.length;
        int temp = 0;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            // mencari nilai terkecil dri sebuah array
            for (int j = i + 1; j < n; j++) {
                if (x[j] < x[min]) {
                    min = j;
                }
            }
            // menukar nilai jika nilai min terindikasi tidak sama dengan i
            if (min != i) {
                temp = x[i];
                x[i] = x[min];
                x[min] = temp;
            }
            // menampilkan hasil per step
            for (int o = 0; o < n; o++) {
                System.out.print(x[o] + (o == n - 1 ? "\n" : ", "));
            }
        }
    }
}
