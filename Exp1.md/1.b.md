 Student Result Processing:

 // Java program to calculate total and average marks using arrays

public class Main {
    public static void main(String[] args) {

        // Array containing marks of 5 subjects
        int[] marks = {85, 90, 78, 88, 92};

        int total = 0;

        // Calculate total marks
        for (int mark : marks) {
            total += mark;
        }

        // Calculate average marks
        double average = (double) total / marks.length;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

OUTPUT:
Total Marks: 433
Average Marks: 86.6
