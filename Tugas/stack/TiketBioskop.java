public class TiketBioskop {
    // Bagian 1 :Deklarasi stack
    static String[] stack = new String[10];
    static int top = -1;

    // Bagian 2: Operasi stack
    static void push(String ticket) {
        if (isEmpety()) return;
        stack[++top] = ticket;
    }

    static String pop() {
        if (top == -1) throw new RuntimeException();
        String val = stack[top];
        stack[top] = "";
        top--;
        return val;
    }

    static String peek() {
        if(top==-1) throw new RuntimeException();
        return stack[top];
    }

    static boolean isEmpety() {
        return top == stack.length - 1;
    }

    static void tampilkanStack() {
        System.out.println("=== Isi Stack (TOP -> BOTTOM) ===");
        for (int i = top; i >= 0; i--) {
            System.out.println("| " + stack[i] + " |");
        }
        System.out.println("=================================");
    }

    static String hitungTotal() {
        int total = 0;
        for (int i = 0; i <= top ; i++) {
            String data = stack[i];
            String clean = data.substring(data.indexOf("Rp."));
            String[] sp = clean.split("\\.");
            String out1 = sp[1] + sp[2];
            total += Integer.parseInt(out1);
        }

        // Format rupiah
        String nominal = Integer.toString(total), result = "";
        int c = 0;
        for (int i = nominal.length() - 1; i >= 0; i--) {
            result = nominal.charAt(i) + result;
            c++;
            if (c % 3 == 0 && i > 0)
                result = "." + result;
        }

        return "Rp" + result;
    }

    public static void main(String[] args) {

        // Push 3 Transaksi
        push("Tiket-A01: Avengers Rp.50.000");
        push("Tiket-A02: Interstellar Rp.45.000");
        push("Tiket-A03: Inception Rp.45.000");

        tampilkanStack();
        // tampilkan tiket paling atas
        System.out.println("Tiket terakhir masuk: " + peek());
        System.out.printf("\nTotal transaksi: %s \n\n" , hitungTotal());
        
        // batalkan 1 transaksi teratas
        System.out.println("Tiket dibatalkan: " + pop());
        tampilkanStack();
        System.out.printf("\nTotal transaksi: %s \n" , hitungTotal());
    }
}
