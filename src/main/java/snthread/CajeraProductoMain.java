package snthread;

import domain.ClienteProducto;
import domain.Producto;
import java.util.ArrayList;
import java.util.List;

public class CajeraProductoMain {
    
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);
        
        ClienteProducto cliente1 = new ClienteProducto(" Mark ", productos);
        ClienteProducto cliente2 = new ClienteProducto(" Paola ", productos);
        ClienteProducto cliente3 = new ClienteProducto(" Rosanna ", productos);
        
        long initialTime = System.currentTimeMillis();
        CajeraProducto cajeraUno = new CajeraProducto("C. VALENTINA");
        CajeraProducto cajeraDos = new CajeraProducto("C. STEFANY");
        CajeraProducto cajeraTres = new CajeraProducto("C. ISABELLA");
        
        cajeraUno.procesarComprar(cliente1, initialTime);
        cajeraDos.procesarComprar(cliente2, initialTime);
        cajeraTres.procesarComprar(cliente3, initialTime);
        
        
    }
    
    private static void setProductos(List<Producto> productos){
        Producto productoUno = new Producto("Tennis", 45000, 4);
        Producto productoDos = new Producto("Camisas", 100000, 3);
        Producto productoTres = new Producto("Alpargatas", 40000, 2);
        
    productos.add(productoUno);
    productos.add(productoDos);
    productos.add(productoTres);
    
                
    }
    
}
