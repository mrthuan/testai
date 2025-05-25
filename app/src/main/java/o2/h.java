package o2;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static h f22685a;

    /* compiled from: Logger.java */
    /* loaded from: classes.dex */
    public static class a extends h {

        /* renamed from: b  reason: collision with root package name */
        public final int f22686b;

        public a(int i10) {
            this.f22686b = i10;
        }

        @Override // o2.h
        public final void a(Throwable... thArr) {
            if (this.f22686b <= 3 && thArr.length >= 1) {
                Throwable th2 = thArr[0];
            }
        }

        @Override // o2.h
        public final void b(Throwable... thArr) {
            if (this.f22686b <= 6 && thArr.length >= 1) {
                Throwable th2 = thArr[0];
            }
        }

        @Override // o2.h
        public final void d(Throwable... thArr) {
            if (this.f22686b <= 4 && thArr.length >= 1) {
                Throwable th2 = thArr[0];
            }
        }

        @Override // o2.h
        public final void f(Throwable... thArr) {
            if (this.f22686b <= 5 && thArr.length >= 1) {
                Throwable th2 = thArr[0];
            }
        }
    }

    public static synchronized h c() {
        h hVar;
        synchronized (h.class) {
            if (f22685a == null) {
                f22685a = new a(3);
            }
            hVar = f22685a;
        }
        return hVar;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(Throwable... thArr);

    public abstract void b(Throwable... thArr);

    public abstract void d(Throwable... thArr);

    public abstract void f(Throwable... thArr);
}
