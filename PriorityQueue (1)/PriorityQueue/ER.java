package PriorityQueue;

import java.util.*;

public class ER {

    private PriorityQueue<Patient> waitingRoom;
    private int count;

    public ER() {
        Comparator<Patient> cmp = (p1, p2) -> {
            if (p1.severity != p2.severity) {
                return p2.severity - p1.severity;
            }
            else {
                return p1.arrival - p2.arrival;
            }
        };

        waitingRoom = new PriorityQueue<>(cmp);
    }

    public ER(Comparator<Patient> cmp) {
        waitingRoom = new PriorityQueue<>(cmp);
    }

    public void add(String name, int severity) {
        waitingRoom.add(new Patient(name, severity, ++count));
    }

    public Patient serve() {
        return waitingRoom.remove();
    }

    @Override
    public String toString() {
        return waitingRoom.toString();
    }

    public static void main(String[] args) {
        ER er = new ER();
        er.add("Olivia", 6);
        er.add("Oliver", 8);
        er.add("Emma", 7);
        System.out.println("Waiting: " + er);
        System.out.println();

        System.out.println("Serving " + er.serve());
        System.out.println("Serving " + er.serve());
        System.out.println();

        System.out.println("Waiting: " + er);
        System.out.println();

        er.add("William", 9);
        er.add("Ava", 6);
        er.add("James", 9);
        System.out.println("Waiting: " + er);
        System.out.println();

        System.out.println("Serving " + er.serve());
        System.out.println("Serving " + er.serve());
        System.out.println();

        System.out.println("Waiting: " + er);
        System.out.println();

        System.out.println("Serving " + er.serve());
        System.out.println("Serving " + er.serve());
        System.out.println();

        System.out.println("Waiting: " + er);
        System.out.println();
    }

}

class Patient {
    String name;
    int severity;
    int arrival;

    Patient(String name, int severity, int arrival) {
        this.name = name;
        this.severity = severity;
        this.arrival = arrival;
    }

    @Override
    public String toString() {
        return String.format("(%s, %d, %d)", name, severity, arrival);
    }
}

