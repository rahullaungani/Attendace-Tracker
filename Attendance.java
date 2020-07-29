package attendancemanagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Attendance {
    private int id;
	private int lecture_id;
	private int student_id;
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Attendance(int id, int lecture_id, int student_id) {
		super();
		this.id = id;
		this.lecture_id = lecture_id;
		this.student_id = student_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLecture_id() {
		return lecture_id;
	}
	public void setLecture_id(int lecture_id) {
		this.lecture_id = lecture_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

    @Override
    public String toString() {
        return "Attendance{" + "id=" + id + ", lecture_id=" + lecture_id + ", student_id=" + student_id + '}';
    }
        
}
