package com.android.billingclient.api;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import y4.c;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6271a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6272b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(int i10, Object obj, Object obj2) {
        this.f6271a = i10;
        this.c = obj;
        this.f6272b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.f6271a) {
            case 0:
                c cVar = (c) this.f6272b;
                cVar.getClass();
                f fVar = y.f6297k;
                cVar.D(w.a(24, 7, fVar));
                ((c.a) ((i) this.c)).a(fVar, new ArrayList());
                return;
            case 1:
                synchronized (((AtomicReference) this.f6272b)) {
                    Object obj = this.c;
                    ((AtomicReference) this.f6272b).set(Double.valueOf(((zzge) ((zzij) obj).f3529a).f11778g.o(((zzge) ((zzij) obj).f3529a).k().r(), zzeh.P)));
                    ((AtomicReference) this.f6272b).notify();
                }
                return;
            case 2:
                AppMeasurementDynamiteService appMeasurementDynamiteService = (AppMeasurementDynamiteService) this.c;
                zzlo zzloVar = appMeasurementDynamiteService.f11514a.f11783l;
                zzge.d(zzloVar);
                zzcf zzcfVar = (zzcf) this.f6272b;
                zzge zzgeVar = appMeasurementDynamiteService.f11514a;
                if (zzgeVar.A != null && zzgeVar.A.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzloVar.F(zzcfVar, z10);
                return;
            default:
                Object obj2 = this.c;
                try {
                    Task task = (Task) ((d8.e) obj2).f16133b.then((Task) this.f6272b);
                    if (task == null) {
                        ((d8.e) obj2).onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    d8.e eVar = (d8.e) obj2;
                    d8.m mVar = TaskExecutors.f11980b;
                    task.f(mVar, eVar);
                    task.d(mVar, eVar);
                    task.a(mVar, eVar);
                    return;
                } catch (RuntimeExecutionException e10) {
                    if (e10.getCause() instanceof Exception) {
                        ((d8.e) obj2).c.t((Exception) e10.getCause());
                        return;
                    } else {
                        ((d8.e) obj2).c.t(e10);
                        return;
                    }
                } catch (Exception e11) {
                    ((d8.e) obj2).c.t(e11);
                    return;
                }
        }
    }

    public /* synthetic */ p(c cVar, c.a aVar) {
        this.f6271a = 0;
        this.f6272b = cVar;
        this.c = aVar;
    }
}
