package bezahlung;

public class Startklasse {

	public static void main(String[] args) 
	{
		Mitarbeiter mitarb1;
		mitarb1 = new Mitarbeiter();
		
		mitarb1.setname("Maier");
		mitarb1.setvorname("Hans");
		mitarb1.setgehalt(2000);
		mitarb1.setkinder(2);
		
		Mitarbeiter mitarb2;
		mitarb2 = new Mitarbeiter();
		
		mitarb2.setname("Neumann");
		mitarb2.setvorname("Uta");
		mitarb2.setgehalt(2900);
		mitarb2.setkinder(4);
		
		System.out.println("Die Gehaltserhöhhung von Mitarbeiter "+ mitarb1.name + " beträgt: " + mitarb1.erhoeheGehalt()+"€");
		System.out.println("Die Gehaltserhöhhung von Mitarbeiter "+ mitarb2.name + " beträgt: " + mitarb2.erhoeheGehalt()+"€");
		

	}

}
