package f2;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zabz;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.assetpacks.s2;
import com.google.android.play.core.assetpacks.u0;

/* compiled from: ViewGroupOverlayApi18.java */
/* loaded from: classes.dex */
public final class t implements h4.b, x6.b, zabz, OnDelegateCreatedListener, q9.l, OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17085a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f17086b;

    public /* synthetic */ t(com.google.android.gms.common.api.internal.a aVar) {
        this.f17085a = 3;
        this.f17086b = aVar;
    }

    @Override // q9.m
    public final /* bridge */ /* synthetic */ Object a() {
        return new u0(((s2) ((q9.m) this.f17086b)).b());
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void c(int i10, boolean z10) {
        ConnectionResult connectionResult;
        Object obj = this.f17086b;
        com.google.android.gms.common.api.internal.a aVar = (com.google.android.gms.common.api.internal.a) obj;
        aVar.f10977l.lock();
        try {
            com.google.android.gms.common.api.internal.a aVar2 = (com.google.android.gms.common.api.internal.a) obj;
            if (!aVar2.f10976k && (connectionResult = aVar2.f10975j) != null && connectionResult.f()) {
                ((com.google.android.gms.common.api.internal.a) obj).f10976k = true;
                ((com.google.android.gms.common.api.internal.a) obj).f10969d.onConnectionSuspended(i10);
            }
            ((com.google.android.gms.common.api.internal.a) obj).f10976k = false;
            com.google.android.gms.common.api.internal.a.k((com.google.android.gms.common.api.internal.a) obj, i10, z10);
        } finally {
            aVar.f10977l.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void d(ConnectionResult connectionResult) {
        Object obj = this.f17086b;
        ((com.google.android.gms.common.api.internal.a) obj).f10977l.lock();
        try {
            ((com.google.android.gms.common.api.internal.a) obj).f10974i = connectionResult;
            com.google.android.gms.common.api.internal.a.l((com.google.android.gms.common.api.internal.a) obj);
        } finally {
            ((com.google.android.gms.common.api.internal.a) obj).f10977l.unlock();
        }
    }

    @Override // h4.b
    public final v3.l e(v3.l lVar, t3.e eVar) {
        Resources resources = (Resources) this.f17086b;
        if (lVar == null) {
            return null;
        }
        return new c4.p(resources, lVar);
    }

    @Override // pf.a
    public final Object get() {
        String packageName = ((Context) ((pf.a) this.f17086b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        com.google.android.play.core.assetpacks.d dVar = (com.google.android.play.core.assetpacks.d) obj;
        ((com.google.android.play.core.assetpacks.y) this.f17086b).f();
    }

    public final String toString() {
        switch (this.f17085a) {
            case 7:
                return "  BitmapInfo\n" + ((xi.p) this.f17086b).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t(Object obj, int i10) {
        this.f17085a = i10;
        this.f17086b = obj;
    }

    public t(wi.c cVar) {
        this.f17085a = 7;
        this.f17086b = new xi.p(cVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void a(Bundle bundle) {
        Object obj = this.f17086b;
        ((com.google.android.gms.common.api.internal.a) obj).f10977l.lock();
        try {
            com.google.android.gms.common.api.internal.a aVar = (com.google.android.gms.common.api.internal.a) obj;
            Bundle bundle2 = aVar.f10973h;
            if (bundle2 == null) {
                aVar.f10973h = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            ((com.google.android.gms.common.api.internal.a) obj).f10974i = ConnectionResult.f10874e;
            com.google.android.gms.common.api.internal.a.l((com.google.android.gms.common.api.internal.a) obj);
        } finally {
            ((com.google.android.gms.common.api.internal.a) obj).f10977l.unlock();
        }
    }

    public t(Resources resources) {
        this.f17085a = 1;
        this.f17086b = resources;
    }
}
