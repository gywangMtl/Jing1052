package com.gwang.jing.data.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class Zi {
    @Id Long id;
    @Index String zi;
	public String getZi() {
		return zi;
	}
	public void setZi(String zi) {
		this.zi = zi;
	}
    
}
