package ak;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f663a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f664b;

    public /* synthetic */ a(String str, boolean z10) {
        this.f663a = str;
        this.f664b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String name = this.f663a;
        g.e(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f664b);
        return thread;
    }
}
