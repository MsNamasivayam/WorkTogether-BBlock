import java.util.Scanner;

public class Backend {
    private Frontend window;
    private Scanner input;
    private String name;

    public Backend() {
        this.window = new Frontend(this);
        input = new Scanner(System.in);
        this.name = "";
    }

    public void setFirstName() {
        System.out.println("What is your name?");
        this.name = input.nextLine();
        window.repaint();
    }

    public String getFirstName() {
        return name;
    }

    public static void main(String[] args) {
        Backend backend = new Backend();
        backend.setFirstName();
    }
}
