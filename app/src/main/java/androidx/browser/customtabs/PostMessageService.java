package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e.d;

/* loaded from: classes.dex */
public class PostMessageService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public final a f2718a = new a();

    /* loaded from: classes.dex */
    public class a extends d.a {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f2718a;
    }
}
