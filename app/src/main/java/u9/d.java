package u9;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class d extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f30265a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f30265a = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f30265a.d(null);
    }
}
