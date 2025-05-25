package ul;

import a0.d;
import java.util.List;
import kotlin.jvm.internal.g;

/* compiled from: ImageConfig.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f30425a;

    /* renamed from: b  reason: collision with root package name */
    public int f30426b;
    public ho.b c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f30427d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f30428e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f30429f;

    /* renamed from: g  reason: collision with root package name */
    public List<Float> f30430g;

    /* renamed from: h  reason: collision with root package name */
    public List<Float> f30431h;

    /* renamed from: i  reason: collision with root package name */
    public List<Float> f30432i;

    public c() {
        this(null);
    }

    public final boolean a() {
        if (!this.f30427d && !this.f30428e) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f30425a == cVar.f30425a && this.f30426b == cVar.f30426b && g.a(this.c, cVar.c) && this.f30427d == cVar.f30427d && this.f30428e == cVar.f30428e && this.f30429f == cVar.f30429f && g.a(this.f30430g, cVar.f30430g) && g.a(this.f30431h, cVar.f30431h) && g.a(this.f30432i, cVar.f30432i)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i10 = ((this.f30425a * 31) + this.f30426b) * 31;
        ho.b bVar = this.c;
        int i11 = 0;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i12 = (i10 + hashCode) * 31;
        boolean z10 = this.f30427d;
        int i13 = 1;
        int i14 = z10;
        if (z10 != 0) {
            i14 = 1;
        }
        int i15 = (i12 + i14) * 31;
        boolean z11 = this.f30428e;
        int i16 = z11;
        if (z11 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z12 = this.f30429f;
        if (!z12) {
            i13 = z12 ? 1 : 0;
        }
        int hashCode3 = (this.f30430g.hashCode() + ((i17 + i13) * 31)) * 31;
        List<Float> list = this.f30431h;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i18 = (hashCode3 + hashCode2) * 31;
        List<Float> list2 = this.f30432i;
        if (list2 != null) {
            i11 = list2.hashCode();
        }
        return i18 + i11;
    }

    public final String toString() {
        int i10 = this.f30425a;
        int i11 = this.f30426b;
        ho.b bVar = this.c;
        boolean z10 = this.f30427d;
        boolean z11 = this.f30428e;
        boolean z12 = this.f30429f;
        List<Float> list = this.f30430g;
        List<Float> list2 = this.f30431h;
        List<Float> list3 = this.f30432i;
        StringBuilder f10 = d.f("ImageConfig(rotate=", i10, ", expectRotate=", i11, ", aiFilter=");
        f10.append(bVar);
        f10.append(", isUserManualCrop=");
        f10.append(z10);
        f10.append(", isApplyAutoCrop=");
        f10.append(z11);
        f10.append(", isGetAutoCropArea=");
        f10.append(z12);
        f10.append(", cropList=");
        f10.append(list);
        f10.append(", autoCropList=");
        f10.append(list2);
        f10.append(", autoCropListTemp=");
        f10.append(list3);
        f10.append(")");
        return f10.toString();
    }

    public c(Object obj) {
        List<Float> list = b.f30403w;
        g.d(list, ea.a.p("C0V3QSxMY18ZUgVQKkE6RUE=", "PBypXTrl"));
        ea.a.p("UHIkcD9pEXQ=", "HSyiNW3s");
        this.f30425a = 0;
        this.f30426b = 0;
        this.c = null;
        this.f30427d = false;
        this.f30428e = false;
        this.f30429f = false;
        this.f30430g = list;
        this.f30431h = null;
        this.f30432i = null;
    }
}
