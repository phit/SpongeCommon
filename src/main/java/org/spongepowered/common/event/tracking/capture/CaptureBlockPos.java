package org.spongepowered.common.event.tracking.capture;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldServer;
import org.spongepowered.common.event.tracking.PhaseContext;
import org.spongepowered.common.interfaces.world.IMixinWorldServer;

import javax.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Optional;

public final class CaptureBlockPos {

    @Nullable
    private BlockPos pos;
    @Nullable private WeakReference<IMixinWorldServer> mixinWorldReference;

    public CaptureBlockPos() {
    }

    public CaptureBlockPos(@Nullable BlockPos pos) {
        this.pos = pos;
    }

    public Optional<BlockPos> getPos() {
        return Optional.ofNullable(this.pos);
    }

    public void setPos(@Nullable BlockPos pos) {
        this.pos = pos;
    }

    public void setWorld(@Nullable IMixinWorldServer world) {
        if (world == null) {
            this.mixinWorldReference = null;
        } else {
            this.mixinWorldReference = new WeakReference<>(world);
        }
    }

    public void setWorld(@Nullable WorldServer world) {
        if (world == null) {
            this.mixinWorldReference = null;
        } else {
            this.mixinWorldReference = new WeakReference<>((IMixinWorldServer) world);
        }
    }

    public Optional<IMixinWorldServer> getMixinWorld() {
        return this.mixinWorldReference == null ? Optional.empty() : Optional.ofNullable(this.mixinWorldReference.get());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CaptureBlockPos that = (CaptureBlockPos) o;
        return com.google.common.base.Objects.equal(this.pos, that.pos);
    }

    @Override
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(this.pos);
    }
}
