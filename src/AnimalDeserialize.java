import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AnimalDeserialize {
    public static void main() {
        Animal animal = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/animal.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            animal = (Animal) in.readObject();
            in.close();
            fileIn.close();
        }catch (IOException e){
            e.printStackTrace();
            return;
        }catch (ClassNotFoundException i){
            System.out.println("Animal class not found!");
            i.printStackTrace();
            return;
        }
        System.out.println("+++ Deserialized animal +++");
        System.out.println("Name  : " + animal.animalName);
        System.out.println("Breed : " + animal.animalBreed);
        System.out.println("Age   : " + animal.animalAge);
    }
}
