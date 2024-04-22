package productos;

import java.time.LocalDate;

public class ColeccionProductos {
	Producto [] listaP;

    public ColeccionProductos(int numeroProductos) {
        listaP=new Producto[numeroProductos];
        
        for (int i = 0; i < listaP.length; i++) {
            String id= "00000" + i;
            String descripcion = "Producto-" + i;
            LocalDate fechaC = LocalDate.of(2020, 3, 3);
            int lote = 123422*i;
            int tipo = (int) (Math.random()*3);
            switch (tipo) {
                case 0:
                    //Congelado
                    double tempC = -5.0 * i;
                    listaP[i] = new Congelado(tempC, id, descripcion, fechaC, lote);
                    break;
                case 1:
                    //Refrigerado
                    String codigo = "ABC-"+i;
                    listaP[i] = new Refrigerado(codigo, id, descripcion, fechaC, lote);
                    break;
                case 2:
                    //Fresco
                    LocalDate fechaE = LocalDate.now();
                    fechaE.minusDays(5);
                    String [] paises = {"Espa�a", "Italia", "Marruecos", "Argelia", "Francia"};
                    String paisO = paises[(int)(Math.random()*5)];
                    listaP[i] = new Fresco(fechaE, paisO, id, descripcion, fechaC, lote);
                   
            }
        }
        //Hago caducar el primer producto
        listaP[0].setFechaCad(LocalDate.now().minusDays(5));
    }
    
    //retornar array de productos
    public Producto [] getProductos(){
		return listaP;

    }
    
    
    //modificar T� de congelacion de un producto buscando por su id
    public boolean modificarTemperaturaCongelacion(String id, double temp){
    	for (int i = 0; i < listaP.length; i++) {
    			if(listaP[i] instanceof Congelado && id== listaP[i].getIdProducto()) {
    				((Congelado)listaP[i]).setTemperaturaCon(temp);;
    				return true;
    		}
			
		}
    		return false;
    	
		
    
    }  
    //retornar array de frescos de un pa�s concreto
    public Fresco [] consultarProductosPorPaisOrigen(String paisBuscado){
    	int contador = 0;
    	Fresco[] productosFresco = new Fresco[contador];
    for (int i = 0; i < listaP.length; i++) {
		if(listaP[i] instanceof Fresco ) {
			((Fresco)listaP[i]).getPaisOrigen().equals(paisBuscado);
			productosFresco[contador] = ((Fresco)listaP[i]);
			contador++;
		}
	}
    return productosFresco;
    }
 
    //retornar array de productos caducados 
    public Producto [] consultarProductosCaducados(){
    	int contador = 0;
    	Producto [] productosCaducados = new Producto [contador];
    	for (int i = 0; i < listaP.length; i++) {
			if(listaP[i].getFechaCad().isBefore(LocalDate.now()) ) {
				productosCaducados[contador]=listaP[i];
				contador++;
				
			}
		}
		return productosCaducados;
    
    }
    
    //obtener array de productos de un tipo
    public Producto [] obtenerProductosDelTipo (String tipo){
    	int contador = 0;
    Producto [] productosPorTipo=new Producto [contador];
    		for (int i = 0; i < listaP.length; i++) {
				if(listaP[i]==((Producto)listaP[i])) {
					
				}
			}
    }
}
