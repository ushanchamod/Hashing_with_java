import java.util.Arrays;

import HK.HashKey;
import LinkedList.LinkedList;
import text_file_control.Txt_read;
import text_file_control.Txt_write;

public class Main{
    public static void main(String[] args) {
        Txt_read tr = new Txt_read();
        Txt_write tw = new Txt_write();

        LinkedList<String> word_list =  tr.getWordList("source/file3.txt");

        // Object[] words = word_list.toArray();
        HashKey hk = new HashKey(word_list.toArray());
        hk.generate_wordHK_txt();

        
        

    }
}