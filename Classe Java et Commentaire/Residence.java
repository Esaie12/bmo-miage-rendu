import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7640a8a0-218c-45db-8bd7-0ba1c553d17d")
public class Residence {
    @objid ("cef60bc0-0601-4c1d-8e52-eaee98537fc9")
    public int id;

    @objid ("8b93c5b3-bbeb-4dda-9eb3-9aca9e42b5e5")
    public String title;

    @objid ("e3d23e78-309d-4a10-a456-9ee3dbcfba5d")
    public Gestionnaire ;

    @mdl.prop
    @objid ("673b0c07-eb66-4c88-8238-86c5dab6fe4a")
    private List<Chambres> chambres = new ArrayList<Chambres> ();

}
