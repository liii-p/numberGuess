import java.util.Random;

public class GenerateNum {
    public static Integer GenerateRandomNumber() {
        Random rand = new Random();

        System.out.print("GENERATING NUMBER...");
       int randomNum = rand.nextInt(100) + 1;

        return randomNum;
    }
}
