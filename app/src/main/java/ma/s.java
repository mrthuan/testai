package ma;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
public final class s implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f21932a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.common.b f21933b;

    public s(com.google.firebase.crashlytics.internal.common.b bVar, long j10) {
        this.f21933b = bVar;
        this.f21932a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f21932a);
        this.f21933b.f13526k.h(bundle);
        return null;
    }
}
