package ohm.softa.a08.api;

import com.google.gson.Gson;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class OpenMensaAPIService {

	private static OpenMensaAPIService instance;
	private final OpenMensaAPI openMensaApiInstance;

	private OpenMensaAPIService() {
		openMensaApiInstance = new Retrofit.Builder()
			.addConverterFactory(GsonConverterFactory.create(new Gson()))
			.baseUrl("http://openmensa.org/api/v2/")
			.build()
			.create(OpenMensaAPI.class);
	}

	public static OpenMensaAPIService getInstance() {
		if (instance == null) {
			instance = new OpenMensaAPIService();
		}
		return instance;
	}

	public OpenMensaAPI getAPI() {
		return openMensaApiInstance;
	}
}
