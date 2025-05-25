package a8;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zziq;
import com.google.android.gms.measurement.internal.zziy;
import com.google.android.gms.measurement.internal.zzko;
import com.tom_roush.fontbox.ttf.NamingTable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
@VisibleForTesting
@TargetApi(14)
/* loaded from: classes2.dex */
public final class z0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzij f394a;

    public z0(zzij zzijVar) {
        this.f394a = zzijVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityCreated(android.app.Activity r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.z0.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zziy zziyVar = ((zzge) this.f394a.f3529a).f11786o;
        zzge.e(zziyVar);
        synchronized (zziyVar.f11855l) {
            if (activity == zziyVar.f11850g) {
                zziyVar.f11850g = null;
            }
        }
        if (((zzge) zziyVar.f3529a).f11778g.w()) {
            zziyVar.f11849f.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zziy zziyVar = ((zzge) this.f394a.f3529a).f11786o;
        zzge.e(zziyVar);
        synchronized (zziyVar.f11855l) {
            zziyVar.f11854k = false;
            zziyVar.f11851h = true;
        }
        ((zzge) zziyVar.f3529a).f11785n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!((zzge) zziyVar.f3529a).f11778g.w()) {
            zziyVar.c = null;
            zzgb zzgbVar = ((zzge) zziyVar.f3529a).f11781j;
            zzge.f(zzgbVar);
            zzgbVar.u(new e1(zziyVar, elapsedRealtime));
        } else {
            zziq v10 = zziyVar.v(activity);
            zziyVar.f11847d = zziyVar.c;
            zziyVar.c = null;
            zzgb zzgbVar2 = ((zzge) zziyVar.f3529a).f11781j;
            zzge.f(zzgbVar2);
            zzgbVar2.u(new f1(zziyVar, v10, elapsedRealtime));
        }
        zzko zzkoVar = ((zzge) this.f394a.f3529a).f11782k;
        zzge.e(zzkoVar);
        ((zzge) zzkoVar.f3529a).f11785n.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        zzgb zzgbVar3 = ((zzge) zzkoVar.f3529a).f11781j;
        zzge.f(zzgbVar3);
        zzgbVar3.u(new u1(zzkoVar, elapsedRealtime2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzko zzkoVar = ((zzge) this.f394a.f3529a).f11782k;
        zzge.e(zzkoVar);
        ((zzge) zzkoVar.f3529a).f11785n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        zzgb zzgbVar = ((zzge) zzkoVar.f3529a).f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new j(zzkoVar, elapsedRealtime, 1));
        zziy zziyVar = ((zzge) this.f394a.f3529a).f11786o;
        zzge.e(zziyVar);
        synchronized (zziyVar.f11855l) {
            zziyVar.f11854k = true;
            if (activity != zziyVar.f11850g) {
                synchronized (zziyVar.f11855l) {
                    zziyVar.f11850g = activity;
                    zziyVar.f11851h = false;
                }
                if (((zzge) zziyVar.f3529a).f11778g.w()) {
                    zziyVar.f11852i = null;
                    zzgb zzgbVar2 = ((zzge) zziyVar.f3529a).f11781j;
                    zzge.f(zzgbVar2);
                    zzgbVar2.u(new com.android.billingclient.api.u(zziyVar, 3));
                }
            }
        }
        if (!((zzge) zziyVar.f3529a).f11778g.w()) {
            zziyVar.c = zziyVar.f11852i;
            zzgb zzgbVar3 = ((zzge) zziyVar.f3529a).f11781j;
            zzge.f(zzgbVar3);
            zzgbVar3.u(new k7.r(zziyVar, 1));
            return;
        }
        zziyVar.w(activity, zziyVar.v(activity), false);
        zzd h10 = ((zzge) zziyVar.f3529a).h();
        ((zzge) h10.f3529a).f11785n.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        zzgb zzgbVar4 = ((zzge) h10.f3529a).f11781j;
        zzge.f(zzgbVar4);
        zzgbVar4.u(new j(h10, elapsedRealtime2, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zziq zziqVar;
        zziy zziyVar = ((zzge) this.f394a.f3529a).f11786o;
        zzge.e(zziyVar);
        if (((zzge) zziyVar.f3529a).f11778g.w() && bundle != null && (zziqVar = (zziq) zziyVar.f11849f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong(FacebookMediationAdapter.KEY_ID, zziqVar.c);
            bundle2.putString(NamingTable.TAG, zziqVar.f11842a);
            bundle2.putString("referrer_name", zziqVar.f11843b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
