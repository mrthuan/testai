package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zaaw implements zabf {

    /* renamed from: a  reason: collision with root package name */
    public final zabi f11052a;

    /* renamed from: b  reason: collision with root package name */
    public final Lock f11053b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final GoogleApiAvailabilityLight f11054d;

    /* renamed from: e  reason: collision with root package name */
    public ConnectionResult f11055e;

    /* renamed from: f  reason: collision with root package name */
    public int f11056f;

    /* renamed from: h  reason: collision with root package name */
    public int f11058h;

    /* renamed from: k  reason: collision with root package name */
    public com.google.android.gms.signin.zae f11061k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f11062l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11063m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f11064n;

    /* renamed from: o  reason: collision with root package name */
    public IAccountAccessor f11065o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f11066p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f11067q;

    /* renamed from: r  reason: collision with root package name */
    public final ClientSettings f11068r;

    /* renamed from: s  reason: collision with root package name */
    public final Map f11069s;

    /* renamed from: t  reason: collision with root package name */
    public final Api.AbstractClientBuilder f11070t;

    /* renamed from: g  reason: collision with root package name */
    public int f11057g = 0;

    /* renamed from: i  reason: collision with root package name */
    public final Bundle f11059i = new Bundle();

    /* renamed from: j  reason: collision with root package name */
    public final HashSet f11060j = new HashSet();

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f11071u = new ArrayList();

    public zaaw(zabi zabiVar, ClientSettings clientSettings, Map map, GoogleApiAvailabilityLight googleApiAvailabilityLight, Api.AbstractClientBuilder abstractClientBuilder, Lock lock, Context context) {
        this.f11052a = zabiVar;
        this.f11068r = clientSettings;
        this.f11069s = map;
        this.f11054d = googleApiAvailabilityLight;
        this.f11070t = abstractClientBuilder;
        this.f11053b = lock;
        this.c = context;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void a(Bundle bundle) {
        if (o(1)) {
            if (bundle != null) {
                this.f11059i.putAll(bundle);
            }
            if (p()) {
                k();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void c(ConnectionResult connectionResult, Api api, boolean z10) {
        if (o(1)) {
            m(connectionResult, api, z10);
            if (p()) {
                k();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void d(int i10) {
        l(new ConnectionResult(8, null));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    @Override // com.google.android.gms.common.api.internal.zabf
    public final void e() {
        Map map;
        boolean z10;
        zabi zabiVar = this.f11052a;
        zabiVar.f11100g.clear();
        this.f11063m = false;
        this.f11055e = null;
        this.f11057g = 0;
        this.f11062l = true;
        this.f11064n = false;
        this.f11066p = false;
        HashMap hashMap = new HashMap();
        Map map2 = this.f11069s;
        Iterator it = map2.keySet().iterator();
        boolean z11 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            map = zabiVar.f11099f;
            if (!hasNext) {
                break;
            }
            Api api = (Api) it.next();
            Api.Client client = (Api.Client) map.get(api.f10898b);
            Preconditions.j(client);
            Api.Client client2 = client;
            if (api.f10897a.getPriority() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 |= z10;
            boolean booleanValue = ((Boolean) map2.get(api)).booleanValue();
            if (client2.requiresSignIn()) {
                this.f11063m = true;
                if (booleanValue) {
                    this.f11060j.add(api.f10898b);
                } else {
                    this.f11062l = false;
                }
            }
            hashMap.put(client2, new h(this, api, booleanValue));
        }
        if (z11) {
            this.f11063m = false;
        }
        if (this.f11063m) {
            ClientSettings clientSettings = this.f11068r;
            Preconditions.j(clientSettings);
            Preconditions.j(this.f11070t);
            zabe zabeVar = zabiVar.f11106m;
            clientSettings.f11188i = Integer.valueOf(System.identityHashCode(zabeVar));
            o oVar = new o(this);
            this.f11061k = this.f11070t.buildClient(this.c, zabeVar.f11077g, clientSettings, (ClientSettings) clientSettings.f11187h, (GoogleApiClient.ConnectionCallbacks) oVar, (GoogleApiClient.OnConnectionFailedListener) oVar);
        }
        this.f11058h = map.size();
        this.f11071u.add(zabj.f11108a.submit(new k(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl f(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.f11052a.f11106m.f11078h.add(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean g() {
        ArrayList arrayList = this.f11071u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        arrayList.clear();
        j(true);
        this.f11052a.h();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl h(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void i() {
        this.f11063m = false;
        zabi zabiVar = this.f11052a;
        zabiVar.f11106m.f11086p = Collections.emptySet();
        Iterator it = this.f11060j.iterator();
        while (it.hasNext()) {
            Api.AnyClientKey anyClientKey = (Api.AnyClientKey) it.next();
            HashMap hashMap = zabiVar.f11100g;
            if (!hashMap.containsKey(anyClientKey)) {
                hashMap.put(anyClientKey, new ConnectionResult(17, null));
            }
        }
    }

    public final void j(boolean z10) {
        com.google.android.gms.signin.zae zaeVar = this.f11061k;
        if (zaeVar != null) {
            if (zaeVar.isConnected() && z10) {
                zaeVar.a();
            }
            zaeVar.disconnect();
            Preconditions.j(this.f11068r);
            this.f11065o = null;
        }
    }

    public final void k() {
        Bundle bundle;
        zabi zabiVar = this.f11052a;
        zabiVar.f11095a.lock();
        try {
            zabiVar.f11106m.o();
            zabiVar.f11104k = new zaaj(zabiVar);
            zabiVar.f11104k.e();
            zabiVar.f11096b.signalAll();
            zabiVar.f11095a.unlock();
            zabj.f11108a.execute(new g(this));
            com.google.android.gms.signin.zae zaeVar = this.f11061k;
            if (zaeVar != null) {
                if (this.f11066p) {
                    IAccountAccessor iAccountAccessor = this.f11065o;
                    Preconditions.j(iAccountAccessor);
                    zaeVar.c(iAccountAccessor, this.f11067q);
                }
                j(false);
            }
            for (Api.AnyClientKey anyClientKey : this.f11052a.f11100g.keySet()) {
                Api.Client client = (Api.Client) this.f11052a.f11099f.get(anyClientKey);
                Preconditions.j(client);
                client.disconnect();
            }
            if (this.f11059i.isEmpty()) {
                bundle = null;
            } else {
                bundle = this.f11059i;
            }
            this.f11052a.f11107n.a(bundle);
        } catch (Throwable th2) {
            zabiVar.f11095a.unlock();
            throw th2;
        }
    }

    public final void l(ConnectionResult connectionResult) {
        ArrayList arrayList = this.f11071u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        arrayList.clear();
        j(!connectionResult.d());
        zabi zabiVar = this.f11052a;
        zabiVar.h();
        zabiVar.f11107n.d(connectionResult);
    }

    public final void m(ConnectionResult connectionResult, Api api, boolean z10) {
        int priority = api.f10897a.getPriority();
        if ((!z10 || connectionResult.d() || this.f11054d.b(null, connectionResult.f10876b, null) != null) && (this.f11055e == null || priority < this.f11056f)) {
            this.f11055e = connectionResult;
            this.f11056f = priority;
        }
        this.f11052a.f11100g.put(api.f10898b, connectionResult);
    }

    public final void n() {
        if (this.f11058h == 0) {
            if (!this.f11063m || this.f11064n) {
                ArrayList arrayList = new ArrayList();
                this.f11057g = 1;
                zabi zabiVar = this.f11052a;
                this.f11058h = zabiVar.f11099f.size();
                Map map = zabiVar.f11099f;
                for (Api.AnyClientKey anyClientKey : map.keySet()) {
                    if (zabiVar.f11100g.containsKey(anyClientKey)) {
                        if (p()) {
                            k();
                        }
                    } else {
                        arrayList.add((Api.Client) map.get(anyClientKey));
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f11071u.add(zabj.f11108a.submit(new l(this, arrayList)));
                }
            }
        }
    }

    public final boolean o(int i10) {
        if (this.f11057g != i10) {
            zabe zabeVar = this.f11052a.f11106m;
            zabeVar.getClass();
            StringWriter stringWriter = new StringWriter();
            zabeVar.m("", null, new PrintWriter(stringWriter), null);
            stringWriter.toString();
            "Unexpected callback in ".concat(toString());
            new Exception();
            l(new ConnectionResult(8, null));
            return false;
        }
        return true;
    }

    public final boolean p() {
        int i10 = this.f11058h - 1;
        this.f11058h = i10;
        if (i10 > 0) {
            return false;
        }
        zabi zabiVar = this.f11052a;
        if (i10 < 0) {
            zabe zabeVar = zabiVar.f11106m;
            zabeVar.getClass();
            StringWriter stringWriter = new StringWriter();
            zabeVar.m("", null, new PrintWriter(stringWriter), null);
            stringWriter.toString();
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            l(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.f11055e;
        if (connectionResult != null) {
            zabiVar.f11105l = this.f11056f;
            l(connectionResult);
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void b() {
    }
}
