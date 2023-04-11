package text_file_control;

import java.io.FileWriter;

public class Txt_write {
    private String file_path;

    public Txt_write() {
        file_path = "outputs/";
    }

    public void write(String text, boolean append, String fileName) {
        
        try (FileWriter fw = new FileWriter(file_path + fileName, append)) {
            fw.write(text);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    } // End of fileWrite method

    public void clean(String fileName) {
        try (FileWriter fw = new FileWriter(file_path + fileName)) {
            fw.write("");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
