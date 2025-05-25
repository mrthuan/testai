package p9;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: n  reason: collision with root package name */
    public static final HashMap f23826n = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f23827a;

    /* renamed from: b  reason: collision with root package name */
    public final n f23828b;

    /* renamed from: g  reason: collision with root package name */
    public boolean f23832g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f23833h;

    /* renamed from: l  reason: collision with root package name */
    public w f23837l;

    /* renamed from: m  reason: collision with root package name */
    public IInterface f23838m;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f23829d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f23830e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f23831f = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final q f23835j = new IBinder.DeathRecipient() { // from class: p9.q
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            x xVar = x.this;
            xVar.f23828b.c("reportBinderDeath", new Object[0]);
            t tVar = (t) xVar.f23834i.get();
            if (tVar != null) {
                xVar.f23828b.c("calling onBinderDied", new Object[0]);
                tVar.zza();
            } else {
                xVar.f23828b.c("%s : Binder has died.", xVar.c);
                Iterator it = xVar.f23829d.iterator();
                while (it.hasNext()) {
                    RemoteException remoteException = new RemoteException(String.valueOf(xVar.c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = ((o) it.next()).f23815a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.c(remoteException);
                    }
                }
                xVar.f23829d.clear();
            }
            synchronized (xVar.f23831f) {
                xVar.c();
            }
        }
    };

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f23836k = new AtomicInteger(0);
    public final String c = "AppUpdateService";

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference f23834i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [p9.q] */
    public x(Context context, n nVar, Intent intent) {
        this.f23827a = context;
        this.f23828b = nVar;
        this.f23833h = intent;
    }

    public static void b(x xVar, o oVar) {
        IInterface iInterface = xVar.f23838m;
        ArrayList arrayList = xVar.f23829d;
        n nVar = xVar.f23828b;
        if (iInterface == null && !xVar.f23832g) {
            nVar.c("Initiate binding to the service.", new Object[0]);
            arrayList.add(oVar);
            w wVar = new w(xVar);
            xVar.f23837l = wVar;
            xVar.f23832g = true;
            if (!xVar.f23827a.bindService(xVar.f23833h, wVar, 1)) {
                nVar.c("Failed to bind to the service.", new Object[0]);
                xVar.f23832g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzy zzyVar = new zzy();
                    TaskCompletionSource taskCompletionSource = ((o) it.next()).f23815a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.c(zzyVar);
                    }
                }
                arrayList.clear();
            }
        } else if (xVar.f23832g) {
            nVar.c("Waiting to bind to the service.", new Object[0]);
            arrayList.add(oVar);
        } else {
            oVar.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f23826n;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.c)) {
                HandlerThread handlerThread = new HandlerThread(this.c, 10);
                handlerThread.start();
                hashMap.put(this.c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.c);
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.f23830e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
