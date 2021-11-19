import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@requestMapping
public class Controlador {
@Autowired
    private IUsuarioService ServiceUsuario;

    public String listar(Model model){
        service.listar();
        return "index";
    }
}
