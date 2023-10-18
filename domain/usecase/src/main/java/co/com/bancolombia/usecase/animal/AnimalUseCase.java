package co.com.bancolombia.usecase.animal;

import co.com.bancolombia.model.animal.Animal;
import co.com.bancolombia.model.animal.gateways.AnimalRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class AnimalUseCase {
    private AnimalRepository animalRepository;

    public void create(Animal animal) {
        animalRepository.create(animal);
    }

    public void update(String name, Animal animal) throws Exception {
        animalRepository.update(name, animal);
    }

    public void delete(String name) {
        animalRepository.delete(name);
    }

    public Animal read(String name) {
        return animalRepository.read(name);
    }

    public List<Animal> getAll() {
        return animalRepository.getAll();
    }
}
