import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DictionaryManagement {

    public static void insertFromCommandline() throws IOException {
        long newWord;
        Scanner sc=new Scanner(System.in);
        newWord=sc.nextLong();

        for(int i=0;i<newWord;i++){
            String work_target;
            String work_explain;
            Scanner scanner=new Scanner(System.in);
            work_target=scanner.nextLine();
            work_explain=scanner.nextLine();
//            try {
//                FileWriter w = new FileWriter("dictionary.txt");
//                w.write("\n");
//                w.write(work_target);
//                w.write("\\t");
//                w.write(work_explain);
//            }
//            catch(IOException e){
//                System.out.println("Loi write");
//            }
            Word neww=new Word(work_target,work_explain);
            Dictionary.addtoDic(neww);
        }
    }
    public static void insertFromFile(){
        System.out.println("No    |English       |Vietnamese");
        try{
            FileReader readd=new FileReader("dictionary.txt");
            int check=readd.read();
            String dong="";
            int sotu=0;
            while(check!=-1){
                if((char)check!='\n'){
                    dong+=(char)check;
                }
                else{
                    sotu++;
                    String[] testArray = dong.split("\\t+");
                    System.out.println(sotu+"      "+testArray[0]+ "      "+testArray[1]);
                    Word neww=new Word(testArray[0],testArray[1]);
                    Dictionary.addtoDic(neww);
                    dong="";

                }
                check=readd.read();
            }
            readd.close();
        }
        catch(IOException e){
            System.out.println("Loi read");
        }

    }



}
