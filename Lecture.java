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
import java.sql.Date;

public class Lecture {
    private int id;
	private int batch_id;
	private Date date;
	public Lecture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lecture(int id, int batch_id, Date date) {
		super();
		this.id = id;
		this.batch_id = batch_id;
		this.date = date;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

    @Override
    public String toString() {
        return "Lecture{" + "id=" + id + ", batch_id=" + batch_id + ", date=" + date + '}';
    }
	
}
