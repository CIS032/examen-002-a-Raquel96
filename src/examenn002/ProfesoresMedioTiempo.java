package examenn002;


public class ProfesoresMedioTiempo extends  Profesor{
    
    public final int  horas_Semanales = 20; 

    public ProfesoresMedioTiempo() {
    }

    public ProfesoresMedioTiempo(String cedula, String nombre, String apellido, int horasClase, String carrera) {
        super(cedula, nombre, apellido, horasClase, carrera);
    }
    
    public int horasComplementarias(int horas) {

        int h = 40 - this.horas_Semanales;
        return h;
    }
    
    
}
