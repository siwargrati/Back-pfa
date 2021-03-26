
package org.sid.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
// du code technique
@Entity
@Data
//génerer un constructeur paramétres
@AllArgsConstructor
//génerer un constructeur sans paramétres
@NoArgsConstructor
@ToString
@Table(name="Fichiers")
public class Fichiers {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
@Column(name="Nom_fichier")
private String fichierNom;
public Fichiers() {}
public Fichiers(String fichierNom) {
super();
this.fichierNom = fichierNom;
}
@Column(name="fichier")
private byte [] fichier;
public long getId() {
return id;
}
public void setId(long id) {
this.id = id;
}
public String getFichierNom() {
return fichierNom;
}
public void setFichierNom(String fichierNom) {
this.fichierNom = fichierNom;
}
public byte[] getFichier() {
return fichier;
}
public void setFichier(byte[] fichier) {
this.fichier = fichier;
}

}