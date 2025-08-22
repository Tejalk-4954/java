package methodreference;

import java.util.ArrayList;
import java.util.List;

public class methodreference_fifth {

	public static int compareratings(Movie m1,Movie m2)
	{
		if(m1.rating>m2.rating)
		{
			return -1;
		}
		else if(m1.rating<m2.rating)
		{
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		
		Movie first=new Movie("Saiyyara",134332.45,3.5,"depressing");
		Movie second=new Movie("Rockstar",134.00,4.5,"motivation");
		Movie third=new Movie("Aashiqui 2",1354.45,3.5,"pavsali");
		Movie fourth=new Movie("300",134332.45,4.9,"this is sparta");
		
		List<Movie> movies = new ArrayList<Movie>();
		
		movies.add(first);
		movies.add(second);
		movies.add(third);
		movies.add(fourth);
		
	   movies.stream().sorted(methodreference_fifth::compareratings).forEach((i)-> System.out.println(i));
	}

}

class Movie
{
	String name;
	double collection;
	double rating;
	String genre;
	
	public Movie(String name, double collection, double ratings, String genere) {
		super();
		this.name = name;
		this.collection = collection;
		this.rating = ratings;
		this.genre = genere;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCollection() {
		return collection;
	}
	public void setCollection(double collection) {
		this.collection = collection;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	public String toString()
	{
		return "Movie [name=" + name + ", collection=" + collection + ", rating=" + rating + ", genere=" + genre
				+ "]";	
	}
}