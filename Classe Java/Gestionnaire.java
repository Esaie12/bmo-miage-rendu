import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("40de1004-55af-4f1a-8da7-02ce9ba0f4c1")
public class Gestionnaire {
    @objid ("e0fcb216-cda3-4d9d-abef-91651b867440")
    public int id;

    @objid ("a2a2c221-246d-4f1e-aaff-fcde2490d4ff")
    public String name;

    @objid ("70d4a34c-ee55-4d70-829f-4ca442af4e9a")
    public String email;

    @objid ("94c6a16d-299d-4363-8c06-8733004514f7")
    public String password;

    @objid ("f78289af-2afa-4ae1-be59-961398066298")
    public List<Residence> residence = new ArrayList<Residence> ();

    @objid ("4bfa271d-d4b1-4ad5-b5db-6a65a61ca5dd")
    public List<Messages> messages = new ArrayList<Messages> ();

}
