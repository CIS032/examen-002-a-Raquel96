package examenn002;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaProfesores {

    ArrayList<Profesor> profesores = new ArrayList();

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void agregar(Profesor profesor) {
        this.profesores.add(profesor);
    }

    public void grabar() {
        String nombrearc=JOptionPane.showInputDialog(null,"Ingrese el nombre del archivo");
        try {
            String[] formatos = {
            ".txt",
            ".csv",
            ".doc"
          };
             String resp = (String) JOptionPane.showInputDialog(null, "Seleccione un  formato", "Archivo", JOptionPane.DEFAULT_OPTION, null, formatos, formatos[0]);

            FileWriter fw = new FileWriter(new File(nombrearc+resp));
            PrintWriter pw = new PrintWriter(fw, true);
            for (Profesor profesor : profesores) {
                if (profesor instanceof ProfesorTiempoParcial) {
                    ProfesorTiempoParcial p = (ProfesorTiempoParcial) profesor;
                    String cadena=p.getCedula() + ";" + p.getNombre() + ";" + p.getApellido() + ";" + "Profesor de Tiempo Parcial " + ";" + p.getHorasClase() + ";"+p.horasComplementarias(p.getHorasClase());
                    pw.println(cadena);
                }
                if (profesor instanceof ProfesoresMedioTiempo) {
                    ProfesoresMedioTiempo p = (ProfesoresMedioTiempo) profesor;
                   String cadena=p.getCedula() + ";" + p.getNombre() + ";" + p.getApellido() + ";" + "Profesor de Medio Tiempo " + ";" + p.getHorasClase() + ";"+p.horasComplementarias(p.getHorasClase());
                    pw.println(cadena);
                }
                if (profesor instanceof ProfesoresTiempoCompleto) {
                    ProfesoresTiempoCompleto p = (ProfesoresTiempoCompleto) profesor;
                    String cadena= p.getCedula() + ";" + p.getNombre() + ";" + p.getApellido() + ";" + "Profesor de Tiempo Completo " + ";" + p.getHorasClase() + ";"+p.horasComplementarias(p.getHorasClase());
                    pw.println(cadena);
                }
            }
            pw.close();
        } catch (Exception e) {
        }
    }

    
    public static String leer(){
        String nombrearc=JOptionPane.showInputDialog(null,"Ingrese el nombre del archivo y su formato");
        
             
        String temp = "";
        String aux;
        try {
            BufferedReader leer = new BufferedReader(new FileReader(nombrearc));
            while ((aux = leer.readLine()) != null) {
                temp += aux + "\n";
            }
            System.out.println("Figuras:\n" + temp);
            
        } catch (Exception e) {
        }
        return temp;
    }
}
