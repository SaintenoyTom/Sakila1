package epsi.software.sakila.services;

import epsi.software.sakila.entities.City;
import epsi.software.sakila.entities.Country;

import java.util.List;

public interface CityService {
    City read(Long id);
    List<City> readAll();
    City Create(City city);
    City update(City city);
    boolean delete(Long id);
}
