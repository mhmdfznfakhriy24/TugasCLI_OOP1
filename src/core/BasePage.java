package core;

import java.util.Scanner;

public abstract class BasePage implements MenuAction {
    private final String title;
    protected final Scanner scanner;

    public BasePage(String title, Scanner scanner) {
        this.title = title;
        this.scanner = scanner;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    // Template method untuk header halaman agar konsisten
    protected void printHeader() {
        System.out.println("\n===============================");
        System.out.println("  " + title.toUpperCase());
        System.out.println("===============================");
    }

    // Method abstrak yang wajib diisi logikanya oleh masing-masing halaman
    @Override
    public abstract void execute();
}