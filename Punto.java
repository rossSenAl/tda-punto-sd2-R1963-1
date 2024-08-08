
public class Punto implements IPunto {

    private double x;
    private double y;
    private double z;
    private Sistema sistema;
    private String etiqueta;

    // metodo constructor
    public Punto() {
        this.x = y = z = 0;
        this.sistema = Sistema.PLANO;
    }

    public Punto(double _x, double _y) {
        this.x = _x;
        this.y = _y;
        this.sistema = Sistema.PLANO;
    }

    public Punto(double _x, double _y, double _z) {
        this.x = _x;
        this.y = _y;
        this.z = _z;
        this.sistema = Sistema.ESPACIO;
    }

    public Punto(Sistema _sistema, double _x, double _y) {
        this.x = _x;
        this.y = _y;
        this.z = 0;
        this.sistema = _sistema;
    }

    public Punto(Sistema _sistema, double _x, double _y, double _z) {
        this.x = _x;
        this.y = _y;
        this.z = _z;
        this.sistema = _sistema;
    }

    public Punto(Sistema _sistema, String _etiqueta, double _x, double _y, double _z) {
        this.x = _x;
        this.y = _y;
        this.z = _z;
        this.sistema = _sistema;
        this.etiqueta = _etiqueta;
    }

    @Override
    public String toString() {
        return "Punto [x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", sistema=" + this.sistema + "]";
    }

    // metodo get para acceder a la propiedad X
    public double getX() {
        return x;
    }

    // metodo set para darle un valor a la propiedad X
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public double dameDistanciaEntreOtroPunto(Punto OtroOPunto) {

        return 0;
    }

    @Override
    public Punto damePuntoMedioEntreOtroPunto(Punto OtroPunto) {

        return null;
    }
}
