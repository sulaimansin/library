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
public class Library {
   private String nameLibrary;
   private int idLibrary;
  public static  ArrayList<Library> library = new ArrayList<>();

   public Library(){
       nameLibrary = null;
       idLibrary = 0;
   }
   
   
    public Library(String name, int id) {
        this.nameLibrary = name;
        this.idLibrary = id;
    }
    
    public Library(String name, int id , ArrayList<Library> library ) {
        this.nameLibrary = name;
        this.idLibrary = id;
        this.library = library;
        
    }

    public String getName() {
        return nameLibrary;
    }

    public void setName(String name) {
        this.nameLibrary = name;
    }

    public int getId() {
        return idLibrary;
    }

    public void setId(int id) {
        this.idLibrary = id;
    }

   
    public  String print() {
        return "Library{" + "name=" + nameLibrary + ", id=" + idLibrary + '}'+"\n";
    }
   
   
}
