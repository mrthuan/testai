package androidx.window.layout;

import java.util.List;
import kotlin.collections.m;

/* compiled from: WindowLayoutInfo.kt */
/* loaded from: classes.dex */
public final class WindowLayoutInfo {
    private final List<DisplayFeature> displayFeatures;

    /* JADX WARN: Multi-variable type inference failed */
    public WindowLayoutInfo(List<? extends DisplayFeature> displayFeatures) {
        kotlin.jvm.internal.g.e(displayFeatures, "displayFeatures");
        this.displayFeatures = displayFeatures;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kotlin.jvm.internal.g.a(WindowLayoutInfo.class, obj.getClass())) {
            return kotlin.jvm.internal.g.a(this.displayFeatures, ((WindowLayoutInfo) obj).displayFeatures);
        }
        return false;
    }

    public final List<DisplayFeature> getDisplayFeatures() {
        return this.displayFeatures;
    }

    public int hashCode() {
        return this.displayFeatures.hashCode();
    }

    public String toString() {
        return m.w0(this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
