// Packing Final code
import java.io.*;
import java.util.*;

class program606
{
    public static void main(String A[]) throws Exception
    {
        String Header = null;
        String FolderName = null;
        String PackName = null;

        File fobj = null;
        File Packobj = null;

        FileOutputStream foobj = null;
        FileInputStream fiobj = null;

        byte Key = 0x11;
        byte Buffer[] = new byte[1024];
        byte bHeader[] = new byte[100];

        int iRet = 0;
        int i = 0, j = 0;
        
        Scanner sobj = new Scanner(System.in);
 
        System.out.println("Enter the name of folder : ");
        FolderName = sobj.nextLine();

        System.out.println("Enter the name of packed file : ");
        PackName = sobj.nextLine();

        fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            Packobj = new File(PackName);

            Packobj.createNewFile();

            foobj = new FileOutputStream(Packobj); 

            fiobj = null;

            System.out.println("Folder is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in the folder are : "+fArr.length);

            for(i = 0; i < fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                if(fArr[i].getName().endsWith(".txt"))
                {
                    // Header Formation
                    Header = fArr[i].getName() + " " + fArr[i].length();

                    for(j = Header.length(); j < 100; j++)
                    {
                        Header = Header + " ";
                    }

                    bHeader = Header.getBytes();

                    // write header into pack file
                    foobj.write(bHeader,0,100);
                    
                    // Read the data from input files from marvellous folder
                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        // Encryption Logic
                        for(j = 0; j < iRet; j++)
                        {
                            Buffer[j] = (byte)(Buffer[j] ^ Key);
                        }

                        // write the file's data into pack file
                        foobj.write(Buffer,0,iRet);
                    }
                }
                
                fiobj.close();
            }

            foobj.close();
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
}