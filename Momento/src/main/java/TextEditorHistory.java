import java.util.ArrayList;
import java.util.List;

public class TextEditorHistory {

    private List<TextEditorMomento> histroy = new ArrayList<>();

    public void addMomento(TextEditorMomento momento){
        histroy.add(momento);
    }

    public TextEditorMomento getMomento(int index){
        return histroy.get(index);
    }
}
