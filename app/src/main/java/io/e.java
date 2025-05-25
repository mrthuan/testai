package io;

import android.content.Context;
import android.graphics.Bitmap;
import ho.b;
import java.util.ArrayList;
import jp.co.cyberagent.android.gpuimage.GPUImage;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.AdjustableType;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.GroupAiFilterType;

/* compiled from: SuperImageGroupAiFilter.kt */
/* loaded from: classes3.dex */
public final class e extends ho.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        g.e(context, ea.a.p("Mm88dBV4dA==", "7wQRpRZp"));
    }

    @Override // ho.b
    public final GroupAiFilterType b() {
        return GroupAiFilterType.SUPER_IMAGE;
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
        g.e(context, "context");
        g.e(bitmap, "bitmap");
        try {
            GPUImage gPUImage = new GPUImage(context);
            ko.d dVar = new ko.d();
            dVar.f29512j = 2.062f;
            dVar.l(2.062f, dVar.f29511i);
            gPUImage.c(dVar);
            Bitmap a10 = gPUImage.a(bitmap);
            g.d(a10, ea.a.p("KHBESRRhUGV0Zy90N2kcbVRwOWkxaCNpPXQKcgJwOWwmZVUoG2lDbTtwKQ==", "kViEQoCI"));
            return a10;
        } catch (Throwable unused) {
            return bitmap;
        }
    }
}
