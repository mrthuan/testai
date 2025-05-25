package io;

import android.content.Context;
import android.graphics.Bitmap;
import ho.b;
import java.util.ArrayList;
import jp.co.cyberagent.android.gpuimage.GPUImage;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.scan.FTT;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.AdjustableType;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.GroupAiFilterType;

/* compiled from: CustomBW1GroupAiFilter.kt */
/* loaded from: classes3.dex */
public final class b extends ho.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        g.e(context, ea.a.p("LG9fdBx4dA==", "6xOjvfem"));
    }

    @Override // ho.b
    public final GroupAiFilterType b() {
        return GroupAiFilterType.CUSTOM_BW1;
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
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            FTT.filterBitmap(context, copy, 0);
            GPUImage gPUImage = new GPUImage(context);
            gPUImage.c(new jo.a());
            Bitmap a10 = gPUImage.a(copy);
            g.d(a10, ea.a.p("U3AlSQ9hKmVmZwN0dmkjbVlwBWk9aHBpGHQUchBwMmxdZTQoEGU-dSR0JGlAbTZwKQ==", "Yq4PbMKy"));
            return a10;
        } catch (Throwable unused) {
            return bitmap;
        }
    }
}
