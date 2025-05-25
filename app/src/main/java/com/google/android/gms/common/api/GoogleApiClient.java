package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import androidx.activity.f;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.api.internal.zat;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import y.b;
import y.h;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@Deprecated
/* loaded from: classes.dex */
public abstract class GoogleApiClient {

    /* renamed from: a  reason: collision with root package name */
    public static final Set f10906a = Collections.newSetFromMap(new WeakHashMap());

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @Deprecated
    /* loaded from: classes.dex */
    public static final class Builder {
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public final String f10909d;

        /* renamed from: f  reason: collision with root package name */
        public final Context f10911f;

        /* renamed from: i  reason: collision with root package name */
        public final Looper f10914i;

        /* renamed from: a  reason: collision with root package name */
        public final HashSet f10907a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public final HashSet f10908b = new HashSet();

        /* renamed from: e  reason: collision with root package name */
        public final b f10910e = new b();

        /* renamed from: g  reason: collision with root package name */
        public final b f10912g = new b();

        /* renamed from: h  reason: collision with root package name */
        public final int f10913h = -1;

        /* renamed from: j  reason: collision with root package name */
        public final GoogleApiAvailability f10915j = GoogleApiAvailability.f10882d;

        /* renamed from: k  reason: collision with root package name */
        public final b8.a f10916k = com.google.android.gms.signin.zad.f11959a;

        /* renamed from: l  reason: collision with root package name */
        public final ArrayList f10917l = new ArrayList();

        /* renamed from: m  reason: collision with root package name */
        public final ArrayList f10918m = new ArrayList();

        public Builder(Context context) {
            this.f10911f = context;
            this.f10914i = context.getMainLooper();
            this.c = context.getPackageName();
            this.f10909d = context.getClass().getName();
        }

        @ResultIgnorabilityUnspecified
        public final zabe a() {
            boolean z10;
            Preconditions.a("must call addApi() to add at least one API", !this.f10912g.isEmpty());
            ClientSettings b10 = b();
            Map map = b10.f11183d;
            b bVar = new b();
            b bVar2 = new b();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((h.c) this.f10912g.keySet()).iterator();
            boolean z11 = false;
            Api api = null;
            boolean z12 = false;
            while (it.hasNext()) {
                Api api2 = (Api) it.next();
                V orDefault = this.f10912g.getOrDefault(api2, z11);
                if (map.get(api2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar.put(api2, Boolean.valueOf(z10));
                zat zatVar = new zat(api2, z10);
                arrayList.add(zatVar);
                Api.AbstractClientBuilder abstractClientBuilder = api2.f10897a;
                Preconditions.j(abstractClientBuilder);
                Api api3 = api;
                Api.Client buildClient = abstractClientBuilder.buildClient(this.f10911f, this.f10914i, b10, (ClientSettings) orDefault, (ConnectionCallbacks) zatVar, (OnConnectionFailedListener) zatVar);
                bVar2.put(api2.f10898b, buildClient);
                if (abstractClientBuilder.getPriority() == 1) {
                    if (orDefault != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (buildClient.providesSignIn()) {
                    if (api3 == null) {
                        api = api2;
                    } else {
                        throw new IllegalStateException(f.m(api2.c, " cannot be used with ", api3.c));
                    }
                } else {
                    api = api3;
                }
                z11 = false;
            }
            Api api4 = api;
            if (api4 != null) {
                if (!z12) {
                    boolean equals = this.f10907a.equals(this.f10908b);
                    Object[] objArr = {api4.c};
                    if (!equals) {
                        throw new IllegalStateException(String.format("Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", objArr));
                    }
                } else {
                    throw new IllegalStateException(a6.h.d("With using ", api4.c, ", GamesOptions can only be specified within GoogleSignInOptions.Builder"));
                }
            }
            zabe zabeVar = new zabe(this.f10911f, new ReentrantLock(), this.f10914i, b10, this.f10915j, this.f10916k, bVar, this.f10917l, this.f10918m, bVar2, this.f10913h, zabe.n(bVar2.values(), true), arrayList);
            Set set = GoogleApiClient.f10906a;
            synchronized (set) {
                set.add(zabeVar);
            }
            if (this.f10913h < 0) {
                return zabeVar;
            }
            LifecycleCallback.c(null);
            throw null;
        }

        public final ClientSettings b() {
            SignInOptions signInOptions = SignInOptions.f11946a;
            b bVar = this.f10912g;
            Api api = com.google.android.gms.signin.zad.f11960b;
            if (bVar.containsKey(api)) {
                signInOptions = (SignInOptions) bVar.getOrDefault(api, null);
            }
            return new ClientSettings(null, this.f10907a, this.f10910e, this.c, this.f10909d, signInOptions);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @Deprecated
    /* loaded from: classes.dex */
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @Deprecated
    /* loaded from: classes.dex */
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public abstract void b();

    public abstract void e();

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T f(T t4) {
        throw new UnsupportedOperationException();
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T g(T t4) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public Api.Client h(Api.ClientKey clientKey) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public Context i() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public Looper j() {
        throw new UnsupportedOperationException();
    }

    public void k(zada zadaVar) {
        throw new UnsupportedOperationException();
    }

    public void l(zada zadaVar) {
        throw new UnsupportedOperationException();
    }
}
