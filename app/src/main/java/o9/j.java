package o9;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import p9.s;
import p9.x;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public class j extends p9.i {

    /* renamed from: b  reason: collision with root package name */
    public final p9.n f22771b;
    public final TaskCompletionSource c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ m f22772d;

    public j(m mVar, p9.n nVar, TaskCompletionSource taskCompletionSource) {
        this.f22772d = mVar;
        this.f22771b = nVar;
        this.c = taskCompletionSource;
    }

    @Override // p9.j
    public void P(Bundle bundle) {
        x xVar = this.f22772d.f22776a;
        TaskCompletionSource taskCompletionSource = this.c;
        synchronized (xVar.f23831f) {
            xVar.f23830e.remove(taskCompletionSource);
        }
        xVar.a().post(new s(xVar));
        this.f22771b.c("onRequestInfo", new Object[0]);
    }

    @Override // p9.j
    public void zzb(Bundle bundle) {
        x xVar = this.f22772d.f22776a;
        TaskCompletionSource taskCompletionSource = this.c;
        synchronized (xVar.f23831f) {
            xVar.f23830e.remove(taskCompletionSource);
        }
        xVar.a().post(new s(xVar));
        this.f22771b.c("onCompleteUpdate", new Object[0]);
    }
}
