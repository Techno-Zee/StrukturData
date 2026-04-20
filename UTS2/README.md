# TUGAS UTS 2 (Membuat baris fibonacci dengan metode recursive)

dengan rumus
```
if (n<=1) n

f(n-1)+f(n-2)
```

## Implementasi Recursive

```java
public static int fbc(int n) {
    if (n <= 1) return n;
    return fbc(n - 1) + fbc(n - 2);
}
```
recursive akan dijalankan sebanyak n memakai `for` dengan n adalah input bebas

```java
public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Masukkan Jumlah suku fibonachi : ");
    int n = inp.nextInt();
    System.out.printf("Deret Fibonacci hingga suku ke-%d adalah: ",n);
    
    for (int i = 0; i <= n; i++) {
        System.out.print(fbc(i) + (i==n ? "" : ", "));
    }
}
```