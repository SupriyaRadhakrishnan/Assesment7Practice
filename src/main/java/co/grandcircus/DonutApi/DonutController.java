package co.grandcircus.DonutApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DonutController {
	
	@Autowired
	private DonutService ds;
	
	
	@GetMapping("/homepage")
	public String homepage(Model model)
	{
		DonutResponse dr = ds.getDonuts();
		model.addAttribute("results", dr.getResults());
		return "homepage";
	}
	
	@GetMapping("/donut")
	public String details(int id ,Model model)
	{
		System.out.println("Hello");
		Result result = ds.getDonutDetails(id);
		model.addAttribute("result", result);
		return "details";
	}

}
