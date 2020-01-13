package Package1;

public class StatisticsCommand implements ICommand {
    @Override
    public void Execute() {
        BookStatistics stats = new BookStatistics();
        DocumentManager.GetInstance().GetBook().Accept(stats);
        stats.PrintStatistics();
    }

    @Override
    public void UnExecute() {
        // TODO Auto-generated method stub

    }
}
