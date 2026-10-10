// Declare a class called book having author_name as private data member. Extend book 
// class to have two sub classes called book_publication & paper_publication. Each of 
// these classes have private member called title. Write a complete program to show 
// usage of dynamic method dispatch (dynamic polymorphism) to display book or paper 
// publications of given author.

import java.util.*;

public class Lab9B4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the author name: ");
        String authorName = scanner.nextLine();

        System.out.print("Enter the title of the book publication: ");
        String bookTitle = scanner.nextLine();

        System.out.print("Enter the title of the paper publication: ");
        String paperTitle = scanner.nextLine();

        book bookPublication = new book_publication(authorName, bookTitle);
        book paperPublication = new paper_publication(authorName, paperTitle);

        System.out.println("\nDisplaying Publications:");
        displayPublication(bookPublication);
        displayPublication(paperPublication);

        scanner.close();
    }

    static void displayPublication(book publication) {
        publication.display();
    }
}

class book{
    private String author_name;

    book(String author_name) {
        this.author_name = author_name;
    }

    void display() {
        System.out.println("Author: " + author_name);
    }
}

class book_publication extends book {
    private String title;

    book_publication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Book Title: " + title);
    }
}

class paper_publication extends book {
    private String title;

    paper_publication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Paper Title: " + title);
    }
}
