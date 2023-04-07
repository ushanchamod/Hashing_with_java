package HK;

import AdvancedArray.AdvancedArray;
import LinkedList.LinkedList;
import text_file_control.Txt_write;

public class HashKey {
    private Object[] words_list;
    private LinkedList<String> purified_word_list;
    
    final String[] lettersArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    AdvancedArray<String> letters = new AdvancedArray<>(lettersArray);

    public HashKey(Object[] words_list) {
        this.words_list = words_list;
        this.purified_word_list = new LinkedList<>();
    }

    private String purify_word(String word){
        String purified_word = "";
        char[] arr = new char[word.length()];

        for(int t=0; t < word.length(); t++){
            arr[t] = word.charAt(t);
        } // ['u','s','h']


        for(char letter: arr){
            boolean needContinue = true;
            for(String letter2: letters.getList()){
                if(letter == letter2.charAt(0)){
                    purified_word  = purified_word+letter;
                    needContinue = false;
                    break;
                }

                if(!needContinue){
                    break;
                }
            }
        }

        return purified_word;
    }

    boolean equal_, len_0_;
    private void create_purify_word_list(String purified_word){
        equal_ = false; len_0_ = false;
        for(Object word: purified_word_list.toArray()){
            if(word.toString().equals(purified_word)){
                equal_ = true;
                break;
            }

            if(purified_word.length() == 0){
                len_0_ = true;
                break;
            }
        }

        if(!equal_ && !len_0_){
            purified_word_list.add(purified_word);
        }


    }

    int row_number = 0;
    private String create_line_for_HK_txt(Object word){
        String Line = "";
        String word_ = word.toString();
        char[] arr = new char[word_.length()];
        
        for(int t=0; t < word_.length(); t++){
            arr[t] = word_.charAt(t);
        } // ['u','s','h']

        int sum_of_character_value = 0;
        for(char letter: arr){
            int character_value = letters.indexOf(Character.toString(letter));
            sum_of_character_value = sum_of_character_value + character_value;
        }

        Line = row_number + "," + word + "," + sum_of_character_value;
        row_number++;

        return Line;
    }

    public void generate_wordHK_txt(){
        Txt_write tw = new Txt_write();

        for(Object word: words_list){
            String purified_word = purify_word(word.toString());
            create_purify_word_list(purified_word);
        }

        try{
            tw.clean();
            for(Object word: purified_word_list.toArray()){
                String line = create_line_for_HK_txt(word);
                tw.write(line, true);
                tw.write("\n", true);
            }

            System.out.println(purified_word_list);
            System.out.println("\nWrite 'wordsHKn.txt' file successfully....!\n");

        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }



        
    }

}
