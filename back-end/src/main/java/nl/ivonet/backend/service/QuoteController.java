package nl.ivonet.backend.service;


import lombok.AllArgsConstructor;
import nl.ivonet.backend.data.QuoteResource;
import nl.ivonet.backend.model.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class QuoteController {

    private final QuoteResource quoteResource;

    @GetMapping("/quote")
    public ResponseEntity<List<Quote>> quotes() {
        final List<Quote> all = this.quoteResource.findAll();
        if (all.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return new ResponseEntity<>(all, HttpStatus.OK);
    }

    @GetMapping("/quote/{id}")
    public ResponseEntity<Quote> quote(@PathVariable("id") final Integer id) {
        final Quote quote = this.quoteResource.findById(id).orElse(null);
        if (quote == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return new ResponseEntity<>(quote, HttpStatus.OK);
    }


}
