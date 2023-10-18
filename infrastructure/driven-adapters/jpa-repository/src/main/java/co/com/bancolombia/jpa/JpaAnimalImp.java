package co.com.bancolombia.jpa;

import co.com.bancolombia.model.animal.Animal;
import co.com.bancolombia.model.animal.gateways.AnimalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class JpaAnimalImp implements AnimalRepository {

    private JPARepositoryAdapter jpaRepositoryAdapter;

    @Override
    public void create(Animal animal) {
        jpaRepositoryAdapter.save(animal);
    }

    @Override
    public void update(String name, Animal animal) throws Exception {
        Animal animalDB = jpaRepositoryAdapter.findById(name);

        if (animalDB == null) {
            throw new Exception("El animal " + name + " NO Existe");
        }

        //animalDB.setName(animal.getName());
        animalDB.setStructure(animal.getStructure());
        animalDB.setSpecies(animal.getSpecies());
        animalDB.setHabitat(animal.getHabitat());
        animalDB.setFeeding(animal.getFeeding());
        animalDB.setLegsNumber(animal.getLegsNumber());
        if (animal.isDomestic()) {
            animalDB.setDomestic(true);
        }
        else {
            animalDB.setDomestic(false);
        }

        jpaRepositoryAdapter.save(animalDB);
    }

    @Override
    public void delete(String name) {
        jpaRepositoryAdapter.deleteById(name);
    }

    @Override
    public Animal read(String name) {
        return jpaRepositoryAdapter.findById(name);
    }

    @Override
    public List<Animal> getAll() {
        return jpaRepositoryAdapter.findAll();
    }
}
