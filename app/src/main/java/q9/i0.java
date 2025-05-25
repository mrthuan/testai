package q9;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.aa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: n  reason: collision with root package name */
    public static final HashMap f29114n = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f29115a;

    /* renamed from: b  reason: collision with root package name */
    public final y f29116b;
    public final String c;

    /* renamed from: g  reason: collision with root package name */
    public boolean f29120g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f29121h;

    /* renamed from: l  reason: collision with root package name */
    public h0 f29125l;

    /* renamed from: m  reason: collision with root package name */
    public IInterface f29126m;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f29117d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f29118e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f29119f = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final a0 f29123j = new IBinder.DeathRecipient() { // from class: q9.a0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            i0 i0Var = i0.this;
            i0Var.f29116b.d("reportBinderDeath", new Object[0]);
            e0 e0Var = (e0) i0Var.f29122i.get();
            if (e0Var != null) {
                i0Var.f29116b.d("calling onBinderDied", new Object[0]);
                e0Var.a();
            } else {
                i0Var.f29116b.d("%s : Binder has died.", i0Var.c);
                Iterator it = i0Var.f29117d.iterator();
                while (it.hasNext()) {
                    RemoteException remoteException = new RemoteException(String.valueOf(i0Var.c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = ((z) it.next()).f29139a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.c(remoteException);
                    }
                }
                i0Var.f29117d.clear();
            }
            synchronized (i0Var.f29119f) {
                i0Var.e();
            }
        }
    };

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f29124k = new AtomicInteger(0);

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference f29122i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [q9.a0] */
    public i0(Context context, y yVar, String str, Intent intent) {
        this.f29115a = context;
        this.f29116b = yVar;
        this.c = str;
        this.f29121h = intent;
    }

    public static void b(i0 i0Var, z zVar) {
        IInterface iInterface = i0Var.f29126m;
        ArrayList arrayList = i0Var.f29117d;
        y yVar = i0Var.f29116b;
        if (iInterface == null && !i0Var.f29120g) {
            yVar.d("Initiate binding to the service.", new Object[0]);
            arrayList.add(zVar);
            h0 h0Var = new h0(i0Var);
            i0Var.f29125l = h0Var;
            i0Var.f29120g = true;
            if (!i0Var.f29115a.bindService(i0Var.f29121h, h0Var, 1)) {
                yVar.d("Failed to bind to the service.", new Object[0]);
                i0Var.f29120g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    aa aaVar = new aa();
                    TaskCompletionSource taskCompletionSource = ((z) it.next()).f29139a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.c(aaVar);
                    }
                }
                arrayList.clear();
            }
        } else if (i0Var.f29120g) {
            yVar.d("Waiting to bind to the service.", new Object[0]);
            arrayList.add(zVar);
        } else {
            zVar.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f29114n;
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

    public final void c(z zVar, TaskCompletionSource taskCompletionSource) {
        a().post(new c0(this, zVar.f29139a, taskCompletionSource, zVar));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f29119f) {
            this.f29118e.remove(taskCompletionSource);
        }
        a().post(new d0(this));
    }

    public final void e() {
        HashSet hashSet = this.f29118e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
