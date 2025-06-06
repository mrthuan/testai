package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import b7.e;
import n0.g;
import v4.o;
import v6.j;
import v6.s;
import v6.w;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f9924a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        w.b(getApplicationContext());
        j.a a10 = s.a();
        a10.b(string);
        a10.c(f7.a.b(i10));
        if (string2 != null) {
            a10.f30714b = Base64.decode(string2, 0);
        }
        e eVar = w.a().f30735d;
        j a11 = a10.a();
        g gVar = new g(6, this, jobParameters);
        eVar.getClass();
        eVar.f5355e.execute(new o(eVar, a11, i11, gVar, 1));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
