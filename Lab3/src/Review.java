public class Review {
    private String userName;
    private double rating;
    private String comment;

    public void setComment(String comment) {
        this.comment = comment;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getComment() {
        return comment;
    }
    public double getRating() {
        return rating;
    }
    public String getUserName() {
        return userName;
    }

    public Review(String userName, double rating, String comment) {
        this.comment = comment;
        this.rating = rating;
        this.userName = userName;
    }
    Review(){

    }

    @Override
    public String toString() {
        return "Review{" +
                "comment='" + comment + '\'' +
                ", userName='" + userName + '\'' +
                ", rating=" + rating +
                '}';
    }
}
