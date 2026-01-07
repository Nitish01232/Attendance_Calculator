package service;

import model.Course;

public class AttendanceService {

    private final int criteriaPercentage;

    public AttendanceService(int criteriaPercentage) {
        this.criteriaPercentage = criteriaPercentage;
    }

    public int classesToAttend(Course course) {
        return (criteriaPercentage * course.getTotalClasses()
                - 100 * course.getAttendedClasses())
                / (100 - criteriaPercentage);
    }

    public int classesCanBunk(Course course) {
        return (100 * course.getAttendedClasses()
                - criteriaPercentage * course.getTotalClasses())
                / criteriaPercentage;
    }
}
