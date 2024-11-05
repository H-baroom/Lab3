import java.util.ArrayList;

public class Novel extends Book{
    private String genre;

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }

    public Novel(){

    }
    public Novel(String genre) {
        this.genre = genre;
    }
    public Novel(String genre, ArrayList<Review> review){
        super(review);
        this.genre = genre;
    }
    public Novel(String genre, int stock, ArrayList<Review> review){
        super(stock,review);
        this.genre = genre;
    }
    public Novel(String genre, int stock, ArrayList<Review> review,String auteur, String ISBN, double price, String title){
        super(stock,review,auteur,ISBN,price,title);
        this.genre = genre;
    }

    public String getMediaType(){
        if(super.getAverage() >= 4.5){
            return "Bestselling Novel";
        }else{
            return "Novel";
        }
    }

    @Override
    public String toString() {
        return "Novel{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
