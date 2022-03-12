package Model;

import java.util.Objects;

public class Movie {
    String apiKey;

    float imDbRating;
    String image;
    String fullTitle;
    int imDbRatingCount;
    int year;
    int rank;
    int id;
    int rankUpDown;
    String title;
    String crew;

    public Movie(String apiKey) {
        this.apiKey = apiKey;
    }

    public float getImDbRating() {
        return imDbRating;
    }

    public void setImDbRating(float imDbRating) {
        this.imDbRating = imDbRating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    public int getImDbRatingCount() {
        return imDbRatingCount;
    }

    public void setImDbRatingCount(int imDbRatingCount) {
        this.imDbRatingCount = imDbRatingCount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRankUpDown() {
        return rankUpDown;
    }

    public void setRankUpDown(int rankUpDown) {
        this.rankUpDown = rankUpDown;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Float.compare(movie.imDbRating, imDbRating) == 0 && imDbRatingCount == movie.imDbRatingCount && year == movie.year && rank == movie.rank && id == movie.id && rankUpDown == movie.rankUpDown && image.equals(movie.image) && fullTitle.equals(movie.fullTitle) && title.equals(movie.title) && Objects.equals(crew, movie.crew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imDbRating, image, fullTitle, imDbRatingCount, year, rank, id, rankUpDown, title, crew);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "imDbRating=" + imDbRating +
                ", image='" + image + '\'' +
                ", fullTitle='" + fullTitle + '\'' +
                ", imDbRatingCount=" + imDbRatingCount +
                ", year=" + year +
                ", rank=" + rank +
                ", id=" + id +
                ", rankUpDown=" + rankUpDown +
                ", title='" + title + '\'' +
                ", crew='" + crew + '\'' +
                '}';
    }
}
