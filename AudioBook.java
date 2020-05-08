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
public class AudioBook extends Library{
 
    private String Title ,ID , Author , Singer ,ISBN ,Year;
    public static  ArrayList<AudioBook> audioBook = new ArrayList<>();

    public AudioBook(String name, int id ,String Title, String ID, String Author, String Singer, String ISBN, String Year) {
        super(name, id);
        this.Title = Title;
        this.ID = ID;
        this.Author = Author;
        this.Singer = Singer;
        this.ISBN = ISBN;
        this.Year = Year;
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

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String Singer) {
        this.Singer = Singer;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    
   
  
    @Override
    public String print() {
        return "AudioBook{" + "Title=" + Title + ", ID=" + ID + ", Author=" + Author + ", Singer=" + Singer + ", ISBN=" + ISBN + ", Year=" + Year + '}'+"\n";
    }
    
    
    
    
}
