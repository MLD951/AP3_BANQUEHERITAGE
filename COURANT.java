public class COURANT extends COMPTE {
private int numCB;
private int Dmax; 

public COURANT(int numero, float solde, String devise, ADHERENT titulaire, int numCB, int dmax) {
super(numero, solde, devise, titulaire);
this.numCB = numCB;
Dmax = dmax;


}

public int getNumCB() {
	return numCB;
}


public void setNumCB(int numCB) {
	this.numCB = numCB;
}


public int getDmax() {
	return Dmax;
}


public void setDmax(int dmax) {
	Dmax = dmax;
}


public void DECRIRE()
{
System.out.println("Compte Courant n°:"+super.numero+" - solde : "+super.solde+" "+super.devise+" numCB : "+numCB+" débitmax :"+Dmax );
}

}