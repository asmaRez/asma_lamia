import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2012-10-30T20:38:10.843+0100")
@StaticMetamodel(Voiture.class)
public class Voiture_ {
	public static volatile SingularAttribute<Voiture, String> matricule;
	public static volatile SingularAttribute<Voiture, String> marque;
	public static volatile SingularAttribute<Voiture, Personne> proprietaire;
}
