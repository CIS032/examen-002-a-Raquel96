package examenn002;


public class ProfesoresTiempoCompleto extends Profesor{
    
    public int horas_Semanales = 40;

    public ProfesoresTiempoCompleto() {
    }

    public ProfesoresTiempoCompleto(String cedula, String nombre, String apellido, int horasClase, String carrera) {
        super(cedula, nombre, apellido, horasClase, carrera);
    }

    
    public int horasComplementarias(int horas) {

        int h = horas-this.horas_Semanales;
        return h;
    }
    
}
