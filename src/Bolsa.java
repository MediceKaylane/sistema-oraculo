import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author alunolab10
 */
public class Bolsa {
    
   public List<Item> item = new ArrayList<>();

    public Bolsa() {
        
    }

    
    public void equiparItem (int itemId) {
        item.get(itemId).equipar();
    }
    public boolean itemEquipado (int itemId) {
        return item.get(itemId).itemEquipado();
    }
    
    
}
