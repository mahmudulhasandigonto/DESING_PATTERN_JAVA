public class Application {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorHistory history = new TextEditorHistory();

        textEditor.setText("hello");

        //Save the current state
        history.addMomento(textEditor.save());

        textEditor.setText("hello, openAi");
        //Save the new State
        history.addMomento(textEditor.save());


        System.out.println(textEditor.getText());

        textEditor.restore(history.getMomento(0));
        System.out.println(textEditor.getText());
    }
}
