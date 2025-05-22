package FileHandling;
import java.io.*;
class ps1
{
    public static void main(String[] args) throws IOException
    {
        File fin=new File("i.txt");
        File fout=new File("o.txt");

        FileReader fr=new FileReader(fin);
        FileWriter fw=new FileWriter(fout);

        int i;
        while((i=fr.read())!=-1)
        fw.write(i);

        fr.close();
        fw.close();
    }
}
