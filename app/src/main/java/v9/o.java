package v9;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: n  reason: collision with root package name */
    public static final HashMap f30787n = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f30788a;

    /* renamed from: b  reason: collision with root package name */
    public final f f30789b;

    /* renamed from: g  reason: collision with root package name */
    public boolean f30793g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f30794h;

    /* renamed from: l  reason: collision with root package name */
    public n f30798l;

    /* renamed from: m  reason: collision with root package name */
    public IInterface f30799m;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f30790d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f30791e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f30792f = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final h f30796j = new IBinder.DeathRecipient() { // from class: v9.h
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            o oVar = o.this;
            oVar.f30789b.a("reportBinderDeath", new Object[0]);
            k kVar = (k) oVar.f30795i.get();
            f fVar = oVar.f30789b;
            if (kVar != null) {
                fVar.a("calling onBinderDied", new Object[0]);
                kVar.zza();
            } else {
                String str = oVar.c;
                fVar.a("%s : Binder has died.", str);
                ArrayList arrayList = oVar.f30790d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    RemoteException remoteException = new RemoteException(String.valueOf(str).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = ((g) it.next()).f30780a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.c(remoteException);
                    }
                }
                arrayList.clear();
            }
            oVar.b();
        }
    };

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f30797k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference f30795i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [v9.h] */
    public o(Context context, f fVar, Intent intent) {
        this.f30788a = context;
        this.f30789b = fVar;
        this.f30794h = intent;
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f30787n;
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

    public final void b() {
        synchronized (this.f30792f) {
            Iterator it = this.f30791e.iterator();
            while (it.hasNext()) {
                ((TaskCompletionSource) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
            }
            this.f30791e.clear();
        }
    }
}
