package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{

	List<ProgrammingLanguage> programmingLanguages;
	
	
	public InMemoryProgrammingLanguageRepository(List<ProgrammingLanguage> programmingLanguages) {
		
		this.programmingLanguages = new ArrayList<ProgrammingLanguage>();
		this.programmingLanguages.add(new ProgrammingLanguage(1, "C#"));
		this.programmingLanguages.add(new ProgrammingLanguage(2, "Java"));
		this.programmingLanguages.add(new ProgrammingLanguage(3, "Python"));
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		this.programmingLanguages.add(programmingLanguage);
		
	}

	@Override
	public void delete(int id) {
		ProgrammingLanguage programmingLanguageToDelete = this.getById(id);
		this.programmingLanguages.remove(programmingLanguageToDelete);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		ProgrammingLanguage programmingLanguageToUpdate = this.getById(programmingLanguage.getId());
		programmingLanguages.set(programmingLanguageToUpdate.getId() - 1, programmingLanguage);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if (programmingLanguage.getId() == id) {
				return programmingLanguage;
			}
		}
		return null;
	}
	
}
