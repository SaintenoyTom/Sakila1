package epsi.software.sakila.controller;

import epsi.software.sakila.entities.City;
import epsi.software.sakila.services.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
@RequiredArgsConstructor
public class CityController {
    private final CityService cityService;

    @GetMapping("")
    public List<City> getAll() {
        return cityService.readAll();
    }

    @GetMapping("/{id}")
    public City getById(@PathVariable Long id) {
        return cityService.read(id);
    }
    @GetMapping("/text/{text}")
    public List<City> getByText(@PathVariable String text) {
        return cityService.readWithText(text);
    }
}
