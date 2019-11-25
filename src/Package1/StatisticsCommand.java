package Package1;

public class StatisticsCommand implements Command {
    @Override
    public void Execute() {
        BookStatistics statistics = new BookStatistics();

        Book newBook = DocumentManager.GetInstance().GetBook();

        DocumentManager.GetInstance().GetBook().Accept(statistics);
    }
}
