package by.danco.training.ui.builder;

import by.danco.training.facade.api.IFacade;
import by.danco.training.ui.menu.Menu;
import by.danco.training.ui.menu.item.AddStudentToCourseItem;
import by.danco.training.ui.menu.item.CloneCourseItem;
import by.danco.training.ui.menu.item.CourseItem;
import by.danco.training.ui.menu.item.FinishItem;
import by.danco.training.ui.menu.item.LectureItem;
import by.danco.training.ui.menu.item.StudentAllItem;
import by.danco.training.ui.menu.item.StudentGetIdItem;
import by.danco.training.ui.menu.item.StudentItem;
import by.danco.training.ui.menu.item.TrekCourseItem;
import by.danco.training.ui.menu.item.TrekLectureItem;
import by.danco.training.ui.menu.item.TrekLecturerItem;
import by.danco.training.ui.menu.item.TrekStudentItem;

public class MenuBuilder {
	
	private IFacade facade;

	public MenuBuilder(IFacade facade) {
		this.facade = facade;
	}
	
	public Menu createMenu(){
		
		Menu mainMenu = new Menu("Menu");
		Menu menuStudent = new Menu("Student Menu");
		Menu menuLecturer = new Menu("Lecturer Menu");
		Menu menuLecture = new Menu("Lecture Menu");
		Menu menuCourse = new Menu("Course Menu");
		
		
		//menu
		
		mainMenu.addItem(new TrekStudentItem(menuStudent));
		mainMenu.addItem(new TrekLectureItem(menuLecture));
		mainMenu.addItem(new TrekLecturerItem(menuLecturer));
		mainMenu.addItem(new TrekCourseItem(menuCourse));
		mainMenu.addItem(new FinishItem());
		
		//student
		
		menuStudent.addItem(new StudentItem(menuStudent,facade));
		menuStudent.addItem(new StudentAllItem(menuStudent, facade));
		menuStudent.addItem(new StudentGetIdItem(menuStudent, facade));
		menuStudent.addItem(new TrekCourseItem(menuCourse));
		
		//lecture
		
		menuLecture.addItem(new LectureItem(menuLecture, facade));
		
		//course
		
		menuCourse.addItem(new CourseItem(menuCourse, facade));
		menuCourse.addItem(new CloneCourseItem(menuCourse, facade));
		menuCourse.addItem(new AddStudentToCourseItem(menuCourse, facade));
		menuCourse.addItem(new TrekCourseItem(menuCourse));
		
		
		return mainMenu;
		
	}
	
	

}
