package de.lightplugins.economy.events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class VoucherClaimedEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final double voucherValue;
    private final Location location;

    public VoucherClaimedEvent(Player player, double voucherValue, Location location) {
        this.player = player;
        this.voucherValue = voucherValue;
        this.location = location;
    }

    public Player getPlayer() {
        return player;
    }

    public double getVoucherValue() {
        return voucherValue;
    }

    public Location getLocation() {
        return location;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}