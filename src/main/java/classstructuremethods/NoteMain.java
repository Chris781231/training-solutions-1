package classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Note note = new Note();

        System.out.println("Név?");
        note.setName(scanner.nextLine());
        System.out.println("Topik?");
        note.setTopic(scanner.nextLine());
        System.out.println("Jegyzet?");
        note.setText(scanner.nextLine());
        System.out.println(note.getNoteText());

    }
}
