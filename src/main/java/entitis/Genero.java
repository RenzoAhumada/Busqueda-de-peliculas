
package entitis;

import enums.Imagen;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genero implements Serializable{
    
    @Id
    @Column (name="genero_id")
    private Integer id;
    
    @Id
    @Column (name="imagen")
    private Imagen imagen;
        
    @Id
    @Column (name="genero_id")
    @OneToMany
    private List<PeliculaoSerie> peliculaoserie;

}
