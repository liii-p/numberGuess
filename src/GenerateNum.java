import java.util.Random;

public class GenerateNum {
    public static Integer GenerateRandomNumber() {
        Random rand = new Random();

        System.out.print("GENERATING NUMBER...");
       return rand.nextInt(100) + 1;
    }
}
