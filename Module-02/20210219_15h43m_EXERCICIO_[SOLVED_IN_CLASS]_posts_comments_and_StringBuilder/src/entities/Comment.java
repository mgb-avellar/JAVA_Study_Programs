package entities;

public class Comment {

    private String commentText;

    public Comment() {
    }

    public Comment(String text) {
        this.commentText = text;
    }

    public String getText() {
        return commentText;
    }

    public void setText(String text) {
        this.commentText = text;
    }
}
