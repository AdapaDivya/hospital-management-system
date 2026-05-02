class Doctor {
    private int id;
    private String name;
    private String dept;

    Doctor(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    int getId() {
        return id;
    }

    String getDept() {
        return dept;
    }

    void display() {
        System.out.println(id + " | " + name + " | " + dept);
    }
}