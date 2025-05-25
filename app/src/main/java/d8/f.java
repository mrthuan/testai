package d8;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import k7.r;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
public final class f implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f16134a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16135b = new Object();
    public final OnCanceledListener c;

    public f(Executor executor, OnCanceledListener onCanceledListener) {
        this.f16134a = executor;
        this.c = onCanceledListener;
    }

    @Override // d8.k
    public final void a(Task task) {
        if (task.m()) {
            synchronized (this.f16135b) {
                if (this.c == null) {
                    return;
                }
                this.f16134a.execute(new r(this, 2));
            }
        }
    }
}
