package com.gwang.jing.service;
import static com.googlecode.objectify.ObjectifyService.ofy;

import org.springframework.stereotype.Service;

import com.googlecode.objectify.ObjectifyService;
import com.gwang.jing.data.model.Ju;
@Service
public class ContextService {

	static {
		ObjectifyService.register(Ju.class);
	}
	public void save(Ju ju) {
		ofy().save().entity(ju).now(); 
	}
}
