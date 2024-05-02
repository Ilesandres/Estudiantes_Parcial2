import java.util.ArrayList;
import java.util.List;

public class ListNotaCarrera {

    List<Carrera> carreraList=ListaCarrera.carreraList;
    List<Estudiante> estudianteList=ListEstudiante.estudianteList;
    public static List<NotaCarrera> notaCarreraList =new ArrayList<>();



    public ListNotaCarrera(){
        new ArrayList<>();
    }

    public static List<NotaCarrera> getNotaCarreraList() {
        return notaCarreraList;
    }

    public static void setNotaCarreraList(List<NotaCarrera> notaCarreraList) {
        ListNotaCarrera.notaCarreraList = notaCarreraList;
    }

    public void imprimir(){
        for (Estudiante estudiante:estudianteList){
            boolean isList=false;
            for (NotaCarrera notaCarrera:notaCarreraList){
                if(estudiante.getCarrera().equals(notaCarrera.getCodCarrera())){
                    isList=true;
                    break;

                }
            }
            if(!isList){
                for(Carrera carrera:carreraList){
                    if(estudiante.getCarrera().equals(carrera.getCodigo())){
                        agregar(new NotaCarrera(estudiante.getCarrera(),carrera.getNombre(), 0.0));
                    }
                }

            }
        }

        for (Estudiante estudiante:estudianteList){

            for (NotaCarrera notaCarrera:notaCarreraList){

                if(notaCarrera.getCodCarrera()== estudiante.getCarrera()){
                    if(notaCarrera.getPromedio()!=0){
                        double promedio= (notaCarrera.getPromedio()+estudiante.getPromedio())/2;
                        notaCarrera.setPromedio(promedio);
                        break;
                    }else{
                        notaCarrera.setPromedio(estudiante.getPromedio());
                        break;
                    }

                }
            }

    }

        System.out.println("   Carreras   ");
        for (NotaCarrera notaCarrera:notaCarreraList){
            System.out.println(" cod carrera     : "+notaCarrera.getCodCarrera());
            System.out.println(" carrera         :"+notaCarrera.getCarrera());
            System.out.println(" Promedio         : "+notaCarrera.getPromedio());
            System.out.println(" ");
            System.out.println("  ");

        }

    }

    public void agregar(NotaCarrera notaCarrera){
        notaCarreraList.add(notaCarrera);
    }




}
