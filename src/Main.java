import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        genapGanjil();
        membandingkan();
        kerucut();

    }

    private static void genapGanjil() {
        System.out.println("Angkanya genap atau ganjil?");

        Scanner input = new Scanner(System.in);
        System.out.println("Angkanya adalah ");
        int data = input.nextInt();

        if (data % 2 == 0) {
            System.out.println("Angka " + data + " adalah angka genap");
        } else {
            System.out.println("Angka " + data + " adalah angka ganjil");
        }
    }

    private static void membandingkan() {
        System.out.println("Membandingkan 2 angka");

        Scanner input1 = new Scanner(System.in);
        System.out.println("Angka pertama adalah ");
        int data1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Angka kedua adalah ");
        int data2 = input2.nextInt();

        if (data1 > data2) {
            System.out.println(data1 + " > " + data2);
            System.out.println("Angka pertama lebih besar dari angka kedua");
        } else if (data1 < data2) {
            System.out.println(data1 + " < " + data2);
            System.out.println("Angka pertama lebih kecil dari angka kedua");
        } else {
            System.out.println(data1 + " = " + data2);
            System.out.println("Angka pertama dan angka kedua sama besar");
        }
    }

    private static void kerucut() {
        System.out.println("Menghitung volume kerucut");

        Scanner inputR = new Scanner(System.in);
        System.out.println("NIlai r = ");
        int dataR = inputR.nextInt();

        Scanner inputT = new Scanner(System.in);
        System.out.println("Nilai t = ");
        int dataT = inputT.nextInt();

        int phi1 = 22 / 7;
        double phi2 = 3.14;

        if (dataR % 7 == 0) {
            System.out.println("Menggunakan phi 22/7");
            double hasil = (float) (phi1 * dataR * dataR * dataT / 3);
            System.out.println("Hasilnya adalah " + hasil);
        } else {
            System.out.println("Menggunakan phi 3,14");
            float hasil = (float) (phi2 * dataR * dataR * dataT / 3);
            System.out.println("Hasilnya adalah " + hasil);
        }
    }
}