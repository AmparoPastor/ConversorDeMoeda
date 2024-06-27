import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MoedaConverter {
    public MoedaConvercao buscaMoeda(String baseCode, String targetCode, double valor){
        String INICIO_URL = "https://v6.exchangerate-api.com/v6/";
        String API_KEY = "ab6dd27a1045e14c0149c7ac";

        URI endereco = URI.create(INICIO_URL + API_KEY + "/pair/" + baseCode + "/" + targetCode + "/" + valor);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request,HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), MoedaConvercao.class);

        } catch (Exception e){
            throw new RuntimeException("Desculpe o inconveniente! Não foi possivel realizar sua transação.");
        }
    }
}
