package d8;

import com.android.billingclient.api.p;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
public final class e<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, k {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f16132a;

    /* renamed from: b  reason: collision with root package name */
    public final Continuation f16133b;
    public final o c;

    public e(Executor executor, Continuation continuation, o oVar) {
        this.f16132a = executor;
        this.f16133b = continuation;
        this.c = oVar;
    }

    @Override // d8.k
    public final void a(Task task) {
        this.f16132a.execute(new p(3, this, task));
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void c() {
        this.c.v();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.c.t(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.c.u(tcontinuationresult);
    }
}
