package data;

public class Teacher extends User {
    private String disciplesTaught;

    public Teacher(String subject,String name, String birthday) {
        super.setName(name);
        super.setBirthday(birthday);
        this.disciplesTaught = subject;
    }

    public Teacher() {
        super.setName("");
        super.setBirthday("");
        this.disciplesTaught = "";
    }

    public String getDisciplesTaught() {
        return disciplesTaught;
    }

    public void setDisciplesTaught(String disciplesTaught) {
        this.disciplesTaught = disciplesTaught;
    }

    @Override
    public String toString() {
        return  "Тип: Преподаватель Имя: " + super.getName() +
                " День рождения: " + super.getBirthday() +
                " Предмет: " + disciplesTaught;
    }
}