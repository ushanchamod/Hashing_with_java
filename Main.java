import HK.HashKey;
import HT.Hash_table;
import LinkedList.LinkedList;
import text_file_control.Txt_read;

public class Main {
    public static void main(String[] args) {

        ///////////////////////////// task 1 ////////////////////////////////////////

        String file_name_for_generate_hk = "file3.txt"; // for first input
        String hash_key_table_output_fileName = "wordsHK3.txt"; // for first output

        Txt_read tr = new Txt_read(); // read files object

        // read file and get word list & generate hash key
        HashKey hashKeyObj = new HashKey(tr.getWordList("source/" + file_name_for_generate_hk).toArray(), hash_key_table_output_fileName);
        hashKeyObj.generate_wordHK_txt(); // generate word hash key txt file


        ///////////////////////////// task 2 ////////////////////////////////////////

        Txt_read tr2 = new Txt_read();
        
        String file_name_two = "wordsHK3.txt"; // for second input
        String output = "wordsQHKn.txt"; // for second output

        
        Hash_table hashTable = new Hash_table(tr2.getWordList("outputs/" + file_name_two));
        hashTable.createHashTable(output);


        ///////////////////////////// task 3 ////////////////////////////////////////
        

    }
}