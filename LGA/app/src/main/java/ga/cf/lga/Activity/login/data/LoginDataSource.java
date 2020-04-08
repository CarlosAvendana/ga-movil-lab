package ga.cf.lga.Activity.login.data;

import java.io.IOException;
import java.util.ArrayList;

import ga.cf.lga.Activity.login.data.model.LoggedInUser;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            boolean bandera = validarUsuario(username, password);

            if (bandera) {
                LoggedInUser fakeUser = new LoggedInUser(java.util.UUID.randomUUID().toString(), username);
                return new Result.Success<>(fakeUser);
            } else {

                Exception e = new IOException("Error logging in");
                return new Result.Error(e);
            }

        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    private boolean validarUsuario(String nombre, String pass) {
        ArrayList<String> lista = getListaUsuariosNombre();
        ArrayList<String> lista2 = getListaUsuariosContra();
        boolean bandera1 = lista.contains(nombre);
        boolean bandera2 = lista2.contains(pass);
        boolean general = false;
        if (bandera1 == true && bandera2 == true) {
            general = true;
        }
        return general;
    }

    private ArrayList<String> getListaUsuariosContra() {
        ArrayList<String> usuariosList = new ArrayList<>();
        //administrador
        usuariosList.add("admin");
        usuariosList.add("carlos");
        return usuariosList;
    }

    private ArrayList<String> getListaUsuariosNombre() {
        ArrayList<String> usuariosList = new ArrayList<>();
        //administrador
        usuariosList.add("admin");
        usuariosList.add("carlos");
        return usuariosList;
    }



    public void logout() {
        // TODO: revoke authentication
    }
}
