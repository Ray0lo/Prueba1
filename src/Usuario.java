import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Usuarios")

public class Usuario {
@javax.persistence.Id
@Column(name = "id", nullable = false)

    private Long  id;
    @Column(name = "username", nullable = false)

    private String username;

    @Column(name = "pwd", nullable = false)
    private String password;

    @Column(name = "token", nullable = true)
    private String token;


    public usuario(){

    }



    public Usuario(Long id, String username, String password, String token) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.token = token;
    }

    

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }
