package Package1;

import javax.lang.model.element.Element;
import java.util.Stack;

public class DocumentManager {

    private static DocumentManager _documentManager = null;
    private IElement _book;
    private FirstObserver observer1;
    private SecondObserver observer2;
    private Stack<ICommand> undoCommands;
    private Stack<ICommand> redoCommands;

    private DocumentManager() {
        observer1 = new FirstObserver();
        observer2 = new SecondObserver();
        undoCommands = new Stack<>();
        redoCommands = new Stack<>();
    };
    public static DocumentManager GetInstance(){
        if(_documentManager == null){
            _documentManager = new DocumentManager();
        }
        return _documentManager;
    }

    public void SetBook(IElement book){
        this._book = book;
    }

    public IElement GetBook(){
        return this._book;
    }

    public FirstObserver getObserver1() {
        return observer1;
    }

    public void setObserver1(FirstObserver observer1) {
        this.observer1 = observer1;
    }

    public SecondObserver getObserver2() {
        return observer2;
    }

    public void setObserver2(SecondObserver observer2) {
        this.observer2 = observer2;
    }

    public void addCommand(ICommand newCommand) {
        undoCommands.push(newCommand);
    }

    public ICommand getLastCommand() {
        return undoCommands.pop();
    }

    public void addRCommand(ICommand newCommand) {
        redoCommands.push(newCommand);
    }

    public ICommand getLastRCommand() {
        return redoCommands.pop();
    }

}
