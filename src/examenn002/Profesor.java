package examenn002;



public abstract class Profesor {
    
    String cedula;
    String nombre;
    String apellido;
    int horasClase;
    String carrera;

    public Profesor() {
    }

    public Profesor(String cedula, String nombre, String apellido, int horasClase, String carrera) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.horasClase = horasClase;
        this.carrera = carrera;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public abstract int horasComplementarias(int a);
}
