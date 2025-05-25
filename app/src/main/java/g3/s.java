package g3;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import h3.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrimPathContent.java */
/* loaded from: classes.dex */
public final class s implements c, a.InterfaceC0242a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17616a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f17617b = new ArrayList();
    public final ShapeTrimPath.Type c;

    /* renamed from: d  reason: collision with root package name */
    public final h3.c f17618d;

    /* renamed from: e  reason: collision with root package name */
    public final h3.c f17619e;

    /* renamed from: f  reason: collision with root package name */
    public final h3.c f17620f;

    public s(com.airbnb.lottie.model.layer.a aVar, ShapeTrimPath shapeTrimPath) {
        shapeTrimPath.getClass();
        this.f17616a = shapeTrimPath.f6087e;
        this.c = shapeTrimPath.f6084a;
        h3.a<Float, Float> a10 = shapeTrimPath.f6085b.a();
        this.f17618d = (h3.c) a10;
        h3.a<Float, Float> a11 = shapeTrimPath.c.a();
        this.f17619e = (h3.c) a11;
        h3.a<Float, Float> a12 = shapeTrimPath.f6086d.a();
        this.f17620f = (h3.c) a12;
        aVar.e(a10);
        aVar.e(a11);
        aVar.e(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    @Override // h3.a.InterfaceC0242a
    public final void a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17617b;
            if (i10 < arrayList.size()) {
                ((a.InterfaceC0242a) arrayList.get(i10)).a();
                i10++;
            } else {
                return;
            }
        }
    }

    public final void c(a.InterfaceC0242a interfaceC0242a) {
        this.f17617b.add(interfaceC0242a);
    }

    @Override // g3.c
    public final void b(List<c> list, List<c> list2) {
    }
}
