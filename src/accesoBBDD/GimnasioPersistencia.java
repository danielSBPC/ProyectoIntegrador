package accesoBBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Ejercicio;
import model.Usuario;
import model.Monitor;

public class GimnasioPersistencia {

    private AccesoBBDD acceso;
    private ArrayList<Ejercicio> listaEjercicios;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Monitor> listaMonitores;

    public GimnasioPersistencia() {
        acceso = new AccesoBBDD();
    }

    public ArrayList<Ejercicio> consultaEjercicio() {

        listaEjercicios = new ArrayList<Ejercicio>();

        String query = "SELECT * FROM " + EjercicioContract.NOM_TABLA;

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = acceso.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(query);

            int id;
            String tipo;
            String desc;
            String nomb;
            String moni;

            while (rs.next()) {
                id = rs.getInt(EjercicioContract.COL_ID_E);
                tipo = rs.getString(EjercicioContract.COL_TIPO);
                desc = rs.getString(EjercicioContract.COL_DESC);
                nomb = rs.getString(EjercicioContract.COL_NOM);
                moni = rs.getString(EjercicioContract.COL_MONI);

                listaEjercicios.add(new Ejercicio(id, tipo, desc, nomb, moni));
            }

        } catch (Exception e) {
            listaEjercicios = null;

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {

                e.printStackTrace();
            }
        }

        return listaEjercicios;
    }

    public ArrayList<Ejercicio> consultaEjercicioPorTipo(String tipo) {
        listaEjercicios = new ArrayList<Ejercicio>();

        String query = "SELECT * FROM " + EjercicioContract.NOM_TABLA
                + " WHERE " + EjercicioContract.COL_TIPO + " = ?";

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        int id;
        String desc;
        String nomb;
        String moni;

        try {
            con = acceso.getConexion();
            pst = con.prepareStatement(query);

            pst.setString(1, tipo);

            rs = pst.executeQuery();

            while (rs.next()) {
                id = rs.getInt(EjercicioContract.COL_ID_E);
                desc = rs.getString(EjercicioContract.COL_DESC);
                nomb = rs.getString(EjercicioContract.COL_NOM);
                moni = rs.getString(EjercicioContract.COL_MONI);

                listaEjercicios.add(new Ejercicio(id, tipo, desc, nomb, moni));
            }

        } catch (Exception e) {
            listaEjercicios = null;
            e.printStackTrace();

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
        return listaEjercicios;
    }

    public int addEjercicio(Ejercicio ej) {
        int res = 0;

        String query = "INSERT INTO EJERCICIO VALUES(?,?,?,?,?)";

        Connection con = null;
        PreparedStatement pst = null;

        try {
            con = acceso.getConexion();
            pst = con.prepareStatement(query);

            pst.setInt(1, (obtenerIdMasAlto(EjercicioContract.COL_ID_E, EjercicioContract.NOM_TABLA) + 1));
            pst.setString(2, ej.getTipo());
            pst.setString(3, ej.getDescripcion());
            pst.setString(4, ej.getNombre());
            pst.setString(5, ej.getMonitor());

            res = pst.executeUpdate();

        } catch (Exception e1) {
            res = -1;
            e1.printStackTrace();

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return res;
    }

    public int borrarEjercicio(String nom) {
        int res = 0;

        String query = "DELETE FROM EJERCICIO WHERE " + EjercicioContract.COL_NOM + " = ?";

        Connection con = null;
        PreparedStatement pst = null;

        try {
            con = acceso.getConexion();
            pst = con.prepareStatement(query);

            pst.setString(1, nom);

            res = pst.executeUpdate();

        } catch (Exception e1) {
            res = -1;
            e1.printStackTrace();

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return res;
    }

    public int obtenerIdMasAlto(String columna, String tabla) {
        String query2 = "SELECT MAX(" + columna + ") FROM " + tabla;

        int resultado = 0;

        Connection con = null;
        Statement st = null;
        ResultSet res = null;

        try {
            con = acceso.getConexion();
            st = con.createStatement();
            res = st.executeQuery(query2);

            while (res.next()) {
                int id = res.getInt(1);
                resultado = id;
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (res != null) {
                    res.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return resultado;

    }

    public int aniadirUsuario(Usuario usu) {
        int res = 0;

        String query = "INSERT INTO " + UsuarioContract.NOM_TABLA + " VALUES(?,?,?,?,?,?)";

        Connection con = null;
        PreparedStatement pst = null;

        try {
            con = acceso.getConexion();
            pst = con.prepareStatement(query);

            pst.setInt(1, (obtenerIdMasAlto(UsuarioContract.COL_ID_U, UsuarioContract.NOM_TABLA) + 1));
            pst.setString(2, usu.getNombre());
            pst.setString(3, usu.getApellido());
            pst.setDouble(4, usu.getAltura());
            pst.setDouble(5, usu.getPeso());
            pst.setString(6, usu.getContrasenia());

            res = pst.executeUpdate();

        } catch (Exception e1) {
            res = -1;
            e1.printStackTrace();

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return res;
    }

    public int borrarUsuario(int id) {
        int res = 0;

        String query = "DELETE FROM USUARIO WHERE " + UsuarioContract.COL_ID_U + " = ?";

        Connection con = null;
        PreparedStatement pst = null;

        try {
            con = acceso.getConexion();
            pst = con.prepareStatement(query);

            pst.setInt(1, id);

            res = pst.executeUpdate();

        } catch (Exception e1) {
            res = -1;
            e1.printStackTrace();

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return res;
    }

    public ArrayList<Usuario> consultaUsuario() {
        listaUsuarios = new ArrayList<Usuario>();

        String query = "SELECT * FROM " + UsuarioContract.NOM_TABLA;

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = acceso.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(query);

            int id;
            String nom;
            String ape;
            double alt;
            double peso;
            String contra;

            while (rs.next()) {
                id = rs.getInt(UsuarioContract.COL_ID_U);
                nom = rs.getString(UsuarioContract.COL_NOM);
                ape = rs.getString(UsuarioContract.COL_APE);
                alt = rs.getDouble(UsuarioContract.COL_ALT);
                peso = rs.getDouble(UsuarioContract.COL_PESO);
                contra = rs.getString(UsuarioContract.COL_CONTRA);

                listaUsuarios.add(new Usuario(id, nom, ape, alt, peso, contra));
            }

        } catch (Exception e2) {
            //listaUsuarios = null;

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e3) {

                e3.printStackTrace();
            }
        }
        return listaUsuarios;
    }
    
    public ArrayList<Monitor> consultaMoni() {
        listaMonitores = new ArrayList<Monitor>() ;
        
        String query = "SELECT * FROM " + MonitorContract.NOM_TABLA;

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = acceso.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(query);

            String id;
            String nom;
            String ape;
            String form;
            String contra;

            while (rs.next()) {
                id = rs.getString(MonitorContract.COL_ID_M);
                nom = rs.getString(MonitorContract.COL_NOM);
                ape = rs.getString(MonitorContract.COL_APE);
                form = rs.getString(MonitorContract.COL_FORM);
                contra = rs.getString(MonitorContract.COL_CONTRA);

                listaMonitores.add(new Monitor(id, nom, ape, form, contra));
            }

        } catch (Exception e) {
            listaMonitores = null;

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
        return listaMonitores;
    }
}
