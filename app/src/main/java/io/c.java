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

/* compiled from: CustomBW2GroupAiFilter.kt */
/* loaded from: classes3.dex */
public final class c extends ho.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        g.e(context, ea.a.p("UG8ldBZ4dA==", "ZLMgjjSR"));
    }

    @Override // ho.b
    public final GroupAiFilterType b() {
        return GroupAiFilterType.CUSTOM_BW2;
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
            FTT.filterBitmap(context, copy, 1);
            GPUImage gPUImage = new GPUImage(context);
            gPUImage.c(new jo.a());
            Bitmap a10 = gPUImage.a(copy);
            g.d(a10, ea.a.p("VHA-SR5hBWVcZ1F0K2kibSVwZWkyaAVpHnRTcg9wGmxaZS8oAWURdR50dmkdbTdwKQ==", "r6NjuaRs"));
            return a10;
        } catch (Throwable unused) {
            return bitmap;
        }
    }
}
