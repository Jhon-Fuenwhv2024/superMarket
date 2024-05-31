package withread;

import domain.ClienteProducto;
import domain.Producto;
import java.util.ArrayList;
import java.util.List;

public class CajeraProductoThreadMain {
    
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);
        
        ClienteProducto cliente1 = new ClienteProducto(" Mark ", productos);
        ClienteProducto cliente2 = new ClienteProducto(" Paola ", productos);
        ClienteProducto cliente3 = new ClienteProducto(" Rosanna ", productos);
        
        long initialTime = System.currentTimeMillis();
        CajeraProductoThread cajeraUno = new CajeraProductoThread("C. VALENTINA", cliente1, initialTime);
        CajeraProductoThread cajeraDos = new CajeraProductoThread("C. STEFANY", cliente2, initialTime);
        CajeraProductoThread cajeraTres = new CajeraProductoThread("C. ISABELLA", cliente3, initialTime);
        
        cajeraUno.start();
        cajeraDos.start();
        cajeraTres.start();
        
        
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

