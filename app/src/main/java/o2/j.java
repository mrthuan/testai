package o2;

import android.annotation.SuppressLint;

/* compiled from: Operation.java */
/* loaded from: classes.dex */
public interface j {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a  reason: collision with root package name */
    public static final a.c f22687a = new a.c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b  reason: collision with root package name */
    public static final a.b f22688b = new a.b();

    /* compiled from: Operation.java */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* compiled from: Operation.java */
        /* renamed from: o2.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0302a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final Throwable f22689a;

            public C0302a(Throwable th2) {
                this.f22689a = th2;
            }

            public final String toString() {
                return String.format("FAILURE (%s)", this.f22689a.getMessage());
            }
        }

        /* compiled from: Operation.java */
        /* loaded from: classes.dex */
        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* compiled from: Operation.java */
        /* loaded from: classes.dex */
        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
