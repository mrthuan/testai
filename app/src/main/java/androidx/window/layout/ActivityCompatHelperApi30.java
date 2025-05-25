package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;

/* compiled from: ActivityCompatHelper.kt */
/* loaded from: classes.dex */
public final class ActivityCompatHelperApi30 {
    public static final ActivityCompatHelperApi30 INSTANCE = new ActivityCompatHelperApi30();

    private ActivityCompatHelperApi30() {
    }

    public final Rect currentWindowBounds(Activity activity) {
        android.view.WindowMetrics currentWindowMetrics;
        Rect bounds;
        kotlin.jvm.internal.g.e(activity, "activity");
        currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        kotlin.jvm.internal.g.d(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    public final Rect maximumWindowBounds(Activity activity) {
        android.view.WindowMetrics maximumWindowMetrics;
        Rect bounds;
        kotlin.jvm.internal.g.e(activity, "activity");
        maximumWindowMetrics = activity.getWindowManager().getMaximumWindowMetrics();
        bounds = maximumWindowMetrics.getBounds();
        kotlin.jvm.internal.g.d(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
