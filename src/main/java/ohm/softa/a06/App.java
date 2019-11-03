package ohm.softa.a06;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ohm.softa.a06.model.Joke;
import ohm.softa.a06.adapters.JokeAdapter;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

/**
 * @author Peter Kurfer
 * Created on 11/10/17.
 */
public class App implements ICNDBApi {

	static final String BASE_URL = "http://api.icndb.com/";

	Gson gson = new GsonBuilder().setLenient().create();

	Retrofit.Builder builder = new Retrofit.Builder()
			.baseUrl(BASE_URL)
			.addConverterFactory(GsonConverterFactory.create());

	public static void main(String[] args) {
		// TODO fetch a random joke and print it to STDOUT
		Gson gson = new Gson();

		Joke j = gson.fromJson("{'id': 0, 'joke': 'Haha'}", Joke.class);

		String json = gson.toJson(j);

		System.out.println(json);
	}

	@Override
	public Call<Joke> getRandomJoke() {
		return null;
	}

	@Override
	public Call<List<Joke>> getRandomJokes() {
		return null;
	}

	@Override
	public Call<Joke> getJokeById(int number) {
		return null;
	}
}
