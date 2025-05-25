package com.google.android.gms.ads;

import a0.a;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzfru;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class AdSize {

    /* renamed from: i  reason: collision with root package name */
    public static final AdSize f10014i = new AdSize(320, 50, "320x50_mb");

    /* renamed from: j  reason: collision with root package name */
    public static final AdSize f10015j = new AdSize(468, 60, "468x60_as");

    /* renamed from: k  reason: collision with root package name */
    public static final AdSize f10016k = new AdSize(320, 100, "320x100_as");

    /* renamed from: l  reason: collision with root package name */
    public static final AdSize f10017l = new AdSize(728, 90, "728x90_as");

    /* renamed from: m  reason: collision with root package name */
    public static final AdSize f10018m = new AdSize(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT, 250, "300x250_as");

    /* renamed from: n  reason: collision with root package name */
    public static final AdSize f10019n = new AdSize(160, OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD, "160x600_as");
    @Deprecated

    /* renamed from: o  reason: collision with root package name */
    public static final AdSize f10020o = new AdSize(-1, -2, "smart_banner");

    /* renamed from: p  reason: collision with root package name */
    public static final AdSize f10021p = new AdSize(-3, -4, "fluid");

    /* renamed from: q  reason: collision with root package name */
    public static final AdSize f10022q = new AdSize(0, 0, "invalid");

    /* renamed from: r  reason: collision with root package name */
    public static final AdSize f10023r = new AdSize(50, 50, "50x50_mb");

    /* renamed from: a  reason: collision with root package name */
    public final int f10024a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10025b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10026d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10027e;

    /* renamed from: f  reason: collision with root package name */
    public int f10028f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10029g;

    /* renamed from: h  reason: collision with root package name */
    public int f10030h;

    static {
        new AdSize(-3, 0, "search_v2");
    }

    public AdSize(int i10, int i11) {
        this(i10, i11, a.j(i10 == -1 ? "FULL" : String.valueOf(i10), "x", i11 == -2 ? "AUTO" : String.valueOf(i11), "_as"));
    }

    public static AdSize a(Context context, int i10) {
        int i11;
        int round;
        AdSize adSize;
        DisplayMetrics displayMetrics;
        zzfru zzfruVar = com.google.android.gms.ads.internal.util.client.zzf.f10351b;
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null && resources.getConfiguration() != null) {
            i11 = Math.round(displayMetrics.heightPixels / displayMetrics.density);
        } else {
            i11 = -1;
        }
        if (i11 == -1) {
            adSize = f10022q;
        } else {
            int min = Math.min(90, Math.round(i11 * 0.15f));
            if (i10 > 655) {
                round = Math.round((i10 / 728.0f) * 90.0f);
            } else if (i10 > 632) {
                round = 81;
            } else if (i10 > 526) {
                round = Math.round((i10 / 468.0f) * 60.0f);
            } else if (i10 > 432) {
                round = 68;
            } else {
                round = Math.round((i10 / 320.0f) * 50.0f);
            }
            adSize = new AdSize(i10, Math.max(Math.min(round, min), 50));
        }
        adSize.f10026d = true;
        return adSize;
    }

    public static AdSize c(int i10, int i11) {
        AdSize adSize = new AdSize(i10, 0);
        adSize.f10028f = i11;
        adSize.f10027e = true;
        if (i11 < 32) {
            zzm.e("The maximum height set for the inline adaptive ad size was " + i11 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return adSize;
    }

    public final int b(Context context) {
        int i10;
        int i11 = this.f10025b;
        if (i11 != -4 && i11 != -3) {
            if (i11 != -2) {
                com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzay.f10107f.f10108a;
                return com.google.android.gms.ads.internal.util.client.zzf.o(context, i11);
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Parcelable.Creator<zzq> creator = zzq.CREATOR;
            float f10 = displayMetrics.density;
            int i12 = (int) (displayMetrics.heightPixels / f10);
            if (i12 <= 400) {
                i10 = 32;
            } else if (i12 <= 720) {
                i10 = 50;
            } else {
                i10 = 90;
            }
            return (int) (i10 * f10);
        }
        return -1;
    }

    public final int d(Context context) {
        int i10 = this.f10024a;
        if (i10 == -3) {
            return -1;
        }
        if (i10 != -1) {
            com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzay.f10107f.f10108a;
            return com.google.android.gms.ads.internal.util.client.zzf.o(context, i10);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzq> creator = zzq.CREATOR;
        return displayMetrics.widthPixels;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        if (this.f10024a != adSize.f10024a || this.f10025b != adSize.f10025b || !this.c.equals(adSize.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }

    public AdSize(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            throw new IllegalArgumentException(b.a.c("Invalid width for AdSize: ", i10));
        }
        if (i11 < 0 && i11 != -2 && i11 != -4) {
            throw new IllegalArgumentException(b.a.c("Invalid height for AdSize: ", i11));
        }
        this.f10024a = i10;
        this.f10025b = i11;
        this.c = str;
    }
}
