package ia;

import androidx.fragment.app.f;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import ma.j0;
import ma.u;
import ma.w;

/* compiled from: FirebaseCrashlytics.java */
/* loaded from: classes2.dex */
public final class e implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f18482a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f18483b;
    public final /* synthetic */ com.google.firebase.crashlytics.internal.settings.a c;

    public e(boolean z10, w wVar, com.google.firebase.crashlytics.internal.settings.a aVar) {
        this.f18482a = z10;
        this.f18483b = wVar;
        this.c = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        if (this.f18482a) {
            w wVar = this.f18483b;
            wVar.getClass();
            u uVar = new u(wVar, this.c);
            ExecutorService executorService = j0.f21911a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            ExecutorService executorService2 = wVar.f21950m;
            executorService2.execute(new f(3, uVar, executorService2, taskCompletionSource));
            return null;
        }
        return null;
    }
}
