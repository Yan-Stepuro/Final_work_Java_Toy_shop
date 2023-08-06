package org.toyshop;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    StringBuilder sb;
    File file;
    String path = "src/main/java/org/toyshop/out.txt";
    FileHandler fileHandler;

    public Logger() {
        this.file = new File(path);
        this.sb = new StringBuilder();
        this.fileHandler = new FileHandler();
    }

    /**
     *
     * @param text текст, который нужно сохранить
     */
    public void pushLog(String text) {
        sb.append(getDateTime()).append(" ").append(text).append("\n");
    }

    /**
     *
     * @return возвращает дату и время в нужном формате
     */
    private Date getDateTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return date;
    }

    /**
     * сохранение данных в файл
     */
    public void save() {
        fileHandler.save(sb.toString(), path, file);
    }

}
