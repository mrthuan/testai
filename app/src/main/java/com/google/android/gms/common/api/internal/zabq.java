package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zabq implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zau {

    /* renamed from: b  reason: collision with root package name */
    public final Api.Client f11111b;
    public final ApiKey c;

    /* renamed from: d  reason: collision with root package name */
    public final zaad f11112d;

    /* renamed from: g  reason: collision with root package name */
    public final int f11115g;

    /* renamed from: h  reason: collision with root package name */
    public final zact f11116h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11117i;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ GoogleApiManager f11121m;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList f11110a = new LinkedList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f11113e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f11114f = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f11118j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public ConnectionResult f11119k = null;

    /* renamed from: l  reason: collision with root package name */
    public int f11120l = 0;

    public zabq(GoogleApiManager googleApiManager, GoogleApi googleApi) {
        this.f11121m = googleApiManager;
        Api.Client zab = googleApi.zab(googleApiManager.f10952n.getLooper(), this);
        this.f11111b = zab;
        this.c = googleApi.getApiKey();
        this.f11112d = new zaad();
        this.f11115g = googleApi.zaa();
        if (zab.requiresSignIn()) {
            this.f11116h = googleApi.zac(googleApiManager.f10943e, googleApiManager.f10952n);
            return;
        }
        this.f11116h = null;
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void K(ConnectionResult connectionResult, Api api, boolean z10) {
        throw null;
    }

    public final Feature a(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.f11111b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            y.b bVar = new y.b(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                bVar.put(feature.f10880a, Long.valueOf(feature.d()));
            }
            for (Feature feature2 : featureArr) {
                Long l10 = (Long) bVar.getOrDefault(feature2.f10880a, null);
                if (l10 == null || l10.longValue() < feature2.d()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    public final void b(ConnectionResult connectionResult) {
        HashSet hashSet = this.f11113e;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            zal zalVar = (zal) it.next();
            if (Objects.a(connectionResult, ConnectionResult.f10874e)) {
                this.f11111b.getEndpointPackageName();
            }
            zalVar.getClass();
            throw null;
        }
        hashSet.clear();
    }

    public final void c(Status status) {
        Preconditions.c(this.f11121m.f10952n);
        d(status, null, false);
    }

    public final void d(Status status, RuntimeException runtimeException, boolean z10) {
        boolean z11;
        Preconditions.c(this.f11121m.f10952n);
        boolean z12 = false;
        if (status != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (runtimeException == null) {
            z12 = true;
        }
        if (z11 != z12) {
            Iterator it = this.f11110a.iterator();
            while (it.hasNext()) {
                zai zaiVar = (zai) it.next();
                if (!z10 || zaiVar.f11149a == 2) {
                    if (status != null) {
                        zaiVar.a(status);
                    } else {
                        zaiVar.b(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void e() {
        LinkedList linkedList = this.f11110a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            zai zaiVar = (zai) arrayList.get(i10);
            if (this.f11111b.isConnected()) {
                if (i(zaiVar)) {
                    linkedList.remove(zaiVar);
                }
            } else {
                return;
            }
        }
    }

    public final void f() {
        GoogleApiManager googleApiManager = this.f11121m;
        Preconditions.c(googleApiManager.f10952n);
        this.f11119k = null;
        b(ConnectionResult.f10874e);
        if (this.f11117i) {
            com.google.android.gms.internal.base.zau zauVar = googleApiManager.f10952n;
            ApiKey apiKey = this.c;
            zauVar.removeMessages(11, apiKey);
            googleApiManager.f10952n.removeMessages(9, apiKey);
            this.f11117i = false;
        }
        Iterator it = this.f11114f.values().iterator();
        if (!it.hasNext()) {
            e();
            h();
            return;
        }
        ((zaci) it.next()).getClass();
        throw null;
    }

    public final void g(int i10) {
        GoogleApiManager googleApiManager = this.f11121m;
        Preconditions.c(googleApiManager.f10952n);
        this.f11119k = null;
        this.f11117i = true;
        String lastDisconnectMessage = this.f11111b.getLastDisconnectMessage();
        zaad zaadVar = this.f11112d;
        zaadVar.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(lastDisconnectMessage);
        }
        zaadVar.a(true, new Status(20, sb2.toString(), null, null));
        com.google.android.gms.internal.base.zau zauVar = googleApiManager.f10952n;
        ApiKey apiKey = this.c;
        zauVar.sendMessageDelayed(Message.obtain(zauVar, 9, apiKey), TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
        com.google.android.gms.internal.base.zau zauVar2 = googleApiManager.f10952n;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 11, apiKey), 120000L);
        googleApiManager.f10945g.f11276a.clear();
        Iterator it = this.f11114f.values().iterator();
        if (!it.hasNext()) {
            return;
        }
        ((zaci) it.next()).getClass();
        throw null;
    }

    public final void h() {
        GoogleApiManager googleApiManager = this.f11121m;
        com.google.android.gms.internal.base.zau zauVar = googleApiManager.f10952n;
        ApiKey apiKey = this.c;
        zauVar.removeMessages(12, apiKey);
        com.google.android.gms.internal.base.zau zauVar2 = googleApiManager.f10952n;
        zauVar2.sendMessageDelayed(zauVar2.obtainMessage(12, apiKey), googleApiManager.f10940a);
    }

    public final boolean i(zai zaiVar) {
        if (!(zaiVar instanceof zac)) {
            Api.Client client = this.f11111b;
            zaiVar.d(this.f11112d, client.requiresSignIn());
            try {
                zaiVar.c(this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                client.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        zac zacVar = (zac) zaiVar;
        Feature a10 = a(zacVar.g(this));
        if (a10 == null) {
            Api.Client client2 = this.f11111b;
            zaiVar.d(this.f11112d, client2.requiresSignIn());
            try {
                zaiVar.c(this);
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                client2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        this.f11111b.getClass();
        if (this.f11121m.f10953o && zacVar.f(this)) {
            y yVar = new y(this.c, a10);
            int indexOf = this.f11118j.indexOf(yVar);
            if (indexOf >= 0) {
                y yVar2 = (y) this.f11118j.get(indexOf);
                this.f11121m.f10952n.removeMessages(15, yVar2);
                com.google.android.gms.internal.base.zau zauVar = this.f11121m.f10952n;
                zauVar.sendMessageDelayed(Message.obtain(zauVar, 15, yVar2), TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
                return false;
            }
            this.f11118j.add(yVar);
            com.google.android.gms.internal.base.zau zauVar2 = this.f11121m.f10952n;
            zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 15, yVar), TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
            com.google.android.gms.internal.base.zau zauVar3 = this.f11121m.f10952n;
            zauVar3.sendMessageDelayed(Message.obtain(zauVar3, 16, yVar), 120000L);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (!j(connectionResult)) {
                this.f11121m.c(connectionResult, this.f11115g);
                return false;
            }
            return false;
        }
        zacVar.b(new UnsupportedApiCallException(a10));
        return true;
    }

    public final boolean j(ConnectionResult connectionResult) {
        synchronized (GoogleApiManager.f10938r) {
            GoogleApiManager googleApiManager = this.f11121m;
            if (googleApiManager.f10949k != null && googleApiManager.f10950l.contains(this.c)) {
                this.f11121m.f10949k.n(connectionResult, this.f11115g);
                return true;
            }
            return false;
        }
    }

    public final boolean k(boolean z10) {
        boolean z11;
        Preconditions.c(this.f11121m.f10952n);
        Api.Client client = this.f11111b;
        if (client.isConnected() && this.f11114f.isEmpty()) {
            zaad zaadVar = this.f11112d;
            if (zaadVar.f11045a.isEmpty() && zaadVar.f11046b.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                if (z10) {
                    h();
                }
            } else {
                client.disconnect("Timing out service connection.");
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    public final void l() {
        GoogleApiManager googleApiManager = this.f11121m;
        Preconditions.c(googleApiManager.f10952n);
        Api.Client client = this.f11111b;
        if (!client.isConnected() && !client.isConnecting()) {
            try {
                int a10 = googleApiManager.f10945g.a(googleApiManager.f10943e, client);
                if (a10 != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(a10, null);
                    connectionResult.toString();
                    n(connectionResult, null);
                    return;
                }
                a0 a0Var = new a0(googleApiManager, client, this.c);
                if (client.requiresSignIn()) {
                    zact zactVar = this.f11116h;
                    Preconditions.j(zactVar);
                    com.google.android.gms.signin.zae zaeVar = zactVar.f11135f;
                    if (zaeVar != null) {
                        zaeVar.disconnect();
                    }
                    Integer valueOf = Integer.valueOf(System.identityHashCode(zactVar));
                    ClientSettings clientSettings = zactVar.f11134e;
                    clientSettings.f11188i = valueOf;
                    b8.a aVar = zactVar.c;
                    Context context = zactVar.f11131a;
                    Handler handler = zactVar.f11132b;
                    zactVar.f11135f = aVar.buildClient(context, handler.getLooper(), clientSettings, (Object) clientSettings.f11187h, (GoogleApiClient.ConnectionCallbacks) zactVar, (GoogleApiClient.OnConnectionFailedListener) zactVar);
                    zactVar.f11136g = a0Var;
                    Set set = zactVar.f11133d;
                    if (set != null && !set.isEmpty()) {
                        zactVar.f11135f.d();
                    } else {
                        handler.post(new d0(zactVar, 0));
                    }
                }
                try {
                    client.connect(a0Var);
                } catch (SecurityException e10) {
                    n(new ConnectionResult(10), e10);
                }
            } catch (IllegalStateException e11) {
                n(new ConnectionResult(10), e11);
            }
        }
    }

    public final void m(zai zaiVar) {
        Preconditions.c(this.f11121m.f10952n);
        boolean isConnected = this.f11111b.isConnected();
        LinkedList linkedList = this.f11110a;
        if (isConnected) {
            if (i(zaiVar)) {
                h();
                return;
            } else {
                linkedList.add(zaiVar);
                return;
            }
        }
        linkedList.add(zaiVar);
        ConnectionResult connectionResult = this.f11119k;
        if (connectionResult != null && connectionResult.d()) {
            n(this.f11119k, null);
        } else {
            l();
        }
    }

    public final void n(ConnectionResult connectionResult, RuntimeException runtimeException) {
        com.google.android.gms.signin.zae zaeVar;
        Preconditions.c(this.f11121m.f10952n);
        zact zactVar = this.f11116h;
        if (zactVar != null && (zaeVar = zactVar.f11135f) != null) {
            zaeVar.disconnect();
        }
        Preconditions.c(this.f11121m.f10952n);
        this.f11119k = null;
        this.f11121m.f10945g.f11276a.clear();
        b(connectionResult);
        if ((this.f11111b instanceof com.google.android.gms.common.internal.service.zap) && connectionResult.f10876b != 24) {
            GoogleApiManager googleApiManager = this.f11121m;
            googleApiManager.f10941b = true;
            com.google.android.gms.internal.base.zau zauVar = googleApiManager.f10952n;
            zauVar.sendMessageDelayed(zauVar.obtainMessage(19), 300000L);
        }
        if (connectionResult.f10876b == 4) {
            c(GoogleApiManager.f10937q);
        } else if (this.f11110a.isEmpty()) {
            this.f11119k = connectionResult;
        } else if (runtimeException != null) {
            Preconditions.c(this.f11121m.f10952n);
            d(null, runtimeException, false);
        } else if (this.f11121m.f10953o) {
            d(GoogleApiManager.d(this.c, connectionResult), null, true);
            if (!this.f11110a.isEmpty() && !j(connectionResult) && !this.f11121m.c(connectionResult, this.f11115g)) {
                if (connectionResult.f10876b == 18) {
                    this.f11117i = true;
                }
                if (this.f11117i) {
                    GoogleApiManager googleApiManager2 = this.f11121m;
                    ApiKey apiKey = this.c;
                    com.google.android.gms.internal.base.zau zauVar2 = googleApiManager2.f10952n;
                    zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 9, apiKey), TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
                    return;
                }
                c(GoogleApiManager.d(this.c, connectionResult));
            }
        } else {
            c(GoogleApiManager.d(this.c, connectionResult));
        }
    }

    public final void o(ConnectionResult connectionResult) {
        Preconditions.c(this.f11121m.f10952n);
        Api.Client client = this.f11111b;
        String name = client.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        client.disconnect("onSignInFailed for " + name + " with " + valueOf);
        n(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        GoogleApiManager googleApiManager = this.f11121m;
        if (myLooper == googleApiManager.f10952n.getLooper()) {
            f();
        } else {
            googleApiManager.f10952n.post(new com.android.billingclient.api.u(this, 1));
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        n(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        Looper myLooper = Looper.myLooper();
        GoogleApiManager googleApiManager = this.f11121m;
        if (myLooper == googleApiManager.f10952n.getLooper()) {
            g(i10);
        } else {
            googleApiManager.f10952n.post(new v(this, i10));
        }
    }

    public final void p() {
        Preconditions.c(this.f11121m.f10952n);
        Status status = GoogleApiManager.f10936p;
        c(status);
        zaad zaadVar = this.f11112d;
        zaadVar.getClass();
        zaadVar.a(false, status);
        for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.f11114f.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            m(new zah(listenerKey, new TaskCompletionSource()));
        }
        b(new ConnectionResult(4));
        Api.Client client = this.f11111b;
        if (client.isConnected()) {
            client.onUserSignOut(new x(this));
        }
    }
}
