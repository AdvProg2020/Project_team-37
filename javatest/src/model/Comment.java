package model;

public class Comment {
    private Customer customer;
    private String commentText;
    private CommentStatus commentStatus;
    private boolean hasThisCustomerBoughtThisGood;

    public Comment(Customer customer, String commentText, boolean hasThisCustomerBoughtThisGood) {
        this.customer = customer;
        this.commentText = commentText;
        this.hasThisCustomerBoughtThisGood = hasThisCustomerBoughtThisGood;
        commentStatus=CommentStatus.waitingToConfirm;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getCommentText() {
        return commentText;
    }

    public CommentStatus getCommentStatus() {
        return commentStatus;
    }

    public boolean isHasThisCustomerBoughtThisGood() {
        return hasThisCustomerBoughtThisGood;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public void setCommentStatus(CommentStatus commentStatus) {
        this.commentStatus = commentStatus;
    }

    public void setHasThisCustomerBoughtThisGood(boolean hasThisCustomerBoughtThisGood) {
        this.hasThisCustomerBoughtThisGood = hasThisCustomerBoughtThisGood;
    }

}
