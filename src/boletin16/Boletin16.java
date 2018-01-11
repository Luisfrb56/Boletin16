package boletin16;

import com.luis.persoal.Persoal;
import com.luis.validar.Validar;

public class Boletin16 {
    
    public static void main(String[] args) {
        Persoal alum1 = new Persoal(986114334, "luisfrb56@gmail.com");
        Academia alu1 = new Academia("Luis", Validar.Validarnota(), alum1);
        System.out.println(alu1.toString());
        
    }
    
}
