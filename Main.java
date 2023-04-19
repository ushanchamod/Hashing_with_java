import HK.HashKey;
import HT.Hash_table;
import LinkedList.LinkedList;
import SORTING.Sorting;
import text_file_control.Txt_read;

public class Main {
    public static void main(String[] args) {

        // First number of Reg. number
        int n = 3;

        // -------------------- Task 1 -------------------->

        String file_name_for_generate_hk = "file" + n + ".txt"; // for first input
        String hash_key_table_output_fileName = "wordsHK" + n + ".txt"; // for first output

        Txt_read tr = new Txt_read(); // read files object

        // read file and get word list & generate hash key
        HashKey hashKeyObj = new HashKey(tr.getWordList("source/" + file_name_for_generate_hk).toArray(),
                hash_key_table_output_fileName);
        hashKeyObj.generate_wordHK_txt(); // generate word hash key txt file



        // -------------------- Task 2 -------------------->

        Txt_read tr2 = new Txt_read();

        String file_name_two = "wordsHK" + n + ".txt"; // for second input
        String output_of_task_two = "wordsQHK" + n + ".txt"; // for second output

        Hash_table hashTable = new Hash_table(tr2.getWordList("outputs/" + file_name_two), n);
        hashTable.createHashTable(output_of_task_two);



        // -------------------- Task 3 -------------------->

        Txt_read tr3 = new Txt_read();

        LinkedList<String> list = tr3.getWordList("outputs/" + output_of_task_two);

        // Sort list object
        Sorting sort = new Sorting(list);
        sort.shortList(); // call sort list
        printSortList(list); // print sorted list

    }

    private static void printSortList(LinkedList<String> list) {
        // Print sorted list from wordsQHKn.txt
        for (int i = 0; i < list.length(); i++) {
            String[] line = list.getValue(i).split(",");
            System.out.println(line[4] + "\t" + line[1]);
        }

    }
}