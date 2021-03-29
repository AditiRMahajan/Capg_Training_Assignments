import java.util.*;

class Movie_Details {
    String mov_name;
    String lead_actor;
    String lead_actories;
    String genre;

    Movie_Details(String mov_name, String lead_actor, String lead_actories, String genre) {
        this.mov_name = mov_name;
        this.lead_actor = lead_actor;
        this.lead_actories = lead_actories;
        this.genre = genre;
    }

    public String getMov_name() {
        return mov_name;
    }

    public void setMov_name(String mov_name) {
        this.mov_name = mov_name;
    }

    public String getLead_actor() {
        return lead_actor;
    }

    public void setLead_actor(String lead_actor) {
        this.lead_actor = lead_actor;
    }

    public String getLead_actories() {
        return lead_actories;
    }

    public void setLead_actories(String lead_actories) {
        this.lead_actories = lead_actories;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        String a = getMov_name() + " " + getLead_actor() + " " + getLead_actories() + " " + getGenre();
        return a;
    }

}

class NameComparator implements Comparator<Movie_Details> {
    public int compare(Movie_Details s1, Movie_Details s2) {
        return s1.mov_name.compareTo(s2.mov_name);
    }
}

class GenreComparator implements Comparator<Movie_Details> {
    public int compare(Movie_Details s1, Movie_Details s2) {
        return s1.genre.compareTo(s2.genre);
    }
}

class Movie_DetailsList {
    ArrayList<Movie_Details> list = new ArrayList<Movie_Details>();

    public void add_movie(String mov_name, String lead_actor, String lead_actories, String genre) {
        list.add(new Movie_Details(mov_name, lead_actor, lead_actories, genre));
        System.out.println("Movie Added");
    }

    public void remove_movie(String name) {
        for (Movie_Details m : list) {
            if (m.mov_name.equals(name)) {
                int index = list.indexOf(m);
                list.remove(index);
                System.out.println("Movie Removed");
                break;
            }
        }
    }

    public void remove_AllMovies() {
        list.removeAll(list);
        System.out.println("All movies are removed");
    }

    public void find_movie_by_name(String name) {
        for (Movie_Details m : list) {
            if (m.mov_name.equals(name)) {
                int index = list.indexOf(m);
                System.out.println(list.get(index));
                break;
            }
        }
    }

    public void find_movie_by_genre(String genre) {
        for (Movie_Details m : list) {
            if (m.genre.equals(genre)) {
                int index = list.indexOf(m);
                System.out.println(list.get(index));
                break;

            }
        }
    }

    public void sort(String criteria) {
        String a="name";
        if (a.equals(criteria)) {
            Collections.sort(list, new NameComparator());
            for (Movie_Details m : list) {
                System.out.println(m.mov_name + " " + m.lead_actor + " " + m.lead_actories + " " + m.genre);
            }
        }
        else{
            Collections.sort(list, new GenreComparator());
            for (Movie_Details m : list) {
                System.out.println(m.mov_name + " " + m.lead_actor + " " + m.lead_actories + " " + m.genre);
            }
        }
    }
}


public class CF10 {

    public static void main(String[] args) {
        Movie_DetailsList movie = new Movie_DetailsList();
        movie.add_movie("Dhoom", "Amir", "Kat", "Action");
        movie.add_movie("Don", "SRK", "PC", "Crime");
        movie.sort("genre");
    }
}