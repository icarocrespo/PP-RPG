package util;

/**
 *
 * @author icaro
 */
public class Item {
    
    private Integer id;
    private String nome;
    private Float acrescimo_hp;
    private Float decrescimo_hp;
    private Float acrescimo_a;
    private Float decrescimo_a;
    private Float acrescimo_d;
    private Float decrescimo_d;
    private Boolean status;

    public Item(Integer id, String nome, Float acrescimo_hp, Float decrescimo_hp, Float acrescimo_a, Float decrescimo_a, Float acrescimo_d, Float decrescimo_d, Boolean status) {
        this.id = id;
        this.nome = nome;
        this.acrescimo_hp = acrescimo_hp;
        this.decrescimo_hp = decrescimo_hp;
        this.acrescimo_a = acrescimo_a;
        this.decrescimo_a = decrescimo_a;
        this.acrescimo_d = acrescimo_d;
        this.decrescimo_d = decrescimo_d;
        this.status = status;
    }

    public Item() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getAcrescimo_hp() {
        return acrescimo_hp;
    }

    public void setAcrescimo_hp(Float acrescimo_hp) {
        this.acrescimo_hp = acrescimo_hp;
    }

    public Float getDecrescimo_hp() {
        return decrescimo_hp;
    }

    public void setDecrescimo_hp(Float decrescimo_hp) {
        this.decrescimo_hp = decrescimo_hp;
    }

    public Float getAcrescimo_a() {
        return acrescimo_a;
    }

    public void setAcrescimo_a(Float acrescimo_a) {
        this.acrescimo_a = acrescimo_a;
    }

    public Float getDecrescimo_a() {
        return decrescimo_a;
    }

    public void setDecrescimo_a(Float decrescimo_a) {
        this.decrescimo_a = decrescimo_a;
    }

    public Float getAcrescimo_d() {
        return acrescimo_d;
    }

    public void setAcrescimo_d(Float acrescimo_d) {
        this.acrescimo_d = acrescimo_d;
    }

    public Float getDecrescimo_d() {
        return decrescimo_d;
    }

    public void setDecrescimo_d(Float decrescimo_d) {
        this.decrescimo_d = decrescimo_d;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
