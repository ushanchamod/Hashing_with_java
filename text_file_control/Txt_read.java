package text_file_control;

import java.io.*;
import java.util.Scanner;
import LinkedList.LinkedList;

public class Txt_read {
    private String input_file_path;
    private LinkedList<String> words_list;

    public Txt_read() {
        this.words_list = new LinkedList<>();
    }

    public LinkedList<String> getWordList(String file_path) {
        this.input_file_path = file_path;
        try {
            File f = new File(input_file_path);
            try (Scanner sc = new Scanner(f)) {
                while (sc.hasNext()) {
                    String next_word = sc.next();
                    words_list.add(next_word.strip());
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return words_list;
    } // End of readFile method
}
