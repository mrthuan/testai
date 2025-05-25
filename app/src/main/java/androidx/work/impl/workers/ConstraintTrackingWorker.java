package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o2.h;
import p2.j;
import t2.c;
import t2.d;
import x2.p;
import x2.r;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f5003k = 0;

    /* renamed from: f  reason: collision with root package name */
    public final WorkerParameters f5004f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f5005g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f5006h;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<ListenableWorker.a> f5007i;

    /* renamed from: j  reason: collision with root package name */
    public ListenableWorker f5008j;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            String b10 = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (TextUtils.isEmpty(b10)) {
                h c = h.c();
                int i10 = ConstraintTrackingWorker.f5003k;
                c.b(new Throwable[0]);
                constraintTrackingWorker.f5007i.h(new ListenableWorker.a.C0025a());
                return;
            }
            ListenableWorker a10 = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), b10, constraintTrackingWorker.f5004f);
            constraintTrackingWorker.f5008j = a10;
            if (a10 == null) {
                h c10 = h.c();
                int i11 = ConstraintTrackingWorker.f5003k;
                c10.a(new Throwable[0]);
                constraintTrackingWorker.f5007i.h(new ListenableWorker.a.C0025a());
                return;
            }
            p i12 = ((r) j.e(constraintTrackingWorker.getApplicationContext()).c.p()).i(constraintTrackingWorker.getId().toString());
            if (i12 == null) {
                constraintTrackingWorker.f5007i.h(new ListenableWorker.a.C0025a());
                return;
            }
            d dVar = new d(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
            dVar.c(Collections.singletonList(i12));
            if (dVar.a(constraintTrackingWorker.getId().toString())) {
                h c11 = h.c();
                int i13 = ConstraintTrackingWorker.f5003k;
                String.format("Constraints met for delegate %s", b10);
                c11.a(new Throwable[0]);
                try {
                    y9.a<ListenableWorker.a> startWork = constraintTrackingWorker.f5008j.startWork();
                    startWork.addListener(new a3.a(constraintTrackingWorker, startWork), constraintTrackingWorker.getBackgroundExecutor());
                    return;
                } catch (Throwable th2) {
                    h c12 = h.c();
                    int i14 = ConstraintTrackingWorker.f5003k;
                    String.format("Delegated worker %s threw exception in startWork.", b10);
                    c12.a(th2);
                    synchronized (constraintTrackingWorker.f5005g) {
                        if (constraintTrackingWorker.f5006h) {
                            h.c().a(new Throwable[0]);
                            constraintTrackingWorker.f5007i.h(new ListenableWorker.a.b());
                        } else {
                            constraintTrackingWorker.f5007i.h(new ListenableWorker.a.C0025a());
                        }
                        return;
                    }
                }
            }
            h c13 = h.c();
            int i15 = ConstraintTrackingWorker.f5003k;
            String.format("Constraints not met for delegate %s. Requesting retry.", b10);
            c13.a(new Throwable[0]);
            constraintTrackingWorker.f5007i.h(new ListenableWorker.a.b());
        }
    }

    static {
        h.e("ConstraintTrkngWrkr");
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5004f = workerParameters;
        this.f5005g = new Object();
        this.f5006h = false;
        this.f5007i = new androidx.work.impl.utils.futures.a<>();
    }

    @Override // t2.c
    public final void d(ArrayList arrayList) {
        h c = h.c();
        String.format("Constraints changed for %s", arrayList);
        c.a(new Throwable[0]);
        synchronized (this.f5005g) {
            this.f5006h = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final z2.a getTaskExecutor() {
        return j.e(getApplicationContext()).f23629d;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f5008j;
        if (listenableWorker != null && listenableWorker.isRunInForeground()) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f5008j;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.f5008j.stop();
        }
    }

    @Override // androidx.work.ListenableWorker
    public final y9.a<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f5007i;
    }

    @Override // t2.c
    public final void f(List<String> list) {
    }
}
