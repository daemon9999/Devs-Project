package kodlama.io.Devs.dataAccess.abstracts;



import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Transactional
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer>{
	
	@Modifying
	@Query("UPDATE ProgrammingLanguage pl set pl.name = ?1 where pl.id = ?2")
	void update(String newName, int id);
	
	ProgrammingLanguage findById(int id);
}
