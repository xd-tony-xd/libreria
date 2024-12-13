@Entity
@Table(name = "proveedores")
@Getter
@Setter
public class Proveedores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_proveedor;

    @Column(name = "NOMBRE_PROVEEDOR", nullable = false)
    private String nombre_proveedor;

    @Column(name = "TELEFONO", nullable = false, unique = true)
    private String telefono;

    @Column(name = "CORREO", nullable = false)
    private String correo;

    @Column(name = "DIRECCION", nullable = false)
    private String direccion;  
}
