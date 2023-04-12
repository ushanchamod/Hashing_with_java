package HashTable;

import text_file_control.Txt_write;

public class HashTable {
    private String[] entries;
    private int size;
    private int count;

    private String[] words;
    private int[] hashKey;
    private int[] newHashKeys;
    private int[] qHashKeys;



    public HashTable(int size) {
        this.entries = new String[size];
        this.size = size;
        this.count = 0;

        words = new String[size];
        hashKey = new int[size];
        newHashKeys = new int[size];
        qHashKeys = new int[size];
    }

    private int hash(int key) {
        return (key % size);
    }

    // insert data to table
    public void put(int key, String value) {
        int hashValue = hash(key);
        int temp = key;
        int i = 1;

        int c = 1;
        int cc = 1;
        int ccc = 0;

        do {
            if (entries[hashValue] == null) {
                entries[hashValue] = value;

                // For generate file
                words[count] = value;
                hashKey[count] = key;
                newHashKeys[count] = temp;
                qHashKeys[count] = hashValue;
                count++;

                return;
            }

            temp = key + c * (i * i) + cc * (i) + ccc;
            hashValue = hash(temp); // Re-hash
            i++;

        } while (hashValue > -1);
    }

    public void printHashTable() {
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] != null) {
                System.out.println(i + " " + entries[i]);
            }
        }
    }

    public String[] getHashTable(){
        return entries;
    }

    public void generateWordQHKnFile(String fileName){
        Txt_write tw = new Txt_write();


        try {
            tw.clean(fileName);

            for(int i = 0; i < entries.length; i++){
                String line = (i+1) + "," + words[i] + "," + hashKey[i] + "," + newHashKeys[i] + "," + qHashKeys[i] + "\n";
                tw.write(line, true, fileName);
                // tw.write("\n", true, fileName);
                
            }

            System.out.println("-- Write 'wordsQHK3.txt' file successfully....!");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
