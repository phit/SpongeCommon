/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.common.config.type;

import ninja.leaping.configurate.objectmapping.Setting;
import org.spongepowered.common.config.category.BlockTrackerCategory;
import org.spongepowered.common.config.category.PlayerBlockTracker;
import org.spongepowered.common.config.category.DebugCategory;
import org.spongepowered.common.config.category.EntityActivationRangeCategory;
import org.spongepowered.common.config.category.EntityCategory;
import org.spongepowered.common.config.category.EntityCollisionCategory;
import org.spongepowered.common.config.category.GeneralCategory;
import org.spongepowered.common.config.category.LoggingCategory;
import org.spongepowered.common.config.category.SpawnerCategory;
import org.spongepowered.common.config.category.TileEntityActivationCategory;
import org.spongepowered.common.config.category.TimingsCategory;
import org.spongepowered.common.config.category.WorldCategory;

public class GeneralConfigBase extends ConfigBase {

    @Setting
    protected WorldCategory world = new WorldCategory();
    @Setting(value = "player-block-tracker")
    private PlayerBlockTracker playerBlockTracker = new PlayerBlockTracker();
    @Setting
    private DebugCategory debug = new DebugCategory();
    @Setting(value = "entity")
    private EntityCategory entity = new EntityCategory();
    @Setting(value = "entity-activation-range")
    private EntityActivationRangeCategory entityActivationRange = new EntityActivationRangeCategory();
    @Setting(value = "entity-collisions")
    private EntityCollisionCategory entityCollisionCategory = new EntityCollisionCategory();
    @Setting
    private GeneralCategory general = new GeneralCategory();
    @Setting
    private LoggingCategory logging = new LoggingCategory();
    @Setting(value = "spawner", comment = "Used to control spawn limits around players. \n"
                                        + "Note: The radius uses the lower value of mob spawn range and server's view distance.")
    private SpawnerCategory spawner = new SpawnerCategory();
    @Setting(value = "tileentity-activation")
    private TileEntityActivationCategory tileEntityActivationCategory = new TileEntityActivationCategory();
    @Setting
    private TimingsCategory timings = new TimingsCategory();

    public PlayerBlockTracker getBlockTracking() {
        return this.playerBlockTracker;
    }

    public DebugCategory getDebug() {
        return this.debug;
    }

    public EntityCategory getEntity() {
        return this.entity;
    }

    public EntityActivationRangeCategory getEntityActivationRange() {
        return this.entityActivationRange;
    }

    public EntityCollisionCategory getEntityCollisionCategory() {
        return this.entityCollisionCategory;
    }

    public GeneralCategory getGeneral() {
        return this.general;
    }

    public LoggingCategory getLogging() {
        return this.logging;
    }

    public SpawnerCategory getSpawner() {
        return this.spawner;
    }

    public WorldCategory getWorld() {
        return this.world;
    }

    public TileEntityActivationCategory getTileEntityActivationRange() {
        return this.tileEntityActivationCategory;
    }

    public TimingsCategory getTimings() {
        return this.timings;
    }
}
