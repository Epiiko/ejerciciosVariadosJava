/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej82;

/**
 *
 * @author EPIKO
 */
public class Cielo {

    Estrella[][] cielo;

    public Cielo(int x, int y) {
        this.cielo = new Estrella[x][y];
    }

    public void ponerEstrellas(int numestrellas) {
        int randomX;
        int randomY;
        int estrellasColocadas = 0;
        if (numestrellas > (this.cielo.length * this.cielo[0].length)) {
            numestrellas = (this.cielo.length * this.cielo[0].length);
        }

        while (estrellasColocadas != numestrellas) {
            randomX = (int) (Math.random() * this.cielo.length);
            randomY = (int) (Math.random() * this.cielo[0].length);
            if (this.cielo[randomX][randomY] == null) {
                this.cielo[randomX][randomY] = new Estrella(randomX, randomY);
                estrellasColocadas++;
            }
        }

    }

    public String toString() {
        String res = "";
        for (int i = 0; i < this.cielo.length; i++) {
            for (int j = 0; j < this.cielo[i].length; j++) {
                if (this.cielo[i][j] == null) {
                    res += " ";
                } else {
                    res += this.cielo[i][j].toString();
                }
            }
            res += "\n";
        }
        return res;
    }

}
