package t7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class f extends IStatusCallback.Stub {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f29967a;

    public f(TaskCompletionSource taskCompletionSource) {
        this.f29967a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void u(Status status) {
        TaskUtil.a(status, Boolean.TRUE, this.f29967a);
    }
}
