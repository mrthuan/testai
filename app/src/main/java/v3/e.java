package v3;

import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import q4.a;
import z3.o;

/* compiled from: DecodePath.java */
/* loaded from: classes.dex */
public final class e<DataType, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<DataType> f30505a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends t3.f<DataType, ResourceType>> f30506b;
    public final h4.b<ResourceType, Transcode> c;

    /* renamed from: d  reason: collision with root package name */
    public final w0.d<List<Throwable>> f30507d;

    /* renamed from: e  reason: collision with root package name */
    public final String f30508e;

    public e(Class cls, Class cls2, Class cls3, List list, h4.b bVar, a.c cVar) {
        this.f30505a = cls;
        this.f30506b = list;
        this.c = bVar;
        this.f30507d = cVar;
        this.f30508e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l a(int i10, int i11, t3.e eVar, com.bumptech.glide.load.data.e eVar2, DecodeJob.c cVar) {
        l lVar;
        t3.h hVar;
        boolean z10;
        EncodeStrategy encodeStrategy;
        boolean z11;
        t3.b cVar2;
        w0.d<List<Throwable>> dVar = this.f30507d;
        List<Throwable> b10 = dVar.b();
        com.google.android.play.core.assetpacks.c.l(b10);
        List<Throwable> list = b10;
        try {
            l<ResourceType> b11 = b(eVar2, i10, i11, eVar, list);
            dVar.a(list);
            DecodeJob decodeJob = DecodeJob.this;
            decodeJob.getClass();
            Class<?> cls = b11.get().getClass();
            DataSource dataSource = DataSource.RESOURCE_DISK_CACHE;
            DataSource dataSource2 = cVar.f6922a;
            com.bumptech.glide.load.engine.d<R> dVar2 = decodeJob.f6893a;
            t3.g gVar = null;
            if (dataSource2 != dataSource) {
                t3.h e10 = dVar2.e(cls);
                lVar = e10.b(decodeJob.f6899h, b11, decodeJob.f6903l, decodeJob.f6904m);
                hVar = e10;
            } else {
                lVar = b11;
                hVar = null;
            }
            if (!b11.equals(lVar)) {
                b11.a();
            }
            if (dVar2.c.f6842b.f6824d.a(lVar.c()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Registry registry = dVar2.c.f6842b;
                registry.getClass();
                t3.g a10 = registry.f6824d.a(lVar.c());
                if (a10 != null) {
                    encodeStrategy = a10.a(decodeJob.f6906o);
                    gVar = a10;
                } else {
                    throw new Registry.NoResultEncoderAvailableException(lVar.c());
                }
            } else {
                encodeStrategy = EncodeStrategy.NONE;
            }
            t3.b bVar = decodeJob.f6914w;
            ArrayList b12 = dVar2.b();
            int size = b12.size();
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    if (((o.a) b12.get(i12)).f32257a.equals(bVar)) {
                        z11 = true;
                        break;
                    }
                    i12++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (decodeJob.f6905n.d(!z11, dataSource2, encodeStrategy)) {
                if (gVar != null) {
                    int i13 = DecodeJob.a.c[encodeStrategy.ordinal()];
                    if (i13 != 1) {
                        if (i13 == 2) {
                            cVar2 = new m(dVar2.c.f6841a, decodeJob.f6914w, decodeJob.f6900i, decodeJob.f6903l, decodeJob.f6904m, hVar, cls, decodeJob.f6906o);
                        } else {
                            throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy);
                        }
                    } else {
                        cVar2 = new c(decodeJob.f6914w, decodeJob.f6900i);
                    }
                    k<Z> kVar = (k) k.f30521e.b();
                    com.google.android.play.core.assetpacks.c.l(kVar);
                    kVar.f30524d = false;
                    kVar.c = true;
                    kVar.f30523b = lVar;
                    DecodeJob.d<?> dVar3 = decodeJob.f6897f;
                    dVar3.f6924a = cVar2;
                    dVar3.f6925b = gVar;
                    dVar3.c = kVar;
                    lVar = kVar;
                } else {
                    throw new Registry.NoResultEncoderAvailableException(lVar.get().getClass());
                }
            }
            return this.c.e(lVar, eVar);
        } catch (Throwable th2) {
            dVar.a(list);
            throw th2;
        }
    }

    public final l<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, t3.e eVar2, List<Throwable> list) {
        List<? extends t3.f<DataType, ResourceType>> list2 = this.f30506b;
        int size = list2.size();
        l<ResourceType> lVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            t3.f<DataType, ResourceType> fVar = list2.get(i12);
            try {
                if (fVar.a(eVar.a(), eVar2)) {
                    lVar = fVar.b(eVar.a(), i10, i11, eVar2);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(fVar);
                }
                list.add(e10);
            }
            if (lVar != null) {
                break;
            }
        }
        if (lVar != null) {
            return lVar;
        }
        throw new GlideException(this.f30508e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f30505a + ", decoders=" + this.f30506b + ", transcoder=" + this.c + '}';
    }
}
