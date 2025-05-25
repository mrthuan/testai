package ma;

import java.util.concurrent.Callable;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
public final class p implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f21925a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f21926b;
    public final /* synthetic */ com.google.firebase.crashlytics.internal.common.b c;

    public p(com.google.firebase.crashlytics.internal.common.b bVar, long j10, String str) {
        this.c = bVar;
        this.f21925a = j10;
        this.f21926b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        boolean z10;
        com.google.firebase.crashlytics.internal.common.b bVar = this.c;
        com.google.firebase.crashlytics.internal.common.c cVar = bVar.f13528m;
        if (cVar != null && cVar.f13536e.get()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            bVar.f13524i.f22374b.e(this.f21925a, this.f21926b);
            return null;
        }
        return null;
    }
}
