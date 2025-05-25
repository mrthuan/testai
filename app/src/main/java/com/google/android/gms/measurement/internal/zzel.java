package com.google.android.gms.measurement.internal;

import a8.s;
import a8.v;
import com.google.android.gms.common.internal.Preconditions;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzel extends s {
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f11690d;

    /* renamed from: e  reason: collision with root package name */
    public int f11691e;

    /* renamed from: f  reason: collision with root package name */
    public String f11692f;

    /* renamed from: g  reason: collision with root package name */
    public long f11693g;

    /* renamed from: h  reason: collision with root package name */
    public final long f11694h;

    /* renamed from: i  reason: collision with root package name */
    public List f11695i;

    /* renamed from: j  reason: collision with root package name */
    public String f11696j;

    /* renamed from: k  reason: collision with root package name */
    public int f11697k;

    /* renamed from: l  reason: collision with root package name */
    public String f11698l;

    /* renamed from: m  reason: collision with root package name */
    public String f11699m;

    /* renamed from: n  reason: collision with root package name */
    public String f11700n;

    /* renamed from: o  reason: collision with root package name */
    public long f11701o;

    /* renamed from: p  reason: collision with root package name */
    public String f11702p;

    public zzel(zzge zzgeVar, long j10) {
        super(zzgeVar);
        this.f11701o = 0L;
        this.f11702p = null;
        this.f11694h = j10;
    }

    @Override // a8.s
    public final boolean p() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0154 A[Catch: IllegalStateException -> 0x01a3, TryCatch #4 {IllegalStateException -> 0x01a3, blocks: (B:47:0x0136, B:51:0x014c, B:53:0x0154, B:57:0x0170, B:60:0x017b, B:63:0x0181, B:56:0x016c, B:65:0x0185, B:67:0x019a, B:69:0x019f, B:68:0x019d), top: B:113:0x0136 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0185 A[Catch: IllegalStateException -> 0x01a3, TryCatch #4 {IllegalStateException -> 0x01a3, blocks: (B:47:0x0136, B:51:0x014c, B:53:0x0154, B:57:0x0170, B:60:0x017b, B:63:0x0181, B:56:0x016c, B:65:0x0185, B:67:0x019a, B:69:0x019f, B:68:0x019d), top: B:113:0x0136 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzel.q():void");
    }

    public final String r() {
        n();
        Preconditions.j(this.c);
        return this.c;
    }

    public final String s() {
        m();
        n();
        Preconditions.j(this.f11698l);
        return this.f11698l;
    }

    public final void t() {
        String format;
        String str;
        m();
        zzge zzgeVar = (zzge) this.f3529a;
        v vVar = zzgeVar.f11779h;
        zzge.d(vVar);
        if (!vVar.s().f(zzah.ANALYTICS_STORAGE)) {
            zzeu zzeuVar = zzgeVar.f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11719m.a("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            zzlo zzloVar = zzgeVar.f11783l;
            zzge.d(zzloVar);
            zzloVar.v().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        zzeu zzeuVar2 = zzgeVar.f11780i;
        zzge.f(zzeuVar2);
        Object[] objArr = new Object[1];
        if (format == null) {
            str = "null";
        } else {
            str = "not null";
        }
        objArr[0] = str;
        zzeuVar2.f11719m.a(String.format("Resetting session stitching token to %s", objArr));
        this.f11700n = format;
        zzgeVar.f11785n.getClass();
        this.f11701o = System.currentTimeMillis();
    }
}
