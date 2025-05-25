package com.google.android.gms.measurement.internal;

import a8.b;
import a8.b1;
import a8.c2;
import a8.e;
import a8.g;
import a8.h2;
import a8.i2;
import a8.m0;
import a8.n0;
import a8.r;
import a8.u;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.android.billingclient.api.a0;
import com.android.billingclient.api.n;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzpw;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.measurement.zzra;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l.t;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzlg implements m0 {
    public static volatile zzlg F;
    public final HashMap A;
    public final HashMap B;
    public zziq C;
    public String D;

    /* renamed from: a  reason: collision with root package name */
    public final zzfv f11883a;

    /* renamed from: b  reason: collision with root package name */
    public final zzfa f11884b;
    public e c;

    /* renamed from: d  reason: collision with root package name */
    public u f11885d;

    /* renamed from: e  reason: collision with root package name */
    public zzkr f11886e;

    /* renamed from: f  reason: collision with root package name */
    public b f11887f;

    /* renamed from: g  reason: collision with root package name */
    public final zzli f11888g;

    /* renamed from: h  reason: collision with root package name */
    public b1 f11889h;

    /* renamed from: i  reason: collision with root package name */
    public zzka f11890i;

    /* renamed from: k  reason: collision with root package name */
    public zzfm f11892k;

    /* renamed from: l  reason: collision with root package name */
    public final zzge f11893l;

    /* renamed from: n  reason: collision with root package name */
    public boolean f11895n;
    @VisibleForTesting

    /* renamed from: o  reason: collision with root package name */
    public long f11896o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f11897p;

    /* renamed from: q  reason: collision with root package name */
    public int f11898q;

    /* renamed from: r  reason: collision with root package name */
    public int f11899r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f11900s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f11901t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f11902u;

    /* renamed from: v  reason: collision with root package name */
    public FileLock f11903v;

    /* renamed from: w  reason: collision with root package name */
    public FileChannel f11904w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList f11905x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList f11906y;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11894m = false;
    public final a0 E = new a0(this, 6);

    /* renamed from: z  reason: collision with root package name */
    public long f11907z = -1;

    /* renamed from: j  reason: collision with root package name */
    public final zzkv f11891j = new zzkv(this);

    public zzlg(zzlh zzlhVar) {
        this.f11893l = zzge.n(zzlhVar.f11908a, null, null);
        zzli zzliVar = new zzli(this);
        zzliVar.o();
        this.f11888g = zzliVar;
        zzfa zzfaVar = new zzfa(this);
        zzfaVar.o();
        this.f11884b = zzfaVar;
        zzfv zzfvVar = new zzfv(this);
        zzfvVar.o();
        this.f11883a = zzfvVar;
        this.A = new HashMap();
        this.B = new HashMap();
        zzaB().u(new n(3, this, zzlhVar));
    }

    public static final boolean B(zzq zzqVar) {
        if (TextUtils.isEmpty(zzqVar.f11921b) && TextUtils.isEmpty(zzqVar.f11935q)) {
            return false;
        }
        return true;
    }

    public static final void C(c2 c2Var) {
        if (c2Var != null) {
            if (c2Var.c) {
                return;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(c2Var.getClass())));
        }
        throw new IllegalStateException("Upload Component not created");
    }

    public static zzlg I(Context context) {
        Preconditions.j(context);
        Preconditions.j(context.getApplicationContext());
        if (F == null) {
            synchronized (zzlg.class) {
                if (F == null) {
                    F = new zzlg(new zzlh(context));
                }
            }
        }
        return F;
    }

    @VisibleForTesting
    public static final void r(zzfs zzfsVar, int i10, String str) {
        List zzp = zzfsVar.zzp();
        for (int i11 = 0; i11 < zzp.size(); i11++) {
            if ("_err".equals(((zzfx) zzp.get(i11)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzfw zze = zzfx.zze();
        zze.zzj("_err");
        zze.zzi(Long.valueOf(i10).longValue());
        com.google.android.gms.internal.measurement.zzfw zze2 = zzfx.zze();
        zze2.zzj("_ev");
        zze2.zzk(str);
        zzfsVar.zzf((zzfx) zze.zzaD());
        zzfsVar.zzf((zzfx) zze2.zzaD());
    }

    @VisibleForTesting
    public static final void s(zzfs zzfsVar, String str) {
        List zzp = zzfsVar.zzp();
        for (int i10 = 0; i10 < zzp.size(); i10++) {
            if (str.equals(((zzfx) zzp.get(i10)).zzg())) {
                zzfsVar.zzh(i10);
                return;
            }
        }
    }

    public final boolean A(zzfs zzfsVar, zzfs zzfsVar2) {
        String zzh;
        Preconditions.b("_e".equals(zzfsVar.zzo()));
        zzli zzliVar = this.f11888g;
        C(zzliVar);
        zzfx q5 = zzli.q((zzft) zzfsVar.zzaD(), "_sc");
        String str = null;
        if (q5 == null) {
            zzh = null;
        } else {
            zzh = q5.zzh();
        }
        C(zzliVar);
        zzfx q6 = zzli.q((zzft) zzfsVar2.zzaD(), "_pc");
        if (q6 != null) {
            str = q6.zzh();
        }
        if (str != null && str.equals(zzh)) {
            Preconditions.b("_e".equals(zzfsVar.zzo()));
            C(zzliVar);
            zzfx q10 = zzli.q((zzft) zzfsVar.zzaD(), "_et");
            if (q10 != null && q10.zzw() && q10.zzd() > 0) {
                long zzd = q10.zzd();
                C(zzliVar);
                zzfx q11 = zzli.q((zzft) zzfsVar2.zzaD(), "_et");
                if (q11 != null && q11.zzd() > 0) {
                    zzd += q11.zzd();
                }
                C(zzliVar);
                zzli.P(zzfsVar2, "_et", Long.valueOf(zzd));
                C(zzliVar);
                zzli.P(zzfsVar, "_fr", 1L);
                return true;
            }
            return true;
        }
        return false;
    }

    public final n0 D(zzq zzqVar) {
        String str;
        Pair pair;
        boolean z10;
        boolean z11;
        zzaB().m();
        b();
        Preconditions.j(zzqVar);
        String str2 = zzqVar.f11920a;
        Preconditions.f(str2);
        String str3 = zzqVar.f11941w;
        if (!str3.isEmpty()) {
            this.B.put(str2, new h2(this, str3));
        }
        e eVar = this.c;
        C(eVar);
        n0 G = eVar.G(str2);
        zzai c = F(str2).c(zzai.b(zzqVar.f11940v));
        zzah zzahVar = zzah.AD_STORAGE;
        boolean f10 = c.f(zzahVar);
        boolean z12 = zzqVar.f11933o;
        if (!f10) {
            str = "";
        } else {
            str = this.f11890i.r(str2, z12);
        }
        if (G == null) {
            G = new n0(this.f11893l, str2);
            if (c.f(zzah.ANALYTICS_STORAGE)) {
                G.b(L(c));
            }
            if (c.f(zzahVar)) {
                G.w(str);
            }
        } else {
            if (c.f(zzahVar) && str != null) {
                zzgb zzgbVar = G.f239a.f11781j;
                zzge.f(zzgbVar);
                zzgbVar.m();
                if (!str.equals(G.f242e)) {
                    G.w(str);
                    if (z12) {
                        zzka zzkaVar = this.f11890i;
                        zzkaVar.getClass();
                        if (c.f(zzahVar)) {
                            pair = zzkaVar.q(str2);
                        } else {
                            pair = new Pair("", Boolean.FALSE);
                        }
                        if (!"00000000-0000-0000-0000-000000000000".equals(pair.first)) {
                            G.b(L(c));
                            e eVar2 = this.c;
                            C(eVar2);
                            if (eVar2.L(str2, "_id") != null) {
                                e eVar3 = this.c;
                                C(eVar3);
                                if (eVar3.L(str2, "_lair") == null) {
                                    ((DefaultClock) zzax()).getClass();
                                    i2 i2Var = new i2(zzqVar.f11920a, "auto", "_lair", System.currentTimeMillis(), 1L);
                                    e eVar4 = this.c;
                                    C(eVar4);
                                    eVar4.x(i2Var);
                                }
                            }
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(G.F()) && c.f(zzah.ANALYTICS_STORAGE)) {
                G.b(L(c));
            }
        }
        G.p(zzqVar.f11921b);
        G.a(zzqVar.f11935q);
        String str4 = zzqVar.f11929k;
        if (!TextUtils.isEmpty(str4)) {
            G.o(str4);
        }
        long j10 = zzqVar.f11923e;
        if (j10 != 0) {
            G.q(j10);
        }
        String str5 = zzqVar.c;
        if (!TextUtils.isEmpty(str5)) {
            G.d(str5);
        }
        G.e(zzqVar.f11928j);
        String str6 = zzqVar.f11922d;
        if (str6 != null) {
            G.c(str6);
        }
        G.m(zzqVar.f11924f);
        G.v(zzqVar.f11926h);
        String str7 = zzqVar.f11925g;
        if (!TextUtils.isEmpty(str7)) {
            G.r(str7);
        }
        zzge zzgeVar = G.f239a;
        zzgb zzgbVar2 = zzgeVar.f11781j;
        zzge.f(zzgbVar2);
        zzgbVar2.m();
        boolean z13 = G.E;
        boolean z14 = false;
        if (G.f253p != z12) {
            z10 = true;
        } else {
            z10 = false;
        }
        G.E = z13 | z10;
        G.f253p = z12;
        zzgb zzgbVar3 = zzgeVar.f11781j;
        zzge.f(zzgbVar3);
        zzgbVar3.m();
        boolean z15 = G.E;
        Boolean bool = G.f255r;
        Boolean bool2 = zzqVar.f11936r;
        G.E = z15 | (!zzg.a(bool, bool2));
        G.f255r = bool2;
        G.n(zzqVar.f11937s);
        zzqr.zzc();
        if (E().v(null, zzeh.f11658j0) || E().v(str2, zzeh.f11662l0)) {
            zzgb zzgbVar4 = zzgeVar.f11781j;
            zzge.f(zzgbVar4);
            zzgbVar4.m();
            boolean z16 = G.E;
            String str8 = G.f258u;
            String str9 = zzqVar.f11942x;
            G.E = z16 | (!zzg.a(str8, str9));
            G.f258u = str9;
        }
        zzop.zzc();
        if (E().v(null, zzeh.f11656i0)) {
            G.x(zzqVar.f11938t);
        } else {
            zzop.zzc();
            if (E().v(null, zzeh.f11654h0)) {
                G.x(null);
            }
        }
        zzra.zzc();
        if (E().v(null, zzeh.f11664m0)) {
            zzgb zzgbVar5 = zzgeVar.f11781j;
            zzge.f(zzgbVar5);
            zzgbVar5.m();
            boolean z17 = G.E;
            boolean z18 = G.f259v;
            boolean z19 = zzqVar.f11943y;
            if (z18 != z19) {
                z11 = true;
            } else {
                z11 = false;
            }
            G.E = z17 | z11;
            G.f259v = z19;
        }
        zzpw.zzc();
        if (E().v(null, zzeh.f11686x0)) {
            zzgb zzgbVar6 = zzgeVar.f11781j;
            zzge.f(zzgbVar6);
            zzgbVar6.m();
            boolean z20 = G.E;
            long j11 = G.f260w;
            long j12 = zzqVar.f11944z;
            if (j11 != j12) {
                z14 = true;
            }
            G.E = z20 | z14;
            G.f260w = j12;
        }
        zzgb zzgbVar7 = zzgeVar.f11781j;
        zzge.f(zzgbVar7);
        zzgbVar7.m();
        if (G.E) {
            e eVar5 = this.c;
            C(eVar5);
            eVar5.s(G);
        }
        return G;
    }

    public final zzag E() {
        zzge zzgeVar = this.f11893l;
        Preconditions.j(zzgeVar);
        return zzgeVar.f11778g;
    }

    public final zzai F(String str) {
        String str2;
        zzai zzaiVar = zzai.f11530b;
        zzaB().m();
        b();
        zzai zzaiVar2 = (zzai) this.A.get(str);
        if (zzaiVar2 == null) {
            e eVar = this.c;
            C(eVar);
            Preconditions.j(str);
            eVar.m();
            eVar.n();
            Cursor cursor = null;
            try {
                try {
                    cursor = eVar.F().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                    if (cursor.moveToFirst()) {
                        str2 = cursor.getString(0);
                        cursor.close();
                    } else {
                        cursor.close();
                        str2 = "G1";
                    }
                    zzai b10 = zzai.b(str2);
                    m(str, b10);
                    return b10;
                } catch (SQLiteException e10) {
                    zzeu zzeuVar = ((zzge) eVar.f3529a).f11780i;
                    zzge.f(zzeuVar);
                    zzeuVar.f11712f.c("select consent_state from consent_settings where app_id=? limit 1;", "Database error", e10);
                    throw e10;
                }
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        }
        return zzaiVar2;
    }

    public final e G() {
        e eVar = this.c;
        C(eVar);
        return eVar;
    }

    public final u H() {
        u uVar = this.f11885d;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzli J() {
        zzli zzliVar = this.f11888g;
        C(zzliVar);
        return zzliVar;
    }

    public final zzlo K() {
        zzge zzgeVar = this.f11893l;
        Preconditions.j(zzgeVar);
        zzlo zzloVar = zzgeVar.f11783l;
        zzge.d(zzloVar);
        return zzloVar;
    }

    public final String L(zzai zzaiVar) {
        if (zzaiVar.f(zzah.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            K().v().nextBytes(bArr);
            return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlg.a():void");
    }

    public final void b() {
        if (this.f11894m) {
            return;
        }
        throw new IllegalStateException("UploadController is not initialized");
    }

    public final void c(n0 n0Var) {
        y.b bVar;
        y.b bVar2;
        zzfv zzfvVar = this.f11883a;
        zzaB().m();
        if (TextUtils.isEmpty(n0Var.I()) && TextUtils.isEmpty(n0Var.C())) {
            String E = n0Var.E();
            Preconditions.j(E);
            g(E, 204, null, null, null);
            return;
        }
        Uri.Builder builder = new Uri.Builder();
        String I = n0Var.I();
        if (TextUtils.isEmpty(I)) {
            I = n0Var.C();
        }
        y.b bVar3 = null;
        Uri.Builder appendQueryParameter = builder.scheme((String) zzeh.f11649f.a(null)).encodedAuthority((String) zzeh.f11651g.a(null)).path("config/app/".concat(String.valueOf(I))).appendQueryParameter("platform", "android");
        ((zzge) this.f11891j.f3529a).f11778g.r();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(77000L)).appendQueryParameter("runtime_version", PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        String uri = builder.build().toString();
        try {
            String E2 = n0Var.E();
            Preconditions.j(E2);
            URL url = new URL(uri);
            zzaA().f11720n.b(E2, "Fetching remote configuration");
            C(zzfvVar);
            com.google.android.gms.internal.measurement.zzff w7 = zzfvVar.w(E2);
            C(zzfvVar);
            zzfvVar.m();
            String str = (String) zzfvVar.f11762m.getOrDefault(E2, null);
            if (w7 != null) {
                if (!TextUtils.isEmpty(str)) {
                    bVar2 = new y.b();
                    bVar2.put("If-Modified-Since", str);
                } else {
                    bVar2 = null;
                }
                C(zzfvVar);
                zzfvVar.m();
                String str2 = (String) zzfvVar.f11763n.getOrDefault(E2, null);
                if (!TextUtils.isEmpty(str2)) {
                    if (bVar2 == null) {
                        bVar2 = new y.b();
                    }
                    bVar3 = bVar2;
                    bVar3.put("If-None-Match", str2);
                } else {
                    bVar = bVar2;
                    this.f11900s = true;
                    zzfa zzfaVar = this.f11884b;
                    C(zzfaVar);
                    t tVar = new t(this);
                    zzfaVar.m();
                    zzfaVar.n();
                    zzgb zzgbVar = ((zzge) zzfaVar.f3529a).f11781j;
                    zzge.f(zzgbVar);
                    zzgbVar.t(new r(zzfaVar, E2, url, null, bVar, tVar));
                }
            }
            bVar = bVar3;
            this.f11900s = true;
            zzfa zzfaVar2 = this.f11884b;
            C(zzfaVar2);
            t tVar2 = new t(this);
            zzfaVar2.m();
            zzfaVar2.n();
            zzgb zzgbVar2 = ((zzge) zzfaVar2.f3529a).f11781j;
            zzge.f(zzgbVar2);
            zzgbVar2.t(new r(zzfaVar2, E2, url, null, bVar, tVar2));
        } catch (MalformedURLException unused) {
            zzaA().f11712f.c(zzeu.v(n0Var.E()), "Failed to parse config URL. Not fetching. appId", uri);
        }
    }

    public final void d(zzaw zzawVar, zzq zzqVar) {
        zziq zziqVar;
        boolean z10;
        zzaw zzawVar2;
        List P;
        zzge zzgeVar;
        List<zzac> P2;
        List P3;
        String str;
        Preconditions.j(zzqVar);
        String str2 = zzqVar.f11920a;
        Preconditions.f(str2);
        zzaB().m();
        b();
        long j10 = zzawVar.f11548d;
        zzev b10 = zzev.b(zzawVar);
        zzaB().m();
        if (this.C != null && (str = this.D) != null && str.equals(str2)) {
            zziqVar = this.C;
        } else {
            zziqVar = null;
        }
        zzlo.z(zziqVar, b10.f11723d, false);
        zzaw a10 = b10.a();
        C(this.f11888g);
        if (TextUtils.isEmpty(zzqVar.f11921b) && TextUtils.isEmpty(zzqVar.f11935q)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return;
        }
        if (!zzqVar.f11926h) {
            D(zzqVar);
            return;
        }
        List list = zzqVar.f11938t;
        if (list != null) {
            String str3 = a10.f11546a;
            if (list.contains(str3)) {
                Bundle d10 = a10.f11547b.d();
                d10.putLong("ga_safelisted", 1L);
                zzawVar2 = new zzaw(a10.f11546a, new zzau(d10), a10.c, a10.f11548d);
            } else {
                zzaA().f11719m.d("Dropping non-safelisted event. appId, event name, origin", str2, str3, a10.c);
                return;
            }
        } else {
            zzawVar2 = a10;
        }
        e eVar = this.c;
        C(eVar);
        eVar.S();
        try {
            e eVar2 = this.c;
            C(eVar2);
            Preconditions.f(str2);
            eVar2.m();
            eVar2.n();
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 < 0) {
                zzeu zzeuVar = ((zzge) eVar2.f3529a).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11715i.c(zzeu.v(str2), "Invalid time querying timed out conditional properties", Long.valueOf(j10));
                P = Collections.emptyList();
            } else {
                P = eVar2.P("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j10)});
            }
            Iterator it = P.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                zzgeVar = this.f11893l;
                if (!hasNext) {
                    break;
                }
                zzac zzacVar = (zzac) it.next();
                if (zzacVar != null) {
                    zzaA().f11720n.d("User property timed out", zzacVar.f11516a, zzgeVar.f11784m.f(zzacVar.c.f11910b), zzacVar.c.d());
                    zzaw zzawVar3 = zzacVar.f11521g;
                    if (zzawVar3 != null) {
                        p(new zzaw(zzawVar3, j10), zzqVar);
                    }
                    e eVar3 = this.c;
                    C(eVar3);
                    eVar3.B(str2, zzacVar.c.f11910b);
                }
            }
            e eVar4 = this.c;
            C(eVar4);
            Preconditions.f(str2);
            eVar4.m();
            eVar4.n();
            if (i10 < 0) {
                zzeu zzeuVar2 = ((zzge) eVar4.f3529a).f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11715i.c(zzeu.v(str2), "Invalid time querying expired conditional properties", Long.valueOf(j10));
                P2 = Collections.emptyList();
            } else {
                P2 = eVar4.P("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j10)});
            }
            ArrayList arrayList = new ArrayList(P2.size());
            for (zzac zzacVar2 : P2) {
                if (zzacVar2 != null) {
                    zzaA().f11720n.d("User property expired", zzacVar2.f11516a, zzgeVar.f11784m.f(zzacVar2.c.f11910b), zzacVar2.c.d());
                    e eVar5 = this.c;
                    C(eVar5);
                    eVar5.q(str2, zzacVar2.c.f11910b);
                    zzaw zzawVar4 = zzacVar2.f11525k;
                    if (zzawVar4 != null) {
                        arrayList.add(zzawVar4);
                    }
                    e eVar6 = this.c;
                    C(eVar6);
                    eVar6.B(str2, zzacVar2.c.f11910b);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                p(new zzaw((zzaw) it2.next(), j10), zzqVar);
            }
            e eVar7 = this.c;
            C(eVar7);
            Object obj = eVar7.f3529a;
            String str4 = zzawVar2.f11546a;
            Preconditions.f(str2);
            Preconditions.f(str4);
            eVar7.m();
            eVar7.n();
            if (i10 < 0) {
                zzeu zzeuVar3 = ((zzge) obj).f11780i;
                zzge.f(zzeuVar3);
                zzeuVar3.f11715i.d("Invalid time querying triggered conditional properties", zzeu.v(str2), ((zzge) obj).f11784m.d(str4), Long.valueOf(j10));
                P3 = Collections.emptyList();
            } else {
                P3 = eVar7.P("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j10)});
            }
            ArrayList arrayList2 = new ArrayList(P3.size());
            Iterator it3 = P3.iterator();
            while (it3.hasNext()) {
                zzac zzacVar3 = (zzac) it3.next();
                if (zzacVar3 != null) {
                    zzlj zzljVar = zzacVar3.c;
                    String str5 = zzacVar3.f11516a;
                    Preconditions.j(str5);
                    String str6 = zzacVar3.f11517b;
                    String str7 = zzljVar.f11910b;
                    Object d11 = zzljVar.d();
                    Preconditions.j(d11);
                    Iterator it4 = it3;
                    i2 i2Var = new i2(str5, str6, str7, j10, d11);
                    Object obj2 = i2Var.f202e;
                    String str8 = i2Var.c;
                    e eVar8 = this.c;
                    C(eVar8);
                    if (eVar8.x(i2Var)) {
                        zzaA().f11720n.d("User property triggered", zzacVar3.f11516a, zzgeVar.f11784m.f(str8), obj2);
                    } else {
                        zzaA().f11712f.d("Too many active user properties, ignoring", zzeu.v(zzacVar3.f11516a), zzgeVar.f11784m.f(str8), obj2);
                    }
                    zzaw zzawVar5 = zzacVar3.f11523i;
                    if (zzawVar5 != null) {
                        arrayList2.add(zzawVar5);
                    }
                    zzacVar3.c = new zzlj(i2Var);
                    zzacVar3.f11519e = true;
                    e eVar9 = this.c;
                    C(eVar9);
                    eVar9.w(zzacVar3);
                    it3 = it4;
                }
            }
            p(zzawVar2, zzqVar);
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                p(new zzaw((zzaw) it5.next(), j10), zzqVar);
            }
            e eVar10 = this.c;
            C(eVar10);
            eVar10.r();
        } finally {
            e eVar11 = this.c;
            C(eVar11);
            eVar11.T();
        }
    }

    public final void e(zzaw zzawVar, String str) {
        e eVar = this.c;
        C(eVar);
        n0 G = eVar.G(str);
        if (G != null && !TextUtils.isEmpty(G.G())) {
            Boolean u7 = u(G);
            if (u7 == null) {
                if (!"_ui".equals(zzawVar.f11546a)) {
                    zzeu zzaA = zzaA();
                    zzaA.f11715i.b(zzeu.v(str), "Could not find package. appId");
                }
            } else if (!u7.booleanValue()) {
                zzeu zzaA2 = zzaA();
                zzaA2.f11712f.b(zzeu.v(str), "App version does not match; dropping event. appId");
                return;
            }
            String I = G.I();
            String G2 = G.G();
            long A = G.A();
            zzge zzgeVar = G.f239a;
            zzgb zzgbVar = zzgeVar.f11781j;
            zzge.f(zzgbVar);
            zzgbVar.m();
            String str2 = G.f249l;
            zzgb zzgbVar2 = zzgeVar.f11781j;
            zzge.f(zzgbVar2);
            zzgbVar2.m();
            long j10 = G.f250m;
            zzgb zzgbVar3 = zzgeVar.f11781j;
            zzge.f(zzgbVar3);
            zzgbVar3.m();
            long j11 = G.f251n;
            zzgb zzgbVar4 = zzgeVar.f11781j;
            zzge.f(zzgbVar4);
            zzgbVar4.m();
            boolean z10 = G.f252o;
            String H = G.H();
            zzgb zzgbVar5 = zzgeVar.f11781j;
            zzge.f(zzgbVar5);
            zzgbVar5.m();
            boolean y10 = G.y();
            String C = G.C();
            zzgb zzgbVar6 = zzgeVar.f11781j;
            zzge.f(zzgbVar6);
            zzgbVar6.m();
            Boolean bool = G.f255r;
            long B = G.B();
            zzgb zzgbVar7 = zzgeVar.f11781j;
            zzge.f(zzgbVar7);
            zzgbVar7.m();
            ArrayList arrayList = G.f257t;
            String e10 = F(str).e();
            boolean z11 = G.z();
            zzgb zzgbVar8 = zzgeVar.f11781j;
            zzge.f(zzgbVar8);
            zzgbVar8.m();
            f(zzawVar, new zzq(str, I, G2, A, str2, j10, j11, null, z10, false, H, 0L, 0, y10, false, C, bool, B, arrayList, e10, "", null, z11, G.f260w));
            return;
        }
        zzaA().f11719m.b(str, "No app data available; dropping event");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e0, code lost:
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0145: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:49:0x0145 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(com.google.android.gms.measurement.internal.zzaw r12, com.google.android.gms.measurement.internal.zzq r13) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlg.f(com.google.android.gms.measurement.internal.zzaw, com.google.android.gms.measurement.internal.zzq):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[Catch: all -> 0x00e1, TRY_LEAVE, TryCatch #1 {all -> 0x01a3, blocks: (B:4:0x0010, B:5:0x0012, B:68:0x018c, B:6:0x002a, B:16:0x0048, B:67:0x0184, B:22:0x0064, B:26:0x0085, B:31:0x00dc, B:30:0x00c8, B:35:0x00e6, B:38:0x00f2, B:40:0x00f8, B:43:0x0102, B:46:0x010e, B:48:0x0114, B:53:0x0121, B:57:0x0137, B:59:0x0151, B:61:0x016c, B:63:0x0177, B:65:0x017d, B:66:0x0181, B:60:0x015d, B:54:0x0128, B:56:0x0131), top: B:76:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0151 A[Catch: all -> 0x00e1, TryCatch #1 {all -> 0x01a3, blocks: (B:4:0x0010, B:5:0x0012, B:68:0x018c, B:6:0x002a, B:16:0x0048, B:67:0x0184, B:22:0x0064, B:26:0x0085, B:31:0x00dc, B:30:0x00c8, B:35:0x00e6, B:38:0x00f2, B:40:0x00f8, B:43:0x0102, B:46:0x010e, B:48:0x0114, B:53:0x0121, B:57:0x0137, B:59:0x0151, B:61:0x016c, B:63:0x0177, B:65:0x017d, B:66:0x0181, B:60:0x015d, B:54:0x0128, B:56:0x0131), top: B:76:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015d A[Catch: all -> 0x00e1, TryCatch #1 {all -> 0x01a3, blocks: (B:4:0x0010, B:5:0x0012, B:68:0x018c, B:6:0x002a, B:16:0x0048, B:67:0x0184, B:22:0x0064, B:26:0x0085, B:31:0x00dc, B:30:0x00c8, B:35:0x00e6, B:38:0x00f2, B:40:0x00f8, B:43:0x0102, B:46:0x010e, B:48:0x0114, B:53:0x0121, B:57:0x0137, B:59:0x0151, B:61:0x016c, B:63:0x0177, B:65:0x017d, B:66:0x0181, B:60:0x015d, B:54:0x0128, B:56:0x0131), top: B:76:0x0010 }] */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.String r10, int r11, java.lang.Throwable r12, byte[] r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlg.g(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:96|97|(2:99|(8:101|(3:103|(2:105|(1:107))(1:126)|108)(1:127)|109|(1:111)(1:125)|112|113|114|(4:116|(1:118)|119|(1:121))))|128|113|114|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x045a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x045b, code lost:
        zzaA().f11712f.c(com.google.android.gms.measurement.internal.zzeu.v(r9), "Application info is null, first open report might be inaccurate. appId", r0);
        r0 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03b1 A[Catch: all -> 0x0527, TryCatch #5 {all -> 0x0527, blocks: (B:24:0x00b8, B:26:0x00c3, B:41:0x0103, B:43:0x0111, B:45:0x0128, B:47:0x0142, B:48:0x014f, B:50:0x015f, B:52:0x01a8, B:54:0x01ad, B:56:0x01b3, B:58:0x01bc, B:74:0x01fc, B:76:0x0207, B:80:0x0214, B:83:0x0222, B:87:0x022d, B:89:0x0230, B:90:0x0251, B:92:0x0256, B:95:0x0271, B:98:0x0286, B:101:0x02ae, B:135:0x037d, B:137:0x03b1, B:138:0x03b4, B:140:0x03cc, B:179:0x0489, B:180:0x048c, B:188:0x0516, B:142:0x03df, B:147:0x03fc, B:149:0x0404, B:151:0x040a, B:155:0x041d, B:159:0x042e, B:163:0x043a, B:166:0x0450, B:169:0x045b, B:171:0x046d, B:173:0x0473, B:174:0x0478, B:176:0x047e, B:156:0x0425, B:145:0x03ea, B:103:0x02be, B:105:0x02cc, B:106:0x02d9, B:108:0x02e2, B:111:0x0303, B:112:0x030f, B:114:0x0316, B:116:0x031c, B:118:0x0326, B:120:0x032c, B:122:0x0332, B:124:0x0338, B:125:0x033d, B:129:0x0354, B:132:0x0359, B:133:0x0368, B:134:0x0373, B:181:0x04a5, B:183:0x04d8, B:184:0x04db, B:185:0x04f3, B:187:0x04fa, B:93:0x0263, B:69:0x01de, B:30:0x00d1, B:34:0x00e1, B:36:0x00f0, B:38:0x00fa, B:40:0x0100), top: B:205:0x00b8, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03cc A[Catch: all -> 0x0527, TRY_LEAVE, TryCatch #5 {all -> 0x0527, blocks: (B:24:0x00b8, B:26:0x00c3, B:41:0x0103, B:43:0x0111, B:45:0x0128, B:47:0x0142, B:48:0x014f, B:50:0x015f, B:52:0x01a8, B:54:0x01ad, B:56:0x01b3, B:58:0x01bc, B:74:0x01fc, B:76:0x0207, B:80:0x0214, B:83:0x0222, B:87:0x022d, B:89:0x0230, B:90:0x0251, B:92:0x0256, B:95:0x0271, B:98:0x0286, B:101:0x02ae, B:135:0x037d, B:137:0x03b1, B:138:0x03b4, B:140:0x03cc, B:179:0x0489, B:180:0x048c, B:188:0x0516, B:142:0x03df, B:147:0x03fc, B:149:0x0404, B:151:0x040a, B:155:0x041d, B:159:0x042e, B:163:0x043a, B:166:0x0450, B:169:0x045b, B:171:0x046d, B:173:0x0473, B:174:0x0478, B:176:0x047e, B:156:0x0425, B:145:0x03ea, B:103:0x02be, B:105:0x02cc, B:106:0x02d9, B:108:0x02e2, B:111:0x0303, B:112:0x030f, B:114:0x0316, B:116:0x031c, B:118:0x0326, B:120:0x032c, B:122:0x0332, B:124:0x0338, B:125:0x033d, B:129:0x0354, B:132:0x0359, B:133:0x0368, B:134:0x0373, B:181:0x04a5, B:183:0x04d8, B:184:0x04db, B:185:0x04f3, B:187:0x04fa, B:93:0x0263, B:69:0x01de, B:30:0x00d1, B:34:0x00e1, B:36:0x00f0, B:38:0x00fa, B:40:0x0100), top: B:205:0x00b8, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x046d A[Catch: all -> 0x0527, TryCatch #5 {all -> 0x0527, blocks: (B:24:0x00b8, B:26:0x00c3, B:41:0x0103, B:43:0x0111, B:45:0x0128, B:47:0x0142, B:48:0x014f, B:50:0x015f, B:52:0x01a8, B:54:0x01ad, B:56:0x01b3, B:58:0x01bc, B:74:0x01fc, B:76:0x0207, B:80:0x0214, B:83:0x0222, B:87:0x022d, B:89:0x0230, B:90:0x0251, B:92:0x0256, B:95:0x0271, B:98:0x0286, B:101:0x02ae, B:135:0x037d, B:137:0x03b1, B:138:0x03b4, B:140:0x03cc, B:179:0x0489, B:180:0x048c, B:188:0x0516, B:142:0x03df, B:147:0x03fc, B:149:0x0404, B:151:0x040a, B:155:0x041d, B:159:0x042e, B:163:0x043a, B:166:0x0450, B:169:0x045b, B:171:0x046d, B:173:0x0473, B:174:0x0478, B:176:0x047e, B:156:0x0425, B:145:0x03ea, B:103:0x02be, B:105:0x02cc, B:106:0x02d9, B:108:0x02e2, B:111:0x0303, B:112:0x030f, B:114:0x0316, B:116:0x031c, B:118:0x0326, B:120:0x032c, B:122:0x0332, B:124:0x0338, B:125:0x033d, B:129:0x0354, B:132:0x0359, B:133:0x0368, B:134:0x0373, B:181:0x04a5, B:183:0x04d8, B:184:0x04db, B:185:0x04f3, B:187:0x04fa, B:93:0x0263, B:69:0x01de, B:30:0x00d1, B:34:0x00e1, B:36:0x00f0, B:38:0x00fa, B:40:0x0100), top: B:205:0x00b8, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0489 A[Catch: all -> 0x0527, TryCatch #5 {all -> 0x0527, blocks: (B:24:0x00b8, B:26:0x00c3, B:41:0x0103, B:43:0x0111, B:45:0x0128, B:47:0x0142, B:48:0x014f, B:50:0x015f, B:52:0x01a8, B:54:0x01ad, B:56:0x01b3, B:58:0x01bc, B:74:0x01fc, B:76:0x0207, B:80:0x0214, B:83:0x0222, B:87:0x022d, B:89:0x0230, B:90:0x0251, B:92:0x0256, B:95:0x0271, B:98:0x0286, B:101:0x02ae, B:135:0x037d, B:137:0x03b1, B:138:0x03b4, B:140:0x03cc, B:179:0x0489, B:180:0x048c, B:188:0x0516, B:142:0x03df, B:147:0x03fc, B:149:0x0404, B:151:0x040a, B:155:0x041d, B:159:0x042e, B:163:0x043a, B:166:0x0450, B:169:0x045b, B:171:0x046d, B:173:0x0473, B:174:0x0478, B:176:0x047e, B:156:0x0425, B:145:0x03ea, B:103:0x02be, B:105:0x02cc, B:106:0x02d9, B:108:0x02e2, B:111:0x0303, B:112:0x030f, B:114:0x0316, B:116:0x031c, B:118:0x0326, B:120:0x032c, B:122:0x0332, B:124:0x0338, B:125:0x033d, B:129:0x0354, B:132:0x0359, B:133:0x0368, B:134:0x0373, B:181:0x04a5, B:183:0x04d8, B:184:0x04db, B:185:0x04f3, B:187:0x04fa, B:93:0x0263, B:69:0x01de, B:30:0x00d1, B:34:0x00e1, B:36:0x00f0, B:38:0x00fa, B:40:0x0100), top: B:205:0x00b8, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04f3 A[Catch: all -> 0x0527, TryCatch #5 {all -> 0x0527, blocks: (B:24:0x00b8, B:26:0x00c3, B:41:0x0103, B:43:0x0111, B:45:0x0128, B:47:0x0142, B:48:0x014f, B:50:0x015f, B:52:0x01a8, B:54:0x01ad, B:56:0x01b3, B:58:0x01bc, B:74:0x01fc, B:76:0x0207, B:80:0x0214, B:83:0x0222, B:87:0x022d, B:89:0x0230, B:90:0x0251, B:92:0x0256, B:95:0x0271, B:98:0x0286, B:101:0x02ae, B:135:0x037d, B:137:0x03b1, B:138:0x03b4, B:140:0x03cc, B:179:0x0489, B:180:0x048c, B:188:0x0516, B:142:0x03df, B:147:0x03fc, B:149:0x0404, B:151:0x040a, B:155:0x041d, B:159:0x042e, B:163:0x043a, B:166:0x0450, B:169:0x045b, B:171:0x046d, B:173:0x0473, B:174:0x0478, B:176:0x047e, B:156:0x0425, B:145:0x03ea, B:103:0x02be, B:105:0x02cc, B:106:0x02d9, B:108:0x02e2, B:111:0x0303, B:112:0x030f, B:114:0x0316, B:116:0x031c, B:118:0x0326, B:120:0x032c, B:122:0x0332, B:124:0x0338, B:125:0x033d, B:129:0x0354, B:132:0x0359, B:133:0x0368, B:134:0x0373, B:181:0x04a5, B:183:0x04d8, B:184:0x04db, B:185:0x04f3, B:187:0x04fa, B:93:0x0263, B:69:0x01de, B:30:0x00d1, B:34:0x00e1, B:36:0x00f0, B:38:0x00fa, B:40:0x0100), top: B:205:0x00b8, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fc A[Catch: all -> 0x0527, TryCatch #5 {all -> 0x0527, blocks: (B:24:0x00b8, B:26:0x00c3, B:41:0x0103, B:43:0x0111, B:45:0x0128, B:47:0x0142, B:48:0x014f, B:50:0x015f, B:52:0x01a8, B:54:0x01ad, B:56:0x01b3, B:58:0x01bc, B:74:0x01fc, B:76:0x0207, B:80:0x0214, B:83:0x0222, B:87:0x022d, B:89:0x0230, B:90:0x0251, B:92:0x0256, B:95:0x0271, B:98:0x0286, B:101:0x02ae, B:135:0x037d, B:137:0x03b1, B:138:0x03b4, B:140:0x03cc, B:179:0x0489, B:180:0x048c, B:188:0x0516, B:142:0x03df, B:147:0x03fc, B:149:0x0404, B:151:0x040a, B:155:0x041d, B:159:0x042e, B:163:0x043a, B:166:0x0450, B:169:0x045b, B:171:0x046d, B:173:0x0473, B:174:0x0478, B:176:0x047e, B:156:0x0425, B:145:0x03ea, B:103:0x02be, B:105:0x02cc, B:106:0x02d9, B:108:0x02e2, B:111:0x0303, B:112:0x030f, B:114:0x0316, B:116:0x031c, B:118:0x0326, B:120:0x032c, B:122:0x0332, B:124:0x0338, B:125:0x033d, B:129:0x0354, B:132:0x0359, B:133:0x0368, B:134:0x0373, B:181:0x04a5, B:183:0x04d8, B:184:0x04db, B:185:0x04f3, B:187:0x04fa, B:93:0x0263, B:69:0x01de, B:30:0x00d1, B:34:0x00e1, B:36:0x00f0, B:38:0x00fa, B:40:0x0100), top: B:205:0x00b8, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0256 A[Catch: all -> 0x0527, TryCatch #5 {all -> 0x0527, blocks: (B:24:0x00b8, B:26:0x00c3, B:41:0x0103, B:43:0x0111, B:45:0x0128, B:47:0x0142, B:48:0x014f, B:50:0x015f, B:52:0x01a8, B:54:0x01ad, B:56:0x01b3, B:58:0x01bc, B:74:0x01fc, B:76:0x0207, B:80:0x0214, B:83:0x0222, B:87:0x022d, B:89:0x0230, B:90:0x0251, B:92:0x0256, B:95:0x0271, B:98:0x0286, B:101:0x02ae, B:135:0x037d, B:137:0x03b1, B:138:0x03b4, B:140:0x03cc, B:179:0x0489, B:180:0x048c, B:188:0x0516, B:142:0x03df, B:147:0x03fc, B:149:0x0404, B:151:0x040a, B:155:0x041d, B:159:0x042e, B:163:0x043a, B:166:0x0450, B:169:0x045b, B:171:0x046d, B:173:0x0473, B:174:0x0478, B:176:0x047e, B:156:0x0425, B:145:0x03ea, B:103:0x02be, B:105:0x02cc, B:106:0x02d9, B:108:0x02e2, B:111:0x0303, B:112:0x030f, B:114:0x0316, B:116:0x031c, B:118:0x0326, B:120:0x032c, B:122:0x0332, B:124:0x0338, B:125:0x033d, B:129:0x0354, B:132:0x0359, B:133:0x0368, B:134:0x0373, B:181:0x04a5, B:183:0x04d8, B:184:0x04db, B:185:0x04f3, B:187:0x04fa, B:93:0x0263, B:69:0x01de, B:30:0x00d1, B:34:0x00e1, B:36:0x00f0, B:38:0x00fa, B:40:0x0100), top: B:205:0x00b8, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0263 A[Catch: all -> 0x0527, TryCatch #5 {all -> 0x0527, blocks: (B:24:0x00b8, B:26:0x00c3, B:41:0x0103, B:43:0x0111, B:45:0x0128, B:47:0x0142, B:48:0x014f, B:50:0x015f, B:52:0x01a8, B:54:0x01ad, B:56:0x01b3, B:58:0x01bc, B:74:0x01fc, B:76:0x0207, B:80:0x0214, B:83:0x0222, B:87:0x022d, B:89:0x0230, B:90:0x0251, B:92:0x0256, B:95:0x0271, B:98:0x0286, B:101:0x02ae, B:135:0x037d, B:137:0x03b1, B:138:0x03b4, B:140:0x03cc, B:179:0x0489, B:180:0x048c, B:188:0x0516, B:142:0x03df, B:147:0x03fc, B:149:0x0404, B:151:0x040a, B:155:0x041d, B:159:0x042e, B:163:0x043a, B:166:0x0450, B:169:0x045b, B:171:0x046d, B:173:0x0473, B:174:0x0478, B:176:0x047e, B:156:0x0425, B:145:0x03ea, B:103:0x02be, B:105:0x02cc, B:106:0x02d9, B:108:0x02e2, B:111:0x0303, B:112:0x030f, B:114:0x0316, B:116:0x031c, B:118:0x0326, B:120:0x032c, B:122:0x0332, B:124:0x0338, B:125:0x033d, B:129:0x0354, B:132:0x0359, B:133:0x0368, B:134:0x0373, B:181:0x04a5, B:183:0x04d8, B:184:0x04db, B:185:0x04f3, B:187:0x04fa, B:93:0x0263, B:69:0x01de, B:30:0x00d1, B:34:0x00e1, B:36:0x00f0, B:38:0x00fa, B:40:0x0100), top: B:205:0x00b8, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0271 A[Catch: all -> 0x0527, TRY_LEAVE, TryCatch #5 {all -> 0x0527, blocks: (B:24:0x00b8, B:26:0x00c3, B:41:0x0103, B:43:0x0111, B:45:0x0128, B:47:0x0142, B:48:0x014f, B:50:0x015f, B:52:0x01a8, B:54:0x01ad, B:56:0x01b3, B:58:0x01bc, B:74:0x01fc, B:76:0x0207, B:80:0x0214, B:83:0x0222, B:87:0x022d, B:89:0x0230, B:90:0x0251, B:92:0x0256, B:95:0x0271, B:98:0x0286, B:101:0x02ae, B:135:0x037d, B:137:0x03b1, B:138:0x03b4, B:140:0x03cc, B:179:0x0489, B:180:0x048c, B:188:0x0516, B:142:0x03df, B:147:0x03fc, B:149:0x0404, B:151:0x040a, B:155:0x041d, B:159:0x042e, B:163:0x043a, B:166:0x0450, B:169:0x045b, B:171:0x046d, B:173:0x0473, B:174:0x0478, B:176:0x047e, B:156:0x0425, B:145:0x03ea, B:103:0x02be, B:105:0x02cc, B:106:0x02d9, B:108:0x02e2, B:111:0x0303, B:112:0x030f, B:114:0x0316, B:116:0x031c, B:118:0x0326, B:120:0x032c, B:122:0x0332, B:124:0x0338, B:125:0x033d, B:129:0x0354, B:132:0x0359, B:133:0x0368, B:134:0x0373, B:181:0x04a5, B:183:0x04d8, B:184:0x04db, B:185:0x04f3, B:187:0x04fa, B:93:0x0263, B:69:0x01de, B:30:0x00d1, B:34:0x00e1, B:36:0x00f0, B:38:0x00fa, B:40:0x0100), top: B:205:0x00b8, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(com.google.android.gms.measurement.internal.zzq r30) {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlg.h(com.google.android.gms.measurement.internal.zzq):void");
    }

    public final void i(zzac zzacVar, zzq zzqVar) {
        Bundle bundle;
        Preconditions.j(zzacVar);
        Preconditions.f(zzacVar.f11516a);
        Preconditions.j(zzacVar.c);
        Preconditions.f(zzacVar.c.f11910b);
        zzaB().m();
        b();
        if (!B(zzqVar)) {
            return;
        }
        if (zzqVar.f11926h) {
            e eVar = this.c;
            C(eVar);
            eVar.S();
            try {
                D(zzqVar);
                String str = zzacVar.f11516a;
                Preconditions.j(str);
                e eVar2 = this.c;
                C(eVar2);
                zzac H = eVar2.H(str, zzacVar.c.f11910b);
                zzge zzgeVar = this.f11893l;
                if (H != null) {
                    zzaA().f11719m.c(zzacVar.f11516a, "Removing conditional user property", zzgeVar.f11784m.f(zzacVar.c.f11910b));
                    e eVar3 = this.c;
                    C(eVar3);
                    eVar3.B(str, zzacVar.c.f11910b);
                    if (H.f11519e) {
                        e eVar4 = this.c;
                        C(eVar4);
                        eVar4.q(str, zzacVar.c.f11910b);
                    }
                    zzaw zzawVar = zzacVar.f11525k;
                    if (zzawVar != null) {
                        zzau zzauVar = zzawVar.f11547b;
                        if (zzauVar != null) {
                            bundle = zzauVar.d();
                        } else {
                            bundle = null;
                        }
                        zzaw v02 = K().v0(zzawVar.f11546a, bundle, H.f11517b, zzawVar.f11548d, true);
                        Preconditions.j(v02);
                        p(v02, zzqVar);
                    }
                } else {
                    zzaA().f11715i.c(zzeu.v(zzacVar.f11516a), "Conditional user property doesn't exist", zzgeVar.f11784m.f(zzacVar.c.f11910b));
                }
                e eVar5 = this.c;
                C(eVar5);
                eVar5.r();
                return;
            } finally {
                e eVar6 = this.c;
                C(eVar6);
                eVar6.T();
            }
        }
        D(zzqVar);
    }

    public final void j(String str, zzq zzqVar) {
        Boolean bool;
        long j10;
        zzaB().m();
        b();
        if (!B(zzqVar)) {
            return;
        }
        if (!zzqVar.f11926h) {
            D(zzqVar);
        } else if ("_npa".equals(str) && (bool = zzqVar.f11936r) != null) {
            zzaA().f11719m.a("Falling back to manifest metadata value for ad personalization");
            ((DefaultClock) zzax()).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (true != bool.booleanValue()) {
                j10 = 0;
            } else {
                j10 = 1;
            }
            n(new zzlj(currentTimeMillis, Long.valueOf(j10), "_npa", "auto"), zzqVar);
        } else {
            zzeu zzaA = zzaA();
            zzge zzgeVar = this.f11893l;
            zzaA.f11719m.b(zzgeVar.f11784m.f(str), "Removing user property");
            e eVar = this.c;
            C(eVar);
            eVar.S();
            try {
                D(zzqVar);
                boolean equals = "_id".equals(str);
                String str2 = zzqVar.f11920a;
                if (equals) {
                    e eVar2 = this.c;
                    C(eVar2);
                    Preconditions.j(str2);
                    eVar2.q(str2, "_lair");
                }
                e eVar3 = this.c;
                C(eVar3);
                Preconditions.j(str2);
                eVar3.q(str2, str);
                e eVar4 = this.c;
                C(eVar4);
                eVar4.r();
                zzaA().f11719m.b(zzgeVar.f11784m.f(str), "User property removed");
            } finally {
                e eVar5 = this.c;
                C(eVar5);
                eVar5.T();
            }
        }
    }

    @VisibleForTesting
    public final void k(zzq zzqVar) {
        if (this.f11905x != null) {
            ArrayList arrayList = new ArrayList();
            this.f11906y = arrayList;
            arrayList.addAll(this.f11905x);
        }
        e eVar = this.c;
        C(eVar);
        Object obj = eVar.f3529a;
        String str = zzqVar.f11920a;
        Preconditions.j(str);
        Preconditions.f(str);
        eVar.m();
        eVar.n();
        try {
            SQLiteDatabase F2 = eVar.F();
            String[] strArr = {str};
            int delete = F2.delete("apps", "app_id=?", strArr) + F2.delete("events", "app_id=?", strArr) + F2.delete("user_attributes", "app_id=?", strArr) + F2.delete("conditional_properties", "app_id=?", strArr) + F2.delete("raw_events", "app_id=?", strArr) + F2.delete("raw_events_metadata", "app_id=?", strArr) + F2.delete("queue", "app_id=?", strArr) + F2.delete("audience_filter_values", "app_id=?", strArr) + F2.delete("main_event_params", "app_id=?", strArr) + F2.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zzeu zzeuVar = ((zzge) obj).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11720n.c(str, "Reset analytics data. app, records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            zzeu zzeuVar2 = ((zzge) obj).f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11712f.c(zzeu.v(str), "Error resetting analytics data. appId, error", e10);
        }
        if (zzqVar.f11926h) {
            h(zzqVar);
        }
    }

    public final void l(zzac zzacVar, zzq zzqVar) {
        Preconditions.j(zzacVar);
        Preconditions.f(zzacVar.f11516a);
        Preconditions.j(zzacVar.f11517b);
        Preconditions.j(zzacVar.c);
        Preconditions.f(zzacVar.c.f11910b);
        zzaB().m();
        b();
        if (!B(zzqVar)) {
            return;
        }
        if (!zzqVar.f11926h) {
            D(zzqVar);
            return;
        }
        zzac zzacVar2 = new zzac(zzacVar);
        boolean z10 = false;
        zzacVar2.f11519e = false;
        e eVar = this.c;
        C(eVar);
        eVar.S();
        try {
            e eVar2 = this.c;
            C(eVar2);
            String str = zzacVar2.f11516a;
            Preconditions.j(str);
            zzac H = eVar2.H(str, zzacVar2.c.f11910b);
            zzge zzgeVar = this.f11893l;
            if (H != null && !H.f11517b.equals(zzacVar2.f11517b)) {
                zzaA().f11715i.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", zzgeVar.f11784m.f(zzacVar2.c.f11910b), zzacVar2.f11517b, H.f11517b);
            }
            if (H != null && H.f11519e) {
                zzacVar2.f11517b = H.f11517b;
                zzacVar2.f11518d = H.f11518d;
                zzacVar2.f11522h = H.f11522h;
                zzacVar2.f11520f = H.f11520f;
                zzacVar2.f11523i = H.f11523i;
                zzacVar2.f11519e = true;
                zzlj zzljVar = zzacVar2.c;
                zzacVar2.c = new zzlj(H.c.c, zzljVar.d(), zzljVar.f11910b, H.c.f11913f);
            } else if (TextUtils.isEmpty(zzacVar2.f11520f)) {
                zzlj zzljVar2 = zzacVar2.c;
                zzacVar2.c = new zzlj(zzacVar2.f11518d, zzljVar2.d(), zzljVar2.f11910b, zzacVar2.c.f11913f);
                zzacVar2.f11519e = true;
                z10 = true;
            }
            if (zzacVar2.f11519e) {
                zzlj zzljVar3 = zzacVar2.c;
                String str2 = zzacVar2.f11516a;
                Preconditions.j(str2);
                String str3 = zzacVar2.f11517b;
                String str4 = zzljVar3.f11910b;
                long j10 = zzljVar3.c;
                Object d10 = zzljVar3.d();
                Preconditions.j(d10);
                i2 i2Var = new i2(str2, str3, str4, j10, d10);
                Object obj = i2Var.f202e;
                String str5 = i2Var.c;
                e eVar3 = this.c;
                C(eVar3);
                if (eVar3.x(i2Var)) {
                    zzaA().f11719m.d("User property updated immediately", zzacVar2.f11516a, zzgeVar.f11784m.f(str5), obj);
                } else {
                    zzaA().f11712f.d("(2)Too many active user properties, ignoring", zzeu.v(zzacVar2.f11516a), zzgeVar.f11784m.f(str5), obj);
                }
                if (z10 && zzacVar2.f11523i != null) {
                    p(new zzaw(zzacVar2.f11523i, zzacVar2.f11518d), zzqVar);
                }
            }
            e eVar4 = this.c;
            C(eVar4);
            if (eVar4.w(zzacVar2)) {
                zzaA().f11719m.d("Conditional property added", zzacVar2.f11516a, zzgeVar.f11784m.f(zzacVar2.c.f11910b), zzacVar2.c.d());
            } else {
                zzaA().f11712f.d("Too many conditional properties, ignoring", zzeu.v(zzacVar2.f11516a), zzgeVar.f11784m.f(zzacVar2.c.f11910b), zzacVar2.c.d());
            }
            e eVar5 = this.c;
            C(eVar5);
            eVar5.r();
        } finally {
            e eVar6 = this.c;
            C(eVar6);
            eVar6.T();
        }
    }

    public final void m(String str, zzai zzaiVar) {
        zzaB().m();
        b();
        this.A.put(str, zzaiVar);
        e eVar = this.c;
        C(eVar);
        Object obj = eVar.f3529a;
        Preconditions.j(str);
        eVar.m();
        eVar.n();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzaiVar.e());
        try {
            if (eVar.F().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzeu zzeuVar = ((zzge) obj).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11712f.b(zzeu.v(str), "Failed to insert/update consent setting (got -1). appId");
            }
        } catch (SQLiteException e10) {
            zzeu zzeuVar2 = ((zzge) obj).f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11712f.c(zzeu.v(str), "Error storing consent setting. appId, error", e10);
        }
    }

    public final void n(zzlj zzljVar, zzq zzqVar) {
        long j10;
        int i10;
        int i11;
        zzaB().m();
        b();
        if (!B(zzqVar)) {
            return;
        }
        if (!zzqVar.f11926h) {
            D(zzqVar);
            return;
        }
        int o02 = K().o0(zzljVar.f11910b);
        a0 a0Var = this.E;
        String str = zzljVar.f11910b;
        if (o02 != 0) {
            K();
            E();
            String t4 = zzlo.t(24, str, true);
            if (str != null) {
                i11 = str.length();
            } else {
                i11 = 0;
            }
            K();
            zzlo.D(a0Var, zzqVar.f11920a, o02, "_ev", t4, i11);
            return;
        }
        int k02 = K().k0(zzljVar.d(), str);
        if (k02 != 0) {
            K();
            E();
            String t10 = zzlo.t(24, str, true);
            Object d10 = zzljVar.d();
            if (d10 != null && ((d10 instanceof String) || (d10 instanceof CharSequence))) {
                i10 = d10.toString().length();
            } else {
                i10 = 0;
            }
            K();
            zzlo.D(a0Var, zzqVar.f11920a, k02, "_ev", t10, i10);
            return;
        }
        Object r4 = K().r(zzljVar.d(), str);
        if (r4 == null) {
            return;
        }
        boolean equals = "_sid".equals(str);
        String str2 = zzqVar.f11920a;
        if (equals) {
            long j11 = zzljVar.c;
            String str3 = zzljVar.f11913f;
            Preconditions.j(str2);
            e eVar = this.c;
            C(eVar);
            i2 L = eVar.L(str2, "_sno");
            if (L != null) {
                Object obj = L.f202e;
                if (obj instanceof Long) {
                    j10 = ((Long) obj).longValue();
                    n(new zzlj(j11, Long.valueOf(j10 + 1), "_sno", str3), zzqVar);
                }
            }
            if (L != null) {
                zzaA().f11715i.b(L.f202e, "Retrieved last session number from database does not contain a valid (long) value");
            }
            e eVar2 = this.c;
            C(eVar2);
            g K = eVar2.K(str2, "_s");
            if (K != null) {
                zzeu zzaA = zzaA();
                long j12 = K.c;
                zzaA.f11720n.b(Long.valueOf(j12), "Backfill the session number. Last used session number");
                j10 = j12;
            } else {
                j10 = 0;
            }
            n(new zzlj(j11, Long.valueOf(j10 + 1), "_sno", str3), zzqVar);
        }
        Preconditions.j(str2);
        String str4 = zzljVar.f11913f;
        Preconditions.j(str4);
        i2 i2Var = new i2(str2, str4, zzljVar.f11910b, zzljVar.c, r4);
        zzeu zzaA2 = zzaA();
        zzge zzgeVar = this.f11893l;
        zzep zzepVar = zzgeVar.f11784m;
        String str5 = i2Var.c;
        zzaA2.f11720n.c(zzepVar.f(str5), "Setting user property", r4);
        e eVar3 = this.c;
        C(eVar3);
        eVar3.S();
        try {
            boolean equals2 = "_id".equals(str5);
            Object obj2 = i2Var.f202e;
            if (equals2) {
                e eVar4 = this.c;
                C(eVar4);
                i2 L2 = eVar4.L(str2, "_id");
                if (L2 != null && !obj2.equals(L2.f202e)) {
                    e eVar5 = this.c;
                    C(eVar5);
                    eVar5.q(str2, "_lair");
                }
            }
            D(zzqVar);
            e eVar6 = this.c;
            C(eVar6);
            boolean x4 = eVar6.x(i2Var);
            e eVar7 = this.c;
            C(eVar7);
            eVar7.r();
            if (!x4) {
                zzaA().f11712f.c(zzgeVar.f11784m.f(str5), "Too many unique user properties are set. Ignoring user property", obj2);
                K();
                zzlo.D(a0Var, zzqVar.f11920a, 9, null, null, 0);
            }
        } finally {
            e eVar8 = this.c;
            C(eVar8);
            eVar8.T();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:300:0x0707, code lost:
        if (r2 == null) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0136, code lost:
        if (r12 == null) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02da A[Catch: all -> 0x0731, TryCatch #16 {all -> 0x0731, blocks: (B:3:0x0014, B:9:0x0036, B:13:0x004d, B:18:0x005c, B:22:0x0078, B:26:0x0095, B:32:0x00c7, B:36:0x00ea, B:38:0x00fb, B:63:0x0147, B:65:0x0166, B:69:0x0171, B:73:0x0179, B:142:0x02d4, B:144:0x02da, B:146:0x02e6, B:147:0x02ea, B:149:0x02f0, B:151:0x0304, B:155:0x030d, B:157:0x0313, B:163:0x0338, B:160:0x0328, B:162:0x0332, B:164:0x033b, B:166:0x0360, B:170:0x036f, B:174:0x0395, B:176:0x03cf, B:178:0x03d4, B:180:0x03dc, B:181:0x03df, B:183:0x03f9, B:184:0x03fc, B:186:0x040e, B:188:0x0423, B:195:0x043a, B:196:0x043d, B:198:0x044d, B:200:0x045b, B:207:0x046f, B:209:0x047b, B:211:0x0485, B:213:0x048d, B:214:0x0496, B:215:0x0499, B:217:0x04a9, B:222:0x04bc, B:224:0x04c5, B:225:0x04c8, B:227:0x04d8, B:232:0x04eb, B:233:0x04ee, B:235:0x04fe, B:240:0x0511, B:242:0x051e, B:246:0x0546, B:247:0x0556, B:249:0x0560, B:251:0x0570, B:256:0x0583, B:258:0x0588, B:259:0x058b, B:261:0x0597, B:262:0x05ab, B:263:0x05c0, B:265:0x05d5, B:267:0x05e4, B:268:0x05f7, B:270:0x0604, B:272:0x061b, B:274:0x0628, B:275:0x0631, B:271:0x0612, B:277:0x0678, B:128:0x02a2, B:141:0x02d1, B:281:0x0694, B:282:0x0697, B:283:0x0698, B:285:0x06a2, B:301:0x0709, B:303:0x070d, B:305:0x0713, B:307:0x071e, B:291:0x06ea, B:314:0x072d, B:315:0x0730), top: B:338:0x0014, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x043a A[Catch: all -> 0x0731, TryCatch #16 {all -> 0x0731, blocks: (B:3:0x0014, B:9:0x0036, B:13:0x004d, B:18:0x005c, B:22:0x0078, B:26:0x0095, B:32:0x00c7, B:36:0x00ea, B:38:0x00fb, B:63:0x0147, B:65:0x0166, B:69:0x0171, B:73:0x0179, B:142:0x02d4, B:144:0x02da, B:146:0x02e6, B:147:0x02ea, B:149:0x02f0, B:151:0x0304, B:155:0x030d, B:157:0x0313, B:163:0x0338, B:160:0x0328, B:162:0x0332, B:164:0x033b, B:166:0x0360, B:170:0x036f, B:174:0x0395, B:176:0x03cf, B:178:0x03d4, B:180:0x03dc, B:181:0x03df, B:183:0x03f9, B:184:0x03fc, B:186:0x040e, B:188:0x0423, B:195:0x043a, B:196:0x043d, B:198:0x044d, B:200:0x045b, B:207:0x046f, B:209:0x047b, B:211:0x0485, B:213:0x048d, B:214:0x0496, B:215:0x0499, B:217:0x04a9, B:222:0x04bc, B:224:0x04c5, B:225:0x04c8, B:227:0x04d8, B:232:0x04eb, B:233:0x04ee, B:235:0x04fe, B:240:0x0511, B:242:0x051e, B:246:0x0546, B:247:0x0556, B:249:0x0560, B:251:0x0570, B:256:0x0583, B:258:0x0588, B:259:0x058b, B:261:0x0597, B:262:0x05ab, B:263:0x05c0, B:265:0x05d5, B:267:0x05e4, B:268:0x05f7, B:270:0x0604, B:272:0x061b, B:274:0x0628, B:275:0x0631, B:271:0x0612, B:277:0x0678, B:128:0x02a2, B:141:0x02d1, B:281:0x0694, B:282:0x0697, B:283:0x0698, B:285:0x06a2, B:301:0x0709, B:303:0x070d, B:305:0x0713, B:307:0x071e, B:291:0x06ea, B:314:0x072d, B:315:0x0730), top: B:338:0x0014, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x046f A[Catch: all -> 0x0731, TryCatch #16 {all -> 0x0731, blocks: (B:3:0x0014, B:9:0x0036, B:13:0x004d, B:18:0x005c, B:22:0x0078, B:26:0x0095, B:32:0x00c7, B:36:0x00ea, B:38:0x00fb, B:63:0x0147, B:65:0x0166, B:69:0x0171, B:73:0x0179, B:142:0x02d4, B:144:0x02da, B:146:0x02e6, B:147:0x02ea, B:149:0x02f0, B:151:0x0304, B:155:0x030d, B:157:0x0313, B:163:0x0338, B:160:0x0328, B:162:0x0332, B:164:0x033b, B:166:0x0360, B:170:0x036f, B:174:0x0395, B:176:0x03cf, B:178:0x03d4, B:180:0x03dc, B:181:0x03df, B:183:0x03f9, B:184:0x03fc, B:186:0x040e, B:188:0x0423, B:195:0x043a, B:196:0x043d, B:198:0x044d, B:200:0x045b, B:207:0x046f, B:209:0x047b, B:211:0x0485, B:213:0x048d, B:214:0x0496, B:215:0x0499, B:217:0x04a9, B:222:0x04bc, B:224:0x04c5, B:225:0x04c8, B:227:0x04d8, B:232:0x04eb, B:233:0x04ee, B:235:0x04fe, B:240:0x0511, B:242:0x051e, B:246:0x0546, B:247:0x0556, B:249:0x0560, B:251:0x0570, B:256:0x0583, B:258:0x0588, B:259:0x058b, B:261:0x0597, B:262:0x05ab, B:263:0x05c0, B:265:0x05d5, B:267:0x05e4, B:268:0x05f7, B:270:0x0604, B:272:0x061b, B:274:0x0628, B:275:0x0631, B:271:0x0612, B:277:0x0678, B:128:0x02a2, B:141:0x02d1, B:281:0x0694, B:282:0x0697, B:283:0x0698, B:285:0x06a2, B:301:0x0709, B:303:0x070d, B:305:0x0713, B:307:0x071e, B:291:0x06ea, B:314:0x072d, B:315:0x0730), top: B:338:0x0014, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04a9 A[Catch: all -> 0x0731, TryCatch #16 {all -> 0x0731, blocks: (B:3:0x0014, B:9:0x0036, B:13:0x004d, B:18:0x005c, B:22:0x0078, B:26:0x0095, B:32:0x00c7, B:36:0x00ea, B:38:0x00fb, B:63:0x0147, B:65:0x0166, B:69:0x0171, B:73:0x0179, B:142:0x02d4, B:144:0x02da, B:146:0x02e6, B:147:0x02ea, B:149:0x02f0, B:151:0x0304, B:155:0x030d, B:157:0x0313, B:163:0x0338, B:160:0x0328, B:162:0x0332, B:164:0x033b, B:166:0x0360, B:170:0x036f, B:174:0x0395, B:176:0x03cf, B:178:0x03d4, B:180:0x03dc, B:181:0x03df, B:183:0x03f9, B:184:0x03fc, B:186:0x040e, B:188:0x0423, B:195:0x043a, B:196:0x043d, B:198:0x044d, B:200:0x045b, B:207:0x046f, B:209:0x047b, B:211:0x0485, B:213:0x048d, B:214:0x0496, B:215:0x0499, B:217:0x04a9, B:222:0x04bc, B:224:0x04c5, B:225:0x04c8, B:227:0x04d8, B:232:0x04eb, B:233:0x04ee, B:235:0x04fe, B:240:0x0511, B:242:0x051e, B:246:0x0546, B:247:0x0556, B:249:0x0560, B:251:0x0570, B:256:0x0583, B:258:0x0588, B:259:0x058b, B:261:0x0597, B:262:0x05ab, B:263:0x05c0, B:265:0x05d5, B:267:0x05e4, B:268:0x05f7, B:270:0x0604, B:272:0x061b, B:274:0x0628, B:275:0x0631, B:271:0x0612, B:277:0x0678, B:128:0x02a2, B:141:0x02d1, B:281:0x0694, B:282:0x0697, B:283:0x0698, B:285:0x06a2, B:301:0x0709, B:303:0x070d, B:305:0x0713, B:307:0x071e, B:291:0x06ea, B:314:0x072d, B:315:0x0730), top: B:338:0x0014, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04bc A[Catch: all -> 0x0731, TryCatch #16 {all -> 0x0731, blocks: (B:3:0x0014, B:9:0x0036, B:13:0x004d, B:18:0x005c, B:22:0x0078, B:26:0x0095, B:32:0x00c7, B:36:0x00ea, B:38:0x00fb, B:63:0x0147, B:65:0x0166, B:69:0x0171, B:73:0x0179, B:142:0x02d4, B:144:0x02da, B:146:0x02e6, B:147:0x02ea, B:149:0x02f0, B:151:0x0304, B:155:0x030d, B:157:0x0313, B:163:0x0338, B:160:0x0328, B:162:0x0332, B:164:0x033b, B:166:0x0360, B:170:0x036f, B:174:0x0395, B:176:0x03cf, B:178:0x03d4, B:180:0x03dc, B:181:0x03df, B:183:0x03f9, B:184:0x03fc, B:186:0x040e, B:188:0x0423, B:195:0x043a, B:196:0x043d, B:198:0x044d, B:200:0x045b, B:207:0x046f, B:209:0x047b, B:211:0x0485, B:213:0x048d, B:214:0x0496, B:215:0x0499, B:217:0x04a9, B:222:0x04bc, B:224:0x04c5, B:225:0x04c8, B:227:0x04d8, B:232:0x04eb, B:233:0x04ee, B:235:0x04fe, B:240:0x0511, B:242:0x051e, B:246:0x0546, B:247:0x0556, B:249:0x0560, B:251:0x0570, B:256:0x0583, B:258:0x0588, B:259:0x058b, B:261:0x0597, B:262:0x05ab, B:263:0x05c0, B:265:0x05d5, B:267:0x05e4, B:268:0x05f7, B:270:0x0604, B:272:0x061b, B:274:0x0628, B:275:0x0631, B:271:0x0612, B:277:0x0678, B:128:0x02a2, B:141:0x02d1, B:281:0x0694, B:282:0x0697, B:283:0x0698, B:285:0x06a2, B:301:0x0709, B:303:0x070d, B:305:0x0713, B:307:0x071e, B:291:0x06ea, B:314:0x072d, B:315:0x0730), top: B:338:0x0014, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04d8 A[Catch: all -> 0x0731, TryCatch #16 {all -> 0x0731, blocks: (B:3:0x0014, B:9:0x0036, B:13:0x004d, B:18:0x005c, B:22:0x0078, B:26:0x0095, B:32:0x00c7, B:36:0x00ea, B:38:0x00fb, B:63:0x0147, B:65:0x0166, B:69:0x0171, B:73:0x0179, B:142:0x02d4, B:144:0x02da, B:146:0x02e6, B:147:0x02ea, B:149:0x02f0, B:151:0x0304, B:155:0x030d, B:157:0x0313, B:163:0x0338, B:160:0x0328, B:162:0x0332, B:164:0x033b, B:166:0x0360, B:170:0x036f, B:174:0x0395, B:176:0x03cf, B:178:0x03d4, B:180:0x03dc, B:181:0x03df, B:183:0x03f9, B:184:0x03fc, B:186:0x040e, B:188:0x0423, B:195:0x043a, B:196:0x043d, B:198:0x044d, B:200:0x045b, B:207:0x046f, B:209:0x047b, B:211:0x0485, B:213:0x048d, B:214:0x0496, B:215:0x0499, B:217:0x04a9, B:222:0x04bc, B:224:0x04c5, B:225:0x04c8, B:227:0x04d8, B:232:0x04eb, B:233:0x04ee, B:235:0x04fe, B:240:0x0511, B:242:0x051e, B:246:0x0546, B:247:0x0556, B:249:0x0560, B:251:0x0570, B:256:0x0583, B:258:0x0588, B:259:0x058b, B:261:0x0597, B:262:0x05ab, B:263:0x05c0, B:265:0x05d5, B:267:0x05e4, B:268:0x05f7, B:270:0x0604, B:272:0x061b, B:274:0x0628, B:275:0x0631, B:271:0x0612, B:277:0x0678, B:128:0x02a2, B:141:0x02d1, B:281:0x0694, B:282:0x0697, B:283:0x0698, B:285:0x06a2, B:301:0x0709, B:303:0x070d, B:305:0x0713, B:307:0x071e, B:291:0x06ea, B:314:0x072d, B:315:0x0730), top: B:338:0x0014, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04eb A[Catch: all -> 0x0731, TryCatch #16 {all -> 0x0731, blocks: (B:3:0x0014, B:9:0x0036, B:13:0x004d, B:18:0x005c, B:22:0x0078, B:26:0x0095, B:32:0x00c7, B:36:0x00ea, B:38:0x00fb, B:63:0x0147, B:65:0x0166, B:69:0x0171, B:73:0x0179, B:142:0x02d4, B:144:0x02da, B:146:0x02e6, B:147:0x02ea, B:149:0x02f0, B:151:0x0304, B:155:0x030d, B:157:0x0313, B:163:0x0338, B:160:0x0328, B:162:0x0332, B:164:0x033b, B:166:0x0360, B:170:0x036f, B:174:0x0395, B:176:0x03cf, B:178:0x03d4, B:180:0x03dc, B:181:0x03df, B:183:0x03f9, B:184:0x03fc, B:186:0x040e, B:188:0x0423, B:195:0x043a, B:196:0x043d, B:198:0x044d, B:200:0x045b, B:207:0x046f, B:209:0x047b, B:211:0x0485, B:213:0x048d, B:214:0x0496, B:215:0x0499, B:217:0x04a9, B:222:0x04bc, B:224:0x04c5, B:225:0x04c8, B:227:0x04d8, B:232:0x04eb, B:233:0x04ee, B:235:0x04fe, B:240:0x0511, B:242:0x051e, B:246:0x0546, B:247:0x0556, B:249:0x0560, B:251:0x0570, B:256:0x0583, B:258:0x0588, B:259:0x058b, B:261:0x0597, B:262:0x05ab, B:263:0x05c0, B:265:0x05d5, B:267:0x05e4, B:268:0x05f7, B:270:0x0604, B:272:0x061b, B:274:0x0628, B:275:0x0631, B:271:0x0612, B:277:0x0678, B:128:0x02a2, B:141:0x02d1, B:281:0x0694, B:282:0x0697, B:283:0x0698, B:285:0x06a2, B:301:0x0709, B:303:0x070d, B:305:0x0713, B:307:0x071e, B:291:0x06ea, B:314:0x072d, B:315:0x0730), top: B:338:0x0014, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04fe A[Catch: all -> 0x0731, TryCatch #16 {all -> 0x0731, blocks: (B:3:0x0014, B:9:0x0036, B:13:0x004d, B:18:0x005c, B:22:0x0078, B:26:0x0095, B:32:0x00c7, B:36:0x00ea, B:38:0x00fb, B:63:0x0147, B:65:0x0166, B:69:0x0171, B:73:0x0179, B:142:0x02d4, B:144:0x02da, B:146:0x02e6, B:147:0x02ea, B:149:0x02f0, B:151:0x0304, B:155:0x030d, B:157:0x0313, B:163:0x0338, B:160:0x0328, B:162:0x0332, B:164:0x033b, B:166:0x0360, B:170:0x036f, B:174:0x0395, B:176:0x03cf, B:178:0x03d4, B:180:0x03dc, B:181:0x03df, B:183:0x03f9, B:184:0x03fc, B:186:0x040e, B:188:0x0423, B:195:0x043a, B:196:0x043d, B:198:0x044d, B:200:0x045b, B:207:0x046f, B:209:0x047b, B:211:0x0485, B:213:0x048d, B:214:0x0496, B:215:0x0499, B:217:0x04a9, B:222:0x04bc, B:224:0x04c5, B:225:0x04c8, B:227:0x04d8, B:232:0x04eb, B:233:0x04ee, B:235:0x04fe, B:240:0x0511, B:242:0x051e, B:246:0x0546, B:247:0x0556, B:249:0x0560, B:251:0x0570, B:256:0x0583, B:258:0x0588, B:259:0x058b, B:261:0x0597, B:262:0x05ab, B:263:0x05c0, B:265:0x05d5, B:267:0x05e4, B:268:0x05f7, B:270:0x0604, B:272:0x061b, B:274:0x0628, B:275:0x0631, B:271:0x0612, B:277:0x0678, B:128:0x02a2, B:141:0x02d1, B:281:0x0694, B:282:0x0697, B:283:0x0698, B:285:0x06a2, B:301:0x0709, B:303:0x070d, B:305:0x0713, B:307:0x071e, B:291:0x06ea, B:314:0x072d, B:315:0x0730), top: B:338:0x0014, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0511 A[Catch: all -> 0x0731, TryCatch #16 {all -> 0x0731, blocks: (B:3:0x0014, B:9:0x0036, B:13:0x004d, B:18:0x005c, B:22:0x0078, B:26:0x0095, B:32:0x00c7, B:36:0x00ea, B:38:0x00fb, B:63:0x0147, B:65:0x0166, B:69:0x0171, B:73:0x0179, B:142:0x02d4, B:144:0x02da, B:146:0x02e6, B:147:0x02ea, B:149:0x02f0, B:151:0x0304, B:155:0x030d, B:157:0x0313, B:163:0x0338, B:160:0x0328, B:162:0x0332, B:164:0x033b, B:166:0x0360, B:170:0x036f, B:174:0x0395, B:176:0x03cf, B:178:0x03d4, B:180:0x03dc, B:181:0x03df, B:183:0x03f9, B:184:0x03fc, B:186:0x040e, B:188:0x0423, B:195:0x043a, B:196:0x043d, B:198:0x044d, B:200:0x045b, B:207:0x046f, B:209:0x047b, B:211:0x0485, B:213:0x048d, B:214:0x0496, B:215:0x0499, B:217:0x04a9, B:222:0x04bc, B:224:0x04c5, B:225:0x04c8, B:227:0x04d8, B:232:0x04eb, B:233:0x04ee, B:235:0x04fe, B:240:0x0511, B:242:0x051e, B:246:0x0546, B:247:0x0556, B:249:0x0560, B:251:0x0570, B:256:0x0583, B:258:0x0588, B:259:0x058b, B:261:0x0597, B:262:0x05ab, B:263:0x05c0, B:265:0x05d5, B:267:0x05e4, B:268:0x05f7, B:270:0x0604, B:272:0x061b, B:274:0x0628, B:275:0x0631, B:271:0x0612, B:277:0x0678, B:128:0x02a2, B:141:0x02d1, B:281:0x0694, B:282:0x0697, B:283:0x0698, B:285:0x06a2, B:301:0x0709, B:303:0x070d, B:305:0x0713, B:307:0x071e, B:291:0x06ea, B:314:0x072d, B:315:0x0730), top: B:338:0x0014, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0570 A[Catch: all -> 0x0731, TryCatch #16 {all -> 0x0731, blocks: (B:3:0x0014, B:9:0x0036, B:13:0x004d, B:18:0x005c, B:22:0x0078, B:26:0x0095, B:32:0x00c7, B:36:0x00ea, B:38:0x00fb, B:63:0x0147, B:65:0x0166, B:69:0x0171, B:73:0x0179, B:142:0x02d4, B:144:0x02da, B:146:0x02e6, B:147:0x02ea, B:149:0x02f0, B:151:0x0304, B:155:0x030d, B:157:0x0313, B:163:0x0338, B:160:0x0328, B:162:0x0332, B:164:0x033b, B:166:0x0360, B:170:0x036f, B:174:0x0395, B:176:0x03cf, B:178:0x03d4, B:180:0x03dc, B:181:0x03df, B:183:0x03f9, B:184:0x03fc, B:186:0x040e, B:188:0x0423, B:195:0x043a, B:196:0x043d, B:198:0x044d, B:200:0x045b, B:207:0x046f, B:209:0x047b, B:211:0x0485, B:213:0x048d, B:214:0x0496, B:215:0x0499, B:217:0x04a9, B:222:0x04bc, B:224:0x04c5, B:225:0x04c8, B:227:0x04d8, B:232:0x04eb, B:233:0x04ee, B:235:0x04fe, B:240:0x0511, B:242:0x051e, B:246:0x0546, B:247:0x0556, B:249:0x0560, B:251:0x0570, B:256:0x0583, B:258:0x0588, B:259:0x058b, B:261:0x0597, B:262:0x05ab, B:263:0x05c0, B:265:0x05d5, B:267:0x05e4, B:268:0x05f7, B:270:0x0604, B:272:0x061b, B:274:0x0628, B:275:0x0631, B:271:0x0612, B:277:0x0678, B:128:0x02a2, B:141:0x02d1, B:281:0x0694, B:282:0x0697, B:283:0x0698, B:285:0x06a2, B:301:0x0709, B:303:0x070d, B:305:0x0713, B:307:0x071e, B:291:0x06ea, B:314:0x072d, B:315:0x0730), top: B:338:0x0014, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0583 A[Catch: all -> 0x0731, TryCatch #16 {all -> 0x0731, blocks: (B:3:0x0014, B:9:0x0036, B:13:0x004d, B:18:0x005c, B:22:0x0078, B:26:0x0095, B:32:0x00c7, B:36:0x00ea, B:38:0x00fb, B:63:0x0147, B:65:0x0166, B:69:0x0171, B:73:0x0179, B:142:0x02d4, B:144:0x02da, B:146:0x02e6, B:147:0x02ea, B:149:0x02f0, B:151:0x0304, B:155:0x030d, B:157:0x0313, B:163:0x0338, B:160:0x0328, B:162:0x0332, B:164:0x033b, B:166:0x0360, B:170:0x036f, B:174:0x0395, B:176:0x03cf, B:178:0x03d4, B:180:0x03dc, B:181:0x03df, B:183:0x03f9, B:184:0x03fc, B:186:0x040e, B:188:0x0423, B:195:0x043a, B:196:0x043d, B:198:0x044d, B:200:0x045b, B:207:0x046f, B:209:0x047b, B:211:0x0485, B:213:0x048d, B:214:0x0496, B:215:0x0499, B:217:0x04a9, B:222:0x04bc, B:224:0x04c5, B:225:0x04c8, B:227:0x04d8, B:232:0x04eb, B:233:0x04ee, B:235:0x04fe, B:240:0x0511, B:242:0x051e, B:246:0x0546, B:247:0x0556, B:249:0x0560, B:251:0x0570, B:256:0x0583, B:258:0x0588, B:259:0x058b, B:261:0x0597, B:262:0x05ab, B:263:0x05c0, B:265:0x05d5, B:267:0x05e4, B:268:0x05f7, B:270:0x0604, B:272:0x061b, B:274:0x0628, B:275:0x0631, B:271:0x0612, B:277:0x0678, B:128:0x02a2, B:141:0x02d1, B:281:0x0694, B:282:0x0697, B:283:0x0698, B:285:0x06a2, B:301:0x0709, B:303:0x070d, B:305:0x0713, B:307:0x071e, B:291:0x06ea, B:314:0x072d, B:315:0x0730), top: B:338:0x0014, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0588 A[Catch: all -> 0x0731, TryCatch #16 {all -> 0x0731, blocks: (B:3:0x0014, B:9:0x0036, B:13:0x004d, B:18:0x005c, B:22:0x0078, B:26:0x0095, B:32:0x00c7, B:36:0x00ea, B:38:0x00fb, B:63:0x0147, B:65:0x0166, B:69:0x0171, B:73:0x0179, B:142:0x02d4, B:144:0x02da, B:146:0x02e6, B:147:0x02ea, B:149:0x02f0, B:151:0x0304, B:155:0x030d, B:157:0x0313, B:163:0x0338, B:160:0x0328, B:162:0x0332, B:164:0x033b, B:166:0x0360, B:170:0x036f, B:174:0x0395, B:176:0x03cf, B:178:0x03d4, B:180:0x03dc, B:181:0x03df, B:183:0x03f9, B:184:0x03fc, B:186:0x040e, B:188:0x0423, B:195:0x043a, B:196:0x043d, B:198:0x044d, B:200:0x045b, B:207:0x046f, B:209:0x047b, B:211:0x0485, B:213:0x048d, B:214:0x0496, B:215:0x0499, B:217:0x04a9, B:222:0x04bc, B:224:0x04c5, B:225:0x04c8, B:227:0x04d8, B:232:0x04eb, B:233:0x04ee, B:235:0x04fe, B:240:0x0511, B:242:0x051e, B:246:0x0546, B:247:0x0556, B:249:0x0560, B:251:0x0570, B:256:0x0583, B:258:0x0588, B:259:0x058b, B:261:0x0597, B:262:0x05ab, B:263:0x05c0, B:265:0x05d5, B:267:0x05e4, B:268:0x05f7, B:270:0x0604, B:272:0x061b, B:274:0x0628, B:275:0x0631, B:271:0x0612, B:277:0x0678, B:128:0x02a2, B:141:0x02d1, B:281:0x0694, B:282:0x0697, B:283:0x0698, B:285:0x06a2, B:301:0x0709, B:303:0x070d, B:305:0x0713, B:307:0x071e, B:291:0x06ea, B:314:0x072d, B:315:0x0730), top: B:338:0x0014, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0597 A[Catch: all -> 0x0731, TryCatch #16 {all -> 0x0731, blocks: (B:3:0x0014, B:9:0x0036, B:13:0x004d, B:18:0x005c, B:22:0x0078, B:26:0x0095, B:32:0x00c7, B:36:0x00ea, B:38:0x00fb, B:63:0x0147, B:65:0x0166, B:69:0x0171, B:73:0x0179, B:142:0x02d4, B:144:0x02da, B:146:0x02e6, B:147:0x02ea, B:149:0x02f0, B:151:0x0304, B:155:0x030d, B:157:0x0313, B:163:0x0338, B:160:0x0328, B:162:0x0332, B:164:0x033b, B:166:0x0360, B:170:0x036f, B:174:0x0395, B:176:0x03cf, B:178:0x03d4, B:180:0x03dc, B:181:0x03df, B:183:0x03f9, B:184:0x03fc, B:186:0x040e, B:188:0x0423, B:195:0x043a, B:196:0x043d, B:198:0x044d, B:200:0x045b, B:207:0x046f, B:209:0x047b, B:211:0x0485, B:213:0x048d, B:214:0x0496, B:215:0x0499, B:217:0x04a9, B:222:0x04bc, B:224:0x04c5, B:225:0x04c8, B:227:0x04d8, B:232:0x04eb, B:233:0x04ee, B:235:0x04fe, B:240:0x0511, B:242:0x051e, B:246:0x0546, B:247:0x0556, B:249:0x0560, B:251:0x0570, B:256:0x0583, B:258:0x0588, B:259:0x058b, B:261:0x0597, B:262:0x05ab, B:263:0x05c0, B:265:0x05d5, B:267:0x05e4, B:268:0x05f7, B:270:0x0604, B:272:0x061b, B:274:0x0628, B:275:0x0631, B:271:0x0612, B:277:0x0678, B:128:0x02a2, B:141:0x02d1, B:281:0x0694, B:282:0x0697, B:283:0x0698, B:285:0x06a2, B:301:0x0709, B:303:0x070d, B:305:0x0713, B:307:0x071e, B:291:0x06ea, B:314:0x072d, B:315:0x0730), top: B:338:0x0014, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0694 A[Catch: all -> 0x0731, TryCatch #16 {all -> 0x0731, blocks: (B:3:0x0014, B:9:0x0036, B:13:0x004d, B:18:0x005c, B:22:0x0078, B:26:0x0095, B:32:0x00c7, B:36:0x00ea, B:38:0x00fb, B:63:0x0147, B:65:0x0166, B:69:0x0171, B:73:0x0179, B:142:0x02d4, B:144:0x02da, B:146:0x02e6, B:147:0x02ea, B:149:0x02f0, B:151:0x0304, B:155:0x030d, B:157:0x0313, B:163:0x0338, B:160:0x0328, B:162:0x0332, B:164:0x033b, B:166:0x0360, B:170:0x036f, B:174:0x0395, B:176:0x03cf, B:178:0x03d4, B:180:0x03dc, B:181:0x03df, B:183:0x03f9, B:184:0x03fc, B:186:0x040e, B:188:0x0423, B:195:0x043a, B:196:0x043d, B:198:0x044d, B:200:0x045b, B:207:0x046f, B:209:0x047b, B:211:0x0485, B:213:0x048d, B:214:0x0496, B:215:0x0499, B:217:0x04a9, B:222:0x04bc, B:224:0x04c5, B:225:0x04c8, B:227:0x04d8, B:232:0x04eb, B:233:0x04ee, B:235:0x04fe, B:240:0x0511, B:242:0x051e, B:246:0x0546, B:247:0x0556, B:249:0x0560, B:251:0x0570, B:256:0x0583, B:258:0x0588, B:259:0x058b, B:261:0x0597, B:262:0x05ab, B:263:0x05c0, B:265:0x05d5, B:267:0x05e4, B:268:0x05f7, B:270:0x0604, B:272:0x061b, B:274:0x0628, B:275:0x0631, B:271:0x0612, B:277:0x0678, B:128:0x02a2, B:141:0x02d1, B:281:0x0694, B:282:0x0697, B:283:0x0698, B:285:0x06a2, B:301:0x0709, B:303:0x070d, B:305:0x0713, B:307:0x071e, B:291:0x06ea, B:314:0x072d, B:315:0x0730), top: B:338:0x0014, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0713 A[Catch: all -> 0x0731, TryCatch #16 {all -> 0x0731, blocks: (B:3:0x0014, B:9:0x0036, B:13:0x004d, B:18:0x005c, B:22:0x0078, B:26:0x0095, B:32:0x00c7, B:36:0x00ea, B:38:0x00fb, B:63:0x0147, B:65:0x0166, B:69:0x0171, B:73:0x0179, B:142:0x02d4, B:144:0x02da, B:146:0x02e6, B:147:0x02ea, B:149:0x02f0, B:151:0x0304, B:155:0x030d, B:157:0x0313, B:163:0x0338, B:160:0x0328, B:162:0x0332, B:164:0x033b, B:166:0x0360, B:170:0x036f, B:174:0x0395, B:176:0x03cf, B:178:0x03d4, B:180:0x03dc, B:181:0x03df, B:183:0x03f9, B:184:0x03fc, B:186:0x040e, B:188:0x0423, B:195:0x043a, B:196:0x043d, B:198:0x044d, B:200:0x045b, B:207:0x046f, B:209:0x047b, B:211:0x0485, B:213:0x048d, B:214:0x0496, B:215:0x0499, B:217:0x04a9, B:222:0x04bc, B:224:0x04c5, B:225:0x04c8, B:227:0x04d8, B:232:0x04eb, B:233:0x04ee, B:235:0x04fe, B:240:0x0511, B:242:0x051e, B:246:0x0546, B:247:0x0556, B:249:0x0560, B:251:0x0570, B:256:0x0583, B:258:0x0588, B:259:0x058b, B:261:0x0597, B:262:0x05ab, B:263:0x05c0, B:265:0x05d5, B:267:0x05e4, B:268:0x05f7, B:270:0x0604, B:272:0x061b, B:274:0x0628, B:275:0x0631, B:271:0x0612, B:277:0x0678, B:128:0x02a2, B:141:0x02d1, B:281:0x0694, B:282:0x0697, B:283:0x0698, B:285:0x06a2, B:301:0x0709, B:303:0x070d, B:305:0x0713, B:307:0x071e, B:291:0x06ea, B:314:0x072d, B:315:0x0730), top: B:338:0x0014, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x05ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0143 A[Catch: all -> 0x0032, TryCatch #17 {all -> 0x0032, blocks: (B:5:0x0021, B:11:0x003c, B:16:0x0055, B:20:0x0067, B:24:0x0081, B:29:0x00be, B:35:0x00d3, B:41:0x0101, B:56:0x0138, B:57:0x013b, B:61:0x0143, B:62:0x0146, B:79:0x01b5), top: B:339:0x001f }] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r2v35, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 1850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlg.o():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:99:0x0346
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void p(com.google.android.gms.measurement.internal.zzaw r42, com.google.android.gms.measurement.internal.zzq r43) {
        /*
            Method dump skipped, instructions count: 3061
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlg.p(com.google.android.gms.measurement.internal.zzaw, com.google.android.gms.measurement.internal.zzq):void");
    }

    public final long q() {
        ((DefaultClock) zzax()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        zzka zzkaVar = this.f11890i;
        zzkaVar.n();
        zzkaVar.m();
        zzff zzffVar = zzkaVar.f11869i;
        long a10 = zzffVar.a();
        if (a10 == 0) {
            zzlo zzloVar = ((zzge) zzkaVar.f3529a).f11783l;
            zzge.d(zzloVar);
            a10 = zzloVar.v().nextInt(86400000) + 1;
            zzffVar.b(a10);
        }
        return ((((currentTimeMillis + a10) / 1000) / 60) / 60) / 24;
    }

    public final zzq t(String str) {
        e eVar = this.c;
        C(eVar);
        n0 G = eVar.G(str);
        if (G != null && !TextUtils.isEmpty(G.G())) {
            Boolean u7 = u(G);
            if (u7 != null && !u7.booleanValue()) {
                zzeu zzaA = zzaA();
                zzaA.f11712f.b(zzeu.v(str), "App version does not match; dropping. appId");
                return null;
            }
            String I = G.I();
            String G2 = G.G();
            long A = G.A();
            zzge zzgeVar = G.f239a;
            zzgb zzgbVar = zzgeVar.f11781j;
            zzge.f(zzgbVar);
            zzgbVar.m();
            String str2 = G.f249l;
            zzgb zzgbVar2 = zzgeVar.f11781j;
            zzge.f(zzgbVar2);
            zzgbVar2.m();
            long j10 = G.f250m;
            zzgb zzgbVar3 = zzgeVar.f11781j;
            zzge.f(zzgbVar3);
            zzgbVar3.m();
            long j11 = G.f251n;
            zzgb zzgbVar4 = zzgeVar.f11781j;
            zzge.f(zzgbVar4);
            zzgbVar4.m();
            boolean z10 = G.f252o;
            String H = G.H();
            zzgb zzgbVar5 = zzgeVar.f11781j;
            zzge.f(zzgbVar5);
            zzgbVar5.m();
            boolean y10 = G.y();
            String C = G.C();
            zzgb zzgbVar6 = zzgeVar.f11781j;
            zzge.f(zzgbVar6);
            zzgbVar6.m();
            Boolean bool = G.f255r;
            long B = G.B();
            zzgb zzgbVar7 = zzgeVar.f11781j;
            zzge.f(zzgbVar7);
            zzgbVar7.m();
            ArrayList arrayList = G.f257t;
            String e10 = F(str).e();
            boolean z11 = G.z();
            zzgb zzgbVar8 = zzgeVar.f11781j;
            zzge.f(zzgbVar8);
            zzgbVar8.m();
            return new zzq(str, I, G2, A, str2, j10, j11, null, z10, false, H, 0L, 0, y10, false, C, bool, B, arrayList, e10, "", null, z11, G.f260w);
        }
        zzaA().f11719m.b(str, "No app data available; dropping");
        return null;
    }

    public final Boolean u(n0 n0Var) {
        try {
            int i10 = (n0Var.A() > (-2147483648L) ? 1 : (n0Var.A() == (-2147483648L) ? 0 : -1));
            zzge zzgeVar = this.f11893l;
            if (i10 != 0) {
                if (n0Var.A() == Wrappers.a(zzgeVar.f11773a).c(0, n0Var.E()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.a(zzgeVar.f11773a).c(0, n0Var.E()).versionName;
                String G = n0Var.G();
                if (G != null && G.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final void v() {
        zzaB().m();
        if (!this.f11900s && !this.f11901t && !this.f11902u) {
            zzaA().f11720n.a("Stopping uploading service(s)");
            ArrayList arrayList = this.f11897p;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            ArrayList arrayList2 = this.f11897p;
            Preconditions.j(arrayList2);
            arrayList2.clear();
            return;
        }
        zzeu zzaA = zzaA();
        zzaA.f11720n.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f11900s), Boolean.valueOf(this.f11901t), Boolean.valueOf(this.f11902u));
    }

    @VisibleForTesting
    public final void w(com.google.android.gms.internal.measurement.zzgc zzgcVar, long j10, boolean z10) {
        String str;
        i2 i2Var;
        String str2;
        Object obj;
        e eVar = this.c;
        C(eVar);
        if (true != z10) {
            str = "_lte";
        } else {
            str = "_se";
        }
        i2 L = eVar.L(zzgcVar.zzaq(), str);
        if (L != null && (obj = L.f202e) != null) {
            String zzaq = zzgcVar.zzaq();
            ((DefaultClock) zzax()).getClass();
            i2Var = new i2(zzaq, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j10));
        } else {
            String zzaq2 = zzgcVar.zzaq();
            ((DefaultClock) zzax()).getClass();
            i2Var = new i2(zzaq2, "auto", str, System.currentTimeMillis(), Long.valueOf(j10));
        }
        zzgl zzd = zzgm.zzd();
        zzd.zzf(str);
        ((DefaultClock) zzax()).getClass();
        zzd.zzg(System.currentTimeMillis());
        Object obj2 = i2Var.f202e;
        zzd.zze(((Long) obj2).longValue());
        zzgm zzgmVar = (zzgm) zzd.zzaD();
        int z11 = zzli.z(zzgcVar, str);
        if (z11 >= 0) {
            zzgcVar.zzan(z11, zzgmVar);
        } else {
            zzgcVar.zzm(zzgmVar);
        }
        if (j10 > 0) {
            e eVar2 = this.c;
            C(eVar2);
            eVar2.x(i2Var);
            if (true != z10) {
                str2 = "lifetime";
            } else {
                str2 = "session-scoped";
            }
            zzaA().f11720n.c(str2, "Updated engagement user property. scope, value", obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x037c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlg.x():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:679:0x1154
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final boolean y(long r88) {
        /*
            Method dump skipped, instructions count: 6718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlg.y(long):boolean");
    }

    public final boolean z() {
        boolean z10;
        zzaB().m();
        b();
        e eVar = this.c;
        C(eVar);
        if (eVar.A("select count(1) > 0 from raw_events", null) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            e eVar2 = this.c;
            C(eVar2);
            if (TextUtils.isEmpty(eVar2.N())) {
                return false;
            }
        }
        return true;
    }

    @Override // a8.m0
    public final zzeu zzaA() {
        zzge zzgeVar = this.f11893l;
        Preconditions.j(zzgeVar);
        zzeu zzeuVar = zzgeVar.f11780i;
        zzge.f(zzeuVar);
        return zzeuVar;
    }

    @Override // a8.m0
    public final zzgb zzaB() {
        zzge zzgeVar = this.f11893l;
        Preconditions.j(zzgeVar);
        zzgb zzgbVar = zzgeVar.f11781j;
        zzge.f(zzgbVar);
        return zzgbVar;
    }

    @Override // a8.m0
    public final Context zzaw() {
        return this.f11893l.f11773a;
    }

    @Override // a8.m0
    public final Clock zzax() {
        zzge zzgeVar = this.f11893l;
        Preconditions.j(zzgeVar);
        return zzgeVar.f11785n;
    }

    @Override // a8.m0
    public final zzab zzay() {
        throw null;
    }
}
