package h5;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18033a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18034b;

    public /* synthetic */ k(Object obj, int i10) {
        this.f18033a = i10;
        this.f18034b = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i10 = this.f18033a;
        Object obj = this.f18034b;
        switch (i10) {
            case 0:
                ((m) obj).getClass();
                m.f();
                return;
            default:
                ((ScheduledFuture) obj).cancel(false);
                return;
        }
    }
}
