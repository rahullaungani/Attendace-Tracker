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
public class Batch {
    private String name;
    private int id;
    private Student[] students;
    private int scount = 0;
    private Lecture[] lectures;
    private int lcount=0;

    public Batch(String name, int id) {
        this.name = name;
        this.id = id;
        Student[] s=new Student[50];
        Lecture[] l=new Lecture[30];
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Student[] getStudents() {
        return students;
    }

    public Lecture[] getLectures() {
        return lectures;
    }
    public void addStudent(Student s) 
    {
        students[scount] = s;
        scount++;
    }
     public void addLectures(Lecture l) 
    {
        lectures[lcount] = l;
        lcount++;
    }
}
