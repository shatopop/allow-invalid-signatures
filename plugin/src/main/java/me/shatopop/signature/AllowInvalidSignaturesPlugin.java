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
package me.shatopop.signature;

import me.shatopop.signature.inject.MainModule;
import me.shatopop.signature.services.Service;
import org.bukkit.plugin.java.JavaPlugin;
import team.unnamed.inject.Injector;

import javax.inject.Inject;
import java.util.List;

public class AllowInvalidSignaturesPlugin extends JavaPlugin {

    @Inject
    private List<Service> services;

    @Override
    public void onEnable() {
        Injector injector = Injector.create(new MainModule(this));
        injector.injectMembers(this);
        services.forEach(Service::start);
    }

    @Override
    public void onDisable() {
        services.forEach(Service::stop);
    }
}
