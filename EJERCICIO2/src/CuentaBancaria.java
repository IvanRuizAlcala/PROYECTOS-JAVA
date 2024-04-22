
public class CuentaBancaria {
Cliente cliente;
double saldo;
String numeroDeCuenta;
public CuentaBancaria(Cliente cliente, double saldo, String numeroDeCuenta) {
	super();
	this.cliente = cliente;
	this.saldo = saldo;
	this.numeroDeCuenta = numeroDeCuenta;
}
/**
 * @return the cliente
 */
public Cliente getCliente() {
	return cliente;
}
/**
 * @param cliente the cliente to set
 */
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
/**
 * @return the saldo
 */
public double getSaldo() {
	return saldo;
}
/**
 * @param saldo the saldo to set
 */
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
/**
 * @return the numeroDeCuenta
 */
public String getNumeroDeCuenta() {
	return numeroDeCuenta;
}
/**
 * @param numeroDeCuenta the numeroDeCuenta to set
 */
public void setNumeroDeCuenta(String numeroDeCuenta) {
	this.numeroDeCuenta = numeroDeCuenta;
}
@Override
public String toString() {
	return "CuentaBancaria [cliente=" + cliente + ", saldo=" + saldo + ", numeroDeCuenta=" + numeroDeCuenta + "]";
}
public void depositar(double cantidadSolicitadaUsuario) {
	saldo=saldo+cantidadSolicitadaUsuario;
}
public boolean transferencia(double cantidadElegidaPorUsuario, CuentaBancaria numeroDeCuentaElegidaPorUsuario) {
if(cantidadElegidaPorUsuario < saldo) {
	saldo = cantidadElegidaPorUsuario - saldo;
	numeroDeCuentaElegidaPorUsuario.saldo = cantidadElegidaPorUsuario + numeroDeCuentaElegidaPorUsuario.saldo;
	System.out.println(" su operacion se ha realizado correctamente");
	return true;
}
else {
	System.out.println(" su operacion no pudo realizarse por falta de saldo");
	return false;
}
}
}
