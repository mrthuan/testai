package o9;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.install.InstallException;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class k extends j {
    public k(m mVar, TaskCompletionSource taskCompletionSource) {
        super(mVar, new p9.n("OnCompleteUpdateCallback"), taskCompletionSource);
    }

    @Override // o9.j, p9.j
    public final void zzb(Bundle bundle) {
        super.zzb(bundle);
        int i10 = bundle.getInt("error.code", -2);
        TaskCompletionSource taskCompletionSource = this.c;
        if (i10 != 0) {
            taskCompletionSource.c(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            taskCompletionSource.d(null);
        }
    }
}
