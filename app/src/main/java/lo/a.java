package lo;

import android.widget.ImageView;
import kotlin.jvm.internal.g;

/* compiled from: ThumbnailLoadParams.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f21783a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f21784b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21785d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f21786e;

    /* renamed from: f  reason: collision with root package name */
    public final c f21787f;

    public a(int i10, int i11, int i12, ImageView imageView, c cVar, boolean z10) {
        g.e(cVar, ea.a.p("LGFdbBthVGs=", "Ggv2wJ2V"));
        this.f21783a = i10;
        this.f21784b = imageView;
        this.c = i11;
        this.f21785d = i12;
        this.f21786e = z10;
        this.f21787f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f21783a == aVar.f21783a && g.a(this.f21784b, aVar.f21784b) && this.c == aVar.c && this.f21785d == aVar.f21785d && this.f21786e == aVar.f21786e && g.a(this.f21787f, aVar.f21787f)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int i10 = this.f21783a * 31;
        ImageView imageView = this.f21784b;
        if (imageView == null) {
            hashCode = 0;
        } else {
            hashCode = imageView.hashCode();
        }
        int i11 = (((((i10 + hashCode) * 31) + this.c) * 31) + this.f21785d) * 31;
        boolean z10 = this.f21786e;
        int i12 = z10;
        if (z10 != 0) {
            i12 = 1;
        }
        return this.f21787f.hashCode() + ((i11 + i12) * 31);
    }

    public final String toString() {
        return "ThumbnailLoadParams(position=" + this.f21783a + ", imageView=" + this.f21784b + ", reqWidth=" + this.c + ", reqHeight=" + this.f21785d + ", isRefresh=" + this.f21786e + ", callback=" + this.f21787f + ")";
    }
}
