package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zabi implements zaca, zau {

    /* renamed from: a  reason: collision with root package name */
    public final Lock f11095a;

    /* renamed from: b  reason: collision with root package name */
    public final Condition f11096b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final GoogleApiAvailabilityLight f11097d;

    /* renamed from: e  reason: collision with root package name */
    public final t f11098e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f11099f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f11100g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final ClientSettings f11101h;

    /* renamed from: i  reason: collision with root package name */
    public final Map f11102i;

    /* renamed from: j  reason: collision with root package name */
    public final Api.AbstractClientBuilder f11103j;

    /* renamed from: k  reason: collision with root package name */
    public volatile zabf f11104k;

    /* renamed from: l  reason: collision with root package name */
    public int f11105l;

    /* renamed from: m  reason: collision with root package name */
    public final zabe f11106m;

    /* renamed from: n  reason: collision with root package name */
    public final zabz f11107n;

    public zabi(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailability googleApiAvailability, Map map, ClientSettings clientSettings, Map map2, Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList, zabz zabzVar) {
        this.c = context;
        this.f11095a = lock;
        this.f11097d = googleApiAvailability;
        this.f11099f = map;
        this.f11101h = clientSettings;
        this.f11102i = map2;
        this.f11103j = abstractClientBuilder;
        this.f11106m = zabeVar;
        this.f11107n = zabzVar;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zat) arrayList.get(i10)).c = this;
        }
        this.f11098e = new t(this, looper);
        this.f11096b = lock.newCondition();
        this.f11104k = new zaax(this);
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void K(ConnectionResult connectionResult, Api api, boolean z10) {
        this.f11095a.lock();
        try {
            this.f11104k.c(connectionResult, api, z10);
        } finally {
            this.f11095a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void a() {
        this.f11104k.b();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl b(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        this.f11104k.f(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean c() {
        return this.f11104k instanceof zaaj;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl d(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        return this.f11104k.h(apiMethodImpl);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void e() {
        if (this.f11104k instanceof zaaj) {
            zaaj zaajVar = (zaaj) this.f11104k;
            if (zaajVar.f11051b) {
                zaajVar.f11051b = false;
                zaajVar.f11050a.f11106m.f11094x.a();
                zaajVar.g();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void f() {
        if (this.f11104k.g()) {
            this.f11100g.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.f11104k);
        for (Api api : this.f11102i.keySet()) {
            String valueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) api.c).println(":");
            Api.Client client = (Api.Client) this.f11099f.get(api.f10898b);
            Preconditions.j(client);
            client.dump(valueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    public final void h() {
        this.f11095a.lock();
        try {
            this.f11104k = new zaax(this);
            this.f11104k.e();
            this.f11096b.signalAll();
        } finally {
            this.f11095a.unlock();
        }
    }

    public final void i(s sVar) {
        t tVar = this.f11098e;
        tVar.sendMessage(tVar.obtainMessage(1, sVar));
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.f11095a.lock();
        try {
            this.f11104k.a(bundle);
        } finally {
            this.f11095a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        this.f11095a.lock();
        try {
            this.f11104k.d(i10);
        } finally {
            this.f11095a.unlock();
        }
    }
}
