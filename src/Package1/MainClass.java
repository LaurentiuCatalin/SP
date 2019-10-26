package Package1;

public class MainClass {

    public static void main(String[] args) {

        Book Titanic = new Book("Titanic");
        Author rPaul = new Author("Radu Paul");
        Titanic.AddAuthor(rPaul);

        Section chpt1 = new Section("Chapter 1");
        Section chpt11 = new Section("Chapter 1.1");
        Section chpt111 = new Section("Chapter 1.1.1");
        Section chpt1111 = new Section("Chapter 1.1.1.1");

        Titanic.AddContent(new Paragraph("Paragraph pentru carte"));
        Titanic.AddContent(chpt1);

        chpt1.AddElement(new Paragraph("Moto capitol"));
        chpt1.AddElement(chpt11);

        chpt11.AddElement(new Paragraph("Text from SubChapter 1.1"));
        chpt11.AddElement(chpt111);

        chpt111.AddElement(new Paragraph("Text from subchapter 1.1.1"));
        chpt111.AddElement(chpt1111);

        chpt1111.AddElement(new Image("Image from subchapter 1.1.1.1"));

        Titanic.Print();

    }

}
