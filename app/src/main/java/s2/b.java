package s2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.room.RoomDatabase;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o2.c;
import o2.h;
import p2.d;
import p2.j;
import s2.a;
import x2.g;
import x2.i;
import x2.p;
import x2.r;
import y2.f;

/* compiled from: SystemJobScheduler.java */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f29703e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29704a;

    /* renamed from: b  reason: collision with root package name */
    public final JobScheduler f29705b;
    public final j c;

    /* renamed from: d  reason: collision with root package name */
    public final a f29706d;

    static {
        h.e("SystemJobScheduler");
    }

    public b(Context context, j jVar) {
        a aVar = new a(context);
        this.f29704a = context;
        this.c = jVar;
        this.f29705b = (JobScheduler) context.getSystemService("jobscheduler");
        this.f29706d = aVar;
    }

    public static void b(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            h c = h.c();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10));
            c.b(th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList d(android.content.Context r5, android.app.job.JobScheduler r6, java.lang.String r7) {
        /*
            java.util.ArrayList r5 = f(r5, r6)
            r6 = 0
            if (r5 != 0) goto L8
            return r6
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r5.next()
            android.app.job.JobInfo r1 = (android.app.job.JobInfo) r1
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r3 = r1.getExtras()
            if (r3 == 0) goto L31
            boolean r4 = r3.containsKey(r2)     // Catch: java.lang.NullPointerException -> L31
            if (r4 == 0) goto L31
            java.lang.String r2 = r3.getString(r2)     // Catch: java.lang.NullPointerException -> L31
            goto L32
        L31:
            r2 = r6
        L32:
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L12
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L12
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.b.d(android.content.Context, android.app.job.JobScheduler, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            h.c().b(th2);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // p2.d
    public final boolean a() {
        return true;
    }

    @Override // p2.d
    public final void c(String str) {
        Context context = this.f29704a;
        JobScheduler jobScheduler = this.f29705b;
        ArrayList d10 = d(context, jobScheduler, str);
        if (d10 != null && !d10.isEmpty()) {
            Iterator it = d10.iterator();
            while (it.hasNext()) {
                b(jobScheduler, ((Integer) it.next()).intValue());
            }
            ((i) this.c.c.m()).b(str);
        }
    }

    @Override // p2.d
    public final void e(p... pVarArr) {
        int i10;
        int i11;
        int i12;
        ArrayList d10;
        int a10;
        p[] pVarArr2 = pVarArr;
        j jVar = this.c;
        WorkDatabase workDatabase = jVar.c;
        f fVar = new f(workDatabase);
        int length = pVarArr2.length;
        int i13 = 0;
        int i14 = 0;
        while (i14 < length) {
            p pVar = pVarArr2[i14];
            workDatabase.c();
            try {
                p i15 = ((r) workDatabase.p()).i(pVar.f31558a);
                if (i15 == null) {
                    h.c().f(new Throwable[i13]);
                    workDatabase.j();
                } else if (i15.f31559b != WorkInfo$State.ENQUEUED) {
                    h.c().f(new Throwable[i13]);
                    workDatabase.j();
                } else {
                    g a11 = ((i) workDatabase.m()).a(pVar.f31558a);
                    if (a11 != null) {
                        i12 = a11.f31546b;
                    } else {
                        jVar.f23628b.getClass();
                        int i16 = jVar.f23628b.f4907g;
                        synchronized (f.class) {
                            try {
                                WorkDatabase workDatabase2 = fVar.f32000a;
                                workDatabase2.c();
                                try {
                                    Long a12 = ((x2.f) workDatabase2.l()).a("next_job_scheduler_id");
                                    if (a12 != null) {
                                        i10 = a12.intValue();
                                    } else {
                                        i10 = i13;
                                    }
                                    if (i10 == Integer.MAX_VALUE) {
                                        i11 = i13;
                                    } else {
                                        i11 = i10 + 1;
                                    }
                                    try {
                                        ((x2.f) workDatabase2.l()).b(new x2.d("next_job_scheduler_id", i11));
                                        workDatabase2.j();
                                        try {
                                            workDatabase2.g();
                                            if (i10 >= 0 && i10 <= i16) {
                                                i12 = i10;
                                            }
                                            ((x2.f) fVar.f32000a.l()).b(new x2.d("next_job_scheduler_id", 1));
                                            i12 = 0;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        workDatabase2.g();
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                        throw th;
                    }
                    if (a11 == null) {
                        try {
                            g gVar = new g(pVar.f31558a, i12);
                            i iVar = (i) jVar.c.m();
                            RoomDatabase roomDatabase = iVar.f31547a;
                            roomDatabase.b();
                            roomDatabase.c();
                            iVar.f31548b.e(gVar);
                            roomDatabase.j();
                            roomDatabase.g();
                        } catch (Throwable th6) {
                            th = th6;
                            workDatabase.g();
                            throw th;
                        }
                    }
                    g(pVar, i12);
                    if (Build.VERSION.SDK_INT == 23 && (d10 = d(this.f29704a, this.f29705b, pVar.f31558a)) != null) {
                        int indexOf = d10.indexOf(Integer.valueOf(i12));
                        if (indexOf >= 0) {
                            d10.remove(indexOf);
                        }
                        if (!d10.isEmpty()) {
                            i13 = 0;
                            a10 = ((Integer) d10.get(0)).intValue();
                        } else {
                            i13 = 0;
                            jVar.f23628b.getClass();
                            a10 = fVar.a(jVar.f23628b.f4907g);
                        }
                        g(pVar, a10);
                    } else {
                        i13 = 0;
                    }
                    workDatabase.j();
                }
                workDatabase.g();
                i14++;
                pVarArr2 = pVarArr;
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    public final void g(p pVar, int i10) {
        int i11;
        byte b10;
        int i12;
        byte b11;
        int i13;
        JobScheduler jobScheduler = this.f29705b;
        a aVar = this.f29706d;
        aVar.getClass();
        o2.b bVar = pVar.f31566j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f31558a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i10, aVar.f29701a).setRequiresCharging(bVar.f22670b).setRequiresDeviceIdle(bVar.c).setExtras(persistableBundle);
        NetworkType networkType = bVar.f22669a;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED) {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            int i15 = a.C0372a.f29702a[networkType.ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 4) {
                            if (i15 == 5 && i14 >= 26) {
                                i11 = 4;
                            }
                            h c = h.c();
                            String.format("API version too low. Cannot convert network type value %s", networkType);
                            int i16 = a.f29700b;
                            c.a(new Throwable[0]);
                        } else {
                            if (i14 >= 24) {
                                i11 = 3;
                            }
                            h c10 = h.c();
                            String.format("API version too low. Cannot convert network type value %s", networkType);
                            int i162 = a.f29700b;
                            c10.a(new Throwable[0]);
                        }
                    } else {
                        i11 = 2;
                    }
                }
                i11 = 1;
            } else {
                i11 = 0;
            }
            extras.setRequiredNetworkType(i11);
        }
        if (!bVar.c) {
            if (pVar.f31568l == BackoffPolicy.LINEAR) {
                i13 = 0;
            } else {
                i13 = 1;
            }
            extras.setBackoffCriteria(pVar.f31569m, i13);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        if (i14 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f31573q) {
            extras.setImportantWhileForeground(true);
        }
        if (i14 >= 24) {
            if (bVar.f22675h.f22679a.size() > 0) {
                b11 = 1;
            } else {
                b11 = 0;
            }
            if (b11 != 0) {
                Iterator it = bVar.f22675h.f22679a.iterator();
                while (it.hasNext()) {
                    c.a aVar2 = (c.a) it.next();
                    boolean z10 = aVar2.f22681b;
                    androidx.window.layout.a.g();
                    extras.addTriggerContentUri(com.google.android.gms.internal.ads.j.a(aVar2.f22680a, z10 ? 1 : 0));
                }
                extras.setTriggerContentUpdateDelay(bVar.f22673f);
                extras.setTriggerContentMaxDelay(bVar.f22674g);
            }
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(bVar.f22671d);
            extras.setRequiresStorageNotLow(bVar.f22672e);
        }
        if (pVar.f31567k > 0) {
            b10 = 1;
        } else {
            b10 = 0;
        }
        if (s0.a.a() && pVar.f31573q && b10 == 0) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        h c11 = h.c();
        String.format("Scheduling work ID %s Job ID %s", pVar.f31558a, Integer.valueOf(i10));
        c11.a(new Throwable[0]);
        try {
            if (jobScheduler.schedule(build) == 0) {
                h c12 = h.c();
                String.format("Unable to schedule work ID %s", pVar.f31558a);
                c12.f(new Throwable[0]);
                if (pVar.f31573q && pVar.f31574r == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f31573q = false;
                    String.format("Scheduling a non-expedited job (work ID %s)", pVar.f31558a);
                    h.c().a(new Throwable[0]);
                    g(pVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            ArrayList f10 = f(this.f29704a, jobScheduler);
            if (f10 != null) {
                i12 = f10.size();
            } else {
                i12 = 0;
            }
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(i12);
            j jVar = this.c;
            objArr[1] = Integer.valueOf(((r) jVar.c.p()).e().size());
            androidx.work.a aVar3 = jVar.f23628b;
            int i17 = Build.VERSION.SDK_INT;
            int i18 = aVar3.f4908h;
            if (i17 == 23) {
                i18 /= 2;
            }
            objArr[2] = Integer.valueOf(i18);
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr);
            h.c().b(new Throwable[0]);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th2) {
            h c13 = h.c();
            String.format("Unable to schedule %s", pVar);
            c13.b(th2);
        }
    }
}
