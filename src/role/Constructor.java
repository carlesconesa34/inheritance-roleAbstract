/*
 * Constructor.java Apr 2, 2026
 *
 *
 * ©Copyright 2026 Carles Conesa <a251158cc@correu.escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package role;

public class Constructor extends Role {

    public Constructor(float posX, float posY) {
        super(posX, posY);
    }

    @Override
    public void move() {
        if (isAvailable() && getEnergy() >= Utils.ENERGY_MOVE) {
            setPosX(getPosX() + Utils.CONSTRUCTOR_MOVE);
            setEnergy(getEnergy() - Utils.ENERGY_MOVE);
        }
    }

    @Override
    public void jump() {
        if (isAvailable() && getEnergy() >= Utils.ENERGY_JUMP) {
            setPosY(getPosY() + Utils.CONSTRUCTOR_JUMP);
            setEnergy(getEnergy() - Utils.ENERGY_JUMP);
        }
    }

    @Override
    public String toString() {
        return "Constructor -> " + super.toString();
    }
}

