package ua.lviv.hrechkovyk;


import java.util.*;

public class Main {
    public static void main(String[] args){
        String[] arrayStudents = {"Антонов", "Шевченко", "Бойко", "Шевченко", "Кравченко", "Савицький", "Антонов", "Шевченко"};
        List<String> studentSpysok = new ArrayList<>();

        for (String student : arrayStudents){
            studentSpysok.add(student);
        }
        System.out.println(studentSpysok);
        System.out.println("кількість студентів : " + studentSpysok.size());

        Set<String> uniqueStudent = new HashSet<>();

        for (String student : arrayStudents){
            uniqueStudent.add(student);
        }
        System.out.println(uniqueStudent);
        System.out.println("кількість унікальних студентів : " + uniqueStudent.size());

        Map<String, Integer> map = new HashMap<>();
        for (String keys : arrayStudents){
            map.put(keys, arrayStudents.length);
            System.out.println(keys.length());
        }
    }
}