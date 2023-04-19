package HT;

import HashTable.HashTable;
import LinkedList.LinkedList;

public class Hash_table {
    int size;
    int n;
    HashTable hashTable;
    LinkedList<String> list;
    String[] words = null;

    public Hash_table(LinkedList<String> list, int n) {
        this.n = n;
        this.size = list.length();
        hashTable = new HashTable(size + 8); // +4
        this.list = list;
        System.out.println("Hash table size: " + size);
    }

    public void createHashTable(String outputFileName) {
        for (Object x : list.toArray()) {
            words = x.toString().split(",");
            // hashTable.put(words[2], words[1]);
            hashTable.put(Integer.parseInt(words[2]), words[1]);
            // System.out.println(words[2] + " " + words[1]);

        }

        hashTable.generateWordQHKnFile("wordsQHK" + n + ".txt");
    }

}

// Max load factor;
