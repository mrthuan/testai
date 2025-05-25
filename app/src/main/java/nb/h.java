package nb;

import d8.o;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: ConfigGetParameterHandler.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f22426e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f22427a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Executor f22428b;
    public final d c;

    /* renamed from: d  reason: collision with root package name */
    public final d f22429d;

    static {
        Charset.forName("UTF-8");
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public h(ScheduledExecutorService scheduledExecutorService, d dVar, d dVar2) {
        this.f22428b = scheduledExecutorService;
        this.c = dVar;
        this.f22429d = dVar2;
    }

    public static e b(d dVar) {
        synchronized (dVar) {
            o oVar = dVar.c;
            if (oVar != null && oVar.o()) {
                return (e) dVar.c.k();
            }
            try {
                return (e) d.a(dVar.b(), TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                return null;
            }
        }
    }

    public final void a(mb.g gVar) {
        synchronized (this.f22427a) {
            this.f22427a.add(gVar);
        }
    }
}
