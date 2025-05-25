package q9;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29098a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f29099b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b0(Object obj, TaskCompletionSource taskCompletionSource, int i10) {
        this.f29098a = i10;
        this.c = obj;
        this.f29099b = taskCompletionSource;
    }

    private final void a() {
        v9.o oVar = (v9.o) this.c;
        TaskCompletionSource taskCompletionSource = this.f29099b;
        synchronized (oVar.f30792f) {
            oVar.f30791e.remove(taskCompletionSource);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f29098a) {
            case 0:
                i0 i0Var = (i0) this.c;
                TaskCompletionSource taskCompletionSource = this.f29099b;
                synchronized (i0Var.f29119f) {
                    i0Var.f29118e.remove(taskCompletionSource);
                }
                return;
            default:
                a();
                return;
        }
    }
}
