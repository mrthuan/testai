package d8;

import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Object f16144a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public ArrayDeque f16145b;
    public boolean c;

    public final void a(k kVar) {
        synchronized (this.f16144a) {
            if (this.f16145b == null) {
                this.f16145b = new ArrayDeque();
            }
            this.f16145b.add(kVar);
        }
    }

    public final void b(Task task) {
        k kVar;
        synchronized (this.f16144a) {
            if (this.f16145b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.f16144a) {
                        kVar = (k) this.f16145b.poll();
                        if (kVar == null) {
                            this.c = false;
                            return;
                        }
                    }
                    kVar.a(task);
                }
            }
        }
    }
}
