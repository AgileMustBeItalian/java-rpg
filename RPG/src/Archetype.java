public class Archetype extends MapObjRelationship{
	
	int health;
	int strength;
	String name;
	String[] stringArray;
	
	public Archetype(){};
	
	public Archetype(String name){
		this.name = name;
	}

	public void setName(String name){
		
		this.name = name;
	}
	
	public void setHealth(int health ){
		
		this.health = health;
	}
	
	public void setStrength(int maxStrength){
		
		this.strength = maxStrength;
	}
	
	public int getHealth(){
		
		return this.health;
	}
	
	public int getStrength(){
		
		return this.health;
	}
	
	public String getName(){
		
		return name;
	}
}
