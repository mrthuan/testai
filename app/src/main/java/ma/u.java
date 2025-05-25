package ma;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes2.dex */
public final class u implements Callable<Task<Void>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ta.f f21935a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f21936b;

    public u(w wVar, com.google.firebase.crashlytics.internal.settings.a aVar) {
        this.f21936b = wVar;
        this.f21935a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() {
        return w.a(this.f21936b, this.f21935a);
    }
}
