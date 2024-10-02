class Static {
    protected static void course() {
        System.out.println("Present Course is JAVA");
    }

    protected void enrolled() {
        System.out.println("Student is enrolled in the course");
    }
}

public class StaticExample {
    public static void main(String[] args) {
        Static.course();
        // Static.enrolled(); can't be called directly
        Static enrolled = new Static();
        enrolled.enrolled();
        // enrolled.course(); not a proper way to call static method
    }
}