import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner masuk = new Scanner(System.in);
    System.out.println("Masukkan Nilai Dalam Satuan Cm");
    double cm = masuk.nextDouble();

    Konversi jarak = new Konversi (cm);


    jarak.cmKm();
    jarak.cmDm();
    jarak.cmMm();
    jarak.tampilHasil();
  }
}