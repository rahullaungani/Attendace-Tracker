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
public class Student {
    private String name;
	private int id;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + '}';
    }
	
}
