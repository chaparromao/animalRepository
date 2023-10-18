package co.com.bancolombia.model.animal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    private String name;
    private String structure; // Vertebrates and Invertebrates
    private String species; // (Vertebrates) Mammals, Birds, Fish, Reptiles, Amphibians (Invertebrates) Poriferous, Cnidarians (Anemones), Mollusks, Annelids, Arthropods, Echinoderms
    private String habitat; // Terrestrial, Aquatic, Aerial
    private String feeding; //Herbivores, Carnivores, Omnivores
    private Integer legsNumber;
    private boolean domestic; // true, false

}
