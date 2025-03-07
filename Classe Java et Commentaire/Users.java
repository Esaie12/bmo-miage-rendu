import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c708bd7a-04d0-4de0-a9bf-0781ce24753a")
public class Users {
    @objid ("2fd70ba9-ece8-452f-ba14-3216fed22c10")
    public int id;

    @objid ("6212668c-6f94-441d-86ba-36c03d765542")
    public String name;

    @objid ("67202ae1-38dd-4ff3-b409-8efcf21c12be")
    public String email;

    @objid ("987e3bbf-8eea-4246-a815-207dd218f4fd")
    public String password;

    @objid ("8d143c7c-b772-405a-97b0-be13781f1c32")
    public List<Messages>  = new ArrayList<Messages> ();

    @objid ("79b169ef-c59b-4502-a497-101c06063b47")
    public List<Reservations> reservations = new ArrayList<Reservations> ();

    @objid ("06d4707d-086e-40d9-8095-9bfb05fbabdd")
    public void seConnecter() {
    }

    @objid ("6e001b63-ac8c-43d2-a09b-4d4998930021")
    public void reserverResidence() {
    }

    @objid ("50031b3f-27e6-43d1-87e8-20296d222da6")
    public void reserverMateriel() {
    }

    @objid ("1cdbd8df-8209-4ae2-8dfb-45c9833ef53f")
    public void effectuerPaiement() {
    }

    @objid ("032c5790-9885-44a5-bc6b-90ee7c6610c3")
    public void laisserAvis() {
    }

}
