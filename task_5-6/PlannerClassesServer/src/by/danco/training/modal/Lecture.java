package by.danco.training.modal;

import java.io.Serializable;
import java.util.Date;

public class Lecture implements Serializable{
	
	private static final long serialVersionUID = 8771882752378278184L;
	
	private Long id;
	private String nameLecture;
	private Date date;
	
		
	public Lecture(String nameLecture, Date date) {
		this.nameLecture = nameLecture;
		this.date = date;
	}
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNameLecture() {
		return nameLecture;
	}
	public void setNameLecture(String nameLecture) {
		this.nameLecture = nameLecture;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
