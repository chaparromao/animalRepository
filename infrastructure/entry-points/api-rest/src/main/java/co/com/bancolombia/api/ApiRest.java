package co.com.bancolombia.api;
import co.com.bancolombia.model.animal.Animal;
import co.com.bancolombia.usecase.animal.AnimalUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    //    private final MyUseCase useCase;
    private AnimalUseCase animalUC;

    @PostMapping(path = "/animal")
    public void create(@RequestBody Animal animal) {
        animalUC.create(animal);
    }

    @PutMapping(path = "/animal/{name}")
    private void update(@PathVariable String name, @RequestBody Animal animal) {
        try {
            animalUC.update(name, animal);
        }
        catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @DeleteMapping(path = "/animal/{name}")
    private void delete(@PathVariable String name) {
        animalUC.delete(name);
    }

    @GetMapping(path = "/animal/{name}")
    public Animal read(@PathVariable String name) {
        return animalUC.read(name);
    }

    @GetMapping(path = "/animal")
    private List<Animal> getAll() {
        return animalUC.getAll();
    }
}
