package pages;

import core.BasePage;
import java.util.Scanner;

public class AboutPage extends BasePage {

    public AboutPage(Scanner scanner) {
        super("Informasi Sistem", scanner);
    }

    @Override
    public void execute() {
        printHeader();
        System.out.println("CLI Template v1.0");
        System.out.println("Dibangun menggunakan konsep Interface, Abstract Class, dan Composition.");
    }
}