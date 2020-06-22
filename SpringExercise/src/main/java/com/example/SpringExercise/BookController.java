package com.example.SpringExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

   @PostMapping("/saveBook")
    public Book saveBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }


    @PutMapping("/update/{id}/{pages}")
    public String updatePages(@PathVariable int id,@PathVariable int pages){
        Book book=bookRepository.findById(id).get();
        book.setPages(pages);
        bookRepository.save(book);
        return "Book updated";
    }

    @DeleteMapping("/delete/{id}")
    public  String deleteBook(@PathVariable int id){
        bookRepository.deleteById(id);
        return "deleted";
    }

    @GetMapping("/getInfo/{id}")
    public void getInfo(@PathVariable int id){
        System.out.println(bookRepository.findLastChangeRevision(id));
    }

}
