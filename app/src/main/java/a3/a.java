package a3;

import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: ConstraintTrackingWorker.java */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y9.a f31a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f32b;

    public a(ConstraintTrackingWorker constraintTrackingWorker, y9.a aVar) {
        this.f32b = constraintTrackingWorker;
        this.f31a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f32b.f5005g) {
            if (this.f32b.f5006h) {
                ConstraintTrackingWorker constraintTrackingWorker = this.f32b;
                constraintTrackingWorker.getClass();
                constraintTrackingWorker.f5007i.h(new ListenableWorker.a.b());
            } else {
                this.f32b.f5007i.j(this.f31a);
            }
        }
    }
}
