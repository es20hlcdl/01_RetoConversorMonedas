import com.google.gson.Gson;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Monedas monedaUSD_ARS(String tipoDeMoneda){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/dcb5b4c6ed88dabd77cc4cbe//pair/USD/ARS");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(direccion)))
                .build();
        try {
            HttpResponse<String> response = null;
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre la moneda");
        }
}
    public Monedas monedaARS_USD(String tipoDeMoneda){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/dcb5b4c6ed88dabd77cc4cbe//pair/ARS/USD");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(direccion)))
                .build();
        try {
            HttpResponse<String> response = null;
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre la moneda");
        }
    }

    public Monedas monedaUSD_BRL(String tipoDeMoneda){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/dcb5b4c6ed88dabd77cc4cbe//pair/USD/BRL");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(direccion)))
                .build();
        try {
            HttpResponse<String> response = null;
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre la moneda");
        }
    }
    public Monedas monedaBRL_USD(String tipoDeMoneda){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/dcb5b4c6ed88dabd77cc4cbe//pair/BRL/USD");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(direccion)))
                .build();
        try {
            HttpResponse<String> response = null;
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre la moneda");
        }
    }

    public Monedas monedaUSD_COP(String tipoDeMoneda){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/dcb5b4c6ed88dabd77cc4cbe//pair/USD/COP");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(direccion)))
                .build();
        try {
            HttpResponse<String> response = null;
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre la moneda");
        }
    }
    public Monedas monedaCOP_USD(String tipoDeMoneda){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/dcb5b4c6ed88dabd77cc4cbe//pair/COP/USD");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(direccion)))
                .build();
        try {
            HttpResponse<String> response = null;
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre la moneda");
        }
    }
}
