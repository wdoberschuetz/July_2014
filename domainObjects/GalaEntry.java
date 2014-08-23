package domainObjects;



public class GalaEntry {

	private static int id;
	private int entryId;
	private Swimmer swimmer;
	private Gala gala;
	
	public GalaEntry(){
		
		id++;
		setEntryId(entryId);
		new Swimmer();
		// some validation?
	}
	
	public void setEntryId(int entryId){
		this.entryId = entryId;
	}
	public int getEntryId(){
		return entryId;
	}
	
}
