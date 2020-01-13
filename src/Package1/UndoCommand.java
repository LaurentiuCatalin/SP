package Package1;

public class UndoCommand implements ICommand {
    @Override
    public void Execute() {
        DocumentManager.GetInstance
                ().SetBook(((DeleteCommand)DocumentManager.GetInstance().getLastCommand()).getMemento().get_state());

    }

    @Override
    public void UnExecute() {
        // TODO Auto-generated method stub

    }
}
