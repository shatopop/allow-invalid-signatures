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
package me.shatopop.signature.services.impl;

import me.shatopop.signature.provider.ServerVersionProvider;
import me.shatopop.signature.services.Service;
import org.bukkit.plugin.Plugin;

import javax.inject.Inject;

public class VersionCheckService implements Service {

    @Inject
    private Plugin plugin;

    @Override
    public void start() {
        if (ServerVersionProvider.SERVER_VERSION_INT >= 19) {
            return;
        }

        plugin.getLogger().severe("This plugin is unsupported in this server version ("
                + ServerVersionProvider.SERVER_VERSION + ").");

        plugin.getLogger().severe("Please update to a newer version of Minecraft or remove the plugin.");
    }
}
