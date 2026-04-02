/*
 * Utils.java Apr 2, 2026
 *
 *
 * ©Copyright 2026 Carles Conesa <a251158cc@correu.escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package role;

public class Utils {

    // Valores de movimiento
    public static final float OUTLANDER_MOVE = 8.5f;
    public static final float OUTLANDER_JUMP = 6.2f;
    public static final float SOLDIER_MOVE = 10.5f;
    public static final float SOLDIER_JUMP = 8.0f;
    public static final float CONSTRUCTOR_MOVE = 5.0f;
    public static final float CONSTRUCTOR_JUMP = 5.0f;
    public static final float NINJA_MOVE = 8.0f;
    public static final float NINJA_JUMP = 7.5f;

    // Costes de energía
    public static final float ENERGY_MOVE = 0.5f;
    public static final float ENERGY_JUMP = 1.0f;
    public static final float EXTRA_MOVE = 20.5f;
    public static final float EXTRA_JUMP = 25.2f;
    public static final float EXTRA_ENERGY_MOVE = 2.0f;
    public static final float EXTRA_ENERGY_JUMP = 4.0f;

    // Valores iniciales
    public static final float INITIAL_ENERGY = 100.0f;
    public static final byte LIFES = 3;

    // Constructor privado para que no se pueda instanciar
    private Utils() {
		
	}
}

