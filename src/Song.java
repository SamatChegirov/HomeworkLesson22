
import java.io.*;
import java.util.Scanner;

public class Song {
    private String title;
    private String author;
    private String text;


    public Song(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void fileWriter() throws IOException {
        FileWriter fileWriter = new FileWriter("Nothing else matters.txt");
        try {
            fileWriter.write("So close, no matter how far" +
                    "Couldn't be much more from the heart" +
                    "Forever trusting who we are" +
                    "And nothing else matters" +
                    "Never opened myself this way" +
                    "Life is ours, we live it our way" +
                    "All these words I don't just say" +
                    "And nothing else matters.");
            fileWriter.close();
        } catch (IOException i) {
            System.out.println(i.getMessage());
        }
    }

    public void fileReader() throws IOException {
        FileReader fileReader = new FileReader("Nothing else matters.txt");
        try {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.next());
            }
        } catch (RuntimeException r) {
            System.out.println(r.getMessage());
        }
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
