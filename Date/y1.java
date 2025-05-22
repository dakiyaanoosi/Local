package Date;
import java.util.Calendar; // or import java.util.*;
public class y1
{
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        System.out.println("Current Year : "+year);
    }
}
