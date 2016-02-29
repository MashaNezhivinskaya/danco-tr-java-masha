package by.danco.training.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.danco.training.dao.api.ICourseDao;
import by.danco.training.modal.Course;
import by.danco.training.service.api.ICourseService;

public class CourseServiceImpl implements ICourseService {

	private static final Logger LOGGER = LogManager.getLogger(CourseServiceImpl.class);
	
	private ICourseDao courseDao;
	
	public CourseServiceImpl(ICourseDao courseDao) {
		super();
		this.courseDao = courseDao;
	}

	@Override
	public void addRecord(Course course) {
		try {
			courseDao.addRecord(course);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		
	}

	@Override
	public void deleteRecord(Course course) {
		
		try {
			courseDao.deleteRecord(course);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}

	}

	@Override
	public void updateRecord(Course course) {
		
		try {
			courseDao.updateRecord(course);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
	}

	@Override
	public Course getRecordById(Long id) {
		try {
			return courseDao.getRecordById(id);
					
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Course> getAll() {
		
		try {
			return courseDao.getAll();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Course> sortName() {
		
		try {
			return courseDao.sortName();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Course> sortDateStart() {

		try {
			return courseDao.sortDateStart();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Course> sortCountStudent() {
		
		try {
			return courseDao.sortCountStudent();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Course> sortSection() {
		
		try {
			return courseDao.sortSection();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Course> sortLecturer() {
		
		try {
			return courseDao.sortLecturer();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Course> sortNameStart() {
		
		try {
			return courseDao.sortNameStart();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Course> sortStartDateStart() {
		
		try {
			return courseDao.sortStartDateStart();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Course> sortCountStudentStart() {
		
		try {
			return courseDao.sortCountStudentStart();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Course> sortSectionStart() {
		
		try {
			return courseDao.sortSectionStart();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Course> sortLecturerStart() {

		try {
			return courseDao.sortLecturerStart();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Course> sortNameDate(Date date) {
		
		try {
			return courseDao.sortNameDate(date);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Course> sorttDateStartDate(Date date) {
		
		try {
			return courseDao.sorttDateStartDate(date);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Course> sortCountStudentDate(Date date) {
		
		try {
			return courseDao.sortCountStudentDate(date);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Course> sortSectionDate(Date date) {
		
		try {
			return courseDao.sortSectionDate(date);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Course> sortLecturerDate(Date date) {
		
		try {
			return courseDao.sortLecturerDate(date);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public Integer getCount() {
		
		try {
			return courseDao. getCount();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Course> getLecturerDate(Date date1, Date date2) {
		
		try {
			return courseDao.getLecturerDate(date1, date2);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public Course cloneCourse(Long idCourse) {
		try {
			return courseDao.cloneCourse(courseDao.getRecordById(idCourse));
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

}
