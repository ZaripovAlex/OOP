package view;


import controller.Controller;
import model.Notes;

import java.util.List;
import java.util.Scanner;

public class View {

    private final Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void run() {
        Commands com;

        while (true) {
            System.out.println("---");
            System.out.println("Для работы с программой Вам необходимо ввести: ");
            System.out.println("---");
            System.out.println("CREATE для создания заметки.");
            System.out.println("READ для чтения заметки. ");
            System.out.println("LIST для получение списка заметок.");
            System.out.println("UPDATE для обновления заметки.");
            System.out.println("DELETE для удаления заметки");
            System.out.println("---");
            String command = prompt("Введите команду: ");

            try {
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        createNote();
                        break;
                    case READ:
                        readNote();
                        break;
                    case LIST:
                        listNote();
                        break;
                    case UPDATE:
                        updateNote();
                        break;
                    case DELETE:
                        deleteNote();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void deleteNote() throws Exception {
        String userId = prompt("Введите ID, который необходио удалить: ");
        controller.deleteNote(userId);
    }

    private void updateNote() throws Exception {
        String readId = prompt("Введиет редактируемый ID: ");
        controller.updateUser(readId,inputNote());
    }

    private void listNote() {
        List<Notes> listNotes = controller.readAllNotes();
        for (Notes note : listNotes) {
            System.out.println(note + "\n");
        }
    }

    private void readNote() throws Exception {
        String id = prompt("Идентификатор: ");

        Notes user = controller.readNote(id);
        System.out.println(user);

    }

    private Notes inputNote() {
        String type = prompt("Тип: ");
        String text = prompt("Текст: ");
        return new Notes(type,text);
    }

    private void createNote() throws Exception {
        controller.saveNote(inputNote());
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
