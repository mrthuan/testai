package a2;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.play.core.assetpacks.d1;
import com.google.android.play.core.assetpacks.f1;
import com.google.android.play.core.assetpacks.g1;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.e;
import oi.f;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import w6.g;
import wk.h;

/* compiled from: SimpleSQLiteQuery.java */
/* loaded from: classes.dex */
public final class a implements d, x6.b, CustomEventBannerListener, zzhe, f1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25a;

    /* renamed from: b  reason: collision with root package name */
    public Object f26b;
    public Object c;

    public a(int i10) {
        this.f25a = i10;
        switch (i10) {
            case 8:
                this.f26b = new ci.a(0, 0, 0, 0);
                this.c = new ki.d();
                return;
            case 9:
                this.c = new AtomicBoolean(false);
                this.f26b = new HashMap(20);
                return;
            case 10:
                return;
            default:
                this.c = new AtomicBoolean(false);
                this.f26b = new LinkedHashMap();
                return;
        }
    }

    @Override // com.google.android.play.core.assetpacks.f1
    public final Object a() {
        g1 g1Var = (g1) this.f26b;
        Bundle bundle = (Bundle) this.c;
        g1Var.getClass();
        int i10 = bundle.getInt("session_id");
        if (i10 == 0) {
            return Boolean.TRUE;
        }
        HashMap hashMap = g1Var.c;
        Integer valueOf = Integer.valueOf(i10);
        if (!hashMap.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        d1 d1Var = (d1) hashMap.get(valueOf);
        if (d1Var.c.f13201d == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!t0.r(d1Var.c.f13201d, bundle.getInt(r9.b.a("status", g1.d(bundle)))));
    }

    @Override // com.google.android.gms.measurement.internal.zzhe
    public final void b(String str, String str2, Bundle bundle, long j10) {
        try {
            ((zzci) this.f26b).zze(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            zzge zzgeVar = ((AppMeasurementDynamiteService) this.c).f11514a;
            if (zzgeVar != null) {
                zzeu zzeuVar = zzgeVar.f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11715i.b(e10, "Event interceptor threw exception");
            }
        }
    }

    @Override // a2.d
    public final String c() {
        return (String) this.f26b;
    }

    public final int d(lh.b bVar) {
        int size = ((Map) this.f26b).size();
        if (!((AtomicBoolean) this.c).get()) {
            ((Map) this.f26b).put(Integer.valueOf(size), bVar);
        }
        return size;
    }

    public final void e() {
        hh.b[] bVarArr;
        switch (this.f25a) {
            case 7:
                ((AtomicBoolean) this.c).set(true);
                for (Integer num : ((LinkedHashMap) this.f26b).keySet()) {
                    hh.a aVar = (hh.a) ((LinkedHashMap) this.f26b).get(num);
                    if (aVar != null && (bVarArr = aVar.c) != null) {
                        for (hh.b bVar : bVarArr) {
                            bVar.getClass();
                        }
                    }
                }
                ((LinkedHashMap) this.f26b).clear();
                return;
            case 8:
                return;
            default:
                ((AtomicBoolean) this.c).set(true);
                Collection<lh.b> values = ((Map) this.f26b).values();
                if (values != null) {
                    for (lh.b bVar2 : values) {
                        bVar2.dispose();
                    }
                    ((Map) this.f26b).clear();
                    return;
                }
                return;
        }
    }

    public final synchronized void f(h hVar) {
        Object obj = this.c;
        if (((h) obj) != null) {
            ((h) obj).c = hVar;
            this.c = hVar;
        } else if (((h) this.f26b) == null) {
            this.c = hVar;
            this.f26b = hVar;
        } else {
            throw new IllegalStateException("Head present, but no tail");
        }
        notifyAll();
    }

    public final ki.d g(f fVar, ci.a aVar) {
        ki.d dVar = (ki.d) this.c;
        dVar.f19774a = 0.0f;
        dVar.f19775b = 0.0f;
        dVar.c = false;
        dVar.f19776d = false;
        dVar.f19777e = 0.0f;
        dVar.f19778f = 0.0f;
        e eVar = fVar.f23086m;
        int i10 = eVar.f19780b;
        int i11 = eVar.f19779a;
        fVar.f23076b.getClass();
        for (int i12 = aVar.f5691b; i12 <= aVar.f5692d; i12++) {
            if (!fVar.f23076b.l(i12)) {
                float d10 = fVar.f23076b.d(i12) * fVar.f23079f;
                ki.d dVar2 = (ki.d) this.c;
                dVar2.f19774a += d10;
                if (i12 < i10) {
                    dVar2.f19777e += d10;
                }
            }
        }
        for (int i13 = aVar.f5690a; i13 <= aVar.c; i13++) {
            if (!fVar.f23076b.g(i13).d()) {
                float f10 = fVar.f23076b.g(i13).f16598f * fVar.f23079f;
                ki.d dVar3 = (ki.d) this.c;
                dVar3.f19775b += f10;
                if (i13 < i11) {
                    dVar3.f19778f += f10;
                }
            }
        }
        return (ki.d) this.c;
    }

    @Override // pf.a
    public final Object get() {
        return new w6.h((Context) ((pf.a) this.f26b).get(), (g) ((pf.a) this.c).get());
    }

    public final lh.b h(int i10) {
        if (((AtomicBoolean) this.c).get() || i10 < 0 || i10 >= ((Map) this.f26b).size()) {
            return null;
        }
        return (lh.b) ((Map) this.f26b).get(Integer.valueOf(i10));
    }

    public final boolean i(f fVar, ci.a aVar, int i10, int i11) {
        e eVar = fVar.f23086m;
        int i12 = eVar.f19780b;
        int i13 = eVar.f19779a;
        fVar.f23076b.getClass();
        ei.c cVar = fVar.f23076b;
        int i14 = aVar.f5691b;
        int i15 = aVar.f5692d;
        int i16 = aVar.f5690a;
        int i17 = aVar.c;
        while (i14 <= i15 && cVar.l(i14)) {
            i14++;
        }
        while (i15 >= i14 && cVar.l(i15)) {
            i15--;
        }
        while (i16 <= i17 && cVar.g(i16).d()) {
            i16++;
        }
        while (i17 >= i16 && cVar.g(i17).d()) {
            i17--;
        }
        Object obj = this.f26b;
        ci.a aVar2 = (ci.a) obj;
        aVar2.f5691b = i14;
        aVar2.f5690a = i16;
        aVar2.f5692d = i15;
        aVar2.c = i17;
        if (((ci.a) obj).f5691b == i11 && ((ci.a) obj).f5690a == i10) {
            return true;
        }
        if (i10 == ((ci.a) obj).f5690a && i11 > ((ci.a) obj).f5691b) {
            if (i11 == i12) {
                return true;
            }
        } else if (i11 == ((ci.a) obj).f5691b && i10 > ((ci.a) obj).f5690a) {
            if (i10 == i13) {
                return true;
            }
        } else if (i10 > ((ci.a) obj).f5690a && i11 > ((ci.a) obj).f5691b && i11 == i12 && i10 == i13) {
            return true;
        }
        return false;
    }

    public final synchronized h j() {
        h hVar;
        Object obj = this.f26b;
        hVar = (h) obj;
        if (((h) obj) != null) {
            h hVar2 = ((h) obj).c;
            this.f26b = hVar2;
            if (hVar2 == null) {
                this.c = null;
            }
        }
        return hVar;
    }

    public final synchronized h k() {
        if (((h) this.f26b) == null) {
            wait(1000);
        }
        return j();
    }

    public final void l() {
        if (((AtomicBoolean) this.c).get()) {
            return;
        }
        for (Integer num : ((LinkedHashMap) this.f26b).keySet()) {
            hh.a aVar = (hh.a) ((LinkedHashMap) this.f26b).get(num);
            if (aVar != null) {
                aVar.f18335e = (byte) 0;
                hh.b[] bVarArr = aVar.c;
                if (bVarArr != null) {
                    for (hh.b bVar : bVarArr) {
                        bVar.f18342h = 0;
                    }
                }
            }
        }
    }

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f25a = i10;
        this.f26b = obj;
        this.c = obj2;
    }

    public a(AppMeasurementDynamiteService appMeasurementDynamiteService, zzci zzciVar) {
        this.f25a = 5;
        this.c = appMeasurementDynamiteService;
        this.f26b = zzciVar;
    }

    @Override // a2.d
    public final void a(b2.d dVar) {
        Object[] objArr = (Object[]) this.c;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            i10++;
            if (obj == null) {
                dVar.d(i10);
            } else if (obj instanceof byte[]) {
                dVar.a(i10, (byte[]) obj);
            } else if (obj instanceof Float) {
                dVar.b(((Float) obj).floatValue(), i10);
            } else if (obj instanceof Double) {
                dVar.b(((Double) obj).doubleValue(), i10);
            } else if (obj instanceof Long) {
                dVar.c(i10, ((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                dVar.c(i10, ((Integer) obj).intValue());
            } else if (obj instanceof Short) {
                dVar.c(i10, ((Short) obj).shortValue());
            } else if (obj instanceof Byte) {
                dVar.c(i10, ((Byte) obj).byteValue());
            } else if (obj instanceof String) {
                dVar.f(i10, (String) obj);
            } else if (obj instanceof Boolean) {
                dVar.c(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
            } else {
                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
            }
        }
    }

    public a(String accountId, String id2) {
        this.f25a = 1;
        kotlin.jvm.internal.g.e(accountId, "accountId");
        kotlin.jvm.internal.g.e(id2, "id");
        this.f26b = accountId;
        this.c = id2;
    }

    public a(final t5.d dVar) {
        this.f25a = 2;
        this.c = new CountDownLatch(1);
        com.facebook.d.c().execute(new FutureTask(new Callable() { // from class: com.facebook.internal.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                a2.a this$0 = a2.a.this;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                Callable callable = dVar;
                kotlin.jvm.internal.g.e(callable, "$callable");
                try {
                    this$0.f26b = callable.call();
                } finally {
                    CountDownLatch countDownLatch = (CountDownLatch) this$0.c;
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
            }
        }));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        this(0, str, null);
        this.f25a = 0;
    }
}
