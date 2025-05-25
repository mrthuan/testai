package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public final a f3526a = new a();

    /* loaded from: classes.dex */
    public class a extends l0.c {
        public a() {
        }
    }

    public abstract void a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f3526a;
    }
}
