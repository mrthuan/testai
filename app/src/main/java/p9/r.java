package p9;

import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class r extends o {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f23819b = 1;
    public final /* synthetic */ TaskCompletionSource c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f23820d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f23821e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, o9.m mVar, String str) {
        super(taskCompletionSource);
        this.f23821e = mVar;
        this.f23820d = str;
        this.c = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [p9.h, android.os.IInterface] */
    @Override // p9.o
    public final void a() {
        switch (this.f23819b) {
            case 0:
                synchronized (((x) this.f23821e).f23831f) {
                    final x xVar = (x) this.f23821e;
                    final TaskCompletionSource taskCompletionSource = this.c;
                    xVar.f23830e.add(taskCompletionSource);
                    taskCompletionSource.f11978a.b(new OnCompleteListener() { // from class: p9.p
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) {
                            x xVar2 = x.this;
                            TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                            synchronized (xVar2.f23831f) {
                                xVar2.f23830e.remove(taskCompletionSource2);
                            }
                        }
                    });
                    if (((x) this.f23821e).f23836k.getAndIncrement() > 0) {
                        ((x) this.f23821e).f23828b.c("Already connected to the service.", new Object[0]);
                    }
                    x.b((x) this.f23821e, (o) this.f23820d);
                }
                return;
            default:
                TaskCompletionSource taskCompletionSource2 = this.c;
                Object obj = this.f23821e;
                Object obj2 = this.f23820d;
                try {
                    o9.m mVar = (o9.m) obj;
                    ((o9.m) obj).f22776a.f23838m.C0(mVar.f22777b, o9.m.a(mVar, (String) obj2), new o9.l((o9.m) obj, taskCompletionSource2, (String) obj2));
                    return;
                } catch (RemoteException e10) {
                    o9.m.f22774e.b(e10, "requestUpdateInfo(%s)", (String) obj2);
                    taskCompletionSource2.c(new RuntimeException(e10));
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(x xVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, o oVar) {
        super(taskCompletionSource);
        this.f23821e = xVar;
        this.c = taskCompletionSource2;
        this.f23820d = oVar;
    }
}
