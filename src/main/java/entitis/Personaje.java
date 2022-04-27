
package entitis;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Personaje implements Serializable{
    
    private static final long serialVersionUID = -4592600819270861934L;
    @Id
    @Column (name ="personaje_id", nullable = false)
    private Integer id;
    
    @Id
    @Column (name ="nombre", nullable = false)
    private String nombre;
    
      @Id
    @Column (name ="edad", nullable = false)
      private int edad;
      
        @Id
    @Column (name ="peso", nullable = false)
        private Integer peso;
      
        @Id
    @Column (name ="historia", nullable = false)
        private String historia;
      
    @Id
    @Column (name ="peliculasoseriesasociadas", nullable = false)
    @OneToMany
    private List<PeliculaoSerie> peliculaoseroies;
    
    
}
