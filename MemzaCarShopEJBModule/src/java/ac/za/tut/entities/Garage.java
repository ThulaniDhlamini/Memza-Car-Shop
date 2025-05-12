/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author manya
 */
@Entity
public class Garage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private String Brand;
    private String regstrationYear;
    private String fuel;
    private String transmittion;
    private String condition;
    private Double amount;
    private Double perMonth;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date datumu;

    public Garage() {
    }

    public Garage(Long id, String Brand, String regstrationYear, String fuel, String transmittion, String condition, Double amount, Double perMonth, Date datumu) {
        this.id = id;
        this.Brand = Brand;
        this.regstrationYear = regstrationYear;
        this.fuel = fuel;
        this.transmittion = transmittion;
        this.condition = condition;
        this.amount = amount;
        this.perMonth = perMonth;
        this.datumu = datumu;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getRegstrationYear() {
        return regstrationYear;
    }

    public void setRegstrationYear(String regstrationYear) {
        this.regstrationYear = regstrationYear;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getTransmittion() {
        return transmittion;
    }

    public void setTransmittion(String transmittion) {
        this.transmittion = transmittion;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getPerMonth() {
        return perMonth;
    }

    public void setPerMonth(Double perMonth) {
        this.perMonth = perMonth;
    }

    public Date getDatumu() {
        return datumu;
    }

    public void setDatumu(Date datumu) {
        this.datumu = datumu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Garage)) {
            return false;
        }
        Garage other = (Garage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ac.za.tut.entities.Garage[ id=" + id + " ]";
    }
    
}
