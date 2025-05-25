package com.google.android.gms.measurement.internal;

import a8.a2;
import a8.c2;
import a8.f;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzkr extends c2 {

    /* renamed from: d  reason: collision with root package name */
    public final AlarmManager f11880d;

    /* renamed from: e  reason: collision with root package name */
    public a2 f11881e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f11882f;

    public zzkr(zzlg zzlgVar) {
        super(zzlgVar);
        this.f11880d = (AlarmManager) ((zzge) this.f3529a).f11773a.getSystemService("alarm");
    }

    @Override // a8.c2
    public final void p() {
        JobScheduler jobScheduler;
        AlarmManager alarmManager = this.f11880d;
        if (alarmManager != null) {
            alarmManager.cancel(s());
        }
        if (Build.VERSION.SDK_INT >= 24 && (jobScheduler = (JobScheduler) ((zzge) this.f3529a).f11773a.getSystemService("jobscheduler")) != null) {
            jobScheduler.cancel(r());
        }
    }

    public final void q() {
        JobScheduler jobScheduler;
        n();
        Object obj = this.f3529a;
        zzeu zzeuVar = ((zzge) obj).f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11720n.a("Unscheduling upload");
        AlarmManager alarmManager = this.f11880d;
        if (alarmManager != null) {
            alarmManager.cancel(s());
        }
        t().a();
        if (Build.VERSION.SDK_INT >= 24 && (jobScheduler = (JobScheduler) ((zzge) obj).f11773a.getSystemService("jobscheduler")) != null) {
            jobScheduler.cancel(r());
        }
    }

    public final int r() {
        if (this.f11882f == null) {
            this.f11882f = Integer.valueOf("measurement".concat(String.valueOf(((zzge) this.f3529a).f11773a.getPackageName())).hashCode());
        }
        return this.f11882f.intValue();
    }

    public final PendingIntent s() {
        Context context = ((zzge) this.f3529a).f11773a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzbs.zza);
    }

    public final f t() {
        if (this.f11881e == null) {
            this.f11881e = new a2(this, this.f117b.f11893l);
        }
        return this.f11881e;
    }
}
