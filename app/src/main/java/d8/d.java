package d8;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
public final class d implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f16130a;

    /* renamed from: b  reason: collision with root package name */
    public final Continuation f16131b;
    public final o c;

    public d(Executor executor, Continuation continuation, o oVar) {
        this.f16130a = executor;
        this.f16131b = continuation;
        this.c = oVar;
    }

    @Override // d8.k
    public final void a(Task task) {
        this.f16130a.execute(new com.android.billingclient.api.n(4, this, task));
    }
}
