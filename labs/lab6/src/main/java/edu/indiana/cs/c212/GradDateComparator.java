package edu.indiana.cs.c212;

import org.joda.time.DateTimeComparator;

import java.util.Comparator;

/**
 * Created by jacob on 10/2/14. All rights reserved.
 */
public class GradDateComparator implements Comparator<Student> {

    public int compare(Student a, Student b){
        return dateTimeComparator.compare(a.getGraduationDate(), b.getGraduationDate());
    }

    public boolean equals(Student a, Student b){
        return a.getGraduationDate().equals(b.getGraduationDate());
    }

    private static DateTimeComparator dateTimeComparator = DateTimeComparator.getDateOnlyInstance();
}
