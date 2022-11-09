package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.Framework;

public interface FrameworkService {
	void add(Framework framework);
	void delete(int id);
	List<Framework> getAll();
}
