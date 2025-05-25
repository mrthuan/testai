package m5;

import android.annotation.SuppressLint;

/* compiled from: Platform.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f21820a;

    static {
        b bVar;
        try {
            Class.forName("android.os.Build");
            bVar = new a();
        } catch (ClassNotFoundException unused) {
            bVar = new b();
        }
        f21820a = bVar;
    }

    @SuppressLint({"NewApi"})
    public String a() {
        return System.lineSeparator();
    }

    public void b() {
        System.out.println("XLog is already initialized, do not initialize again");
    }

    /* compiled from: Platform.java */
    /* loaded from: classes.dex */
    public static class a extends b {
        @Override // m5.b
        public final String a() {
            return System.lineSeparator();
        }

        @Override // m5.b
        public final void b() {
        }
    }
}
