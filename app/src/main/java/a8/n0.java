package a8;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzg;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzge;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class n0 {
    public long A;
    public long B;
    public long C;
    public String D;
    public boolean E;
    public long F;
    public long G;

    /* renamed from: a  reason: collision with root package name */
    public final zzge f239a;

    /* renamed from: b  reason: collision with root package name */
    public final String f240b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f241d;

    /* renamed from: e  reason: collision with root package name */
    public String f242e;

    /* renamed from: f  reason: collision with root package name */
    public String f243f;

    /* renamed from: g  reason: collision with root package name */
    public long f244g;

    /* renamed from: h  reason: collision with root package name */
    public long f245h;

    /* renamed from: i  reason: collision with root package name */
    public long f246i;

    /* renamed from: j  reason: collision with root package name */
    public String f247j;

    /* renamed from: k  reason: collision with root package name */
    public long f248k;

    /* renamed from: l  reason: collision with root package name */
    public String f249l;

    /* renamed from: m  reason: collision with root package name */
    public long f250m;

    /* renamed from: n  reason: collision with root package name */
    public long f251n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f252o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f253p;

    /* renamed from: q  reason: collision with root package name */
    public String f254q;

    /* renamed from: r  reason: collision with root package name */
    public Boolean f255r;

    /* renamed from: s  reason: collision with root package name */
    public long f256s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList f257t;

    /* renamed from: u  reason: collision with root package name */
    public String f258u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f259v;

    /* renamed from: w  reason: collision with root package name */
    public long f260w;

    /* renamed from: x  reason: collision with root package name */
    public long f261x;

    /* renamed from: y  reason: collision with root package name */
    public long f262y;

    /* renamed from: z  reason: collision with root package name */
    public long f263z;

    public n0(zzge zzgeVar, String str) {
        Preconditions.j(zzgeVar);
        Preconditions.f(str);
        this.f239a = zzgeVar;
        this.f240b = str;
        zzgb zzgbVar = zzgeVar.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
    }

    public final long A() {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        return this.f248k;
    }

    public final long B() {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        return this.f256s;
    }

    public final String C() {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        return this.f254q;
    }

    public final String D() {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        String str = this.D;
        r(null);
        return str;
    }

    public final String E() {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        return this.f240b;
    }

    public final String F() {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        return this.c;
    }

    public final String G() {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        return this.f247j;
    }

    public final String H() {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        return this.f243f;
    }

    public final String I() {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        return this.f241d;
    }

    public final void a(String str) {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= true ^ zzg.a(this.f254q, str);
        this.f254q = str;
    }

    public final void b(String str) {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        this.E |= !zzg.a(this.c, str);
        this.c = str;
    }

    public final void c(String str) {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        this.E |= !zzg.a(this.f249l, str);
        this.f249l = str;
    }

    public final void d(String str) {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        this.E |= !zzg.a(this.f247j, str);
        this.f247j = str;
    }

    public final void e(long j10) {
        boolean z10;
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        boolean z11 = this.E;
        if (this.f248k != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z11 | z10;
        this.f248k = j10;
    }

    public final void f(long j10) {
        boolean z10;
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        boolean z11 = this.E;
        if (this.F != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z11 | z10;
        this.F = j10;
    }

    public final void g(long j10) {
        boolean z10;
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        boolean z11 = this.E;
        if (this.A != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z11 | z10;
        this.A = j10;
    }

    public final void h(long j10) {
        boolean z10;
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        boolean z11 = this.E;
        if (this.B != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z11 | z10;
        this.B = j10;
    }

    public final void i(long j10) {
        boolean z10;
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        boolean z11 = this.E;
        if (this.f263z != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z11 | z10;
        this.f263z = j10;
    }

    public final void j(long j10) {
        boolean z10;
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        boolean z11 = this.E;
        if (this.f262y != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z11 | z10;
        this.f262y = j10;
    }

    public final void k(long j10) {
        boolean z10;
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        boolean z11 = this.E;
        if (this.C != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z11 | z10;
        this.C = j10;
    }

    public final void l(long j10) {
        boolean z10;
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        boolean z11 = this.E;
        if (this.f261x != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z11 | z10;
        this.f261x = j10;
    }

    public final void m(long j10) {
        boolean z10;
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        boolean z11 = this.E;
        if (this.f251n != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z11 | z10;
        this.f251n = j10;
    }

    public final void n(long j10) {
        boolean z10;
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        boolean z11 = this.E;
        if (this.f256s != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z11 | z10;
        this.f256s = j10;
    }

    public final void o(String str) {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        this.E |= !zzg.a(this.f243f, str);
        this.f243f = str;
    }

    public final void p(String str) {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= true ^ zzg.a(this.f241d, str);
        this.f241d = str;
    }

    public final void q(long j10) {
        boolean z10;
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        boolean z11 = this.E;
        if (this.f250m != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z11 | z10;
        this.f250m = j10;
    }

    public final void r(String str) {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        this.E |= !zzg.a(this.D, str);
        this.D = str;
    }

    public final void s(long j10) {
        boolean z10;
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        boolean z11 = this.E;
        if (this.f246i != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z11 | z10;
        this.f246i = j10;
    }

    public final void t(long j10) {
        boolean z10;
        boolean z11 = true;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.b(z10);
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        boolean z12 = this.E;
        if (this.f244g == j10) {
            z11 = false;
        }
        this.E = z12 | z11;
        this.f244g = j10;
    }

    public final void u(long j10) {
        boolean z10;
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        boolean z11 = this.E;
        if (this.f245h != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z11 | z10;
        this.f245h = j10;
    }

    public final void v(boolean z10) {
        boolean z11;
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        boolean z12 = this.E;
        if (this.f252o != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.E = z12 | z11;
        this.f252o = z10;
    }

    public final void w(String str) {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        this.E |= !zzg.a(this.f242e, str);
        this.f242e = str;
    }

    public final void x(List list) {
        ArrayList arrayList;
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        if (!zzg.a(this.f257t, list)) {
            this.E = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.f257t = arrayList;
        }
    }

    public final boolean y() {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        return this.f253p;
    }

    public final boolean z() {
        zzgb zzgbVar = this.f239a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        return this.f259v;
    }
}
