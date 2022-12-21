package ujian;

import java.util.Scanner;
//Copyright Raihan Rivana Putra

public class Ujian {

    int banyakitem;

    public void menu() {
        Scanner input = new Scanner(System.in);

        System.out.println("berapa item yang akan anda beli");
        banyakitem = input.nextInt();

        int[] item = new int[banyakitem];

        for (int i = 0; i < banyakitem; i++) {
            System.out.print("masukan harga pakaian ke " + (i + 1) + " : ");
            item[i] = input.nextInt();
        }
        System.out.println("\n =========================\n");
        int[] diskon = new int[banyakitem];
        int[] total = new int[banyakitem];
        int t = 0;
        int i = 0;
        int d = 0;
        int discaunt = 0;
        int semua = 0;
        int diskonnya = 0;

        while (i < banyakitem) {
            if (item[i] >= 35000 && item[i] <= 59000) {
                System.out.println("harga pakaian ke" + (i + 1) + " adalah " + item[i]);

                diskonnya = 5000;
                diskon[d] = item[i] - diskonnya;
                total[t] = item[i] - diskon[d];
                System.out.println("harga setelah diskon " + diskon[d]);

            } else if (item[i] > 59000) {
                System.out.println("harga pakaian ke" + (i + 1) + " adalah " + item[i]);
                diskonnya = 10000;
                diskon[d] = item[i] - diskonnya;
                total[t] = item[i] - diskon[d];
                System.out.println("harga setelah diskon " + diskon[d]);

            } else {
                System.out.println("harga pakaian ke" + (i + 1) + " adalah " + item[i]);
                total[t] = item[i];

            }
            semua += item[i];
            discaunt += diskonnya;

            d++;
            i++;

        }
        System.out.println("\n =========================\n");

        System.out.println("Total Harga " + semua);
        System.out.println("Total Harga yang harus dibayarkan " + (semua - discaunt));
        System.out.println("anda hemat " + discaunt + " rupiah");

    }

    public static void main(String[] args) {
        Ujian hitung = new Ujian();
        hitung.menu();

    }


}
