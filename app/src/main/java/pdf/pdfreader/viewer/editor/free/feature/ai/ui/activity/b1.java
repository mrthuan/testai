package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import lib.zj.office.pg.control.PGPrintMode;
import lib.zj.office.pg.control.Presentation;
import lib.zj.office.wp.control.Word;
import pdf.pdfreader.viewer.editor.free.thumb.ThumbLoadCenter;

/* compiled from: OfficeAIReaderActivity.kt */
/* loaded from: classes3.dex */
public final class b1 implements lo.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OfficeAIReaderActivity f24566a;

    public b1(OfficeAIReaderActivity officeAIReaderActivity) {
        this.f24566a = officeAIReaderActivity;
    }

    @Override // lo.b
    public final void a(final int i10, int i11, int i12, final ImageView imageView, final lo.c callback, final boolean z10) {
        View view;
        kotlin.jvm.internal.g.e(callback, "callback");
        OfficeAIReaderActivity officeAIReaderActivity = this.f24566a;
        lib.zj.office.system.p pVar = officeAIReaderActivity.Y;
        Bitmap bitmap = null;
        if (pVar != null) {
            view = pVar.getView();
        } else {
            view = null;
        }
        if (!officeAIReaderActivity.isFinishing() && !officeAIReaderActivity.isDestroyed() && view != null) {
            try {
                if (!TextUtils.isEmpty(officeAIReaderActivity.f24444m0) && lo.d.d(i10, officeAIReaderActivity.f24444m0)) {
                    return;
                }
                if (view instanceof Word) {
                    bitmap = ((Word) view).i(i10 + 1);
                } else if (view instanceof Presentation) {
                    PGPrintMode pGPrintMode = ((Presentation) view).f20940t;
                    th.d d10 = pGPrintMode.f20915g.d(i10);
                    if (d10 != null) {
                        vh.a g10 = vh.a.g();
                        th.c cVar = pGPrintMode.f20915g;
                        rh.e eVar = pGPrintMode.f20916h;
                        g10.getClass();
                        bitmap = vh.a.i(cVar, eVar, d10, 0.3f, null, true);
                    }
                }
                final Bitmap bitmap2 = bitmap;
                if (!((ThumbLoadCenter) officeAIReaderActivity.f24439h0.getValue()).b().get() && bitmap2 != null) {
                    try {
                        lo.d.f(officeAIReaderActivity.f24444m0, bitmap2, i10);
                    } catch (IllegalArgumentException e10) {
                        e10.printStackTrace();
                    }
                    officeAIReaderActivity.i2().post(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.a1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj;
                            String p10 = ea.a.p("UGMNbFViLGNr", "iKtl9Mup");
                            lo.c cVar2 = callback;
                            kotlin.jvm.internal.g.e(cVar2, p10);
                            ImageView imageView2 = imageView;
                            Integer num = null;
                            if (imageView2 != null) {
                                obj = imageView2.getTag();
                            } else {
                                obj = null;
                            }
                            if (obj instanceof Integer) {
                                num = (Integer) obj;
                            }
                            int i13 = i10;
                            if (num != null && num.intValue() == i13) {
                                imageView2.setImageBitmap(bitmap2);
                            }
                            cVar2.c(i13, z10);
                        }
                    });
                    return;
                }
                return;
            } catch (Exception e11) {
                callback.e(e11);
                return;
            }
        }
        ea.a.p("OWgfbQRuJWls", "UoMjfDB7");
    }
}
