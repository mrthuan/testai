package wk;

import android.util.Log;
import java.io.PrintStream;
import java.util.logging.Level;

/* compiled from: Logger.java */
/* loaded from: classes3.dex */
public interface e {

    /* compiled from: Logger.java */
    /* loaded from: classes3.dex */
    public static class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public static final boolean f31331a;

        static {
            boolean z10;
            try {
                Class.forName("android.util.Log");
                z10 = true;
            } catch (ClassNotFoundException unused) {
                z10 = false;
            }
            f31331a = z10;
        }

        public static int c(Level level) {
            int intValue = level.intValue();
            if (intValue < 800) {
                if (intValue < 500) {
                    return 2;
                }
                return 3;
            } else if (intValue < 900) {
                return 4;
            } else {
                if (intValue < 1000) {
                    return 5;
                }
                return 6;
            }
        }

        @Override // wk.e
        public final void a(Level level, String str) {
            if (level != Level.OFF) {
                Log.println(c(level), "EventBus", str);
            }
        }

        @Override // wk.e
        public final void b(Level level, String str, Throwable th2) {
            if (level != Level.OFF) {
                int c = c(level);
                StringBuilder g10 = a0.d.g(str, "\n");
                g10.append(Log.getStackTraceString(th2));
                Log.println(c, "EventBus", g10.toString());
            }
        }
    }

    /* compiled from: Logger.java */
    /* loaded from: classes3.dex */
    public static class b implements e {
        @Override // wk.e
        public final void a(Level level, String str) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
        }

        @Override // wk.e
        public final void b(Level level, String str, Throwable th2) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
            th2.printStackTrace(System.out);
        }
    }

    void a(Level level, String str);

    void b(Level level, String str, Throwable th2);
}
