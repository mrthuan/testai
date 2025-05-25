package androidx.activity;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.emoji2.text.m;
import com.facebook.HttpMethod;
import com.facebook.internal.a;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.inmobi.media.C1694k5;
import com.inmobi.media.C1866x7;
import com.inmobi.media.C1877y5;
import com.inmobi.media.M6;
import com.inmobi.media.Q7;
import com.inmobi.media.W9;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.scroll.PDFScrollHandle;
import mj.y;
import org.json.JSONArray;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.camera.camera.CameraHelper;
import pdf.pdfreader.viewer.editor.free.decrypt.ReaderDecryptAndCopyExecutor;
import pdf.pdfreader.viewer.editor.free.decrypt.ReaderEncryptionAndDecryptionHelper;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestJActivity;
import pdf.pdfreader.viewer.editor.free.feature.bridge.SplashLoadingFragment;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFCreatorActivity;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1812a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1813b;

    public /* synthetic */ k(Object obj, int i10) {
        this.f1812a = i10;
        this.f1813b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Locale locale;
        boolean z10 = true;
        switch (this.f1812a) {
            case 0:
                l.n((l) this.f1813b);
                return;
            case 1:
                ((Toolbar) this.f1813b).l();
                return;
            case 2:
                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) this.f1813b;
                int i10 = ContentLoadingProgressBar.c;
                contentLoadingProgressBar.getClass();
                System.currentTimeMillis();
                contentLoadingProgressBar.setVisibility(0);
                return;
            case 3:
                ((m.b) this.f1813b).c();
                return;
            case 4:
                String str2 = (String) this.f1813b;
                v5.b bVar = v5.b.f30651a;
                String str3 = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
                if (!k6.a.b(v5.b.class)) {
                    try {
                        Bundle bundle = new Bundle();
                        Context a10 = com.facebook.d.a();
                        com.facebook.internal.a aVar = com.facebook.internal.a.f9745f;
                        com.facebook.internal.a a11 = a.C0146a.a(a10);
                        JSONArray jSONArray = new JSONArray();
                        String str4 = Build.MODEL;
                        if (str4 == null) {
                            str4 = "";
                        }
                        jSONArray.put(str4);
                        if (a11 != null) {
                            str = a11.a();
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            jSONArray.put(a11.a());
                        } else {
                            jSONArray.put("");
                        }
                        jSONArray.put(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                        if (c6.f.c()) {
                            str3 = "1";
                        }
                        jSONArray.put(str3);
                        com.facebook.internal.p pVar = com.facebook.internal.p.f9815a;
                        try {
                            locale = com.facebook.d.a().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            kotlin.jvm.internal.g.d(locale, "getDefault()");
                        }
                        jSONArray.put(locale.getLanguage() + '_' + locale.getCountry());
                        String jSONArray2 = jSONArray.toString();
                        kotlin.jvm.internal.g.d(jSONArray2, "extInfoArray.toString()");
                        bundle.putString("device_session_id", v5.b.a());
                        bundle.putString("extinfo", jSONArray2);
                        String str5 = com.facebook.e.f9701j;
                        String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str2}, 1));
                        kotlin.jvm.internal.g.d(format, "format(locale, format, *args)");
                        JSONObject jSONObject = new com.facebook.e(null, format, bundle, HttpMethod.POST, null, 32).c().f9728b;
                        AtomicBoolean atomicBoolean = v5.b.f30656g;
                        if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                            z10 = false;
                        }
                        atomicBoolean.set(z10);
                        if (!atomicBoolean.get()) {
                            v5.b.f30654e = null;
                        } else {
                            v5.f fVar = v5.b.f30653d;
                            if (fVar != null) {
                                fVar.c();
                            }
                        }
                        v5.b.f30657h = false;
                        return;
                    } catch (Throwable th2) {
                        k6.a.a(v5.b.class, th2);
                        return;
                    }
                }
                return;
            case 5:
                int i11 = BottomAppBar.f12081v0;
                ((View) this.f1813b).requestLayout();
                return;
            case 6:
                com.google.android.material.search.e eVar = (com.google.android.material.search.e) this.f1813b;
                AnimatorSet c = eVar.c(true);
                c.addListener(new com.google.android.material.search.a(eVar));
                c.start();
                return;
            case 7:
                M6.b((M6) this.f1813b);
                return;
            case 8:
                Q7.a((Q7) this.f1813b);
                return;
            case 9:
                W9.a((W9) this.f1813b);
                return;
            case 10:
                C1694k5.c((C1694k5) this.f1813b);
                return;
            case 11:
                C1866x7.b((WeakReference) this.f1813b);
                return;
            case 12:
                C1877y5.a((C1877y5) this.f1813b);
                return;
            case 13:
                ((ye.c) this.f1813b).f32130b.f32134e.prefetchDefaultFontManager();
                return;
            case 14:
                dj.d dVar = (dj.d) this.f1813b;
                long a12 = ((xh.b) dVar.f16236f.getHighlight()).a();
                dVar.f16234d.getClass();
                dVar.a(a12);
                return;
            case 15:
                ((ReaderPDFCore) this.f1813b).lambda$doPageManagerStateCallback$1();
                return;
            case 16:
                ((PDFScrollHandle) this.f1813b).g();
                return;
            case 17:
                mj.g gVar = (mj.g) this.f1813b;
                gVar.c.post(new b7.g(gVar, 11));
                return;
            case 18:
                lib.zj.pdfeditor.text.editor.a aVar2 = lib.zj.pdfeditor.text.editor.a.this;
                aVar2.f21686e0.setEmpty();
                aVar2.f21688f0.setEmpty();
                ArrayList<RectF> arrayList = aVar2.V;
                arrayList.clear();
                int i12 = 0;
                while (true) {
                    ArrayList<RectF> arrayList2 = aVar2.C;
                    int size = arrayList2.size();
                    RectF rectF = aVar2.f21684d0;
                    RectF rectF2 = aVar2.f21682c0;
                    if (i12 < size) {
                        RectF rectF3 = arrayList2.get(i12);
                        if (rectF3.bottom >= rectF2.centerY() && rectF3.top <= rectF.centerY()) {
                            RectF rectF4 = aVar2.D.get(i12);
                            rectF4.set(rectF3);
                            arrayList.add(rectF4);
                        }
                        i12++;
                    } else {
                        if (!arrayList.isEmpty()) {
                            arrayList.get(0).left = rectF2.left;
                            arrayList.get(arrayList.size() - 1).right = rectF.right;
                        }
                        float o10 = aVar2.o();
                        aVar2.O(o10, rectF2);
                        aVar2.N(o10, rectF);
                        aVar2.f21687f.invalidate();
                        return;
                    }
                }
                break;
            case 19:
                y yVar = (y) this.f1813b;
                yVar.c.f21697o = null;
                yVar.c.f21687f.invalidate();
                return;
            case 20:
                CameraHelper.f((CameraHelper) this.f1813b);
                return;
            case 21:
                ReaderDecryptAndCopyExecutor readerDecryptAndCopyExecutor = (ReaderDecryptAndCopyExecutor) this.f1813b;
                kotlin.jvm.internal.g.e(readerDecryptAndCopyExecutor, ea.a.p("R2gic1cw", "vDlhhU0A"));
                readerDecryptAndCopyExecutor.g();
                return;
            case 22:
                ((ReaderEncryptionAndDecryptionHelper) this.f1813b).R0();
                return;
            case 23:
                SubscriptionDarkTestJActivity subscriptionDarkTestJActivity = (SubscriptionDarkTestJActivity) this.f1813b;
                SubscriptionDarkTestJActivity.a aVar3 = SubscriptionDarkTestJActivity.f24905b0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestJActivity, ea.a.p("O2hYc10w", "erP6Ar2w"));
                if (!subscriptionDarkTestJActivity.isFinishing()) {
                    subscriptionDarkTestJActivity.C2().f1611b.setVisibility(0);
                    return;
                }
                return;
            case 24:
                SplashLoadingFragment splashLoadingFragment = (SplashLoadingFragment) this.f1813b;
                SplashLoadingFragment.a aVar4 = SplashLoadingFragment.f24959n0;
                kotlin.jvm.internal.g.e(splashLoadingFragment, ea.a.p("R2gic1cw", "z07w3u1y"));
                if (splashLoadingFragment.f24962e0) {
                    splashLoadingFragment.y0();
                    return;
                }
                return;
            case 25:
                pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f.a2((pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f) this.f1813b);
                return;
            case 26:
                PDFCreatorActivity pDFCreatorActivity = (PDFCreatorActivity) this.f1813b;
                int i13 = PDFCreatorActivity.G;
                kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("Rmg-cx0w", "Vg2W9Qux"));
                pDFCreatorActivity.E = System.currentTimeMillis();
                pDFCreatorActivity.D.sendEmptyMessageDelayed(OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD, 500L);
                ReaderPDFCore readerPDFCore = new ReaderPDFCore(pDFCreatorActivity);
                File H1 = jl.a.H1(pDFCreatorActivity.f25254u + ".pdf");
                int parseInt = Integer.parseInt(pDFCreatorActivity.a2().f1199u.getText().toString());
                boolean createPdfFile = readerPDFCore.createPdfFile(H1.getAbsolutePath(), pDFCreatorActivity.a2().f1186h.isSelected() ? 1 : 0, pDFCreatorActivity.f25255v.getW(), pDFCreatorActivity.f25255v.getH(), pDFCreatorActivity.f25256w.getR(), pDFCreatorActivity.f25256w.getG(), pDFCreatorActivity.f25256w.getB(), parseInt, pDFCreatorActivity.f25257x.getStyle());
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(pDFCreatorActivity)) {
                    ea.a.p("O2VccD9pW2U=", "QZsQZudr");
                    if (createPdfFile && H1.exists()) {
                        sn.d d10 = sn.d.d();
                        Context m10 = ReaderPdfApplication.m();
                        String p10 = ea.a.p("LHJUYQ1l", "O3ox8Mgz");
                        pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.o oVar = new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.o(pDFCreatorActivity, parseInt, H1);
                        d10.getClass();
                        sn.d.j(m10, H1, p10, oVar);
                        return;
                    }
                    pDFCreatorActivity.D.sendEmptyMessage(OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM);
                    try {
                        H1.delete();
                        return;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return;
                    }
                }
                return;
            case 27:
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) this.f1813b;
                PDFPageManagerActivity.a aVar5 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "2tLr3JeD"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(pDFPageManagerActivity) && !pDFPageManagerActivity.f25280s0) {
                    pDFPageManagerActivity.f25281t0 = System.currentTimeMillis();
                    pDFPageManagerActivity.o2().A.setVisibility(0);
                    pDFPageManagerActivity.o2().f1285y.setVisibility(8);
                    pDFPageManagerActivity.J2(false);
                    pDFPageManagerActivity.o2().A.c();
                    return;
                }
                return;
            case 28:
                PDF2WordHelper.Companion.a((Activity) this.f1813b);
                return;
            default:
                ReaderConvertPreviewActivity readerConvertPreviewActivity = (ReaderConvertPreviewActivity) this.f1813b;
                int i14 = ReaderConvertPreviewActivity.R1;
                kotlin.jvm.internal.g.e(readerConvertPreviewActivity, ea.a.p("R2gic1cw", "kpeOKzi5"));
                ImageView imageView = readerConvertPreviewActivity.A1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                ConstraintLayout constraintLayout = readerConvertPreviewActivity.F1;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
                if (!readerConvertPreviewActivity.f19294h) {
                    Window window = readerConvertPreviewActivity.getWindow();
                    kotlin.jvm.internal.g.d(window, ea.a.p("RGklZBx3", "mfIaXZCK"));
                    pdf.pdfreader.viewer.editor.free.utils.extension.i.g(window, 0, androidx.core.content.a.getColor(readerConvertPreviewActivity, R.color.pdf2imageProgressNavColor));
                    Window window2 = readerConvertPreviewActivity.getWindow();
                    kotlin.jvm.internal.g.d(window2, ea.a.p("RGklZBx3", "DtrDYNAa"));
                    pdf.pdfreader.viewer.editor.free.utils.extension.i.h(window2, false);
                    return;
                }
                return;
        }
    }
}
