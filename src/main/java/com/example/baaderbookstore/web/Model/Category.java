package com.example.baaderbookstore.web.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long categoryId;
    private String name;




    public Category(String name) {
        super();
        this.name = name;
    }

    public Category() {

    }

    public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
