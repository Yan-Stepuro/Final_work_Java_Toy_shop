package org.toyshop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    /**
     *
     * @param text для сохранения
     * @param path путь к файлу для сохранения
     * @param file файл для сохранения
     */
    public void save(String text, String path, File file) {
        try (FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw))
        {
            bw.write(text);
            System.out.println("Данные о розыгрыше сохранены в файл.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
