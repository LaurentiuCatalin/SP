package Package1;

public class OpenCommand implements Command {
    private String _pathToJSON;

    public OpenCommand(String path){
        this._pathToJSON = path;
    }

    @Override
    public void Execute() {
        JSONBuilder builder = new JSONBuilder();
        builder.Build();
        Book newBook = new Book("book 1");
        newBook.AddContent(builder.GetResult());
        DocumentManager.GetInstance().SetBook(newBook);
        newBook.Print();
    }
}
