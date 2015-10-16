package edu.indiana.cs.c212;


import org.joda.time.DateTimeComparator;

import java.util.Comparator;

public class StartDateComparator implements Comparator<Professor>{

    @Override
    public int compare(Professor o1, Professor o2) {
        return dateTimeComparator.compare(o1.getStartDate(), o2.getStartDate());
    }

    static DateTimeComparator dateTimeComparator = DateTimeComparator.getDateOnlyInstance();
}
