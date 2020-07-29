/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancemanagement;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Test {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name and id of the batch:");
        Batch b =new Batch(sc.next(),sc.nextInt());
        b.addStudent(new Student());
        b.addLectures(new Lecture());
    }
}
