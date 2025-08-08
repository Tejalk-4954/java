package practice_day2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {

		 Set<Movie> set =new TreeSet<Movie>();
		 Movie first=new Movie(1,"saaiyara",9.0,4000);
		 Movie second =new Movie(2,"chava",10.0,5000);
		 
		 set.add(first);
		 set.add(second);
		 System.out.println(set);
	}

}

class Movie implements Comparable<Movie> {
	int id;
	String name;
	double ratings;
	int price;

	public Movie(int id, String name, double ratings, int price) {
		this.id = id;
		this.name = name;
		this.ratings = ratings;
		this.price = price;
	}

	@Override
	public int compareTo(Movie o) {

		if(this.ratings<o.ratings)
		{
			return 1;
		}
		else if(this.ratings>o.ratings)
		{
			return -1;
		}
		
		return 0;
	}

}

class Ratingsort implements Comparator<Movie>
{

	@Override
	public int compare(Movie o1, Movie o2) {
	  if(o1.ratings>o2.ratings)
	  {
		  return 1;
	  }
	  
	  else if(o1.ratings<o2.ratings)
	  {
		  return -1;
	  }
	  return 0;
	}
	
}
