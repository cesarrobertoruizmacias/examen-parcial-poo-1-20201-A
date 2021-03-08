public class Movie {
    private string title;
    private int year;
    private ArrayList<actors> actors;
    private string synopsis;
    private string director;
    private ArrayList<platform> Platform;
    private ArrayList<reviews> Review;

    public Movie(String title, int year, String director) {
        this.title = title;
        this.year = year;
        this.director = director;
        actors = new ArrayList<String>();
        platforms = new ArrayList<Platform>();
        reviews = new ArrayList<Review>();
    }

    public string getTitle() {
        return title;
    }

    public void setTitle(string title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<actors> getActors() {
        return actors;
    }

    public void setActors(ArrayList<actors> actors) {
        this.actors = actors;
    }

    public string getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(string synopsis) {
        this.synopsis = synopsis;
    }

    public string getDirector() {
        return director;
    }

    public void setDirector(string director) {
        this.director = director;
    }

    public ArrayList<platform> getPlatform() {
        return Platform;
    }

    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }

    public ArrayList<reviews> getReview() {
        return Review;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }











        }