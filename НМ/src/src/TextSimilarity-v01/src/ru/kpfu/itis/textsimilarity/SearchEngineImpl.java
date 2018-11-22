import java.util.ArrayList;
import java.util.List;

public class SearchEngineImpl implements SearchEngine {
    TextAnalyzer analyzer = new JaccardTextAnalyzer();

    @Override
    public List<TextProvider> getSortedByRelevanceList(TextProvider target, List<TextProvider> sources) {
        List<TextProvider> name = new ArrayList<>();


        return sort (sources, target);

    }

    private List<TextProvider> sort(List<TextProvider> sources, TextProvider target){
        double ja1 = 0.0;
        double ja2 = 0.0;
        for (int i = 0; i < sources.size(); i++) {
            for (int j = sources.size() - 1; j > i; j--) {

                ja1 = analyzer.analyze(target, sources.get(j - 1));
                ja2 = analyzer.analyze(target, sources.get(j));



                if (ja1 < ja2) {
                    TextProvider text = sources.remove(j - 1);
                    sources.add(j, text);

                }
            }
        }
        return sources;
    }
}