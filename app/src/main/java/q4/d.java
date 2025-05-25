package q4;

/* compiled from: StateVerifier.java */
/* loaded from: classes.dex */
public abstract class d {

    /* compiled from: StateVerifier.java */
    /* loaded from: classes.dex */
    public static class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f29084a;

        public final void a() {
            if (!this.f29084a) {
                return;
            }
            throw new IllegalStateException("Already released");
        }
    }
}
