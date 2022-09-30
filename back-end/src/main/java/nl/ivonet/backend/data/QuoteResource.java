package nl.ivonet.backend.data;

import nl.ivonet.backend.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteResource extends JpaRepository<Quote, Integer> {
}
