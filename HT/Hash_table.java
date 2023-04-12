package HT;

import HashTable.HashTable;
import LinkedList.LinkedList;

public class Hash_table {
    int size;
    HashTable hashTable;
    LinkedList<String> list;
    String[] words = null;

    public Hash_table(LinkedList<String> list) {
        this.size = list.length();
        hashTable = new HashTable(size);
        this.list = list;
    }

    public void createHashTable(String outputFileName) {
        for (Object x : list.toArray()) {
            words = x.toString().split(",");
            // hashTable.put(words[2], words[1]);
            hashTable.put(Integer.parseInt(words[2]), words[1]);
            // System.out.println(words[2] + " " + words[1]);

        }

        hashTable.generateWordQHKnFile("wordsQHK3.txt");
    }

}

// Max load factor;
