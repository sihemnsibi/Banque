package packageb;

public class TestBanque {
	public static void main (String [] args) {
		Banque b1 = new Banque();
		Compte compte1,compte2,compte3;
		Adresse adresse1 = new Adresse(123,"xy","fg","kl");
		Personne personne1 = new Personne("nsibi","sihem",adresse1); 
		compte1= new Compte(personne1,12.9,"hej1234567");
		Adresse adresse2 = new Adresse(456,"zt","hj","mn");
		Personne personne2 = new Personne("bannani","asma",adresse2); 
		compte2= new Compte(personne2,15.9,"def1234567");
		Adresse adresse3 = new Adresse(789,"oi","ty","wx");
		Personne personne3 = new Personne("bannani","asma",adresse3); 
		compte3= new Compte(personne3,15.9,"hej1234567");
		b1.ouvrir(compte1);
		b1.ouvrir(compte2);
		b1.ouvrir(compte3);
		b1.cloturer(compte2);
		System.out.println(b1.toString());
		
		}
}
