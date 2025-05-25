package kotlinx.coroutines;

/* compiled from: EventLoop.kt */
/* loaded from: classes.dex */
public final class c extends o0 {

    /* renamed from: i  reason: collision with root package name */
    public final Thread f19990i;

    public c(Thread thread) {
        this.f19990i = thread;
    }

    @Override // kotlinx.coroutines.p0
    public final Thread a0() {
        return this.f19990i;
    }
}
