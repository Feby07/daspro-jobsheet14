import java.util.Scanner;

public class Tugas07 {
    static int hitungTotalRekursif(int[] angka, int n) {
        if (n < 0) {
            return 0;
        }
        return angka[n] + hitungTotalRekursif(angka, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah angka harus lebih besar dari 0.");
            return;
        }

        int[] angka = new int[n];
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[i - 1] = sc.nextInt();
        }

        int total = hitungTotalRekursif(angka, n - 1);
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + total);

    }
}

