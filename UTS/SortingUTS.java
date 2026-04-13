import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Mahasiswa {
    String nama;
    String nim;
    int nilai;


    Mahasiswa(String nama, String nim, int nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    // Untuk format print
    @Override
    public String toString() {
        return nama + (nama.length() > 12 ? "| " : "\t| ") + nim + (nama.length() > 13 ? " | " : "\t| ") + nilai;
    }
}

public class SortingUTS {

    public static void bubbleSort(Mahasiswa[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].nilai < arr[j + 1].nilai) {
                    Mahasiswa temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // berhenti jika sudah terurut
        }
    }

    public static void insertionSort(Mahasiswa[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Mahasiswa key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].nilai < key.nilai) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    public static void selectionSort(Mahasiswa[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].nilai > arr[minIdx].nilai) {
                    minIdx = j;
                }
            }
            Mahasiswa temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static Mahasiswa[] bacaCSV(String filePath) throws IOException {
        List<Mahasiswa> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 3) continue; // skip baris tidak valid
                String nama = parts[0].trim();
                String nim = parts[1].trim();
                int nilai = Integer.parseInt(parts[2].trim());
                list.add(new Mahasiswa(nama, nim, nilai));
            }
        }
        return list.toArray(new Mahasiswa[0]);
    }

    public static void cetakSampel(Mahasiswa[] arr, String judul) {
        System.out.println("\n--- " + judul + " ---");
        int tampil = Math.min(10, arr.length);
        for (int i = 0; i < tampil; i++) {
            System.out.println((i + 1) + ". " + arr[i]);
        }
        if (arr.length > 10) System.out.println("... dan " + (arr.length - 10) + " data lainnya.");
    }

    public static void main(String[] args) {
        String fileCSV = "data.csv";

        try {
            Mahasiswa[] dataAsli = bacaCSV(fileCSV);
            System.out.println("Total data: " + dataAsli.length);

            // Tampilkan sampel sebelum sorting
            cetakSampel(dataAsli, "SEBELUM SORTING");

            // Clone untuk masing-masing algoritma
            Mahasiswa[] dataBubble = dataAsli.clone();
            Mahasiswa[] dataInsertion = dataAsli.clone();
            Mahasiswa[] dataSelection = dataAsli.clone();

            // Bubble Sort
            long start = System.nanoTime();
            bubbleSort(dataBubble);
            long end = System.nanoTime();
            double waktuBubble = (end - start) / 1_000_000.0; // milidetik
            System.out.printf("\n[BUBBLE SORT] Waktu: %.3f ms\n", waktuBubble);
            cetakSampel(dataBubble, "Setelah Bubble Sort");

            // Ins=ertion Sort
            start = System.nanoTime();
            insertionSort(dataInsertion);
            end = System.nanoTime();
            double waktuInsertion = (end - start) / 1_000_000.0;
            System.out.printf("\n[INSERTION SORT] Waktu: %.3f ms\n", waktuInsertion);
            cetakSampel(dataInsertion, "Setelah Insertion Sort");

            // Selection Sort
            start = System.nanoTime();
            selectionSort(dataSelection);
            end = System.nanoTime();
            double waktuSelection = (end - start) / 1_000_000.0;
            System.out.printf("\n[SELECTION SORT] Waktu: %.3f ms\n", waktuSelection);
            cetakSampel(dataSelection, "Setelah Selection Sort");

        } catch (IOException e) {
            System.err.println("Error membaca file: " + e.getMessage());
            System.err.println("Pastikan file " + fileCSV + " ada di folder yang sama.");
        } catch (NumberFormatException e) {
            System.err.println("Error format nilai (wajib angka): " + e.getMessage());
        }
    }
}