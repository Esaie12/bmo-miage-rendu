import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0f821668-7965-4a9e-b41a-f339d976e002")
public class Chambres {
    @objid ("4a2acfac-092a-4c51-a9f0-1b7459cf1fed")
    public int id;

    @objid ("d012cc58-1376-4d47-9e20-fa7bed6fa838")
    public String title;

    @objid ("97f12807-6783-4af8-8a44-db8f8de34d12")
    public Residence ;

    @objid ("48b65a30-a87c-4309-be44-da9e7600966d")
    public List<Disponibilités> disponibilités = new ArrayList<Disponibilités> ();

    @objid ("8f63cdd1-b944-4a57-998c-e5d49ae95636")
    public Reservations ;

    @objid ("c7000400-b81b-4fad-9b09-8dceac68d6b8")
    public List<Avis> avis = new ArrayList<Avis> ();

}
