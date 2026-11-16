package pages;

import core.BasePage;
import java.util.Scanner;

public class InputDisplayPage extends BasePage {

    public InputDisplayPage(Scanner scanner) {
        super("Input & Tampilkan Data", scanner);
    }

    @Override
    public void execute() {
        printHeader();
        System.out.print("Masukkan Nama Anda : ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Pesan     : ");
        String pesan = scanner.nextLine();

        System.out.println("\n--- Hasil Input ---");
        System.out.println("Nama  : " + nama);
        System.out.println("Pesan : " + pesan);
        System.out.println("-------------------");
    }
}