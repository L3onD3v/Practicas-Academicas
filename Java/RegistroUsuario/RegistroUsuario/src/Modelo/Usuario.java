package Modelo;

public class Usuario {
    private String nombre;
    private String email;
    private String password;

    public Usuario(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public boolean validarCorreo() {
        return email.contains("@") && email.endsWith(".com");
    }

    public boolean validarContrasena(String confirmacion) {
        return password.equals(confirmacion) && password.length() >= 6;
    }

    public String getNombre() {
        return nombre;
    }

}
