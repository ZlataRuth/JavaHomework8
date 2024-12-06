package com.example.circle;

/**
 * В домашнем задании вам нужно заполнить класс Circle.
 * Создайте в нём поле radius с типом double, конструктор, который заполняет это поле, а также геттер getRadius и сеттер getRadius.
 * Дополнительно создайте метод getArea(), возвращающий площадь круга (напомним, что она равна π*r^2). Для числа
 * Пи вы можете использовать константу Math.PI.
 * Задача со звёздочкой: добавьте проверку, что радиус больше нуля и дополнительные тесты в классе TestCircle.
 */
public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new RuntimeException("Radius can't be less then 0");
        }
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
