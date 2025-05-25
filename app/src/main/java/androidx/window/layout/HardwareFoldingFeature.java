package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;

/* compiled from: HardwareFoldingFeature.kt */
/* loaded from: classes.dex */
public final class HardwareFoldingFeature implements FoldingFeature {
    public static final Companion Companion = new Companion(null);
    private final Bounds featureBounds;
    private final FoldingFeature.State state;
    private final Type type;

    /* compiled from: HardwareFoldingFeature.kt */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.d dVar) {
            this();
        }

        public final void validateFeatureBounds$window_release(Bounds bounds) {
            boolean z10;
            kotlin.jvm.internal.g.e(bounds, "bounds");
            boolean z11 = false;
            if (bounds.getWidth() == 0 && bounds.getHeight() == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (bounds.getLeft() == 0 || bounds.getTop() == 0) {
                    z11 = true;
                }
                if (z11) {
                    return;
                }
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
            throw new IllegalArgumentException("Bounds must be non zero".toString());
        }
    }

    /* compiled from: HardwareFoldingFeature.kt */
    /* loaded from: classes.dex */
    public static final class Type {
        public static final Companion Companion = new Companion(null);
        private static final Type FOLD = new Type("FOLD");
        private static final Type HINGE = new Type("HINGE");
        private final String description;

        /* compiled from: HardwareFoldingFeature.kt */
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.d dVar) {
                this();
            }

            public final Type getFOLD() {
                return Type.FOLD;
            }

            public final Type getHINGE() {
                return Type.HINGE;
            }
        }

        private Type(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    public HardwareFoldingFeature(Bounds featureBounds, Type type, FoldingFeature.State state) {
        kotlin.jvm.internal.g.e(featureBounds, "featureBounds");
        kotlin.jvm.internal.g.e(type, "type");
        kotlin.jvm.internal.g.e(state, "state");
        this.featureBounds = featureBounds;
        this.type = type;
        this.state = state;
        Companion.validateFeatureBounds$window_release(featureBounds);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!kotlin.jvm.internal.g.a(HardwareFoldingFeature.class, cls)) {
            return false;
        }
        if (obj != null) {
            HardwareFoldingFeature hardwareFoldingFeature = (HardwareFoldingFeature) obj;
            if (kotlin.jvm.internal.g.a(this.featureBounds, hardwareFoldingFeature.featureBounds) && kotlin.jvm.internal.g.a(this.type, hardwareFoldingFeature.type) && kotlin.jvm.internal.g.a(getState(), hardwareFoldingFeature.getState())) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
    }

    @Override // androidx.window.layout.DisplayFeature
    public Rect getBounds() {
        return this.featureBounds.toRect();
    }

    @Override // androidx.window.layout.FoldingFeature
    public FoldingFeature.OcclusionType getOcclusionType() {
        if (this.featureBounds.getWidth() != 0 && this.featureBounds.getHeight() != 0) {
            return FoldingFeature.OcclusionType.FULL;
        }
        return FoldingFeature.OcclusionType.NONE;
    }

    @Override // androidx.window.layout.FoldingFeature
    public FoldingFeature.Orientation getOrientation() {
        if (this.featureBounds.getWidth() > this.featureBounds.getHeight()) {
            return FoldingFeature.Orientation.HORIZONTAL;
        }
        return FoldingFeature.Orientation.VERTICAL;
    }

    @Override // androidx.window.layout.FoldingFeature
    public FoldingFeature.State getState() {
        return this.state;
    }

    public final Type getType$window_release() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode();
        return getState().hashCode() + ((hashCode + (this.featureBounds.hashCode() * 31)) * 31);
    }

    @Override // androidx.window.layout.FoldingFeature
    public boolean isSeparating() {
        Type type = this.type;
        Type.Companion companion = Type.Companion;
        if (kotlin.jvm.internal.g.a(type, companion.getHINGE())) {
            return true;
        }
        if (kotlin.jvm.internal.g.a(this.type, companion.getFOLD()) && kotlin.jvm.internal.g.a(getState(), FoldingFeature.State.HALF_OPENED)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "HardwareFoldingFeature { " + this.featureBounds + ", type=" + this.type + ", state=" + getState() + " }";
    }
}
