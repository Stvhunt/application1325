
package demo;

import repository.PersonRepository;
import dao.PersonTestData;

public class App {


    public static void main(String[] args) {
        PersonRepository person = new PersonTestData();
        person.findAll().forEach(System.out::println);
        
    }
}
