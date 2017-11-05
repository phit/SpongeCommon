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
package org.spongepowered.common.item.inventory.lens.impl;

import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import net.minecraft.item.ItemStack;
import org.spongepowered.api.item.inventory.Inventory;
import org.spongepowered.api.item.inventory.InventoryProperty;
import org.spongepowered.api.text.translation.Translation;
import org.spongepowered.common.item.inventory.adapter.InventoryAdapter;
import org.spongepowered.common.item.inventory.lens.Fabric;
import org.spongepowered.common.item.inventory.lens.Lens;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DefaultEmptyLens<TInventory> extends ObservableLens<TInventory, ItemStack> {

    private static final IntSet EMPTY_SLOT_SET = IntSets.EMPTY_SET;
    
    protected final InventoryAdapter<TInventory, ItemStack> adapter;
    
    public DefaultEmptyLens(InventoryAdapter<TInventory, ItemStack> adapter) {
        this.adapter = adapter;
    }

    @Override
    public Class<? extends Inventory> getAdapterType() {
        return this.adapter.getClass();
    }

    @Override
    public InventoryAdapter<TInventory, ItemStack> getAdapter(Fabric<TInventory> inv, Inventory parent) {
        return this.adapter;
    }
    
    @Override
    public Translation getName(Fabric<TInventory> inv) {
        return inv.getDisplayName();
    }

    @Override
    public int slotCount() {
        return 0;
    }

    @Override
    public int getRealIndex(Fabric<TInventory> inv, int ordinal) {
        return -1;
    }

    @Override
    public ItemStack getStack(Fabric<TInventory> inv, int ordinal) {
        return null;
    }
    
    @Override
    public boolean setStack(Fabric<TInventory> inv, int index, ItemStack stack) {
        return false;
    }

    @Override
    public int getMaxStackSize(Fabric<TInventory> inv) {
        return 0;
    }

    @Override
    public List<Lens<TInventory, ItemStack>> getChildren() {
        return Collections.<Lens<TInventory, ItemStack>>emptyList();
    }

    @Override
    public List<Lens<TInventory, ItemStack>> getSpanningChildren() {
        return Collections.<Lens<TInventory, ItemStack>>emptyList();
    }

    @Override
    public void invalidate(Fabric<TInventory> inv) {
    }

    @Override
    public Lens<TInventory, ItemStack> getLens(int index) {
        return null;
    }

    @Override
    public Collection<InventoryProperty<?, ?>> getProperties(int index) {
        return Collections.<InventoryProperty<?, ?>>emptyList();
    }
    
    @Override
    public Collection<InventoryProperty<?, ?>> getProperties(Lens<TInventory, ItemStack> child) {
        return Collections.<InventoryProperty<?, ?>>emptyList();
    }

    @Override
    public boolean has(Lens<TInventory, ItemStack> lens) {
        return false;
    }

    @Override
    public boolean isSubsetOf(Collection<Lens<TInventory, ItemStack>> c) {
        return true;
    }
    
    @Override
    public IntSet getSlots() {
        return DefaultEmptyLens.EMPTY_SLOT_SET;
    }
    
    @Override
    public boolean hasSlot(int index) {
        return false;
    }
    
    @Override
    public Lens<TInventory, ItemStack> getParent() {
        return null;
    }

    @Override
    public Iterator<Lens<TInventory, ItemStack>> iterator() {
        // TODO 
        return null;
    }

}
