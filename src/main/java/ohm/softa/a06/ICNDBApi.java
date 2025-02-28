package ohm.softa.a06;

import ohm.softa.a06.model.Joke;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

/**
 * @author Peter Kurfer
 * Created on 11/10/17.
 */
public interface ICNDBApi {
	@GET("/jokes/random")
	Call<Joke> getRandomJoke();

	@GET("/jokes/random/{count}")
	Call<List<Joke>> getRandomJokes();

	@GET("/jokes/{id}")
	Call<Joke> getJokeById(@Path("id") int number);
}
