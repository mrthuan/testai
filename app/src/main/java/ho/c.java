package ho;

import android.content.Context;
import android.graphics.Bitmap;
import ho.b;
import java.util.ArrayList;
import jp.co.cyberagent.android.gpuimage.GPUImage;
import pdf.pdfreader.viewer.editor.free.scan.FTT;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.AdjustableType;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.GroupAiFilterType;
import rf.h;

/* compiled from: BlendAlphaGroupAiFilter.kt */
/* loaded from: classes3.dex */
public final class c extends b {

    /* renamed from: f  reason: collision with root package name */
    public ko.b f18389f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        kotlin.jvm.internal.g.e(context, ea.a.p("NW8-dBZ4dA==", "ImVPsqBD"));
    }

    @Override // ho.b
    public final GroupAiFilterType b() {
        return GroupAiFilterType.BLEND_ALPHA;
    }

    @Override // ho.b
    public final void c() {
        ko.b bVar = new ko.b();
        this.f18389f = bVar;
        b.a aVar = new b.a(AdjustableType.CONTRAST, bVar);
        ArrayList<b.a> arrayList = this.c;
        arrayList.add(aVar);
        arrayList.add(new b.a(AdjustableType.BRIGHTNESS, new ko.c()));
        arrayList.add(new b.a(AdjustableType.SHARPEN, new ko.e()));
    }

    @Override // ho.b
    public final Bitmap e(Context context, Bitmap bitmap) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(bitmap, "bitmap");
        try {
            ko.b bVar = this.f18389f;
            if (bVar != null && !bitmap.isRecycled()) {
                bVar.f29539m = bitmap;
                h hVar = new h(bVar, bitmap);
                synchronized (bVar.f29515a) {
                    bVar.f29515a.addLast(hVar);
                }
            }
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            if (true ^ FTT.filterBitmap(context, copy, 0)) {
                GPUImage gPUImage = new GPUImage(context);
                ko.d dVar = new ko.d();
                dVar.f29512j = 2.062f;
                dVar.l(2.062f, dVar.f29511i);
                gPUImage.c(dVar);
                Bitmap a10 = gPUImage.a(bitmap);
                kotlin.jvm.internal.g.d(a10, ea.a.p("IHAESVxhM2VmZwN0dmkjbVlwBWk9aHBpGHQUchBwMmwuZRUoU2kgbSlwKQ==", "bCGq1TDx"));
                return a10;
            }
            kotlin.jvm.internal.g.d(copy, ea.a.p("QWU4dR90IGkGbVVw", "DB9KnFSK"));
            return copy;
        } catch (Throwable unused) {
            return bitmap;
        }
    }
}
