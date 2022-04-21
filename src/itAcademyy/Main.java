package itAcademyy;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        car.setYear(2005);
        car.setColor("Blue");
        car.setModel("Jeep");

        car.info();
        System.out.println("Наша машина: " + car.getYear() + " года выпуска, " + car.getColor() +
                " цвета, " + "модель: " + car.getModel());

        Motorbike motorbike = new Motorbike(2001, "Red", "Sport");

        motorbike.info();
        System.out.println("Наш мотоцикл: " + motorbike.getYear() + " года выпуска, " + motorbike.getColor() +
                " цвета, " + "модель: " + motorbike.getModel());

        System.out.println(car.yearDifference(2020));
        System.out.println(motorbike.yearDifference(2020));

        Airplane airplane = new Airplane("German", 2015, 85, 786);
        airplane.setYear(2018);
        airplane.setLenght(90);
        airplane.fillUp(11);
        airplane.fillUp(10);
        airplane.info();

        Teacher teacher = new Teacher("Veronika", "English");
        Student student = new Student("Alex");
        teacher.evaluate(student);
    }
}
