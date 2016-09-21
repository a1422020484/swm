package swm.httpTest;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.SimpleClientHttpRequestFactory;

public class HttpRequestTest {
	
	public static void jsonRequest() throws IOException, URISyntaxException{
		String url = "http://localhost:8082/swm/http/ContentType";
		ClientHttpRequest request = new SimpleClientHttpRequestFactory().createRequest(new URI(url), HttpMethod.GET);
		
		request.getHeaders().set("Accept", "Application/xml");
		
		ClientHttpResponse response = request.execute();
		
		Charset charset  = response.getHeaders().getContentType().getCharSet();
		
		InputStream is = response.getBody();
		
		byte bytes[] = new byte[(int)response.getHeaders().getContentLength()];
		
		is.read(bytes);
		
		String jsonData  = new String (bytes,charset);
		
		System.out.println("charset : "+charset+",jsonData : "+ jsonData);
	}
	
}
