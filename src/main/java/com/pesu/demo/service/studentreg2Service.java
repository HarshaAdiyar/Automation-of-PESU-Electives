package com.pesu.demo.service;
import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pesu.demo.model.postallot;
import com.pesu.demo.model.studentreg2;
import com.pesu.demo.repository.studentreg2Repository;
import com.pesu.demo.repository.postallotRepository;
import com.pesu.demo.service.*;

@Service
public class studentreg2Service {
	@Autowired
	studentreg2Repository studentreg2Repository;
	@Autowired
	postallotRepository postallotRepository;

	@Autowired
    postallotService postallotService;

    public void allocateElectives() {
        List<studentreg2> students = studentreg2Repository.findAll();
        System.out.println(students);
        Collections.sort(students, Comparator.comparing(studentreg2::getCgpa).reversed());
        System.out.println(students);
        Map<String, List<studentreg2>> allocatedStudentsByElectiveAndFaculty = new HashMap<>();
        allocatedStudentsByElectiveAndFaculty.put("e11 - e1_f1_1", new ArrayList<>());
        allocatedStudentsByElectiveAndFaculty.put("e12 - e1_f2_1", new ArrayList<>());
        allocatedStudentsByElectiveAndFaculty.put("e21 - e2_f1_2", new ArrayList<>());
        allocatedStudentsByElectiveAndFaculty.put("e22 - e2_f2_2", new ArrayList<>());
        
        allocatedStudentsByElectiveAndFaculty.put("e12 - e1_f1_1", new ArrayList<>());
        allocatedStudentsByElectiveAndFaculty.put("e11 - e1_f2_1", new ArrayList<>());
        allocatedStudentsByElectiveAndFaculty.put("e22 - e2_f1_2", new ArrayList<>());
        allocatedStudentsByElectiveAndFaculty.put("e21 - e2_f2_2", new ArrayList<>());
        for (studentreg2 student : students) {
            postallot postallot = new postallot();
            if (student.getE1() != null) {
                String key1 = student.getE1() + " - e1_f1_1";
                String key2 = student.getE1() + " - e1_f2_1";
                System.out.println("1"+key1+" "+key2);
                if (allocatedStudentsByElectiveAndFaculty.get(key1).size() < 60) {
//                    student.setE1(student.getE1());
//                    student.setE1f1_1("e1_f1_1");
                    System.out.println("1"+student);
//                    studentreg2Repository.save(student);
                    allocatedStudentsByElectiveAndFaculty.get(key1).add(student);
//                    postallot postallot = new postallot();
                    postallot.setS_name(student.getSname());
                    postallot.setSrn(student.getSrn());
                    postallot.setE1(student.getE1());
                    postallot.setE1f1(student.getE1f1_1());
                    System.out.println("1"+postallot);
//                    postallotRepository.save(postallot);
                    System.out.println("Allocated " + student.getSname() + " to " + key1);
                } else if (allocatedStudentsByElectiveAndFaculty.get(key2).size() < 60) {
//                    student.setE1(student.getE1());
//                    student.setE1f2_1("e1_f2_1");
                    System.out.println("2"+student);
//                    studentreg2Repository.save(student);
                    allocatedStudentsByElectiveAndFaculty.get(key2).add(student);
//                    postallot postallot = new postallot();
                    postallot.setS_name(student.getSname());
                    postallot.setSrn(student.getSrn());
                    postallot.setE1(student.getE1());
                    postallot.setE1f1(student.getE1f2_1());
                    System.out.println("2"+postallot);
//                    postallotRepository.save(postallot);
                    System.out.println("Allocated " + student.getSname() + " to " + key2);
                } else {
                    System.out.println("Unable to allocate " + student.getSname() + " to " + student.getE1());
                }
            }
            if (student.getE2() != null) {
                String key1 = student.getE2() + " - e2_f1_2";
                String key2 = student.getE2() + " - e2_f2_2";
                System.out.println("3"+key1+" "+key2);

                if (allocatedStudentsByElectiveAndFaculty.get(key1).size() < 60) {
//                    student.setE2(student.getE2());
//                    student.setE2f1_2("e2_f1_2");
                    System.out.println("3"+student);
//                    studentreg2Repository.save(student);
                    allocatedStudentsByElectiveAndFaculty.get(key1).add(student);
//                    postallot postallot = new postallot();
                    postallot.setS_name(student.getSname());
                    postallot.setSrn(student.getSrn());
                    postallot.setE2(student.getE2());
                    postallot.setE2f2(student.getE2f1_2());
                    System.out.println("3"+postallot);
                    System.out.println("saving....");
                    postallotRepository.save(postallot);

                    System.out.println("Allocated " + student.getSname() + " to " + key1);
                }

                else if (allocatedStudentsByElectiveAndFaculty.get(key2).size() < 60) {
//                    student.setE2(student.getE2());
//                    student.setE2f2_2("e2_f2_2");
                    System.out.println("4"+student);

//                    studentreg2Repository.save(student);
                    allocatedStudentsByElectiveAndFaculty.get(key2).add(student);
//                    postallot postallot = new postallot();
                    postallot.setS_name(student.getSname());
                    postallot.setSrn(student.getSrn());
                    postallot.setE2(student.getE2());
                    postallot.setE2f2(student.getE2f2_2());
                    System.out.println("4"+postallot);

                    postallotRepository.save(postallot);

                    System.out.println("Allocated " + student.getSname() + " to " + key2);
                }
               
            
            }
}}}

//public void allocateElectives() {
//    List<studentreg2> students = studentreg2Repository.findAll();
//    Collections.sort(students, Comparator.comparing(studentreg2::getCgpa).reversed());
//    Map<String, List<studentreg2>> allocatedStudentsByElectiveAndFaculty = new HashMap<>();
//    allocatedStudentsByElectiveAndFaculty.put("e1 - e1_f1_1", new ArrayList<>());
//    allocatedStudentsByElectiveAndFaculty.put("e1 - e1_f2_1", new ArrayList<>());
//    allocatedStudentsByElectiveAndFaculty.put("e2 - e2_f1_2", new ArrayList<>());
//    allocatedStudentsByElectiveAndFaculty.put("e2 - e2_f2_2", new ArrayList<>());
//    if (students != null) {
//        int numStudents = students.size();
//        // do something with the students
//  
//    for (studentreg2 student : students) {
//        if (student.getE1() != null) {
//            String key1 = student.getE1() + " - e1_f1_1";
//            String key2 = student.getE1() + " - e1_f2_1";
//            if (allocatedStudentsByElectiveAndFaculty.get(key1).size() < 60) {
//                student.setE1(student.getE1());
//                student.setE1f1_1("e1_f1_1");
//                studentreg2Repository.save(student);
//                allocatedStudentsByElectiveAndFaculty.get(key1).add(student);
//                System.out.println("Allocated " + student.getSname() + " to " + key1);
//            } else if (allocatedStudentsByElectiveAndFaculty.get(key2).size() < 60) {
//                student.setE2(student.getE1());
//                student.setE1f2_1("e1_f2_1");
//                studentreg2Repository.save(student);
//                allocatedStudentsByElectiveAndFaculty.get(key2).add(student);
//                System.out.println("Allocated " + student.getSname() + " to " + key2);
//            } else {
//                System.out.println("Unable to allocate " + student.getSname() + " to " + student.getE1());
//            }
//        }
//        if (student.getE2() != null) {
//            String key1 = student.getE2() + " - e2_f1_2";
//            String key2 = student.getE2() + " - e2_f2_2";
//            if (allocatedStudentsByElectiveAndFaculty.get(key1).size() < 60) {
//                student.setE2(student.getE2());
//                student.setE2f1_2("e2_f1_2");
//                studentreg2Repository.save(student);
//                allocatedStudentsByElectiveAndFaculty.get(key1).add(student);
//                System.out.println("Allocated " + student.getSname() + " to " + key1);
//            } else if (allocatedStudentsByElectiveAndFaculty.get(key2).size() < 60) {
//                student.setE2(student.getE2());
//                student.setE2f2_2("e2_f2_2");
//                studentreg2Repository.save(student);
//                allocatedStudentsByElectiveAndFaculty.get(key2).add(student);
//                System.out.println("Allocated " + student.getSname() + " to " + key2);
//            } else {
//                System.out.println("Unable to allocate " + student.getSname() + " to " + student.getE2());
//            }
//        }
//    }
//}
//
//else {
//	System.out.println("completed");
//
//}
//}

