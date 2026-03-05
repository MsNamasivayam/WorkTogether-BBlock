import java.util.Scanner;

public class Backend {
    private Frontend window;
    private String meal = "";

    public Backend() {
        this.window = new Frontend(this);
        Scanner s = new Scanner(System.in);

        System.out.println("What is your favorite meal?");
        meal = s.nextLine();

        window.repaint();
    }

    public static void main(String[] args) {
        Backend backend = new Backend();
    }

    public String getMeal(){
        return meal;
    }

}
