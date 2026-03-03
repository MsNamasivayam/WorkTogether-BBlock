import java.util.Scanner;

public class Backend {
    private Frontend window;

    public Backend() {
        this.window = new Frontend(this);
    }

    public String getBestCSJoke() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the best CS joke?");
        return sc.nextLine();
    }

    public static void main(String[] args) {
        Backend backend = new Backend();
    }
}
