package d8;

import com.android.billingclient.api.i0;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
public final class j<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, k {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f16142a;

    /* renamed from: b  reason: collision with root package name */
    public final SuccessContinuation f16143b;
    public final o c;

    public j(Executor executor, SuccessContinuation successContinuation, o oVar) {
        this.f16142a = executor;
        this.f16143b = successContinuation;
        this.c = oVar;
    }

    @Override // d8.k
    public final void a(Task task) {
        this.f16142a.execute(new i0(this, task, 4));
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
