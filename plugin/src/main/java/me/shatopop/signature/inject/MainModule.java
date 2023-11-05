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
package me.shatopop.signature.inject;

import me.shatopop.signature.inject.listener.PacketAdaptModule;
import me.shatopop.signature.inject.service.ServiceModule;
import me.shatopop.signature.AllowInvalidSignaturesPlugin;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import team.unnamed.inject.AbstractModule;

public class MainModule extends AbstractModule {

    private final AllowInvalidSignaturesPlugin plugin;

    public MainModule(AllowInvalidSignaturesPlugin plugin){
        this.plugin = plugin;
    }

    @Override
    protected void configure() {
        this.bind(AllowInvalidSignaturesPlugin.class).toInstance(plugin);
        this.bind(Plugin.class).toInstance(plugin);
        this.bind(JavaPlugin.class).toInstance(plugin);

        this.install(new ServiceModule());
        this.install(new PacketAdaptModule());
    }
}
