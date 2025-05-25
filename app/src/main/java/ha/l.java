package ha;

import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements db.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18138a;

    @Override // db.b
    public final Object get() {
        switch (this.f18138a) {
            case 0:
                ga.m<ScheduledExecutorService> mVar = ExecutorsRegistrar.f13493a;
                return Executors.newSingleThreadScheduledExecutor(new a("Firebase Scheduler", 0, null));
            default:
                DefaultClock defaultClock = mb.h.f21978j;
                return null;
        }
    }
}
