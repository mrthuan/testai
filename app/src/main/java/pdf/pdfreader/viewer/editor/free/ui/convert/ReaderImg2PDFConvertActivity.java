package pdf.pdfreader.viewer.editor.free.ui.convert;

import a6.h;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import cg.l;
import com.google.android.play.core.assetpacks.b1;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.lib.flutter.encrypt.EngineHelper;
import com.tom_roush.pdfbox.io.MemoryUsageSetting;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import gl.k;
import gl.m;
import java.io.File;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.g;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.FullScreenManage;
import pdf.pdfreader.viewer.editor.free.ads.anim.BannerLoadingAnimation;
import pdf.pdfreader.viewer.editor.free.ads.n;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.q;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.TranslucentImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.TurnPageMode;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;
import pdf.pdfreader.viewer.editor.free.ui.adapter.convert.ConfirmImageAdapter;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$mainHandler$2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.EnterFileNameDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperateInterceptDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.x;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderRoundProgressBar;
import pdf.pdfreader.viewer.editor.free.ui.vm.AppViewModel;
import pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.e1;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.extension.i;
import pdf.pdfreader.viewer.editor.free.utils.f0;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.k0;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.p;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import pdf.pdfreader.viewer.editor.free.utils.v;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import qb.j0;
import qo.j;

/* compiled from: ReaderImg2PDFConvertActivity.kt */
/* loaded from: classes3.dex */
public final class ReaderImg2PDFConvertActivity extends pdf.pdfreader.viewer.editor.free.ui.act.a implements ConfirmImageAdapter.b, wl.a, EnterFileNameDialog.a {

    /* renamed from: i0  reason: collision with root package name */
    public static final a f27381i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final String f27382j0;
    public View I;
    public RecyclerView J;
    public AppCompatTextView K;
    public LinearLayout L;
    public FrameLayout M;
    public TextView N;
    public boolean O;
    public boolean Q;
    public wl.e S;
    public boolean U;
    public boolean V;
    public EnterFileNameDialog W;
    public long X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public ArrayList<PdfPreviewEntity> f27383a0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f27385c0;

    /* renamed from: e0  reason: collision with root package name */
    public RenameDialog f27387e0;

    /* renamed from: f0  reason: collision with root package name */
    public OperateInterceptDialog f27388f0;

    /* renamed from: g0  reason: collision with root package name */
    public OperatePdfFailedDialog f27389g0;

    /* renamed from: h0  reason: collision with root package name */
    public x f27390h0;
    public final tf.c P = kotlin.a.a(new cg.a<ConfirmImageAdapter>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$galleryAdapter$2
        {
            super(0);
        }

        @Override // cg.a
        public final ConfirmImageAdapter invoke() {
            return new ConfirmImageAdapter(ReaderImg2PDFConvertActivity.this);
        }
    });
    public final tf.c R = kotlin.a.a(new cg.a<ReaderImg2PDFConvertActivity$mainHandler$2.a>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$mainHandler$2

        /* compiled from: ReaderImg2PDFConvertActivity.kt */
        /* loaded from: classes3.dex */
        public static final class a extends Handler {
            @Override // android.os.Handler
            public final void handleMessage(Message msg) {
                g.e(msg, "msg");
            }
        }

        @Override // cg.a
        public final a invoke() {
            return new a(Looper.getMainLooper());
        }
    });
    public final tf.c T = kotlin.a.a(new cg.a<OperateExecuteTask>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$operateTask$2
        @Override // cg.a
        public final OperateExecuteTask invoke() {
            return new OperateExecuteTask();
        }
    });

    /* renamed from: b0  reason: collision with root package name */
    public final b f27384b0 = new b();

    /* renamed from: d0  reason: collision with root package name */
    public final c f27386d0 = new c();

    /* compiled from: ReaderImg2PDFConvertActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: ReaderImg2PDFConvertActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements com.lib.flutter.encrypt.e {
        public b() {
        }

        @Override // com.lib.flutter.encrypt.e
        public final void a(String str) {
            ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity = ReaderImg2PDFConvertActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(readerImg2PDFConvertActivity)) {
                return;
            }
            if (BillingConfigImpl.c.w()) {
                String p10 = ea.a.p("R3IDbS51GSA9cwNyGCAka1FwcmkkYVFlRlA1RhJvLHZSchJCJm4aZTogFWhbdw==", "MY7fGtfn");
                int i10 = zk.a.f32399a;
                t1.b(p10);
                return;
            }
            k kVar = k.f17927a;
            ea.a.p("YWUqZBZyK20VMmREL0M5bjJlQHQHYzdpQWkeeXNzKm93", "7jSBbfLP");
            kVar.getClass();
            ea.a.p("em0qZxYyMkQ0Q1tuH2UkdAZhXG4jcg==", "JWRUSUMZ");
            tn.a.d(readerImg2PDFConvertActivity, ea.a.p("LG9fdhxyQ3A-ZhVhZA==", "4DTICZPZ"), ea.a.p("UG8ldhZyFnAWZmtiCG44ZTZfQWgpdw==", "i0AtRYuF"), ea.a.p("UG8ldhZydA==", "g8Na9JIv"), false);
            LinearLayout linearLayout = readerImg2PDFConvertActivity.L;
            if (linearLayout != null) {
                k.e(str, linearLayout);
            } else {
                g.i(ea.a.p("WmFObyd0O2QKbxJ0W20=", "KE67RznA"));
                throw null;
            }
        }

        @Override // com.lib.flutter.encrypt.e
        public final void b() {
            ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity = ReaderImg2PDFConvertActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(readerImg2PDFConvertActivity)) {
                return;
            }
            k kVar = k.f17927a;
            ea.a.p("YWUqZBZyK20VMmREL0M5bjJlQHQHYzdpHWlDeXlvNEhaZC5BF1INbwZDW24dYT9uIXI=", "k7YZVeS1");
            kVar.getClass();
            ea.a.p("em0qZxYyMkQ0Q1tuH2UkdAZhXG4jcg==", "JWRUSUMZ");
            LinearLayout linearLayout = readerImg2PDFConvertActivity.L;
            if (linearLayout != null) {
                if (linearLayout.getChildCount() > 0) {
                    LinearLayout linearLayout2 = readerImg2PDFConvertActivity.L;
                    if (linearLayout2 != null) {
                        View childAt = linearLayout2.getChildAt(0);
                        if (childAt != null && (childAt instanceof BannerLoadingAnimation)) {
                            LinearLayout linearLayout3 = readerImg2PDFConvertActivity.L;
                            if (linearLayout3 != null) {
                                linearLayout3.removeAllViews();
                                return;
                            } else {
                                g.i(ea.a.p("X2EybwZ0I2Qwb0B0Bm0=", "SPoyjcs2"));
                                throw null;
                            }
                        }
                        return;
                    }
                    g.i(ea.a.p("X2EybwZ0I2Qwb0B0Bm0=", "apm0jYTU"));
                    throw null;
                }
                return;
            }
            g.i(ea.a.p("WGE7bzl0DWQKbxJ0W20=", "qY4BLLAn"));
            throw null;
        }
    }

    /* compiled from: ReaderImg2PDFConvertActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements OperateExecuteTask.a {

        /* compiled from: ReaderImg2PDFConvertActivity.kt */
        /* loaded from: classes3.dex */
        public static final class a implements RenameDialog.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ReaderImg2PDFConvertActivity f27393a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PdfPreviewEntity f27394b;

            public a(ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity, PdfPreviewEntity pdfPreviewEntity) {
                this.f27393a = readerImg2PDFConvertActivity;
                this.f27394b = pdfPreviewEntity;
            }

            @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog.a
            public final void c(String fileName, boolean z10) {
                File file;
                boolean z11;
                boolean z12;
                String str;
                String str2;
                RenameDialog renameDialog;
                g.e(fileName, "fileName");
                PdfPreviewEntity pdfPreviewEntity = this.f27394b;
                File file2 = new File(pdfPreviewEntity.getPath());
                a aVar = ReaderImg2PDFConvertActivity.f27381i0;
                ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity = this.f27393a;
                Object[] L = v.L(readerImg2PDFConvertActivity, file2, fileName, readerImg2PDFConvertActivity.p2());
                Object obj = L[0];
                Context context = null;
                if (obj instanceof File) {
                    file = (File) obj;
                } else {
                    file = null;
                }
                boolean z13 = true;
                Object obj2 = L[1];
                g.c(obj2, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuCm5_bjpsCSBHeTtlU2sNdB5pWi4gbnQ=", "eROeTpt5"));
                if (1 == ((Integer) obj2).intValue() && file != null) {
                    RenameDialog renameDialog2 = readerImg2PDFConvertActivity.f27387e0;
                    if (renameDialog2 != null && renameDialog2.isShowing()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && (renameDialog = readerImg2PDFConvertActivity.f27387e0) != null) {
                        renameDialog.cancel();
                    }
                    String path = pdfPreviewEntity.getPath();
                    g.d(path, ea.a.p("P2RXRRd0XnQjLjphAWg=", "niztovJi"));
                    pdfPreviewEntity.setPath(file.getPath());
                    pdfPreviewEntity.setName(fileName);
                    pdfPreviewEntity.setDate(file.lastModified());
                    String preRenamePath = pdfPreviewEntity.getPreRenamePath();
                    if (preRenamePath != null && preRenamePath.length() != 0) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        pdfPreviewEntity.setPreRenamePath(path);
                    }
                    FileRepository.I(pdfPreviewEntity);
                    OperateExecuteTask o22 = readerImg2PDFConvertActivity.o2();
                    o22.getClass();
                    TextView textView = o22.Q;
                    if (textView != null) {
                        textView.setText(fileName);
                    }
                    v.I(readerImg2PDFConvertActivity, pdfPreviewEntity);
                    OperateExecuteTask o23 = readerImg2PDFConvertActivity.o2();
                    String str3 = o23.f28244v;
                    if (str3 != null && str3.length() != 0) {
                        z13 = false;
                    }
                    if (!z13) {
                        TextView textView2 = o23.f28236n;
                        if (textView2 != null) {
                            context = textView2.getContext();
                        }
                        String p10 = ea.a.p("FmkmaQpo", "wVpHyvuB");
                        String p11 = ea.a.p("KWlfaQpoaHI_bittEF8Mb1tl", "QnkXYz1G");
                        String g10 = o23.g();
                        if (z10) {
                            str = "WQ==";
                            str2 = "dbHjoLsA";
                        } else {
                            str = "Tg==";
                            str2 = "6bIiNtWy";
                        }
                        tn.a.d(context, p10, p11, androidx.activity.f.m(g10, "_", ea.a.p(str, str2)), false);
                    }
                    wk.b.b().e(new j(pdfPreviewEntity));
                    return;
                }
                RenameDialog renameDialog3 = readerImg2PDFConvertActivity.f27387e0;
                if (renameDialog3 != null) {
                    renameDialog3.A();
                }
            }
        }

        public c() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void a() {
            a aVar = ReaderImg2PDFConvertActivity.f27381i0;
            ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity = ReaderImg2PDFConvertActivity.this;
            readerImg2PDFConvertActivity.getClass();
            k.f17927a.getClass();
            k.b(readerImg2PDFConvertActivity);
            if (!readerImg2PDFConvertActivity.h2()) {
                Intent intent = new Intent(readerImg2PDFConvertActivity, ReaderHomeActivity.class);
                intent.putExtra(ea.a.p("WWUfXxtlMl8hbhJlWnQIZFdfImRm", "qt2fuE1Q"), true);
                readerImg2PDFConvertActivity.startActivity(intent);
            }
            readerImg2PDFConvertActivity.finish();
            ImageConvertDataRepository.f26536a.getClass();
            ImageConvertDataRepository.f();
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void b(PdfPreviewEntity pdfPreviewEntity) {
            String str;
            String str2;
            pdfPreviewEntity.setRecent(1);
            pdfPreviewEntity.setRecentDate(System.currentTimeMillis());
            FileRepository.I(pdfPreviewEntity);
            ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity = ReaderImg2PDFConvertActivity.this;
            bm.c.b(readerImg2PDFConvertActivity).i(pdfPreviewEntity);
            String name = pdfPreviewEntity.getName();
            long size = pdfPreviewEntity.getSize();
            pdfPreviewEntity.getPath();
            String t4 = v.t(readerImg2PDFConvertActivity, pdfPreviewEntity.getSize());
            t1.b("convert finished:------filename=" + name + "------size=" + size + "---" + t4 + "---");
            AppViewModel k10 = ReaderPdfApplication.k();
            ToolsType toolsType = ToolsType.EDIT_PDF;
            String path = pdfPreviewEntity.getPath();
            g.d(path, ea.a.p("Km5FaQ15GXA7dGg=", "L8wmjzpY"));
            k10.g(new nl.g(toolsType, path));
            String path2 = pdfPreviewEntity.getPath();
            if (TextUtils.equals(ea.a.p("OmgZcmU=", "IqIxwybh"), readerImg2PDFConvertActivity.f27001t)) {
                str = "dVIETSxUKkkgRA==";
                str2 = "v3FLt5XM";
            } else {
                str = "CVJ-TSZBe0w=";
                str2 = "VJKEJksT";
            }
            k0.c(readerImg2PDFConvertActivity, path2, pdfPreviewEntity, "", ea.a.p(str, str2));
            n.f23972a.a();
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void c() {
            ReaderImg2PDFConvertActivity.this.onBackPressed();
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void d() {
            ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity = ReaderImg2PDFConvertActivity.this;
            if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(readerImg2PDFConvertActivity)) {
                Window window = readerImg2PDFConvertActivity.getWindow();
                if (window != null) {
                    readerImg2PDFConvertActivity.getClass();
                    i.g(window, 0, readerImg2PDFConvertActivity.F1());
                }
                Window window2 = readerImg2PDFConvertActivity.getWindow();
                if (window2 != null) {
                    i.a(window2, !pdf.pdfreader.viewer.editor.free.utils.extension.c.h(readerImg2PDFConvertActivity));
                }
                Window window3 = readerImg2PDFConvertActivity.getWindow();
                if (window3 != null) {
                    i.j(window3, 1280);
                }
            }
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void e(PdfPreviewEntity pdfPreviewEntity) {
            boolean z10;
            Context context;
            ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity = ReaderImg2PDFConvertActivity.this;
            a aVar = new a(readerImg2PDFConvertActivity, pdfPreviewEntity);
            readerImg2PDFConvertActivity.getClass();
            if (readerImg2PDFConvertActivity.f27387e0 == null) {
                String path = pdfPreviewEntity.getPath();
                g.d(path, ea.a.p("Q2QtRR10C3QLLkRhHWg=", "lO2SXY0z"));
                readerImg2PDFConvertActivity.f27387e0 = new RenameDialog(readerImg2PDFConvertActivity, path);
            }
            RenameDialog renameDialog = readerImg2PDFConvertActivity.f27387e0;
            if (renameDialog != null) {
                String name = pdfPreviewEntity.getName();
                g.d(name, ea.a.p("Q2QtRR10C3QLLlphBGU=", "CTBN5Hzl"));
                String path2 = pdfPreviewEntity.getPath();
                g.d(path2, ea.a.p("P2RXRRd0XnQjLjphAWg=", "nePsIpBu"));
                renameDialog.B(name, path2);
            }
            readerImg2PDFConvertActivity.y1(readerImg2PDFConvertActivity);
            RenameDialog renameDialog2 = readerImg2PDFConvertActivity.f27387e0;
            if (renameDialog2 != null) {
                renameDialog2.f27479v = aVar;
            }
            readerImg2PDFConvertActivity.W1(renameDialog2);
            OperateExecuteTask o22 = readerImg2PDFConvertActivity.o2();
            String str = o22.f28244v;
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                TextView textView = o22.f28236n;
                if (textView != null) {
                    context = textView.getContext();
                } else {
                    context = null;
                }
                tn.a.d(context, ea.a.p("VWklaQBo", "l5lKbag8"), ea.a.p("M2k7aTBoKnItbgdtUV8kaFd3", "lHUUCupn"), o22.g(), false);
            }
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void f(PdfPreviewEntity pdfPreviewEntity) {
            e1.e(ReaderImg2PDFConvertActivity.this, pdfPreviewEntity);
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void g() {
            ReaderPdfApplication.k().g(new nl.g(ToolsType.EDIT_PDF, ea.a.p("BW8CY1hu", "hubQ9zfw")));
            n.f23972a.a();
            ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity = ReaderImg2PDFConvertActivity.this;
            readerImg2PDFConvertActivity.finish();
            readerImg2PDFConvertActivity.n2().post(new pdf.pdfreader.viewer.editor.free.ui.act.tools.j(readerImg2PDFConvertActivity, 2));
        }
    }

    static {
        ea.a.p("em0sMiNEJEMdbkJlG3QXYzBpRGkyeQ==", "oSIzkw2O");
        f27382j0 = ea.a.p("WGUyXwBoDXctYWQ=", "UnagWY7B");
        f27381i0 = new a();
    }

    @Override // jl.a
    public final void C1() {
        View findViewById = findViewById(R.id.rootView);
        g.d(findViewById, ea.a.p("FGkWZD5pK3cKeS9kHFJ5aVwuIG8mdGBpEXcp", "7XrxhNCu"));
        this.I = findViewById;
        View findViewById2 = findViewById(R.id.containerFl);
        g.d(findViewById2, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuDW8rdARpP2U2Ri0p", "Zvk2QDAv"));
        this.M = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(R.id.titleTv);
        g.d(findViewById3, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuGmkxbABUBik=", "Yy68pZlt"));
        this.N = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.layout_ad_bottom);
        g.d(findViewById4, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuXmE_bzZ0PmEeXxJvF3RcbSk=", "azpcl4yJ"));
        this.L = (LinearLayout) findViewById4;
        ((AppCompatImageView) findViewById(R.id.backImg)).setOnClickListener(new u4.j(this, 20));
        ((TextView) findViewById(R.id.addTv)).setOnClickListener(new d9.f(this, 19));
        ((AppCompatImageView) findViewById(R.id.tipsCloseIv)).setOnClickListener(new j0(this, 17));
        View findViewById5 = findViewById(R.id.motionLayout);
        g.d(findViewById5, ea.a.p("Pmk-ZBxpFncKeS9kHFJ5aVwuP289aVluOGEIbyR0KQ==", "TZXPJsFH"));
        MotionLayout motionLayout = (MotionLayout) findViewById5;
        View findViewById6 = findViewById(R.id.galleryRv);
        g.d(findViewById6, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuVWEqbCZyGlI0KQ==", "cBJ0jdB0"));
        this.J = (RecyclerView) findViewById6;
        View findViewById7 = findViewById(R.id.continueTv);
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById7;
        g.d(appCompatTextView, ea.a.p("JnQ=", "7IO2exps"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatTextView, new ReaderImg2PDFConvertActivity$findView$4$1(this));
        g.d(findViewById7, ea.a.p("CmkMZCJpMncKeS9kCEEncHtvP3AodGJlloDXKCVoK3NWOg1uN2w-YyMpbCAUIHcgGCByfQ==", "lslbtWqn"));
        this.K = (AppCompatTextView) findViewById7;
    }

    @Override // jl.a
    public final View D1() {
        View view = this.I;
        if (view != null) {
            return view;
        }
        g.i(ea.a.p("PW9edC9pUnc=", "Ju3tCCZw"));
        throw null;
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_r3_img_convert_pdf_confirm_gone;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.convert.ConfirmImageAdapter.b
    public final void G() {
        tn.a.b(this, ea.a.p("LG9fdhxydA==", "YCvx4ERs"), ea.a.p("UG8ldhZyFl8Bb0Z0Cmw5cyFfUWwvY2s=", "lSBd0bka"));
        h.j("WGUyXxptBTICZFJfBW84ZxtwQGU1cxx0L3A=", "FVgx0HJb", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), false);
        RecyclerView recyclerView = this.J;
        if (recyclerView != null) {
            int paddingStart = recyclerView.getPaddingStart();
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_6);
            RecyclerView recyclerView2 = this.J;
            if (recyclerView2 != null) {
                int paddingEnd = recyclerView2.getPaddingEnd();
                RecyclerView recyclerView3 = this.J;
                if (recyclerView3 != null) {
                    recyclerView.setPadding(paddingStart, dimensionPixelSize, paddingEnd, recyclerView3.getPaddingBottom());
                    return;
                } else {
                    g.i(ea.a.p("AmEobF1yEFJ2", "R9eD8iOZ"));
                    throw null;
                }
            }
            g.i(ea.a.p("KGFdbBxyTlJ2", "1xdzMRJR"));
            throw null;
        }
        g.i(ea.a.p("VGEnbBZyG1J2", "P2XNO8ca"));
        throw null;
    }

    @Override // jl.a
    public final void K1() {
        View findViewById = findViewById(R.id.view_status_bar);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.height = aj.b.B(this);
        findViewById.setLayoutParams(layoutParams);
        RecyclerView recyclerView = this.J;
        if (recyclerView != null) {
            pdf.pdfreader.viewer.editor.free.utils.c cVar = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
            if (pdf.pdfreader.viewer.editor.free.utils.c.f28559b.getBoolean(ea.a.p("WGUyXxptBTICZFJfBW84ZxtwQGU1cxx0OnA=", "SubXRPUf"), true)) {
                tn.a.b(this, ea.a.p("LG9fdhxydA==", "zxhlMApp"), ea.a.p("UG8ldhZyFl8Bb0Z0Cmw5cyFfQWgpdw==", "kfdy1j07"));
                RecyclerView recyclerView2 = this.J;
                if (recyclerView2 != null) {
                    int paddingStart = recyclerView2.getPaddingStart();
                    RecyclerView recyclerView3 = this.J;
                    if (recyclerView3 != null) {
                        int paddingEnd = recyclerView3.getPaddingEnd();
                        RecyclerView recyclerView4 = this.J;
                        if (recyclerView4 != null) {
                            recyclerView2.setPadding(paddingStart, 0, paddingEnd, recyclerView4.getPaddingBottom());
                        } else {
                            g.i(ea.a.p("FWFabCZyMVJ2", "uQr6CH3D"));
                            throw null;
                        }
                    } else {
                        g.i(ea.a.p("NWEIbBRyQVJ2", "1PRdq8bi"));
                        throw null;
                    }
                } else {
                    g.i(ea.a.p("VGEnbBZyG1J2", "JnVGsWj0"));
                    throw null;
                }
            }
            recyclerView.setLayoutManager(new GridLayoutManager(2));
            m2().f27137j = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$initView$1$1
                {
                    super(0);
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ tf.d invoke() {
                    invoke2();
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    AppCompatTextView appCompatTextView = ReaderImg2PDFConvertActivity.this.K;
                    if (appCompatTextView != null) {
                        appCompatTextView.setEnabled(true);
                    } else {
                        g.i(ea.a.p("UG8ldBpuF2Umdg==", "xCzWwl0G"));
                        throw null;
                    }
                }
            };
            r rVar = new r(new ep.b(m2(), 0));
            rVar.h(recyclerView);
            ConfirmImageAdapter m22 = m2();
            m22.getClass();
            m22.f27133f = rVar;
            recyclerView.setAdapter(m2());
            return;
        }
        g.i(ea.a.p("VGEnbBZyG1J2", "hKQetF5a"));
        throw null;
    }

    @Override // jl.a
    public final void L1() {
        t0.d0(b.b.x(this), null, null, new ReaderImg2PDFConvertActivity$initViewModel$1(this, null), 3);
        t0.d0(b.b.x(this), null, null, new ReaderImg2PDFConvertActivity$initViewModel$2(this, null), 3);
        t0.d0(b.b.x(this), null, null, new ReaderImg2PDFConvertActivity$initViewModel$3(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r3 != false) goto L17;
     */
    @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.convert.ConfirmImageAdapter.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U() {
        /*
            r7 = this;
            java.lang.String r0 = "UG8ldhZydA=="
            java.lang.String r1 = "A9yQSI17"
            java.lang.String r0 = ea.a.p(r0, r1)
            java.lang.String r1 = "UG8ldhZyFl8WZVhlHWUJYyhpUWs="
            java.lang.String r2 = "xQpjoSmX"
            java.lang.String r1 = ea.a.p(r1, r2)
            tn.a.b(r7, r0, r1)
            androidx.appcompat.widget.AppCompatTextView r0 = r7.K
            r1 = 0
            java.lang.String r2 = "LG9fdBBuQmUOdg=="
            if (r0 == 0) goto Le6
            pdf.pdfreader.viewer.editor.free.ui.adapter.convert.ConfirmImageAdapter r3 = r7.m2()
            boolean r4 = r3.f27134g
            java.util.ArrayList<ul.b> r3 = r3.f27132e
            r5 = 1
            r6 = 0
            int r3 = r3.size()
            if (r4 == 0) goto L2f
            r4 = 2
            if (r3 <= r4) goto L33
            goto L31
        L2f:
            if (r3 <= r5) goto L33
        L31:
            r3 = r5
            goto L34
        L33:
            r3 = r6
        L34:
            if (r3 == 0) goto L5c
            pdf.pdfreader.viewer.editor.free.ui.adapter.convert.ConfirmImageAdapter r3 = r7.m2()
            java.util.List r3 = r3.h()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L44:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L58
            java.lang.Object r4 = r3.next()
            ul.b r4 = (ul.b) r4
            boolean r4 = r4.a()
            if (r4 != 0) goto L44
            r3 = r5
            goto L59
        L58:
            r3 = r6
        L59:
            if (r3 == 0) goto L5c
            goto L5d
        L5c:
            r5 = r6
        L5d:
            r0.setEnabled(r5)
            boolean r0 = r7.h2()
            java.lang.String r3 = ")"
            java.lang.String r4 = " ("
            if (r0 == 0) goto La7
            androidx.appcompat.widget.AppCompatTextView r0 = r7.K
            if (r0 == 0) goto L9d
            r1 = 2131952049(0x7f1301b1, float:1.954053E38)
            java.lang.String r1 = r7.getString(r1)
            pdf.pdfreader.viewer.editor.free.ui.adapter.convert.ConfirmImageAdapter r2 = r7.m2()
            int r2 = r2.getItemCount()
            pdf.pdfreader.viewer.editor.free.ui.adapter.convert.ConfirmImageAdapter r5 = r7.m2()
            int r5 = r5.f27135h
            int r2 = r2 - r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r4)
            r5.append(r2)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            r0.setText(r1)
            goto Ld9
        L9d:
            java.lang.String r0 = "Ek32mc3x"
            java.lang.String r0 = ea.a.p(r2, r0)
            kotlin.jvm.internal.g.i(r0)
            throw r1
        La7:
            androidx.appcompat.widget.AppCompatTextView r0 = r7.K
            if (r0 == 0) goto Lda
            r1 = 2131951822(0x7f1300ce, float:1.954007E38)
            java.lang.String r1 = r7.getString(r1)
            pdf.pdfreader.viewer.editor.free.ui.adapter.convert.ConfirmImageAdapter r2 = r7.m2()
            int r2 = r2.getItemCount()
            pdf.pdfreader.viewer.editor.free.ui.adapter.convert.ConfirmImageAdapter r5 = r7.m2()
            int r5 = r5.f27135h
            int r2 = r2 - r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r4)
            r5.append(r2)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            r0.setText(r1)
        Ld9:
            return
        Lda:
            java.lang.String r0 = "CG8fdDxuPGUcdg=="
            java.lang.String r2 = "s4kqUIjx"
            java.lang.String r0 = ea.a.p(r0, r2)
            kotlin.jvm.internal.g.i(r0)
            throw r1
        Le6:
            java.lang.String r0 = "ogyjRZIE"
            java.lang.String r0 = ea.a.p(r2, r0)
            kotlin.jvm.internal.g.i(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity.U():void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.convert.ConfirmImageAdapter.b
    public final void Y() {
        tn.a.d(this, ea.a.p("Em9cdjJydA==", "36q2WHbv"), ea.a.p("UG8ldhZyFl8TZFBfCmw_Y2s=", "Yg6AGadT"), ea.a.p("P2FWZXM=", "L4MZT3lz"), false);
        l2(ea.a.p("Q2EsZQ==", "4araOy4l"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.convert.ConfirmImageAdapter.b
    public final void b(int i10) {
        tn.a.d(this, ea.a.p("AG8_dhFydA==", "n9cQtZNo"), ea.a.p("LG9fdhxyQ18qYS1lKmMEaVZr", "Bsrl3kCl"), d2(), false);
        ImageConvertDataRepository.f26536a.getClass();
        ImageConvertDataRepository.f26551q.j((ArrayList) m2().h());
        ImageConvertDataRepository.g();
        int i11 = TranslucentImageAdjustActivity.f25786v0;
        String workflow = this.f27001t;
        TurnPageMode turnPageMode = TurnPageMode.ConvertItemClick;
        g.e(workflow, "workflow");
        Intent intent = new Intent(this, TranslucentImageAdjustActivity.class);
        intent.putExtra(ea.a.p("VXIkbSx3DXIZZlhvdw==", "S6zrOI4X"), workflow);
        intent.putExtra(ea.a.p("ImUvZVJ0L24sZXg=", "wqQC1fj1"), i10);
        if (turnPageMode != null) {
            intent.putExtra(ea.a.p("O3VDbi15R2U=", "4Pbh3eQF"), turnPageMode.ordinal());
        }
        startActivity(intent);
        overridePendingTransition(R.anim.activity_slide_in_bottom, 0);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.EnterFileNameDialog.a
    public final void c(String fileName, boolean z10) {
        String p10;
        String p11;
        g.e(fileName, "fileName");
        String p12 = ea.a.p("UG8ldhZydA==", "KwMm07xu");
        String p13 = ea.a.p("UG8mdiByHV86ZQhhWWU4a2djPmkqaw==", "vN3HEiBi");
        String d22 = d2();
        if (m2().f27140m) {
            p10 = ea.a.p("WQ==", "E9A5ZIpN");
        } else {
            p10 = ea.a.p("Tg==", "fsnA70Pp");
        }
        if (z10) {
            p11 = ea.a.p("WQ==", "bHHPA1Ss");
        } else {
            p11 = ea.a.p("Tg==", "TXivjt7U");
        }
        tn.a.d(this, p12, p13, d22 + "_" + p10 + "_" + p11, false);
        u2(2, fileName);
    }

    @Override // wl.a
    public final void i1(int i10, String str) {
        File file = new File(str);
        if (file.exists()) {
            String A0 = bg.b.A0(file);
            Locale locale = Locale.getDefault();
            String f10 = h.f("KGVFRBxmVnU2dGIp", "3IcLu2eO", locale, A0, locale);
            g.d(f10, ea.a.p("PGgOc1hhMSAiYRBhGmw2bl8uAXQ7aVhnXS4Fbx1vNWU6QwZzHSgubythCmUp", "OCHgxBJn"));
            if (g.a(f10, ea.a.p("P2Rm", "OgCL6jU8"))) {
                b1.Y();
                if (g.a(this.f27001t, ea.a.p("QGMqbh1lEDICZGY=", "5rcm1Q8w"))) {
                    tn.a.a(ReaderPdfApplication.m(), ea.a.p("C28oZSVzAGEmXwJvWmU=", "IEhZzcF7"));
                } else {
                    tn.a.a(ReaderPdfApplication.m(), ea.a.p("IW86ZTppBWcXZAluZQ==", "xfBHehto"));
                }
                PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                pdfPreviewEntity.setDate(file.lastModified());
                pdfPreviewEntity.setPath(file.getAbsolutePath());
                pdfPreviewEntity.setSize(file.length());
                pdfPreviewEntity.setName(bg.b.B0(file));
                pdfPreviewEntity.setOtherStrOne(ea.a.p("M0RG", "WOc1A9XQ"));
                pdfPreviewEntity.setPage(i10);
                dp.a a10 = dp.a.a();
                a10.getClass();
                dp.a.c("convert finish file is: " + pdfPreviewEntity.getPath() + " size is : " + pdfPreviewEntity.getSize() + "----pageCount:" + i10);
                bm.c.b(this).f(ge.a.H(pdfPreviewEntity), new pdf.pdfreader.viewer.editor.free.ui.convert.c(str, this, i10));
                return;
            }
        }
        j1.e(this, getResources().getString(R.string.arg_res_0x7f130136), true, null, -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r0 == false) goto L13;
     */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v15, types: [T, java.lang.String] */
    @Override // wl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k1(java.lang.Throwable r7) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity.k1(java.lang.Throwable):void");
    }

    public final void l2(String str) {
        if (h2()) {
            ImageConvertDataRepository.f26536a.getClass();
            if (ImageConvertDataRepository.d()) {
                String string = getString(R.string.arg_res_0x7f130257);
                g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQG0keDpsWm0FdGtyIWEsaFRkJmdHdCk=", "ZTLV3l4D"));
                j1.e(this, string, false, null, p2());
                return;
            }
        }
        LinearLayout linearLayout = this.L;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            ReaderImg2PDFChooseActivity.a aVar = ReaderImg2PDFChooseActivity.M0;
            boolean z10 = this.Y;
            String str2 = this.f27001t;
            String p10 = ea.a.p("LG9fdhxydA==", "oYIBxrJv");
            TurnPageMode turnPageMode = TurnPageMode.AddPages;
            aVar.getClass();
            ReaderImg2PDFChooseActivity.a.a(this, z10, str, str2, true, p10, null, turnPageMode);
            return;
        }
        g.i(ea.a.p("I2FIbwx0dmQYbz50Gm0=", "ofWMXMlD"));
        throw null;
    }

    public final ConfirmImageAdapter m2() {
        return (ConfirmImageAdapter) this.P.getValue();
    }

    public final ReaderImg2PDFConvertActivity$mainHandler$2.a n2() {
        return (ReaderImg2PDFConvertActivity$mainHandler$2.a) this.R.getValue();
    }

    public final OperateExecuteTask o2() {
        return (OperateExecuteTask) this.T.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (o2().f28242t) {
            o2().n();
            if (h2()) {
                q2();
            } else {
                n.f23972a.c(this, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$onBackPressed$1
                    {
                        super(0);
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ tf.d invoke() {
                        invoke2();
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity = ReaderImg2PDFConvertActivity.this;
                        ReaderImg2PDFConvertActivity.a aVar = ReaderImg2PDFConvertActivity.f27381i0;
                        readerImg2PDFConvertActivity.q2();
                    }
                }, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$onBackPressed$2
                    {
                        super(0);
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ tf.d invoke() {
                        invoke2();
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ReaderImg2PDFConvertActivity.this.f27385c0 = true;
                    }
                });
            }
        } else if (o2().f28241s) {
            w2(new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$onBackPressed$3
                {
                    super(0);
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ tf.d invoke() {
                    invoke2();
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    wl.e eVar;
                    ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity = ReaderImg2PDFConvertActivity.this;
                    ReaderImg2PDFConvertActivity.a aVar = ReaderImg2PDFConvertActivity.f27381i0;
                    if (readerImg2PDFConvertActivity.o2().f28241s && (eVar = ReaderImg2PDFConvertActivity.this.S) != null) {
                        eVar.f();
                    }
                    ReaderImg2PDFConvertActivity.this.o2().e();
                }
            });
        } else {
            ImageConvertDataRepository.f26536a.getClass();
            ImageConvertDataRepository.f26551q.j((ArrayList) m2().h());
            ImageConvertDataRepository.g();
            ImageConvertDataRepository.f26549o.j(null);
            ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
            String workflow = this.f27001t;
            TurnPageMode turnPageMode = TurnPageMode.Default;
            aVar.getClass();
            g.e(workflow, "workflow");
            Intent intent = new Intent(this, ImageAdjustActivity.class);
            intent.putExtra(ea.a.p("VXIkbSx3DXIZZlhvdw==", "TjnarX1x"), workflow);
            intent.putExtra(ea.a.p("QGUnZRB0K24WZXg=", "qceSXKOI"), 0);
            if (turnPageMode != null) {
                intent.putExtra(ea.a.p("R3U5bid5EmU=", "ku2sQS53"), turnPageMode.ordinal());
            }
            startActivity(intent);
            finish();
        }
    }

    public final void onClick(View view) {
        switch (view.getId()) {
            case R.id.addTv /* 2131361924 */:
                tn.a.d(this, ea.a.p("BG80dgxydA==", "pggZiKHe"), ea.a.p("BW8UdhByHF8pZAJfV2w-Y2s=", "DRfzuhqO"), ea.a.p("LmRk", "uod4LOQg"), false);
                l2(ea.a.p("G2Rk", "JHzGJWIq"));
                return;
            case R.id.backImg /* 2131362082 */:
                onBackPressed();
                return;
            case R.id.continueTv /* 2131362333 */:
                if (h2()) {
                    float f10 = 1000;
                    if (!z1(v.w((ArrayList) m2().h()) * f10 * f10)) {
                        return;
                    }
                    w<ArrayList<bn.a>> wVar = an.a.f1699a;
                    an.a.f1702e = m2().h();
                    ImageConvertDataRepository.f26536a.getClass();
                    ImageConvertDataRepository.f();
                    finish();
                    return;
                } else if (!r2()) {
                    tn.a.d(this, ea.a.p("UG8ldhZydA==", "3ZX5TnAU"), ea.a.p("MW8JdiRyJV8uYQ9sUWQIc1Bvdw==", "JrRgAQT7"), ea.a.p("PHBQY2U=", "vmVFmrux"), false);
                    v2();
                    return;
                } else {
                    tn.a.b(this, ea.a.p("VW8rdjJydA==", "h36EWWgH"), ea.a.p("LG9fdhxyQ185bCNjaw==", "wjjpucQ8"));
                    final String format = new SimpleDateFormat(ea.a.p("EHlIeQBNemQ-XwJIGG0=", "6fw6LiEA"), a0.d(this)).format(Long.valueOf(System.currentTimeMillis()));
                    if (this.Y) {
                        String h10 = a0.a.h("PDFReader", format);
                        sn.d d10 = sn.d.d();
                        String c10 = h.c(h10, ".pdf");
                        String p10 = ea.a.p("LG9fdhxydA==", "kIlC4dcF");
                        d10.getClass();
                        boolean a10 = sn.d.a(c10, p10);
                        String str = h10;
                        int i10 = 1;
                        while (a10) {
                            str = h10 + "(" + i10 + ")";
                            sn.d d11 = sn.d.d();
                            String c11 = h.c(str, ".pdf");
                            String p11 = ea.a.p("LG9fdhxydA==", "iPUfZKZI");
                            d11.getClass();
                            a10 = sn.d.a(c11, p11);
                            i10++;
                        }
                        c(str, false);
                        return;
                    }
                    EnterFileNameDialog enterFileNameDialog = new EnterFileNameDialog(this, this, false);
                    enterFileNameDialog.f27435u = new cg.a<String>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$showGiveNameDialog$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cg.a
                        public final String invoke() {
                            return a0.a.h("PDFReader", format);
                        }
                    };
                    ReaderImg2PDFConvertActivity$showGiveNameDialog$1$2 readerImg2PDFConvertActivity$showGiveNameDialog$1$2 = new l<String, Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$showGiveNameDialog$1$2
                        @Override // cg.l
                        public final Boolean invoke(String name) {
                            g.e(name, "name");
                            sn.d d12 = sn.d.d();
                            String concat = name.concat(".pdf");
                            String p12 = ea.a.p("CW8_di1ydA==", "JOjQHOoO");
                            d12.getClass();
                            return Boolean.valueOf(sn.d.a(concat, p12));
                        }
                    };
                    g.e(readerImg2PDFConvertActivity$showGiveNameDialog$1$2, "<set-?>");
                    enterFileNameDialog.f27436v = readerImg2PDFConvertActivity$showGiveNameDialog$1$2;
                    enterFileNameDialog.setOnDismissListener(new pdf.pdfreader.viewer.editor.free.ui.convert.b());
                    this.W = enterFileNameDialog;
                    enterFileNameDialog.show();
                    tn.a.d(this, ea.a.p("UG8ldhZydA==", "kHUaVq9T"), ea.a.p("DG8NdiRyNl86ZQhhWWUIc1Bvdw==", "9AocABeW"), d2(), false);
                    return;
                }
            case R.id.tipsCloseIv /* 2131364206 */:
                pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putBoolean(ea.a.p("WGUyXxptBTICZFJfBW84ZxtwQGU1cxx0L3A=", "FVgx0HJb"), false).apply();
                ((MotionLayout) findViewById(R.id.motionLayout)).H();
                return;
            default:
                return;
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.a, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        boolean z11;
        ArrayList<PdfPreviewEntity> arrayList;
        int i10;
        char c10;
        char c11;
        ArrayList<PdfPreviewEntity> arrayList2;
        if (bundle != null) {
            this.Z = bundle.getBoolean(ea.a.p("JnNiaBZ3ZWUpdSZ0JWEPZQ==", "UI2FBYcw"), false);
            Serializable serializable = bundle.getSerializable(ea.a.p("YWU4dR90LmkBdA==", "oXfuaMAy"));
            if (serializable instanceof ArrayList) {
                arrayList2 = (ArrayList) serializable;
            } else {
                arrayList2 = null;
            }
            this.f27383a0 = arrayList2;
        }
        super.onCreate(bundle);
        try {
            String substring = lc.a.b(this).substring(2230, 2261);
            g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = kotlin.text.a.f19966b;
            byte[] bytes = substring.getBytes(charset);
            g.d(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = "d7ac7dc305b855b9b1502a6add5da2e".getBytes(charset);
            g.d(bytes2, "this as java.lang.String).getBytes(charset)");
            long j10 = 2;
            if (System.currentTimeMillis() % j10 == 0) {
                int nextInt = lc.a.f20546a.nextInt(0, bytes.length / 2);
                int i11 = 0;
                while (true) {
                    if (i11 <= nextInt) {
                        if (bytes[i11] != bytes2[i11]) {
                            c11 = 16;
                            break;
                        }
                        i11++;
                    } else {
                        c11 = 0;
                        break;
                    }
                }
                if ((c11 ^ 0) != 0) {
                    lc.a.a();
                    throw null;
                }
            } else if (!Arrays.equals(bytes2, bytes)) {
                lc.a.a();
                throw null;
            }
            try {
                String substring2 = nd.a.b(this).substring(ShapeTypes.FLOW_CHART_MULTIDOCUMENT, ShapeTypes.ACTION_BUTTON_RETURN);
                g.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset2 = kotlin.text.a.f19966b;
                byte[] bytes3 = substring2.getBytes(charset2);
                g.d(bytes3, "this as java.lang.String).getBytes(charset)");
                byte[] bytes4 = "110603550408130a43616c69666f726".getBytes(charset2);
                g.d(bytes4, "this as java.lang.String).getBytes(charset)");
                if (System.currentTimeMillis() % j10 == 0) {
                    int nextInt2 = nd.a.f22438a.nextInt(0, bytes3.length / 2);
                    int i12 = 0;
                    while (true) {
                        if (i12 <= nextInt2) {
                            if (bytes3[i12] != bytes4[i12]) {
                                c10 = 16;
                                break;
                            }
                            i12++;
                        } else {
                            c10 = 0;
                            break;
                        }
                    }
                    if ((c10 ^ 0) != 0) {
                        nd.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes4, bytes3)) {
                    nd.a.a();
                    throw null;
                }
                Intent intent = getIntent();
                if (intent != null) {
                    z10 = intent.getBooleanExtra(ea.a.p("HXMocg1tAmghcmQ=", "xHtnbVxZ"), false);
                } else {
                    z10 = false;
                }
                this.Y = z10;
                no.f.b(this).getClass();
                if (no.f.h(this)) {
                    if (TextUtils.equals(getIntent().getStringExtra(ea.a.p("Q2EsZSxmEG8fMg==", "adgrNaqv")), ea.a.p("Q2EsZSxsA24VdVVnDF81aCtvQWU=", "8h7cCSzk"))) {
                        String p10 = ea.a.p("XWU8Zh9vdw==", "RA5HOykF");
                        String p11 = ea.a.p("Q3IudhplFV8dbldyDGEiZRtmW3I1dA==", "6ZDeQC5j");
                        no.f.b(this).getClass();
                        tn.a.d(this, p10, p11, no.f.c().concat("_lang"), false);
                    } else if (TextUtils.equals(getIntent().getStringExtra(ea.a.p("Q2EsZSxmEG8fMg==", "rSGzJqFY")), ea.a.p("Q2EsZSxsA24VdVVnDF8kZSdhXmw=", "au4iLkJC"))) {
                        String p12 = ea.a.p("G2UOZgdvdw==", "i9uykHNx");
                        String p13 = ea.a.p("Q3IudhplFV8dbldyDGEiZRtmW3I1dA==", "zyRTNgm5");
                        no.f.b(this).getClass();
                        tn.a.d(this, p12, p13, no.f.c().concat("_noti"), false);
                    }
                }
                Intent intent2 = getIntent();
                if (intent2 != null && intent2.hasExtra(ea.a.p("X2ElZwZhBWUtclFjCGw6XypvRmkgaSBhJGkHbmZ0JWc=", "Ph9D5MqB"))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    ReaderPdfApplication.f();
                    pdf.pdfreader.viewer.editor.free.service.b.d();
                    if (bundle == null) {
                        EventCenter.sendLanguageRecallClickEvent(this, getIntent());
                        tn.a.a(ReaderPdfApplication.m(), ea.a.p("UG85ZSxpD2c=", "CxAK5288"));
                        if (ReaderPdfApplication.f23865q == -1) {
                            Y1();
                            this.A = true;
                            return;
                        }
                    }
                }
                if (this.Z && (arrayList = this.f27383a0) != null) {
                    FrameLayout frameLayout = this.M;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(0);
                        FrameLayout frameLayout2 = this.M;
                        if (frameLayout2 != null) {
                            frameLayout2.removeAllViews();
                            if (g.a(this.f27001t, ea.a.p("QGMqbh1lEDICZGY=", "tZCC5LHq"))) {
                                i10 = 6;
                            } else {
                                i10 = 0;
                            }
                            OperateExecuteTask o22 = o2();
                            String d22 = d2();
                            FrameLayout frameLayout3 = this.M;
                            if (frameLayout3 != null) {
                                String string = getString(R.string.arg_res_0x7f1300d2);
                                g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQGMqbhNlN3QNZB5zLWMsZUJzH3VbbCNfeyk=", "PP6JEhAX"));
                                o22.q(i10, d22, frameLayout3, string, arrayList, false, this.f27386d0);
                            } else {
                                g.i(ea.a.p("UG8ldBJpDGUARmw=", "k1pyh50O"));
                                throw null;
                            }
                        } else {
                            g.i(ea.a.p("UG8ldBJpDGUARmw=", "5xkxm8FZ"));
                            throw null;
                        }
                    } else {
                        g.i(ea.a.p("UG8ldBJpDGUARmw=", "yCku657Y"));
                        throw null;
                    }
                }
                tn.a.d(this, ea.a.p("UG8ldhZydA==", "p4SA6eDm"), ea.a.p("LG9fdhxyQ18paCV3", "IgUTRowk"), d2(), false);
                if (i2()) {
                    AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
                    AppCoreFilterEvent.h(ea.a.p("J2MobgVwMWMnbhBlcg==", "ZjTI7nGy"));
                } else if (TextUtils.equals(ea.a.p("Jm1WMglkZg==", "PgDxLQKt"), this.f27001t) || TextUtils.equals(ea.a.p("PGhQcmU=", "l4QttLmP"), this.f27001t)) {
                    AppOpenSource appOpenSource2 = AppCoreFilterEvent.f28650a;
                    AppCoreFilterEvent.h(ea.a.p("Jm1WMglfVG80di9y", "A61ZNYUw"));
                }
                EngineHelper engineHelper = EngineHelper.f15726a;
                String p14 = ea.a.p("X20pZy4yBEQOQwluQmUldHphPG4scnd8HW0QZzQyEkRwQyduPWUmdAphCG5RckI=", "iE6HKTDR");
                engineHelper.getClass();
                EngineHelper.h(p14, this.f27384b0);
                if (!this.A) {
                    k kVar = k.f17927a;
                    ea.a.p("GWVWZC9yem0vMjZEckM4bk5lIHQIY0JpAmkFeXFvLEM5ZVZ0LyBfbylk", "vWK7J3u1");
                    kVar.getClass();
                    ea.a.p("em0qZxYyMkQ0Q1tuH2UkdAZhXG4jcg==", "JWRUSUMZ");
                    LinearLayout linearLayout = this.L;
                    if (linearLayout != null) {
                        k.d(this, linearLayout);
                    } else {
                        g.i(ea.a.p("X2EybwZ0I2Qwb0B0Bm0=", "8xqwGcSs"));
                        throw null;
                    }
                }
                if (!h2()) {
                    if (BillingConfigImpl.c.w()) {
                        String p15 = ea.a.p("Q3IubRp1DyAHc1FyRSAlay1wEmMpbjVlR3QxdShsdGQTbCRhZA==", "5wD5BpdX");
                        int i13 = zk.a.f32399a;
                        t1.b(p15);
                        return;
                    }
                    n.f23972a.b(this);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                nd.a.a();
                throw null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            lc.a.a();
            throw null;
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        RenameDialog renameDialog;
        x xVar;
        OperatePdfFailedDialog operatePdfFailedDialog;
        OperateInterceptDialog operateInterceptDialog;
        EnterFileNameDialog enterFileNameDialog;
        n.f23972a.a();
        o2().k();
        EnterFileNameDialog enterFileNameDialog2 = this.W;
        boolean z14 = true;
        if (enterFileNameDialog2 != null && enterFileNameDialog2.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (enterFileNameDialog = this.W) != null) {
            enterFileNameDialog.dismiss();
        }
        OperateInterceptDialog operateInterceptDialog2 = this.f27388f0;
        if (operateInterceptDialog2 != null && operateInterceptDialog2.isShowing()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && (operateInterceptDialog = this.f27388f0) != null) {
            operateInterceptDialog.dismiss();
        }
        OperatePdfFailedDialog operatePdfFailedDialog2 = this.f27389g0;
        if (operatePdfFailedDialog2 != null && operatePdfFailedDialog2.isShowing()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && (operatePdfFailedDialog = this.f27389g0) != null) {
            operatePdfFailedDialog.dismiss();
        }
        x xVar2 = this.f27390h0;
        if (xVar2 != null && xVar2.isShowing()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 && (xVar = this.f27390h0) != null) {
            xVar.dismiss();
        }
        RenameDialog renameDialog2 = this.f27387e0;
        if (renameDialog2 == null || !renameDialog2.isShowing()) {
            z14 = false;
        }
        if (z14 && (renameDialog = this.f27387e0) != null) {
            renameDialog.dismiss();
        }
        if (n2().hasMessages(50150)) {
            n2().removeMessages(50150);
        }
        super.onDestroy();
        wl.e eVar = this.S;
        if (eVar != null) {
            eVar.f();
            eVar.f31369f = null;
        }
        OperatePdfFailedDialog operatePdfFailedDialog3 = this.f27389g0;
        if (operatePdfFailedDialog3 != null) {
            operatePdfFailedDialog3.cancel();
        }
        OperateInterceptDialog operateInterceptDialog3 = this.f27388f0;
        if (operateInterceptDialog3 != null) {
            operateInterceptDialog3.cancel();
        }
        k kVar = k.f17927a;
        ea.a.p("YWUqZBZyK20VMmREL0M5bjJlQHQHYzdpJWkDeVJvWERWcz9yHHlCchdtW3YMIDppN3RXbiNy", "Swr6t85V");
        kVar.getClass();
        ea.a.p("em0qZxYyMkQ0Q1tuH2UkdAZhXG4jcg==", "JWRUSUMZ");
        EngineHelper.f15726a.getClass();
        EngineHelper.e(this.f27384b0);
        FullScreenManage.g(4);
    }

    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (o2().f28241s && i10 == 4) {
            boolean z10 = false;
            if (keyEvent != null && keyEvent.getAction() == 1) {
                z10 = true;
            }
            if (z10) {
                w2(new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$onKeyDown$1
                    {
                        super(0);
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ tf.d invoke() {
                        invoke2();
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity = ReaderImg2PDFConvertActivity.this;
                        ReaderImg2PDFConvertActivity.a aVar = ReaderImg2PDFConvertActivity.f27381i0;
                        boolean z11 = readerImg2PDFConvertActivity.o2().f28241s;
                        wl.e eVar = ReaderImg2PDFConvertActivity.this.S;
                        if (eVar != null) {
                            eVar.f();
                        }
                        ReaderImg2PDFConvertActivity.this.u2(1, "");
                    }
                });
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        tn.a.d(this, ea.a.p("LG9fdhxydA==", "olFzFUp6"), ea.a.p("UG8ldhZyFl8BaFt3", "2jO7QSnt"), d2(), false);
        pdf.pdfreader.viewer.editor.free.utils.c cVar = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
        if (pdf.pdfreader.viewer.editor.free.utils.c.f28559b.getBoolean(ea.a.p("WGUyXxptBTICZFJfBW84ZxtwQGU1cxx0OnA=", "SubXRPUf"), true)) {
            tn.a.b(this, ea.a.p("Cm8mdgZydA==", "wQiHcARB"), ea.a.p("UG8ldhZyFl8Bb0Z0Cmw5cyFfQWgpdw==", "e1OPSHNs"));
        }
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        this.O = true;
        super.onPause();
        k.f17927a.getClass();
        gl.l.f17929o.l();
        m.f17930o.l();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        boolean z10;
        boolean z11 = false;
        this.O = false;
        super.onResume();
        if (this.f27385c0) {
            q2();
            this.f27385c0 = false;
            return;
        }
        o2().l();
        k kVar = k.f17927a;
        LinearLayout linearLayout = this.L;
        if (linearLayout != null) {
            kVar.getClass();
            k.a(this, linearLayout, this.f27384b0);
            gl.l.f17929o.m();
            m.f17930o.m();
            if (!this.V && !this.Q) {
                this.Q = true;
            }
            if (this.U) {
                this.U = false;
                n2().post(new b1.e(this, 27));
                return;
            } else if (!o2().f28242t || !o2().f28241s) {
                ImageConvertDataRepository.f26536a.getClass();
                ArrayList arrayList = (ArrayList) ImageConvertDataRepository.f26550p.d();
                if (arrayList != null) {
                    ConfirmImageAdapter m22 = m2();
                    pdf.pdfreader.viewer.editor.free.utils.c cVar = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
                    boolean z12 = pdf.pdfreader.viewer.editor.free.utils.c.f28559b.getBoolean(ea.a.p("WGUyXxptBTICZFJfBW84ZxtwQGU1cxx0OnA=", "SubXRPUf"), true);
                    m22.getClass();
                    m22.f27134g = z12;
                    ArrayList<ul.b> arrayList2 = m22.f27132e;
                    arrayList2.clear();
                    m22.f27135h = 0;
                    if (z12) {
                        arrayList2.add(new ul.b());
                        m22.f27135h++;
                    }
                    arrayList2.addAll(arrayList);
                    arrayList2.add(new ul.b());
                    m22.f27135h++;
                    m22.notifyDataSetChanged();
                }
                AppCompatTextView appCompatTextView = this.K;
                if (appCompatTextView != null) {
                    ConfirmImageAdapter m23 = m2();
                    boolean z13 = m23.f27134g;
                    int size = m23.f27132e.size();
                    if (!z13 ? size > 1 : size > 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && m2().f27136i) {
                        z11 = true;
                    }
                    appCompatTextView.setEnabled(z11);
                    if (h2()) {
                        TextView textView = this.N;
                        if (textView != null) {
                            textView.setText(getText(R.string.arg_res_0x7f1301ae));
                            AppCompatTextView appCompatTextView2 = this.K;
                            if (appCompatTextView2 != null) {
                                appCompatTextView2.setText(getString(R.string.arg_res_0x7f1301b1) + " (" + (m2().getItemCount() - m2().f27135h) + ")");
                                return;
                            }
                            g.i(ea.a.p("Bm8rdFFuBWUcdg==", "eqeE8psV"));
                            throw null;
                        }
                        g.i(ea.a.p("O2lFbBxUdg==", "KLZ1JItp"));
                        throw null;
                    }
                    AppCompatTextView appCompatTextView3 = this.K;
                    if (appCompatTextView3 != null) {
                        appCompatTextView3.setText(getString(R.string.arg_res_0x7f1300ce) + " (" + (m2().getItemCount() - m2().f27135h) + ")");
                        return;
                    }
                    g.i(ea.a.p("Om9cdChuEmUcdg==", "ZiY2Ag7B"));
                    throw null;
                }
                g.i(ea.a.p("LG9fdBBuQmUOdg==", "kyG8GIUT"));
                throw null;
            } else {
                return;
            }
        }
        g.i(ea.a.p("I2FIbwx0dmQYbz50Gm0=", "eNFruWry"));
        throw null;
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(f27382j0, false);
        outState.putBoolean(ea.a.p("JnNiaBZ3ZWUpdSZ0JWEPZQ==", "2Ud2JWDQ"), this.Z);
        outState.putSerializable(ea.a.p("HWVCdRV0e2kpdA==", "d4YybBdA"), this.f27383a0);
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // jl.a, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // wl.a
    public final void p(int i10, int i11) {
        int i12;
        OperateExecuteTask o22 = o2();
        int i13 = (int) ((i10 / i11) * 100);
        if (i13 <= 0) {
            i12 = 1;
        } else {
            i12 = i13;
        }
        ReaderRoundProgressBar readerRoundProgressBar = o22.f28225b;
        if (readerRoundProgressBar != null) {
            readerRoundProgressBar.setProgress(i12);
        }
        dp.a a10 = dp.a.a();
        StringBuilder f10 = a0.d.f("convert progress current is: ", i10, " , max is: ", i11, " , progress is ");
        f10.append(i13);
        f10.append("%");
        String sb2 = f10.toString();
        a10.getClass();
        dp.a.c(sb2);
    }

    public final int p2() {
        int[] iArr = new int[2];
        RecyclerView recyclerView = this.J;
        if (recyclerView != null) {
            recyclerView.getLocationInWindow(iArr);
            int U = iArr[1] - t0.U(this);
            if (U < 0) {
                return -1;
            }
            return (int) (getResources().getDimension(R.dimen.dp_6) + U);
        }
        g.i(ea.a.p("VGEnbBZyG1J2", "aMNs7xT7"));
        throw null;
    }

    public final void q2() {
        k.f17927a.getClass();
        k.b(this);
        if (!h2()) {
            Intent intent = new Intent(this, ReaderHomeActivity.class);
            intent.putExtra(ea.a.p("IGUbX1llFV8hbhJlWnQIZFdfPG89aF9uZw==", "FKKb7btP"), true);
            startActivity(intent);
        }
        finish();
        ImageConvertDataRepository.f26536a.getClass();
        ImageConvertDataRepository.f();
    }

    public final boolean r2() {
        float a10 = f0.a();
        float w7 = v.w((ArrayList) m2().h());
        t1.b("convert needSpace: " + w7 + " freeSize: " + a10);
        String str = n0.f28727a;
        if (a10 > w7 * 2) {
            return true;
        }
        return false;
    }

    public final void s2() {
        int i10;
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this)) {
            Window window = getWindow();
            if (window != null) {
                i.g(window, 0, androidx.core.content.a.getColor(this, R.color.colorDialogNav));
            }
            Window window2 = getWindow();
            if (window2 != null) {
                i.a(window2, false);
            }
            Window window3 = getWindow();
            if (window3 != null) {
                i.j(window3, 1280);
            }
        }
        if (g.a(this.f27001t, ea.a.p("MWMpbgVlGTI4ZGY=", "iKBHkk3H"))) {
            i10 = 6;
        } else {
            i10 = 0;
        }
        OperateExecuteTask o22 = o2();
        FrameLayout frameLayout = this.M;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            frameLayout.setOnClickListener(new q(3));
            tf.d dVar = tf.d.f30009a;
            String string = getString(R.string.arg_res_0x7f1300d3);
            g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQGMqbhNlN3Rbbg8p", "PiFDE2hY"));
            o22.t(i10, frameLayout, string, this.f27386d0, 0);
            return;
        }
        g.i(ea.a.p("BW8gdFNpX2U6Rmw=", "9ufN21OW"));
        throw null;
    }

    public final void t2() {
        wl.e eVar;
        if (o2() != null && o2().f28241s && (eVar = this.S) != null) {
            eVar.f();
        }
        ImageConvertDataRepository.f26536a.getClass();
        ImageConvertDataRepository.f();
        finish();
    }

    public final void u2(final int i10, final String fileName) {
        final ul.b bVar;
        PDDocument pDDocument;
        if (!isFinishing() && !isDestroyed()) {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.X = System.currentTimeMillis();
                    final wl.e eVar = new wl.e();
                    List<ul.b> h10 = m2().h();
                    g.e(fileName, "fileName");
                    eVar.f31369f = this;
                    s2();
                    eVar.c.set(false);
                    eVar.f31367d.set(0);
                    eVar.f31368e.set(0);
                    eVar.f31366b.clear();
                    if (eVar.f31365a == null) {
                        ge.a.z().getClass();
                        int[] B = ge.a.B(this);
                        eVar.f31365a = new ThreadPoolExecutor(B[0], B[1], (long) TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL, TimeUnit.SECONDS, new LinkedBlockingQueue(100000), new ThreadPoolExecutor.CallerRunsPolicy());
                    }
                    pdf.pdfreader.viewer.editor.free.utils.c.f28558a.getClass();
                    final ArrayList arrayList = (ArrayList) h10;
                    final int size = arrayList.size() + 1;
                    PDDocument pDDocument2 = new PDDocument(MemoryUsageSetting.setupTempFileOnly());
                    Iterator it = arrayList.iterator();
                    final int i11 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i12 = i11 + 1;
                        if (i11 >= 0) {
                            ul.b bVar2 = (ul.b) next;
                            ul.b bVar3 = bVar2.f30423u;
                            if (bVar3 == null) {
                                bVar = bVar2;
                            } else {
                                bVar = bVar3;
                            }
                            ea.a.p("WnQubV1hBmoHc0BJBGExZWQ_CCAvdCZt", "vo0weNou");
                            ThreadPoolExecutor threadPoolExecutor = eVar.f31365a;
                            if (threadPoolExecutor != null) {
                                final PDDocument pDDocument3 = pDDocument2;
                                pDDocument = pDDocument2;
                                threadPoolExecutor.execute(new Runnable() { // from class: wl.b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i13 = i11;
                                        String p10 = ea.a.p("R2gic1cw", "zltLxm00");
                                        e eVar2 = e.this;
                                        g.e(eVar2, p10);
                                        String p11 = ea.a.p("F2MkbgdlGnQ=", "AqeuLkV5");
                                        Context context = this;
                                        g.e(context, p11);
                                        String p12 = ea.a.p("a3BVZj1vVHU3ZSR0", "CuEpocGV");
                                        PDDocument pDDocument4 = pDDocument3;
                                        g.e(pDDocument4, p12);
                                        String p13 = ea.a.p("a2lcYR5l", "dex4Km6Q");
                                        ul.b bVar4 = bVar;
                                        g.e(bVar4, p13);
                                        String p14 = ea.a.p("a2lcYR5lcw==", "feQxhCTO");
                                        List list = arrayList;
                                        g.e(list, p14);
                                        String p15 = ea.a.p("F2YibBZOA21l", "6ExO5e5x");
                                        String str = fileName;
                                        g.e(str, p15);
                                        String p16 = ea.a.p("RmMCbChiMGNr", "qCbcDQpC");
                                        a aVar = this;
                                        g.e(aVar, p16);
                                        AtomicBoolean atomicBoolean = eVar2.c;
                                        try {
                                            if (!atomicBoolean.get()) {
                                                eVar2.d(context, pDDocument4, i13, bVar4);
                                                if (!atomicBoolean.get()) {
                                                    int incrementAndGet = eVar2.f31367d.incrementAndGet();
                                                    int i14 = size;
                                                    int i15 = (int) ((incrementAndGet / i14) * 100);
                                                    AtomicInteger atomicInteger = eVar2.f31368e;
                                                    if (atomicInteger.get() < i15) {
                                                        atomicInteger.set(i15);
                                                        w0.a().f28791b.execute(new c(incrementAndGet, aVar, i14, 0));
                                                    }
                                                    if (incrementAndGet == list.size()) {
                                                        dp.a a10 = dp.a.a();
                                                        String p17 = ea.a.p("LG9fdhxyQyApYTxl", "hJ2bY1X1");
                                                        a10.getClass();
                                                        dp.a.c(p17);
                                                        eVar2.g(context, pDDocument4, str);
                                                        dp.a a11 = dp.a.a();
                                                        String p18 = ea.a.p("UG8ldhZyFiABYUJlSXMjYydlQXM=", "1d3Am8K5");
                                                        a11.getClass();
                                                        dp.a.c(p18);
                                                    }
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            eVar2.e(th2);
                                        }
                                    }
                                });
                            } else {
                                pDDocument = pDDocument2;
                            }
                            i11 = i12;
                            pDDocument2 = pDDocument;
                        } else {
                            ge.a.c0();
                            throw null;
                        }
                    }
                    this.S = eVar;
                }
            } else {
                o2().e();
            }
            if (h2()) {
                return;
            }
            n nVar = n.f23972a;
            nVar.d(this, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$showImgToPdfFull$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ tf.d invoke() {
                    invoke2();
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    String str;
                    String str2;
                    ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity = ReaderImg2PDFConvertActivity.this;
                    String p10 = ea.a.p("LG9fdhxyQ3A-ZhVhZA==", "xzAFQW2E");
                    String p11 = ea.a.p("LG9fdhxyQ3A-ZhVmAGwEX0ZoAXc=", "o6eP8p8F");
                    if (i10 == 1) {
                        str = "PnVYdA==";
                        str2 = "OzxFKWpY";
                    } else {
                        str = "QWUlYR5l";
                        str2 = "eS2LUvHC";
                    }
                    tn.a.d(readerImg2PDFConvertActivity, p10, p11, ea.a.p(str, str2), false);
                }
            });
            if (i10 == 1) {
                nVar.a();
            }
        }
    }

    public final void v2() {
        p.k(this, a2().concat("_space"));
        x xVar = new x(this, getString(R.string.arg_res_0x7f1302ad), getString(R.string.arg_res_0x7f1304da), getString(R.string.arg_res_0x7f130421));
        this.f27390h0 = xVar;
        xVar.H = new a1.e(this, 13);
        W1(xVar);
    }

    public final void w2(cg.a<tf.d> aVar) {
        boolean z10;
        p.m(this, a2());
        if (this.f27388f0 == null) {
            if (h2()) {
                String string = getResources().getString(R.string.arg_res_0x7f1304dc);
                g.d(string, ea.a.p("PWVCbwxyVGUpLi1lAVMcclxuCSgXLhZ0iICebxdjMl89ZVxvD2VocS9pPl8UcwNfUnAaKQ==", "IJcjj8bZ"));
                String string2 = getResources().getString(R.string.arg_res_0x7f1301b2);
                g.d(string2, ea.a.p("PWVCbwxyVGUpLi1lAVMcclxuCSgXLhZ0hIDVXyduNmkhaUJoHGRocS9pPl8UcwNfUnAaKQ==", "KDrvfsRP"));
                this.f27388f0 = new OperateInterceptDialog(this, string, string2);
            } else {
                String string3 = getResources().getString(R.string.arg_res_0x7f13035a);
                g.d(string3, ea.a.p("I2U9bwRyV2U7LgFlQFMjclFuNSgbLkV0BmkfZ39xN2klXy1vH3ZRcjxpCGcp", "iyQNq4sA"));
                String string4 = getResources().getString(R.string.arg_res_0x7f1304a9);
                g.d(string4, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0moDcbh0uGHVBZRRxBmkWXxFvWnYMciJfI3BGKQ==", "xzzkWaXP"));
                this.f27388f0 = new OperateInterceptDialog(this, string3, string4);
            }
        }
        OperateInterceptDialog operateInterceptDialog = this.f27388f0;
        if (operateInterceptDialog != null && !operateInterceptDialog.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            OperateInterceptDialog operateInterceptDialog2 = this.f27388f0;
            if (operateInterceptDialog2 != null) {
                operateInterceptDialog2.A = new d(aVar);
            }
            if (operateInterceptDialog2 != null) {
                operateInterceptDialog2.show();
            }
        }
    }

    /* compiled from: ReaderImg2PDFConvertActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d implements oo.b {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ cg.a<tf.d> f27396b;

        public d(cg.a<tf.d> aVar) {
            this.f27396b = aVar;
        }

        @Override // oo.b
        public final void a() {
            ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity = ReaderImg2PDFConvertActivity.this;
            p.l(readerImg2PDFConvertActivity, readerImg2PDFConvertActivity.a2());
            this.f27396b.invoke();
        }

        @Override // oo.b
        public final void cancel() {
        }
    }
}
