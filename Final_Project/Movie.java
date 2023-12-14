//Create a Movie class with basic attributes like title, director, releaseYear, and runningTime.

package Final_Project;

class Movie {
    private String title; 
    private String director;
    private int releaseYear;
    private double runningTime;

    public Movie(String title, String director, int releaseYear, double runningTime) {

        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.runningTime = runningTime;

    }
        public String getTitle() {
            return title;
        }
        public String getDirector() {
            return director;
        }
        public int getReleaseYear () {
            return releaseYear;
        }
        public double getRunningTime() {
            return runningTime;
        }

        public void setTitle (String title) {
            this.title = title;
        }
        public void setDirector (String director ) {
            this.director = director;
        }
        public void setReleaseYear (int releaseYear) {
            this.releaseYear = releaseYear;
        }
        public void setRunningTime (double runningTime) {
            this.runningTime = runningTime;
        }
    
}
