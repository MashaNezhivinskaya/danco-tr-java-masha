package by.danco.training.ui.console.reader;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static String parseString(String message) throws RuntimeException {
		String record = null;
		boolean valid = false;
		try {
			while (!valid) {
				try {
					System.out.print(message + ": ");
					record = scanner.next();
					valid = true;
				} catch (InputMismatchException e) {
					System.out.println("Incorrect data, try again: ");
					scanner.nextLine();
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("error!");
		}
		return record;
	}
	
	public static long parseLong(String message) throws RuntimeException {
		long number = 0;
		boolean valid = false;
		try {
			while (!valid) {
				try {
					System.out.print(message + ": ");
					number = Long.parseLong(scanner.next());
					valid = true;
				} catch (InputMismatchException e) {
					System.out.println("Incorrect data, try again: ");
					scanner.nextLine();
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("error!");
		}
		return number;
	}
	
	public static int parseInteger(String message) throws RuntimeException {
		int number = 0;
		boolean valid = false;
		try {
			while (!valid) {
				try {
					System.out.print(message + ": ");
					number = Integer.parseInt(scanner.next());
					valid = true;
				} catch (InputMismatchException e) {
					System.out.println("Incorrect data, try again: ");
					scanner.nextLine();
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("error!");
		}
		return number;
	}
	
	public static Date parseDate(String message)throws RuntimeException{
		Date date = null;
		boolean valid = false;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			while (!valid) {
				try {
					System.out.print(message + ": ");
					date = formatter.parse(scanner.next());
					valid = true;
				} catch (InputMismatchException e) {
					System.out.println("Incorrect data, try again: ");
					scanner.nextLine();
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("error!");
		}
		return date;
	}
	
	public static int getMenuMode() throws RuntimeException {
		return parseInteger("Input section number");
	}
	
	public static String getStudentName() throws RuntimeException {
		return parseString("Input  firstname of student");
	}
	
	public static String getStudentLastName() throws RuntimeException {
		return parseString("Input lastname of student");
	}
	
	public static String getStudentSpecialty() throws RuntimeException {
		return parseString("Input specialty of student");
	}
	
	public static String getLectureName() throws RuntimeException {
		return parseString("Input lecture name");
	}
	
	public static Date getLectureDate() throws RuntimeException {
		return parseDate("Input lecture date");
	}
	
	public static Date getStartDateCourse() throws RuntimeException {
		return parseDate("Input start date course");
	}
	
	public static Date getStopDateCourse() throws RuntimeException {
		return parseDate("Input stop date course");
	}
	
	public static int getCountStudent() throws RuntimeException {
		return parseInteger("Input count student");
	}
	public static int getCountLecture() throws RuntimeException {
		return parseInteger("Input count lecture");
	}
	public static String getNameCourse() throws RuntimeException {
		return parseString("Input course name");
	}
	public static String getSection() throws RuntimeException {
		return parseString("Input section");
	}
	
	

}
