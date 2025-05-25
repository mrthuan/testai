package n7;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f22340a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f22341b;

    public a(String str) {
        this.f22341b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f22340a.getAndIncrement();
        return new Thread(runnable, "AdWorker(" + this.f22341b + ") #" + andIncrement);
    }
}
