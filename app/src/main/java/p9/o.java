package p9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public abstract class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final TaskCompletionSource f23815a;

    public o() {
        this.f23815a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            TaskCompletionSource taskCompletionSource = this.f23815a;
            if (taskCompletionSource != null) {
                taskCompletionSource.c(e10);
            }
        }
    }

    public o(TaskCompletionSource taskCompletionSource) {
        this.f23815a = taskCompletionSource;
    }
}
