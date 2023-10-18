package co.com.bancolombia.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "animal")
public class AnimalEntity {
    @Id
    private String name;
    @Column
    private String structure; // Vertebrates and Invertebrates
    @Column private String species; // (Vertebrates) Mammals, Birds, Fish, Reptiles, Amphibians (Invertebrates) Poriferous, Cnidarians (Anemones), Mollusks, Annelids, Arthropods, Echinoderms
    @Column private String habitat; // Terrestrial, Aquatic, Aerial
    @Column private String feeding; //Herbivores, Carnivores, Omnivores
    @Column private Integer legsNumber;
    @Column private boolean domestic; // true, false

}
