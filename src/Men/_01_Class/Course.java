package Men._01_Class;

public class Course {
    String name;
    int minScore;

    public Course(String name, int minScore) {
        this.name = name;
        this.minScore = minScore;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", minScore=" + minScore +
                '}';
    }
}
