package ex2.streamSample;

class Student {
    private String group;
    private String name;
    private int score;

    public Student(String group, String name, int score) {
        this.group = group;
        this.name = name;
        this.score = score;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
