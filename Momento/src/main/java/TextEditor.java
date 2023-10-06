public class TextEditor {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextEditorMomento save(){
        return new TextEditorMomento(text);
    }

    public void restore(TextEditorMomento textEditorMomento){
        this.text = textEditorMomento.getText();
    }


}
