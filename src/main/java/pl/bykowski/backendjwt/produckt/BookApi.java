package pl.bykowski.backendjwt.produckt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
//@CrossOrigin(origins = "localhost:4200")
public class BookApi {

    @GetMapping("/api/books")
    public List<Book> get() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("How to design JWT API", "Horse"));
        bookList.add(new Book("How to not design JWT API", "Doggo"));
        return bookList;
    }
}
