public class NotaCarrera {
    Long codCarrera;
    String Carrera;
    Double promedio;

    public Long getCodCarrera() {
        return codCarrera;
    }

    public void setCodCarrera(Long codCarrera) {
        this.codCarrera = codCarrera;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public NotaCarrera() {
    }

    public NotaCarrera(Long codCarrera, String carrera, Double promedio) {
        this.codCarrera = codCarrera;
        Carrera = carrera;
        this.promedio = promedio;
    }
}
