/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DB4OUtil;

import Business.ConfigureASystem;
import Business.Country.Country;
import Business.Country.CountryDirectory;
import Business.Employee.EmployeeDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WHO;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author VAIBHAV RAJ
 */
public class DB4OUtil {
     private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        //dB4OUtil=null;
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(WHO.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(WHO system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public WHO retrieveSystem(){
        ObjectContainer conn = createConnection();
        
        ObjectSet<WHO> systems = conn.query(WHO.class); // Change to the object you want to save
     //   systems.clear();
        WHO system;
        // system = ConfigureASystem.configure();
      //  systems.clear();
        if (systems.size() == 0){
            system = ConfigureASystem.configure();  // If there's no System in the record, create a new one
        }
        else{
        // system = ConfigureASystem.configure();  // If there's no System in the record, create a new one
         //  for(int j=systems.size()-1;j>=0;j--)
           //    systems.remove(j);
           
          //system = ConfigureASystem.configure();
          system = systems.get(systems.size() - 1);
        }
//system.setCountryDirectory(new CountryDirectory());
// system.setCountryList(new ArrayList<Country>());

//  
//       system.setEmployeeDirectory(new EmployeeDirectory());
//       system.setUserAccountDirectory(new UserAccountDirectory());
//  
       
        conn.close();
        return system;
    }  
}
