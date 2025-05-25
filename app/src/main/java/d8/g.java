package d8;

import a8.r0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
public final class g implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f16136a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16137b = new Object();
    public final OnCompleteListener c;

    public g(Executor executor, OnCompleteListener onCompleteListener) {
        this.f16136a = executor;
        this.c = onCompleteListener;
    }

    @Override // d8.k
    public final void a(Task task) {
        synchronized (this.f16137b) {
            if (this.c == null) {
                return;
            }
            this.f16136a.execute(new r0(4, this, task));
        }
    }
}
