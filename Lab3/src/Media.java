public class Media {
    private String title;
    private String auteur;
    private String ISBN;
    private double price;

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }
    public String getAuteur() {
        return auteur;
    }
    public String getTitle() {
        return title;
    }
    public String getISBN() {
        return ISBN;
    }

    public Media(String auteur, String ISBN, double price, String title) {
        this.auteur = auteur;
        this.ISBN = ISBN;
        this.price = price;
        this.title = title;
    }
    public Media(){

    }

    public String getMediaType(){
        return "Media";
    }

    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", auteur='" + auteur + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", price=" + price +
                '}';
    }
}
