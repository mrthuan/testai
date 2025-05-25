package d8;

import com.android.billingclient.api.e0;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
public final class h implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f16138a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16139b = new Object();
    public final OnFailureListener c;

    public h(Executor executor, OnFailureListener onFailureListener) {
        this.f16138a = executor;
        this.c = onFailureListener;
    }

    @Override // d8.k
    public final void a(Task task) {
        if (!task.o() && !task.m()) {
            synchronized (this.f16139b) {
                if (this.c == null) {
                    return;
                }
                this.f16138a.execute(new e0(this, task, 5));
            }
        }
    }
}
