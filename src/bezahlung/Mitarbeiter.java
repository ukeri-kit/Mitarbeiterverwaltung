package bezahlung;

public class Mitarbeiter 
{
	//Aufgabe 1 Attribute erstellen
	public String name;
	public String vorname;
	public int kinder;
	public double gehalt;
	public double erhoehegehalt;
	
	// Aufgabe 1 alle set mehtoden erstellen
	public void setname (String name)
	{
		this.name = name;
	}
	public void setvorname(String vorname)
	{
		this.vorname = vorname;
	}
	public void setkinder(int kinder)
	{
		this.kinder = kinder;
	}
	public void setgehalt(double gehalt)
	{
		this.gehalt = gehalt;
	}
	
	//Aufgabe 1 alle get methoden erstellen
	public String getname()
	{
		return name;
	}
	public String getvorname()
	{
		return vorname;
	}
	public int getkinder()
	{
		return kinder;
	}
	public double getgehalt()
	{
		return gehalt;
	}
	//Aufgabe2 eigene Methode
	public double erhoeheGehalt()
	{
		gehalt = (gehalt * 0.025);
		if (kinder >2)
		{
			gehalt = gehalt + 40 + 30 + ((kinder-2) * 25);
		}
		else {if (kinder == 2)
		{
			gehalt = gehalt + 40 +30;
		}
		else {if (kinder == 1)
		{
			gehalt = gehalt + 40;
		}
		else { if (kinder <= 0)
		{
			
		}
		}
		}
		}return gehalt;
		}
		
		

	}
	