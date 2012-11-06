import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2012-11-06T19:08:56.953+0100")
@StaticMetamodel(Compte.class)
public class Compte_ {
	public static volatile SingularAttribute<Compte, String> rib;
	public static volatile SetAttribute<Compte, CompteCourant> compteCourants;
	public static volatile SetAttribute<Compte, CompteEpargne> compteEpargnes;
	public static volatile SetAttribute<Compte, Transaction> transactions;
}
