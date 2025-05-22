package FileHandling;
import java.nio.file.*;
public class p7
{
    public static void main(String[] args) throws Exception
    {
        Files.deleteIfExists(Paths.get("FileHandling/input2.txt"));
    }
}
