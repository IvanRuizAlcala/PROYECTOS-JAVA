package Class;

public class conductor extends personas {
	int antiguedadcarnet;

	
	public conductor(String nombre, String primerApellido, String segundoApellido, int antiguedadcarnet) {
		super(nombre, primerApellido, segundoApellido);
		this.antiguedadcarnet = antiguedadcarnet;
	}

	

	/**
	 * @return the antiguedadcarnet
	 */
	public int getAntiguedadcarnet() {
		return antiguedadcarnet;
	}

	/**
	 * @param antiguedadcarnet the antiguedadcarnet to set
	 */
	public void setAntiguedadcarnet(int antiguedadcarnet) {
		this.antiguedadcarnet = antiguedadcarnet;
	}

	@Override
	public String toString() {
		return super.toString()+"conductor [antiguedadcarnet=" + antiguedadcarnet + "]";
	}
	

}
