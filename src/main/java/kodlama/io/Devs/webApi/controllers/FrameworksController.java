package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.FrameworkService;
import kodlama.io.Devs.entities.concretes.Framework;

@RestController
@RequestMapping("/api/frameworks")
public class FrameworksController {

	private FrameworkService frameworkService;
	
	@Autowired
	public FrameworksController(FrameworkService frameworkService) {
		this.frameworkService = frameworkService;
	}
	
	@GetMapping("getall")
	public List<Framework> getAll(){
		return this.frameworkService.getAll();
	}
	
	@PostMapping("add")
	public void add(@RequestBody Framework framework){
		this.frameworkService.add(framework);
	}
	
	@PostMapping("delete")
	public void delete(@RequestParam int id){
		this.frameworkService.delete(id);
	}
	
}
