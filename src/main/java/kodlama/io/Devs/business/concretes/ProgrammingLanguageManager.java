package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
	
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}
	

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {

		for (ProgrammingLanguage pl : this.getAll()) {
			if (pl.getName().equals(programmingLanguage.getName()) || programmingLanguage.getName().isEmpty() || programmingLanguage.getName().isBlank()) {
				return;
			}
		}
		this.programmingLanguageRepository.save(programmingLanguage);
	}

	@Override
	public void delete(int id) {
		this.programmingLanguageRepository.deleteById(id);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		int id = programmingLanguage.getId();
		String newName = programmingLanguage.getName();
		this.programmingLanguageRepository.update(newName, id);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return this.programmingLanguageRepository.findAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return this.programmingLanguageRepository.findById(id);
	}

}
