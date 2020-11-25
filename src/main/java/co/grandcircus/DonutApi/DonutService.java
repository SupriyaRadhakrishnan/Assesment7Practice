package co.grandcircus.DonutApi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DonutService {
	
	
	public DonutResponse getDonuts()
	{
		
		RestTemplate resttemplate = new RestTemplate();
		String url="https://grandcircusco.github.io/demo-apis/donuts.json";
		return resttemplate.getForObject(url,DonutResponse.class);
		
	}
	

	public Result getDonutDetails(int id)
	{
		
		RestTemplate resttemplate = new RestTemplate();
		String url="https://grandcircusco.github.io/demo-apis/donuts/"+ id + ".json";
		System.out.println("url" + url);
		return resttemplate.getForObject(url,Result.class);
		
	}

}
