package co.example.prueba.consumo;

import java.util.Date;

public class Post {
    private int pkEquipo;
    private String nombre;
    private  int serial;
    private String modelo;
    private int placaSena;
    private int numeroCertificacion;
    private String vidaUtilPrevista;
    private Date anioFabricacion;
    private Date FechaCompra;
    private Date FechaInicioOperacion;
    private Date FechaRetiro;
    private  int fkFabricante;
    private  int fkfuncion;




    public int getPkEquipo() {
        return pkEquipo;
    }

    public void setPkEquipo(int pkEquipo) {
        this.pkEquipo = pkEquipo;
    }

    public int getFkFabricante() {
        return fkFabricante;
    }

    public void setFkFabricante(int fkFabricante) {
        this.fkFabricante = fkFabricante;
    }

    public int getFkfuncion() {
        return fkfuncion;
    }

    public void setFkfuncion(int fkfuncion) {
        this.fkfuncion = fkfuncion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPlacaSena() {
        return placaSena;
    }

    public void setPlacaSena(int placaSena) {
        this.placaSena = placaSena;
    }

    public int getNumeroCertificacion() {
        return numeroCertificacion;
    }

    public void setNumeroCertificacion(int numeroCertificacion) {
        this.numeroCertificacion = numeroCertificacion;
    }

    public String getVidaUtilPrevista() {
        return vidaUtilPrevista;
    }

    public void setVidaUtilPrevista(String vidaUtilPrevista) {
        this.vidaUtilPrevista = vidaUtilPrevista;
    }

    public Date getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Date anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Date getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        FechaCompra = fechaCompra;
    }

    public Date getFechaInicioOperacion() {
        return FechaInicioOperacion;
    }

    public void setFechaInicioOperacion(Date fechaInicioOperacion) {
        FechaInicioOperacion = fechaInicioOperacion;
    }

    public Date getFechaRetiro() {
        return FechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        FechaRetiro = fechaRetiro;
    }
}
