package ma;

import java.util.concurrent.Callable;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
public final class r implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f21930a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.common.b f21931b;

    public r(com.google.firebase.crashlytics.internal.common.b bVar, String str) {
        this.f21931b = bVar;
        this.f21930a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        com.google.firebase.crashlytics.internal.common.b.a(this.f21931b, this.f21930a);
        return null;
    }
}
