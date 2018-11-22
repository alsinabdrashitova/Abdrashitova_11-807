package ru.kpfu.itis.textsimilarity;

import java.io.File;
import java.io.FileNotFoundException;

public class FileReader{
    TextAnalyzer a = new JaccardTextAnalyzer();
    TextAnalyzer b = new CosAnalyzer();
    File te1 = new File("C:\\Java\\TextSimilatity-v00\\src\\ru\\kpfu\\itis\\textsimilatity\\num1.txt");
    File te2 = new File("C:\\Java\\TextSimilatity-v00\\src\\ru\\kpfu\\itis\\textsimilarity\\mum2.txt");
    double coef= a.analyze(new SimpleTextProvider(te1), new SimpleTextProvider(te2));
    double coef2 = b.analyze(new SimpleTextProvider(te1), new SimpleTextProvider(te2));
    {
        System.out.println("Коэффициент схожести по Джакарду: " + coef);
        System.out.println("Косинусная мера:" + coef2);
    }

    public FileReader() throws FileNotFoundException {
    }
}
