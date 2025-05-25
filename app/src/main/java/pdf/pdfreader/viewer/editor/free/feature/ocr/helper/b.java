package pdf.pdfreader.viewer.editor.free.feature.ocr.helper;

import java.util.ArrayList;
import kotlin.text.Regex;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRBlockFlatten;

/* compiled from: OCRTextBlockFactory.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Regex f25070a;

    /* compiled from: OCRTextBlockFactory.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static ArrayList a(String inputText) {
            boolean z10;
            kotlin.jvm.internal.g.e(inputText, "inputText");
            ArrayList arrayList = new ArrayList();
            for (String str : kotlin.text.k.h0(inputText, new String[]{"\n"}, 0, 6)) {
                int i10 = 0;
                for (String str2 : new Regex(ea.a.p("E3Mr", "NrwXEO4p")).split(kotlin.text.k.n0(str).toString(), 0)) {
                    int i11 = i10 + 1;
                    jg.f findAll$default = Regex.findAll$default(b.f25070a, str2, 0, 2, null);
                    OCRTextBlockFactory$Companion$splitStringByRegex$1 transform = new cg.l<kotlin.text.e, String>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.helper.OCRTextBlockFactory$Companion$splitStringByRegex$1
                        @Override // cg.l
                        public final String invoke(kotlin.text.e it) {
                            kotlin.jvm.internal.g.e(it, "it");
                            return it.getValue();
                        }
                    };
                    kotlin.jvm.internal.g.e(findAll$default, "<this>");
                    kotlin.jvm.internal.g.e(transform, "transform");
                    int i12 = 0;
                    for (String str3 : kotlin.sequences.a.i0(new jg.m(findAll$default, transform))) {
                        int i13 = i12 + 1;
                        if (i10 == 0 && i12 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        arrayList.add(new OCRBlockFlatten(str3, z10, false, 4, null));
                        i12 = i13;
                    }
                    i10 = i11;
                }
            }
            return arrayList;
        }
    }

    static {
        new Regex(ea.a.p("G1w7ez1kHytbfBxcGXsFYzZpQnR7TCJ0UG43XCF7OX0VJhBeL3AZUxFyXXAdPRV5NmlebC9jPlxJexljI2kFdA5IKm4OXUkpDihocBJTNXItcEY9BXkxaVVsI2MsK1x8G1w7eyBjEGkCdAlBG2E0aSd9GSk6Wx9wQlMpcjhwAT17YSV9L3AZUxFyXXAdPR5pNmFVYShhPlxJexljI2kFdA5LKnQSawNuE31ocBJTNXItcEY9DmEtZ0xsN10tKClwSFMkfQ9bPnVAMHUwRFwjMnRDdF1vfGtbZ1w6exBsG3VefRdwCFMBchtwQD0hYTh9GSlOKBpwOExEKyk=", "9JQuSz5X"));
        f25070a = new Regex(ea.a.p("G1w7ez1kHytbfBxcGXsFYzZpQnR7TCJ0LW45Kx1cP3t-fWxdWSkeKC5wT1MKcj9wMD1xeTRpL2wtYzkrb3xnXEN7GGMBaRJ0T0FGYQtpNX1vKU5bGnA4UydyLXAyPQdhXX0XcAhTAXIbcEA9IWkkYSNhXGE7XDN7F2M2aTZ0cktSdCprEm4DfS5wT1MKcj9wMD16YShnNmw5XTgoGnA0U1x9N1svdVAwMzAZXBwyZkMCXU5bGnVwMHAwaVwzM385dV03Wy91UTAzMBlcHDNmRgJdG3xuWx1cNHsFbCh1In1vcDBTEHILcAY9fGEHfQspOChucD1MPisp", "DDFOg5VB"));
    }
}
