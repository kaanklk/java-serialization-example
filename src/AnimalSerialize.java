import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class AnimalSerialize {
    public static void main() {
        Animal animal = new Animal();
        Scanner sc = new Scanner(System.in);
        System.out.println("Animal name  : ");
        animal.animalName = sc.nextLine();
        System.out.println("Animal breed :");
        animal.animalBreed = sc.nextLine();
        System.out.println("Animal age   : ");
        animal.animalAge = sc.nextInt();

        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/animal.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(animal);
            out.close();
            fileOut.close();
            System.out.println("Data saved in /tmp/animal.ser ");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
