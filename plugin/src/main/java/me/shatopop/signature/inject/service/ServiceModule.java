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
package me.shatopop.signature.inject.service;

import me.shatopop.signature.services.Service;
import me.shatopop.signature.services.impl.VersionCheckService;
import me.shatopop.signature.services.impl.ListenerService;
import team.unnamed.inject.AbstractModule;

public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        this.multibind(Service.class)
                .asList()
                .to(VersionCheckService.class)
                .to(ListenerService.class)
                .singleton();
    }
}
