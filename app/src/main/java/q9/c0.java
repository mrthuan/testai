package q9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class c0 extends z {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f29101b;
    public final /* synthetic */ z c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i0 f29102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(i0 i0Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, z zVar) {
        super(taskCompletionSource);
        this.f29101b = taskCompletionSource2;
        this.c = zVar;
        this.f29102d = i0Var;
    }

    @Override // q9.z
    public final void a() {
        synchronized (this.f29102d.f29119f) {
            i0 i0Var = this.f29102d;
            TaskCompletionSource taskCompletionSource = this.f29101b;
            i0Var.f29118e.add(taskCompletionSource);
            taskCompletionSource.f11978a.b(new b0(i0Var, taskCompletionSource, 0));
            if (this.f29102d.f29124k.getAndIncrement() > 0) {
                this.f29102d.f29116b.d("Already connected to the service.", new Object[0]);
            }
            i0.b(this.f29102d, this.c);
        }
    }
}
