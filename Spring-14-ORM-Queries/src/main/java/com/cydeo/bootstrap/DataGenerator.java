package com.cydeo.bootstrap;

import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;

    public DataGenerator(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("---------------------Region Start---------------------");

        System.out.println("findByCountry: " + regionRepository.findByCountry("Canada"));
        System.out.println("findDistinctByCountry: "+ regionRepository.findDistinctByCountry("Canada"));
        System.out.println("findByCountryContaining: "+ regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainingOrderByCountry: "+ regionRepository.findByCountryContainingOrderByCountry("Asia"));
        System.out.println("findTopByCountry: "+ regionRepository.findTop2ByCountry("Canada"));

        System.out.println("---------------------Region End---------------------");



    }
}
