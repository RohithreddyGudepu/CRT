package Day9;
class Movie{
    private String title;
    private String director;
    private double rating;
    public Movie(String title, String director, double rating){
        this.title = title;
        this.director = director;
        setRating(rating);
    }
    public String getTitle(){
        return title;
    }
    public String getDirector(){
        return director;
    }
    public double getRating(){
        return rating;
    }
    public void setRating(double newRating){
        if(newRating>0 && newRating<=10.0){
            rating = newRating;
        }
        else{
            System.out.println("Invalid Rating");
        }
    }
}
public class EncapExamp {
    public static void main(String[] args) {
        Movie m = new Movie("Inception","Christopher Nolan", 8.0);
        m.setRating(9.0);
        System.out.println("Title is: "+m.getTitle());
        System.out.println("Director is: "+m.getDirector());
        System.out.println("Rating is: "+m.getRating());

    }
}
