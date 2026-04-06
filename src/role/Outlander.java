/*
 * Outlander.java Apr 2, 2026
 *
 *
 * ©Copyright 2026 Carles Conesa <a251158cc@correu.escoladeltreball.org>
 *
 * This is free software, licensed under the MIT License.
 * See https://opensource.org/licenses/MIT for more information.
 */

package role;

/**
 * Concrete implementation of Role representing an Outlander character.
 *
 * Each action consumes energy defined in Utils. The action is only performed
 * when the role is available and has sufficient energy.
 *
 * @author Carles Conesa
 * @version 1.0
 * @since 2026-04-02
 */
public class Outlander extends Role {

	/**
	 * Creates a new Outlander at the specified position on the 2-D plane.
	 *
	 * @param posX initial horizontal position
	 * @param posY initial vertical position
	 */
	public Outlander(float posX, float posY) {
		super(posX, posY);
	}

	/**
	 * Moves the Outlander a fixed number of units along the X axis and consumes the
	 * corresponding energy points.
	 *
	 * The action is only performed if the role is available and has sufficient
	 * energy remaining.
	 */
	@Override
	public void move() {
		if (isAvailable() && getEnergy() >= Utils.ENERGY_MOVE) {
			setPosX(getPosX() + Utils.OUTLANDER_MOVE);
			setEnergy(getEnergy() - Utils.ENERGY_MOVE);
		}
	}

	/**
	 * Makes the Outlander jump a fixed number of units along the Y axis and
	 * consumes the corresponding energy points.
	 *
	 * The action is only performed if the role is available and has sufficient
	 * energy remaining.
	 */
	@Override
	public void jump() {
		if (isAvailable() && getEnergy() >= Utils.ENERGY_JUMP) {
			setPosY(getPosY() + Utils.OUTLANDER_JUMP);
			setEnergy(getEnergy() - Utils.ENERGY_JUMP);
		}
	}

	/**
	 * Returns a string representation of this Outlander, prefixed with the
	 * character type and followed by the common Role state.
	 *
	 * @return a string representation of the object
	 */
	@Override
	public String toString() {
		return "Outlander -> " + super.toString();
	}
}