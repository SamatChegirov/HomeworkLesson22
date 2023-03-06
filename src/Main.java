import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Song song = new Song("Nothing else matters.txt", "Metallica");
        System.out.println("Title: " + song.getTitle() + "\nAuthor: " + song.getAuthor());
        song.fileReader();

    }
}