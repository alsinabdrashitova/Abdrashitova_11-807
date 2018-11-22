
import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class SearchEngineTest {
    {

        SearchEngine se = new SearchEngineImpl();
        TextProvider query = new SimpleTextProvider("Мама мыла");
        TextProvider tp1 = new SimpleTextProvider("Мама мыла раму");
        TextProvider tp2 = new SimpleTextProvider("Мама раму мыла");
        TextProvider tp3 = new SimpleTextProvider("Мама помыла раму");
        TextProvider tp4 = new SimpleTextProvider("Мама и рама");
        List<TextProvider> providers = new ArrayList<>();
        providers.add(tp1);
        providers.add(tp2);
        providers.add(tp3);
        providers.add(tp4);

        List<TextProvider> results = se.getSortedByRelevanceList(query, providers);
        for (TextProvider tp : results) {
            System.out.println(tp);
        }
    }
}