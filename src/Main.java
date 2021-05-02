import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("+++ MENU +++\n" +
                "1- Save new animal."+
                "\n2- Read saved animal"+
                "\n0- Exit");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()){
            case 1 -> AnimalSerialize.main();
            case 2 -> AnimalDeserialize.main();
            case 0 -> System.exit(0);
        }
    }
}
