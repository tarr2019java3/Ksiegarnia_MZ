package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Author author = new Author ("klakier", "kot");
        Author author1 = new Author ("pies", "burek");
        Category category = new Category ("kot");
        Category category1 = new Category ("pies");

    Book book = new Book ("klasa",author, category);
    Book book1 = new Book("sda", author1, category);
    Book book2 = new Book("niedziela", author, category1);
    Book book3 = new Book("odi", author1, category1);

        List<Book> listaKsiazek = new ArrayList<> ();
        listaKsiazek.add(book);
        listaKsiazek.add(book1);
        listaKsiazek.add(book2);
        listaKsiazek.add(book3);

        ObjectMapper objectMapper = new ObjectMapper ();
        try {
            objectMapper.writeValue (new File ("lista.json"), listaKsiazek);
            objectMapper.writeValue (new File ("book.json"), book);
            objectMapper.writeValue (new File ("book1.json"), book1);
            objectMapper.writeValue (new File ("book2.json"), book2);
            objectMapper.writeValue (new File ("book3.json"), book3);
        } catch (IOException e) {
            e.printStackTrace ( );
        }

    }

}
