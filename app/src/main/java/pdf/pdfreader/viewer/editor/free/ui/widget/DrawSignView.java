package pdf.pdfreader.viewer.editor.free.ui.widget;

import am.k2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import ao.h1;
import ao.i1;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.bean.ColorType;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.r;
import pdf.pdfreader.viewer.editor.free.ui.widget.SignSizeBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignColorBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignCreateView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignaturePad;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.l0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import xk.g;

/* loaded from: classes3.dex */
public class DrawSignView extends FrameLayout implements SignaturePad.f {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f28182f = 0;

    /* renamed from: a  reason: collision with root package name */
    public k2 f28183a;

    /* renamed from: b  reason: collision with root package name */
    public l f28184b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f28185d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f28186e;

    /* loaded from: classes3.dex */
    public class a implements SignSizeBottomSheetView.b {
        public a() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.SignSizeBottomSheetView.b
        public final void a(final int i10) {
            SignaturePad signaturePad = DrawSignView.this.f28183a.f1047p;
            signaturePad.getClass();
            t0.V().execute(new Runnable() { // from class: xo.j
                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = SignaturePad.f28470o;
                    zl.b.c.getClass();
                    zl.b.f32414g.c(zl.b.f32411d[2], Integer.valueOf(i10));
                }
            });
            signaturePad.c.setStrokeWidth(i10);
            if (signaturePad.a()) {
                SignaturePad.d dVar = new SignaturePad.d();
                dVar.f28487b = signaturePad.c.getColor();
                dVar.f28486a = i10;
                signaturePad.f28479j.add(dVar);
                signaturePad.f28480k.clear();
                signaturePad.invalidate();
                SignaturePad.f fVar = signaturePad.f28478i;
                if (fVar != null) {
                    ((DrawSignView) fVar).g();
                }
            }
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.SignSizeBottomSheetView.b
        public final void b(int i10) {
            DrawSignView.this.f28183a.f1047p.setSignaturePaintSize(i10);
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28188a;

        static {
            int[] iArr = new int[ColorType.values().length];
            f28188a = iArr;
            try {
                iArr[ColorType.Black.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28188a[ColorType.White.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DrawSignView drawSignView = DrawSignView.this;
            if (drawSignView.f28183a.f1045n.isSelected()) {
                drawSignView.f28183a.f1045n.setSelected(false);
                zl.b.c.getClass();
                zl.b.f32412e.c(zl.b.f32411d[0], Boolean.FALSE);
                return;
            }
            drawSignView.f28183a.f1045n.setSelected(true);
            zl.b.c.getClass();
            zl.b.f32412e.c(zl.b.f32411d[0], Boolean.TRUE);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DrawSignView.this.g();
        }
    }

    /* loaded from: classes3.dex */
    public class e extends l0 {
        public e() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            String str;
            String str2;
            DrawSignView drawSignView = DrawSignView.this;
            drawSignView.f28183a.f1041j.setVisibility(4);
            drawSignView.f28183a.f1043l.setVisibility(0);
            k2 k2Var = drawSignView.f28183a;
            SignaturePad signaturePad = k2Var.f1047p;
            boolean isSelected = k2Var.f1045n.isSelected();
            signaturePad.getClass();
            w0.a().c.execute(new pdf.pdfreader.viewer.editor.free.ui.widget.sign.a(signaturePad, isSelected));
            if (drawSignView.f28183a.f1044m.getVisibility() == 0) {
                drawSignView.f28183a.f1044m.setVisibility(8);
            }
            if (drawSignView.f28183a.c.getVisibility() == 0) {
                drawSignView.f28183a.c.setVisibility(8);
            }
            if (drawSignView.f28183a.f1045n.isSelected() != drawSignView.f28186e) {
                Context context = drawSignView.getContext();
                String p10 = ea.a.p("QGksbg==", "f3o0otpF");
                String p11 = ea.a.p("RGlTbhpkRGE_XxV3XXQ0aA==", "FE74E6c2");
                if (drawSignView.f28183a.f1045n.isSelected()) {
                    str = "XHAubg==";
                    str2 = "n0Hrh48y";
                } else {
                    str = "LGxec2U=";
                    str2 = "hTUdCGQ8";
                }
                tn.a.d(context, p10, p11, ea.a.p(str, str2), false);
                drawSignView.f28186e = drawSignView.f28183a.f1045n.isSelected();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f extends l0 {
        public f() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            String str;
            String str2;
            DrawSignView drawSignView = DrawSignView.this;
            l lVar = drawSignView.f28184b;
            if (lVar != null) {
                ((i1) lVar).a();
            }
            if (drawSignView.f28183a.f1045n.isSelected() != drawSignView.f28186e) {
                Context context = drawSignView.getContext();
                String p10 = ea.a.p("QGksbg==", "PzAhO9rS");
                String p11 = ea.a.p("PGlWbiZkRWEtXzl3HHQLaA==", "KmwzO6Wr");
                if (drawSignView.f28183a.f1045n.isSelected()) {
                    str = "IHBUbg==";
                    str2 = "vFwlZ2k4";
                } else {
                    str = "UGwkc2U=";
                    str2 = "4J3sualK";
                }
                tn.a.d(context, p10, p11, ea.a.p(str, str2), false);
                drawSignView.f28186e = drawSignView.f28183a.f1045n.isSelected();
            }
            drawSignView.setVisibility(8);
        }
    }

    /* loaded from: classes3.dex */
    public class g extends l0 {
        public g() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            DrawSignView drawSignView = DrawSignView.this;
            tn.a.b(drawSignView.getContext(), ea.a.p("PGlWbg==", "KoJ1WYKe"), ea.a.p("PGlWbiZkRWEtXylvGW8aX1ZsB2Nr", "1W4weEcT"));
            tn.a.b(drawSignView.getContext(), ea.a.p("PGlWbg==", "MI1bgntc"), ea.a.p("PGlWbiZkRWEtXylvGW8aX1lhF2U3XxZoLXc=", "ceRZBJMj"));
            drawSignView.f28183a.c.I();
        }
    }

    /* loaded from: classes3.dex */
    public class h extends l0 {
        public h() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            DrawSignView drawSignView = DrawSignView.this;
            tn.a.b(drawSignView.getContext(), ea.a.p("QGksbg==", "8ASgULj4"), ea.a.p("SmkQbg1kG2E_XwppWmUIY1RpMWs=", "VF9wRirT"));
            tn.a.b(drawSignView.getContext(), ea.a.p("PGlWbg==", "InmrBWYI"), ea.a.p("PGlWbiZkRWEtXyZpG2U3bFR5C3Iacw1vdw==", "CIrEzxYg"));
            drawSignView.f28183a.f1044m.I();
        }
    }

    /* loaded from: classes3.dex */
    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DrawSignView.this.f28183a.f1047p.d();
        }
    }

    /* loaded from: classes3.dex */
    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DrawSignView drawSignView = DrawSignView.this;
            drawSignView.f28183a.f1044m.C();
            drawSignView.f28183a.c.C();
        }
    }

    /* loaded from: classes3.dex */
    public class k implements g.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f28197a;

        public k(Context context) {
            this.f28197a = context;
        }

        @Override // xk.g.b
        public final void a(nl.f fVar) {
            if (fVar == null) {
                return;
            }
            DrawSignView drawSignView = DrawSignView.this;
            drawSignView.f28183a.f1047p.setSignaturePaintColor(fVar.f22603a);
            drawSignView.b(this.f28197a, fVar);
        }
    }

    /* loaded from: classes3.dex */
    public interface l {
    }

    public DrawSignView(Context context) {
        super(context);
        a(context);
    }

    public final void a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.layout_draw_sign_page, this);
        int i10 = R.id.sign_cl_root;
        ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(this, R.id.sign_cl_root);
        if (constraintLayout != null) {
            i10 = R.id.sign_color_sheet_view;
            SignColorBottomSheetView signColorBottomSheetView = (SignColorBottomSheetView) com.google.android.play.core.assetpacks.c.u(this, R.id.sign_color_sheet_view);
            if (signColorBottomSheetView != null) {
                i10 = R.id.sign_fl_color;
                FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(this, R.id.sign_fl_color);
                if (frameLayout != null) {
                    i10 = R.id.sign_iv_clear;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.sign_iv_clear);
                    if (appCompatImageView != null) {
                        i10 = R.id.sign_iv_close;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.sign_iv_close);
                        if (appCompatImageView2 != null) {
                            i10 = R.id.sign_iv_color;
                            AddTextColorView addTextColorView = (AddTextColorView) com.google.android.play.core.assetpacks.c.u(this, R.id.sign_iv_color);
                            if (addTextColorView != null) {
                                i10 = R.id.sign_iv_recovery;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.sign_iv_recovery);
                                if (appCompatImageView3 != null) {
                                    i10 = R.id.sign_iv_repeal;
                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.sign_iv_repeal);
                                    if (appCompatImageView4 != null) {
                                        i10 = R.id.sign_iv_save;
                                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.sign_iv_save);
                                        if (appCompatImageView5 != null) {
                                            i10 = R.id.sign_iv_size;
                                            AppCompatImageView appCompatImageView6 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.sign_iv_size);
                                            if (appCompatImageView6 != null) {
                                                i10 = R.id.sign_progress_save_loading;
                                                ProgressView progressView = (ProgressView) com.google.android.play.core.assetpacks.c.u(this, R.id.sign_progress_save_loading);
                                                if (progressView != null) {
                                                    i10 = R.id.sign_size_sheet_view;
                                                    SignSizeBottomSheetView signSizeBottomSheetView = (SignSizeBottomSheetView) com.google.android.play.core.assetpacks.c.u(this, R.id.sign_size_sheet_view);
                                                    if (signSizeBottomSheetView != null) {
                                                        i10 = R.id.sign_tv_save_to_device;
                                                        TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.sign_tv_save_to_device);
                                                        if (textView != null) {
                                                            i10 = R.id.sign_tv_sign_here;
                                                            TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.sign_tv_sign_here);
                                                            if (textView2 != null) {
                                                                i10 = R.id.sign_tv_sign_pad;
                                                                SignaturePad signaturePad = (SignaturePad) com.google.android.play.core.assetpacks.c.u(this, R.id.sign_tv_sign_pad);
                                                                if (signaturePad != null) {
                                                                    this.f28183a = new k2(this, constraintLayout, signColorBottomSheetView, frameLayout, appCompatImageView, appCompatImageView2, addTextColorView, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, progressView, signSizeBottomSheetView, textView, textView2, signaturePad);
                                                                    textView2.setText(context.getString(R.string.arg_res_0x7f1301a6) + " ");
                                                                    TextView textView3 = this.f28183a.f1045n;
                                                                    zl.b.c.getClass();
                                                                    textView3.setSelected(((Boolean) zl.b.f32412e.b(zl.b.f32411d[0])).booleanValue());
                                                                    this.f28183a.f1045n.setOnClickListener(new c());
                                                                    this.f28183a.f1047p.setSignatureListener(this);
                                                                    this.f28183a.f1047p.post(new d());
                                                                    this.f28183a.f1041j.setOnClickListener(new e());
                                                                    this.f28183a.f1037f.setOnClickListener(new f());
                                                                    this.f28183a.f1035d.setOnClickListener(new g());
                                                                    this.f28183a.f1042k.setOnClickListener(new h());
                                                                    this.f28183a.f1039h.setOnClickListener(new r(this, 2));
                                                                    this.f28183a.f1040i.setOnClickListener(new u4.g(this, 25));
                                                                    this.f28183a.f1036e.setOnClickListener(new i());
                                                                    this.f28183a.f1034b.setOnClickListener(new j());
                                                                    b(context, t0.u(context, zl.b.j()));
                                                                    this.f28183a.c.setOnColorItemClickListener(new k(context));
                                                                    SignColorBottomSheetView signColorBottomSheetView2 = this.f28183a.c;
                                                                    if (signColorBottomSheetView2.f28172y != 0) {
                                                                        signColorBottomSheetView2.setOnClickListener(new pdf.pdfreader.viewer.editor.free.ui.widget.a(signColorBottomSheetView2));
                                                                    }
                                                                    SignSizeBottomSheetView signSizeBottomSheetView2 = this.f28183a.f1044m;
                                                                    if (signSizeBottomSheetView2.f28172y != 0) {
                                                                        signSizeBottomSheetView2.setOnClickListener(new pdf.pdfreader.viewer.editor.free.ui.widget.a(signSizeBottomSheetView2));
                                                                    }
                                                                    this.f28183a.f1044m.setOnSizeChangeCallBack(new a());
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpQGhrSTA6IA==", "I3nI4Ktx").concat(getResources().getResourceName(i10)));
    }

    public final void b(Context context, nl.f fVar) {
        int i10 = b.f28188a[fVar.f22604b.ordinal()];
        int i11 = fVar.f22603a;
        if (i10 != 1) {
            if (i10 != 2) {
                this.f28183a.f1038g.c(i11, i11, 0);
                return;
            } else {
                this.f28183a.f1038g.c(i11, androidx.core.content.a.getColor(context, R.color.edit_color_2_change_stroke), androidx.core.content.a.getColor(context, R.color.edit_color_2_bg));
                return;
            }
        }
        this.f28183a.f1038g.c(i11, androidx.core.content.a.getColor(context, R.color.edit_color_1_change_stroke), 0);
    }

    public final void c() {
        this.f28183a.f1043l.setVisibility(8);
        this.f28183a.f1041j.setVisibility(0);
        this.f28183a.f1041j.setAlpha(0.4f);
        this.f28183a.f1041j.setEnabled(false);
    }

    public final void d() {
        if (getContext() == null) {
            return;
        }
        tn.a.d(getContext(), ea.a.p("VmQidCxzA3Zl", "krS8uCbz"), ea.a.p("VGQfdBRhQWUXcwd2UV8xYVFs", "o41vg7Nf"), ea.a.p("PGlWbjI=", "hTFBLftx"), false);
        j1.h(getContext().getString(R.string.arg_res_0x7f13044c), getContext(), true, R.drawable.ic_fail_warning);
        c();
    }

    public final void e(String str, SignPathActionInfo signPathActionInfo) {
        boolean z10;
        String p10;
        String p11;
        SignCreateView signCreateView;
        c();
        setVisibility(8);
        l lVar = this.f28184b;
        if (lVar != null) {
            ((i1) lVar).a();
            i1 i1Var = (i1) this.f28184b;
            i1Var.getClass();
            zl.b.c.getClass();
            boolean booleanValue = ((Boolean) zl.b.f32412e.b(zl.b.f32411d[0])).booleanValue();
            ReaderPreviewActivity readerPreviewActivity = i1Var.f5073a;
            if (booleanValue && (signCreateView = readerPreviewActivity.f26249s0) != null && signPathActionInfo != null) {
                if (((Group) signCreateView.f28438a.f768e).getVisibility() == 0) {
                    pdf.pdfreader.viewer.editor.free.ui.widget.adapter.f fVar = signCreateView.f28439b;
                    fVar.f28371f.add(0, signPathActionInfo);
                    fVar.notifyDataSetChanged();
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(signPathActionInfo);
                    w0.a().f28791b.execute(new xo.e(signCreateView, arrayList));
                }
                ((RecyclerView) signCreateView.f28438a.f770g).u0(0);
            }
            ExecutorService executorService = ReaderPreviewActivity.U5;
            readerPreviewActivity.X2();
            readerPreviewActivity.C.postDelayed(new h1(i1Var, str, signPathActionInfo), 200L);
            if (signPathActionInfo != null) {
                int size = signPathActionInfo.getSize();
                int color = signPathActionInfo.getColor();
                boolean z11 = true;
                if (this.f28185d != size) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.c == color) {
                    z11 = false;
                }
                Context context = getContext();
                String p12 = ea.a.p("QGksbg==", "aprGayPe");
                String p13 = ea.a.p("PGlWbiZkRWEtXy5vG2U3Y1lpDWs=", "lrW8PkYm");
                StringBuilder sb2 = new StringBuilder();
                if (z10) {
                    p10 = ea.a.p("MQ==", "6i0fOaln");
                } else {
                    p10 = ea.a.p("MA==", "05ROHBjX");
                }
                sb2.append(p10);
                sb2.append(ea.a.p("Xw==", "6AygAH7u"));
                if (z11) {
                    p11 = ea.a.p("MQ==", "x9YhNUSv");
                } else {
                    p11 = ea.a.p("MA==", "4A4hIW71");
                }
                sb2.append(p11);
                tn.a.d(context, p12, p13, sb2.toString(), false);
            }
        }
    }

    public final void f() {
        k2 k2Var = this.f28183a;
        if (k2Var == null) {
            return;
        }
        k2Var.f1044m.C();
        this.f28183a.c.C();
        if (this.f28183a.f1047p.a()) {
            this.f28183a.f1046o.setVisibility(8);
        } else {
            this.f28183a.f1046o.setVisibility(0);
        }
    }

    public final void g() {
        k2 k2Var = this.f28183a;
        k2Var.f1036e.setEnabled(!k2Var.f1047p.f28479j.isEmpty());
        k2 k2Var2 = this.f28183a;
        k2Var2.f1039h.setEnabled(!k2Var2.f1047p.f28480k.isEmpty());
        k2 k2Var3 = this.f28183a;
        k2Var3.f1040i.setEnabled(!k2Var3.f1047p.f28479j.isEmpty());
        k2 k2Var4 = this.f28183a;
        k2Var4.c.setSelectColor(k2Var4.f1047p.getPaintColor());
        k2 k2Var5 = this.f28183a;
        k2Var5.f1044m.setSize(k2Var5.f1047p.getPaintSize());
        b(getContext(), t0.u(getContext(), this.f28183a.f1047p.getPaintColor()));
        if (this.f28183a.f1047p.a()) {
            this.f28183a.f1041j.setAlpha(1.0f);
            this.f28183a.f1046o.setVisibility(8);
            this.f28183a.f1041j.setEnabled(true);
            this.f28183a.f1044m.setHasSign(true);
            return;
        }
        this.f28183a.f1041j.setAlpha(0.4f);
        this.f28183a.f1046o.setVisibility(0);
        this.f28183a.f1041j.setEnabled(false);
        this.f28183a.f1044m.setHasSign(false);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 8) {
            k2 k2Var = this.f28183a;
            if (k2Var != null) {
                k2Var.f1047p.d();
                this.f28183a.c.setVisibility(8);
                this.f28183a.f1044m.setVisibility(8);
            }
        } else if (i10 == 0 && this.f28183a != null && getContext() != null) {
            this.f28186e = this.f28183a.f1045n.isSelected();
            Context context = getContext();
            zl.b.c.getClass();
            nl.f u7 = t0.u(context, zl.b.j());
            b(getContext(), u7);
            int i11 = u7.f22603a;
            this.c = i11;
            this.f28183a.c.setSelectColor(i11);
            this.f28183a.f1044m.setSize(zl.b.k());
            this.f28185d = zl.b.k();
        }
    }

    public void setOnDrawSignViewListener(l lVar) {
        this.f28184b = lVar;
    }

    public DrawSignView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public DrawSignView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context);
    }
}
