package ma;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
public final class m implements SuccessContinuation<ta.c, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Executor f21919a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f21920b;

    public m(n nVar, Executor executor) {
        this.f21920b = nVar;
        this.f21919a = executor;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task<Void> j(ta.c cVar) {
        if (cVar == null) {
            return Tasks.e(null);
        }
        n nVar = this.f21920b;
        com.google.firebase.crashlytics.internal.common.b.b(nVar.f21922b.f21924b);
        o oVar = nVar.f21922b;
        oVar.f21924b.f13527l.e(null, this.f21919a);
        oVar.f21924b.f13531p.d(null);
        return Tasks.e(null);
    }
}
