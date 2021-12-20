package com.damian;

public class Alumno {
    private int id;
    private String name;
    private String address;
    private int telefono;

    public Alumno(int id, String name, String address, int telefono) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Alumno {" + "Código = " + id + " , Nombre = " + name + ", \nDomicilio = " + address + "}";
    }
}
