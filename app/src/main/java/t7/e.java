package t7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.zaa;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class e extends zaa {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f29966a;

    public e(TaskCompletionSource taskCompletionSource) {
        this.f29966a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void O(Status status, ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse == null) {
            TaskUtil.a(status, null, this.f29966a);
            if (status.d() && (moduleInstallResponse == null || !moduleInstallResponse.f11315b)) {
                return;
            }
            ListenerHolders.b(null, "InstallStatusListener");
            throw null;
        }
        throw null;
    }
}
