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
            String url = "jdbc:mysql://localhost:3306/MYairport?zeroDateTimeBehavior=convertToNull";//url de base de datos en xampp
            String dbName = "MYairport";//nombre de la base
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

    public ArrayList<controlador_aereo> getlistaControladores() {
        ArrayList<controlador_aereo> listaControladores = new ArrayList<controlador_aereo>();
        Connection conexion = getMyConnection();

        String query = "SELECT * FROM controlador_aereo";
        Statement st;
        ResultSet rs;
        try {
            st = (Statement) conexion.createStatement();
            rs = st.executeQuery(query);
            controlador_aereo controladores;
            while (rs.next()) {
                controladores = new controlador_aereo(rs.getDate(1), rs.getInt(2), rs.getString(3));
                listaControladores.add(controladores);

            }
        } catch (Exception e) {
        }
        return listaControladores;
    }
//String query = "Select *From empleado E where dni not in(Select dni From tecnico   where  dni=E.dni)";
    public ArrayList<tecnico> getlistaTecnico() {
        ArrayList<tecnico> listaTecnico = new ArrayList<tecnico>();
        Connection conexion = getMyConnection();

        String query = "SELECT * FROM tecnico";
        Statement st;
        ResultSet rs;
        try {
            st = (Statement) conexion.createStatement();
            rs = st.executeQuery(query);
            tecnico tecnicos;
            while (rs.next()) {
                tecnicos = new tecnico(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6));
                listaTecnico.add(tecnicos);

            }
        } catch (Exception e) {
        }
        return listaTecnico;
    }

    public ArrayList<empleado> getlistaEmpleado() {
        ArrayList<empleado> listaEmpleado = new ArrayList<empleado>();
        Connection conexion = getMyConnection();

        String query = "SELECT * FROM empleado";
        Statement st;
        ResultSet rs;
        try {
            st = (Statement) conexion.createStatement();
            rs = st.executeQuery(query);
            empleado empleados;
            while (rs.next()) {
                empleados = new empleado(rs.getInt(1), rs.getString(2), rs.getString(3));
                listaEmpleado.add(empleados);

            }
        } catch (Exception e) {
            System.out.println("error");
        }
        return listaEmpleado;
    }
    public ArrayList<Pruebas> getlistaPruebas(int Quien) {
        ArrayList<Pruebas> listaPrueba = new ArrayList<Pruebas>();
        Connection conexion = getMyConnection();

        String query = "SELECT * FROM pruebas WHERE dni= "+Quien+" ";
        Statement st;
        ResultSet rs;
        try {
            st = (Statement) conexion.createStatement();
            rs = st.executeQuery(query);
            Pruebas prueba;
            while (rs.next()) {
                prueba = new Pruebas(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getDate(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8));
                listaPrueba.add(prueba);

            }
        } catch (Exception e) {
            System.out.println("error");
        }
        return listaPrueba;
    }
    
    public ArrayList<Aviones> getlistaAviones() {
        ArrayList<Aviones> listaAvion = new ArrayList<Aviones>();
        Connection conexion = getMyConnection();

        String query = "SELECT * FROM avion";
        Statement st;
        ResultSet rs;
        try {
            st = (Statement) conexion.createStatement();
            rs = st.executeQuery(query);
            Aviones avion;
            while (rs.next()) {
                avion = new Aviones(rs.getInt(1), rs.getInt(2));
                listaAvion.add(avion);

            }
        } catch (Exception e) {
            System.out.println("error");
        }
        return listaAvion;
    }
    
     public ArrayList<empleado> getlistaEmpleadoParaControlador() {
        ArrayList<empleado> listaEmpleado = new ArrayList<empleado>();
        Connection conexion = getMyConnection();

        String query = "Select * From empleado E where dni not in (Select dni From tecnico  where  dni=E.dni) and dni not in(Select dni From controlador_aereo  where  dni=E.dni)";
        Statement st;
        ResultSet rs;
        try {
            st = (Statement) conexion.createStatement();
            rs = st.executeQuery(query);
            empleado empleados;
            while (rs.next()) {
                empleados = new empleado(rs.getInt(1), rs.getString(2), rs.getString(3));
                listaEmpleado.add(empleados);

            }
        } catch (Exception e) {
            System.out.println("error");
        }
        return listaEmpleado;
    }
}
