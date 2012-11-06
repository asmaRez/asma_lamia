import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2012-11-06T19:08:57.046+0100")
@StaticMetamodel(Personnel.class)
public class Personnel_ {
	public static volatile SingularAttribute<Personnel, String> login;
	public static volatile SingularAttribute<Personnel, Integer> cin;
	public static volatile SingularAttribute<Personnel, String> mail;
	public static volatile SingularAttribute<Personnel, String> nom;
	public static volatile SingularAttribute<Personnel, String> prenom;
	public static volatile SingularAttribute<Personnel, String> pwd;
	public static volatile SingularAttribute<Personnel, String> tel;
	public static volatile SetAttribute<Personnel, Administrateur> administrateurs;
	public static volatile SetAttribute<Personnel, Client> clients;
}
