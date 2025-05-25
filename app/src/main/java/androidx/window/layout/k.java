package androidx.window.layout;

import android.app.ActivityManager;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.view.DisplayCutout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k {
    public static /* synthetic */ ActivityManager.TaskDescription a(String str, int i10) {
        return new ActivityManager.TaskDescription(str, 0, i10);
    }

    public static /* bridge */ /* synthetic */ boolean h(Drawable drawable) {
        return drawable instanceof AnimatedImageDrawable;
    }

    public static /* bridge */ /* synthetic */ boolean i(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
