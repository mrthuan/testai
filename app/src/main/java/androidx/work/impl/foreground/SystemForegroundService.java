package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.foreground.a;
import java.util.UUID;
import o2.h;
import p2.j;
import z2.b;

/* loaded from: classes.dex */
public class SystemForegroundService extends LifecycleService implements a.InterfaceC0029a {

    /* renamed from: b  reason: collision with root package name */
    public Handler f4964b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public a f4965d;

    /* renamed from: e  reason: collision with root package name */
    public NotificationManager f4966e;

    static {
        h.e("SystemFgService");
    }

    public final void a() {
        this.f4964b = new Handler(Looper.getMainLooper());
        this.f4966e = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f4965d = aVar;
        if (aVar.f4976j != null) {
            h.c().b(new Throwable[0]);
        } else {
            aVar.f4976j = this;
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.f4965d;
        aVar.f4976j = null;
        synchronized (aVar.f4970d) {
            aVar.f4975i.d();
        }
        aVar.f4969b.f23631f.f(aVar);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.c) {
            h.c().d(new Throwable[0]);
            a aVar = this.f4965d;
            aVar.f4976j = null;
            synchronized (aVar.f4970d) {
                aVar.f4975i.d();
            }
            aVar.f4969b.f23631f.f(aVar);
            a();
            this.c = false;
        }
        if (intent != null) {
            a aVar2 = this.f4965d;
            aVar2.getClass();
            String action = intent.getAction();
            boolean equals = "ACTION_START_FOREGROUND".equals(action);
            int i12 = a.f4967k;
            j jVar = aVar2.f4969b;
            if (equals) {
                h c = h.c();
                String.format("Started foreground service %s", intent);
                c.d(new Throwable[0]);
                ((b) aVar2.c).a(new w2.b(aVar2, jVar.c, intent.getStringExtra("KEY_WORKSPEC_ID")));
                aVar2.e(intent);
                return 3;
            } else if ("ACTION_NOTIFY".equals(action)) {
                aVar2.e(intent);
                return 3;
            } else if ("ACTION_CANCEL_WORK".equals(action)) {
                h c10 = h.c();
                String.format("Stopping foreground work for %s", intent);
                c10.d(new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    jVar.c(UUID.fromString(stringExtra));
                    return 3;
                }
                return 3;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                h.c().d(new Throwable[0]);
                a.InterfaceC0029a interfaceC0029a = aVar2.f4976j;
                if (interfaceC0029a != null) {
                    SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0029a;
                    systemForegroundService.c = true;
                    h.c().a(new Throwable[0]);
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf();
                    return 3;
                }
                return 3;
            } else {
                return 3;
            }
        }
        return 3;
    }
}
