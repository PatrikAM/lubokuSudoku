package lubokuSudoku;

public class Platno {
	public void chyba() {
		boolean x = CheckController.check();
		if(x){
			return;
		}
		else{
			//OBARVI, ULO� a pak znovu defaultn� a ulo�
		}
	}
}
