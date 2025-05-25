package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.SparseArray;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.android.billingclient.api.i0;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzke;
import com.google.android.gms.measurement.internal.zzkf;
import com.google.android.gms.measurement.internal.zzlg;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements zzke {

    /* renamed from: a  reason: collision with root package name */
    public zzkf f11512a;

    @Override // com.google.android.gms.measurement.internal.zzke
    public final void a(Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = WakefulBroadcastReceiver.f3969a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra != 0) {
            SparseArray<PowerManager.WakeLock> sparseArray2 = WakefulBroadcastReceiver.f3969a;
            synchronized (sparseArray2) {
                PowerManager.WakeLock wakeLock = sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzke
    public final void b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final zzkf c() {
        if (this.f11512a == null) {
            this.f11512a = new zzkf(this);
        }
        return this.f11512a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        zzkf c = c();
        if (intent == null) {
            c.c().f11712f.a("onBind called with null intent");
        } else {
            c.getClass();
            String action = intent.getAction();
            if ("com.google.android.gms.measurement.START".equals(action)) {
                return new zzgw(zzlg.I(c.f11875a));
            }
            c.c().f11715i.b(action, "onBind received unknown action");
        }
        return null;
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

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, final int i11) {
        final zzkf c = c();
        final zzeu zzeuVar = zzge.n(c.f11875a, null, null).f11780i;
        zzge.f(zzeuVar);
        if (intent == null) {
            zzeuVar.f11715i.a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzeuVar.f11720n.c(Integer.valueOf(i11), "Local AppMeasurementService called. startId, action", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkc
                @Override // java.lang.Runnable
                public final void run() {
                    zzkf zzkfVar = zzkf.this;
                    zzke zzkeVar = (zzke) zzkfVar.f11875a;
                    int i12 = i11;
                    if (zzkeVar.zzc(i12)) {
                        zzeuVar.f11720n.b(Integer.valueOf(i12), "Local AppMeasurementService processed last upload request. StartId");
                        zzkfVar.c().f11720n.a("Completed wakeful intent.");
                        zzkeVar.a(intent);
                    }
                }
            };
            zzlg I = zzlg.I(c.f11875a);
            I.zzaB().u(new i0(I, runnable));
            return 2;
        }
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        c().b(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzke
    public final boolean zzc(int i10) {
        return stopSelfResult(i10);
    }
}
