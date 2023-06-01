package Controller;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Cat {
    String id;
    String name;
    String age;
    String color;
    Category category;

    ArrayList<Habit> habits = new ArrayList<>();
    String additionalInfo;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setHabits(ArrayList<Habit> habits) {
        this.habits = habits;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", color='" + color + '\'' +
                ", category=" + category +
                ", habits=" + habits +
                ", additionalInfo='" + additionalInfo + '\'' +
                '}';
    }
}

class Category {
    String name;
    String description;
}


class Habit {

    String name;
    String description;
    boolean good;
}
