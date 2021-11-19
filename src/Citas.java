import org.hibernate.type.descriptor.sql.NVarcharTypeDescriptor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Citas")

public class Citas {

    @javax.persistence.idCita
    @Column(name = "idCita", nullable = false)


    private int idCita;

    @Column(name = "HoraCita", nullable = false)

    private NVarchar HoraCita;

    @Column(name = "FechaCita", nullable = false)

    private Date FechaCita;

    @Column(name = "IdPaciente", nullable = false)

    private int IdPaciente;

    @Column(name = "IdDoctor", nullable = false)

    private int IdDoctor;

    @Column(name = "Concultorio", nullable = false)

    private int Consultorio;

    @Column(name = "Motivo", nullable = false)

    private NVarchar Motivo;
    

    public Citas() {
    }


    public Citas(int idCita, NVarchar HoraCita, Date FechaCita, int IdPaciente, int IdDoctor, int Consultorio, NVarchar Motivo) {
        this.idCita = idCita;
        this.HoraCita = HoraCita;
        this.FechaCita = FechaCita;
        this.IdPaciente = IdPaciente;
        this.IdDoctor = IdDoctor;
        this.Consultorio = Consultorio;
        this.Motivo = Motivo;
    }


    public int getIdCita() {
        return this.idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public NVarchar getHoraCita() {
        return this.HoraCita;
    }

    public void setHoraCita(NVarchar HoraCita) {
        this.HoraCita = HoraCita;
    }

    public Date getFechaCita() {
        return this.FechaCita;
    }

    public void setFechaCita(Date FechaCita) {
        this.FechaCita = FechaCita;
    }

    public int getIdPaciente() {
        return this.IdPaciente;
    }

    public void setIdPaciente(int IdPaciente) {
        this.IdPaciente = IdPaciente;
    }

    public int getIdDoctor() {
        return this.IdDoctor;
    }

    public void setIdDoctor(int IdDoctor) {
        this.IdDoctor = IdDoctor;
    }

    public int getConsultorio() {
        return this.Consultorio;
    }

    public void setConsultorio(int Consultorio) {
        this.Consultorio = Consultorio;
    }

    public NVarchar getMotivo() {
        return this.Motivo;
    }

    public void setMotivo(NVarchar Motivo) {
        this.Motivo = Motivo;
    }




}
