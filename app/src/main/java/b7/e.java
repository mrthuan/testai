package b7;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import d7.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import v6.h;
import v6.m;
import v6.p;
import v6.s;

/* compiled from: Uploader.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5352a;

    /* renamed from: b  reason: collision with root package name */
    public final w6.d f5353b;
    public final c7.d c;

    /* renamed from: d  reason: collision with root package name */
    public final i f5354d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f5355e;

    /* renamed from: f  reason: collision with root package name */
    public final d7.a f5356f;

    /* renamed from: g  reason: collision with root package name */
    public final e7.a f5357g;

    /* renamed from: h  reason: collision with root package name */
    public final e7.a f5358h;

    /* renamed from: i  reason: collision with root package name */
    public final c7.c f5359i;

    public e(Context context, w6.d dVar, c7.d dVar2, i iVar, Executor executor, d7.a aVar, e7.a aVar2, e7.a aVar3, c7.c cVar) {
        this.f5352a = context;
        this.f5353b = dVar;
        this.c = dVar2;
        this.f5354d = iVar;
        this.f5355e = executor;
        this.f5356f = aVar;
        this.f5357g = aVar2;
        this.f5358h = aVar3;
        this.f5359i = cVar;
    }

    public final void a(final s sVar, int i10) {
        boolean z10;
        com.google.android.datatransport.runtime.backends.a a10;
        w6.i iVar = this.f5353b.get(sVar.b());
        new com.google.android.datatransport.runtime.backends.a(BackendResponse.Status.OK, 0L);
        final long j10 = 0;
        while (true) {
            h5.f fVar = new h5.f(3, this, sVar);
            d7.a aVar = this.f5356f;
            if (((Boolean) aVar.a(fVar)).booleanValue()) {
                Iterable<c7.i> iterable = (Iterable) aVar.a(new h5.i(this, sVar));
                if (!iterable.iterator().hasNext()) {
                    return;
                }
                boolean z11 = false;
                if (iVar == null) {
                    z6.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", sVar);
                    a10 = new com.google.android.datatransport.runtime.backends.a(BackendResponse.Status.FATAL_ERROR, -1L);
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (c7.i iVar2 : iterable) {
                        arrayList.add(iVar2.a());
                    }
                    if (sVar.c() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        c7.c cVar = this.f5359i;
                        Objects.requireNonNull(cVar);
                        y6.a aVar2 = (y6.a) aVar.a(new androidx.appcompat.libconvert.helper.b(cVar, 3));
                        h.a aVar3 = new h.a();
                        aVar3.f30706f = new HashMap();
                        aVar3.f30704d = Long.valueOf(this.f5357g.a());
                        aVar3.f30705e = Long.valueOf(this.f5358h.a());
                        aVar3.d("GDT_CLIENT_METRICS");
                        s6.b bVar = new s6.b("proto");
                        aVar2.getClass();
                        za.e eVar = p.f30723a;
                        eVar.getClass();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            eVar.a(aVar2, byteArrayOutputStream);
                        } catch (IOException unused) {
                        }
                        aVar3.c(new m(bVar, byteArrayOutputStream.toByteArray()));
                        arrayList.add(iVar.b(aVar3.b()));
                    }
                    a10 = iVar.a(new w6.a(arrayList, sVar.c()));
                }
                if (a10.f9918a == BackendResponse.Status.TRANSIENT_ERROR) {
                    aVar.a(new c(this, iterable, sVar, j10));
                    this.f5354d.b(sVar, i10 + 1, true);
                    return;
                }
                aVar.a(new androidx.privacysandbox.ads.adservices.java.internal.a(this, iterable));
                BackendResponse.Status status = BackendResponse.Status.OK;
                BackendResponse.Status status2 = a10.f9918a;
                if (status2 == status) {
                    j10 = Math.max(j10, a10.f9919b);
                    if (sVar.c() != null) {
                        z11 = true;
                    }
                    if (z11) {
                        aVar.a(new h5.a(this, 2));
                    }
                } else if (status2 == BackendResponse.Status.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (c7.i iVar3 : iterable) {
                        String g10 = iVar3.a().g();
                        if (!hashMap.containsKey(g10)) {
                            hashMap.put(g10, 1);
                        } else {
                            hashMap.put(g10, Integer.valueOf(((Integer) hashMap.get(g10)).intValue() + 1));
                        }
                    }
                    aVar.a(new androidx.fragment.app.h(1, this, hashMap));
                }
            } else {
                aVar.a(new a.InterfaceC0194a() { // from class: b7.d
                    @Override // d7.a.InterfaceC0194a
                    public final Object l() {
                        e eVar2 = e.this;
                        eVar2.c.l0(eVar2.f5357g.a() + j10, sVar);
                        return null;
                    }
                });
                return;
            }
        }
    }
}
