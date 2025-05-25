package pdf.pdfreader.viewer.editor.free.feature.ocr.helper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: TransportMultiImage.kt */
/* loaded from: classes3.dex */
public final class n extends j {

    /* renamed from: b  reason: collision with root package name */
    public final List<ul.b> f25091b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ArrayList arrayList) {
        super(arrayList);
        ea.a.p("CmUeZTR0PW0pZ2U=", "ZtyrWtqT");
        this.f25091b = arrayList;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ocr.helper.j, pdf.pdfreader.viewer.editor.free.feature.ocr.helper.l
    public final ul.c a(int i10) {
        ul.b bVar = (ul.b) kotlin.collections.m.t0(i10, this.f25091b);
        if (bVar != null) {
            return bVar.f30419q;
        }
        return null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ocr.helper.j, pdf.pdfreader.viewer.editor.free.feature.ocr.helper.l
    public final String b(File file, int i10) {
        ul.b bVar;
        if (file.exists() && file.isDirectory() && (bVar = (ul.b) kotlin.collections.m.t0(i10, this.f25091b)) != null) {
            File file2 = new File(bVar.f30404a);
            String lowerCase = bg.b.A0(file2).toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.g.d(lowerCase, ea.a.p("LGgecxZhRCAiYRBhGmw2bl8uAXQ7aVhnXS4Fbx1vNWUqQxZzUyh7bythCmUaUhhPbCk=", "snXw67G6"));
            if (file2.length() < 524288000) {
                switch (lowerCase.hashCode()) {
                    case 97669:
                        if (!lowerCase.equals(ea.a.p("UW1w", "fuaguadf"))) {
                            return "";
                        }
                        break;
                    case 105441:
                        if (!lowerCase.equals(ea.a.p("JXBn", "leYuPoRu"))) {
                            return "";
                        }
                        break;
                    case 111145:
                        if (!lowerCase.equals(ea.a.p("B25n", "jNwgEAHE"))) {
                            return "";
                        }
                        break;
                    case 3268712:
                        if (!lowerCase.equals(ea.a.p("WXAuZw==", "0px2X3MJ"))) {
                            return "";
                        }
                        break;
                    default:
                        return "";
                }
                String absolutePath = file2.getAbsolutePath();
                kotlin.jvm.internal.g.d(absolutePath, ea.a.p("PHJSRhBsUi47YjlvGXUcZWVhGmg=", "p3WuJgr2"));
                return absolutePath;
            }
            return "";
        }
        return "";
    }
}
