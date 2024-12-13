import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "facturas")
@Getter
@Setter
public class Facturas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_factura;

    @Column(name = "NOMBRE_PROVEEDOR", nullable = false)
    private String id_usuario;

    @Column(name = "TELEFONO", nullable = false, unique = true)
    private String fecha_factura; 
}
