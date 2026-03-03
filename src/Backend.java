import java.util.Scanner;

public class Backend {
    private Frontend window;
    private String lastName;

    public Backend() {
        Scanner input = new Scanner(System.in);
        System.out.println("Last Name: ");
        this.lastName = input.nextLine();
        this.window = new Frontend(this);
    }

    public String getLastName(){
        return lastName;
    }

    public String getLastName(){
        return lastName;
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
