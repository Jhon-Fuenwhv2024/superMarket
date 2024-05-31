package withread;

import domain.ClienteProducto;
import domain.Producto;

public class CajeraProductoThread extends Thread {
    
    private final String nombreCajera;
    private ClienteProducto cliente;
    private long timeSanp;

    public CajeraProductoThread(String nombreCajera, ClienteProducto cliente, long timeSanp) {
        this.nombreCajera = nombreCajera;
        this.cliente = cliente;
        this.timeSanp = timeSanp;
    }

    
    @Override
    
    public void run(){
        System.out.println(" La cajera " + this.nombreCajera + " Comienza a procesar la compra del cliente " + 
                this.cliente.getNombre() + " en el tiempo " + (System.currentTimeMillis() - timeSanp) / 1000 + 
                " seg");
        
        int contCliente = 1;
        for (Producto producto : this.cliente.getProductos()) {
            
            this.esperarXSegundos();
            System.out.println(" Procesando el producto " + contCliente + 
                    " nombre del  producto " + producto.getNombre() + 
                    " precio producto " + producto.getPrecio() +
                    " cantidad de productos " + producto.getCantidad() +
                    " costo total del producto " + producto.getCantidad()* producto.getPrecio()+
                    " -->Tiempo: " + (System.currentTimeMillis() - timeSanp) / 1000 + " seg ");
            
            System.out.println("");
            System.out.println("----------------------------------------------------");
        }
        
        System.out.println("la cajera" + this.nombreCajera + "ha terminado de procesar"
        + this.cliente.getNombre() + (System.currentTimeMillis() - timeSanp) / 1000 + "seg" );
    }

    private void esperarXSegundos() {
        
        try{
            Thread.sleep(1000);
        
        } catch (InterruptedException e){
            
            Thread.currentThread().interrupt();
        }
            
    }
}

