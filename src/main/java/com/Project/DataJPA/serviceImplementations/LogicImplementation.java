package com.Project.DataJPA.serviceImplementations;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.DataJPA.modelClasses.Students;
import com.Project.DataJPA.repositoryInterfaces.ModelRepository;
@Service
public class LogicImplementation implements ModelRepository {

	@Autowired
	private final ModelRepository RP;

	public LogicImplementation(ModelRepository RP) {
		this.RP=RP;
	}

	@Override
	public <S extends Students> S save(S entity) {
		
		return RP.save(entity);
	}

	@Override
	public <S extends Students> Iterable<S> saveAll(Iterable<S> entities) {
		
		return RP.saveAll(entities);
	}

	@Override
	public Optional<Students> findById(Long id) {
		
		return RP.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		
		return RP.existsById(id);
	}

	@Override
	public Iterable<Students> findAll() {
		
		return RP.findAll();
	}

	@Override
	public Iterable<Students> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return RP.findAllById(ids);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return RP.count();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		RP.deleteById(id);
	}

	@Override
	public void delete(Students entity) {
		// TODO Auto-generated method stub
		RP.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		RP.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends Students> entities) {
		// TODO Auto-generated method stub
		RP.deleteAll();
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		RP.deleteAll();
	}

}
