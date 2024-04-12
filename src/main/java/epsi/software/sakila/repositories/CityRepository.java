package epsi.software.sakila.repositories;

import epsi.software.sakila.entities.City;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {
    List<City> findByCityContaining(String text);
}
