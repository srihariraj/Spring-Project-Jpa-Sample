package com.Project.DataJPA.repositoryInterfaces;

import org.springframework.data.repository.CrudRepository;

import com.Project.DataJPA.modelClasses.Students;

public interface ModelRepository extends CrudRepository<Students, Long> {

}
