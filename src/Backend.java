import java.util.Scanner;

public class Backend {
    private Frontend window;

    public Backend() {
        this.window = new Frontend(this);
    }

    public String getFavoriteAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your favorite animal: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        Backend backend = new Backend();
    }
}
