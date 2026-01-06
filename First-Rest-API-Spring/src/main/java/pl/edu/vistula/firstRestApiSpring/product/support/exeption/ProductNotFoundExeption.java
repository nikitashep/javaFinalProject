package pl.edu.vistula.firstRestApiSpring.product.support.exeption;

public class ProductNotFoundExeption extends RuntimeException {
    public ProductNotFoundExeption(Long id){
        super(String.format("Product with %d not found", id));
    }
}
