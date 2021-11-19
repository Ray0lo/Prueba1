import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuario data;



    @Override
    public List<Usuario> listar(){

        return (List<Usuario>) data.findAll();

    }
    @Override 
    public Optional<Usuario> listarId(long id){
        return Optional.empty();
    }

    @Override
    public long save(Usuario u){
        return 0;

    }

    @Override
    public void delete(long id){

    }
}
