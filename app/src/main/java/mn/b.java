package mn;

import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.ImageAdjustPageMode;

/* compiled from: ImageAdjustUiState.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ImageAdjustPageMode f22149a;

    public b() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && this.f22149a == ((b) obj).f22149a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22149a.hashCode();
    }

    public final String toString() {
        return "ImageAdjustUiState(pageMode=" + this.f22149a + ")";
    }

    public b(ImageAdjustPageMode imageAdjustPageMode) {
        g.e(imageAdjustPageMode, ea.a.p("P2FWZTRvU2U=", "PvnvKKzd"));
        this.f22149a = imageAdjustPageMode;
    }

    public /* synthetic */ b(int i10) {
        this(ImageAdjustPageMode.PREVIEW);
    }
}
