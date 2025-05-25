package ma;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
public final class o implements SuccessContinuation<Boolean, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Task f21923a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.common.b f21924b;

    public o(com.google.firebase.crashlytics.internal.common.b bVar, d8.o oVar) {
        this.f21924b = bVar;
        this.f21923a = oVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task<Void> j(Boolean bool) {
        return this.f21924b.f13520e.b(new n(this, bool));
    }
}
