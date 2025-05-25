package com.google.android.gms.measurement.internal;

import a8.d1;
import a8.s;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zziy extends s {
    public volatile zziq c;

    /* renamed from: d  reason: collision with root package name */
    public volatile zziq f11847d;
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    public zziq f11848e;

    /* renamed from: f  reason: collision with root package name */
    public final ConcurrentHashMap f11849f;

    /* renamed from: g  reason: collision with root package name */
    public Activity f11850g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f11851h;

    /* renamed from: i  reason: collision with root package name */
    public volatile zziq f11852i;

    /* renamed from: j  reason: collision with root package name */
    public zziq f11853j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11854k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f11855l;

    public zziy(zzge zzgeVar) {
        super(zzgeVar);
        this.f11855l = new Object();
        this.f11849f = new ConcurrentHashMap();
    }

    @Override // a8.s
    public final boolean p() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(com.google.android.gms.measurement.internal.zziq r17, com.google.android.gms.measurement.internal.zziq r18, long r19, boolean r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zziy.q(com.google.android.gms.measurement.internal.zziq, com.google.android.gms.measurement.internal.zziq, long, boolean, android.os.Bundle):void");
    }

    public final void r(zziq zziqVar, boolean z10, long j10) {
        boolean z11;
        zzge zzgeVar = (zzge) this.f3529a;
        zzd h10 = zzgeVar.h();
        zzgeVar.f11785n.getClass();
        h10.p(SystemClock.elapsedRealtime());
        if (zziqVar != null && zziqVar.f11844d) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzko zzkoVar = zzgeVar.f11782k;
        zzge.e(zzkoVar);
        if (zzkoVar.f11878e.a(j10, z11, z10) && zziqVar != null) {
            zziqVar.f11844d = false;
        }
    }

    public final zziq s(boolean z10) {
        n();
        m();
        if (!z10) {
            return this.f11848e;
        }
        zziq zziqVar = this.f11848e;
        if (zziqVar != null) {
            return zziqVar;
        }
        return this.f11853j;
    }

    @VisibleForTesting
    public final String t(Class cls) {
        String str;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        if (length > 0) {
            str = split[length - 1];
        } else {
            str = "";
        }
        int length2 = str.length();
        zzge zzgeVar = (zzge) this.f3529a;
        zzgeVar.getClass();
        if (length2 > 100) {
            zzgeVar.getClass();
            return str.substring(0, 100);
        }
        return str;
    }

    public final void u(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!((zzge) this.f3529a).f11778g.w() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f11849f.put(activity, new zziq(bundle2.getString(NamingTable.TAG), bundle2.getString("referrer_name"), bundle2.getLong(FacebookMediationAdapter.KEY_ID)));
    }

    public final zziq v(Activity activity) {
        Preconditions.j(activity);
        zziq zziqVar = (zziq) this.f11849f.get(activity);
        if (zziqVar == null) {
            String t4 = t(activity.getClass());
            zzlo zzloVar = ((zzge) this.f3529a).f11783l;
            zzge.d(zzloVar);
            zziq zziqVar2 = new zziq(null, t4, zzloVar.r0());
            this.f11849f.put(activity, zziqVar2);
            zziqVar = zziqVar2;
        }
        if (this.f11852i != null) {
            return this.f11852i;
        }
        return zziqVar;
    }

    public final void w(Activity activity, zziq zziqVar, boolean z10) {
        zziq zziqVar2;
        zziq zziqVar3;
        String str;
        if (this.c == null) {
            zziqVar2 = this.f11847d;
        } else {
            zziqVar2 = this.c;
        }
        zziq zziqVar4 = zziqVar2;
        if (zziqVar.f11843b == null) {
            if (activity != null) {
                str = t(activity.getClass());
            } else {
                str = null;
            }
            zziqVar3 = new zziq(zziqVar.f11842a, str, zziqVar.c, zziqVar.f11845e, zziqVar.f11846f);
        } else {
            zziqVar3 = zziqVar;
        }
        this.f11847d = this.c;
        this.c = zziqVar3;
        ((zzge) this.f3529a).f11785n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        zzgb zzgbVar = ((zzge) this.f3529a).f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new d1(this, zziqVar3, zziqVar4, elapsedRealtime, z10));
    }
}
