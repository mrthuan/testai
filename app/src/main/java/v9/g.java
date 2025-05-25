package v9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public abstract class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final TaskCompletionSource f30780a;

    public g() {
        this.f30780a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            TaskCompletionSource taskCompletionSource = this.f30780a;
            if (taskCompletionSource != null) {
                taskCompletionSource.c(e10);
            }
        }
    }

    public g(TaskCompletionSource taskCompletionSource) {
        this.f30780a = taskCompletionSource;
    }
}
