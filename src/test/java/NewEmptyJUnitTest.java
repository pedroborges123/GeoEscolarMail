/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.es.geo.mail.Email;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pedro
 */
public class NewEmptyJUnitTest {
    
    
    @Test
    public void testeEnvia(){
        assertTrue(Email.envia("pedroborges123@gmail.com", "teste" , "oi eh um teste.."));
        
    }
    
}
