package universite;

public class Contact {
    String nom;
    String mail;
    String tel;
    public Contact(){
    }
    public Contact(String Nom, String Mail,String Tel) {
        nom=Nom;
        mail=Mail;
        tel=Tel;
    }
    public String getnom() {
        return nom;
    }
    public String getmail() {
        return mail;
    }
    public String gettel() {
        return tel;
    }
    public void setMail(String mail){
        this.mail=mail;
    }
    public void setTel(String tel){
        this.tel=tel;
    }
    public String toString() {
        return "[Le nom est : " + nom + "\nle numéro est : " + tel + "\nle mail est : " + mail + "]";
    }
}
