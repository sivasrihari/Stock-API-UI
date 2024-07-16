package in.ineuron.IService;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class ServiceImpl 
{
	String URI="http://desktop-peisho3:2222/api/calc/calc/calculate/{companyName}/{quantity}";
	public  String getTotalStockPrice(String companyName, String quantity)
	{
		WebClient webclient=WebClient.create();
		String s=null;
		try
		{
		s=webclient.get().uri(URI,companyName,quantity).retrieve().bodyToMono(String.class).block();
		}
		catch(Exception E)
		{
			s="StockNotFound";
			E.printStackTrace();
		}
		return s;
	}
}
