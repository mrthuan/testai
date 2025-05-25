package x3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* compiled from: MemorySizeCalculator.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f31606a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31607b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31608d;

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final int f31609e;

        /* renamed from: a  reason: collision with root package name */
        public final Context f31610a;

        /* renamed from: b  reason: collision with root package name */
        public final ActivityManager f31611b;
        public final b c;

        /* renamed from: d  reason: collision with root package name */
        public final float f31612d;

        static {
            int i10;
            if (Build.VERSION.SDK_INT < 26) {
                i10 = 4;
            } else {
                i10 = 1;
            }
            f31609e = i10;
        }

        public a(Context context) {
            this.f31612d = f31609e;
            this.f31610a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.f31611b = activityManager;
            this.c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && activityManager.isLowRamDevice()) {
                this.f31612d = 0.0f;
            }
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayMetrics f31613a;

        public b(DisplayMetrics displayMetrics) {
            this.f31613a = displayMetrics;
        }
    }

    public i(a aVar) {
        int i10;
        float f10;
        Context context = aVar.f31610a;
        this.c = context;
        ActivityManager activityManager = aVar.f31611b;
        if (activityManager.isLowRamDevice()) {
            i10 = 2097152;
        } else {
            i10 = 4194304;
        }
        this.f31608d = i10;
        boolean isLowRamDevice = activityManager.isLowRamDevice();
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (isLowRamDevice) {
            f10 = 0.33f;
        } else {
            f10 = 0.4f;
        }
        int round = Math.round(memoryClass * f10);
        DisplayMetrics displayMetrics = aVar.c.f31613a;
        float f11 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f12 = aVar.f31612d;
        int round2 = Math.round(f11 * f12);
        int round3 = Math.round(f11 * 2.0f);
        int i11 = round - i10;
        if (round3 + round2 <= i11) {
            this.f31607b = round3;
            this.f31606a = round2;
        } else {
            float f13 = i11 / (f12 + 2.0f);
            this.f31607b = Math.round(2.0f * f13);
            this.f31606a = Math.round(f13 * f12);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, this.f31607b);
            Formatter.formatFileSize(context, this.f31606a);
            Formatter.formatFileSize(context, i10);
            Formatter.formatFileSize(context, round);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }
}
