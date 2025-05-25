package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap<ComponentName, f> f3504f = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public e f3505a;

    /* renamed from: b  reason: collision with root package name */
    public f f3506b;
    public a c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3507d = false;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<c> f3508e;

    /* loaded from: classes.dex */
    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            c cVar;
            while (true) {
                JobIntentService jobIntentService = JobIntentService.this;
                e eVar = jobIntentService.f3505a;
                if (eVar != null) {
                    cVar = eVar.a();
                } else {
                    synchronized (jobIntentService.f3508e) {
                        if (jobIntentService.f3508e.size() > 0) {
                            cVar = jobIntentService.f3508e.remove(0);
                        } else {
                            cVar = null;
                        }
                    }
                }
                if (cVar == null) {
                    return null;
                }
                JobIntentService jobIntentService2 = JobIntentService.this;
                cVar.getIntent();
                jobIntentService2.b();
                cVar.a();
            }
        }

        @Override // android.os.AsyncTask
        public final void onCancelled(Void r12) {
            JobIntentService.this.c();
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r12) {
            JobIntentService.this.c();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        public final Context f3510a;

        /* renamed from: b  reason: collision with root package name */
        public final PowerManager.WakeLock f3511b;
        public final PowerManager.WakeLock c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3512d;

        public b(Context context, ComponentName componentName) {
            super(componentName);
            this.f3510a = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f3511b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.c = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.f
        public final void a() {
            synchronized (this) {
                if (this.f3512d) {
                    this.f3512d = false;
                    this.c.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.f
        public final void b() {
            synchronized (this) {
                if (!this.f3512d) {
                    this.f3512d = true;
                    this.c.acquire(TTAdConstant.AD_MAX_EVENT_TIME);
                    this.f3511b.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.f
        public final void c() {
            synchronized (this) {
            }
        }
    }

    /* loaded from: classes.dex */
    public final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f3513a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3514b;

        public c(Intent intent, int i10) {
            this.f3513a = intent;
            this.f3514b = i10;
        }

        @Override // androidx.core.app.JobIntentService.d
        public final void a() {
            JobIntentService.this.stopSelf(this.f3514b);
        }

        @Override // androidx.core.app.JobIntentService.d
        public final Intent getIntent() {
            return this.f3513a;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        Intent getIntent();
    }

    /* loaded from: classes.dex */
    public static final class e extends JobServiceEngine {

        /* renamed from: a  reason: collision with root package name */
        public final JobIntentService f3515a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f3516b;
        public JobParameters c;

        /* loaded from: classes.dex */
        public final class a implements d {

            /* renamed from: a  reason: collision with root package name */
            public final JobWorkItem f3517a;

            public a(JobWorkItem jobWorkItem) {
                this.f3517a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.d
            public final void a() {
                synchronized (e.this.f3516b) {
                    JobParameters jobParameters = e.this.c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f3517a);
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.d
            public final Intent getIntent() {
                Intent intent;
                intent = this.f3517a.getIntent();
                return intent;
            }
        }

        public e(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f3516b = new Object();
            this.f3515a = jobIntentService;
        }

        public final a a() {
            JobWorkItem dequeueWork;
            Intent intent;
            synchronized (this.f3516b) {
                JobParameters jobParameters = this.c;
                if (jobParameters != null) {
                    dequeueWork = jobParameters.dequeueWork();
                    if (dequeueWork != null) {
                        intent = dequeueWork.getIntent();
                        intent.setExtrasClassLoader(this.f3515a.getClassLoader());
                        return new a(dequeueWork);
                    }
                    return null;
                }
                return null;
            }
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.c = jobParameters;
            this.f3515a.a(false);
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            a aVar = this.f3515a.c;
            if (aVar != null) {
                aVar.cancel(false);
            }
            synchronized (this.f3516b) {
                this.c = null;
            }
            return true;
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3508e = null;
        } else {
            this.f3508e = new ArrayList<>();
        }
    }

    public final void a(boolean z10) {
        if (this.c == null) {
            this.c = new a();
            f fVar = this.f3506b;
            if (fVar != null && z10) {
                fVar.b();
            }
            this.c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void b();

    public final void c() {
        ArrayList<c> arrayList = this.f3508e;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.c = null;
                ArrayList<c> arrayList2 = this.f3508e;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    a(false);
                } else if (!this.f3507d) {
                    this.f3506b.a();
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        IBinder binder;
        e eVar = this.f3505a;
        if (eVar != null) {
            binder = eVar.getBinder();
            return binder;
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f3505a = new e(this);
            this.f3506b = null;
            return;
        }
        this.f3505a = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap<ComponentName, f> hashMap = f3504f;
        f fVar = hashMap.get(componentName);
        if (fVar == null) {
            if (i10 < 26) {
                fVar = new b(this, componentName);
                hashMap.put(componentName, fVar);
            } else {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
        }
        this.f3506b = fVar;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ArrayList<c> arrayList = this.f3508e;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3507d = true;
                this.f3506b.a();
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        if (this.f3508e != null) {
            this.f3506b.c();
            synchronized (this.f3508e) {
                ArrayList<c> arrayList = this.f3508e;
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new c(intent, i11));
                a(true);
            }
            return 3;
        }
        return 2;
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public f(ComponentName componentName) {
        }

        public void a() {
        }

        public void b() {
        }

        public void c() {
        }
    }
}
