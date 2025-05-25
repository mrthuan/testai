package androidx.lifecycle;

import android.graphics.Insets;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 {
    public static /* bridge */ /* synthetic */ Insets a(WindowInsets windowInsets) {
        return windowInsets.getSystemGestureInsets();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction d() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
    }

    public static /* bridge */ /* synthetic */ void h(WindowInsets.Builder builder, Insets insets) {
        builder.setSystemWindowInsets(insets);
    }
}
