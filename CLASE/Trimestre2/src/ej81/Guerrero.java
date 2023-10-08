/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej81;

/**
 *
 * @author EPIKO
 */
public class Guerrero {

    private String name;
    private int hpactual, atk, shield, hpmax, lvl, xpNextLvL, xpNow;
    private boolean dead;
    private Arma weapon;
    //private Dedo dedos[];

    public Guerrero(String name, int atk, int shield, int hpmax, Arma weapon) {
        this.name = name;
        this.hpmax = hpmax;
        this.hpactual = this.hpmax;
        this.atk = atk;
        this.shield = shield;
        this.dead = false;
        this.weapon = weapon;
        this.lvl = 1;
        this.xpNow = 0;
        this.xpNextLvL = (int)(Math.ceil(this.lvl * 10 + this.lvl * 1.5));

    }

    @Override
    public String toString() {
        String lvlup;
        if (subir()) {
            lvlup="Esta disponible la subida de nivel";
        }else{
            lvlup="Todavia no puede subir de nivel, " + (this.xpNextLvL-this.xpNow) + " xp restantes";
        }
        return "Guerrero:  " + this.name + "\n Ataque: " + this.atk + "\n Escudo: " + this.shield + "\n Salud actual: " + this.hpactual
                + " // " + this.hpmax + "\n"+lvlup;
    }

    private Boolean checkmorision(Guerrero def) {
        return def.hpactual <= 0;
    }

    public String atacar(Guerrero defensor) {
        String res = "";
        int dmgEntranteArmado, dmgEntranteDesarmado, dañoArmado;
        dañoArmado = this.atk + this.weapon.getPow();
        dmgEntranteArmado = dañoArmado - defensor.shield;
        dmgEntranteDesarmado = this.atk - defensor.shield;
        if (dmgEntranteArmado < 0) {
            dmgEntranteArmado = 0;
        }
        if (dmgEntranteDesarmado < 0) {
            dmgEntranteDesarmado = 0;
        }
        if (!this.dead) {
            if (!defensor.dead) {
                if (this.weapon.getRest() > 0) {
                    res += "\nEl guerrero " + this.name + " esta atacando..............Ha hecho " + dañoArmado + " de daño\nHa ganado: " + 3+ "xp";
                    res += "\nEl guerrero " + defensor.name + " ha recibido " + dañoArmado + " de daño y ha perdido " + dmgEntranteArmado + " de vida";
                    defensor.hpactual -= dmgEntranteArmado;
                    this.xpNow+=3;
                } else {
                    res += "\nEl guerrero " + this.name + " esta atacando.........................\n Ha hecho " + this.atk + " de daño\nHa ganado: " + 5 + "xp";
                    res += "\nEl guerrero " + defensor.name + " ha recibido " + this.atk + " de daño y ha perdido " + dmgEntranteDesarmado + " de vida";
                    defensor.hpactual -= dmgEntranteDesarmado;
                     this.xpNow+=5;
                }

                if (checkmorision(defensor)) {
                    res += "\n El guerrero " + defensor.name + " ha fallesido";
                    defensor.dead = true;
                } else {
                    res += "\n---------ESTADO DEL DEFENSOR-----------------\n" + defensor.toString();
                }
            } else {
                res += "No te ensañes con un cadaver";
            }
        } else {
            res += "El guerrero esta muerto y no puede atacar";
        }
        return res;
    }

    public void subirArma(Arma a1) {
        a1.subirNivel();
    }

    public boolean subir() {
        return this.xpNow >= this.xpNextLvL;
    }

    public void lvlUp() {
        if (subir()) {
            this.xpNow = 0;
            this.xpNextLvL = (int) (Math.ceil(this.lvl * 10 + this.lvl * 1.5));
            this.atk++;
            this.shield++;
            this.hpmax+=10;
            this.hpactual+=10;
            System.out.println("--------------LVL UP--------------");
        }
    }
}
