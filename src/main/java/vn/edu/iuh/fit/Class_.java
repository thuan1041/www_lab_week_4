package vn.edu.iuh.fit;

public class Class_ {
    private String className;
    private String classId;

    public Class_() {
    }

    public Class_(String className, String classId) {
        this.className = className;
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Class_{" +
                "className='" + className + '\'' +
                ", classId='" + classId + '\'' +
                '}';
    }
}
