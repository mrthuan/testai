package b7;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import v6.s;

/* compiled from: JobInfoScheduler.java */
/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5343a;

    /* renamed from: b  reason: collision with root package name */
    public final c7.d f5344b;
    public final SchedulerConfig c;

    public a(Context context, c7.d dVar, SchedulerConfig schedulerConfig) {
        this.f5343a = context;
        this.f5344b = dVar;
        this.c = schedulerConfig;
    }

    @Override // b7.i
    public final void a(s sVar, int i10) {
        b(sVar, i10, false);
    }

    @Override // b7.i
    public final void b(s sVar, int i10, boolean z10) {
        boolean z11;
        Context context = this.f5343a;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(sVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(f7.a.a(sVar.d())).array());
        if (sVar.c() != null) {
            adler32.update(sVar.c());
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        z11 = true;
                    }
                }
            }
            z11 = false;
            if (z11) {
                z6.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", sVar);
                return;
            }
        }
        long C = this.f5344b.C(sVar);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        Priority d10 = sVar.d();
        SchedulerConfig schedulerConfig = this.c;
        builder.setMinimumLatency(schedulerConfig.b(d10, C, i10));
        Set<SchedulerConfig.Flag> b10 = schedulerConfig.c().get(d10).b();
        if (b10.contains(SchedulerConfig.Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (b10.contains(SchedulerConfig.Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (b10.contains(SchedulerConfig.Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", sVar.b());
        persistableBundle.putInt("priority", f7.a.a(sVar.d()));
        if (sVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(sVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {sVar, Integer.valueOf(value), Long.valueOf(schedulerConfig.b(sVar.d(), C, i10)), Long.valueOf(C), Integer.valueOf(i10)};
        if (Log.isLoggable(z6.a.b("JobInfoScheduler"), 3)) {
            String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
        }
        jobScheduler.schedule(builder.build());
    }
}
