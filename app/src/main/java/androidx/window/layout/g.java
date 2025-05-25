package androidx.window.layout;

import android.graphics.drawable.AnimatedImageDrawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.TracingConfig;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g {
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction f() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
    }

    public static /* synthetic */ void g() {
        new TracingConfig.Builder();
    }

    public static /* bridge */ /* synthetic */ void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
        accessibilityNodeInfo.setScreenReaderFocusable(z10);
    }

    public static /* bridge */ /* synthetic */ boolean m(Object obj) {
        return obj instanceof AnimatedImageDrawable;
    }
}
