package homework_nr_18;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "src/main/java/homework_nr_18/input.txt";
        String outputFilePath = "src/main/java/homework_nr_18/output.txt";

        List<Person> people = new ArrayList<>();

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(inputFilePath));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    int age = Integer.parseInt(parts[1].trim());
                    double score = Double.parseDouble(parts[2].trim());
                    Person person = new Person(name, age, score);
                    people.add(person);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("This file could not be found: " + inputFilePath);
            return;
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + inputFilePath);
            return;
        } catch (NumberFormatException e) {
            System.out.println("Data error: please check that all information has been introduced correctly");
            return;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Can not close the file " + inputFilePath);
                }
            }
        }

        if (people.size() == 0) {
            System.out.println("File does not contain any data");
            return;
        }

        double totalScore = 0;
        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            totalScore += person.getScore();
        }
        double averageScore = totalScore / people.size();

        Person youngest = people.get(0);
        Person oldest = people.get(0);
        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            if (person.getAge() < youngest.getAge()) {
                youngest = person;
            }
            if (person.getAge() > oldest.getAge()) {
                oldest = person;
            }
        }

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(outputFilePath));
            writer.write("Average score: " + String.format("%.1f", averageScore) + "\n");
            writer.write("The youngest one: " + youngest.getName() + " (Age: " + youngest.getAge() + ")\n");
            writer.write("This is the oldest one: " + oldest.getName() + " (Age: " + oldest.getAge() + ")\n");
        } catch (IOException e) {
            System.out.println("Error while writing data to file: " + outputFilePath);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Can not close the file: " + outputFilePath);
                }
            }
        }
    }

    static class Person {
        private String name;
        private int age;
        private double score;

        public Person(String name, int age, double score) {
            this.name = name;
            this.age = age;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getScore() {
            return score;
        }
    }
}