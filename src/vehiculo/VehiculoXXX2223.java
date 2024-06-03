
package vehiculo;

/**
 *
 * @author 
 */
public class VehiculoXXX2223 {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the precioIVA
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * @param precioIVA the precioIVA to set
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    protected String nombre;
    protected double precio;
    protected double precioIVA;
    protected int stock;

    /* Constructor sin argumentos */
    
    public VehiculoXXX2223 ()
    {
    }
    
    
    /**
     * 
     * @param nom
     * @param precio
     * @param stock 
     */
    public VehiculoXXX2223 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
   
    /**
     * 
     * @param nom 
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
  
    /**
     * 
     * @return Nombre 
     */
    public String obtenerNombre()
    {
        return getNombre();
    }
    
    
    /**
     * 
     * @return Stock 
     */
     public int obtenerStock ()
    {
        return getStock();
    }
    
     /**
      * 
      * @param cantidad
      * @throws Exception 
      */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }
    /**
     * 
     * @param cantidad
     * @throws Exception 
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }
    
}  
   
    

