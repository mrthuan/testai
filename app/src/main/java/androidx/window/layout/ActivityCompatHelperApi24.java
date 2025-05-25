package androidx.window.layout;

import android.app.Activity;

/* compiled from: ActivityCompatHelper.kt */
/* loaded from: classes.dex */
public final class ActivityCompatHelperApi24 {
    public static final ActivityCompatHelperApi24 INSTANCE = new ActivityCompatHelperApi24();

    private ActivityCompatHelperApi24() {
    }

    public final boolean isInMultiWindowMode(Activity activity) {
        boolean isInMultiWindowMode;
        kotlin.jvm.internal.g.e(activity, "activity");
        isInMultiWindowMode = activity.isInMultiWindowMode();
        return isInMultiWindowMode;
    }
}
