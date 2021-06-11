package seido.kata;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class KataController {
	
	private KataRepository kataRepository = new KataRepository();
	
	public KataController() {
		
	}
	
	@GetMapping("/")
	public String getHome() {
		return "index.html";
	}
	
	@GetMapping("/all")
	public String getAll(Model model) {
		model.addAttribute("katas", kataRepository.findAll());
		return("AllTemplate.html");
	}
	
	@GetMapping("/all/{grade}")
	public String getAllByGrade(@PathVariable("grade") String grade, Model model) {
		model.addAttribute("katas", kataRepository.findAllByGrade(grade));
		return("AllTemplate.html");
	}
	
	@GetMapping("/random")
	public String getRandom(Model model) {
		model.addAttribute("kata", kataRepository.findRandom());
		return("RandomTemplate.html");
	}
	
	@GetMapping("/random/{grade}")
	public String getRandomByGrade(@PathVariable("grade") String grade, Model model) {
		model.addAttribute("kata", kataRepository.findRandomByGrade(grade));
		return("RandomTemplate.html");
	}

}
