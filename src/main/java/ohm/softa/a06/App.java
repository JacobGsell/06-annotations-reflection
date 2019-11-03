package ohm.softa.a06;

import com.google.gson.Gson;
import ohm.softa.a06.model.Joke;

/**
 * @author Peter Kurfer
 * Created on 11/10/17.
 */
public class App {

	public static void main(String[] args) {
		// TODO fetch a random joke and print it to STDOUT
		Gson gson = new Gson();

		Joke j = gson.fromJson("{'id': 0, 'joke': 'Haha'}", Joke.class);

		String json = gson.toJson(j);

		System.out.println(json);
	}

}
