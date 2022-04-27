
package entitis;

import enums.Calificacion;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PeliculaoSerie implements Serializable{
    
    @Id
    @Column(name="pleiculaoserie_id")
    private Integer id;
    
    @Id
    @Column (name="imagen")
    private String imagen;
    
    @Id
    @Column (name="titulo")
    private String titulo;
    
    @Id
    @Column (name="fechadecreacion")
    private Date fehcacreacion;
     
    @Id
    @Column (name="calificacion")
    private Calificacion calificacion;
    
    
            
     
    
        
    
    
    
}
