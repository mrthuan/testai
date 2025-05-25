package y0;

import android.view.accessibility.AccessibilityEvent;

/* compiled from: AccessibilityEventCompat.java */
/* loaded from: classes.dex */
public final class b {
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }
}
