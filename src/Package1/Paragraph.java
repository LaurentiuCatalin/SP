package Package1;

public class Paragraph implements Element {
    private String _paragraphName;

    public String get_paragraphName() {
        return _paragraphName;
    }

    public void set_paragraphName(String _paragraphName) {
        this._paragraphName = _paragraphName;
    }

    public Paragraph(String paragraphName){
        _paragraphName = paragraphName;
    }

    @Override
    public void print() {
        System.out.println("Table name: "+get_paragraphName());
    }
}
