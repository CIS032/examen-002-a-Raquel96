package examenn002;



public class ProfesorTiempoParcial extends Profesor {

    private int horas_Semanales;

    public ProfesorTiempoParcial() {
    }

    public ProfesorTiempoParcial(int horas_Semanales, String cedula, String nombre, String apellido, int horasClase, String carrera) {
        super(cedula, nombre, apellido, horasClase, carrera);
        this.horas_Semanales = horas_Semanales;
    }

    public int getHoras_Semanales() {
        return horas_Semanales;
    }

    public void setHoras_Semanales(int horasSemanales) {
        this.horas_Semanales = horasSemanales;
    }

    public int horasComplementarias(int horas) {

        int h = this.horas_Semanales - horas;
        return h;
    }
    
}
