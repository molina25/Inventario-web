
package Factory;

import java.sql.Connection;
import java.sql.DriverManager;


public final class MySQLConexionFactory extends ConexionDB{

    public MySQLConexionFactory(String[] criterios) {
        this.parametros = criterios;
        this.open();//llamar al metodo open
        
    }
    //implentar el metodo open
    @Override
    public Connection open() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.parametros[0], this.parametros[1], this.parametros[2]);
        }
        catch(Exception ex){
                ex.printStackTrace();
        }
        return this.conexion;
    }   
    
}
