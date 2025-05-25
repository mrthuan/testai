package pdf.pdfreader.viewer.editor.free.ui.act.tools;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageLongPicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.dialog.ChooseCropTypeDialog;
import pdf.pdfreader.viewer.editor.free.feature.scan.dialog.l;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.CameraMode;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.TurnPageMode;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderSelectImagePreviewActivity;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import qb.f1;

/* compiled from: OperatePDFWatcherActivity.kt */
/* loaded from: classes3.dex */
public abstract class OperatePDFWatcherActivity extends jl.a {
    public static final String E = ea.a.p("KXJebSZ3WHIxZiZvdw==", "2zKQYyui");
    public static final String F;
    public static final String G;
    public boolean A;
    public long B;

    /* renamed from: u  reason: collision with root package name */
    public ChooseCropTypeDialog f27002u;

    /* renamed from: v  reason: collision with root package name */
    public l f27003v;

    /* renamed from: t  reason: collision with root package name */
    public String f27001t = "";

    /* renamed from: w  reason: collision with root package name */
    public final Handler f27004w = new Handler(Looper.getMainLooper());

    /* renamed from: x  reason: collision with root package name */
    public int f27005x = TurnPageMode.Default.ordinal();

    /* renamed from: y  reason: collision with root package name */
    public CameraMode f27006y = CameraMode.Scan;

    /* renamed from: z  reason: collision with root package name */
    public final c f27007z = new c(this, 0);
    public final pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c C = new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c(this, 9);
    public final b1.e D = new b1.e(this, 26);

    static {
        ea.a.p("WnMUcxpuBWwXX0dlBWU1dBttXWRl", "VjXLRx2a");
        F = ea.a.p("R3U5bid5EmU=", "JzIMfm0G");
        ea.a.p("JGVIXxBzaGM7bS9yFF8OaUdzGl8gbhFyI24hZQ==", "ni1NBBji");
        G = ea.a.p("P2FWZTRhWWE9ZXI=", "sdcNfjVD");
    }

    public final String a2() {
        if (!i2() && !kotlin.jvm.internal.g.a(ea.a.p("IGNy", "RMwmuumo"), this.f27001t)) {
            if (TextUtils.equals(ea.a.p("J2hQcmU=", "jsT1mH3d"), this.f27001t)) {
                return ea.a.p("QGgqchZfC21n", "w2HnB1a0");
            }
            if (TextUtils.equals(G, this.f27001t)) {
                return ea.a.p("Im5WcBhnZQ==", "FxDYiUtU");
            }
            return ea.a.p("Jm1n", "f1xCLJNs");
        }
        return ea.a.p("PGNQbhdlcg==", "Ysu2uU6d");
    }

    public final String b2() {
        if (kotlin.jvm.internal.g.a(G, this.f27001t)) {
            return ea.a.p("Xm4scBJnZQ==", "a2qzbN03");
        }
        if (!kotlin.jvm.internal.g.a(ea.a.p("PGNQbhdlRTIqZGY=", "Grwec6FL"), this.f27001t) && !kotlin.jvm.internal.g.a(ea.a.p("IGNy", "RCptYD3l"), this.f27001t)) {
            if (kotlin.jvm.internal.g.a(ea.a.p("P2RXRR1pQ0k0cy9ydA==", "zKyWVDZW"), this.f27001t)) {
                return ea.a.p("CmQjdA==", "h1oJjMH3");
            }
            return ea.a.p("Wm1n", "I9S6wUXY");
        } else if (this.f27006y.ordinal() == CameraMode.Ocr.ordinal()) {
            return ea.a.p("CmNy", "iqefbesh");
        } else {
            return ea.a.p("QGMqbg==", "l1amu3vh");
        }
    }

    public final String c2() {
        if (kotlin.jvm.internal.g.a(G, this.f27001t)) {
            return ea.a.p("KWE-ZQ==", "uBYYHfBD");
        }
        if (!kotlin.jvm.internal.g.a(ea.a.p("QGMqbh1lEDICZGY=", "RZyhk1Sa"), this.f27001t) && !kotlin.jvm.internal.g.a(ea.a.p("B2Ny", "YbhIqJEk"), this.f27001t)) {
            if (kotlin.jvm.internal.g.a(ea.a.p("AGQ3RTVpH0kmcwNydA==", "CupQQkHQ"), this.f27001t)) {
                return ea.a.p("VmQidA==", "5YUOWve5");
            }
            return ea.a.p("JG1n", "LAMH7Nxk");
        } else if (this.f27006y.ordinal() == CameraMode.Ocr.ordinal()) {
            return ea.a.p("IGNy", "fDEFwtOQ");
        } else {
            return ea.a.p("QGMqbg==", "6azUvdMT");
        }
    }

    public final String d2() {
        if (!i2() && !kotlin.jvm.internal.g.a(ea.a.p("XGNy", "QMvS3g1P"), this.f27001t)) {
            if (TextUtils.equals(ea.a.p("PGhQcmU=", "IsUFzX46"), this.f27001t)) {
                return ea.a.p("O2gIcmU=", "zAHiiJfg");
            }
            if (TextUtils.equals(G, this.f27001t)) {
                return ea.a.p("Im5WcBhnZQ==", "vxJbwbws");
            }
            return ea.a.p("D21n", "BqfGE4Aj");
        }
        return ea.a.p("QGMqbh1lcg==", "VL5KgGAi");
    }

    public final TurnPageMode e2() {
        int i10 = this.f27005x;
        if (i10 >= 0 && i10 < TurnPageMode.values().length) {
            return TurnPageMode.values()[this.f27005x];
        }
        return TurnPageMode.Default;
    }

    public final void f2(List<? extends ul.b> images) {
        int i10;
        kotlin.jvm.internal.g.e(images, "images");
        this.f27004w.postDelayed(this.C, 500L);
        ImageConvertDataRepository.f26536a.getClass();
        ArrayList arrayList = (ArrayList) ImageConvertDataRepository.f26552r.d();
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        w0.a().c.execute(new f1(images, this, i10, 5));
    }

    @Override // android.app.Activity
    public void finish() {
        if (h2()) {
            setResult(-1, new Intent());
            super.finish();
            return;
        }
        super.finish();
    }

    public final boolean g2() {
        if (TextUtils.isEmpty(this.f27001t)) {
            Intent intent = getIntent();
            String str = E;
            if (intent.hasExtra(str)) {
                String stringExtra = getIntent().getStringExtra(str);
                if (stringExtra == null) {
                    stringExtra = "";
                }
                this.f27001t = stringExtra;
            }
        }
        if ((TextUtils.equals(ea.a.p("J2Ny", "3NH7fQXQ"), this.f27001t) || TextUtils.equals(ea.a.p("PGNQbhdlRTIqZGY=", "cv1ewTyL"), this.f27001t)) && this.f27006y.ordinal() == CameraMode.Ocr.ordinal()) {
            return true;
        }
        return false;
    }

    public final boolean h2() {
        if (TextUtils.isEmpty(this.f27001t)) {
            Intent intent = getIntent();
            String str = E;
            if (intent.hasExtra(str)) {
                String stringExtra = getIntent().getStringExtra(str);
                if (stringExtra == null) {
                    stringExtra = "";
                }
                this.f27001t = stringExtra;
            }
        }
        return TextUtils.equals(G, this.f27001t);
    }

    public final boolean i2() {
        if (TextUtils.isEmpty(this.f27001t)) {
            Intent intent = getIntent();
            String str = E;
            if (intent.hasExtra(str)) {
                String stringExtra = getIntent().getStringExtra(str);
                if (stringExtra == null) {
                    stringExtra = "";
                }
                this.f27001t = stringExtra;
            }
        }
        if ((TextUtils.equals(ea.a.p("XGNy", "N8u1pOS3"), this.f27001t) || TextUtils.equals(ea.a.p("BGMbbgZlQTI4ZGY=", "7Wwzh3F1"), this.f27001t)) && this.f27006y.ordinal() == CameraMode.Scan.ordinal()) {
            return true;
        }
        return false;
    }

    public final void j2(CameraMode cameraMode) {
        kotlin.jvm.internal.g.e(cameraMode, "<set-?>");
        this.f27006y = cameraMode;
    }

    public final void k2(String str, int i10, final cg.l<? super Boolean, tf.d> lVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        String p10;
        ChooseCropTypeDialog chooseCropTypeDialog;
        String p11 = ea.a.p("QGUnZRB0PWkfYVNl", "H7S2pcCg");
        String p12 = ea.a.p("Jm1Bbwt0aGM2aSlr", "F1ElAZJz");
        String b22 = b2();
        boolean z13 = false;
        if (i10 == 1) {
            p10 = ea.a.p("EDE=", "fXlJLizb");
        } else {
            if (2 <= i10 && i10 < 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                p10 = ea.a.p("EDI=", "kGWBw2yX");
            } else {
                if (6 <= i10 && i10 < 11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    p10 = ea.a.p("bDM=", "8jn0xntp");
                } else {
                    if (11 <= i10 && i10 < 16) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        p10 = ea.a.p("bDQ=", "6AvCqGE0");
                    } else {
                        p10 = ea.a.p("bDU=", "K0N9OYxR");
                    }
                }
            }
        }
        tn.a.d(this, p11, p12, a0.a.j(b22, "_", str, p10), false);
        jn.a.c.getClass();
        if (jn.a.h() == 1) {
            lVar.invoke(Boolean.FALSE);
            return;
        }
        ChooseCropTypeDialog chooseCropTypeDialog2 = this.f27002u;
        if (chooseCropTypeDialog2 != null && chooseCropTypeDialog2.isShowing()) {
            z13 = true;
        }
        if (z13 && (chooseCropTypeDialog = this.f27002u) != null) {
            chooseCropTypeDialog.dismiss();
        }
        ChooseCropTypeDialog chooseCropTypeDialog3 = new ChooseCropTypeDialog(new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity$showChooseCropTypeDialog$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z14) {
                cg.l<Boolean, tf.d> lVar2;
                if (!z14 || (lVar2 = lVar) == null) {
                    return;
                }
                lVar2.invoke(Boolean.TRUE);
            }
        }, this, d2());
        this.f27002u = chooseCropTypeDialog3;
        chooseCropTypeDialog3.show();
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        String str = F;
        if (intent.hasExtra(str)) {
            this.f27005x = getIntent().getIntExtra(str, TurnPageMode.Default.ordinal());
        }
        Intent intent2 = getIntent();
        String str2 = E;
        if (intent2.hasExtra(str2)) {
            String stringExtra = getIntent().getStringExtra(str2);
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f27001t = stringExtra;
        }
        super.onCreate(bundle);
        if (bundle != null && ReaderPdfApplication.f23865q == -1 && ((this instanceof CameraActivity) || (this instanceof ImageAdjustActivity) || (this instanceof ReaderImg2PDFChooseActivity) || (this instanceof ReaderImg2PDFConvertActivity) || (this instanceof ReaderImgPreviewActivity) || (this instanceof ReaderSelectImagePreviewActivity) || (this instanceof Pdf2ImagePicPreviewActivity) || (this instanceof Pdf2ImageLongPicPreviewActivity) || (this instanceof Pdf2ImageBigPicPreviewActivity))) {
            ReaderPdfApplication.f23865q = Process.myPid();
            Intent intent3 = new Intent(this, ReaderHomeActivity.class);
            intent3.putExtra(ea.a.p("JGVIXxdlQF8zbj5lG3Q3ZFpfAG8xaAxuZw==", "ABn2TimO"), true);
            startActivity(intent3);
            finish();
            ImageConvertDataRepository.f26536a.getClass();
            ImageConvertDataRepository.f();
            this.A = true;
            return;
        }
        ReaderPdfApplication.k().f28148e.f(this.f27007z);
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public void onDestroy() {
        boolean z10;
        l lVar;
        ChooseCropTypeDialog chooseCropTypeDialog;
        ChooseCropTypeDialog chooseCropTypeDialog2 = this.f27002u;
        boolean z11 = true;
        if (chooseCropTypeDialog2 != null && chooseCropTypeDialog2.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (chooseCropTypeDialog = this.f27002u) != null) {
            chooseCropTypeDialog.dismiss();
        }
        l lVar2 = this.f27003v;
        if (lVar2 == null || !lVar2.isShowing()) {
            z11 = false;
        }
        if (z11 && (lVar = this.f27003v) != null) {
            lVar.dismiss();
        }
        Handler handler = this.f27004w;
        handler.removeCallbacks(this.C);
        handler.removeCallbacks(this.D);
        super.onDestroy();
        ReaderPdfApplication.k().f28148e.i(this.f27007z);
    }
}
