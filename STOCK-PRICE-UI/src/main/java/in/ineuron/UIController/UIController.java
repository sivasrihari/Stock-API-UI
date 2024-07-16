package in.ineuron.UIController;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.jdt.internal.compiler.env.IModule.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import in.ineuron.IService.ServiceImpl;

@Controller
public class UIController 
{
	@Autowired
	private ServiceImpl service;
	@GetMapping("/")
	public String load()
	{
		return "index";
	}
	@GetMapping("/getTotalCost")
	public String getResult(HttpServletRequest request, Map<String,Object> map)
	{
		String c=request.getParameter("CompanyName");
		String n=request.getParameter("Quantity");
		String msg=service.getTotalStockPrice(c,n);
		map.put("msg",msg);
		return "index";
	}
	
	
}
