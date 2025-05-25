package wk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.greenrobot.eventbus.EventBusException;

/* compiled from: HandlerPoster.java */
/* loaded from: classes3.dex */
public final class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final a2.a f31328a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31329b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f31330d;

    public d(b bVar, Looper looper) {
        super(looper);
        this.c = bVar;
        this.f31329b = 10;
        this.f31328a = new a2.a(10);
    }

    public final void a(Object obj, m mVar) {
        h a10 = h.a(obj, mVar);
        synchronized (this) {
            this.f31328a.f(a10);
            if (!this.f31330d) {
                this.f31330d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                h j10 = this.f31328a.j();
                if (j10 == null) {
                    synchronized (this) {
                        j10 = this.f31328a.j();
                        if (j10 == null) {
                            return;
                        }
                    }
                }
                this.c.d(j10);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.f31329b);
            if (sendMessage(obtainMessage())) {
                this.f31330d = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } finally {
            this.f31330d = false;
        }
    }
}
