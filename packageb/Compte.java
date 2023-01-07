package packageb;

public class Compte {
  private Personne personne;
	    private double solde;
	   private  String numeroCompte;
	     public Compte(Personne personne, double solde, String numeroCompte) {
	    	 this.personne=personne;
	    	 this.solde=solde;
	    	 this.numeroCompte=numeroCompte;
	    	 
	     }
	     
		public String toString() {
			return "Compte [personne=" + personne + ", solde=" + solde + ", numeroCompte=" + numeroCompte + "]";
		}
		public Personne getPersonne() {
			return personne;
		}
		public void setPersonne(Personne personne) {
			this.personne = personne;
		}
		public String getNumeroCompte() {
			return numeroCompte;
		}
		public void setNumeroCompte(String numeroCompte) {
			this.numeroCompte = numeroCompte;
		}
		public void setSolde(double solde) {
			this.solde = solde;
		}
		public double getSolde () {
	   	 return solde;
	    }
}
