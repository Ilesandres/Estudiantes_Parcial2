import java.util.ArrayList;
import java.util.List;

public class ListEstudiante {

    public static List<Estudiante> estudianteList;

    public  ListEstudiante(){
        estudianteList=new ArrayList<>();


    }

    public void imprimirestudiantes(){
        System.out.println("   ESTUDIANTES  ");
        for(Estudiante estudiante: estudianteList){
            System.out.println(" nombre       : "+estudiante.nombre);
            System.out.println(" Edad         : "+estudiante.edad);
            System.out.println(" carrera      : "+estudiante.carrera);
            System.out.println(" Promedio     : "+estudiante.promedio);
            System.out.println(" ");
        }
    }

    public void añadir(Estudiante estudiante){
        estudianteList.add(estudiante);
    }


}
