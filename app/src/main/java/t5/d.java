package t5;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = com.facebook.d.f9693j;
        if (context != null) {
            return context.getCacheDir();
        }
        kotlin.jvm.internal.g.i("applicationContext");
        throw null;
    }
}
