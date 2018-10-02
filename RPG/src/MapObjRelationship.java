import java.util.ArrayList;


public class MapObjRelationship<T> {
	
	ArrayList<T> arrayList = new ArrayList<T>();
	String[] arrayListToString;
	
	public void setArrayList(ArrayList<T> arrayList){
		
		this.arrayList = arrayList;
	}
	
	public ArrayList<T> getArrayList(){
		
		return arrayList;
	}
	public String[] arrayListToStringArray(ArrayList<T> arrayList) {
		
		arrayListToString = new String[arrayList.size()];

		Object[] objArr = arrayList.toArray();
		System.out.println(arrayList.toString());
		
		if(arrayList.toString().contains("Archetype")) {
			
			for(int i = 0; i < arrayList.size(); i++) {
				
				arrayListToString[i] = ((Archetype) arrayList.get(i)).getName();
			}
		}
		else if(arrayList.toString().contains("Weapon")) {
			
			for(int i = 0; i < arrayList.size(); i++) {
				
				arrayListToString[i] = ((Weapon) arrayList.get(i)).getName();
			}
		}
		return arrayListToString;
	}
	
	public void setStringArray(String[] arrayListToString){
		
		this.arrayListToString = new String[arrayListToString.length];
		
		for(int i = 0; i < arrayListToString.length; i++) {
			this.arrayListToString[i] = arrayListToString[i];
		}
	}
	public String[] getStringArray(){
		
		return arrayListToString;
	}
}
