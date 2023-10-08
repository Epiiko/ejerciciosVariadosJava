package ej94;

/**
 *
 * @author EPIKO
 */
public class Habilidad {

    String name;
    private double costmana;
    double dmg;
    int lvl;
    char key;

    public Habilidad(String name, char key) {
        this.name = name;
        this.key = key;
        this.lvl = 1;
        this.costmana = ((int) (Math.random() * 10 + 1)) + (this.lvl * 0.5);
        this.dmg = ((int) (Math.random() * 15 + 5)) + (this.costmana * 0.33);
    }

    public void lvlUp() {
        lvl++;
        this.costmana = ((Math.random() *10+1)) + (this.lvl * 0.5);
        this.dmg = ((Math.random() * 15 + 5)) + (this.costmana * 0.33);
    }
}
