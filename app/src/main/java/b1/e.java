package b1;

import am.v0;
import am.y0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.emoji2.text.g;
import androidx.emoji2.text.m;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.FlushReason;
import com.inmobi.media.AbstractRunnableC1690k1;
import com.inmobi.media.C1666i5;
import com.inmobi.media.C1694k5;
import com.inmobi.media.C1761p5;
import com.inmobi.media.C9;
import com.inmobi.media.Q7;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import lib.zj.pdfeditor.ReaderPDFCore;
import mj.b0;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.camera.widget.CameraView;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.data.RecentAddRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.ReaderDecryptAndCopyExecutor;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRSelectPDFPageActivity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget.PreviewCreateEditGuideView;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PreviewPageManageGuideView;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.TurnPageMode;
import pdf.pdfreader.viewer.editor.free.office.a0;
import pdf.pdfreader.viewer.editor.free.office.c0;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.thumb.ThumbLoadCenter;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderSelectImagePreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperateInterceptDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g2;
import pdf.pdfreader.viewer.editor.free.ui.frag.SplitPreviewFragment;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderRoundProgressBar;
import pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask;
import pdf.pdfreader.viewer.editor.free.utils.event.ConvertEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.g1;
import s0.l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5297a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5298b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f5297a = i10;
        this.f5298b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GridLayoutManager gridLayoutManager;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i10;
        pdf.pdfreader.viewer.editor.free.feature.scan.dialog.l lVar;
        byte b10;
        OperateInterceptDialog operateInterceptDialog;
        TextView textView;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        Context context = null;
        boolean z10 = true;
        int i11 = 0;
        switch (this.f5297a) {
            case 0:
                int i12 = ContentLoadingProgressBar.c;
                ((ContentLoadingProgressBar) this.f5298b).setVisibility(8);
                return;
            case 1:
                m.b bVar = (m.b) this.f5298b;
                synchronized (bVar.f3652d) {
                    if (bVar.f3656h != null) {
                        try {
                            t0.m d10 = bVar.d();
                            int i13 = d10.f29899e;
                            if (i13 == 2) {
                                synchronized (bVar.f3652d) {
                                }
                            }
                            if (i13 == 0) {
                                int i14 = s0.l.f29698a;
                                l.a.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                m.a aVar = bVar.c;
                                Context context2 = bVar.f3650a;
                                aVar.getClass();
                                Typeface b11 = o0.e.f22645a.b(context2, new t0.m[]{d10}, 0);
                                MappedByteBuffer e10 = o0.m.e(bVar.f3650a, d10.f29896a);
                                if (e10 != null && b11 != null) {
                                    try {
                                        l.a.a("EmojiCompat.MetadataRepo.create");
                                        androidx.emoji2.text.o oVar = new androidx.emoji2.text.o(b11, androidx.emoji2.text.n.a(e10));
                                        l.a.b();
                                        l.a.b();
                                        synchronized (bVar.f3652d) {
                                            g.h hVar = bVar.f3656h;
                                            if (hVar != null) {
                                                hVar.b(oVar);
                                            }
                                        }
                                        bVar.b();
                                        return;
                                    } catch (Throwable th2) {
                                        int i15 = s0.l.f29698a;
                                        l.a.b();
                                        throw th2;
                                    }
                                }
                                throw new RuntimeException("Unable to open file.");
                            }
                            throw new RuntimeException("fetchFonts result is not OK. (" + i13 + ")");
                        } catch (Throwable th3) {
                            synchronized (bVar.f3652d) {
                                g.h hVar2 = bVar.f3656h;
                                if (hVar2 != null) {
                                    hVar2.a(th3);
                                }
                                bVar.b();
                                return;
                            }
                        }
                    }
                    return;
                }
            case 2:
                FlushReason reason = (FlushReason) this.f5298b;
                String str = com.facebook.appevents.i.f9526a;
                if (!k6.a.b(com.facebook.appevents.i.class)) {
                    try {
                        kotlin.jvm.internal.g.e(reason, "$reason");
                        com.facebook.appevents.i.d(reason);
                        return;
                    } catch (Throwable th4) {
                        k6.a.a(com.facebook.appevents.i.class, th4);
                        return;
                    }
                }
                return;
            case 3:
                Object obj = com.google.firebase.installations.a.f13588m;
                ((com.google.firebase.installations.a) this.f5298b).c(false);
                return;
            case 4:
                C9.a((C9) this.f5298b);
                return;
            case 5:
                Q7.x((Q7) this.f5298b);
                return;
            case 6:
                C1666i5.e((C1666i5) this.f5298b);
                return;
            case 7:
                AbstractRunnableC1690k1.a((AbstractRunnableC1690k1) this.f5298b);
                return;
            case 8:
                C1694k5.z((C1694k5) this.f5298b);
                return;
            case 9:
                C1761p5.a((C1761p5) this.f5298b);
                return;
            case 10:
                dj.d dVar = (dj.d) this.f5298b;
                long a10 = ((xh.b) dVar.f16236f.getHighlight()).a();
                dVar.f16234d.getClass();
                dVar.a(a10);
                return;
            case 11:
                ((ReaderPDFCore) this.f5298b).lambda$release$2();
                return;
            case 12:
                b0 b0Var = ((mj.o) this.f5298b).f22124d.f21689g;
                if (b0Var != null) {
                    b0Var.d();
                    return;
                }
                return;
            case 13:
                CameraView cameraView = (CameraView) this.f5298b;
                kotlin.jvm.internal.g.e(cameraView, ea.a.p("R2gic1cw", "i0B5jBGJ"));
                ImageView imageView = cameraView.f24116g;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    return;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("VW8odQBWC2V3", "QXJz5Dyu"));
                    throw null;
                }
            case 14:
                cg.a aVar2 = (cg.a) this.f5298b;
                FileRepository fileRepository = FileRepository.f24155a;
                kotlin.jvm.internal.g.e(aVar2, ea.a.p("a2FSdBBvbg==", "fPVy1suZ"));
                aVar2.invoke();
                return;
            case 15:
                List list = (List) this.f5298b;
                FileRepository fileRepository2 = FileRepository.f24155a;
                kotlin.jvm.internal.g.e(list, ea.a.p("fnJScwJsLEwhc3Q=", "YuZ7wXgr"));
                RecentAddRepository.a(list);
                return;
            case 16:
                ReaderDecryptAndCopyExecutor readerDecryptAndCopyExecutor = (ReaderDecryptAndCopyExecutor) this.f5298b;
                kotlin.jvm.internal.g.e(readerDecryptAndCopyExecutor, ea.a.p("IGgGc0cw", "6RTocfHE"));
                if (readerDecryptAndCopyExecutor.f24230e.isEmpty()) {
                    readerDecryptAndCopyExecutor.f24228b.b(0, 100);
                    return;
                } else {
                    readerDecryptAndCopyExecutor.f24228b.b((int) ((readerDecryptAndCopyExecutor.f24232g / readerDecryptAndCopyExecutor.f24230e.size()) * 100), 100);
                    return;
                }
            case 17:
                OCRSelectPDFPageActivity oCRSelectPDFPageActivity = (OCRSelectPDFPageActivity) this.f5298b;
                OCRSelectPDFPageActivity.a aVar3 = OCRSelectPDFPageActivity.P;
                kotlin.jvm.internal.g.e(oCRSelectPDFPageActivity, ea.a.p("R2gic1cw", "L4G4P7SU"));
                RecyclerView.m layoutManager = oCRSelectPDFPageActivity.h2().f1056h.getLayoutManager();
                kotlin.jvm.internal.g.c(layoutManager, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuNW58bgZsDSBHeTtlU2EMZABvXWQRLiRlJ3lRbCNyNWk_d393GmQGZUcuDHIaZC5hC29BdCRhOGEjZXI=", "ZQsaYTW7"));
                View childAt = oCRSelectPDFPageActivity.h2().f1056h.getChildAt(0);
                int i16 = ((GridLayoutManager) layoutManager).F;
                if (childAt != null) {
                    int measuredHeight = childAt.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    } else {
                        marginLayoutParams = null;
                    }
                    if (marginLayoutParams != null) {
                        i10 = marginLayoutParams.topMargin;
                    } else {
                        i10 = 0;
                    }
                    int i17 = measuredHeight + i10;
                    ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    }
                    if (marginLayoutParams2 != null) {
                        i11 = marginLayoutParams2.bottomMargin;
                    }
                    i11 = (i17 + i11) * ((int) Math.ceil(gridLayoutManager.M() / i16));
                }
                if (i11 - oCRSelectPDFPageActivity.h2().f1056h.getMeasuredHeight() > oCRSelectPDFPageActivity.h2().f1056h.getHeight() * 2) {
                    oCRSelectPDFPageActivity.h2().f1056h.D0.A = true;
                    oCRSelectPDFPageActivity.h2().f1056h.D0.d();
                    return;
                }
                return;
            case 18:
                OCRPreviewFragment oCRPreviewFragment = (OCRPreviewFragment) this.f5298b;
                OCRPreviewFragment.a aVar4 = OCRPreviewFragment.f25168p0;
                kotlin.jvm.internal.g.e(oCRPreviewFragment, ea.a.p("R2gic1cw", "E59bEfHc"));
                VB vb2 = oCRPreviewFragment.Y;
                kotlin.jvm.internal.g.b(vb2);
                if (!((v0) vb2).f1547s.e() && oCRPreviewFragment.x0().getItemCount() > 0) {
                    VB vb3 = oCRPreviewFragment.Y;
                    kotlin.jvm.internal.g.b(vb3);
                    ((v0) vb3).f1547s.g();
                    return;
                }
                return;
            case 19:
                pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d dVar2 = (pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d) this.f5298b;
                d.a aVar5 = pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d.f25379j0;
                kotlin.jvm.internal.g.e(dVar2, ea.a.p("R2gic1cw", "0KDbHJgG"));
                if (dVar2.D() && !dVar2.A) {
                    VB vb4 = dVar2.Y;
                    kotlin.jvm.internal.g.b(vb4);
                    ((y0) vb4).c.post(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.b(dVar2, 1));
                    return;
                }
                return;
            case 20:
                PreviewCreateEditGuideView previewCreateEditGuideView = (PreviewCreateEditGuideView) this.f5298b;
                int i18 = PreviewCreateEditGuideView.f25425s;
                kotlin.jvm.internal.g.e(previewCreateEditGuideView, ea.a.p("R2gic1cw", "zh0bbJVz"));
                previewCreateEditGuideView.r();
                return;
            case 21:
                ReaderConvertPreviewActivity readerConvertPreviewActivity = (ReaderConvertPreviewActivity) this.f5298b;
                int i19 = ReaderConvertPreviewActivity.R1;
                kotlin.jvm.internal.g.e(readerConvertPreviewActivity, ea.a.p("O2hYc10w", "j843MZFo"));
                tn.a.d(readerConvertPreviewActivity, ea.a.p("LG9fdhxydA==", "rKbR8mmh"), ea.a.p("P3dSbxd2UnIuXyZvFGQBbmc=", "hAZDsT2A"), androidx.activity.f.m(readerConvertPreviewActivity.S2(), "_", ConvertEventCenter.f28654b), false);
                readerConvertPreviewActivity.Q1 = true;
                readerConvertPreviewActivity.M.post(new androidx.activity.k(readerConvertPreviewActivity, 29));
                PDF2WordHelper.Companion companion = PDF2WordHelper.f25574a;
                pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.c cVar = new pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.c(readerConvertPreviewActivity);
                companion.getClass();
                PDF2WordHelper.c = cVar;
                ReaderRoundProgressBar readerRoundProgressBar = readerConvertPreviewActivity.G1;
                if (readerRoundProgressBar != null) {
                    readerRoundProgressBar.setProgress(0);
                }
                PDF2WordHelper.Companion.e(readerConvertPreviewActivity, readerConvertPreviewActivity.f24505s0, readerConvertPreviewActivity.T);
                return;
            case 22:
                PreviewPageManageGuideView previewPageManageGuideView = (PreviewPageManageGuideView) this.f5298b;
                int i20 = PreviewPageManageGuideView.f25608s;
                kotlin.jvm.internal.g.e(previewPageManageGuideView, ea.a.p("O2hYc10w", "UdvOhjp1"));
                previewPageManageGuideView.r();
                return;
            case 23:
                c0 c0Var = (c0) this.f5298b;
                kotlin.jvm.internal.g.e(c0Var, ea.a.p("PGhbc0ow", "AWH2nyxQ"));
                System.currentTimeMillis();
                a0 a0Var = c0Var.f26078g;
                if (a0Var != null) {
                    a0Var.onStart();
                }
                c0Var.f26083l.set(System.currentTimeMillis());
                return;
            case 24:
                ReaderPreviewActivity.l1 l1Var = (ReaderPreviewActivity.l1) this.f5298b;
                ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
                ReaderPDFCore readerPDFCore = readerPreviewActivity.f26256t1;
                if (readerPDFCore != null) {
                    readerPDFCore.resetData();
                    if (readerPreviewActivity.f26256t1.hasChanges()) {
                        readerPreviewActivity.f26256t1.onDestroy();
                        try {
                            ReaderPDFCore readerPDFCore2 = new ReaderPDFCore(readerPreviewActivity, readerPreviewActivity.f26246r2);
                            if (readerPDFCore2.needsPassword() && !TextUtils.isEmpty(readerPreviewActivity.W)) {
                                readerPDFCore2.authenticatePassword(readerPreviewActivity.W);
                            }
                            readerPDFCore2.countPages();
                            readerPDFCore2.transportData(readerPreviewActivity.f26256t1);
                            readerPreviewActivity.q4(readerPDFCore2);
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                g1<ReaderPreviewActivity> g1Var = readerPreviewActivity.C;
                if (g1Var != null) {
                    g1Var.post(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.f(l1Var, 3));
                    return;
                }
                return;
            case 25:
                ThumbLoadCenter thumbLoadCenter = (ThumbLoadCenter) this.f5298b;
                tf.c<ThreadPoolExecutor> cVar2 = ThumbLoadCenter.f26575e;
                kotlin.jvm.internal.g.e(thumbLoadCenter, ea.a.p("O2hYc10w", "jolhoEZj"));
                thumbLoadCenter.d();
                return;
            case 26:
                OperatePDFWatcherActivity operatePDFWatcherActivity = (OperatePDFWatcherActivity) this.f5298b;
                String str2 = OperatePDFWatcherActivity.E;
                kotlin.jvm.internal.g.e(operatePDFWatcherActivity, ea.a.p("R2gic1cw", "2m56JMUW"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(operatePDFWatcherActivity)) {
                    pdf.pdfreader.viewer.editor.free.feature.scan.dialog.l lVar2 = operatePDFWatcherActivity.f27003v;
                    if (lVar2 == null || !lVar2.isShowing()) {
                        z10 = false;
                    }
                    if (z10 && (lVar = operatePDFWatcherActivity.f27003v) != null) {
                        lVar.dismiss();
                    }
                    ImageConvertDataRepository.f26536a.getClass();
                    ArrayList<ul.b> arrayList = ImageConvertDataRepository.f26540f;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ImageAdjustActivity.a aVar6 = ImageAdjustActivity.f25741u0;
                    String workflow = operatePDFWatcherActivity.f27001t;
                    TurnPageMode e22 = operatePDFWatcherActivity.e2();
                    aVar6.getClass();
                    kotlin.jvm.internal.g.e(workflow, "workflow");
                    Intent intent = new Intent(operatePDFWatcherActivity, ImageAdjustActivity.class);
                    intent.putExtra(ea.a.p("KXJebSZ3WHIxZiZvdw==", "W6NvJJQo"), workflow);
                    if (e22 != null) {
                        intent.putExtra(ea.a.p("OHU6bhx5PGU=", "CLLHHLRo"), e22.ordinal());
                    }
                    operatePDFWatcherActivity.startActivity(intent);
                    Iterator<Activity> it = ReaderPdfApplication.f23858j.iterator();
                    while (it.hasNext()) {
                        Activity next = it.next();
                        if ((next instanceof ReaderImg2PDFChooseActivity) || (next instanceof ReaderSelectImagePreviewActivity) || (next instanceof ReaderImgPreviewActivity) || (next instanceof CameraActivity)) {
                            next.finish();
                        }
                    }
                    return;
                }
                return;
            case 27:
                ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity = (ReaderImg2PDFConvertActivity) this.f5298b;
                ReaderImg2PDFConvertActivity.a aVar7 = ReaderImg2PDFConvertActivity.f27381i0;
                kotlin.jvm.internal.g.e(readerImg2PDFConvertActivity, ea.a.p("Omgqc2Aw", "nkNCDbE9"));
                readerImg2PDFConvertActivity.V = true;
                if (readerImg2PDFConvertActivity.n2().hasMessages(50150)) {
                    readerImg2PDFConvertActivity.n2().removeMessages(50150);
                }
                OperateInterceptDialog operateInterceptDialog2 = readerImg2PDFConvertActivity.f27388f0;
                if (operateInterceptDialog2 != null && operateInterceptDialog2.isShowing()) {
                    b10 = 1;
                } else {
                    b10 = 0;
                }
                if (b10 != 0 && (operateInterceptDialog = readerImg2PDFConvertActivity.f27388f0) != null) {
                    operateInterceptDialog.cancel();
                }
                readerImg2PDFConvertActivity.Z = true;
                ImageConvertDataRepository.f26536a.getClass();
                tf.c cVar3 = ImageConvertDataRepository.c;
                readerImg2PDFConvertActivity.f27383a0 = new ArrayList<>((List) cVar3.getValue());
                OperateExecuteTask o22 = readerImg2PDFConvertActivity.o2();
                String string = readerImg2PDFConvertActivity.getString(R.string.arg_res_0x7f1300d2);
                kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQGMqbhNlO3QSZBBzA2MsZUJzH3VbbCNfeyk=", "BbLIIwOv"));
                String d22 = readerImg2PDFConvertActivity.d2();
                List<? extends PdfPreviewEntity> entities = (List) cVar3.getValue();
                o22.getClass();
                kotlin.jvm.internal.g.e(entities, "entities");
                o22.Z = true;
                if (kotlin.jvm.internal.g.a(d22, ea.a.p("AmhScmU=", "ctq37uK4"))) {
                    o22.f28244v = ea.a.p("PGhQchxfXm1n", "2QQAGJhd");
                } else {
                    o22.f28244v = d22;
                }
                o22.f28241s = false;
                o22.f28242t = true;
                ReaderRoundProgressBar readerRoundProgressBar2 = o22.f28225b;
                if (readerRoundProgressBar2 != null) {
                    readerRoundProgressBar2.setProgress(100);
                }
                TextView textView2 = o22.f28224a;
                if (textView2 != null) {
                    textView2.setText(string);
                }
                TextView textView3 = o22.f28236n;
                if (textView3 != null) {
                    textView3.setText(string);
                }
                if (o22.f28245w == OperateExecuteTask.LayoutMode.Split) {
                    o22.j(entities);
                } else {
                    ViewGroup viewGroup = o22.f28230h;
                    if (viewGroup != null) {
                        context = viewGroup.getContext();
                    }
                    o22.i(context, entities);
                }
                MotionLayout motionLayout = o22.f28233k;
                if (motionLayout != null) {
                    motionLayout.post(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b(o22, 11));
                }
                o22.o();
                o22.m();
                ImageConvertDataRepository.f();
                gl.k.f17927a.getClass();
                gl.k.b(readerImg2PDFConvertActivity);
                return;
            case 28:
                g2 g2Var = (g2) this.f5298b;
                int i21 = g2.N;
                if (g2Var.isShowing() && (textView = g2Var.f27586v) != null) {
                    if (g2Var.J >= 90) {
                        textView.setText(g2Var.getContext().getString(R.string.arg_res_0x7f130385));
                        return;
                    } else {
                        textView.setText(g2Var.getContext().getString(R.string.arg_res_0x7f130363));
                        return;
                    }
                }
                return;
            default:
                SplitPreviewFragment splitPreviewFragment = (SplitPreviewFragment) this.f5298b;
                kotlin.jvm.internal.g.e(splitPreviewFragment, ea.a.p("O2hYc10w", "u6e2drFy"));
                splitPreviewFragment.f27985h0 = false;
                return;
        }
    }
}
