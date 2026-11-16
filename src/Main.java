import engine.CliApp;
import java.util.Scanner;
import pages.AboutPage;
import pages.InputDisplayPage;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CliApp app = new CliApp(scanner);
        app.addPage(new InputDisplayPage(scanner));
        app.addPage(new AboutPage(scanner));

        app.run();
        scanner.close();
    }
}