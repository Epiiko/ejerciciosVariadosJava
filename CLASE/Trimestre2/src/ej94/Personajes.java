package ej94;

/**
 *
 * @author EPIKO
 */
public class Personajes {

    protected String name;
    protected int x, y;
    protected double hp, shield, atk;

    public Personajes(String name, int posx, int posy, double hp, double shield, double atk) {
        this.name = name;
        this.x = Math.max(posx, 0);
        this.y = Math.max(posy, 0);
        this.hp = Math.max(hp, 0);
        this.shield = Math.max(shield, 0);
        this.atk = Math.max(atk, 0);
    }

    public void desplazarse(int posx, int posy) {
        posx = posx > 0 ? posx : 0;
        posy = posy > 0 ? posy : 0;
        this.x += posx;
        this.y += posy;
    }
}
