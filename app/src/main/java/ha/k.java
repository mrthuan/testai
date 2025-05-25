package ha;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements db.b {
    @Override // db.b
    public final Object get() {
        ga.m<ScheduledExecutorService> mVar = ExecutorsRegistrar.f13493a;
        return new g(Executors.newCachedThreadPool(new a("Firebase Blocking", 11, null)), ExecutorsRegistrar.f13495d.get());
    }
}
