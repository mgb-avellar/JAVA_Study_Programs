package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    // O static acima evita que a cada post uma nova instância do sdf seja criada

    private Date postMoment;
    private String postTitle;
    private String postContent;
    private Integer postLikes;

    private List<Comment> postCommentsList = new ArrayList<>();

    public Post() {
    }

    public Post(Date postMoment, String postTitle, String postContent, Integer postLikes) {
        this.postMoment = postMoment;
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.postLikes = postLikes;
    }

    public Date getPostMoment() {
        return postMoment;
    }

    public void setPostMoment(Date postMoment) {
        this.postMoment = postMoment;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public Integer getPostLikes() {
        return postLikes;
    }

    public void setPostLikes(Integer postLikes) {
        this.postLikes = postLikes;
    }

    public List<Comment> getPostCommentsList() {
        return postCommentsList;
    }

    public void addComment(Comment comment) {
        postCommentsList.add(comment);
    }

    public void removeComment(Comment comment) {
        postCommentsList.remove(comment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(postTitle + "\n");
        sb.append(postLikes);
        sb.append(" Likes - ");
        sb.append(sdf.format(postMoment) + "\n");
        sb.append(postContent + "\n");
        sb.append("Comments:\n");
        for (Comment c : postCommentsList) {
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }
}
