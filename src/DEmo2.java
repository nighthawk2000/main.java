import java.util.Scanner;
public class DEmo2 {
    public static void main(String[] args){
        var reader = new Scanner(System.in);
        System.out.print("What is your name:");
        var name = reader.nextLine();
        System.out.println("Hello "+name);
    }
}

