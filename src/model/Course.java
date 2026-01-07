package model;

public class Course {
    private final String name;
    private final int attendedClasses;
    private final int totalClasses;

    public Course(String name, int attendedClasses, int totalClasses) {
        if (attendedClasses > totalClasses) {
            throw new IllegalArgumentException(
                    "Attended classes cannot be greater than total classes"
            );
        }
        this.name = name;
        this.attendedClasses = attendedClasses;
        this.totalClasses = totalClasses;
    }

    public String getName() {
        return name;
    }

    public int getAttendedClasses() {
        return attendedClasses;
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public double getAttendancePercentage() {
        return (attendedClasses * 100.0) / totalClasses;
    }
}
