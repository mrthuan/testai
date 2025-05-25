package ho;

import android.content.Context;
import android.graphics.Bitmap;
import ho.b;
import java.util.ArrayList;
import jp.co.cyberagent.android.gpuimage.GPUImage;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.AdjustableType;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.GroupAiFilterType;

/* compiled from: ReverseColorGroupAiFilter.kt */
/* loaded from: classes3.dex */
public final class g extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "O12Kwb0u"));
    }

    @Override // ho.b
    public final GroupAiFilterType b() {
        return GroupAiFilterType.REVERSE_COLOR;
    }

    @Override // ho.b
    public final void c() {
        b.a aVar = new b.a(AdjustableType.CONTRAST, new ko.d());
        ArrayList<b.a> arrayList = this.c;
        arrayList.add(aVar);
        arrayList.add(new b.a(AdjustableType.BRIGHTNESS, new ko.c()));
        arrayList.add(new b.a(AdjustableType.SHARPEN, new ko.e()));
    }

    @Override // ho.b
    public final Bitmap e(Context context, Bitmap bitmap) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(bitmap, "bitmap");
        GPUImage gPUImage = new GPUImage(context);
        gPUImage.c(new jo.b());
        Bitmap a10 = gPUImage.a(bitmap);
        kotlin.jvm.internal.g.d(a10, ea.a.p("KHBESRRhUGV0Zy90N2kcbVRwOWkxaCNpA3Q1cgtwO2wmZVUoG2lDbTtwKQ==", "IhMdoPJK"));
        return a10;
    }
}
