# Stack

<table>
    <tr>
        <th>Nama: </th>
        <td>Fahmi Nur Fadillah</td>
    </tr>
    <tr>
        <th>NPM: </th>
        <td>25161562034</td>
    </tr>
    <tr>
        <th>Link Yt: </th>
        <td></td>
    </tr>
</table>

## Hitung Total Method
motode yang saya gunakan adalah:
- membaca data array
- clean = menghapus karakter sebelum (Rp.)
- melakukan split pada clean
- melakukan penjumlahan nilai

```java
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
```

untuk formating : 
- melakukan pengecekan nominal
- mengembalikan nilai awal sebelum (.)
- mengembalikan nilai akhir setelah (.)

## isEmpety Method
saya merubahnya dari stater karena pada dasarnya top itu hanya akan berubah jika awalannya false. 
```java
static boolean isEmpety() {
    return top == stack.length - 1;
}
```