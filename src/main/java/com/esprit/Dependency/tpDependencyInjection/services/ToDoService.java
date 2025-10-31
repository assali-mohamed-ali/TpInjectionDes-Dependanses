package com.esprit.Dependency.tpDependencyInjection.services;

import java.util.List;
import com.esprit.Dependency.tpDependencyInjection.dao.IToDoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	// Injection par type : le bean annoté @Primary sera choisi (SpringToDoDao)
	@Autowired
	private IToDoDao toDoPrimary;

	// Injection par nom (qualifier) : on demande explicitement le bean springToDoDao
	@Autowired
	@Qualifier("springToDoDao")
	private IToDoDao toDoByName;

	public List<String> getCoursesList() {
		return toDoPrimary.getCoursesList();
	}
	public List<String>getCoursesListByName(){
		return toDoByName.getCoursesList();
	}

}
