package Materi.pertemuan3;

public class looping {
    public static void main(String[] args) {
        int height = 7; // tinggi pohon
        java.util.Random random = new java.util.Random();

        // Bagian daun pohon
        for (int i = 0; i < height; i++) {

            // Spasi kiri agar segitiga rata tengah
            for (int space = 0; space < height - i - 1; space++) {
                System.out.print(" ");
            }

            // Cetak daun dan hiasan
            for (int j = 0; j < (2 * i + 1); j++) {

                // Random 15% kemungkinan jadi hiasan
                if (random.nextInt(100) < 15) {
                    System.out.print("o");
                } else {
                    System.out.print("^");
                }
            }

            System.out.println();
        }

        // Bagian batang pohon
        for (int i = 0; i < 3; i++) {
            for (int space = 0; space < height - 2; space++) {
                System.out.print(" ");
            }
            System.out.println("| |");
        }
    }
}
