package Class;

	import java.util.HashMap;
	import java.util.Iterator;
	public class Producto {
	 private String codigo;
	 private String descripcion;
	 private HashMap <String, Integer> hashDatos = new HashMap();

	 public Producto(String [] datos) {
	 codigo= datos[0];
	 descripcion = datos[1];

	 for (int j = 2; j < datos.length-1; j+=2) {
	 String anio = datos[j];
	 Integer unid = Integer.parseInt(datos[j+1]);
	 hashDatos.put(anio, unid);
	 }
	 }

	 public int getSumaUnidadesVendidas(){
	 int suma=0;
	 Iterator iter = hashDatos.keySet().iterator();
	 while (iter.hasNext()){
	 String clave = (String) iter.next();
	 Integer valor = hashDatos.get(clave);
	 suma+=valor;
	 }
	 return suma;
	 }

	 public String getCodigo() {
	 return codigo;
	 }
	 public void setCodigo(String codigo) {
	 this.codigo = codigo;
	 }
	 public String getDescripcion() {
	 return descripcion;
	 }
	 public void setDescripcion(String descripcion) {
	 this.descripcion = descripcion;
	 }
	 private String getAnios(){
	 String cadena="";
	 Iterator iter = hashDatos.keySet().iterator();
	 while (iter.hasNext()){
	 String clave = (String)iter.next();
	 cadena = cadena.concat("-");
	 cadena = cadena.concat(clave);
	 }
	 return cadena;
	 }

	 private String getUnidades(){
	 String cadena="";
	 Iterator iter = hashDatos.keySet().iterator();
	 while (iter.hasNext()){
	 String clave = (String) iter.next();
	 Integer valor = hashDatos.get(clave);
	 cadena = cadena.concat("-");
	 cadena = cadena.concat(Integer.toString(valor));
	 }
	 return cadena;
	 }
	 @Override
	 public String toString() {
	 return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", anios=" +
	this.getAnios() + ", unidades=" + this.getUnidades() + '}';
	 }
	 public HashMap <String, Integer> getHashDatos() {
	 return hashDatos;
	 }

	 public Integer getUnidadesByAnio (String anio){
	 return hashDatos.get(anio);
	 }
	}

