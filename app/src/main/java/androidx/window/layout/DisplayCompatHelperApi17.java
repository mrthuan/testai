package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;

/* compiled from: DisplayCompatHelper.kt */
/* loaded from: classes.dex */
public final class DisplayCompatHelperApi17 {
    public static final DisplayCompatHelperApi17 INSTANCE = new DisplayCompatHelperApi17();

    private DisplayCompatHelperApi17() {
    }

    public final void getRealSize(Display display, Point point) {
        kotlin.jvm.internal.g.e(display, "display");
        kotlin.jvm.internal.g.e(point, "point");
        display.getRealSize(point);
    }
}
