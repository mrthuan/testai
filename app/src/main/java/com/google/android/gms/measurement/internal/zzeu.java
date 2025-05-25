package com.google.android.gms.measurement.internal;

import a8.l0;
import a8.n;
import a8.o;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzpb;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzeu extends l0 {
    public char c;

    /* renamed from: d  reason: collision with root package name */
    public long f11710d;

    /* renamed from: e  reason: collision with root package name */
    public String f11711e;

    /* renamed from: f  reason: collision with root package name */
    public final zzes f11712f;

    /* renamed from: g  reason: collision with root package name */
    public final zzes f11713g;

    /* renamed from: h  reason: collision with root package name */
    public final zzes f11714h;

    /* renamed from: i  reason: collision with root package name */
    public final zzes f11715i;

    /* renamed from: j  reason: collision with root package name */
    public final zzes f11716j;

    /* renamed from: k  reason: collision with root package name */
    public final zzes f11717k;

    /* renamed from: l  reason: collision with root package name */
    public final zzes f11718l;

    /* renamed from: m  reason: collision with root package name */
    public final zzes f11719m;

    /* renamed from: n  reason: collision with root package name */
    public final zzes f11720n;

    public zzeu(zzge zzgeVar) {
        super(zzgeVar);
        this.c = (char) 0;
        this.f11710d = -1L;
        this.f11712f = new zzes(this, 6, false, false);
        this.f11713g = new zzes(this, 6, true, false);
        this.f11714h = new zzes(this, 6, false, true);
        this.f11715i = new zzes(this, 5, false, false);
        this.f11716j = new zzes(this, 5, true, false);
        this.f11717k = new zzes(this, 5, false, true);
        this.f11718l = new zzes(this, 4, false, false);
        this.f11719m = new zzes(this, 3, false, false);
        this.f11720n = new zzes(this, 2, false, false);
    }

    public static o v(String str) {
        if (str == null) {
            return null;
        }
        return new o(str);
    }

    public static String w(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String x4 = x(obj, z10);
        String x10 = x(obj2, z10);
        String x11 = x(obj3, z10);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(x4)) {
            sb2.append(str2);
            sb2.append(x4);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(x10)) {
            sb2.append(str2);
            sb2.append(x10);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(x11)) {
            sb2.append(str3);
            sb2.append(x11);
        }
        return sb2.toString();
    }

    @VisibleForTesting
    public static String x(Object obj, boolean z10) {
        String th2;
        String className;
        String str = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb2 = new StringBuilder();
            if (charAt == '-') {
                str = "-";
            }
            sb2.append(str);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str);
            sb2.append(round2);
            return sb2.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th3 = (Throwable) obj;
                if (z10) {
                    th2 = th3.getClass().getName();
                } else {
                    th2 = th3.toString();
                }
                StringBuilder sb3 = new StringBuilder(th2);
                String y10 = y(zzge.class.getCanonicalName());
                StackTraceElement[] stackTrace = th3.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i10];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && y(className).equals(y10)) {
                        sb3.append(": ");
                        sb3.append(stackTraceElement);
                        break;
                    }
                    i10++;
                }
                return sb3.toString();
            } else if (obj instanceof o) {
                return ((o) obj).f268a;
            } else {
                if (z10) {
                    return "-";
                }
                return obj.toString();
            }
        }
    }

    @VisibleForTesting
    public static String y(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            zzpb.zzc();
            if (((Boolean) zzeh.f11676s0.a(null)).booleanValue()) {
                return "";
            }
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    public final void A(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(z(), i10)) {
            Log.println(i10, z(), w(false, str, obj, obj2, obj3));
        }
        if (!z11 && i10 >= 5) {
            Preconditions.j(str);
            zzgb zzgbVar = ((zzge) this.f3529a).f11781j;
            if (zzgbVar == null) {
                Log.println(6, z(), "Scheduler not set. Not logging error/warn");
            } else if (!zzgbVar.f219b) {
                Log.println(6, z(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i10 >= 9) {
                    i10 = 8;
                }
                zzgbVar.u(new n(this, i10, str, obj, obj2, obj3));
            }
        }
    }

    @Override // a8.l0
    public final boolean n() {
        return false;
    }

    public final zzes q() {
        return this.f11719m;
    }

    public final zzes r() {
        return this.f11712f;
    }

    public final zzes s() {
        return this.f11720n;
    }

    public final zzes t() {
        return this.f11715i;
    }

    public final zzes u() {
        return this.f11717k;
    }

    @VisibleForTesting
    public final String z() {
        String str;
        synchronized (this) {
            try {
                if (this.f11711e == null) {
                    Object obj = this.f3529a;
                    if (((zzge) obj).f11775d != null) {
                        this.f11711e = ((zzge) obj).f11775d;
                    } else {
                        ((zzge) ((zzge) obj).f11778g.f3529a).getClass();
                        this.f11711e = "FA";
                    }
                }
                Preconditions.j(this.f11711e);
                str = this.f11711e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
