package logicalProgOnNumbers;
import java.util.Random;
import static java.lang.String.format;
public class Randomno {
    public static void main(String[] args) {
        String trackId=Randomno.getRandomNumberString();
        System.out.println(trackId);
    }
    private static String getRandomNumberString() {
        Random rnd = new Random();
        int number = rnd.nextInt(100000);
        return format("%04d", number);
        }
}
