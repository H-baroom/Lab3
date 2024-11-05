import java.util.ArrayList;

public class Store {
    private ArrayList<User> user;
    private ArrayList<Media> media;

    public void setMedia(Media media) {
        this.media.add(media);
    }
    public void setUser(User user) {
        this.user.add(user);
    }
    public ArrayList<Media> getMedia() {
        return media;
    }
    public ArrayList<User> getUser() {
        return user;
    }

    Store(){
    }
    public Store(ArrayList<Media> media, ArrayList<User> user) {
        this.media = media;
        this.user = user;
    }


    public void addUser(User user){
        this.user.add(user);
    }
 //////////////////////////////////////////////////
    public void dispalyUser(){
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < user.size(); i++) {
            System.out.println(user.get(i));
        }
        System.out.println("-------------------------------------------------------------------");
    }

    public void addMedia(Media media){
        this.media.add(media);
    }
    //////////////////////////////////////////////////
    public void dispalyMedias(){
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < media.size(); i++) {
            System.out.println(media.get(i));
        }
        System.out.println("-------------------------------------------------------------------");
    }

    public Book searchBook(String title){
        for (int i = 0; i < media.size(); i++) {
            if (media.get(i).getTitle().equalsIgnoreCase(title) ){
                System.out.println("book ("+title+") is founded");
                return (Book)media.get(i);
            }
        }

        System.out.println("book ("+title+") not founded");
        return null;
    }

    @Override
    public String toString() {
        return "Store{" +
                "media=" + media +
                ", user=" + user +
                '}';
    }
}

