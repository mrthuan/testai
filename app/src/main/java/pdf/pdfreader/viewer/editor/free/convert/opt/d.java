package pdf.pdfreader.viewer.editor.free.convert.opt;

import pdf.pdfreader.viewer.editor.free.feature.ocr.helper.k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24145a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f24146b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f24147d;

    public /* synthetic */ d(int i10, Object obj, int i11, int i12) {
        this.f24145a = i12;
        this.f24147d = obj;
        this.f24146b = i10;
        this.c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24145a;
        Object obj = this.f24147d;
        switch (i10) {
            case 0:
                a aVar = (a) obj;
                kotlin.jvm.internal.g.e(aVar, ea.a.p("YWMYbFpiUmNr", "jbEy63I9"));
                aVar.b(this.f24146b, this.c);
                return;
            default:
                k kVar = (k) obj;
                kotlin.jvm.internal.g.e(kVar, ea.a.p("F2MqbB9iA2Nr", "T3c2F3za"));
                kVar.c();
                return;
        }
    }
}
