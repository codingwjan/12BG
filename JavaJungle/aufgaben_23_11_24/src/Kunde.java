public class Kunde
{
	private int nummer;
	private String nachname;
	private Kunde nachfolger; //Referenz auf den nachfolgenden Kunden definieren

	public Kunde(int nummer, String nachname)
	{
		this.nummer = nummer;
		this.nachname = nachname;
	}

	public int getNummer()
	{
		return nummer;
	}

	public String getNachname()
	{
		return nachname;
	}

	//Methode gibt Referenz zum Nachfolger zur�ck
	public Kunde getNachfolger()
	{
		return nachfolger;
	}

	//Methode setzt Referenz auf den Nachfolger
	public void setNachfolger (Kunde nachfolger)
	{
		this.nachfolger = nachfolger;
	}
}
