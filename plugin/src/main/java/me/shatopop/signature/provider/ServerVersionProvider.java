/*
 * Copyright (C) 2023 shatopop
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package me.shatopop.signature.provider;

import org.bukkit.Bukkit;

/**
 * Stores the server version along with its integer as a static final value. Taken from the
 * Unnamed Team's GUI library which is available at <a href="https://github.com/unnamed/gui">this GitHub link</a>.
 * @author unnamed
 */
public class ServerVersionProvider {

    public static final String SERVER_VERSION =
            Bukkit.getServer()
                    .getClass().getPackage()
                    .getName().split("\\.")[3]
                    .substring(1);

    public static final int SERVER_VERSION_INT = Integer.parseInt(
            SERVER_VERSION
                    .replace("1_", "")
                    .replaceAll("_R\\d", "")
    );
}
