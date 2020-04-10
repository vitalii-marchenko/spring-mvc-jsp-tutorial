package ua.marchenko.springcourse.model;

import java.util.LinkedHashMap;

import lombok.Data;

@Data
public class Student {

    private String firstName;
    private String lastName;
    private String country;

    private String favoriteLanguage;

    private LinkedHashMap<String, String> countryOptions;

    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("US", "USA");
        countryOptions.put("UA", "Ukraine");
    }
}
