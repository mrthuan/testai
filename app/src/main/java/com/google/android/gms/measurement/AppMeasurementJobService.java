package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.android.billingclient.api.i0;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzke;
import com.google.android.gms.measurement.internal.zzkf;
import com.google.android.gms.measurement.internal.zzlg;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
@TargetApi(24)
/* loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements zzke {

    /* renamed from: a  reason: collision with root package name */
    public zzkf f11511a;

    @Override // com.google.android.gms.measurement.internal.zzke
    @TargetApi(24)
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final zzkf c() {
        if (this.f11511a == null) {
            this.f11511a = new zzkf(this);
        }
        return this.f11511a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        zzeu zzeuVar = zzge.n(c().f11875a, null, null).f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11720n.a("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zzeu zzeuVar = zzge.n(c().f11875a, null, null).f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11720n.a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c().a(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        final zzkf c = c();
        final zzeu zzeuVar = zzge.n(c.f11875a, null, null).f11780i;
        zzge.f(zzeuVar);
        String string = jobParameters.getExtras().getString("action");
        zzeuVar.f11720n.b(string, "Local AppMeasurementJobService called. action");
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkb
                @Override // java.lang.Runnable
                public final void run() {
                    zzkf zzkfVar = zzkf.this;
                    zzkfVar.getClass();
                    zzeuVar.f11720n.a("AppMeasurementJobService processed last upload request.");
                    ((zzke) zzkfVar.f11875a).b(jobParameters);
                }
            };
            zzlg I = zzlg.I(c.f11875a);
            I.zzaB().u(new i0(I, runnable));
            return true;
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        c().b(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzke
    public final boolean zzc(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzke
    public final void a(Intent intent) {
    }
}
