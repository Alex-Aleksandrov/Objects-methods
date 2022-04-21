package itAcademyy;

import java.util.Random;

public class Teacher {
    private String name;
    private String predemet;

    public Teacher(String name, String predemet) {
        this.name = name;
        this.predemet = predemet;
    }


    public void evaluate(Student student) {
        Random random = new Random();
        int randomVal = random.nextInt(4) + 2;
        String ocenka;
        if (randomVal == 3) {
            ocenka = " - Удовлетворительно";
        } else if (randomVal == 4) {
            ocenka = " - Хорошо";
        } else if (randomVal == 5) {
            ocenka = " - Отлично";
        } else ocenka = " - Неудовлетворительно";

        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() +
                " по предмету " + this.predemet + " на оценку" + ocenka);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPredemet() {
        return predemet;
    }

    public void setPredemet(String predemet) {
        this.predemet = predemet;
    }
}
