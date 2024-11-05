import java.util.ArrayList;

public class AcademicBook extends Book{
   private String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSubject() {
        return this.subject;
    }

    AcademicBook(String subject) {
        this.subject = subject;
    }
    AcademicBook(String subject, ArrayList<Review> review) {
        super(review);
        this.subject=subject;
    }
    public AcademicBook(String subject, int stock, ArrayList<Review> review){
        super(stock,review);
        this.subject = subject;
    }
    public AcademicBook(String subject, int stock, ArrayList<Review> review,String auteur, String ISBN, double price, String title){
        super(stock,review,auteur,ISBN,price,title);
        this.subject = subject;

    }


    public String getMediaType(){
        if (super.getAverage() >= 4.5){
            return "Bestselling AcademicBook";
        }else{
            return "AcademicBook";
        }
    }

    @Override
    public String toString() {
        return "AcademicBook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
