import java.util.ArrayList;
import java.util.List;

public class Movie extends Media{
    private int duration;

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }

    Movie(){

    }
    public Movie(int duration) {
        this.duration = duration;
    }
    public Movie(String auteur, String ISBN, double price, String title, int duration) {
        super(auteur, ISBN, price, title);
        this.duration = duration;
    }

    public void watch(User user){
        user.setPurchaseMediaList(this);
    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public List<Movie> recommenSimilarMovies(List<Movie> movieCatalog){
        ArrayList<Movie> recommenSimilarMovies = new ArrayList<>();
        for (int i = 0; i < movieCatalog.size(); i++) {
            if (movieCatalog.get(i).getAuteur().equalsIgnoreCase(this.getAuteur())){
                recommenSimilarMovies.add(movieCatalog.get(i));
            }
        }
        return recommenSimilarMovies;
    }

    public String getMediaType(){
        if (duration >= 120){
            return "Long Movie";
        }else{
            return "Movie";
        }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Title: " + super.getTitle() +", Duration =" + duration +", Author:  "+ super.getAuteur() + ", ISBN:  "+ super.getISBN() + ", Price: " + super.getPrice() + " SAR} "+
                '}';
    }
}
