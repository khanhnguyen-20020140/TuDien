import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DictionaryCommandline  {

    public static void showAllWords(){
        System.out.println("No    |English       |Vietnamese");
        for(int i = 0; i< (Dictionary.ListWord).size() ; i++){
            System.out.println((i+1)+"       |"+(Dictionary.ListWord).get(i).getWork_target()+"        |"+(Dictionary.ListWord).get(i).getWork_explain());
        }
    }

    public static void dictionaryBasic() throws IOException {
        DictionaryManagement.insertFromCommandline();
        showAllWords();
    }

    public static void main(String arg[]) throws IOException {
        DictionaryManagement.insertFromFile();
        dictionaryBasic();
    }

}
