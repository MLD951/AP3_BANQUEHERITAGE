
import java.util.ArrayList;
import java.util.Date;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ADHERENT ad1;
		
		COMPTE cp1,cp2,cp3;
		ArrayList<COMPTE>  lstcp ;

		lstcp= new ArrayList<COMPTE>();
		ad1 = new ADHERENT("GRAVOUIL","Benjamin",1,"02/05/1977","enseignant","Lycée P.Lapie, bd Briand,92400 COURBEBOIE",
				"01.01.01.01.01","prof.gravouil@gmail.com");
	
		cp1 = new COURANT(1324541132,2548200,"€",ad1,10,25);
		cp2 = new EPARGNE(325447712,1000,"€",ad1,(float)0.05); 	
	    cp3 = new COURANT(225447712,-214,"€",ad1,10,25);

	    lstcp.add(cp1);

	    lstcp.add(cp2);
	    lstcp.add(cp3);
	    ad1.setLstcompte(lstcp);
	    
	    ad1.INFO_COMPTE();
	    
	    
	}

}