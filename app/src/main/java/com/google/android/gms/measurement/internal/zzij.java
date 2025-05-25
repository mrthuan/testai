package com.google.android.gms.measurement.internal;

import a8.a1;
import a8.i1;
import a8.k0;
import a8.k1;
import a8.r0;
import a8.s;
import a8.v;
import a8.v0;
import a8.w0;
import a8.x1;
import a8.z0;
import android.app.Application;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.content.e;
import com.android.billingclient.api.h0;
import com.android.billingclient.api.i0;
import com.android.billingclient.api.u;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.internal.measurement.zzqr;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzij extends s {
    @VisibleForTesting
    public z0 c;

    /* renamed from: d  reason: collision with root package name */
    public zzhe f11826d;

    /* renamed from: e  reason: collision with root package name */
    public final CopyOnWriteArraySet f11827e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11828f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference f11829g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f11830h;

    /* renamed from: i  reason: collision with root package name */
    public zzai f11831i;

    /* renamed from: j  reason: collision with root package name */
    public int f11832j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicLong f11833k;

    /* renamed from: l  reason: collision with root package name */
    public long f11834l;

    /* renamed from: m  reason: collision with root package name */
    public int f11835m;

    /* renamed from: n  reason: collision with root package name */
    public final zzs f11836n;
    @VisibleForTesting

    /* renamed from: o  reason: collision with root package name */
    public boolean f11837o;

    /* renamed from: p  reason: collision with root package name */
    public final e f11838p;

    public zzij(zzge zzgeVar) {
        super(zzgeVar);
        this.f11827e = new CopyOnWriteArraySet();
        this.f11830h = new Object();
        this.f11837o = true;
        this.f11838p = new e(this);
        this.f11829g = new AtomicReference();
        this.f11831i = new zzai(null, null);
        this.f11832j = 100;
        this.f11834l = -1L;
        this.f11835m = 100;
        this.f11833k = new AtomicLong(0L);
        this.f11836n = new zzs(zzgeVar);
    }

    public static /* bridge */ /* synthetic */ void G(zzij zzijVar, zzai zzaiVar, zzai zzaiVar2) {
        boolean z10;
        zzah[] zzahVarArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        int i10 = 0;
        while (true) {
            if (i10 < 2) {
                zzah zzahVar = zzahVarArr[i10];
                if (!zzaiVar2.f(zzahVar) && zzaiVar.f(zzahVar)) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        boolean g10 = zzaiVar.g(zzaiVar2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (!z10 && !g10) {
            return;
        }
        ((zzge) zzijVar.f3529a).k().t();
    }

    public static void H(zzij zzijVar, zzai zzaiVar, int i10, long j10, boolean z10, boolean z11) {
        boolean z12;
        zzijVar.m();
        zzijVar.n();
        int i11 = (j10 > zzijVar.f11834l ? 1 : (j10 == zzijVar.f11834l ? 0 : -1));
        Object obj = zzijVar.f3529a;
        if (i11 <= 0) {
            int i12 = zzijVar.f11835m;
            zzai zzaiVar2 = zzai.f11530b;
            if (i12 <= i10) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                zzeu zzeuVar = ((zzge) obj).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11718l.b(zzaiVar, "Dropped out-of-date consent setting, proposed settings");
                return;
            }
        }
        zzge zzgeVar = (zzge) obj;
        v vVar = zzgeVar.f11779h;
        zzge.d(vVar);
        vVar.m();
        if (vVar.x(i10)) {
            SharedPreferences.Editor edit = vVar.q().edit();
            edit.putString("consent_settings", zzaiVar.e());
            edit.putInt("consent_source", i10);
            edit.apply();
            zzijVar.f11834l = j10;
            zzijVar.f11835m = i10;
            zzjy o10 = zzgeVar.o();
            o10.m();
            o10.n();
            if (z10) {
                Object obj2 = o10.f3529a;
                ((zzge) obj2).getClass();
                ((zzge) obj2).l().r();
            }
            if (o10.t()) {
                o10.y(new k1(o10, o10.v(false), 1));
            }
            if (z11) {
                zzgeVar.o().D(new AtomicReference());
                return;
            }
            return;
        }
        zzeu zzeuVar2 = zzgeVar.f11780i;
        zzge.f(zzeuVar2);
        zzeuVar2.f11718l.b(Integer.valueOf(i10), "Lower precedence consent source ignored, proposed source");
    }

    public final void A(zzai zzaiVar) {
        boolean z10;
        Boolean bool;
        m();
        if ((zzaiVar.f(zzah.ANALYTICS_STORAGE) && zzaiVar.f(zzah.AD_STORAGE)) || ((zzge) this.f3529a).o().t()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzge zzgeVar = (zzge) this.f3529a;
        zzgb zzgbVar = zzgeVar.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        if (z10 != zzgeVar.D) {
            zzge zzgeVar2 = (zzge) this.f3529a;
            zzgb zzgbVar2 = zzgeVar2.f11781j;
            zzge.f(zzgbVar2);
            zzgbVar2.m();
            zzgeVar2.D = z10;
            v vVar = ((zzge) this.f3529a).f11779h;
            zzge.d(vVar);
            vVar.m();
            if (vVar.q().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(vVar.q().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z10 || bool == null || bool.booleanValue()) {
                D(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void B(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        String str3;
        int i11 = 0;
        Object obj2 = this.f3529a;
        if (z10) {
            zzlo zzloVar = ((zzge) obj2).f11783l;
            zzge.d(zzloVar);
            i10 = zzloVar.o0(str2);
        } else {
            zzlo zzloVar2 = ((zzge) obj2).f11783l;
            zzge.d(zzloVar2);
            if (zzloVar2.U("user property", str2)) {
                if (!zzloVar2.R("user property", zzhd.f11808a, null, str2)) {
                    i10 = 15;
                } else {
                    ((zzge) zzloVar2.f3529a).getClass();
                    if (zzloVar2.O(24, "user property", str2)) {
                        i10 = 0;
                    }
                }
            }
            i10 = 6;
        }
        e eVar = this.f11838p;
        if (i10 != 0) {
            zzge zzgeVar = (zzge) obj2;
            zzlo zzloVar3 = zzgeVar.f11783l;
            zzge.d(zzloVar3);
            zzgeVar.getClass();
            zzloVar3.getClass();
            String t4 = zzlo.t(24, str2, true);
            if (str2 != null) {
                i11 = str2.length();
            }
            zzlo zzloVar4 = zzgeVar.f11783l;
            zzge.d(zzloVar4);
            zzloVar4.getClass();
            zzlo.D(eVar, null, i10, "_ev", t4, i11);
            return;
        }
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (obj != null) {
            zzge zzgeVar2 = (zzge) obj2;
            zzlo zzloVar5 = zzgeVar2.f11783l;
            zzge.d(zzloVar5);
            int k02 = zzloVar5.k0(obj, str2);
            if (k02 != 0) {
                zzlo zzloVar6 = zzgeVar2.f11783l;
                zzge.d(zzloVar6);
                zzgeVar2.getClass();
                zzloVar6.getClass();
                String t10 = zzlo.t(24, str2, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i11 = obj.toString().length();
                }
                zzlo zzloVar7 = zzgeVar2.f11783l;
                zzge.d(zzloVar7);
                zzloVar7.getClass();
                zzlo.D(eVar, null, k02, "_ev", t10, i11);
                return;
            }
            zzlo zzloVar8 = zzgeVar2.f11783l;
            zzge.d(zzloVar8);
            Object r4 = zzloVar8.r(obj, str2);
            if (r4 != null) {
                zzgb zzgbVar = ((zzge) obj2).f11781j;
                zzge.f(zzgbVar);
                zzgbVar.u(new k0(this, str3, str2, r4, j10, 1));
                return;
            }
            return;
        }
        zzgb zzgbVar2 = ((zzge) obj2).f11781j;
        zzge.f(zzgbVar2);
        zzgbVar2.u(new k0(this, str3, str2, null, j10, 1));
    }

    public final void C(long j10, Object obj, String str, String str2) {
        boolean t4;
        long j11;
        Preconditions.f(str);
        Preconditions.f(str2);
        m();
        n();
        boolean equals = "allow_personalized_ads".equals(str2);
        Object obj2 = this.f3529a;
        if (equals) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    String str4 = "false";
                    if (true != "false".equals(str3.toLowerCase(Locale.ENGLISH))) {
                        j11 = 0;
                    } else {
                        j11 = 1;
                    }
                    Long valueOf = Long.valueOf(j11);
                    v vVar = ((zzge) obj2).f11779h;
                    zzge.d(vVar);
                    if (valueOf.longValue() == 1) {
                        str4 = "true";
                    }
                    vVar.f349l.b(str4);
                    obj = valueOf;
                    str2 = "_npa";
                }
            }
            if (obj == null) {
                v vVar2 = ((zzge) obj2).f11779h;
                zzge.d(vVar2);
                vVar2.f349l.b("unset");
                obj = obj;
                str2 = "_npa";
            }
        }
        Object obj3 = obj;
        String str5 = str2;
        zzge zzgeVar = (zzge) obj2;
        if (!zzgeVar.b()) {
            zzeu zzeuVar = zzgeVar.f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11720n.a("User property not set since app measurement is disabled");
        } else if (!zzgeVar.c()) {
        } else {
            zzlj zzljVar = new zzlj(j10, obj3, str5, str);
            zzjy o10 = zzgeVar.o();
            o10.m();
            o10.n();
            Object obj4 = o10.f3529a;
            ((zzge) obj4).getClass();
            zzen l10 = ((zzge) obj4).l();
            l10.getClass();
            Parcel obtain = Parcel.obtain();
            zzlk.a(zzljVar, obtain);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                zzeu zzeuVar2 = ((zzge) l10.f3529a).f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11713g.a("User property too long for local database. Sending directly to service");
                t4 = false;
            } else {
                t4 = l10.t(1, marshall);
            }
            o10.y(new i1(o10, o10.v(true), t4, zzljVar));
        }
    }

    public final void D(Boolean bool, boolean z10) {
        m();
        n();
        zzge zzgeVar = (zzge) this.f3529a;
        zzeu zzeuVar = zzgeVar.f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11719m.b(bool, "Setting app measurement enabled (FE)");
        v vVar = zzgeVar.f11779h;
        zzge.d(vVar);
        vVar.u(bool);
        if (z10) {
            v vVar2 = zzgeVar.f11779h;
            zzge.d(vVar2);
            vVar2.m();
            SharedPreferences.Editor edit = vVar2.q().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        zzgb zzgbVar = zzgeVar.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        if (!zzgeVar.D && (bool == null || bool.booleanValue())) {
            return;
        }
        E();
    }

    public final void E() {
        long j10;
        m();
        zzge zzgeVar = (zzge) this.f3529a;
        v vVar = zzgeVar.f11779h;
        zzge.d(vVar);
        String a10 = vVar.f349l.a();
        if (a10 != null) {
            if ("unset".equals(a10)) {
                zzgeVar.f11785n.getClass();
                C(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                if (true != "true".equals(a10)) {
                    j10 = 0;
                } else {
                    j10 = 1;
                }
                Long valueOf = Long.valueOf(j10);
                zzgeVar.f11785n.getClass();
                C(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        if (zzgeVar.b() && this.f11837o) {
            zzeu zzeuVar = zzgeVar.f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11719m.a("Recording app launch after enabling measurement for the first time (FE)");
            I();
            zzpe.zzc();
            if (zzgeVar.f11778g.v(null, zzeh.f11650f0)) {
                zzko zzkoVar = zzgeVar.f11782k;
                zzge.e(zzkoVar);
                zzkoVar.f11877d.a();
            }
            zzgb zzgbVar = zzgeVar.f11781j;
            zzge.f(zzgbVar);
            zzgbVar.u(new u(this, 2));
            return;
        }
        zzeu zzeuVar2 = zzgeVar.f11780i;
        zzge.f(zzeuVar2);
        zzeuVar2.f11719m.a("Updating Scion state (FE)");
        zzjy o10 = zzgeVar.o();
        o10.m();
        o10.n();
        o10.y(new r0(2, o10, o10.v(true)));
    }

    public final String F() {
        return (String) this.f11829g.get();
    }

    public final void I() {
        m();
        n();
        zzge zzgeVar = (zzge) this.f3529a;
        if (zzgeVar.c()) {
            if (zzgeVar.f11778g.v(null, zzeh.Z)) {
                zzag zzagVar = zzgeVar.f11778g;
                ((zzge) zzagVar.f3529a).getClass();
                Boolean u7 = zzagVar.u("google_analytics_deferred_deep_link_enabled");
                if (u7 != null && u7.booleanValue()) {
                    zzeu zzeuVar = zzgeVar.f11780i;
                    zzge.f(zzeuVar);
                    zzeuVar.f11719m.a("Deferred Deep Link feature enabled.");
                    zzgb zzgbVar = zzgeVar.f11781j;
                    zzge.f(zzgbVar);
                    zzgbVar.u(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhl
                        @Override // java.lang.Runnable
                        public final void run() {
                            Pair pair;
                            boolean z10;
                            NetworkInfo activeNetworkInfo;
                            URL url;
                            zzij zzijVar = zzij.this;
                            zzijVar.m();
                            zzge zzgeVar2 = (zzge) zzijVar.f3529a;
                            v vVar = zzgeVar2.f11779h;
                            zzge.d(vVar);
                            if (!vVar.f355r.b()) {
                                v vVar2 = zzgeVar2.f11779h;
                                zzge.d(vVar2);
                                long a10 = vVar2.f356s.a();
                                v vVar3 = zzgeVar2.f11779h;
                                zzge.d(vVar3);
                                vVar3.f356s.b(1 + a10);
                                zzgeVar2.getClass();
                                if (a10 >= 5) {
                                    zzeu zzeuVar2 = zzgeVar2.f11780i;
                                    zzge.f(zzeuVar2);
                                    zzeuVar2.f11715i.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                    v vVar4 = zzgeVar2.f11779h;
                                    zzge.d(vVar4);
                                    vVar4.f355r.a(true);
                                    return;
                                }
                                zzgb zzgbVar2 = zzgeVar2.f11781j;
                                zzge.f(zzgbVar2);
                                zzgbVar2.m();
                                zzin zzinVar = zzgeVar2.f11789r;
                                zzge.f(zzinVar);
                                zzge.f(zzinVar);
                                String r4 = zzgeVar2.k().r();
                                v vVar5 = zzgeVar2.f11779h;
                                zzge.d(vVar5);
                                vVar5.m();
                                Object obj = vVar5.f3529a;
                                zzge zzgeVar3 = (zzge) obj;
                                zzgeVar3.f11785n.getClass();
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                String str = vVar5.f344g;
                                if (str != null && elapsedRealtime < vVar5.f346i) {
                                    pair = new Pair(str, Boolean.valueOf(vVar5.f345h));
                                } else {
                                    vVar5.f346i = zzgeVar3.f11778g.s(r4, zzeh.f11642b) + elapsedRealtime;
                                    AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
                                    try {
                                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(((zzge) obj).f11773a);
                                        vVar5.f344g = "";
                                        String id2 = advertisingIdInfo.getId();
                                        if (id2 != null) {
                                            vVar5.f344g = id2;
                                        }
                                        vVar5.f345h = advertisingIdInfo.isLimitAdTrackingEnabled();
                                    } catch (Exception e10) {
                                        zzeu zzeuVar3 = zzgeVar3.f11780i;
                                        zzge.f(zzeuVar3);
                                        zzeuVar3.f11719m.b(e10, "Unable to get advertising id");
                                        vVar5.f344g = "";
                                    }
                                    AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                                    pair = new Pair(vVar5.f344g, Boolean.valueOf(vVar5.f345h));
                                }
                                Boolean u10 = zzgeVar2.f11778g.u("google_analytics_adid_collection_enabled");
                                if (u10 != null && !u10.booleanValue()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                zzeu zzeuVar4 = zzgeVar2.f11780i;
                                if (z10 && !((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
                                    zzge.f(zzinVar);
                                    zzinVar.o();
                                    zzge zzgeVar4 = (zzge) zzinVar.f3529a;
                                    ConnectivityManager connectivityManager = (ConnectivityManager) zzgeVar4.f11773a.getSystemService("connectivity");
                                    if (connectivityManager != null) {
                                        try {
                                            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                        } catch (SecurityException unused) {
                                        }
                                        if (activeNetworkInfo == null && activeNetworkInfo.isConnected()) {
                                            zzlo zzloVar = zzgeVar2.f11783l;
                                            zzge.d(zzloVar);
                                            ((zzge) zzgeVar2.k().f3529a).f11778g.r();
                                            String str2 = (String) pair.first;
                                            long a11 = vVar5.f356s.a() - 1;
                                            Object obj2 = zzloVar.f3529a;
                                            try {
                                                Preconditions.f(str2);
                                                Preconditions.f(r4);
                                                String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 77000L, Integer.valueOf(zzloVar.p0())), str2, r4, Long.valueOf(a11));
                                                if (r4.equals(((zzge) obj2).f11778g.n("debug.deferred.deeplink"))) {
                                                    format = format.concat("&ddl_test=1");
                                                }
                                                url = new URL(format);
                                            } catch (IllegalArgumentException | MalformedURLException e11) {
                                                zzeu zzeuVar5 = ((zzge) obj2).f11780i;
                                                zzge.f(zzeuVar5);
                                                zzeuVar5.f11712f.b(e11.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                                url = null;
                                            }
                                            if (url != null) {
                                                zzge.f(zzinVar);
                                                zzgc zzgcVar = new zzgc(zzgeVar2);
                                                zzinVar.m();
                                                zzinVar.o();
                                                zzgb zzgbVar3 = zzgeVar4.f11781j;
                                                zzge.f(zzgbVar3);
                                                zzgbVar3.t(new a1(zzinVar, r4, url, zzgcVar));
                                                return;
                                            }
                                            return;
                                        }
                                        zzge.f(zzeuVar4);
                                        zzeuVar4.f11715i.a("Network is not available for Deferred Deep Link request. Skipping");
                                        return;
                                    }
                                    activeNetworkInfo = null;
                                    if (activeNetworkInfo == null) {
                                    }
                                    zzge.f(zzeuVar4);
                                    zzeuVar4.f11715i.a("Network is not available for Deferred Deep Link request. Skipping");
                                    return;
                                }
                                zzge.f(zzeuVar4);
                                zzeuVar4.f11719m.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                                return;
                            }
                            zzeu zzeuVar6 = zzgeVar2.f11780i;
                            zzge.f(zzeuVar6);
                            zzeuVar6.f11719m.a("Deferred Deep Link already retrieved. Not fetching again.");
                        }
                    });
                }
            }
            zzjy o10 = zzgeVar.o();
            o10.m();
            o10.n();
            zzq v10 = o10.v(true);
            ((zzge) o10.f3529a).l().t(3, new byte[0]);
            o10.y(new k1(o10, v10, 0));
            this.f11837o = false;
            v vVar = zzgeVar.f11779h;
            zzge.d(vVar);
            vVar.m();
            String string = vVar.q().getString("previous_os_version", null);
            ((zzge) vVar.f3529a).j().o();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = vVar.q().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                zzgeVar.j().o();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    t(bundle, "auto", "_ou");
                }
            }
        }
    }

    @Override // a8.s
    public final boolean p() {
        return false;
    }

    public final void q(Bundle bundle, String str, String str2) {
        zzge zzgeVar = (zzge) this.f3529a;
        zzgeVar.f11785n.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Preconditions.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(NamingTable.TAG, str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        zzgb zzgbVar = zzgeVar.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new r0(0, this, bundle2));
    }

    public final void r() {
        Object obj = this.f3529a;
        if ((((zzge) obj).f11773a.getApplicationContext() instanceof Application) && this.c != null) {
            ((Application) ((zzge) obj).f11773a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fa, code lost:
        if (r5 > 100) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0130, code lost:
        if (r6 > 100) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, boolean r24, boolean r25, long r26) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzij.s(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void t(Bundle bundle, String str, String str2) {
        m();
        ((zzge) this.f3529a).f11785n.getClass();
        u(str, str2, bundle, System.currentTimeMillis());
    }

    public final void u(String str, String str2, Bundle bundle, long j10) {
        boolean z10;
        m();
        if (this.f11826d != null && !zzlo.a0(str2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        v(str, str2, j10, bundle, true, z10, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.lang.String r22, java.lang.String r23, long r24, android.os.Bundle r26, boolean r27, boolean r28, boolean r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzij.v(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void w(long j10, boolean z10) {
        m();
        n();
        zzge zzgeVar = (zzge) this.f3529a;
        zzeu zzeuVar = zzgeVar.f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11719m.a("Resetting analytics data (FE)");
        zzko zzkoVar = zzgeVar.f11782k;
        zzge.e(zzkoVar);
        zzkoVar.m();
        x1 x1Var = zzkoVar.f11878e;
        x1Var.c.a();
        x1Var.f380a = 0L;
        x1Var.f381b = 0L;
        zzqr.zzc();
        if (zzgeVar.f11778g.v(null, zzeh.f11660k0)) {
            zzgeVar.k().t();
        }
        boolean b10 = zzgeVar.b();
        v vVar = zzgeVar.f11779h;
        zzge.d(vVar);
        vVar.f342e.b(j10);
        zzge zzgeVar2 = (zzge) vVar.f3529a;
        v vVar2 = zzgeVar2.f11779h;
        zzge.d(vVar2);
        if (!TextUtils.isEmpty(vVar2.f357t.a())) {
            vVar.f357t.b(null);
        }
        zzpe.zzc();
        zzag zzagVar = zzgeVar2.f11778g;
        zzeg zzegVar = zzeh.f11650f0;
        if (zzagVar.v(null, zzegVar)) {
            vVar.f351n.b(0L);
        }
        vVar.f352o.b(0L);
        if (!zzgeVar2.f11778g.x()) {
            vVar.v(!b10);
        }
        vVar.f358u.b(null);
        vVar.f359v.b(0L);
        vVar.f360w.b(null);
        if (z10) {
            zzjy o10 = zzgeVar.o();
            o10.m();
            o10.n();
            zzq v10 = o10.v(false);
            Object obj = o10.f3529a;
            ((zzge) obj).getClass();
            ((zzge) obj).l().r();
            o10.y(new h0(o10, v10, 1));
        }
        zzpe.zzc();
        if (zzgeVar.f11778g.v(null, zzegVar)) {
            zzko zzkoVar2 = zzgeVar.f11782k;
            zzge.e(zzkoVar2);
            zzkoVar2.f11877d.a();
        }
        this.f11837o = true ^ b10;
    }

    public final void x(Bundle bundle, long j10) {
        Preconditions.j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        boolean isEmpty = TextUtils.isEmpty(bundle2.getString("app_id"));
        Object obj = this.f3529a;
        if (!isEmpty) {
            zzeu zzeuVar = ((zzge) obj).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11715i.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        zzha.a(bundle2, "app_id", String.class, null);
        zzha.a(bundle2, "origin", String.class, null);
        zzha.a(bundle2, NamingTable.TAG, String.class, null);
        zzha.a(bundle2, "value", Object.class, null);
        zzha.a(bundle2, "trigger_event_name", String.class, null);
        zzha.a(bundle2, "trigger_timeout", Long.class, 0L);
        zzha.a(bundle2, "timed_out_event_name", String.class, null);
        zzha.a(bundle2, "timed_out_event_params", Bundle.class, null);
        zzha.a(bundle2, "triggered_event_name", String.class, null);
        zzha.a(bundle2, "triggered_event_params", Bundle.class, null);
        zzha.a(bundle2, "time_to_live", Long.class, 0L);
        zzha.a(bundle2, "expired_event_name", String.class, null);
        zzha.a(bundle2, "expired_event_params", Bundle.class, null);
        Preconditions.f(bundle2.getString(NamingTable.TAG));
        Preconditions.f(bundle2.getString("origin"));
        Preconditions.j(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString(NamingTable.TAG);
        Object obj2 = bundle2.get("value");
        zzge zzgeVar = (zzge) obj;
        zzlo zzloVar = zzgeVar.f11783l;
        zzge.d(zzloVar);
        if (zzloVar.o0(string) == 0) {
            zzlo zzloVar2 = zzgeVar.f11783l;
            zzge.d(zzloVar2);
            if (zzloVar2.k0(obj2, string) == 0) {
                zzlo zzloVar3 = zzgeVar.f11783l;
                zzge.d(zzloVar3);
                Object r4 = zzloVar3.r(obj2, string);
                if (r4 == null) {
                    zzeu zzeuVar2 = zzgeVar.f11780i;
                    zzge.f(zzeuVar2);
                    zzeuVar2.f11712f.c(zzgeVar.f11784m.f(string), "Unable to normalize conditional user property value", obj2);
                    return;
                }
                zzha.b(r4, bundle2);
                long j11 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                    zzgeVar.getClass();
                    if (j11 > 15552000000L || j11 < 1) {
                        zzeu zzeuVar3 = zzgeVar.f11780i;
                        zzge.f(zzeuVar3);
                        zzeuVar3.f11712f.c(zzgeVar.f11784m.f(string), "Invalid conditional user property timeout", Long.valueOf(j11));
                        return;
                    }
                }
                long j12 = bundle2.getLong("time_to_live");
                zzgeVar.getClass();
                if (j12 <= 15552000000L && j12 >= 1) {
                    zzgb zzgbVar = zzgeVar.f11781j;
                    zzge.f(zzgbVar);
                    zzgbVar.u(new i0(this, bundle2, 1));
                    return;
                }
                zzeu zzeuVar4 = zzgeVar.f11780i;
                zzge.f(zzeuVar4);
                zzeuVar4.f11712f.c(zzgeVar.f11784m.f(string), "Invalid conditional user property time to live", Long.valueOf(j12));
                return;
            }
            zzeu zzeuVar5 = zzgeVar.f11780i;
            zzge.f(zzeuVar5);
            zzeuVar5.f11712f.c(zzgeVar.f11784m.f(string), "Invalid conditional user property value", obj2);
            return;
        }
        zzeu zzeuVar6 = zzgeVar.f11780i;
        zzge.f(zzeuVar6);
        zzeuVar6.f11712f.b(zzgeVar.f11784m.f(string), "Invalid conditional user property name");
    }

    public final void y(Bundle bundle, int i10, long j10) {
        Object obj;
        String string;
        n();
        zzai zzaiVar = zzai.f11530b;
        zzah[] values = zzah.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            zzah zzahVar = values[i11];
            if (bundle.containsKey(zzahVar.zzd) && (string = bundle.getString(zzahVar.zzd)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i11++;
        }
        if (obj != null) {
            zzge zzgeVar = (zzge) this.f3529a;
            zzeu zzeuVar = zzgeVar.f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11717k.b(obj, "Ignoring invalid consent setting");
            zzeu zzeuVar2 = zzgeVar.f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11717k.a("Valid consent values are 'granted', 'denied'");
        }
        z(zzai.a(bundle), i10, j10);
    }

    public final void z(zzai zzaiVar, int i10, long j10) {
        zzai zzaiVar2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        zzai zzaiVar3 = zzaiVar;
        n();
        if (i10 != -10 && ((Boolean) zzaiVar3.f11531a.get(zzah.AD_STORAGE)) == null && ((Boolean) zzaiVar3.f11531a.get(zzah.ANALYTICS_STORAGE)) == null) {
            zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11717k.a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f11830h) {
            try {
                zzaiVar2 = this.f11831i;
                int i11 = this.f11832j;
                zzai zzaiVar4 = zzai.f11530b;
                z10 = false;
                if (i10 <= i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    z12 = zzaiVar3.g(zzaiVar2, (zzah[]) zzaiVar3.f11531a.keySet().toArray(new zzah[0]));
                    zzah zzahVar = zzah.ANALYTICS_STORAGE;
                    if (zzaiVar3.f(zzahVar) && !this.f11831i.f(zzahVar)) {
                        z10 = true;
                    }
                    zzaiVar3 = zzaiVar3.d(this.f11831i);
                    this.f11831i = zzaiVar3;
                    this.f11832j = i10;
                    z13 = z10;
                    z10 = true;
                } else {
                    z12 = false;
                    z13 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            zzeu zzeuVar2 = ((zzge) this.f3529a).f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11718l.b(zzaiVar3, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f11833k.getAndIncrement();
        if (z12) {
            this.f11829g.set(null);
            zzgb zzgbVar = ((zzge) this.f3529a).f11781j;
            zzge.f(zzgbVar);
            zzgbVar.v(new v0(this, zzaiVar3, j10, i10, andIncrement, z13, zzaiVar2));
            return;
        }
        w0 w0Var = new w0(this, zzaiVar3, i10, andIncrement, z13, zzaiVar2);
        if (i10 != 30 && i10 != -10) {
            zzgb zzgbVar2 = ((zzge) this.f3529a).f11781j;
            zzge.f(zzgbVar2);
            zzgbVar2.u(w0Var);
            return;
        }
        zzgb zzgbVar3 = ((zzge) this.f3529a).f11781j;
        zzge.f(zzgbVar3);
        zzgbVar3.v(w0Var);
    }
}
