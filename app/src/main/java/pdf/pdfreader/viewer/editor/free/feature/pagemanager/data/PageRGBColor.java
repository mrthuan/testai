// Auto-fixed: added missing class declaration
public class PageRGBColor {
package pdf.pdfreader.viewer.editor.free.feature.pagemanager.data;

import ea.a;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: PageRGBColor.kt */
/* loaded from: classes3.dex */
public enum PageRGBColor {
    NONE(0, 0, R.color.ad_color_transparent, a.p("AU9_RQ==", "3hJyTJXf")),
    WHITE(FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC, R.color.white, a.p("GEh4VEU=", "nBlFezPj")),
    LIGHT_GREEN(242, 225, R.color.color_100_DDF2E1, a.p("A0l2SC1fcFIfRU4=", "G4NvGrLC")),
    LIGHT_YELLOW(245, 228, R.color.color_100_F8F5E4, a.p("K0koSBxfPUUETClX", "vfgoHdR8")),
    LIGHT_BLUE(231, 245, R.color.color_100_DCE7F5, a.p("A0l2SC1fdUwPRQ==", "IDbMTJZr"));
    

    /* renamed from: b  reason: collision with root package name */
    private final int f25246b;
    private final int color;

    /* renamed from: g  reason: collision with root package name */
    private final int f25247g;

    /* renamed from: r  reason: collision with root package name */
    private final int f25248r;

    PageRGBColor(int i10, int i11, int i12, String str) {
        this.f25248r = r2;
        this.f25247g = i10;
        this.f25246b = i11;
        this.color = i12;
    }

    public final int getB() {
        return this.f25246b;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getG() {
        return this.f25247g;
    }

    public final int getR() {
        return this.f25248r;
    }
}

}
