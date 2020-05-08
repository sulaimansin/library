/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library2;

import java.util.Scanner;

/**
 *
 * @author Sulaiman
 */
public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Book bookObject = null;
        AudioBook audioBookObject = null;
        Scanner in = new Scanner(System.in);
        boolean stope = true;
        while (stope) {
            System.out.println("----------------------------------------");
            System.out.print("Enter 1 to add book \nEnter 2 to add audioBook "
                    + "\nEnter 3 to View all libraries \nEnter 4 to Search libarary \nEnter 5 to delete"
                    + " \nEnter 6 to edit \nEnter 7 to Stope \n");
            System.out.println("----------------------------------------");
            int enter = in.nextInt();

            if (enter == 1) {
                System.out.println("Enter Library name");
                String name = in.next();

                System.out.println("Enter Library ID");
                int ID = in.nextInt();

                System.out.println("Enter Book Title");
                String Title = in.next();

                System.out.println("Enter Book ID");
                String ID2 = in.next();

                System.out.println("Enter Book Author");
                String Author = in.next();

                System.out.println("Enter Book ISBN");
                String ISBN = in.next();

                bookObject = new Book(name, ID, Title, ID2, Author, ISBN);
                Book.book.add(bookObject);

            } else if (enter == 2) {
                System.out.println("Enter Library name");
                String name = in.next();

                System.out.println("Enter Library ID");
                int ID = in.nextInt();

                System.out.println("Enter Book Title");
                String Title = in.next();

                System.out.println("Enter Book ID");
                String ID2 = in.next();

                System.out.println("Enter Book Author");
                String Author = in.next();

                System.out.println("Enter Book ISBN");
                String ISBN = in.next();

                audioBookObject = new AudioBook(name, ID, Title, ID2, Author, Title, ISBN, ISBN);
                AudioBook.audioBook.add(audioBookObject);

            } else if (enter == 3) {

                if (AudioBook.audioBook.isEmpty() && Book.book.isEmpty()) {
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                    System.out.println("There are no library and writing books and Audio Book empty ");
                    System.out.println("--------------------------------------------------");
                    System.out.println();
                }

                System.out.println();
                for (Book BookPrint : Book.book) {
                    System.out.print("Library name :" + BookPrint.getName() + " Library ID :" + BookPrint.getId());
                    System.out.println();

                }

                for (AudioBook AudioBookPrint : AudioBook.audioBook) {
                    System.out.print("Library name :" + AudioBookPrint.getName() + " Library ID :" + AudioBookPrint.getId());
                    System.out.println();
                }

                System.out.println("--------------------------------------");

                for (Book BookPrint : Book.book) {

                    System.out.print(BookPrint.print());

                }

                System.out.println("--------------------------------------");

                for (AudioBook AudioBookPrint : AudioBook.audioBook) {
                    System.out.print(AudioBookPrint.print());
                }

            } else if (enter == 4) {
                System.out.println("Enter Book Title or Enter Book ID or "
                        + "Enter Audiio Book Title or Enter Audiio Book ID");
                String TitleOrId = in.next();
                for (Book book2 : Book.book) {
                    if (book2.getTitle().equals(TitleOrId) || book2.getID().equals(TitleOrId)) {
                        System.out.println("--------------------------------------------");
                        System.out.println("Library name is :" + book2.getName() + " Library ID is :" + book2.getID());

                    }
                }

                for (AudioBook audioBook2 : AudioBook.audioBook) {
                    if (audioBook2.getTitle().equals(TitleOrId) || audioBook2.getID().equals(TitleOrId)) {

                        System.out.println("Library name is :" + audioBook2.getName() + " Library ID is :" + audioBook2.getID());
                        System.out.println("--------------------------------------------");
                    }
                }

            } else if (enter == 5) {
                System.out.println("Enter 1 to delete book  \nEnter 2 to delet book audio ");
                int number = in.nextInt();

                if (number == 1) {
                    System.out.println("Enter book ID");
                    String ID = in.next();

                    for (int i = 0; i < Book.book.size(); i++) {
                        if (Book.book.get(i).getID().equals(ID)) {
                            Book.book.remove(bookObject);
                            System.out.println("Deleted successfully");
                            System.out.println("------------------------------");
                        }

                    }

                } else if (number == 2) {
                    System.out.println("Enter book audio ID");
                    String ID = in.next();

                    for (int i = 0; i < AudioBook.audioBook.size(); i++) {
                        if (AudioBook.audioBook.get(i).getID().equals(ID)) {
                            AudioBook.audioBook.remove(audioBookObject);
                            System.out.println("Deleted successfully");
                            System.out.println("------------------------------");
                        }

                    }
                }

            } else if (enter == 6) {
                System.out.println("Enter 1 to Edit book  \nEnter 2 to Edit book audio ");
                int number = in.nextInt();

                if (number == 1) {
                    System.out.println("Enter book ID");
                    String ID = in.next();

                    for (int i = 0; i < Book.book.size(); i++) {
                        if (Book.book.get(i).getID().equals(ID)) {
                            System.out.println("Enter 1 to edit  Library name \nEnter 2 to edit  Library ID \nEnter 3 to edit  Book Title"
                                    + "\nEnter 4 to edit  Book ID \nEnter 5 to edit  Book Author \nEnter 6 to edit  Book ISBN");
                            int edit = in.nextInt();
                            switch (edit) {
                                case 1:
                                    System.out.println("Enter new Library name");
                                    String name = in.next();
                                    bookObject.setName(name);
                                    break;

                                case 2:
                                    System.out.println("Enter new Library ID");
                                    int IDL = in.nextInt();
                                    bookObject.setId(IDL);
                                    break;

                                case 3:
                                    System.out.println("Enter new Book Title");
                                    String Title = in.next();
                                    bookObject.setTitle(Title);
                                    break;

                                case 4:
                                    System.out.println("Enter new Book ID");
                                    String ID2 = in.next();
                                    bookObject.setID(ID2);
                                    break;

                                case 5:
                                    System.out.println("Enter new Book Author");
                                    String Author = in.next();
                                    bookObject.setAuthor(Author);
                                    break;

                                case 6:
                                    System.out.println("Enter new Book ISBN");
                                    String ISBN = in.next();
                                    bookObject.setISBN(ISBN);
                                    break;

                                default:
                                    System.out.println("Input new Error");
                                    break;

                            }

                        }

                    }

                } else if (number == 2) {
                    System.out.println("Enter book audio ID");
                    String ID = in.next();

                    for (int i = 0; i < AudioBook.audioBook.size(); i++) {
                        if (AudioBook.audioBook.get(i).getID().equals(ID)) {
                            System.out.println("Enter 1 to edit  Library name \nEnter 2 to edit  Library ID \nEnter 3 to edit audio  Book Title"
                                    + "\nEnter 4 to edit  audio Book ID \nEnter 5 to edit  audio Book Author \nEnter 6 to edit  audio Book ISBN");
                            int edit = in.nextInt();
                            switch (edit) {
                                case 1:
                                    System.out.println("Enter new Library name");
                                    String name = in.next();
                                    audioBookObject.setName(name);
                                    break;

                                case 2:
                                    System.out.println("Enter new Library ID");
                                    int IDL = in.nextInt();
                                    audioBookObject.setId(IDL);
                                    break;

                                case 3:
                                    System.out.println("Enter new audio Book Title");
                                    String Title = in.next();
                                    audioBookObject.setTitle(Title);
                                    break;

                                case 4:
                                    System.out.println("Enter new audio Book ID");
                                    String ID2 = in.next();
                                    audioBookObject.setID(ID2);
                                    break;

                                case 5:
                                    System.out.println("Enter new audio Book Author");
                                    String Author = in.next();
                                    audioBookObject.setAuthor(Author);
                                    break;

                                case 6:
                                    System.out.println("Enter new audio Book ISBN");
                                    String ISBN = in.next();
                                    audioBookObject.setISBN(ISBN);
                                    break;

                                default:
                                    System.out.println("Input new Error");
                                    break;

                            }
                        }

                    }

                }

            } else if (enter == 7) {
                stope = false;

            }else{
                System.out.println("Input Error");
            }

        }

    }

}
