package Quinto.Impacto.entity;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Usuario extends RealmObject {

    @PrimaryKey
    private String id;
    private String email;
    private String clave;
    private Configuracion config;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Configuracion getConfig() {
        return config;
    }

    public void setConfig(Configuracion config) {
        this.config = config;
    }
}
