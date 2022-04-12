import java.util.Scanner;


public class soal8 {
  public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
    System.out.print("Masukkan jumlah buah: ");
    int jmlBuah = userInput.nextInt();
    String[] Buah = new String[jmlBuah];
    int[] bykBuah = new int[jmlBuah];
    masukkanNamaDanBanyakBuah(userInput, jmlBuah, Buah, bykBuah);
    int hasil = buahTerbanyak(jmlBuah, Buah, bykBuah);

    System.out.println("Nominal buah terbanyak: " + hasil);
}
static void masukkanNamaDanBanyakBuah(Scanner userInput, int jmlBuah, String[] Buah, int[] bykBuah) {
    for (int i = 0; i < jmlBuah; i++) {
        System.out.print("Masukkan nama buah " + (i + 1) + ": ");
        Buah[i] = userInput.next();
        System.out.print("Masukkan banyak buah " + Buah[i] + ": ");
        bykBuah[i] = userInput.nextInt();
    }
}
static int buahTerbanyak(int jmlBuah, String[] Buah, int[] bykBuah) {
    String namaBuahTerbanyak = "";
    int jumlahBuahTerbanyak = 0;
 for (int i = 0; i < jmlBuah; i++) {
    if (bykBuah[i] > jumlahBuahTerbanyak) {
     jumlahBuahTerbanyak = bykBuah[i];
     namaBuahTerbanyak = Buah[i];
    }
 }
System.out.println("Buah terbanyak adalah " + namaBuahTerbanyak + " (" + jumlahBuahTerbanyak + ")");
 return jumlahBuahTerbanyak;
}
}
