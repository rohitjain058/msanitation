/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.City.City;
import Business.Country.Country;
import Business.State.State;
import Business.UserAccount.UserAccount;
import Business.WHO;
import UI.ManageCityPanel.ManageCityJPanel;
import UI.ManageState.ManageStateJPanel;
import javax.swing.JPanel;

/**
 *
 * @author VAIBHAV RAJ
 */
public class StateAdminRole extends Role {
      public StateAdminRole()
       {
           super();
       }
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, City city, 
            State state,
            Country country,
            WHO business) {
        return new ManageStateJPanel(userProcessContainer, account, city, 
            state,
            country,
           business);
    }
}
