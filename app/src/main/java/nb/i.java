package nb;

import android.content.Context;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: ConfigRealtimeHandler.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f22430a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.c f22431b;
    public final eb.e c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f22432d;

    public i(z9.e eVar, eb.e eVar2, ConfigFetchHandler configFetchHandler, d dVar, Context context, com.google.firebase.remoteconfig.internal.b bVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f22430a = linkedHashSet;
        this.f22431b = new com.google.firebase.remoteconfig.internal.c(eVar, eVar2, configFetchHandler, dVar, context, linkedHashSet, bVar, scheduledExecutorService);
        this.c = eVar2;
        this.f22432d = context;
    }

    public final synchronized void a() {
        if (!this.f22430a.isEmpty()) {
            this.f22431b.e(0L);
        }
    }
}
