package ru.kpfu.itis.textsimilarity;

import java.util.ArrayList;
import java.util.List;

public class CosAnalyzer implements TextAnalyzer {
    @Override
    public double analyze(TextProvider te1, TextProvider te2) {
        List<String> list1 = tokenize(te1.getText());
        List<String> list2 = tokenize(te2.getText());
        List<String> list3 = tokenize(te1.getText() + " " + te2.getText());
        return cosSimilarity(list1, list2, list3);
    }

    private List<String> tokenize(String text) {
        text = text.replace(".", "");
        String[] words = text.split(" ");
        List<String> uniqueWords = new ArrayList<>();
        for (String word : words) {
            word = word.toLowerCase();
            uniqueWords.add(word); //поправил
    }
        return uniqueWords;

    }


    private double[] termFrequency(List<String> list2, List<String> list3) {
        double[] count4 = new double[list3.size()];
        for (String word : list2){
            if (list3.contains(word)){
                count4[list3.indexOf(word)]++;
            }
        }

        double count = 0;
        for (double i : count4){
            count += i * i;
        }
        count = Math.sqrt(count);
        for (int i = 0; i < count4.length; i++) {
            count4[i] = count4[i] /  count;
        }
        return count4;
    }

    private double cosSimilarity(List<String> list1, List<String> list2, List<String> list3 ) {
        double count =  0;
        double[] count1 = termFrequency(list1, list3);
        double[] count2 = termFrequency(list2, list3);
        for (int i = 0; i < count1.length; i++) {
            count +=  count1[i] * count2[i];
        }
        return count;
    }
}