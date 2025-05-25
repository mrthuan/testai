package androidx.emoji2.text;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.view.DisplayCutout;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u {
    public static /* bridge */ /* synthetic */ AnimatedImageDrawable b(Drawable drawable) {
        return (AnimatedImageDrawable) drawable;
    }

    public static /* bridge */ /* synthetic */ DisplayCutout d(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
        accessibilityNodeInfo.setHeading(z10);
    }

    public static /* bridge */ /* synthetic */ boolean h(Spannable spannable) {
        return spannable instanceof PrecomputedText;
    }
}
