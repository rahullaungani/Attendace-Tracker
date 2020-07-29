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
public class BatchStudent {
    private int id;
	private int batch_id;
	private int student_id;
	public BatchStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BatchStudent(int id, int batch_id, int student_id) {
		super();
		this.id = id;
		this.batch_id = batch_id;
		this.student_id = student_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

    @Override
    public String toString() {
        return "BatchStudent{" + "id=" + id + ", batch_id=" + batch_id + ", student_id=" + student_id + '}';
    }
	
}
