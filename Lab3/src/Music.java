import java.util.ArrayList;
import java.util.List;

public class Music extends Media{
    private String artist;

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getArtist() {
        return artist;
    }
    Music(){

    }
    public Music(String artist) {
        this.artist = artist;
    }

    public Music(String auteur, String ISBN, double price, String title, String artist) {
        super(auteur, ISBN, price, title);
        this.artist = artist;
    }

    public void listen(User user){
        user.setPurchaseMediaList(this);
    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public ArrayList<Music> generalPlayList(ArrayList<Music> musicCatalog){
        ArrayList<Music> general = new ArrayList<>();
        for (int i = 0; i < musicCatalog.size(); i++) {
            if (musicCatalog.get(i).getArtist().equalsIgnoreCase(artist)) {
                general.add(musicCatalog.get(i));
            }
        }
        return general;
    }

    public String getMediaType(){
        if (super.getPrice() >= 10){
            return "Premium Music";
        }else{
            return "Music";
        }
    }

    @Override
    public String toString() {
        return "Music{" +
                "artist: " + artist + ", Title: " + super.getTitle() + ", Author:  "+ super.getAuteur() + ", ISBN:  "+ super.getISBN() + ", Price: " + super.getPrice() + " SAR" +
                '}';
    }
}
