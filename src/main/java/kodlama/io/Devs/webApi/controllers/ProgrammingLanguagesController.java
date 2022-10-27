package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;
	
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@PostMapping("add")
	public void add(ProgrammingLanguage programmingLanguage) {
		this.programmingLanguageService.add(programmingLanguage);
	}

	@PostMapping("delete")
	public void delete(int id) {
		this.programmingLanguageService.delete(id);
	}

	@PostMapping("update")
	public void update(ProgrammingLanguage programmingLanguage) {
		this.programmingLanguageService.update(programmingLanguage);
	}

	@GetMapping("getall")
	public List<ProgrammingLanguage> getAll() {

		return this.programmingLanguageService.getAll();
	}

	@GetMapping("getbyid")
	public ProgrammingLanguage getById(int id) {
		return this.programmingLanguageService.getById(id);
	}
	
}
