package Package1;

public class DeleteCommand implements ICommand {
    private Memento state = new Memento();
    @Override
    public void Execute() {
        state.set_state(DocumentManager.GetInstance().GetBook());
        ((Section)DocumentManager.GetInstance().GetBook()).removeLast();
        DocumentManager.GetInstance().addCommand(this);
    }

    @Override
    public void UnExecute() {
        DocumentManager.GetInstance().SetBook(state.get_state());

    }

    public Memento getMemento() {
        return state;
    }
}
