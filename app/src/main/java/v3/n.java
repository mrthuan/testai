package v3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: ResourceRecycler.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public boolean f30533a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f30534b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler.java */
    /* loaded from: classes.dex */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((l) message.obj).a();
                return true;
            }
            return false;
        }
    }

    public final synchronized void a(l<?> lVar, boolean z10) {
        if (!this.f30533a && !z10) {
            this.f30533a = true;
            lVar.a();
            this.f30533a = false;
        }
        this.f30534b.obtainMessage(1, lVar).sendToTarget();
    }
}
