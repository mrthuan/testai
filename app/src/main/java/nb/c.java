package nb;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f22407a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f22408b = true;
    public final /* synthetic */ e c;

    public /* synthetic */ c(d dVar, e eVar) {
        this.f22407a = dVar;
        this.c = eVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task j(Object obj) {
        d dVar = this.f22407a;
        boolean z10 = this.f22408b;
        e eVar = this.c;
        Void r4 = (Void) obj;
        if (z10) {
            synchronized (dVar) {
                dVar.c = Tasks.e(eVar);
            }
        } else {
            dVar.getClass();
        }
        return Tasks.e(eVar);
    }
}
