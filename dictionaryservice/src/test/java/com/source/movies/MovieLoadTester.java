package com.source.movies;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

import com.source.dictionaryservice.model.MovieResourceDO;
import com.source.dictionaryservice.utils.MovieInfoLoader;

public class MovieLoadTester {

	static String filePath = "C:\\PerDev\\git\\Java\\dictionaryservice\\src\\main\\resources\\data\\movies.json";
	
	
	@Test
	public void test_movie_fileload_isnull() {
		Assert.assertNotNull(MovieInfoLoader.loadMovieFromResource(filePath));
	}
	
	@Test
	public void test_movie_fileload_isempty() {
		Assert.assertEquals(false,MovieInfoLoader.loadMovieFromResource(filePath).isEmpty());
	}
	
	public void test_movie_isContains(String movieName) {
	   List<MovieResourceDO> movies = MovieInfoLoader.
			   loadMovieFromResource(filePath).
			   stream().
			   filter(movie -> movie.getTitle().toLowerCase().contains(movieName.toLowerCase())).collect(Collectors.toList());
	   Assert.assertEquals(true,movies.size()>0);
	   movies.forEach(movie -> {
		   System.out.println("Search Key is "+movieName + " - Result is "+movie.toString());
	   });
	}
	
	@Test
	public void test_movie_isContains_avengers() {
		test_movie_isContains("avengers");
	}
	
	@Test
	public void test_movie_isContains_lor() {
		test_movie_isContains("Rings");
	}
	
	@Test
	public void test_mapper_fromresouurce_to_db() {
		 Assert.assertEquals(true,MovieInfoLoader.loadMoviesFromResourcetoDBModel(filePath).getMovies().size()>0);
		 MovieInfoLoader.loadMoviesFromResourcetoDBModel(filePath).getMovies().forEach( obj -> System.out.println(obj.toString()));
	}
	
}
