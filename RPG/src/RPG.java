import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.util.Hashtable;


public class RPG extends JFrame implements ActionListener{

	private JComboBox <String>mainComboBox;
	private JComboBox <String>subComboBoxOne;
	private Hashtable ArchetypeToWeapons = new Hashtable();
	
	ArrayList<Archetype> archetypeList = new ArrayList<Archetype>();
	ArrayList<Weapon> tankWeaponSet = new ArrayList<Weapon>();
	ArrayList<Weapon> mageWeaponSet = new ArrayList<Weapon>();
	
	Archetype tank = new Archetype("Tank");
	Archetype mage = new Archetype("Mage");
	
	Weapon sword = new Weapon("Sword");
	Weapon gun = new Weapon("Gun");
	Weapon wand = new Weapon("Wand");
	Weapon scythe = new Weapon("Scythe");
	
	MapObjRelationship archetypeParent = new MapObjRelationship();


	
	public static void main(String[] args) {
		
		JFrame frame = new RPG();
		frame.setSize(new Dimension(600,600));
		frame.setLayout(new GridLayout(1,1));
        frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setVisible( true );
		
	}
	
	public void gameSetup(){
		
		archetypeList.add(tank);
		archetypeList.add(mage);

		tank.setHealth(200);
		mage.setHealth(100);
	
		
		tankWeaponSet.add(sword);
		tankWeaponSet.add(gun);
		
		mageWeaponSet.add(wand);
		mageWeaponSet.add(sword);
		mageWeaponSet.add(scythe);
		
		
		sword.setDamage(27);
		gun.setDamage(35);
		
		wand.setDamage(12);
		scythe.setDamage(13);
		
		tank.setArrayList(tankWeaponSet);
		mage.setArrayList(mageWeaponSet);
	}
		
	public RPG(){
		
		gameSetup();
		
		String[] archetypeMain = archetypeParent.arrayListToStringArray(archetypeList);
		
		mainComboBox = new JComboBox(archetypeMain);
		mainComboBox.addActionListener( this );
		 
		getContentPane().add( mainComboBox);
		 
		subComboBoxOne = new JComboBox();
		subComboBoxOne.setPrototypeDisplayValue("JERRRRRYYYY");

		getContentPane().add(subComboBoxOne);
		 
		String[] tankToTankWeaponSet = tank.arrayListToStringArray(tankWeaponSet);
		ArchetypeToWeapons.put(archetypeMain[0], tankToTankWeaponSet);
		 
		String[] mageToMageWeaponSet = mage.arrayListToStringArray(mageWeaponSet);
		ArchetypeToWeapons.put(archetypeMain[1], mageToMageWeaponSet);
				 
		mainComboBox.setSelectedIndex(1);
	}
		
	public void actionPerformed(ActionEvent e){
			
		String selectedValue = (String)mainComboBox.getSelectedItem();
		Object temp = ArchetypeToWeapons.get(selectedValue);
			 
		if (temp == null){
				  
			subComboBoxOne.setModel(new DefaultComboBoxModel());
		}
		else{
			subComboBoxOne.setModel( new DefaultComboBoxModel((String[])temp));
		}
	}
	
	/*public void setJBCDependency(int Index, String[] ParentArray, String[] ChildArray){
		
		mainComboBox =  new JComboBox<String>(ParentArray);
		mainComboBox.addActionListener(this);
		
		
		subComboBox = new JComboBox<String>();
        subComboBox.setPrototypeDisplayValue("XXXXXXXXXX");
        
        subItems.put(ParentArray[Index], ChildArray);

	}*/
}
	

