
public class Weapon extends MapObjRelationship{
	
	String name;
	int damage;
	
	public Weapon(){}
	
	public Weapon(String name){
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setDamage(int damage){
		this.damage = damage;
	}
	
	public int getDamange(){
		return damage;
	}
	
	public String getName(){
		return name;
	}
}
