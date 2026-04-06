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

/**
 * Utility class that centralises all the game constants shared across the
 * different subclasses.
 *
 * @author Carles Conesa
 * @version 1.0
 * @since 2026-04-02
 */
public class Utils {

    /** Distance units moved horizontally per standard move action for an Outlander. */
    public static final float OUTLANDER_MOVE = 8.5f;

    /** Distance units moved vertically per standard jump action for an Outlander. */
    public static final float OUTLANDER_JUMP = 6.2f;

    /** Distance units moved horizontally per standard move action for a Soldier. */
    public static final float SOLDIER_MOVE = 10.5f;

    /** Distance units moved vertically per standard jump action for a Soldier. */
    public static final float SOLDIER_JUMP = 8.0f;

    /** Distance units moved horizontally per standard move action for a Constructor. */
    public static final float CONSTRUCTOR_MOVE = 5.0f;

    /** Distance units moved vertically per standard jump action for a Constructor. */
    public static final float CONSTRUCTOR_JUMP = 5.0f;

    /** Distance units moved horizontally per standard move action for a Ninja. */
    public static final float NINJA_MOVE = 8.0f;

    /** Distance units moved vertically per standard jump action for a Ninja. */
    public static final float NINJA_JUMP = 7.5f;

    /** Energy points consumed by a standard move action. */
    public static final float ENERGY_MOVE = 0.5f;

    /** Energy points consumed by a standard jump action. */
    public static final float ENERGY_JUMP = 1.0f;

    /** Distance units moved horizontally by an extra move action. */
    public static final float EXTRA_MOVE = 20.5f;

    /** Distance units moved horizontally by an extra jump action. */
    public static final float EXTRA_JUMP = 25.2f;

    /** Energy points consumed by an extra move action. */
    public static final float EXTRA_ENERGY_MOVE = 2.0f;

    /** Energy points consumed by an extra jump action. */
    public static final float EXTRA_ENERGY_JUMP = 4.0f;

    /** Default energy level assigned to every role at creation or after a reset. */
    public static final float INITIAL_ENERGY = 100.0f;

    /** Default number of lives assigned to every role at creation or after a reset. */
    public static final byte LIFES = 3;

    /**
     * Private constructor to prevent instantiation of this utility class.
     *
     * All members are static; this class is not meant to be instantiated.
     */
    private Utils() {
		
	}
}