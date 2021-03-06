import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class JAVA11_6 {
	public static void main(String[] args) {
		String url="https://httpbin.org/get";
		HttpRequest req=HttpRequest.newBuilder().uri(URI.create(url)).GET().version(Version.HTTP_2).build();
		
		HttpClient client=HttpClient.newBuilder().build();
		
		try {
			HttpResponse<String> resp=client.send(req, BodyHandlers.ofString());
			System.out.println(resp.headers());
			System.out.println(resp.statusCode());
			System.out.println(resp.body());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
