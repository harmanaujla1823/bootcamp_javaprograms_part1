package com.bootcamp.javaPrograms1;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }
}

public class QuickSortDemo {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35),
            new Person("David", 28),
            new Person("Eve", 40)
        };

        System.out.println("Before sorting:");
        for (Person person : people) {
            System.out.println(person);
        }

        quickSort(people, 0, people.length - 1);

        System.out.println("\nAfter sorting by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static void quickSort(Person[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(Person[] arr, int low, int high) {
        int pivotAge = arr[high].getAge();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].getAge() < pivotAge) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(Person[] arr, int i, int j) {
        Person temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
