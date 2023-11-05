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
package me.shatopop.signature.adapter;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.ListenerPriority;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.plugin.Plugin;

import javax.inject.Inject;

public class ChatSessionUpdatePacketAdapter extends PacketAdapter {

    @Inject
    public ChatSessionUpdatePacketAdapter(Plugin plugin) {
        super(plugin, ListenerPriority.LOWEST, PacketType.Play.Client.CHAT_SESSION_UPDATE);
    }

    @Override
    public void onPacketReceiving(PacketEvent event) {
        event.setCancelled(true);
    }
}
