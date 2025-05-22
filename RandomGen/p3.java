package RandomGen;
import java.util.Random;
import java.security.SecureRandom;
class p3
{
    public static void main(String[] args) {
        Random random = new Random();
        SecureRandom secureRandom=new SecureRandom();

        int r1=random.nextInt(20);
        int r2=secureRandom.nextInt(20);

        System.out.println("Random : "+r1+"\nSecureRandom : "+r2);
        
        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);
        for(byte i : randomBytes)
        {
            System.out.print(i+" ");
        }
    }
}