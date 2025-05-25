package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;

/* compiled from: WindowMetrics.kt */
/* loaded from: classes.dex */
public final class WindowMetrics {
    private final Bounds _bounds;

    public WindowMetrics(Bounds _bounds) {
        kotlin.jvm.internal.g.e(_bounds, "_bounds");
        this._bounds = _bounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kotlin.jvm.internal.g.a(WindowMetrics.class, obj.getClass())) {
            return kotlin.jvm.internal.g.a(this._bounds, ((WindowMetrics) obj)._bounds);
        }
        return false;
    }

    public final Rect getBounds() {
        return this._bounds.toRect();
    }

    public int hashCode() {
        return this._bounds.hashCode();
    }

    public String toString() {
        return "WindowMetrics { bounds: " + getBounds() + " }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WindowMetrics(Rect bounds) {
        this(new Bounds(bounds));
        kotlin.jvm.internal.g.e(bounds, "bounds");
    }
}
