package t7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.internal.zaa;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class c extends zaa {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f29964a;

    public c(TaskCompletionSource taskCompletionSource) {
        this.f29964a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void u0(Status status) {
        TaskUtil.a(status, null, this.f29964a);
    }
}
