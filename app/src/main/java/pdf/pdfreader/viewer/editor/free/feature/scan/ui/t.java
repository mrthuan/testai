package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import am.o2;
import am.p2;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustPayload;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25850a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ImageAdjustActivity f25851b;
    public final /* synthetic */ i2.a c;

    public /* synthetic */ t(ImageAdjustActivity imageAdjustActivity, i2.a aVar, int i10) {
        this.f25850a = i10;
        this.f25851b = imageAdjustActivity;
        this.c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        ul.c cVar;
        ho.b bVar;
        ImageAdjustFiltersAdapter imageAdjustFiltersAdapter;
        int i11 = this.f25850a;
        ImageAdjustActivity imageAdjustActivity = this.f25851b;
        i2.a aVar = this.c;
        switch (i11) {
            case 0:
                p2 p2Var = (p2) aVar;
                ImageAdjustActivity.a aVar2 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("O2hYc10w", "WvYR4VQz"));
                kotlin.jvm.internal.g.e(p2Var, ea.a.p("c3QabwNzcGkmZA9uZw==", "99Wuo2br"));
                ul.b i12 = imageAdjustActivity.C2().i();
                if (i12 != null && (cVar = i12.f30420r) != null && (bVar = cVar.c) != null && (imageAdjustFiltersAdapter = imageAdjustActivity.f25743b0) != null) {
                    imageAdjustActivity.r2(imageAdjustFiltersAdapter, bVar, p2Var);
                    return;
                }
                return;
            default:
                o2 o2Var = (o2) aVar;
                ImageAdjustActivity.a aVar3 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("R2gic1cw", "VSNzB4r1"));
                kotlin.jvm.internal.g.e(o2Var, ea.a.p("F3Qkbx9zIGkcZF1uZw==", "SIwGWFI0"));
                on.b C2 = imageAdjustActivity.C2();
                ul.c k10 = C2.k();
                boolean z10 = false;
                if (k10 == null) {
                    i10 = -1;
                } else {
                    k10.f30428e = !k10.f30428e;
                    k10.f30427d = false;
                    k10.f30429f = false;
                    i10 = C2.f23518k;
                }
                if (i10 >= 0) {
                    imageAdjustActivity.t2(o2Var);
                    imageAdjustActivity.B2().notifyItemChanged(i10, ImageAdjustPayload.CROP_STATE);
                }
                ul.c k11 = imageAdjustActivity.C2().k();
                if (k11 != null && k11.f30428e) {
                    z10 = true;
                }
                tf.c cVar2 = ScanEventCenter.f28674a;
                ScanEventCenter.c(imageAdjustActivity.b2(), z10);
                return;
        }
    }
}
