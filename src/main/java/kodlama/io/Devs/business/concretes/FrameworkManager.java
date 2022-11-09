package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.FrameworkService;
import kodlama.io.Devs.dataAccess.abstracts.FrameworkRepository;
import kodlama.io.Devs.entities.concretes.Framework;

@Service
public class FrameworkManager implements FrameworkService{

	private FrameworkRepository frameworkRepository;
	
	@Autowired
	public FrameworkManager(FrameworkRepository frameworkRepository) {
		this.frameworkRepository = frameworkRepository;
	}
	
	@Override
	public void add(Framework framework) {
		this.frameworkRepository.save(framework);
	}

	@Override
	public void delete(int id) {
		this.frameworkRepository.deleteById(id);
		
	}

	@Override
	public List<Framework> getAll() {
		
		return this.frameworkRepository.findAll();
	}

}
