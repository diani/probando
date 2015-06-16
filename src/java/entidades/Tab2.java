/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author diani
 */
@Entity
@Table(name = "tab2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tab2.findAll", query = "SELECT t FROM Tab2 t"),
    @NamedQuery(name = "Tab2.findByIdd", query = "SELECT t FROM Tab2 t WHERE t.idd = :idd"),
    @NamedQuery(name = "Tab2.findByNombree", query = "SELECT t FROM Tab2 t WHERE t.nombree = :nombree")})
public class Tab2 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idd")
    private Integer idd;
    @Size(max = 45)
    @Column(name = "nombree")
    private String nombree;

    public Tab2() {
    }

    public Tab2(Integer idd) {
        this.idd = idd;
    }

    public Integer getIdd() {
        return idd;
    }

    public void setIdd(Integer idd) {
        this.idd = idd;
    }

    public String getNombree() {
        return nombree;
    }

    public void setNombree(String nombree) {
        this.nombree = nombree;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idd != null ? idd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tab2)) {
            return false;
        }
        Tab2 other = (Tab2) object;
        if ((this.idd == null && other.idd != null) || (this.idd != null && !this.idd.equals(other.idd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Tab2[ idd=" + idd + " ]";
    }
    
}
