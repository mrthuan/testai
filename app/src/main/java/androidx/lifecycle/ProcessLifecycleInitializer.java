package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ProcessLifecycleInitializer.kt */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements c2.b<p> {
    @Override // c2.b
    public final List<Class<? extends c2.b<?>>> a() {
        return EmptyList.INSTANCE;
    }

    @Override // c2.b
    public final p create(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        c2.a c = c2.a.c(context);
        kotlin.jvm.internal.g.d(c, "getInstance(context)");
        if (c.f5510b.contains(ProcessLifecycleInitializer.class)) {
            if (!m.f4063a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                kotlin.jvm.internal.g.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new m.a());
            }
            z zVar = z.f4083i;
            zVar.getClass();
            zVar.f4087e = new Handler();
            zVar.f4088f.f(Lifecycle.Event.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            kotlin.jvm.internal.g.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new a0(zVar));
            return zVar;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
