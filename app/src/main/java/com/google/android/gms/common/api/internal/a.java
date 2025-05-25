package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import y.h;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class a implements zaca {

    /* renamed from: a */
    public final Context f10967a;

    /* renamed from: b */
    public final zabe f10968b;
    public final zabi c;

    /* renamed from: d */
    public final zabi f10969d;

    /* renamed from: e */
    public final Map f10970e;

    /* renamed from: g */
    public final Api.Client f10972g;

    /* renamed from: h */
    public Bundle f10973h;

    /* renamed from: l */
    public final Lock f10977l;

    /* renamed from: f */
    public final Set f10971f = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i */
    public ConnectionResult f10974i = null;

    /* renamed from: j */
    public ConnectionResult f10975j = null;

    /* renamed from: k */
    public boolean f10976k = false;

    /* renamed from: m */
    public int f10978m = 0;

    public a(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailability googleApiAvailability, y.b bVar, y.b bVar2, ClientSettings clientSettings, Api.AbstractClientBuilder abstractClientBuilder, Api.Client client, ArrayList arrayList, ArrayList arrayList2, y.b bVar3, y.b bVar4) {
        this.f10967a = context;
        this.f10968b = zabeVar;
        this.f10977l = lock;
        this.f10972g = client;
        this.c = new zabi(context, zabeVar, lock, looper, googleApiAvailability, bVar2, null, bVar4, null, arrayList2, new f2.t(this));
        this.f10969d = new zabi(context, zabeVar, lock, looper, googleApiAvailability, bVar, clientSettings, bVar3, abstractClientBuilder, arrayList, new l.t(this));
        y.b bVar5 = new y.b();
        Iterator it = ((h.c) bVar2.keySet()).iterator();
        while (it.hasNext()) {
            bVar5.put((Api.AnyClientKey) it.next(), this.c);
        }
        Iterator it2 = ((h.c) bVar.keySet()).iterator();
        while (it2.hasNext()) {
            bVar5.put((Api.AnyClientKey) it2.next(), this.f10969d);
        }
        this.f10970e = Collections.unmodifiableMap(bVar5);
    }

    public static /* bridge */ /* synthetic */ void k(a aVar, int i10, boolean z10) {
        aVar.f10968b.c(i10, z10);
        aVar.f10975j = null;
        aVar.f10974i = null;
    }

    public static void l(a aVar) {
        boolean z10;
        ConnectionResult connectionResult;
        boolean z11;
        ConnectionResult connectionResult2 = aVar.f10974i;
        boolean z12 = true;
        if (connectionResult2 != null && connectionResult2.f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zabi zabiVar = aVar.c;
        if (z10) {
            ConnectionResult connectionResult3 = aVar.f10975j;
            if (connectionResult3 != null && connectionResult3.f()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && !aVar.j()) {
                ConnectionResult connectionResult4 = aVar.f10975j;
                if (connectionResult4 != null) {
                    if (aVar.f10978m == 1) {
                        aVar.i();
                        return;
                    }
                    aVar.h(connectionResult4);
                    zabiVar.f();
                    return;
                }
                return;
            }
            int i10 = aVar.f10978m;
            if (i10 != 1) {
                if (i10 != 2) {
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    aVar.f10978m = 0;
                    return;
                }
                zabe zabeVar = aVar.f10968b;
                Preconditions.j(zabeVar);
                zabeVar.a(aVar.f10973h);
            }
            aVar.i();
            aVar.f10978m = 0;
            return;
        }
        ConnectionResult connectionResult5 = aVar.f10974i;
        zabi zabiVar2 = aVar.f10969d;
        if (connectionResult5 != null) {
            ConnectionResult connectionResult6 = aVar.f10975j;
            if (connectionResult6 == null || !connectionResult6.f()) {
                z12 = false;
            }
            if (z12) {
                zabiVar2.f();
                ConnectionResult connectionResult7 = aVar.f10974i;
                Preconditions.j(connectionResult7);
                aVar.h(connectionResult7);
                return;
            }
        }
        ConnectionResult connectionResult8 = aVar.f10974i;
        if (connectionResult8 != null && (connectionResult = aVar.f10975j) != null) {
            if (zabiVar2.f11105l < zabiVar.f11105l) {
                connectionResult8 = connectionResult;
            }
            aVar.h(connectionResult8);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void a() {
        this.f10978m = 2;
        this.f10976k = false;
        this.f10975j = null;
        this.f10974i = null;
        this.c.a();
        this.f10969d.a();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl b(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        PendingIntent activity;
        zabi zabiVar = (zabi) this.f10970e.get(apiMethodImpl.getClientKey());
        Preconditions.k(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        if (zabiVar.equals(this.f10969d)) {
            if (j()) {
                Api.Client client = this.f10972g;
                if (client == null) {
                    activity = null;
                } else {
                    activity = PendingIntent.getActivity(this.f10967a, System.identityHashCode(this.f10968b), client.getSignInIntent(), com.google.android.gms.internal.base.zap.zaa | 134217728);
                }
                apiMethodImpl.setFailedResult(new Status(4, null, activity, null));
                return apiMethodImpl;
            }
            zabi zabiVar2 = this.f10969d;
            zabiVar2.getClass();
            apiMethodImpl.zak();
            zabiVar2.f11104k.f(apiMethodImpl);
            return apiMethodImpl;
        }
        zabi zabiVar3 = this.c;
        zabiVar3.getClass();
        apiMethodImpl.zak();
        zabiVar3.f11104k.f(apiMethodImpl);
        return apiMethodImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x001f, code lost:
        if (r3.f10978m == 1) goto L12;
     */
    @Override // com.google.android.gms.common.api.internal.zaca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.f10977l
            r0.lock()
            com.google.android.gms.common.api.internal.zabi r0 = r3.c     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.common.api.internal.zabf r0 = r0.f11104k     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0 instanceof com.google.android.gms.common.api.internal.zaaj     // Catch: java.lang.Throwable -> L28
            r1 = 0
            if (r0 == 0) goto L22
            com.google.android.gms.common.api.internal.zabi r0 = r3.f10969d     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.common.api.internal.zabf r0 = r0.f11104k     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0 instanceof com.google.android.gms.common.api.internal.zaaj     // Catch: java.lang.Throwable -> L28
            r2 = 1
            if (r0 != 0) goto L21
            boolean r0 = r3.j()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L21
            int r0 = r3.f10978m     // Catch: java.lang.Throwable -> L28
            if (r0 != r2) goto L22
        L21:
            r1 = r2
        L22:
            java.util.concurrent.locks.Lock r0 = r3.f10977l
            r0.unlock()
            return r1
        L28:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r3.f10977l
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.a.c():boolean");
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl d(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        PendingIntent activity;
        zabi zabiVar = (zabi) this.f10970e.get(apiMethodImpl.getClientKey());
        Preconditions.k(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        if (zabiVar.equals(this.f10969d)) {
            if (j()) {
                Api.Client client = this.f10972g;
                if (client == null) {
                    activity = null;
                } else {
                    activity = PendingIntent.getActivity(this.f10967a, System.identityHashCode(this.f10968b), client.getSignInIntent(), com.google.android.gms.internal.base.zap.zaa | 134217728);
                }
                apiMethodImpl.setFailedResult(new Status(4, null, activity, null));
                return apiMethodImpl;
            }
            zabi zabiVar2 = this.f10969d;
            zabiVar2.getClass();
            apiMethodImpl.zak();
            return zabiVar2.f11104k.h(apiMethodImpl);
        }
        zabi zabiVar3 = this.c;
        zabiVar3.getClass();
        apiMethodImpl.zak();
        return zabiVar3.f11104k.h(apiMethodImpl);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void e() {
        this.c.e();
        this.f10969d.e();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void f() {
        this.f10975j = null;
        this.f10974i = null;
        this.f10978m = 0;
        this.c.f();
        this.f10969d.f();
        i();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f10969d.g(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.c.g(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final void h(ConnectionResult connectionResult) {
        int i10 = this.f10978m;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f10978m = 0;
            }
            this.f10968b.d(connectionResult);
        }
        i();
        this.f10978m = 0;
    }

    public final void i() {
        Set<SignInConnectionListener> set = this.f10971f;
        for (SignInConnectionListener signInConnectionListener : set) {
            signInConnectionListener.a();
        }
        set.clear();
    }

    public final boolean j() {
        ConnectionResult connectionResult = this.f10975j;
        if (connectionResult != null && connectionResult.f10876b == 4) {
            return true;
        }
        return false;
    }
}
