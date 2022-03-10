package czw.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cors")
public class CorsController {
    @PostMapping("/book")
//    @CrossOrigin(value = "https://localhost:8082",maxAge = 60*30,allowedHeaders = "*")
    public String addBook(String name){
     return "receive" + name;
    }
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id){
        return String.valueOf(id);
    }
}
