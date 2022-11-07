

abstract class COMPTE {
	protected int numero;
	protected float solde;
	protected String devise;
	protected ADHERENT titulaire;
	
	public COMPTE(int numero, float solde, String devise, ADHERENT titulaire) {
		super();
		this.numero = numero;
		this.solde = solde;
		this.devise = devise;
		this.titulaire = titulaire;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}

	public ADHERENT getTitulaire() {
		return titulaire;
	}

	public void setTitulaire(ADHERENT titulaire) {
		this.titulaire = titulaire;
	}
	
	public void DECRIRE()
	{
		System.out.println("n° : "+numero+" - solde :"+solde+" "+devise);
	}
	
	
	
}