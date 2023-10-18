package co.com.bancolombia.model.animal.gateways;

import co.com.bancolombia.model.animal.Animal;
import java.util.List;

public interface AnimalRepository {
    void create(Animal animal);
    default void update(String name, Animal animal) throws Exception {};
    void delete(String name);
    Animal read(String name);
    List<Animal> getAll();

}
