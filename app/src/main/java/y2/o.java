package y2;

import android.content.Context;
import androidx.work.WorkInfo$State;
import androidx.work.impl.utils.futures.AbstractFuture;
import java.util.UUID;

/* compiled from: WorkForegroundUpdater.java */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.utils.futures.a f32022a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UUID f32023b;
    public final /* synthetic */ o2.d c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Context f32024d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p f32025e;

    public o(p pVar, androidx.work.impl.utils.futures.a aVar, UUID uuid, o2.d dVar, Context context) {
        this.f32025e = pVar;
        this.f32022a = aVar;
        this.f32023b = uuid;
        this.c = dVar;
        this.f32024d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f32022a.f4984a instanceof AbstractFuture.b)) {
                String uuid = this.f32023b.toString();
                WorkInfo$State f10 = ((x2.r) this.f32025e.c).f(uuid);
                if (f10 != null && !f10.isFinished()) {
                    ((p2.c) this.f32025e.f32027b).g(uuid, this.c);
                    this.f32024d.startService(androidx.work.impl.foreground.a.a(this.f32024d, uuid, this.c));
                } else {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
            }
            this.f32022a.h(null);
        } catch (Throwable th2) {
            this.f32022a.i(th2);
        }
    }
}
