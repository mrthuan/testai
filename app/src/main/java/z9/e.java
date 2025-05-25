package z9;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.tom_roush.fontbox.ttf.NamingTable;
import ga.i;
import ga.m;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import y.h;

/* compiled from: FirebaseApp.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f32306j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static final y.b f32307k = new y.b();

    /* renamed from: a  reason: collision with root package name */
    public final Context f32308a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32309b;
    public final f c;

    /* renamed from: d  reason: collision with root package name */
    public final i f32310d;

    /* renamed from: g  reason: collision with root package name */
    public final m<ib.a> f32313g;

    /* renamed from: h  reason: collision with root package name */
    public final db.b<com.google.firebase.heartbeatinfo.a> f32314h;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f32311e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f32312f = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArrayList f32315i = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp.java */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface a {
        @KeepForSdk
        void a(boolean z10);
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(14)
    /* loaded from: classes2.dex */
    public static class b implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static final AtomicReference<b> f32316a = new AtomicReference<>();

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void a(boolean z10) {
            synchronized (e.f32306j) {
                Iterator it = new ArrayList(e.f32307k.values()).iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (eVar.f32311e.get()) {
                        Iterator it2 = eVar.f32315i.iterator();
                        while (it2.hasNext()) {
                            ((a) it2.next()).a(z10);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(24)
    /* loaded from: classes2.dex */
    public static class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final AtomicReference<c> f32317b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        public final Context f32318a;

        public c(Context context) {
            this.f32318a = context;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f32306j) {
                Iterator it = ((h.e) e.f32307k.values()).iterator();
                while (it.hasNext()) {
                    ((e) it.next()).e();
                }
            }
            this.f32318a.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f A[LOOP:0: B:24:0x0099->B:26:0x009f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(final android.content.Context r9, z9.f r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.e.<init>(android.content.Context, z9.f, java.lang.String):void");
    }

    public static e c() {
        e eVar;
        synchronized (f32306j) {
            eVar = (e) f32307k.getOrDefault("[DEFAULT]", null);
            if (eVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return eVar;
    }

    public static e f(Context context, f fVar) {
        e eVar;
        boolean z10;
        AtomicReference<b> atomicReference = b.f32316a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<b> atomicReference2 = b.f32316a;
            if (atomicReference2.get() == null) {
                b bVar = new b();
                while (true) {
                    if (atomicReference2.compareAndSet(null, bVar)) {
                        z10 = true;
                        break;
                    } else if (atomicReference2.get() != null) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    BackgroundDetector.b(application);
                    BackgroundDetector.f10932e.a(bVar);
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f32306j) {
            y.b bVar2 = f32307k;
            Preconditions.l("FirebaseApp name [DEFAULT] already exists!", true ^ bVar2.containsKey("[DEFAULT]"));
            Preconditions.k(context, "Application context cannot be null.");
            eVar = new e(context, fVar, "[DEFAULT]");
            bVar2.put("[DEFAULT]", eVar);
        }
        eVar.e();
        return eVar;
    }

    public final void a() {
        Preconditions.l("FirebaseApp was deleted", !this.f32312f.get());
    }

    @KeepForSdk
    public final <T> T b(Class<T> cls) {
        a();
        return (T) this.f32310d.a(cls);
    }

    @KeepForSdk
    public final String d() {
        String encodeToString;
        StringBuilder sb2 = new StringBuilder();
        a();
        byte[] bytes = this.f32309b.getBytes(Charset.defaultCharset());
        String str = null;
        if (bytes == null) {
            encodeToString = null;
        } else {
            encodeToString = Base64.encodeToString(bytes, 11);
        }
        sb2.append(encodeToString);
        sb2.append("+");
        a();
        byte[] bytes2 = this.c.f32320b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str = Base64.encodeToString(bytes2, 11);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final void e() {
        HashMap hashMap;
        boolean z10 = true;
        if (!s0.m.a(this.f32308a)) {
            a();
            Context context = this.f32308a;
            AtomicReference<c> atomicReference = c.f32317b;
            if (atomicReference.get() == null) {
                c cVar = new c(context);
                while (true) {
                    if (!atomicReference.compareAndSet(null, cVar)) {
                        if (atomicReference.get() != null) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        a();
        i iVar = this.f32310d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f32309b);
        AtomicReference<Boolean> atomicReference2 = iVar.f17723e;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (!atomicReference2.compareAndSet(null, valueOf)) {
                if (atomicReference2.get() != null) {
                    z10 = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (z10) {
            synchronized (iVar) {
                hashMap = new HashMap(iVar.f17720a);
            }
            iVar.g(hashMap, equals);
        }
        this.f32314h.get().c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        eVar.a();
        return this.f32309b.equals(eVar.f32309b);
    }

    @KeepForSdk
    public final boolean g() {
        boolean z10;
        a();
        ib.a aVar = this.f32313g.get();
        synchronized (aVar) {
            z10 = aVar.c;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f32309b.hashCode();
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.f32309b, NamingTable.TAG);
        toStringHelper.a(this.c, "options");
        return toStringHelper.toString();
    }
}
