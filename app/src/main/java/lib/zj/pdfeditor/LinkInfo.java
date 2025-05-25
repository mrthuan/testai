package lib.zj.pdfeditor;

import android.graphics.RectF;
import nj.a;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class LinkInfo {
    public final RectF hitArea;
    private boolean linkHighlighting = false;
    public final RectF rect;

    public LinkInfo(float f10, float f11, float f12, float f13) {
        this.rect = new RectF(f10, f11, f12, f13);
        nj.a aVar = a.C0300a.f22499a;
        if (aVar.c <= 0) {
            aVar.c = aVar.f22497a.getResources().getDimensionPixelSize(R.dimen.dp_2);
        }
        float f14 = aVar.c;
        float f15 = f10 - f14;
        float f16 = f11 - f14;
        this.hitArea = new RectF(f15 < 0.0f ? 0.0f : f15, f16 < 0.0f ? 0.0f : f16, f12 + f14, f13 + f14);
    }

    public boolean isLinkHighlighting() {
        return this.linkHighlighting;
    }

    public void setLinkHighlighting(boolean z10) {
        this.linkHighlighting = z10;
    }

    public void acceptVisitor(f fVar) {
    }
}
