import java.util.ArrayList;
import java.util.List;

public class ListaCarrera {

    public static List<Carrera> carreraList;

    public ListaCarrera(){
        carreraList =new ArrayList<>();
    }

    public void añadir (Carrera carrera){
        carreraList.add(carrera);
    }


}
