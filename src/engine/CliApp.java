package engine;

import core.MenuAction;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CliApp {
    // Composition: CliApp memiliki kumpulan halaman dan scanner secara private
    private final List<MenuAction> pages;
    private final Scanner scanner;
    private boolean isRunning;

    public CliApp(Scanner scanner) {
        this.scanner = scanner;
        this.pages = new ArrayList<>();
        this.isRunning = true;
    }

    // Method untuk mendaftarkan halaman ke dalam menu
    public void addPage(MenuAction page) {
        this.pages.add(page);
    }

    public void run() {
        while (isRunning) {
            displayMainMenu();
            handleUserChoice();
        }
        System.out.println("Program selesai. Terima kasih!");
    }

    private void displayMainMenu() {
        System.out.println("\n=== MENU UTAMA ===");
        for (int i = 0; i < pages.size(); i++) {
            System.out.println((i + 1) + ". " + pages.get(i).getTitle());
        }
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    private void handleUserChoice() {
        String input = scanner.nextLine();
        try {
            int choice = Integer.parseInt(input);
            if (choice == 0) {
                isRunning = false;
            } else if (choice > 0 && choice <= pages.size()) {
                // Polymorphism: memanggil execute() tanpa peduli class halaman aslinya
                pages.get(choice - 1).execute();
            } else {
                System.out.println("[!] Pilihan tidak tersedia.");
            }
        } catch (NumberFormatException e) {
            System.out.println("[!] Masukkan angka yang valid.");
        }
    }
}