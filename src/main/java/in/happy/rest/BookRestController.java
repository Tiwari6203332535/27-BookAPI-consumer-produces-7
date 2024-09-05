package in.happy.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.happy.binding.Book;

@RestController
public class BookRestController {
	@PostMapping(value="/book",consumes = {"application/xml","application/json"})
	public ResponseEntity<String>addBook(@RequestBody Book b){
		System.out.println(b);
		String msg ="Record saved";
		return  new ResponseEntity<>(msg,HttpStatus.CREATED);
		
	}
	
	@GetMapping(value="/book", produces = {"application/xml","application/json"})
	public Book getBook() {
		Book b = new Book();
		b.setId(101);
		b.setName("java");
		b.setPrice(200.00);
		return b;
		
	}
	

}
