package proyectobasesi;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Database {

    private Connection conn;
    private Statement statement;

    public Connection openConnection() {
        if (conn == null) {
            String url = "jdbc:mysql://localhost:3306/airport?zeroDateTimeBehavior=convertToNull";//url de base de datos en xampp
            String dbName = "airport";//nombre de la base
            String driver = "com.mysql.jdbc.Driver";//el drive para conectarlo
            String userName = "root";//el username 
            String password = "";//contraseña vacia
            try {
                Class.forName(driver);
                this.conn = (Connection) DriverManager.getConnection(url, userName, password);

                JOptionPane.showMessageDialog(null, "Conexion exitosa");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Conexion fallida,revisar Database.java, o llamar al +50494566602 para mas informacion");
                System.exit(0);
            }
        }
        return conn;
    }

    public Connection getMyConnection() {
        return conn;
    }

    public Statement getStatement() {
        return statement;
    }

    public void close(ResultSet rs) {

        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
            }

        }
    }

    public void close() {

        if (statement != null) {
            try {
                statement.close();
            } catch (Exception e) {
            }

        }
    }

    public void destroy() {

        if (conn != null) {

            try {
                conn.close();
            } catch (Exception e) {
            }

        }
    }

    public ArrayList<controlador_aereo> listaControladores() {
        ArrayList<controlador_aereo> listaControladores = new ArrayList<controlador_aereo>();
        Connection conexion = getMyConnection();

        String query = "SELECT * FROM 'controlador_aereo'";
        Statement st;
        ResultSet rs;
        try {
            st = (Statement) conexion.createStatement();
            rs = st.executeQuery(query);
            controlador_aereo controladores;
            while (rs.next()) {
                controladores = new controlador_aereo(rs.getDate("fecha_examen"), rs.getInt("dni"), rs.getString("contraseña"));
                listaControladores.add(controladores);

            }
        } catch (Exception e) {
        }
        return listaControladores;
    }

    public ArrayList<tecnico> listaTecnico() {
        ArrayList<tecnico> listaTecnico = new ArrayList<tecnico>();
        Connection conexion = getMyConnection();

        String query = "SELECT * FROM 'tecnico'";
        Statement st;
        ResultSet rs;
        try {
            st = (Statement) conexion.createStatement();
            rs = st.executeQuery(query);
            tecnico tecnicos;
            while (rs.next()) {
                tecnicos = new tecnico(rs.getString("tec_nombre"), rs.getString("tec_direccion"), rs.getInt("tec_telefono"), rs.getInt("tec_sueldo"), rs.getInt("dni"), rs.getString("contraseña"));
                listaTecnico.add(tecnicos);

            }
        } catch (Exception e) {
        }
        return listaTecnico;
    }

    public ArrayList<empleado> listaEmpleado() {
        ArrayList<empleado> listaEmpleado = new ArrayList<empleado>();
        Connection conexion = getMyConnection();

        String query = "SELECT * FROM 'empleado'";
        Statement st;
        ResultSet rs;
        try {
            st = (Statement) conexion.createStatement();
            rs = st.executeQuery(query);
            empleado empleados;
            while (rs.next()) {
                empleados = new empleado(rs.getInt("dn1"), rs.getString("emp_afiliacion"), rs.getString("contraseña"));
                listaEmpleado.add(empleados);

            }
        } catch (Exception e) {
        }
        return listaEmpleado;
    }
}
