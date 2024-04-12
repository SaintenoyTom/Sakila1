package epsi.software.sakila.controller;

import epsi.software.sakila.entities.Country;
import epsi.software.sakila.services.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/country")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping("")
    public List<Country> getAll(@RequestParam(name = "id", required = false) Long id) {
        return countryService.readAll();
    }

    @GetMapping("/{id}")
    public Country getById(@PathVariable Long id) {
        return countryService.read(id);
    }
}
