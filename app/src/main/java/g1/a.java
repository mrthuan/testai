package g1;

import android.view.Choreographer;
import java.util.ArrayList;
import y.i;

/* compiled from: AnimationHandler.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final ThreadLocal<a> f17372f = new ThreadLocal<>();

    /* renamed from: d  reason: collision with root package name */
    public d f17375d;

    /* renamed from: a  reason: collision with root package name */
    public final i<b, Long> f17373a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f17374b = new ArrayList<>();
    public final C0227a c = new C0227a();

    /* renamed from: e  reason: collision with root package name */
    public boolean f17376e = false;

    /* compiled from: AnimationHandler.java */
    /* renamed from: g1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0227a {
        public C0227a() {
        }
    }

    /* compiled from: AnimationHandler.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(long j10);
    }

    /* compiled from: AnimationHandler.java */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final C0227a f17378a;

        public c(C0227a c0227a) {
            this.f17378a = c0227a;
        }
    }

    /* compiled from: AnimationHandler.java */
    /* loaded from: classes.dex */
    public static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final Choreographer f17379b;
        public final Choreographer$FrameCallbackC0228a c;

        /* compiled from: AnimationHandler.java */
        /* renamed from: g1.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class Choreographer$FrameCallbackC0228a implements Choreographer.FrameCallback {
            public Choreographer$FrameCallbackC0228a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0046 A[SYNTHETIC] */
            @Override // android.view.Choreographer.FrameCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void doFrame(long r10) {
                /*
                    r9 = this;
                    g1.a$d r10 = g1.a.d.this
                    g1.a$a r10 = r10.f17378a
                    r10.getClass()
                    long r0 = android.os.SystemClock.uptimeMillis()
                    g1.a r10 = g1.a.this
                    r10.getClass()
                    long r2 = android.os.SystemClock.uptimeMillis()
                    r11 = 0
                    r4 = r11
                L16:
                    java.util.ArrayList<g1.a$b> r5 = r10.f17374b
                    int r6 = r5.size()
                    if (r4 >= r6) goto L49
                    java.lang.Object r5 = r5.get(r4)
                    g1.a$b r5 = (g1.a.b) r5
                    if (r5 != 0) goto L27
                    goto L46
                L27:
                    y.i<g1.a$b, java.lang.Long> r6 = r10.f17373a
                    r7 = 0
                    java.lang.Object r7 = r6.getOrDefault(r5, r7)
                    java.lang.Long r7 = (java.lang.Long) r7
                    if (r7 != 0) goto L33
                    goto L3e
                L33:
                    long r7 = r7.longValue()
                    int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                    if (r7 >= 0) goto L40
                    r6.remove(r5)
                L3e:
                    r6 = 1
                    goto L41
                L40:
                    r6 = r11
                L41:
                    if (r6 == 0) goto L46
                    r5.a(r0)
                L46:
                    int r4 = r4 + 1
                    goto L16
                L49:
                    boolean r0 = r10.f17376e
                    if (r0 == 0) goto L61
                    int r0 = r5.size()
                L51:
                    int r0 = r0 + (-1)
                    if (r0 < 0) goto L5f
                    java.lang.Object r1 = r5.get(r0)
                    if (r1 != 0) goto L51
                    r5.remove(r0)
                    goto L51
                L5f:
                    r10.f17376e = r11
                L61:
                    int r11 = r5.size()
                    if (r11 <= 0) goto L7d
                    g1.a$d r11 = r10.f17375d
                    if (r11 != 0) goto L74
                    g1.a$d r11 = new g1.a$d
                    g1.a$a r0 = r10.c
                    r11.<init>(r0)
                    r10.f17375d = r11
                L74:
                    g1.a$d r10 = r10.f17375d
                    g1.a$d$a r11 = r10.c
                    android.view.Choreographer r10 = r10.f17379b
                    r10.postFrameCallback(r11)
                L7d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: g1.a.d.Choreographer$FrameCallbackC0228a.doFrame(long):void");
            }
        }

        public d(C0227a c0227a) {
            super(c0227a);
            this.f17379b = Choreographer.getInstance();
            this.c = new Choreographer$FrameCallbackC0228a();
        }
    }
}
