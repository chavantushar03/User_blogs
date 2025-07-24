package com.blog.pojo;

import java.time.LocalDateTime;
import java.util.List;

import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Super;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name="users") 
@Setter
@Getter
@ToString(exclude="blogs",callSuper = true )
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity{
	@Column(name="first_name",nullable=false)
	private String firstName;
	@Column(name="last_name",nullable=false)
	private String lastName;
	@Column(name="eamil",nullable=false,unique=true)
	private String email;
	@Column(name="password",nullable=false,unique=true)
	private String password;
	@Column(name="phone_number",unique = true)
	private int phoneNumber;
	@CreatedDate
	@Column(name="date")
	private LocalDateTime date;
	@OneToMany(mappedBy="user",cascade = CascadeType.ALL ,orphanRemoval = true)
	private List<Blog>blogs;
//	public User(String firstName,String lastName,String email,String Password ,int phoneNumber)
//	{
//		super();
//		this.firstName = firstName;
//		this.lastName= lastName;
//		this.email =email;
//		
//	}
	

}
