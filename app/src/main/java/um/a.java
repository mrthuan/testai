package um;

import android.graphics.Bitmap;
import androidx.activity.f;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.g;
import ul.c;

/* compiled from: OCRImage.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f30433a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30434b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public WeakReference<Bitmap> f30435d;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<Bitmap> f30436e;

    /* renamed from: f  reason: collision with root package name */
    public final c f30437f;

    /* renamed from: g  reason: collision with root package name */
    public List<b> f30438g;

    /* renamed from: h  reason: collision with root package name */
    public String f30439h;

    public a(long j10, String str, int i10) {
        g.e(str, ea.a.p("GGFDaA==", "KWh7WcfO"));
        this.f30433a = j10;
        this.f30434b = str;
        this.c = i10;
        c cVar = new c(null);
        cVar.f30428e = true;
        this.f30437f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f30433a == aVar.f30433a && g.a(this.f30434b, aVar.f30434b) && this.c == aVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f30433a;
        return f.h(this.f30434b, ((int) (j10 ^ (j10 >>> 32))) * 31, 31) + this.c;
    }

    public final String toString() {
        return "OCRImage(id=" + this.f30433a + ", path=" + this.f30434b + ", index=" + this.c + ")";
    }
}
