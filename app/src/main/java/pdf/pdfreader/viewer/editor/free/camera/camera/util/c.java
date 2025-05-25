package pdf.pdfreader.viewer.editor.free.camera.camera.util;

import cg.p;
import java.util.Comparator;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24104a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f24105b;

    public /* synthetic */ c(p pVar, int i10) {
        this.f24104a = i10;
        this.f24105b = pVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f24104a;
        p pVar = this.f24105b;
        switch (i10) {
            case 0:
                g.e(pVar, ea.a.p("F3QmcDA=", "MLHMomB5"));
                return ((Number) pVar.invoke(obj, obj2)).intValue();
            default:
                String str = OfficeReaderActivity.D2;
                g.e(pVar, ea.a.p("a3RccDA=", "rjfMpGjW"));
                return ((Number) pVar.invoke(obj, obj2)).intValue();
        }
    }
}
