public class EPARGNE extends COMPTE {
private float taux_interet; 

public EPARGNE(int numero, float solde, String devise, ADHERENT titulaire, float taux_interet) {
super(numero, solde, devise, titulaire);
this.taux_interet = taux_interet;
}

public float getTaux_interet() {
return taux_interet;
}

public void setTaux_interet(float taux_interet) {
this.taux_interet = taux_interet;
}
public void ajout_interet()
{
if (super.solde>0)
{
super.solde=super.solde+super.solde*taux_interet ;
}
}
public void DECRIRE()
{
System.out.println("Compte Epargne n°:"+super.numero+" - solde : "+super.solde+" "+super.devise+" - taux =" +taux_interet*100 + "%");
}

}