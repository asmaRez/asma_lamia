package tn.com.isamm.projet.banque.main;


import java.lang.String.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author Michael
 */
public class MailTest {

    String to;
    String subject;
    String body;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    String mailHost = "smtp.planet.tn";
    String from = "zouaghi.lamia@planet.tn";
    String site = "www.cynapsys.de";

    public void SendMail(String to, String subject, String body) {
        try {


            //Get system properties
            Properties props = System.getProperties();

            //Specify the desired SMTP server
            props.put("mail.smtp.host", mailHost);

            // create a new Session object
            Session session = Session.getInstance(props, null);

            // create a new MimeMessage object (using the Session created above)
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, new InternetAddress[]{new InternetAddress(to)});
            message.setSubject(subject);
            message.setContent(body, "text/plain");
            System.out.println("message construit et prêt à envoyer");
            Transport.send(message);

            // it worked!
            System.out.println("Thank you.  Your message to " + to + " was successfully sent.");
            //UtilisateurInsertion.setUtilisateur(login, nom, prenom, tel, email, pwd, adresse);

        } catch (Throwable t) {

            System.out.println("<b>Unable to send message: <br><pre>");


        }

    }
    
    public static void main(String[] args) {
    	
    	MailTest test = new MailTest();
    	test.SendMail("zouaghi.lamia@gmail.com", "test", "test");
    	
    }
}
