package quotes;

import java.util.ArrayList;
import java.util.List;

public class qout {
    private ArrayList<String> tags;
    private String author;
    private String likes;
    private String text;

    public qout(ArrayList<String> tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    @Override
    public String toString() {
        return "qout{" +
                "tags=" + tags +
                ", author='" + author + '\'' +
                ", likes='" + likes + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
