/*
 * Role.java Apr 2, 2026
 *
 *
 * ©Copyright 2026 Carles Conesa <a251158cc@correu.escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package role;

/**
 * Abstract base class representing a generic role (character) in a game.
 *
 * @author Carles Conesa
 * @version 1.0
 * @since 2026-04-02
 */
public abstract class Role {

	/** Horizontal position of the role on the 2-D plane. */
	protected float posX;

	/** Vertical position of the role on the 2-D plane. */
	protected float posY;

	/**
	 * Indicates whether the role is currently active and able to perform actions.
	 * Defaults to true.
	 */
	protected boolean available = true;

	/**
	 * Number of lives remaining for this role. The value is initialised to 3.
	 */
	protected byte lifes = 3;

	/**
	 * Current energy level of the role, expressed as a percentage. Defaults to 100.
	 * Certain actions consume energy; the role cannot perform them if it lacks
	 * sufficient energy.
	 */
	protected float energy = 100.0f;

	/**
	 * Creates a new Role at the specified position on the 2-D plane.
	 *
	 * @param posX initial horizontal position
	 * @param posY initial vertical position
	 */
	public Role(float posX, float posY) {
		this.posX = posX;
		this.posY = posY;
	}

	/**
	 * Moves the role according to the specific logic defined by each subclass.
	 */
	public abstract void move();

	/**
	 * Makes the role jump according to the specific logic defined by each subclass.
	 */
	public abstract void jump();

	/**
	 * Gets the value of posX.
	 *
	 * @return the posX
	 */
	public float getPosX() {
		return posX;
	}

	/**
	 * Sets the value of posX.
	 *
	 * @param posX the posX to set
	 */
	public void setPosX(float posX) {
		this.posX = posX;
	}

	/**
	 * Gets the value of posY.
	 *
	 * @return the posY
	 */
	public float getPosY() {
		return posY;
	}

	/**
	 * Sets the value of posY.
	 *
	 * @param posY the posY to set
	 */
	public void setPosY(float posY) {
		this.posY = posY;
	}

	/**
	 * Gets the value of available.
	 *
	 * @return the available
	 */
	public boolean isAvailable() {
		return available;
	}

	/**
	 * Sets the value of available.
	 *
	 * @param available the available to set
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}

	/**
	 * Gets the value of lifes.
	 *
	 * @return the lifes
	 */
	public byte getLifes() {
		return lifes;
	}

	/**
	 * Sets the value of lifes.
	 *
	 * @param lifes the lifes to set
	 */
	public void setLifes(byte lifes) {
		this.lifes = lifes;
	}

	/**
	 * Gets the value of energy.
	 *
	 * @return the energy
	 */
	public float getEnergy() {
		return energy;
	}

	/**
	 * Sets the value of energy.
	 *
	 * @param energy the energy to set
	 */
	public void setEnergy(float energy) {
		this.energy = energy;
	}

	/**
	 * Returns a string representation of this role.
	 *
	 * @return a string representation of the role
	 */
	@Override
	public String toString() {
		return "Role{posX=" + posX + ", posY=" + posY + ", available=" + available + ", lifes=" + lifes + ", energy="
				+ energy + "}";
	}

	/**
	 * Performs an extra horizontal movement, advancing the role 20.5 units along
	 * the X axis and consuming 2 energy points.
	 *
	 * This action is only executed when the role is available and has at least 2.0
	 * energy points remaining.
	 */
	public final void extraMove() {
		if (available && energy >= 2.0f) {
			posX += 20.5f;
			energy -= 2.0f;
		}
	}

	/**
	 * Performs an extra jump, advancing the role 25.2 units along the Y axis and
	 * consuming 4 energy points.
	 *
	 * This action is only executed when the role is available and has at least 4
	 * energy points remaining.
	 */
	public final void extraJump() {
		if (available && energy >= 4.0f) {
			posY += 25.2f;
			energy -= 4.0f;
		}
	}

	/**
	 * Resets the role's position to the origin.
	 *
	 * This method does not alter any other state such as lives, energy or
	 * availability.
	 */
	public final void resetPosition() {
		posX = 0.0f;
		posY = 0.0f;
	}

	/**
	 * Fully resets the role to its initial state.
	 */
	public final void resetRole() {
		posX = 0.0f;
		posY = 0.0f;
		available = true;
		lifes = 3;
		energy = 100.0f;
	}

	/**
	 * Decrements the role's life count by one if the role is available and has at
	 * least one life remaining.
	 *
	 * @return true if the life was successfully decremented; false if the role is
	 *         unavailable or has no lives left
	 */
	public final boolean decreaseLife() {
		if (available && lifes >= 1) {
			lifes--;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Increments the role's life count by one if the role is available and has not
	 * yet reached the maximum of three lives.
	 *
	 * @return true if the life was successfully incremented; false if the role is
	 *         unavailable or already has three lives
	 */
	public final boolean increaseLife() {
		if (available && lifes < 3) {
			lifes++;
			return true;
		}

		return false;
	}
}