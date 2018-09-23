package proyectobasesi;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Database {
    private Connection conn;
    private Statement statement;
    
    public Connection openConnection(){
        if (conn==null) {
            String url="jdbc:mysql://localhost:3306/airport?zeroDateTimeBehavior=convertToNull";//url de base de datos en xampp
            String dbName="airport";//nombre de la base
            String driver="com.mysql.jdbc.Driver";//el drive para conectarlo
            String userName="root";//el username 
            String password="";//contraseña vacia
            try {
                Class.forName(driver);
                this.conn=(Connection)DriverManager.getConnection(url,userName,password);
                
                JOptionPane.showMessageDialog(null, "Conexion exitosa");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Conexion fallida,revisar Database.java, o llamar al +50494566602 para mas informacion");
            }
        }
        return conn;
    }
     public Connection getMyConnection(){
        return conn;
    }
    
    
    public void close(ResultSet rs){
        
        if(rs !=null){
            try{
               rs.close();
            }
            catch(Exception e){}
        
        }
    }
    
     public void close(){
        
        if(statement !=null){
            try{
               statement.close();
            }
            catch(Exception e){}
        
        }
    }
     
  public void destroy(){
  
    if(conn !=null){
    
         try{
               conn.close();
            }
            catch(Exception e){}
        
        
    }
  }
    
}
