package model;

public class Opinion {
   private Customer customer;
   private Goods good;
   private String comment;
   private OpinionStatus opinionStatus;
   private boolean hasBought;


    public Opinion(Customer customer, Goods good, String comment, boolean hasBought) {
        this.customer = customer;
        this.good = good;
        this.comment = comment;
        this.hasBought = hasBought;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Goods getGood() {
        return good;
    }

    public String getComment() {
        return comment;
    }

    public OpinionStatus getOpinionStatus() {
        return opinionStatus;
    }

    public void setOpinionStatus(OpinionStatus opinionStatus) {
        this.opinionStatus = opinionStatus;
    }

    private boolean isHasBought(){
        return  hasBought;
    }
}
