package um;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRBlockFlatten;

/* compiled from: OCRResult.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f30440a;

    /* renamed from: b  reason: collision with root package name */
    public final List<OCRBlockFlatten> f30441b;

    public b(String str, ArrayList arrayList) {
        ea.a.p("I2lfZQ==", "YT4XGrYG");
        ea.a.p("RG85ZHM=", "us0kNHAI");
        this.f30440a = str;
        this.f30441b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (g.a(this.f30440a, bVar.f30440a) && g.a(this.f30441b, bVar.f30441b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30441b.hashCode() + (this.f30440a.hashCode() * 31);
    }

    public final String toString() {
        return "OCRResult(line=" + this.f30440a + ", words=" + this.f30441b + ")";
    }
}
