package quotes;

import java.util.ArrayList;
import java.util.List;

public class qout {
    private ArrayList<String> tags;
    private String author;
    private String likes;
    private String text;
    private String quoteText;
    private String quoteAuthor;
private String senderName;
private String senderLink;
private String quoteLink;

    public qout(ArrayList<String> tags, String author, String likes, String text, String quoteText, String quoteAuthor, String senderName, String senderLink, String quoteLink) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
        this.senderName = senderName;
        this.senderLink = senderLink;
        this.quoteLink = quoteLink;
    }

    @Override
    public String toString() {
        if(author!=null){
        return author+" : "+text;
    }else{
            return quoteAuthor+" : "+quoteText;
        }
    }
}
