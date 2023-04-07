package text_file_control;

import java.io.FileWriter;

public class Txt_write {
    public Txt_write() {

    }

    public void write(String text, boolean append) {
        try (FileWriter fw = new FileWriter("outputs/wordsHKn.txt", append)) {
            fw.write(text);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    } // End of fileWrite method

    public void clean() {
        try (FileWriter fw = new FileWriter("outputs/wordsHKn.txt")) {
            fw.write("");
            System.out.println("File cleaned successfully");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
