class Patient {
    private int id;
    private String name;
    private int age;
    private String problem;

    Patient(int id, String name, int age, String problem) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.problem = problem;
    }

    int getId() {
        return id;
    }

    void display() {
        System.out.println(id + " | " + name + " | " + age + " | " + problem);
    }
}