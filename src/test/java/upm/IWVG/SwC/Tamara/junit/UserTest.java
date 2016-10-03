/**
 * 
 */
package upm.IWVG.SwC.Tamara.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.IWVG.SwC.Tamara.User;

/**
 * @author USUARIO
 *
 */
public class UserTest {

private User u;
    
    @Before
    public void setUp(){
        u = new User(1, "Tamara", "Jimenez");
    }

    @Test
    public void testUser() {
        assertEquals(1, u.getNumber());
        assertEquals("Tamara", u.getName());
        assertEquals("Jimenez", u.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Tamara Jimenez", u.getFullName());
    }

    @Test
    public void testInitials() {
        assertEquals("T.", u.initials());
    }
}
