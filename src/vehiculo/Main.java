
package vehiculo;

/**
 *
 * @author 
 */
public class Main {
    /**
     * 
     * @param args 
     */
      public static void main(String[] args) {
        VehiculoXXX2223 miVehiculoXXX2223;
        int stockActual;
        
        miVehiculoXXX2223 = new VehiculoXXX2223("Seat",18000,100);
        operativaVehiculoXXX2223(miVehiculoXXX2223, 50); 
        stockActual = miVehiculoXXX2223.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }
      /**
       * 
       * @param miVehiculoXXX2223
       * @param par1 
       */
    public static void operativaVehiculoXXX2223(VehiculoXXX2223 miVehiculoXXX2223, int par1) {
        
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoXXX2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoXXX2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
