package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zzlg;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.play.core.assetpacks.s1;
import com.google.android.play.core.assetpacks.t1;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6257a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6258b;
    public final Object c;

    public /* synthetic */ i0(int i10, Object obj, Object obj2) {
        this.f6257a = i10;
        this.f6258b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f6257a) {
            case 0:
                Future future = (Future) this.f6258b;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.c;
                    future.cancel(true);
                    zzb.zzk("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                zzij zzijVar = (zzij) this.c;
                Bundle bundle = (Bundle) this.f6258b;
                zzijVar.m();
                zzijVar.n();
                Preconditions.j(bundle);
                String string = bundle.getString(NamingTable.TAG);
                String string2 = bundle.getString("origin");
                Preconditions.f(string);
                Preconditions.f(string2);
                Preconditions.j(bundle.get("value"));
                Object obj = zzijVar.f3529a;
                zzge zzgeVar = (zzge) obj;
                if (!zzgeVar.b()) {
                    zzeu zzeuVar = zzgeVar.f11780i;
                    zzge.f(zzeuVar);
                    zzeuVar.f11720n.a("Conditional property not set since app measurement is disabled");
                    return;
                }
                zzlj zzljVar = new zzlj(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                try {
                    zzlo zzloVar = ((zzge) obj).f11783l;
                    zzge.d(zzloVar);
                    bundle.getString("app_id");
                    zzaw v02 = zzloVar.v0(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true);
                    zzlo zzloVar2 = ((zzge) obj).f11783l;
                    zzge.d(zzloVar2);
                    bundle.getString("app_id");
                    zzaw v03 = zzloVar2.v0(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true);
                    zzlo zzloVar3 = ((zzge) obj).f11783l;
                    zzge.d(zzloVar3);
                    bundle.getString("app_id");
                    zzgeVar.o().r(new zzac(bundle.getString("app_id"), string2, zzljVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), v03, bundle.getLong("trigger_timeout"), v02, bundle.getLong("time_to_live"), zzloVar3.v0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 2:
                synchronized (((AtomicReference) this.f6258b)) {
                    AtomicReference atomicReference = (AtomicReference) this.f6258b;
                    Object obj2 = this.c;
                    zzag zzagVar = ((zzge) ((zzij) obj2).f3529a).f11778g;
                    String r4 = ((zzge) ((zzij) obj2).f3529a).k().r();
                    zzeg zzegVar = zzeh.M;
                    if (r4 == null) {
                        zzagVar.getClass();
                        str = (String) zzegVar.a(null);
                    } else {
                        str = (String) zzegVar.a(zzagVar.c.e(r4, zzegVar.f11635a));
                    }
                    atomicReference.set(str);
                    ((AtomicReference) this.f6258b).notify();
                }
                return;
            case 3:
                zzlg zzlgVar = (zzlg) this.f6258b;
                zzlgVar.a();
                Runnable runnable2 = (Runnable) this.c;
                zzlgVar.zzaB().m();
                if (zzlgVar.f11897p == null) {
                    zzlgVar.f11897p = new ArrayList();
                }
                zzlgVar.f11897p.add(runnable2);
                zzlgVar.o();
                return;
            case 4:
                Object obj3 = this.c;
                try {
                    Task j10 = ((d8.j) obj3).f16143b.j(((Task) this.f6258b).k());
                    if (j10 == null) {
                        ((d8.j) obj3).onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    d8.j jVar = (d8.j) obj3;
                    d8.m mVar = TaskExecutors.f11980b;
                    j10.f(mVar, jVar);
                    j10.d(mVar, jVar);
                    j10.a(mVar, jVar);
                    return;
                } catch (RuntimeExecutionException e10) {
                    if (e10.getCause() instanceof Exception) {
                        ((d8.j) obj3).onFailure((Exception) e10.getCause());
                        return;
                    } else {
                        ((d8.j) obj3).onFailure(e10);
                        return;
                    }
                } catch (CancellationException unused2) {
                    ((d8.j) obj3).c();
                    return;
                } catch (Exception e11) {
                    ((d8.j) obj3).onFailure(e11);
                    return;
                }
            case 5:
                ((com.google.android.play.core.assetpacks.a0) this.f6258b).e((Bundle) this.c);
                return;
            case 6:
                t1 t1Var = (t1) this.f6258b;
                s1 s1Var = (s1) this.c;
                t1Var.getClass();
                String str2 = s1Var.f13249b;
                t1Var.f13385a.a(s1Var.c, s1Var.f13381d, str2);
                return;
            default:
                ((kotlinx.coroutines.g) this.c).z((CoroutineDispatcher) this.f6258b, tf.d.f30009a);
                return;
        }
    }

    public i0(zzlg zzlgVar, Runnable runnable) {
        this.f6257a = 3;
        this.f6258b = zzlgVar;
        this.c = runnable;
    }

    public /* synthetic */ i0(Object obj, Object obj2, int i10) {
        this.f6257a = i10;
        this.c = obj;
        this.f6258b = obj2;
    }
}
