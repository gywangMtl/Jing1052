package com.gwang.jing.data.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class Ju {
    @Id Long id;
    @Index String context;
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
    
}
