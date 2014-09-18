package cn.tj.baseextweb.fw.entity;

// Generated 2014-9-10 22:31:18 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * RefRoleFunction generated by hbm2java
 */
@Entity
@Table(name = "ref_role_function")
public class RefRoleFunction implements java.io.Serializable {

    private Long rfid;
    private Function function;
    private Role role;

    public RefRoleFunction() {
    }

    public RefRoleFunction(Function function, Role role) {
        this.function = function;
        this.role = role;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "rfid", unique = true, nullable = false)
    public Long getRfid() {
        return this.rfid;
    }

    public void setRfid(Long rfid) {
        this.rfid = rfid;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fid")
    public Function getFunction() {
        return this.function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rid")
    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
