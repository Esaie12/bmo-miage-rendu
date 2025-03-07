import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a7cf9bfc-cf1b-4578-9ec5-dfce2e887885")
public class Reservations {
    @objid ("75978dfc-15ea-4c25-a0ac-8134f8ac7592")
    public int id;

    @objid ("3a38ba30-af3c-4ada-86af-9ac6d63b3727")
    public Date dateDebut;

    @objid ("9a754ed1-8578-4d3e-af72-0dc6afa09a60")
    public Date dateFin;

    @objid ("caf5ff15-6703-4b30-a614-597d7b6237ab")
    public List<Prestations>  = new ArrayList<Prestations> ();

    @objid ("3fb90ba0-9a09-49b5-9f99-adc602f7cb75")
    public List<Materiels>  = new ArrayList<Materiels> ();

    @objid ("1e984303-62b9-4f93-a6a1-307f5de1ea28")
    public List<Chambres> chambres = new ArrayList<Chambres> ();

    @objid ("4e80e576-0bcf-4740-af3d-d48ee064b3a1")
    public Users ;

    @objid ("4103c964-fff6-4103-a79e-bd1f6323ea91")
    public Paiements paiements;

    @objid ("a9fdf326-dab8-41b2-81f1-d67e0c31ab96")
    public void modifierReservation() {
    }

    @objid ("5dcb3185-600e-4066-aac1-17293583d245")
    public void annulerReservation() {
    }

}
