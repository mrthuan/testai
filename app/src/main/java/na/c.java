package na;

/* compiled from: LogFileManager.java */
/* loaded from: classes2.dex */
public final class c {
    public static final a c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ra.d f22373a;

    /* renamed from: b  reason: collision with root package name */
    public na.a f22374b;

    public c(ra.d dVar) {
        this.f22373a = dVar;
        this.f22374b = c;
    }

    public final void a(String str) {
        this.f22374b.a();
        this.f22374b = c;
        if (str == null) {
            return;
        }
        this.f22374b = new g(this.f22373a.c(str, "userlog"));
    }

    public c(ra.d dVar, String str) {
        this(dVar);
        a(str);
    }

    /* compiled from: LogFileManager.java */
    /* loaded from: classes2.dex */
    public static final class a implements na.a {
        @Override // na.a
        public final String b() {
            return null;
        }

        @Override // na.a
        public final byte[] c() {
            return null;
        }

        @Override // na.a
        public final void a() {
        }

        @Override // na.a
        public final void d() {
        }

        @Override // na.a
        public final void e(long j10, String str) {
        }
    }
}
