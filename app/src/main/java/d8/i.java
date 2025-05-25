package d8;

import com.google.android.gms.common.api.internal.e0;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
public final class i implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f16140a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16141b = new Object();
    public final OnSuccessListener c;

    public i(Executor executor, OnSuccessListener onSuccessListener) {
        this.f16140a = executor;
        this.c = onSuccessListener;
    }

    @Override // d8.k
    public final void a(Task task) {
        if (task.o()) {
            synchronized (this.f16141b) {
                if (this.c == null) {
                    return;
                }
                this.f16140a.execute(new e0(6, this, task));
            }
        }
    }
}
