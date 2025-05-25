package androidx.window.layout;

import android.view.DisplayCutout;

/* compiled from: DisplayCompatHelper.kt */
/* loaded from: classes.dex */
public final class DisplayCompatHelperApi28 {
    public static final DisplayCompatHelperApi28 INSTANCE = new DisplayCompatHelperApi28();

    private DisplayCompatHelperApi28() {
    }

    public final int safeInsetBottom(DisplayCutout displayCutout) {
        int safeInsetBottom;
        kotlin.jvm.internal.g.e(displayCutout, "displayCutout");
        safeInsetBottom = displayCutout.getSafeInsetBottom();
        return safeInsetBottom;
    }

    public final int safeInsetLeft(DisplayCutout displayCutout) {
        int safeInsetLeft;
        kotlin.jvm.internal.g.e(displayCutout, "displayCutout");
        safeInsetLeft = displayCutout.getSafeInsetLeft();
        return safeInsetLeft;
    }

    public final int safeInsetRight(DisplayCutout displayCutout) {
        int safeInsetRight;
        kotlin.jvm.internal.g.e(displayCutout, "displayCutout");
        safeInsetRight = displayCutout.getSafeInsetRight();
        return safeInsetRight;
    }

    public final int safeInsetTop(DisplayCutout displayCutout) {
        int safeInsetTop;
        kotlin.jvm.internal.g.e(displayCutout, "displayCutout");
        safeInsetTop = displayCutout.getSafeInsetTop();
        return safeInsetTop;
    }
}
