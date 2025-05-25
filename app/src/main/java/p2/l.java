package p2;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.utils.futures.a f23637a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f23638b;
    public final /* synthetic */ m c;

    public l(m mVar, androidx.work.impl.utils.futures.a aVar, String str) {
        this.c = mVar;
        this.f23637a = aVar;
        this.f23638b = str;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        String str = this.f23638b;
        m mVar = this.c;
        try {
            try {
                ListenableWorker.a aVar = (ListenableWorker.a) this.f23637a.get();
                if (aVar == null) {
                    o2.h c = o2.h.c();
                    int i10 = m.f23639t;
                    String.format("%s returned a null result. Treating it as a failure.", mVar.f23643e.c);
                    c.b(new Throwable[0]);
                } else {
                    o2.h c10 = o2.h.c();
                    int i11 = m.f23639t;
                    String.format("%s returned a %s result.", mVar.f23643e.c, aVar);
                    c10.a(new Throwable[0]);
                    mVar.f23646h = aVar;
                }
            } catch (InterruptedException e10) {
                e = e10;
                o2.h c11 = o2.h.c();
                int i12 = m.f23639t;
                String.format("%s failed because it threw an exception/error", str);
                c11.b(e);
            } catch (CancellationException e11) {
                o2.h c12 = o2.h.c();
                int i13 = m.f23639t;
                String.format("%s was cancelled", str);
                c12.d(e11);
            } catch (ExecutionException e12) {
                e = e12;
                o2.h c112 = o2.h.c();
                int i122 = m.f23639t;
                String.format("%s failed because it threw an exception/error", str);
                c112.b(e);
            }
        } finally {
            mVar.c();
        }
    }
}
