package packageb;

public class Banque {
	 private Compte [] banque = new Compte[1000];
	private int nbCompte=0;
	public void ouvrir (Compte unCompte ) {
		for(int i=0;i<banque.length;i++) {
			if(banque[i].getNumeroCompte()== unCompte.getNumeroCompte()) {
				System.out.println("Compte existe déja");
				break;
			}
		if (i>=banque.length) {
			banque[nbCompte]=unCompte;
			nbCompte++;
			
		}
			
		}
		
	}
	public void cloturer (Compte unCompte) {
		for(int i=0; i<banque.length;i++) {
			if(banque[i].getNumeroCompte()== unCompte.getNumeroCompte()) {
				for (int j=i;j<banque.length;i++) {
					banque[j]=banque[j+1];
				 nbCompte--;
					
				}
				break;
			}
		}
		
	
	}
	public String toString() {
		String ch=" ";
		for (int i=0 ; i<=nbCompte;i++) {
			ch += banque[i].toString();
		}
		return ch;
	}
	public int getNbCompte() {
		return nbCompte;
	}

}
