package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExtensionsWindowLayoutInfoAdapter.kt */
/* loaded from: classes.dex */
public final class ExtensionsWindowLayoutInfoAdapter {
    public static final ExtensionsWindowLayoutInfoAdapter INSTANCE = new ExtensionsWindowLayoutInfoAdapter();

    private ExtensionsWindowLayoutInfoAdapter() {
    }

    private final boolean validBounds(Activity activity, Bounds bounds) {
        Rect bounds2 = WindowMetricsCalculatorCompat.INSTANCE.computeCurrentWindowMetrics(activity).getBounds();
        if (bounds.isZero()) {
            return false;
        }
        if (bounds.getWidth() != bounds2.width() && bounds.getHeight() != bounds2.height()) {
            return false;
        }
        if (bounds.getWidth() < bounds2.width() && bounds.getHeight() < bounds2.height()) {
            return false;
        }
        if (bounds.getWidth() == bounds2.width() && bounds.getHeight() == bounds2.height()) {
            return false;
        }
        return true;
    }

    public final FoldingFeature translate$window_release(Activity activity, androidx.window.extensions.layout.FoldingFeature oemFeature) {
        HardwareFoldingFeature.Type fold;
        FoldingFeature.State state;
        kotlin.jvm.internal.g.e(activity, "activity");
        kotlin.jvm.internal.g.e(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            fold = HardwareFoldingFeature.Type.Companion.getFOLD();
        } else if (type != 2) {
            return null;
        } else {
            fold = HardwareFoldingFeature.Type.Companion.getHINGE();
        }
        int state2 = oemFeature.getState();
        if (state2 == 1) {
            state = FoldingFeature.State.FLAT;
        } else if (state2 != 2) {
            return null;
        } else {
            state = FoldingFeature.State.HALF_OPENED;
        }
        Rect bounds = oemFeature.getBounds();
        kotlin.jvm.internal.g.d(bounds, "oemFeature.bounds");
        if (validBounds(activity, new Bounds(bounds))) {
            Rect bounds2 = oemFeature.getBounds();
            kotlin.jvm.internal.g.d(bounds2, "oemFeature.bounds");
            return new HardwareFoldingFeature(new Bounds(bounds2), fold, state);
        }
        return null;
    }

    public final WindowLayoutInfo translate$window_release(Activity activity, androidx.window.extensions.layout.WindowLayoutInfo info) {
        FoldingFeature foldingFeature;
        kotlin.jvm.internal.g.e(activity, "activity");
        kotlin.jvm.internal.g.e(info, "info");
        List<androidx.window.extensions.layout.FoldingFeature> displayFeatures = info.getDisplayFeatures();
        kotlin.jvm.internal.g.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (androidx.window.extensions.layout.FoldingFeature feature : displayFeatures) {
            if (feature instanceof androidx.window.extensions.layout.FoldingFeature) {
                ExtensionsWindowLayoutInfoAdapter extensionsWindowLayoutInfoAdapter = INSTANCE;
                kotlin.jvm.internal.g.d(feature, "feature");
                foldingFeature = extensionsWindowLayoutInfoAdapter.translate$window_release(activity, feature);
            } else {
                foldingFeature = null;
            }
            if (foldingFeature != null) {
                arrayList.add(foldingFeature);
            }
        }
        return new WindowLayoutInfo(arrayList);
    }
}
