package com.blog.pojo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="categories")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Catgeory extends BaseEntity{
	@Column(name="title")
	private String title;
	@Column(name="description")
	private String description;
	@OneToMany(mappedBy = "Category",cascade=CascadeType.ALL,orphanRemoval = true)
	private List<Blog>blogs;
	

}
