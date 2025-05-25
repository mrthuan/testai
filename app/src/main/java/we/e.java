package we;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import we.c;

/* compiled from: PlatformTaskQueue.java */
/* loaded from: classes.dex */
public final class e implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f31209a;

    public e() {
        Handler handler;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handler = Handler.createAsync(mainLooper);
        } else {
            handler = new Handler(mainLooper);
        }
        this.f31209a = handler;
    }

    @Override // we.c.b
    public final void a(b bVar) {
        this.f31209a.post(bVar);
    }
}
