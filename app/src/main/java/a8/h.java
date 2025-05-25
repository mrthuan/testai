package a8;

import com.google.android.gms.measurement.internal.zzau;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class h implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final Iterator f185a;

    public h(zzau zzauVar) {
        this.f185a = zzauVar.f11545a.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f185a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f185a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
