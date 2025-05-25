package lib.zj.office.system;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewpager2.widget.ViewPager2;
import java.io.File;
import java.lang.ref.WeakReference;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;
import pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21036a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f21037b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f21038d;

    public /* synthetic */ l(Object obj, int i10, Object obj2, int i11) {
        this.f21036a = i11;
        this.c = obj;
        this.f21037b = i10;
        this.f21038d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f21037b;
        int i11 = this.f21036a;
        Object obj = this.f21038d;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                p pVar = (p) obj2;
                androidx.privacysandbox.ads.adservices.topics.d dVar = pVar.f21061n;
                if (dVar != null) {
                    dVar.r(i10, obj);
                    return;
                } else if (i10 == 805306376) {
                    pVar.f21060m.postDelayed(new l(pVar, i10, obj, 0), 300L);
                    return;
                } else {
                    return;
                }
            case 1:
                BaseUserGuideTestFragment baseUserGuideTestFragment = (BaseUserGuideTestFragment) obj2;
                ViewPager2 viewPager2 = (ViewPager2) obj;
                BaseUserGuideTestFragment.a aVar = BaseUserGuideTestFragment.f24996h0;
                kotlin.jvm.internal.g.e(baseUserGuideTestFragment, ea.a.p("VXQZaThfFXVu", "N8qqKgP8"));
                kotlin.jvm.internal.g.e(viewPager2, ea.a.p("F3YiZQRQA2cXcg==", "VFSLshVJ"));
                baseUserGuideTestFragment.E0(i10, viewPager2, true);
                return;
            case 2:
                Context context = (Context) obj2;
                String str = (String) obj;
                pdf.pdfreader.viewer.editor.free.observer.a aVar2 = StorageFileObserver.f25899a;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "EEPhiZrS"));
                kotlin.jvm.internal.g.e(str, ea.a.p("F3AqdGg=", "qC8yZaDp"));
                PdfPreviewEntity d10 = bm.c.b(context).d(str);
                if (d10 != null) {
                    d10.setSize(new File(str).length());
                    if (i10 == 1) {
                        try {
                            ReaderPDFCore readerPDFCore = new ReaderPDFCore(context, str);
                            d10.setOtherBoolOne(readerPDFCore.needsPassword());
                            d10.setOtherIntOne(1);
                            readerPDFCore.onDestroy();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                    bm.c.b(context).i(d10);
                    pdf.pdfreader.viewer.editor.free.observer.a aVar3 = StorageFileObserver.f25899a;
                    ((Handler) StorageFileObserver.c.getValue()).post(new pdf.pdfreader.viewer.editor.free.data.a(d10, 1));
                    return;
                }
                return;
            case 3:
                OfficeReaderActivity officeReaderActivity = (OfficeReaderActivity) obj2;
                Throwable th2 = (Throwable) obj;
                String str2 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("R2gic1cw", "SzjKSRgq"));
                kotlin.jvm.internal.g.e(th2, ea.a.p("a2U=", "QwoMsp1T"));
                officeReaderActivity.J2(false, i10, false, "", 0, th2);
                return;
            case 4:
                WeakReference weakReference = (WeakReference) obj2;
                RecentAddedActivity recentAddedActivity = (RecentAddedActivity) obj;
                RecentAddedActivity.a aVar4 = RecentAddedActivity.f26850l0;
                kotlin.jvm.internal.g.e(weakReference, ea.a.p("F3cuYRhDDW4GZUx0", "bpnOSmJJ"));
                kotlin.jvm.internal.g.e(recentAddedActivity, ea.a.p("R2gic1cw", "bswY5zpE"));
                j1.e((Context) weakReference.get(), recentAddedActivity.getString(i10), true, null, -1);
                return;
            default:
                FrameLayout frameLayout = (FrameLayout) obj2;
                Group group = (Group) obj;
                SettingFragment.a aVar5 = SettingFragment.f27957u0;
                kotlin.jvm.internal.g.e(frameLayout, ea.a.p("a3RZZRRlY2lw", "hoipKxYB"));
                kotlin.jvm.internal.g.e(group, ea.a.p("cHQZZSNlHWk4RxRvQXA=", "jOTqNID4"));
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart(i10);
                    frameLayout.setLayoutParams(marginLayoutParams);
                    group.setVisibility(0);
                    return;
                }
                throw new NullPointerException(ea.a.p("WHVVbEljOW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiBCeUllSWE2ZDpvD2Qadj5lTy4EaSx3cXIbdQEuHGEwZ19udWEQby10GGEUYVlz", "Zo69iXWM"));
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, int i10, int i11) {
        this.f21036a = i11;
        this.c = obj;
        this.f21038d = obj2;
        this.f21037b = i10;
    }
}
