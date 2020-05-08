/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library2;

import java.util.ArrayList;

/**
 *
 * @author Sulaiman
 */
public class Book extends Library{
  private String Title , ID , Author ,ISBN;
      public static  ArrayList<Book> book = new ArrayList<>();

 
    public Book(){
        
        Title = null;
        ID= null;
        Author =null;
        ISBN = null;  
    }

    public Book(String Title, String ID, String Author, String ISBN) {
        this.Title = Title;
        this.ID = ID;
        this.Author = Author;
        this.ISBN = ISBN;
    }

  

    public Book(String name, int id ,String Title, String ID, String Author, String ISBN) {
        super(name, id);
        this.Title = Title;
        this.ID = ID;
        this.Author = Author;
        this.ISBN = ISBN;
    }

  
    public String getTitle() {
        return Title;
    }


    public void setTitle(String Title) {
        this.Title = Title;
    }

 
    public String getID() {
        return ID;
    }

  
    public void setID(String ID) {
        this.ID = ID;
    }


    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }


    public String getISBN() {
        return ISBN;
    }

  
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

   

  @Override
    public String print() {
        return "Book{" + "Title=" + Title + ", ID=" + ID + ", Author=" + Author + ", ISBN=" + ISBN + '}'+"\n";
    }

   
    public String Read() {
        return "Book{" + "Author=" + Author + '}'+"\n";
    }
    
    
 
    
}
