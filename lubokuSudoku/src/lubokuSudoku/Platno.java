package lubokuSudoku;

public class Platno {
	public void chyba() {
		boolean x = CheckController.check();
		if(x){
			return;
		}
		else{
			//OBARVI, ULOŽ a pak znovu defaultnì a ulož
		}
	}
}
