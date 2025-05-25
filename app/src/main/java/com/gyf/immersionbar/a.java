package com.gyf.immersionbar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: BarConfig.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f13750a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13751b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13752d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13753e;

    /* renamed from: f  reason: collision with root package name */
    public final float f13754f;

    public a(Activity activity) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        String str;
        if (activity.getResources().getConfiguration().orientation == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13753e = z10;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        float f10 = displayMetrics.density;
        this.f13754f = Math.min(displayMetrics.widthPixels / f10, displayMetrics.heightPixels / f10);
        this.f13750a = a(activity, "status_bar_height");
        View findViewById = activity.getWindow().findViewById(R.id.action_bar_container);
        if (findViewById != null) {
            i10 = findViewById.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(16843499, typedValue, true);
            TypedValue.complexToDimensionPixelSize(typedValue.data, activity.getResources().getDisplayMetrics());
        }
        if (b(activity)) {
            if (activity.getResources().getConfiguration().orientation == 1) {
                str = "navigation_bar_height";
            } else {
                str = "navigation_bar_height_landscape";
            }
            i11 = a(activity, str);
        } else {
            i11 = 0;
        }
        this.c = i11;
        if (b(activity)) {
            i12 = a(activity, "navigation_bar_width");
        } else {
            i12 = 0;
        }
        this.f13752d = i12;
        this.f13751b = i11 > 0;
    }

    public static int a(Context context, String str) {
        float f10;
        try {
            int identifier = Resources.getSystem().getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
                if (dimensionPixelSize2 >= dimensionPixelSize && (Build.VERSION.SDK_INT < 29 || str.equals("status_bar_height"))) {
                    return dimensionPixelSize2;
                }
                float f11 = (dimensionPixelSize * Resources.getSystem().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density;
                if (f11 >= 0.0f) {
                    f10 = f11 + 0.5f;
                } else {
                    f10 = f11 - 0.5f;
                }
                return (int) f10;
            }
            return 0;
        } catch (Resources.NotFoundException unused) {
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
        if (android.provider.Settings.Global.getInt(r2, "navigation_bar_gesture_hint", 1) == 1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
        if (r3 != 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0087, code lost:
        if (r3 != 3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0096, code lost:
        if (r3 != 2) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00aa, code lost:
        if (android.provider.Settings.Global.getInt(r2, "hide_gesture_line", -1) != 1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ac, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c2, code lost:
        if (r3 != 1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cb  */
    @android.annotation.TargetApi(14)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(android.app.Activity r8) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gyf.immersionbar.a.b(android.app.Activity):boolean");
    }

    public final boolean c() {
        if (this.f13754f < 600.0f && !this.f13753e) {
            return false;
        }
        return true;
    }
}
