package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25857a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ImageAdjustActivity f25858b;

    public /* synthetic */ x(ImageAdjustActivity imageAdjustActivity, int i10) {
        this.f25857a = i10;
        this.f25858b = imageAdjustActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25857a;
        ImageAdjustActivity imageAdjustActivity = this.f25858b;
        switch (i10) {
            case 0:
                ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("MGgtc04w", "7bDDjbnL"));
                imageAdjustActivity.u2(true);
                return;
            default:
                ImageAdjustActivity.a aVar2 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("R2gic1cw", "wvBV0Daw"));
                imageAdjustActivity.J2();
                return;
        }
    }
}
