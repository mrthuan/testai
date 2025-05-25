package pdf.pdfreader.viewer.editor.free.ui.act.tools;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import gl.k;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.text.Regex;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.office.l0;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.e0;
import pdf.pdfreader.viewer.editor.free.ui.dialog.f0;
import pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.act.BasePdfEditActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.guide.BaseGuidePopView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27069a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f27070b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f27069a = i10;
        this.f27070b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Collection collection;
        boolean z10;
        ViewGroup viewGroup;
        EditText u7;
        int i10 = this.f27069a;
        Object obj = this.f27070b;
        switch (i10) {
            case 0:
                SearchPDFWhenChooseActivity searchPDFWhenChooseActivity = (SearchPDFWhenChooseActivity) obj;
                int i11 = SearchPDFWhenChooseActivity.f27034m0;
                kotlin.jvm.internal.g.e(searchPDFWhenChooseActivity, ea.a.p("R2gic1cw", "P4jFmSxz"));
                String a10 = eo.a.a(searchPDFWhenChooseActivity);
                if (!TextUtils.isEmpty(a10)) {
                    kotlin.jvm.internal.g.d(a10, ea.a.p("V2E_YQ==", "zS7dymCC"));
                    List<String> split = new Regex(ea.a.p("oL-l", "D3lQ8Gkj")).split(a10, 0);
                    if (!split.isEmpty()) {
                        ListIterator<String> listIterator = split.listIterator(split.size());
                        while (listIterator.hasPrevious()) {
                            if (listIterator.previous().length() == 0) {
                                z10 = true;
                                continue;
                            } else {
                                z10 = false;
                                continue;
                            }
                            if (!z10) {
                                collection = m.B0(split, listIterator.nextIndex() + 1);
                                searchPDFWhenChooseActivity.s2().post(new l0(3, searchPDFWhenChooseActivity, kotlin.collections.f.I((String[]) collection.toArray(new String[0]))));
                                return;
                            }
                        }
                    }
                    collection = EmptyList.INSTANCE;
                    searchPDFWhenChooseActivity.s2().post(new l0(3, searchPDFWhenChooseActivity, kotlin.collections.f.I((String[]) collection.toArray(new String[0]))));
                    return;
                }
                return;
            case 1:
                ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = (ReaderImg2PDFChooseActivity) obj;
                ReaderImg2PDFChooseActivity.a aVar = ReaderImg2PDFChooseActivity.M0;
                kotlin.jvm.internal.g.e(readerImg2PDFChooseActivity, ea.a.p("O2hYc10w", "nrByZigr"));
                readerImg2PDFChooseActivity.t2();
                return;
            case 2:
                ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity = (ReaderImg2PDFConvertActivity) obj;
                kotlin.jvm.internal.g.e(readerImg2PDFConvertActivity, ea.a.p("R2gic1cw", "4dpbnEb0"));
                k.f17927a.getClass();
                k.b(readerImg2PDFConvertActivity);
                ReaderPdfApplication.k().g(null);
                int i12 = CameraActivity.H0;
                CameraActivity.a.a(readerImg2PDFConvertActivity, ea.a.p("LG9fdhxydA==", "AUAcpyid"), ea.a.p("QGMqbh1lEDICZGY=", "fLyvv70s"), false, true);
                ImageConvertDataRepository.f26536a.getClass();
                ImageConvertDataRepository.f();
                return;
            case 3:
                f0 f0Var = (f0) obj;
                int i13 = f0.L;
                if (f0Var.isShowing() && (viewGroup = f0Var.f27560x) != null) {
                    f0Var.J = true;
                    viewGroup.animate().alpha(0.0f).setDuration(500L).setListener(new e0(f0Var)).start();
                    return;
                }
                return;
            case 4:
                oo.f fVar = (oo.f) obj;
                int i14 = oo.f.f23527m;
                kotlin.jvm.internal.g.e(fVar, ea.a.p("R2gic1cw", "MQIeWh0I"));
                if (fVar.f23535k == 1 && fVar.f23536l && fVar.isShowing() && !oo.f.x() && (u7 = fVar.u()) != null) {
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.f(u7);
                    return;
                }
                return;
            case 5:
                BottomSheetBehavior<View> bottomSheetBehavior = ((BaseBottomSheetView) obj).f28173z;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.E(3);
                    return;
                }
                return;
            case 6:
                BasePdfEditActivity basePdfEditActivity = (BasePdfEditActivity) obj;
                int i15 = BasePdfEditActivity.f28296v;
                kotlin.jvm.internal.g.e(basePdfEditActivity, ea.a.p("PGgjc1Iw", "ETHJvHMy"));
                if (com.google.android.play.core.assetpacks.c.W(basePdfEditActivity)) {
                    ((pdf.pdfreader.viewer.editor.free.ui.dialog.d) basePdfEditActivity.f28297t.getValue()).dismiss();
                    return;
                }
                return;
            case 7:
                BaseGuidePopView baseGuidePopView = (BaseGuidePopView) obj;
                int i16 = BaseGuidePopView.f28387t;
                kotlin.jvm.internal.g.e(baseGuidePopView, ea.a.p("O2hYc10w", "Kfl32oPK"));
                if (baseGuidePopView.isAttachedToWindow()) {
                    baseGuidePopView.r();
                    return;
                }
                return;
            default:
                ((sp.h) obj).g();
                return;
        }
    }
}
