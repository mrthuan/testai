package e3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: LottieTask.java */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f16441a;

    public q(r rVar) {
        this.f16441a = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f16441a.f16445d == null) {
            return;
        }
        p<T> pVar = this.f16441a.f16445d;
        V v10 = pVar.f16439a;
        if (v10 != 0) {
            r.a(this.f16441a, v10);
            return;
        }
        r rVar = this.f16441a;
        Throwable th2 = pVar.f16440b;
        synchronized (rVar) {
            ArrayList arrayList = new ArrayList(rVar.f16444b);
            if (arrayList.isEmpty()) {
                p3.c.f23668a.getClass();
                HashSet hashSet = p3.b.f23667a;
                if (!hashSet.contains("Lottie encountered an error but no failure listener was added:")) {
                    hashSet.add("Lottie encountered an error but no failure listener was added:");
                }
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((m) it.next()).onResult(th2);
            }
        }
    }
}
