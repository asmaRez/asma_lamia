import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2012-10-30T20:38:10.812+0100")
@StaticMetamodel(Personne.class)
public class Personne_ {
	public static volatile SingularAttribute<Personne, Long> idPersonne;
	public static volatile SingularAttribute<Personne, String> nom;
	public static volatile SingularAttribute<Personne, String> prenom;
	public static volatile ListAttribute<Personne, Voiture> voitures;
}
