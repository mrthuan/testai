package y2;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import o2.j;

/* compiled from: EnqueueRunnable.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final p2.f f31998a;

    /* renamed from: b  reason: collision with root package name */
    public final p2.b f31999b = new p2.b();

    static {
        o2.h.e("EnqueueRunnable");
    }

    public e(p2.f fVar) {
        this.f31998a = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0331 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0182  */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(p2.f r23) {
        /*
            Method dump skipped, instructions count: 837
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.e.a(p2.f):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        p2.b bVar = this.f31999b;
        p2.f fVar = this.f31998a;
        try {
            fVar.getClass();
            p2.j jVar = fVar.f23614a;
            if (!p2.f.c(fVar, new HashSet())) {
                WorkDatabase workDatabase = jVar.c;
                workDatabase.c();
                boolean a10 = a(fVar);
                workDatabase.j();
                workDatabase.g();
                if (a10) {
                    g.a(jVar.f23627a, RescheduleReceiver.class, true);
                    p2.e.a(jVar.f23628b, jVar.c, jVar.f23630e);
                }
                bVar.a(o2.j.f22687a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", fVar));
        } catch (Throwable th2) {
            bVar.a(new j.a.C0302a(th2));
        }
    }
}
