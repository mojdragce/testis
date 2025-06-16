/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

public class ProductService {
    
    private ProductDatabase database;
    
    public ProductService() {
    
    }
    
    public void setProductDatabase(ProductDatabase database){
        this.database = database;
    }
    
    public Product findProduct(int id){
        return database.findProduct(id);
    }
    
    public int countProduct(){
        return database.countAll();
    }
    
}
