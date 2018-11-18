package ru.kpfu.itis.textsimilarity;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleTextProvider implements TextProvider {
    private String text;
    private Scanner scanner;

    public SimpleTextProvider(File file) throws FileNotFoundException {
        this.scanner = new Scanner(file);
        StringBuilder sb = new StringBuilder("");
        while(scanner.hasNext()){
            sb.append(scanner.nextLine());
        }
        text = sb.toString();
    }

    @Override
    public String getText() {
        return text;
    }
}
