public class Carrera {

    Long codigo;
    String nombre;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carrera() {
    }

    public Carrera(Long codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
}
