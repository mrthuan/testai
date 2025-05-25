package h9;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: SnackbarManager.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static a f18111b;

    /* renamed from: a  reason: collision with root package name */
    public final Object f18112a = new Object();

    /* compiled from: SnackbarManager.java */
    /* renamed from: h9.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0244a implements Handler.Callback {
        public C0244a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            b bVar = (b) message.obj;
            synchronized (aVar.f18112a) {
                if (bVar == null || bVar == null) {
                    bVar.getClass();
                    throw null;
                }
            }
            return true;
        }
    }

    /* compiled from: SnackbarManager.java */
    /* loaded from: classes2.dex */
    public static class b {
    }

    public a() {
        new Handler(Looper.getMainLooper(), new C0244a());
    }

    public static a a() {
        if (f18111b == null) {
            f18111b = new a();
        }
        return f18111b;
    }

    public final void b() {
        synchronized (this.f18112a) {
        }
    }
}
