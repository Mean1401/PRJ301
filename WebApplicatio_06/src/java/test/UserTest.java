package test;

import dao.UserDAO;
import dto.UserDTO;

/**
 *
 * @author tungi
 */
public class UserTest {
    public static void main(String[] args) {
        UserDTO u1 = new UserDTO("TLN01", "Le Nhat Tung", "AD", "khong_co_pass");
        UserDAO userDAO = new UserDAO();
        System.out.println(userDAO.create(u1));
        
        for (int i = 0; i < 20; i++) {
             UserDTO ui = new UserDTO("USER"+i, "Nguyen Van "+i, "US", i+"");
             userDAO.create(ui);
        }
    }
}