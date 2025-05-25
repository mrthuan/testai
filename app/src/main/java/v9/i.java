package v9;

import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.internal.zzu;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class i extends g {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f30782b;
    public final /* synthetic */ o c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, TaskCompletionSource taskCompletionSource, u9.f fVar) {
        super(taskCompletionSource);
        this.c = oVar;
        this.f30782b = fVar;
    }

    @Override // v9.g
    public final void a() {
        o oVar = this.c;
        IInterface iInterface = oVar.f30799m;
        ArrayList arrayList = oVar.f30790d;
        g gVar = this.f30782b;
        f fVar = oVar.f30789b;
        if (iInterface == null && !oVar.f30793g) {
            fVar.a("Initiate binding to the service.", new Object[0]);
            arrayList.add(gVar);
            n nVar = new n(oVar);
            oVar.f30798l = nVar;
            oVar.f30793g = true;
            if (!oVar.f30788a.bindService(oVar.f30794h, nVar, 1)) {
                fVar.a("Failed to bind to the service.", new Object[0]);
                oVar.f30793g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzu zzuVar = new zzu();
                    TaskCompletionSource taskCompletionSource = ((g) it.next()).f30780a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.c(zzuVar);
                    }
                }
                arrayList.clear();
            }
        } else if (oVar.f30793g) {
            fVar.a("Waiting to bind to the service.", new Object[0]);
            arrayList.add(gVar);
        } else {
            gVar.run();
        }
    }
}
