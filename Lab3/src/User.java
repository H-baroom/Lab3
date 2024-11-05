import java.util.ArrayList;
import java.util.Arrays;

public class User {
    private String username;
    private String email;
    private ArrayList<Media> purchaseMediaList;
    private ArrayList<Media> shoppingCart;

    public void setEmail(String email) {
        this.email = email;
    }
    public void setPurchaseMediaList(Media purchaseMediaList) {
        this.purchaseMediaList.add(purchaseMediaList);
    }
    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    public void setUsername(String username) {
        this.username = username;
    }


    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }
    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }
    public String getEmail() {
        return email;
    }
    public String getUsername() {
        return username;
    }

    public User(String email, ArrayList<Media> purchaseMediaList, ArrayList<Media> shoppingCart, String username) {
        this.email = email;
        this.purchaseMediaList = purchaseMediaList;
        this.shoppingCart = shoppingCart;
        this.username = username;
    }

    User(){

    }

    public void addToCart(Media media){
        shoppingCart.add(media);
    }

    public void removeFromCart(Media media){
        shoppingCart.remove(media);
        }


    public void checkout(){
        for (int i = 0; i < shoppingCart.size(); i++) {
            purchaseMediaList.add(shoppingCart.get(i));
        }
        shoppingCart.clear();
        System.out.println("Thank You for Your Purchase!");
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", purchaseMediaList=" + purchaseMediaList +
                ", shoppingCart=" + shoppingCart +
                '}';
    }
}
