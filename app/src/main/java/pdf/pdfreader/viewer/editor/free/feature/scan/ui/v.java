package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.z0;
import kotlin.Result;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustPayload;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.GroupAiFilterType;
import pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25854a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ImageAdjustActivity f25855b;

    public /* synthetic */ v(ImageAdjustActivity imageAdjustActivity, int i10) {
        this.f25854a = i10;
        this.f25855b = imageAdjustActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        GroupAiFilterType groupAiFilterType;
        String str;
        String str2;
        ul.c cVar;
        ho.b bVar;
        int i10 = this.f25854a;
        ImageAdjustActivity imageAdjustActivity = this.f25855b;
        switch (i10) {
            case 0:
                ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("PGgCc0cw", "W4Hkc2Lb"));
                int currentItem = imageAdjustActivity.y2().f695z.getCurrentItem();
                if (currentItem < imageAdjustActivity.C2().f23515h.size()) {
                    try {
                        imageAdjustActivity.K2(currentItem + 1);
                        Result.m13constructorimpl(tf.d.f30009a);
                        return;
                    } catch (Throwable th2) {
                        Result.m13constructorimpl(androidx.activity.s.v(th2));
                        return;
                    }
                }
                return;
            case 1:
                ImageAdjustActivity.a aVar2 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("TWgHc2gw", "jC9nLezt"));
                tf.c cVar2 = ScanEventCenter.f28674a;
                ul.b i11 = imageAdjustActivity.C2().i();
                if (i11 == null || (cVar = i11.f30420r) == null || (bVar = cVar.c) == null || (groupAiFilterType = bVar.b()) == null) {
                    groupAiFilterType = GroupAiFilterType.RAW;
                }
                boolean z10 = imageAdjustActivity.C2().f23514g;
                kotlin.jvm.internal.g.e(groupAiFilterType, "groupAiFilterType");
                Context a10 = ScanEventCenter.a();
                String p10 = ea.a.p("KWlddBxy", "CdsuloCN");
                String p11 = ea.a.p("CGkFdC5yE3MpdgNfV2w-Y2s=", "UHniKLGo");
                String b10 = ScanEventCenter.b(groupAiFilterType);
                if (z10) {
                    str = "WQ==";
                    str2 = "sG3JaLu3";
                } else {
                    str = "Tg==";
                    str2 = "aSx4VteV";
                }
                tn.a.d(a10, p10, p11, androidx.activity.f.m(b10, "_", ea.a.p(str, str2)), false);
                imageAdjustActivity.w2();
                imageAdjustActivity.C2().f23513f = null;
                imageAdjustActivity.C2().e();
                imageAdjustActivity.C2().h();
                imageAdjustActivity.H.post(new z0(imageAdjustActivity, 27));
                return;
            default:
                ImageAdjustActivity.a aVar3 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("R2gic1cw", "V0ROVr2u"));
                tf.c cVar3 = ScanEventCenter.f28674a;
                ScanEventCenter.d(imageAdjustActivity.b2());
                int l10 = imageAdjustActivity.C2().l();
                if (l10 >= 0) {
                    imageAdjustActivity.B2().notifyItemChanged(l10, ImageAdjustPayload.ROTATE_ANTI_CLOCK_WISE);
                    return;
                }
                return;
        }
    }
}
