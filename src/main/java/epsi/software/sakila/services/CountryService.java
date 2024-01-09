package epsi.software.sakila.services;

import epsi.software.sakila.entities.Country;

import java.util.List;

public interface CountryService {
    Country read(Long id);
    List<Country> readAll();
    Country Create(Country country);
    Country update(Country country);
    boolean delete(Long id);
}
