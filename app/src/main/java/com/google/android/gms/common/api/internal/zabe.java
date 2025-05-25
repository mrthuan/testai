package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zabe extends GoogleApiClient implements zabz {

    /* renamed from: b  reason: collision with root package name */
    public final Lock f11073b;
    public final com.google.android.gms.common.internal.zak c;

    /* renamed from: e  reason: collision with root package name */
    public final int f11075e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f11076f;

    /* renamed from: g  reason: collision with root package name */
    public final Looper f11077g;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f11079i;

    /* renamed from: l  reason: collision with root package name */
    public final q f11082l;

    /* renamed from: m  reason: collision with root package name */
    public final GoogleApiAvailability f11083m;

    /* renamed from: n  reason: collision with root package name */
    public zabx f11084n;

    /* renamed from: o  reason: collision with root package name */
    public final Map f11085o;

    /* renamed from: q  reason: collision with root package name */
    public final ClientSettings f11087q;

    /* renamed from: r  reason: collision with root package name */
    public final Map f11088r;

    /* renamed from: s  reason: collision with root package name */
    public final Api.AbstractClientBuilder f11089s;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f11091u;

    /* renamed from: v  reason: collision with root package name */
    public Integer f11092v;

    /* renamed from: x  reason: collision with root package name */
    public final zadc f11094x;

    /* renamed from: d  reason: collision with root package name */
    public zaca f11074d = null;

    /* renamed from: h  reason: collision with root package name */
    public final LinkedList f11078h = new LinkedList();

    /* renamed from: j  reason: collision with root package name */
    public final long f11080j = 120000;

    /* renamed from: k  reason: collision with root package name */
    public final long f11081k = TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL;

    /* renamed from: p  reason: collision with root package name */
    public Set f11086p = new HashSet();

    /* renamed from: t  reason: collision with root package name */
    public final ListenerHolders f11090t = new ListenerHolders();

    /* renamed from: w  reason: collision with root package name */
    public HashSet f11093w = null;

    public zabe(Context context, ReentrantLock reentrantLock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, b8.a aVar, y.b bVar, ArrayList arrayList, ArrayList arrayList2, y.b bVar2, int i10, int i11, ArrayList arrayList3) {
        this.f11092v = null;
        k3.e eVar = new k3.e(this);
        this.f11076f = context;
        this.f11073b = reentrantLock;
        this.c = new com.google.android.gms.common.internal.zak(looper, eVar);
        this.f11077g = looper;
        this.f11082l = new q(this, looper);
        this.f11083m = googleApiAvailability;
        this.f11075e = i10;
        if (i10 >= 0) {
            this.f11092v = Integer.valueOf(i11);
        }
        this.f11088r = bVar;
        this.f11085o = bVar2;
        this.f11091u = arrayList3;
        this.f11094x = new zadc();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
            com.google.android.gms.common.internal.zak zakVar = this.c;
            zakVar.getClass();
            Preconditions.j(connectionCallbacks);
            synchronized (zakVar.f11275i) {
                if (zakVar.f11269b.contains(connectionCallbacks)) {
                    String.valueOf(connectionCallbacks);
                } else {
                    zakVar.f11269b.add(connectionCallbacks);
                }
            }
            if (zakVar.f11268a.isConnected()) {
                com.google.android.gms.internal.base.zau zauVar = zakVar.f11274h;
                zauVar.sendMessage(zauVar.obtainMessage(1, connectionCallbacks));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.c.a((GoogleApiClient.OnConnectionFailedListener) it2.next());
        }
        this.f11087q = clientSettings;
        this.f11089s = aVar;
    }

    public static int n(Collection collection, boolean z10) {
        Iterator it = collection.iterator();
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            Api.Client client = (Api.Client) it.next();
            z11 |= client.requiresSignIn();
            z12 |= client.providesSignIn();
        }
        if (z11) {
            if (z12 && z10) {
                return 2;
            }
            return 1;
        }
        return 3;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void a(Bundle bundle) {
        while (!this.f11078h.isEmpty()) {
            g((BaseImplementation.ApiMethodImpl) this.f11078h.remove());
        }
        com.google.android.gms.common.internal.zak zakVar = this.c;
        Preconditions.d(zakVar.f11274h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (zakVar.f11275i) {
            Preconditions.m(!zakVar.f11273g);
            zakVar.f11274h.removeMessages(1);
            zakVar.f11273g = true;
            Preconditions.m(zakVar.c.isEmpty());
            ArrayList arrayList = new ArrayList(zakVar.f11269b);
            int i10 = zakVar.f11272f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                if (!zakVar.f11271e || !zakVar.f11268a.isConnected() || zakVar.f11272f.get() != i10) {
                    break;
                } else if (!zakVar.c.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(bundle);
                }
            }
            zakVar.c.clear();
            zakVar.f11273g = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r2 == 2) goto L19;
     */
    @Override // com.google.android.gms.common.api.GoogleApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r7 = this;
            java.lang.String r0 = "Illegal sign-in mode: "
            java.util.concurrent.locks.Lock r1 = r7.f11073b
            r1.lock()
            int r2 = r7.f11075e     // Catch: java.lang.Throwable -> L78
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 < 0) goto L1b
            java.lang.Integer r2 = r7.f11092v     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L14
            r2 = r5
            goto L15
        L14:
            r2 = r4
        L15:
            java.lang.String r6 = "Sign-in mode should have been set explicitly by auto-manage."
            com.google.android.gms.common.internal.Preconditions.l(r6, r2)     // Catch: java.lang.Throwable -> L78
            goto L38
        L1b:
            java.lang.Integer r2 = r7.f11092v     // Catch: java.lang.Throwable -> L78
            if (r2 != 0) goto L32
            java.util.Map r2 = r7.f11085o     // Catch: java.lang.Throwable -> L78
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L78
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L78
            int r2 = n(r2, r4)     // Catch: java.lang.Throwable -> L78
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L78
            r7.f11092v = r2     // Catch: java.lang.Throwable -> L78
            goto L38
        L32:
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L78
            if (r2 == r3) goto L70
        L38:
            java.lang.Integer r2 = r7.f11092v     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.common.internal.Preconditions.j(r2)     // Catch: java.lang.Throwable -> L78
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L78
            r1.lock()     // Catch: java.lang.Throwable -> L78
            r6 = 3
            if (r2 == r6) goto L4c
            if (r2 == r5) goto L4c
            if (r2 != r3) goto L4f
            goto L4d
        L4c:
            r3 = r2
        L4d:
            r2 = r3
            r4 = r5
        L4f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L6b
            r3.append(r2)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.common.internal.Preconditions.a(r0, r4)     // Catch: java.lang.Throwable -> L6b
            r7.p(r2)     // Catch: java.lang.Throwable -> L6b
            r7.q()     // Catch: java.lang.Throwable -> L6b
            r1.unlock()     // Catch: java.lang.Throwable -> L78
            r1.unlock()
            return
        L6b:
            r0 = move-exception
            r1.unlock()     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L78
        L70:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = move-exception
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zabe.b():void");
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void c(int i10, boolean z10) {
        if (i10 == 1) {
            if (!z10 && !this.f11079i) {
                this.f11079i = true;
                if (this.f11084n == null) {
                    try {
                        GoogleApiAvailability googleApiAvailability = this.f11083m;
                        Context applicationContext = this.f11076f.getApplicationContext();
                        r rVar = new r(this);
                        googleApiAvailability.getClass();
                        this.f11084n = GoogleApiAvailability.g(applicationContext, rVar);
                    } catch (SecurityException unused) {
                    }
                }
                q qVar = this.f11082l;
                qVar.sendMessageDelayed(qVar.obtainMessage(1), this.f11080j);
                q qVar2 = this.f11082l;
                qVar2.sendMessageDelayed(qVar2.obtainMessage(2), this.f11081k);
            }
            i10 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f11094x.f11144a.toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(zadc.c);
        }
        com.google.android.gms.common.internal.zak zakVar = this.c;
        Preconditions.d(zakVar.f11274h, "onUnintentionalDisconnection must only be called on the Handler thread");
        zakVar.f11274h.removeMessages(1);
        synchronized (zakVar.f11275i) {
            zakVar.f11273g = true;
            ArrayList arrayList = new ArrayList(zakVar.f11269b);
            int i11 = zakVar.f11272f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                if (!zakVar.f11271e || zakVar.f11272f.get() != i11) {
                    break;
                } else if (zakVar.f11269b.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnectionSuspended(i10);
                }
            }
            zakVar.c.clear();
            zakVar.f11273g = false;
        }
        com.google.android.gms.common.internal.zak zakVar2 = this.c;
        zakVar2.f11271e = false;
        zakVar2.f11272f.incrementAndGet();
        if (i10 == 2) {
            q();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void d(ConnectionResult connectionResult) {
        boolean z10;
        GoogleApiAvailability googleApiAvailability = this.f11083m;
        Context context = this.f11076f;
        int i10 = connectionResult.f10876b;
        googleApiAvailability.getClass();
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f10886a;
        if (i10 == 18) {
            z10 = true;
        } else if (i10 == 1) {
            z10 = GooglePlayServicesUtilLight.b(context);
        } else {
            z10 = false;
        }
        if (!z10) {
            o();
        }
        if (!this.f11079i) {
            com.google.android.gms.common.internal.zak zakVar = this.c;
            Preconditions.d(zakVar.f11274h, "onConnectionFailure must only be called on the Handler thread");
            zakVar.f11274h.removeMessages(1);
            synchronized (zakVar.f11275i) {
                ArrayList arrayList = new ArrayList(zakVar.f11270d);
                int i11 = zakVar.f11272f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = (GoogleApiClient.OnConnectionFailedListener) it.next();
                    if (zakVar.f11271e && zakVar.f11272f.get() == i11) {
                        if (zakVar.f11270d.contains(onConnectionFailedListener)) {
                            onConnectionFailedListener.onConnectionFailed(connectionResult);
                        }
                    }
                }
            }
            com.google.android.gms.common.internal.zak zakVar2 = this.c;
            zakVar2.f11271e = false;
            zakVar2.f11272f.incrementAndGet();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void e() {
        Lock lock = this.f11073b;
        lock.lock();
        try {
            this.f11094x.a();
            zaca zacaVar = this.f11074d;
            if (zacaVar != null) {
                zacaVar.f();
            }
            Set<ListenerHolder> set = this.f11090t.f10960a;
            for (ListenerHolder listenerHolder : set) {
                listenerHolder.f10957b = null;
                listenerHolder.c = null;
            }
            set.clear();
            LinkedList<BaseImplementation.ApiMethodImpl> linkedList = this.f11078h;
            for (BaseImplementation.ApiMethodImpl apiMethodImpl : linkedList) {
                apiMethodImpl.zan(null);
                apiMethodImpl.cancel();
            }
            linkedList.clear();
            if (this.f11074d != null) {
                o();
                com.google.android.gms.common.internal.zak zakVar = this.c;
                zakVar.f11271e = false;
                zakVar.f11272f.incrementAndGet();
            }
        } finally {
            lock.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @ResultIgnorabilityUnspecified
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T f(T t4) {
        String str;
        Api<?> api = t4.getApi();
        boolean containsKey = this.f11085o.containsKey(t4.getClientKey());
        if (api != null) {
            str = api.c;
        } else {
            str = "the API";
        }
        Preconditions.a("GoogleApiClient is not configured to use " + str + " required for this call.", containsKey);
        Lock lock = this.f11073b;
        lock.lock();
        try {
            zaca zacaVar = this.f11074d;
            if (zacaVar == null) {
                this.f11078h.add(t4);
            } else {
                t4 = (T) zacaVar.b(t4);
            }
            return t4;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @ResultIgnorabilityUnspecified
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T g(T t4) {
        String str;
        Map map = this.f11085o;
        Api<?> api = t4.getApi();
        boolean containsKey = map.containsKey(t4.getClientKey());
        if (api != null) {
            str = api.c;
        } else {
            str = "the API";
        }
        Preconditions.a("GoogleApiClient is not configured to use " + str + " required for this call.", containsKey);
        this.f11073b.lock();
        try {
            zaca zacaVar = this.f11074d;
            if (zacaVar != null) {
                if (this.f11079i) {
                    this.f11078h.add(t4);
                    while (!this.f11078h.isEmpty()) {
                        BaseImplementation.ApiMethodImpl apiMethodImpl = (BaseImplementation.ApiMethodImpl) this.f11078h.remove();
                        zadc zadcVar = this.f11094x;
                        zadcVar.f11144a.add(apiMethodImpl);
                        apiMethodImpl.zan(zadcVar.f11145b);
                        apiMethodImpl.setFailedResult(Status.f10923g);
                    }
                } else {
                    t4 = (T) zacaVar.d(t4);
                }
                return t4;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            this.f11073b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Api.Client h(Api.ClientKey clientKey) {
        Api.Client client = (Api.Client) this.f11085o.get(clientKey);
        Preconditions.k(client, "Appropriate Api was not requested.");
        return client;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context i() {
        return this.f11076f;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper j() {
        return this.f11077g;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void k(zada zadaVar) {
        Lock lock = this.f11073b;
        lock.lock();
        try {
            if (this.f11093w == null) {
                this.f11093w = new HashSet();
            }
            this.f11093w.add(zadaVar);
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r4 == false) goto L17;
     */
    @Override // com.google.android.gms.common.api.GoogleApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(com.google.android.gms.common.api.internal.zada r4) {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.f11073b
            r0.lock()
            java.util.HashSet r1 = r3.f11093w     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = "GoogleApiClientImpl"
            if (r1 != 0) goto L16
            java.lang.String r4 = "Attempted to remove pending transform when no transforms are registered."
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L4d
            r1.<init>()     // Catch: java.lang.Throwable -> L4d
            android.util.Log.wtf(r2, r4, r1)     // Catch: java.lang.Throwable -> L4d
            goto L44
        L16:
            boolean r4 = r1.remove(r4)     // Catch: java.lang.Throwable -> L4d
            if (r4 != 0) goto L27
            java.lang.String r4 = "Failed to remove pending transform - this may lead to memory leaks!"
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L4d
            r1.<init>()     // Catch: java.lang.Throwable -> L4d
            android.util.Log.wtf(r2, r4, r1)     // Catch: java.lang.Throwable -> L4d
            goto L44
        L27:
            r0.lock()     // Catch: java.lang.Throwable -> L4d
            java.util.HashSet r4 = r3.f11093w     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L32
            r0.unlock()     // Catch: java.lang.Throwable -> L4d
            goto L3d
        L32:
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L48
            r4 = r4 ^ 1
            r0.unlock()     // Catch: java.lang.Throwable -> L4d
            if (r4 != 0) goto L44
        L3d:
            com.google.android.gms.common.api.internal.zaca r4 = r3.f11074d     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L44
            r4.e()     // Catch: java.lang.Throwable -> L4d
        L44:
            r0.unlock()
            return
        L48:
            r4 = move-exception
            r0.unlock()     // Catch: java.lang.Throwable -> L4d
            throw r4     // Catch: java.lang.Throwable -> L4d
        L4d:
            r4 = move-exception
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zabe.l(com.google.android.gms.common.api.internal.zada):void");
    }

    public final void m(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f11076f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f11079i);
        printWriter.append(" mWorkQueue.size()=").print(this.f11078h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f11094x.f11144a.size());
        zaca zacaVar = this.f11074d;
        if (zacaVar != null) {
            zacaVar.g(str, fileDescriptor, printWriter, strArr);
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean o() {
        if (!this.f11079i) {
            return false;
        }
        this.f11079i = false;
        this.f11082l.removeMessages(2);
        this.f11082l.removeMessages(1);
        zabx zabxVar = this.f11084n;
        if (zabxVar != null) {
            synchronized (zabxVar) {
                Context context = zabxVar.f11122a;
                if (context != null) {
                    context.unregisterReceiver(zabxVar);
                }
                zabxVar.f11122a = null;
            }
            this.f11084n = null;
        }
        return true;
    }

    public final void p(int i10) {
        String str;
        zabe zabeVar;
        Integer num = this.f11092v;
        if (num == null) {
            this.f11092v = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            int intValue = this.f11092v.intValue();
            String str2 = "UNKNOWN";
            if (intValue == 1) {
                str = "SIGN_IN_MODE_REQUIRED";
            } else if (intValue == 2) {
                str = "SIGN_IN_MODE_OPTIONAL";
            } else if (intValue != 3) {
                str = "UNKNOWN";
            } else {
                str = "SIGN_IN_MODE_NONE";
            }
            StringBuilder sb2 = new StringBuilder("Cannot use sign-in mode: ");
            if (i10 == 1) {
                str2 = "SIGN_IN_MODE_REQUIRED";
            } else if (i10 == 2) {
                str2 = "SIGN_IN_MODE_OPTIONAL";
            } else if (i10 == 3) {
                str2 = "SIGN_IN_MODE_NONE";
            }
            throw new IllegalStateException(androidx.activity.f.o(sb2, str2, ". Mode was already set to ", str));
        }
        if (this.f11074d != null) {
            return;
        }
        Map map = this.f11085o;
        boolean z10 = false;
        boolean z11 = false;
        for (Api.Client client : map.values()) {
            z10 |= client.requiresSignIn();
            z11 |= client.providesSignIn();
        }
        int intValue2 = this.f11092v.intValue();
        if (intValue2 != 1) {
            if (intValue2 != 2 || !z10) {
                zabeVar = this;
            } else {
                Context context = this.f11076f;
                Lock lock = this.f11073b;
                Looper looper = this.f11077g;
                GoogleApiAvailability googleApiAvailability = this.f11083m;
                ClientSettings clientSettings = this.f11087q;
                Api.AbstractClientBuilder abstractClientBuilder = this.f11089s;
                y.b bVar = new y.b();
                y.b bVar2 = new y.b();
                Api.Client client2 = null;
                for (Map.Entry entry : map.entrySet()) {
                    Api.Client client3 = (Api.Client) entry.getValue();
                    if (true == client3.providesSignIn()) {
                        client2 = client3;
                    }
                    if (client3.requiresSignIn()) {
                        bVar.put((Api.AnyClientKey) entry.getKey(), client3);
                    } else {
                        bVar2.put((Api.AnyClientKey) entry.getKey(), client3);
                    }
                }
                Preconditions.l("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !bVar.isEmpty());
                y.b bVar3 = new y.b();
                y.b bVar4 = new y.b();
                Map map2 = this.f11088r;
                for (Api api : map2.keySet()) {
                    Api.ClientKey clientKey = api.f10898b;
                    if (bVar.containsKey(clientKey)) {
                        bVar3.put(api, (Boolean) map2.get(api));
                    } else if (bVar2.containsKey(clientKey)) {
                        bVar4.put(api, (Boolean) map2.get(api));
                    } else {
                        throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                    }
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = this.f11091u;
                int size = arrayList3.size();
                int i11 = 0;
                while (i11 < size) {
                    ArrayList arrayList4 = arrayList3;
                    zat zatVar = (zat) arrayList3.get(i11);
                    int i12 = size;
                    if (bVar3.containsKey(zatVar.f11153a)) {
                        arrayList.add(zatVar);
                    } else if (bVar4.containsKey(zatVar.f11153a)) {
                        arrayList2.add(zatVar);
                    } else {
                        throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                    }
                    i11++;
                    arrayList3 = arrayList4;
                    size = i12;
                }
                this.f11074d = new a(context, this, lock, looper, googleApiAvailability, bVar, bVar2, clientSettings, abstractClientBuilder, client2, arrayList, arrayList2, bVar3, bVar4);
                return;
            }
        } else {
            zabeVar = this;
            if (z10) {
                if (z11) {
                    throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            } else {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
        }
        zabeVar.f11074d = new zabi(zabeVar.f11076f, this, zabeVar.f11073b, zabeVar.f11077g, zabeVar.f11083m, zabeVar.f11085o, zabeVar.f11087q, zabeVar.f11088r, zabeVar.f11089s, zabeVar.f11091u, this);
    }

    public final void q() {
        this.c.f11271e = true;
        zaca zacaVar = this.f11074d;
        Preconditions.j(zacaVar);
        zacaVar.a();
    }
}
