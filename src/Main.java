import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc;
        int contador = 0;
        try {
            sc = new Scanner(new File("test.txt"));
            while(sc.hasNext()) {
                if(isWord(sc.next()))contador++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not exist");
        }
        System.out.println("\nTotal palabras contadas: " + contador);
    }

    public static boolean isWord(String s) {
        return s.matches("^[ A-Za-z]+$");
    }
}
