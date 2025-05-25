package q9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public abstract class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final TaskCompletionSource f29139a;

    public z() {
        this.f29139a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            TaskCompletionSource taskCompletionSource = this.f29139a;
            if (taskCompletionSource != null) {
                taskCompletionSource.c(e10);
            }
        }
    }

    public z(TaskCompletionSource taskCompletionSource) {
        this.f29139a = taskCompletionSource;
    }
}
