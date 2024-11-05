import java.util.ArrayList;
import java.util.Arrays;

public class Book extends Media{
    private int stock;
    private ArrayList<Review> review;

    public void setReview(Review review) {
        this.review.add(review);
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }
    public ArrayList<Review> getReview() {
        return review;
    }
    public Book(){

    }
    public Book(ArrayList<Review> review){
        this.review =review;
    }
    public Book( int stock ,ArrayList<Review> review) {
        this.review = review;
        this.stock = stock;
    }
    public Book( String auteur, String ISBN, double price, String title) {
        super( auteur, ISBN, price, title);
    }
    public Book( int stock ,ArrayList<Review> review,String auteur, String ISBN, double price, String title) {
        super( auteur, ISBN, price, title);
        this.review = review;
        this.stock = stock;
    }

    public void addReview(Review r){
        setReview(r);
            }

    public double getAverage(){
        double sum =0;
        for (int i = 0; i < review.size(); i++) {
            sum =sum + review.get(i).getRating();
        }
        sum = sum /review.size();
        return sum;
    }

    public void purchase(User user){
        user.setPurchaseMediaList(this);
        stock--;
    }

    public boolean isBestseller(){
        if(getAverage() >= 4.5){
            return true;
        }else{
            return false;
        }
    }

    public void reStock(int quantity){
        stock = quantity;
        System.out.println("The books have been successfully restocked ");
    }

    public String getMediaType(){
        if(getAverage() >=4.5) {
            return "Bestselling Book";
        }else{
            return "Book";
        }
    }

    @Override
    public String toString() {
        return "Book{Title: " + super.getTitle() + ", Author:  "+ super.getAuteur() + ", ISBN:  "+ super.getISBN() + ", Price: " + super.getPrice() + " SAR} ";
    }
}
