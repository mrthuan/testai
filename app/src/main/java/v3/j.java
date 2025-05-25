package v3;

import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q4.a;

/* compiled from: LoadPath.java */
/* loaded from: classes.dex */
public final class j<Data, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final w0.d<List<Throwable>> f30519a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends e<Data, ResourceType, Transcode>> f30520b;
    public final String c;

    public j(Class cls, Class cls2, Class cls3, List list, a.c cVar) {
        this.f30519a = cVar;
        if (!list.isEmpty()) {
            this.f30520b = list;
            this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final l a(int i10, int i11, t3.e eVar, com.bumptech.glide.load.data.e eVar2, DecodeJob.c cVar) {
        w0.d<List<Throwable>> dVar = this.f30519a;
        List<Throwable> b10 = dVar.b();
        com.google.android.play.core.assetpacks.c.l(b10);
        List<Throwable> list = b10;
        try {
            List<? extends e<Data, ResourceType, Transcode>> list2 = this.f30520b;
            int size = list2.size();
            l lVar = null;
            for (int i12 = 0; i12 < size; i12++) {
                try {
                    lVar = list2.get(i12).a(i10, i11, eVar, eVar2, cVar);
                } catch (GlideException e10) {
                    list.add(e10);
                }
                if (lVar != null) {
                    break;
                }
            }
            if (lVar != null) {
                return lVar;
            }
            throw new GlideException(this.c, new ArrayList(list));
        } finally {
            dVar.a(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f30520b.toArray()) + '}';
    }
}
