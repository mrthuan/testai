package com.google.android.gms.measurement.internal;

import a2.a;
import a8.a0;
import a8.h1;
import a8.k2;
import a8.l2;
import a8.o0;
import a8.q0;
import a8.r0;
import a8.t0;
import a8.t1;
import a8.v;
import a8.x0;
import a8.z0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.content.e;
import com.android.billingclient.api.h0;
import com.android.billingclient.api.i0;
import com.android.billingclient.api.n;
import com.android.billingclient.api.p;
import com.google.android.gms.common.api.internal.e0;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import y.b;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.2 */
@DynamiteApi
/* loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzcb {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    public zzge f11514a = null;

    /* renamed from: b  reason: collision with root package name */
    public final b f11515b = new b();

    public final void K(String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        zzlo zzloVar = this.f11514a.f11783l;
        zzge.d(zzloVar);
        zzloVar.L(str, zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void beginAdUnitExposure(String str, long j10) {
        zzb();
        this.f11514a.h().n(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        zzijVar.q(bundle, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearMeasurementEnabled(long j10) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        zzijVar.n();
        zzgb zzgbVar = ((zzge) zzijVar.f3529a).f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new e0(5, zzijVar, null));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void endAdUnitExposure(String str, long j10) {
        zzb();
        this.f11514a.h().o(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void generateEventId(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        zzlo zzloVar = this.f11514a.f11783l;
        zzge.d(zzloVar);
        long r02 = zzloVar.r0();
        zzb();
        zzlo zzloVar2 = this.f11514a.f11783l;
        zzge.d(zzloVar2);
        zzloVar2.K(zzcfVar, r02);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        zzgb zzgbVar = this.f11514a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new r0(1, this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        K(zzijVar.F(), zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        zzgb zzgbVar = this.f11514a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new k2(this, zzcfVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        String str;
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        zziy zziyVar = ((zzge) zzijVar.f3529a).f11786o;
        zzge.e(zziyVar);
        zziq zziqVar = zziyVar.c;
        if (zziqVar != null) {
            str = zziqVar.f11843b;
        } else {
            str = null;
        }
        K(str, zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        String str;
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        zziy zziyVar = ((zzge) zzijVar.f3529a).f11786o;
        zzge.e(zziyVar);
        zziq zziqVar = zziyVar.c;
        if (zziqVar != null) {
            str = zziqVar.f11842a;
        } else {
            str = null;
        }
        K(str, zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        Object obj = zzijVar.f3529a;
        String str = ((zzge) obj).f11774b;
        if (str == null) {
            try {
                str = zzip.b(((zzge) obj).f11773a, ((zzge) obj).f11790s);
            } catch (IllegalStateException e10) {
                zzeu zzeuVar = ((zzge) obj).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11712f.b(e10, "getGoogleAppId failed with exception");
                str = null;
            }
        }
        K(str, zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        Preconditions.f(str);
        ((zzge) zzijVar.f3529a).getClass();
        zzb();
        zzlo zzloVar = this.f11514a.f11783l;
        zzge.d(zzloVar);
        zzloVar.J(zzcfVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getSessionId(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        zzgb zzgbVar = ((zzge) zzijVar.f3529a).f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new e0(4, zzijVar, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i10) {
        zzb();
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return;
                        }
                        zzlo zzloVar = this.f11514a.f11783l;
                        zzge.d(zzloVar);
                        zzij zzijVar = this.f11514a.f11787p;
                        zzge.e(zzijVar);
                        AtomicReference atomicReference = new AtomicReference();
                        zzgb zzgbVar = ((zzge) zzijVar.f3529a).f11781j;
                        zzge.f(zzgbVar);
                        zzloVar.F(zzcfVar, ((Boolean) zzgbVar.r(atomicReference, 15000L, "boolean test flag value", new t0(zzijVar, atomicReference, 0))).booleanValue());
                        return;
                    }
                    zzlo zzloVar2 = this.f11514a.f11783l;
                    zzge.d(zzloVar2);
                    zzij zzijVar2 = this.f11514a.f11787p;
                    zzge.e(zzijVar2);
                    AtomicReference atomicReference2 = new AtomicReference();
                    zzgb zzgbVar2 = ((zzge) zzijVar2.f3529a).f11781j;
                    zzge.f(zzgbVar2);
                    zzloVar2.J(zzcfVar, ((Integer) zzgbVar2.r(atomicReference2, 15000L, "int test flag value", new t0(zzijVar2, atomicReference2, 1))).intValue());
                    return;
                }
                zzlo zzloVar3 = this.f11514a.f11783l;
                zzge.d(zzloVar3);
                zzij zzijVar3 = this.f11514a.f11787p;
                zzge.e(zzijVar3);
                AtomicReference atomicReference3 = new AtomicReference();
                zzgb zzgbVar3 = ((zzge) zzijVar3.f3529a).f11781j;
                zzge.f(zzgbVar3);
                double doubleValue = ((Double) zzgbVar3.r(atomicReference3, 15000L, "double test flag value", new p(1, zzijVar3, atomicReference3))).doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", doubleValue);
                try {
                    zzcfVar.zze(bundle);
                    return;
                } catch (RemoteException e10) {
                    zzeu zzeuVar = ((zzge) zzloVar3.f3529a).f11780i;
                    zzge.f(zzeuVar);
                    zzeuVar.f11715i.b(e10, "Error returning double value to wrapper");
                    return;
                }
            }
            zzlo zzloVar4 = this.f11514a.f11783l;
            zzge.d(zzloVar4);
            zzij zzijVar4 = this.f11514a.f11787p;
            zzge.e(zzijVar4);
            AtomicReference atomicReference4 = new AtomicReference();
            zzgb zzgbVar4 = ((zzge) zzijVar4.f3529a).f11781j;
            zzge.f(zzgbVar4);
            zzloVar4.K(zzcfVar, ((Long) zzgbVar4.r(atomicReference4, 15000L, "long test flag value", new n(1, zzijVar4, atomicReference4))).longValue());
            return;
        }
        zzlo zzloVar5 = this.f11514a.f11783l;
        zzge.d(zzloVar5);
        zzij zzijVar5 = this.f11514a.f11787p;
        zzge.e(zzijVar5);
        AtomicReference atomicReference5 = new AtomicReference();
        zzgb zzgbVar5 = ((zzge) zzijVar5.f3529a).f11781j;
        zzge.f(zzgbVar5);
        zzloVar5.L((String) zzgbVar5.r(atomicReference5, 15000L, "String test flag value", new i0(zzijVar5, atomicReference5, 2)), zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getUserProperties(String str, String str2, boolean z10, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        zzgb zzgbVar = this.f11514a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new t1(this, zzcfVar, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initForTests(Map map) {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcl zzclVar, long j10) {
        zzge zzgeVar = this.f11514a;
        if (zzgeVar == null) {
            Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
            Preconditions.j(context);
            this.f11514a = zzge.n(context, zzclVar, Long.valueOf(j10));
            return;
        }
        zzeu zzeuVar = zzgeVar.f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11715i.a("Attempting to initialize multiple times");
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzb();
        zzgb zzgbVar = this.f11514a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new p(2, this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        zzijVar.s(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j10) {
        Bundle bundle2;
        zzb();
        Preconditions.f(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        zzaw zzawVar = new zzaw(str2, new zzau(bundle), "app", j10);
        zzgb zzgbVar = this.f11514a.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new h1(this, zzcfVar, zzawVar, str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logHealthData(int i10, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Object L0;
        Object L02;
        zzb();
        Object obj = null;
        if (iObjectWrapper == null) {
            L0 = null;
        } else {
            L0 = ObjectWrapper.L0(iObjectWrapper);
        }
        if (iObjectWrapper2 == null) {
            L02 = null;
        } else {
            L02 = ObjectWrapper.L0(iObjectWrapper2);
        }
        if (iObjectWrapper3 != null) {
            obj = ObjectWrapper.L0(iObjectWrapper3);
        }
        zzeu zzeuVar = this.f11514a.f11780i;
        zzge.f(zzeuVar);
        zzeuVar.A(i10, true, false, str, L0, L02, obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j10) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        z0 z0Var = zzijVar.c;
        if (z0Var != null) {
            zzij zzijVar2 = this.f11514a.f11787p;
            zzge.e(zzijVar2);
            zzijVar2.r();
            z0Var.onActivityCreated((Activity) ObjectWrapper.L0(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j10) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        z0 z0Var = zzijVar.c;
        if (z0Var != null) {
            zzij zzijVar2 = this.f11514a.f11787p;
            zzge.e(zzijVar2);
            zzijVar2.r();
            z0Var.onActivityDestroyed((Activity) ObjectWrapper.L0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j10) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        z0 z0Var = zzijVar.c;
        if (z0Var != null) {
            zzij zzijVar2 = this.f11514a.f11787p;
            zzge.e(zzijVar2);
            zzijVar2.r();
            z0Var.onActivityPaused((Activity) ObjectWrapper.L0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j10) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        z0 z0Var = zzijVar.c;
        if (z0Var != null) {
            zzij zzijVar2 = this.f11514a.f11787p;
            zzge.e(zzijVar2);
            zzijVar2.r();
            z0Var.onActivityResumed((Activity) ObjectWrapper.L0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j10) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        z0 z0Var = zzijVar.c;
        Bundle bundle = new Bundle();
        if (z0Var != null) {
            zzij zzijVar2 = this.f11514a.f11787p;
            zzge.e(zzijVar2);
            zzijVar2.r();
            z0Var.onActivitySaveInstanceState((Activity) ObjectWrapper.L0(iObjectWrapper), bundle);
        }
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e10) {
            zzeu zzeuVar = this.f11514a.f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11715i.b(e10, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j10) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        if (zzijVar.c != null) {
            zzij zzijVar2 = this.f11514a.f11787p;
            zzge.e(zzijVar2);
            zzijVar2.r();
            Activity activity = (Activity) ObjectWrapper.L0(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j10) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        if (zzijVar.c != null) {
            zzij zzijVar2 = this.f11514a.f11787p;
            zzge.e(zzijVar2);
            zzijVar2.r();
            Activity activity = (Activity) ObjectWrapper.L0(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j10) {
        zzb();
        zzcfVar.zze(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) {
        Object obj;
        zzb();
        synchronized (this.f11515b) {
            obj = (zzhf) this.f11515b.getOrDefault(Integer.valueOf(zzciVar.zzd()), null);
            if (obj == null) {
                obj = new l2(this, zzciVar);
                this.f11515b.put(Integer.valueOf(zzciVar.zzd()), obj);
            }
        }
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        zzijVar.n();
        if (!zzijVar.f11827e.add(obj)) {
            zzeu zzeuVar = ((zzge) zzijVar.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11715i.a("OnEventListener already registered");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void resetAnalyticsData(long j10) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        zzijVar.f11829g.set(null);
        zzgb zzgbVar = ((zzge) zzijVar.f3529a).f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new q0(zzijVar, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConditionalUserProperty(Bundle bundle, long j10) {
        zzb();
        if (bundle == null) {
            zzeu zzeuVar = this.f11514a.f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11712f.a("Conditional user property must not be null");
            return;
        }
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        zzijVar.x(bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsent(final Bundle bundle, final long j10) {
        zzb();
        final zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        zzgb zzgbVar = ((zzge) zzijVar.f3529a).f11781j;
        zzge.f(zzgbVar);
        zzgbVar.v(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhi
            @Override // java.lang.Runnable
            public final void run() {
                zzij zzijVar2 = zzij.this;
                if (TextUtils.isEmpty(((zzge) zzijVar2.f3529a).k().s())) {
                    zzijVar2.y(bundle, 0, j10);
                    return;
                }
                zzeu zzeuVar = ((zzge) zzijVar2.f3529a).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11717k.a("Using developer consent only; google app id found");
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsentThirdParty(Bundle bundle, long j10) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        zzijVar.y(bundle, -20, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a0, code lost:
        if (r0 <= 100) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cf, code lost:
        if (r0 <= 100) goto L36;
     */
    @Override // com.google.android.gms.internal.measurement.zzcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper r3, java.lang.String r4, java.lang.String r5, long r6) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDataCollectionEnabled(boolean z10) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        zzijVar.n();
        zzgb zzgbVar = ((zzge) zzijVar.f3529a).f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new x0(zzijVar, z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDefaultEventParameters(Bundle bundle) {
        final Bundle bundle2;
        zzb();
        final zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        zzgb zzgbVar = ((zzge) zzijVar.f3529a).f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhj
            @Override // java.lang.Runnable
            public final void run() {
                e eVar;
                int i10;
                zzeu zzeuVar;
                zzlo zzloVar;
                zzij zzijVar2 = zzij.this;
                Object obj = zzijVar2.f3529a;
                Bundle bundle3 = bundle2;
                if (bundle3 == null) {
                    v vVar = ((zzge) obj).f11779h;
                    zzge.d(vVar);
                    vVar.f360w.b(new Bundle());
                    return;
                }
                zzge zzgeVar = (zzge) obj;
                v vVar2 = zzgeVar.f11779h;
                zzge.d(vVar2);
                Bundle a10 = vVar2.f360w.a();
                Iterator<String> it = bundle3.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    eVar = zzijVar2.f11838p;
                    i10 = 100;
                    zzeuVar = zzgeVar.f11780i;
                    zzloVar = zzgeVar.f11783l;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    Object obj2 = bundle3.get(next);
                    if (obj2 != null && !(obj2 instanceof String) && !(obj2 instanceof Long) && !(obj2 instanceof Double)) {
                        zzge.d(zzloVar);
                        zzloVar.getClass();
                        if (zzlo.X(obj2)) {
                            zzge.d(zzloVar);
                            zzloVar.getClass();
                            zzlo.D(eVar, null, 27, null, null, 0);
                        }
                        zzge.f(zzeuVar);
                        zzeuVar.f11717k.c(next, "Invalid default event parameter type. Name, value", obj2);
                    } else if (zzlo.a0(next)) {
                        zzge.f(zzeuVar);
                        zzeuVar.f11717k.b(next, "Invalid default event parameter name. Name");
                    } else if (obj2 == null) {
                        a10.remove(next);
                    } else {
                        zzge.d(zzloVar);
                        if (zzloVar.S("param", next, 100, obj2)) {
                            zzge.d(zzloVar);
                            zzloVar.E(a10, next, obj2);
                        }
                    }
                }
                zzge.d(zzloVar);
                zzlo zzloVar2 = ((zzge) zzgeVar.f11778g.f3529a).f11783l;
                zzge.d(zzloVar2);
                if (!zzloVar2.Z(201500000)) {
                    i10 = 25;
                }
                if (a10.size() > i10) {
                    Iterator it2 = new TreeSet(a10.keySet()).iterator();
                    int i11 = 0;
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        i11++;
                        if (i11 > i10) {
                            a10.remove(str);
                        }
                    }
                    zzge.d(zzloVar);
                    zzloVar.getClass();
                    zzlo.D(eVar, null, 26, null, null, 0);
                    zzge.f(zzeuVar);
                    zzeuVar.f11717k.a("Too many default event parameters set. Discarding beyond event parameter limit");
                }
                v vVar3 = zzgeVar.f11779h;
                zzge.d(vVar3);
                vVar3.f360w.b(a10);
                zzjy o10 = zzgeVar.o();
                o10.m();
                o10.n();
                o10.y(new a0(o10, o10.v(false), a10));
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzci zzciVar) {
        boolean z10;
        zzb();
        a aVar = new a(this, zzciVar);
        zzgb zzgbVar = this.f11514a.f11781j;
        zzge.f(zzgbVar);
        if (zzgbVar.w()) {
            zzij zzijVar = this.f11514a.f11787p;
            zzge.e(zzijVar);
            zzijVar.m();
            zzijVar.n();
            zzhe zzheVar = zzijVar.f11826d;
            if (aVar != zzheVar) {
                if (zzheVar == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Preconditions.l("EventInterceptor already set.", z10);
            }
            zzijVar.f11826d = aVar;
            return;
        }
        zzgb zzgbVar2 = this.f11514a.f11781j;
        zzge.f(zzgbVar2);
        zzgbVar2.u(new h0(this, aVar, 2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzck zzckVar) {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMeasurementEnabled(boolean z10, long j10) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        Boolean valueOf = Boolean.valueOf(z10);
        zzijVar.n();
        zzgb zzgbVar = ((zzge) zzijVar.f3529a).f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new e0(5, zzijVar, valueOf));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMinimumSessionDuration(long j10) {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setSessionTimeoutDuration(long j10) {
        zzb();
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        zzgb zzgbVar = ((zzge) zzijVar.f3529a).f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new o0(zzijVar, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserId(final String str, long j10) {
        zzb();
        final zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        Object obj = zzijVar.f3529a;
        if (str != null && TextUtils.isEmpty(str)) {
            zzeu zzeuVar = ((zzge) obj).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11715i.a("User ID must be non-empty or null");
            return;
        }
        zzgb zzgbVar = ((zzge) obj).f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhk
            @Override // java.lang.Runnable
            public final void run() {
                boolean z10;
                zzij zzijVar2 = zzij.this;
                zzel k10 = ((zzge) zzijVar2.f3529a).k();
                String str2 = k10.f11702p;
                String str3 = str;
                if (str2 != null && !str2.equals(str3)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k10.f11702p = str3;
                if (z10) {
                    ((zzge) zzijVar2.f3529a).k().t();
                }
            }
        });
        zzijVar.B(null, "_id", str, true, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z10, long j10) {
        zzb();
        Object L0 = ObjectWrapper.L0(iObjectWrapper);
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        zzijVar.B(str, str2, L0, z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) {
        Object obj;
        zzb();
        synchronized (this.f11515b) {
            obj = (zzhf) this.f11515b.remove(Integer.valueOf(zzciVar.zzd()));
        }
        if (obj == null) {
            obj = new l2(this, zzciVar);
        }
        zzij zzijVar = this.f11514a.f11787p;
        zzge.e(zzijVar);
        zzijVar.n();
        if (!zzijVar.f11827e.remove(obj)) {
            zzeu zzeuVar = ((zzge) zzijVar.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11715i.a("OnEventListener had not been registered");
        }
    }

    public final void zzb() {
        if (this.f11514a != null) {
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }
}
