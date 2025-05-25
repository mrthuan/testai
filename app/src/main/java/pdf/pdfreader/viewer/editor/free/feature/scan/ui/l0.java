package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import java.util.ArrayList;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;

/* compiled from: ImageAdjustActivity.kt */
/* loaded from: classes3.dex */
public final class l0 extends androidx.fragment.app.w {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ImageAdjustActivity f25831d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ul.b f25832e;

    public l0(ImageAdjustActivity imageAdjustActivity, ul.b bVar) {
        this.f25831d = imageAdjustActivity;
        this.f25832e = bVar;
    }

    @Override // oo.a
    public final void a() {
        Object obj;
        int i10;
        boolean z10;
        ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
        on.b C2 = this.f25831d.C2();
        ul.b image = this.f25832e;
        kotlin.jvm.internal.g.e(image, "image");
        Iterator it = C2.f23515h.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ul.b) obj).f30405b == image.f30405b) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (((ul.b) obj) != null) {
            ImageConvertDataRepository.f26536a.getClass();
            int i11 = image.f30408f;
            image.b(false);
            androidx.lifecycle.w<ArrayList<ul.b>> wVar = ImageConvertDataRepository.f26551q;
            ArrayList<ul.b> d10 = wVar.d();
            if (d10 == null) {
                d10 = new ArrayList<>();
            }
            d10.remove(image);
            for (ul.b bVar : d10) {
                if (bVar.f30407e && i11 != -1 && (i10 = bVar.f30408f) > i11) {
                    bVar.c(i10 - 1);
                }
            }
            wVar.j(d10);
        }
    }
}
