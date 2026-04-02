/*
 * Role.java Apr 2, 2026
 *
 *
 * ©Copyright 2026 Carles Conesa <a251158cc@correu.escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
 
/**
 * 
 */

package role; //Package declaration.

/**
 * 
 */
public abstract class Role {
	private float posX;
	private float posY;
	private boolean available = true;
	private byte lifes = 3;
	private float energy = 100;
	
	public Role(float posX, float posY) {
		this.posX = posX;
		this.posY = posY;
	} 
	
	public abstract void move();
	public abstract void jump();
}

