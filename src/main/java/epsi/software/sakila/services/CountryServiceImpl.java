package epsi.software.sakila.services;

import epsi.software.sakila.entities.Country;
import epsi.software.sakila.repositories.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{

    private CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Country read(Long id) {
        return countryRepository.findById(id).orElse(null);
    }

    @Override
    public List<Country> readAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country Create(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country update(Country country) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
