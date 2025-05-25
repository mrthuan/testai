package pdf.pdfreader.viewer.editor.free.ui.act.tools;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.x;
import androidx.recyclerview.widget.RecyclerView;
import cg.l;
import java.util.ArrayList;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.ai.data.AIQuickTag;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.adapter.ChoosePDFAdapter;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;
import pdf.pdfreader.viewer.editor.free.utils.a1;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.l0;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.r0;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import wn.d;

/* compiled from: PDFChooseActivity.kt */
/* loaded from: classes3.dex */
public final class PDFChooseActivity extends BaseOperatePDFActivity implements d.b {

    /* renamed from: u0  reason: collision with root package name */
    public static final a f27008u0;

    /* renamed from: a0  reason: collision with root package name */
    public View f27009a0;

    /* renamed from: b0  reason: collision with root package name */
    public RecyclerView f27010b0;

    /* renamed from: c0  reason: collision with root package name */
    public Group f27011c0;

    /* renamed from: d0  reason: collision with root package name */
    public ImageView f27012d0;

    /* renamed from: e0  reason: collision with root package name */
    public TextView f27013e0;

    /* renamed from: f0  reason: collision with root package name */
    public EditText f27014f0;

    /* renamed from: g0  reason: collision with root package name */
    public ImageView f27015g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f27016h0;

    /* renamed from: i0  reason: collision with root package name */
    public Group f27017i0;

    /* renamed from: j0  reason: collision with root package name */
    public ChoosePDFAdapter f27018j0;

    /* renamed from: k0  reason: collision with root package name */
    public LinearLayout f27019k0;

    /* renamed from: l0  reason: collision with root package name */
    public LinearLayout f27020l0;

    /* renamed from: m0  reason: collision with root package name */
    public ConstraintLayout f27021m0;

    /* renamed from: n0  reason: collision with root package name */
    public TextView f27022n0;

    /* renamed from: o0  reason: collision with root package name */
    public String f27023o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f27024p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f27025q0;

    /* renamed from: r0  reason: collision with root package name */
    public a1 f27026r0;

    /* renamed from: s0  reason: collision with root package name */
    public final c f27027s0 = new c();

    /* renamed from: t0  reason: collision with root package name */
    public boolean f27028t0;

    /* compiled from: PDFChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, ToolsType toolsType, int i10, AIQuickTag aIQuickTag) {
            kotlin.jvm.internal.g.e(context, "context");
            kotlin.jvm.internal.g.e(toolsType, "toolsType");
            ReaderPdfApplication.k().g(null);
            Intent intent = new Intent(context, PDFChooseActivity.class);
            intent.putExtra(ea.a.p("R3k7ZSxvEGQbblVs", "k1aol9V6"), toolsType.ordinal());
            intent.putExtra(ea.a.p("R3k7ZQ==", "JanXt7Bz"), i10);
            if (aIQuickTag != null) {
                intent.putExtra(ea.a.p("QnUBYy9fAmFn", "mz3hDvxq"), aIQuickTag);
            }
            context.startActivity(intent);
        }
    }

    /* compiled from: PDFChooseActivity.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27029a;

        static {
            int[] iArr = new int[ToolsType.values().length];
            try {
                iArr[ToolsType.EDIT_PDF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToolsType.PDF_ADD_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToolsType.SPLIT_PDF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ToolsType.PRINT_PDF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ToolsType.LOCK_PDF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ToolsType.UNLOCK_PDF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ToolsType.SIGN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ToolsType.AI_UPLOAD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ToolsType.PDF2IMG.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ToolsType.PDF2LONG_IMG.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ToolsType.PDF2WORD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ToolsType.EDIT_TEXT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f27029a = iArr;
        }
    }

    /* compiled from: PDFChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c extends l0 {
        public c() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            Integer num;
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            PDFChooseActivity pDFChooseActivity = PDFChooseActivity.this;
            if (num != null && num.intValue() == R.id.search_clear_iv) {
                EditText editText = pDFChooseActivity.f27014f0;
                if (editText != null) {
                    editText.setText("");
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "EraMCiOh"));
                    throw null;
                }
            } else if (num != null && num.intValue() == R.id.permissionTipsLayout) {
                AppOpenManager.c().f23907g = false;
                if (h1.c()) {
                    r0.c(pDFChooseActivity);
                    if (pDFChooseActivity.f27026r0 == null) {
                        pDFChooseActivity.f27026r0 = new a1(pDFChooseActivity, PDFChooseActivity.class, null);
                    }
                    a1 a1Var = pDFChooseActivity.f27026r0;
                    if (a1Var != null) {
                        a1Var.c();
                    }
                }
            }
        }
    }

    /* compiled from: PDFChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class e extends ge.a {
        public e() {
        }

        @Override // ge.a, pdf.pdfreader.viewer.editor.free.data.c
        public final void b(List<PdfPreviewEntity> list) {
            ReaderPdfApplication.k().h(false);
            p1.a.a(PDFChooseActivity.this).c(new Intent(ea.a.p("BWQRLjxkLnItYQJlRi4haV13N3JnZVJpAG8DLjdyJ2VbQTRUBU8GXwRPJ0RrRh5MfV8RTwRQekUgRQ==", "fquwLHxH")));
        }
    }

    /* compiled from: PDFChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class f implements x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f27033a;

        public f(l lVar) {
            ea.a.p("LnVWYwVpLW4=", "VvH8qBL6");
            this.f27033a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final l a() {
            return this.f27033a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof x) && (obj instanceof kotlin.jvm.internal.e)) {
                return kotlin.jvm.internal.g.a(this.f27033a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f27033a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f27033a.invoke(obj);
        }
    }

    static {
        ea.a.p("Y0QNQxtvDXMXQVd0AHY_dHk=", "7JdkaZII");
        f27008u0 = new a();
    }

    @Override // jl.a
    public final void C1() {
        boolean z10;
        View findViewById = findViewById(R.id.rootView);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("UWlWZA9pD3cKeS9kHFJ5aVwuIG8mdGBpEXcp", "K678YjWu"));
        this.f27009a0 = findViewById;
        View findViewById2 = findViewById(R.id.view_status_bar);
        ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        kotlin.jvm.internal.g.d(layoutParams, ea.a.p("XlYhZTFTAWE8dRVCVXJ5bFl5PXU9UFdyFW1z", "Jd3HFu4C"));
        layoutParams.height = aj.b.B(this);
        findViewById2.setLayoutParams(layoutParams);
        this.Q = (FrameLayout) findViewById(R.id.frResult);
        View findViewById3 = findViewById(R.id.choose_recycler);
        kotlin.jvm.internal.g.d(findViewById3, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuUWgpbzBlPnI9Y01jKWVBKQ==", "aX4EGi5F"));
        this.f27010b0 = (RecyclerView) findViewById3;
        View findViewById4 = findViewById(R.id.no_file_group);
        kotlin.jvm.internal.g.d(findViewById4, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuXG8ZZipsNl8jcgZ1RCk=", "SDi4c6cy"));
        this.f27011c0 = (Group) findViewById4;
        View findViewById5 = findViewById(R.id.no_file_iv);
        kotlin.jvm.internal.g.d(findViewById5, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuAG8aZgxsL19adik=", "k4guJ3Ep"));
        this.f27012d0 = (ImageView) findViewById5;
        View findViewById6 = findViewById(R.id.no_file_tv);
        kotlin.jvm.internal.g.d(findViewById6, ea.a.p("MmkEZDJpXHcKeS9kHFJ5aVwuPG8WZl9sEV8Fdik=", "ksTjd9AL"));
        this.f27013e0 = (TextView) findViewById6;
        View findViewById7 = findViewById(R.id.result_count_tv);
        kotlin.jvm.internal.g.d(findViewById7, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQGU1dS90G2MkdR90F3RFKQ==", "DKqH0EZH"));
        this.f27016h0 = (TextView) findViewById7;
        View findViewById8 = findViewById(R.id.result_group);
        kotlin.jvm.internal.g.d(findViewById8, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHGU2dQl0a2cUbxBwKQ==", "Wutp4feZ"));
        this.f27017i0 = (Group) findViewById8;
        View findViewById9 = findViewById(R.id.search_et);
        kotlin.jvm.internal.g.d(findViewById9, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQWUnciBoL2UVKQ==", "paWt67v8"));
        this.f27014f0 = (EditText) findViewById9;
        String str = this.f27023o0;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            EditText editText = this.f27014f0;
            if (editText != null) {
                editText.setText(this.f27023o0);
                this.f27023o0 = "";
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("E2QTdBVlCnQ=", "AhvzArW7"));
                throw null;
            }
        }
        View findViewById10 = findViewById(R.id.search_clear_iv);
        kotlin.jvm.internal.g.d(findViewById10, ea.a.p("H2kaZDNpUncKeS9kHFJ5aVwuIWUoclVoK2MdZTByHWkPKQ==", "dVyte7YX"));
        this.f27015g0 = (ImageView) findViewById10;
        View findViewById11 = findViewById(R.id.ll_refresh_has_data);
        kotlin.jvm.internal.g.d(findViewById11, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuXmwZciZmH2U3aApoNnNsZCp0Eik=", "mDUWYaeV"));
        this.f27019k0 = (LinearLayout) findViewById11;
        View findViewById12 = findViewById(R.id.ll_refresh_no_data);
        kotlin.jvm.internal.g.d(findViewById12, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuXmwZciZmAWU-aDxuO19XYT9hKQ==", "sMcTh0lk"));
        this.f27020l0 = (LinearLayout) findViewById12;
        View findViewById13 = findViewById(R.id.permissionTipsLayout);
        kotlin.jvm.internal.g.d(findViewById13, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHmU3bQxzN2kpbmxpP3MDYUhvDHQp", "vy3rDF8O"));
        this.f27021m0 = (ConstraintLayout) findViewById13;
        View findViewById14 = findViewById(R.id.tvPermissionTips);
        kotlin.jvm.internal.g.d(findViewById14, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuRnYWZTFtXHMJaVduZWlDcyk=", "5z81PXYL"));
        this.f27022n0 = (TextView) findViewById14;
    }

    public final void C2(String str) {
        if (str != null) {
            if (!t2().isEmpty()) {
                new wn.d(t2(), this).getFilter().filter(str);
            } else {
                F2();
            }
        }
    }

    @Override // jl.a
    public final View D1() {
        View view = this.f27009a0;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.g.i(ea.a.p("QW8kdCVpB3c=", "ESi8zAhR"));
        throw null;
    }

    public final void D2() {
        String str;
        EditText editText = this.f27014f0;
        String str2 = null;
        if (editText != null) {
            Editable text = editText.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                EditText editText2 = this.f27014f0;
                if (editText2 != null) {
                    Editable text2 = editText2.getText();
                    if (text2 != null) {
                        str2 = text2.toString();
                    }
                    C2(str2);
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "ETQsRI8a"));
                throw null;
            }
            if (!t2().isEmpty()) {
                E2(t2());
            } else {
                F2();
            }
            LinearLayout linearLayout = this.f27019k0;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                LinearLayout linearLayout2 = this.f27020l0;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("X2wZZRVyB3MaTltECHRh", "nx6o5cv9"));
                    throw null;
                }
            }
            kotlin.jvm.internal.g.i(ea.a.p("X2wZZRVyB3MaSFVzLWEiYQ==", "ej0OnmNC"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("DGQsdGZlQXQ=", "2LiE29Vg"));
        throw null;
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_choose_pdf;
    }

    public final void E2(List<? extends PdfPreviewEntity> list) {
        Group group = this.f27011c0;
        if (group != null) {
            group.setVisibility(4);
            Group group2 = this.f27017i0;
            if (group2 != null) {
                group2.setVisibility(0);
                ChoosePDFAdapter choosePDFAdapter = this.f27018j0;
                if (choosePDFAdapter != null) {
                    EditText editText = this.f27014f0;
                    if (editText != null) {
                        Editable text = editText.getText();
                        choosePDFAdapter.f27097i = (text == null || (r3 = text.toString()) == null) ? "" : "";
                        kotlin.jvm.internal.g.e(list, "list");
                        choosePDFAdapter.h().clear();
                        choosePDFAdapter.h().addAll(list);
                        choosePDFAdapter.notifyDataSetChanged();
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("KmRYdC1lT3Q=", "pweVgNJz"));
                        throw null;
                    }
                }
                if (list.size() <= 1) {
                    TextView textView = this.f27016h0;
                    if (textView != null) {
                        textView.setText(getString(R.string.arg_res_0x7f130413, String.valueOf(list.size())));
                        return;
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("QWU4dR90IW8HbnQ=", "lGy0io4K"));
                        throw null;
                    }
                }
                TextView textView2 = this.f27016h0;
                if (textView2 != null) {
                    textView2.setText(getString(R.string.arg_res_0x7f130415, String.valueOf(list.size())));
                    return;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("EWU_dT10IW89bnQ=", "LBcLQbz7"));
                    throw null;
                }
            }
            kotlin.jvm.internal.g.i(ea.a.p("PWVCdRV0cHI1dXA=", "2Pb1gTfV"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("Km1BdABMVnk1dXQ=", "D3AtinRf"));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        if (r0 == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F2() {
        /*
            r4 = this;
            android.widget.EditText r0 = r4.f27014f0
            r1 = 0
            if (r0 == 0) goto La3
            android.text.Editable r0 = r0.getText()
            r2 = 0
            if (r0 == 0) goto L1f
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L1f
            int r0 = r0.length()
            r3 = 1
            if (r0 != 0) goto L1b
            r0 = r3
            goto L1c
        L1b:
            r0 = r2
        L1c:
            if (r0 != r3) goto L1f
            goto L20
        L1f:
            r3 = r2
        L20:
            if (r3 == 0) goto L4f
            android.widget.ImageView r0 = r4.f27012d0
            if (r0 == 0) goto L43
            r3 = 2131231488(0x7f080300, float:1.8079058E38)
            r0.setImageResource(r3)
            android.widget.TextView r0 = r4.f27013e0
            if (r0 == 0) goto L37
            r3 = 2131952515(0x7f130383, float:1.9541475E38)
            r0.setText(r3)
            goto L63
        L37:
            java.lang.String r0 = "Vm07dApUdg=="
            java.lang.String r2 = "U8oidJSF"
            java.lang.String r0 = ea.a.p(r0, r2)
            kotlin.jvm.internal.g.i(r0)
            throw r1
        L43:
            java.lang.String r0 = "LW0IdEtJdg=="
            java.lang.String r2 = "j7Hx289J"
            java.lang.String r0 = ea.a.p(r0, r2)
            kotlin.jvm.internal.g.i(r0)
            throw r1
        L4f:
            android.widget.ImageView r0 = r4.f27012d0
            if (r0 == 0) goto L97
            r3 = 2131755048(0x7f100028, float:1.9140964E38)
            r0.setImageResource(r3)
            android.widget.TextView r0 = r4.f27013e0
            if (r0 == 0) goto L8b
            r3 = 2131952615(0x7f1303e7, float:1.9541678E38)
            r0.setText(r3)
        L63:
            androidx.constraintlayout.widget.Group r0 = r4.f27011c0
            if (r0 == 0) goto L7f
            r0.setVisibility(r2)
            androidx.constraintlayout.widget.Group r0 = r4.f27017i0
            if (r0 == 0) goto L73
            r1 = 4
            r0.setVisibility(r1)
            return
        L73:
            java.lang.String r0 = "QWU4dR90JXIddXA="
            java.lang.String r2 = "ZPeK1I0a"
            java.lang.String r0 = ea.a.p(r0, r2)
            kotlin.jvm.internal.g.i(r0)
            throw r1
        L7f:
            java.lang.String r0 = "Km1BdABMVnk1dXQ="
            java.lang.String r2 = "BNyxc6Uc"
            java.lang.String r0 = ea.a.p(r0, r2)
            kotlin.jvm.internal.g.i(r0)
            throw r1
        L8b:
            java.lang.String r0 = "Km1BdABUdg=="
            java.lang.String r2 = "nFP2sPKD"
            java.lang.String r0 = ea.a.p(r0, r2)
            kotlin.jvm.internal.g.i(r0)
            throw r1
        L97:
            java.lang.String r0 = "Km1BdABJdg=="
            java.lang.String r2 = "hLlo13Ne"
            java.lang.String r0 = ea.a.p(r0, r2)
            kotlin.jvm.internal.g.i(r0)
            throw r1
        La3:
            java.lang.String r0 = "KmQOdDFlQXQ="
            java.lang.String r2 = "fMOge9Iz"
            java.lang.String r0 = ea.a.p(r0, r2)
            kotlin.jvm.internal.g.i(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity.F2():void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity, jl.a
    public final void K1() {
        super.K1();
        View view = this.f27009a0;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.d
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    int height;
                    boolean z10;
                    PDFChooseActivity.a aVar = PDFChooseActivity.f27008u0;
                    String p10 = ea.a.p("Q2gdc2kw", "gv7tMrHM");
                    PDFChooseActivity pDFChooseActivity = PDFChooseActivity.this;
                    kotlin.jvm.internal.g.e(pDFChooseActivity, p10);
                    Rect rect = new Rect();
                    View view2 = pDFChooseActivity.f27009a0;
                    if (view2 != null) {
                        view2.getWindowVisibleDisplayFrame(rect);
                        View view3 = pDFChooseActivity.f27009a0;
                        if (view3 != null) {
                            if (height - rect.bottom > view3.getRootView().getHeight() * 0.15d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 != pDFChooseActivity.f27024p0) {
                                pDFChooseActivity.f27024p0 = z10;
                                if (z10) {
                                    EditText editText = pDFChooseActivity.f27014f0;
                                    if (editText != null) {
                                        if (editText.hasFocus()) {
                                            tn.a.d(pDFChooseActivity, ea.a.p("R28kbABfAWgdb0dl", "pqsbSwBh"), ea.a.p("O29ebApfRGU7ciloKmMEaVZr", "vX1oiVe1"), pDFChooseActivity.r2(), false);
                                        }
                                        ea.a.p("ImQQQx9vNXMtQQV0XXY-dHk=", "twRvwZb7");
                                        ea.a.p("QGgkd1NrB3kQb1VyZA==", "Wn0WH6Gg");
                                        String str = n0.f28727a;
                                        return;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "bGpUkNL5"));
                                    throw null;
                                }
                                ea.a.p("FmQqQzBvC3MtQQV0XXY-dHk=", "mUfLXdqg");
                                ea.a.p("J2lVZVlrUnk4bytyZA==", "otTy82yi");
                                String str2 = n0.f28727a;
                                return;
                            }
                            return;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("QW8kdCVpB3c=", "b90VwCTp"));
                        throw null;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("PW9edC9pUnc=", "ldQQUmEI"));
                    throw null;
                }
            });
            if (h1.c() && !pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
                EventCenter.f(ea.a.p("O29ebHM=", "ls3bVWiT"));
                EventCenter.c(this);
                switch (b.f27029a[u2().ordinal()]) {
                    case 1:
                        EventCenter.f28660g = ea.a.p("MW4dbwxhLWU=", "PYPsxYc7");
                        break;
                    case 2:
                        EventCenter.f28660g = ea.a.p("O2VJdA==", "4fPudsgr");
                        break;
                    case 3:
                        EventCenter.f28660g = ea.a.p("PHBdaXQ=", "ACkksBxI");
                        break;
                    case 4:
                        EventCenter.f28660g = ea.a.p("FnItbnQ=", "cnfDmYxq");
                        break;
                    case 5:
                        EventCenter.f28660g = ea.a.p("X28oaw==", "2WTMeop0");
                        break;
                    case 6:
                        EventCenter.f28660g = ea.a.p("LG5VbxFr", "tcY9rWQi");
                        break;
                    case 7:
                        EventCenter.f28660g = ea.a.p("PGlWbg==", "L2vUiuWP");
                        break;
                    case 8:
                        EventCenter.f28660g = ea.a.p("FGk=", "Vtufll67");
                        break;
                    case 9:
                        EventCenter.f28660g = ea.a.p("P2RXMhBtZw==", "nhotkeUf");
                        break;
                    case 10:
                        EventCenter.f28660g = ea.a.p("P2RXMhVvWWczbWc=", "FLIXjFYf");
                        break;
                    case 11:
                        EventCenter.f28660g = ea.a.p("P2QkMk5vPGQ=", "pTOB9NnA");
                        break;
                    case 12:
                        EventCenter.f28660g = ea.a.p("KmRYdAlkZg==", "bITUpltV");
                        break;
                    default:
                        EventCenter.f28660g = ea.a.p("B24cbxZhR2U=", "qRfrb36A");
                        break;
                }
                EventCenter.f28661h = ea.a.p("XG8GaSZlQjE=", "Nh2rEsG7");
                EventCenter.e(this);
                ConstraintLayout constraintLayout = this.f27021m0;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                    String string = getString(R.string.arg_res_0x7f130462);
                    kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQHMgbABjBF9bbx5lFGYmbFRzJmFUYz9zOV8ScBwp", "fTdep6lK"));
                    TextView textView = this.f27022n0;
                    if (textView != null) {
                        textView.setText(aj.b.T(androidx.core.content.a.getColor(this, R.color.colorAccent), string));
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("R3YbZQFtC3MBaVtuPWkmcw==", "yTejgaRl"));
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("Q2U5bRpzEWkdbmBpGXMaYT1vR3Q=", "uaJX6so8"));
                    throw null;
                }
            }
            findViewById(R.id.back_iv).setOnClickListener(new View.OnClickListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PDFChooseActivity.a aVar = PDFChooseActivity.f27008u0;
                    String p10 = ea.a.p("O2hYc10w", "ggrhxrBy");
                    PDFChooseActivity pDFChooseActivity = PDFChooseActivity.this;
                    kotlin.jvm.internal.g.e(pDFChooseActivity, p10);
                    pDFChooseActivity.onBackPressed();
                }
            });
            ImageView imageView = this.f27015g0;
            if (imageView != null) {
                c cVar = this.f27027s0;
                imageView.setOnClickListener(cVar);
                ((InterceptTouchFrameLayout) findViewById(R.id.recycler_container)).setTopTouchListener(new h5.a(this, 19));
                this.f27018j0 = new ChoosePDFAdapter(this, new l<PdfPreviewEntity, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity$initView$4
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(PdfPreviewEntity pdfPreviewEntity) {
                        invoke2(pdfPreviewEntity);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(PdfPreviewEntity it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        PDFChooseActivity.this.E0(it);
                    }
                });
                RecyclerView recyclerView = this.f27010b0;
                if (recyclerView != null) {
                    recyclerView.setHasFixedSize(true);
                    recyclerView.setAdapter(this.f27018j0);
                    if (!t2().isEmpty()) {
                        w0.a().c.execute(new androidx.fragment.app.a1(19, this, new l<List<? extends PdfPreviewEntity>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity$initView$6
                            {
                                super(1);
                            }

                            @Override // cg.l
                            public /* bridge */ /* synthetic */ tf.d invoke(List<? extends PdfPreviewEntity> list) {
                                invoke2(list);
                                return tf.d.f30009a;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2(List<? extends PdfPreviewEntity> it) {
                                kotlin.jvm.internal.g.e(it, "it");
                                PDFChooseActivity pDFChooseActivity = PDFChooseActivity.this;
                                pDFChooseActivity.E2(pDFChooseActivity.t2());
                            }
                        }));
                    } else {
                        F2();
                    }
                    EditText editText = this.f27014f0;
                    if (editText != null) {
                        editText.setOnClickListener(new k9.c(this, 21));
                        EditText editText2 = this.f27014f0;
                        if (editText2 != null) {
                            editText2.setOnFocusChangeListener(new k9.d(this, 1));
                            EditText editText3 = this.f27014f0;
                            if (editText3 != null) {
                                editText3.setImeOptions(268435459);
                                editText3.addTextChangedListener(new d());
                                editText3.setOnEditorActionListener(new pdf.pdfreader.viewer.editor.free.ui.act.tools.f(editText3, this, 0));
                                ConstraintLayout constraintLayout2 = this.f27021m0;
                                if (constraintLayout2 != null) {
                                    constraintLayout2.setOnClickListener(cVar);
                                    return;
                                } else {
                                    kotlin.jvm.internal.g.i(ea.a.p("Q2U5bRpzEWkdbmBpGXMaYT1vR3Q=", "yq6NYBRa"));
                                    throw null;
                                }
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("KmRYdC1lT3Q=", "zfRyPePJ"));
                            throw null;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("AWRedB5lFXQ=", "3Fd7JmuH"));
                        throw null;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "4t6XKayy"));
                    throw null;
                }
                kotlin.jvm.internal.g.i(ea.a.p("PWVSeRpsUnIMaS93", "Bl11eR2m"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("LGxUYQtJWXAvdANtZw==", "AOuziNOG"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("PW9edC9pUnc=", "wNMIk148"));
        throw null;
    }

    @Override // jl.a
    public final void L1() {
        ReaderPdfApplication.k().f28150g.e(this, new f(new l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity$initViewModel$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke2(bool);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                if (bool == null || pdf.pdfreader.viewer.editor.free.utils.extension.a.b(PDFChooseActivity.this)) {
                    return;
                }
                if (bool.booleanValue()) {
                    if (!PDFChooseActivity.this.t2().isEmpty()) {
                        LinearLayout linearLayout = PDFChooseActivity.this.f27019k0;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(0);
                            LinearLayout linearLayout2 = PDFChooseActivity.this.f27020l0;
                            if (linearLayout2 == null) {
                                kotlin.jvm.internal.g.i(ea.a.p("I2xjZR9yUnMyTiVEFHRh", "DI3VYzxu"));
                                throw null;
                            }
                            linearLayout2.setVisibility(8);
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("X2wZZRVyB3MaSFVzLWEiYQ==", "Oo8TlM0O"));
                            throw null;
                        }
                    } else {
                        LinearLayout linearLayout3 = PDFChooseActivity.this.f27020l0;
                        if (linearLayout3 != null) {
                            linearLayout3.setVisibility(0);
                            LinearLayout linearLayout4 = PDFChooseActivity.this.f27019k0;
                            if (linearLayout4 != null) {
                                linearLayout4.setVisibility(8);
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("I2xjZR9yUnMySCtzMWEcYQ==", "o6kBiis4"));
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("FGwiZS5yFXMgTglEVXRh", "c2xpHpIk"));
                            throw null;
                        }
                    }
                    Group group = PDFChooseActivity.this.f27011c0;
                    if (group != null) {
                        group.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("Km1BdABMVnk1dXQ=", "AWWfyf4O"));
                        throw null;
                    }
                }
                LinearLayout linearLayout5 = PDFChooseActivity.this.f27019k0;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                    LinearLayout linearLayout6 = PDFChooseActivity.this.f27020l0;
                    if (linearLayout6 != null) {
                        linearLayout6.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("X2wZZRVyB3MaTltECHRh", "dG4yP58E"));
                        throw null;
                    }
                }
                kotlin.jvm.internal.g.i(ea.a.p("X2wZZRVyB3MaSFVzLWEiYQ==", "SyfhqEaK"));
                throw null;
            }
        }));
    }

    @Override // wn.d.b
    public final void l1(ArrayList<PdfPreviewEntity> arrayList) {
        boolean z10;
        if (arrayList != null && !arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            F2();
        } else {
            E2(arrayList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r0 == false) goto L34;
     */
    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBackPressed() {
        /*
            r6 = this;
            boolean r0 = r6.f27025q0
            java.lang.String r1 = "KmRYdC1lT3Q="
            java.lang.String r2 = "VmQidCdlGnQ="
            r3 = 0
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L25
            android.widget.EditText r0 = r6.f27014f0
            if (r0 == 0) goto L1b
            boolean r0 = r0.hasFocus()
            if (r0 != r5) goto L17
            r0 = r5
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 != 0) goto L3d
            goto L25
        L1b:
            java.lang.String r0 = "TzjKQNwh"
            java.lang.String r0 = ea.a.p(r1, r0)
            kotlin.jvm.internal.g.i(r0)
            throw r4
        L25:
            android.widget.EditText r0 = r6.f27014f0
            if (r0 == 0) goto L95
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L34
            java.lang.String r0 = r0.toString()
            goto L35
        L34:
            r0 = r4
        L35:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3c
            goto L3d
        L3c:
            r5 = r3
        L3d:
            if (r5 == 0) goto L79
            r6.f27025q0 = r3
            android.widget.EditText r0 = r6.f27014f0
            if (r0 == 0) goto L6f
            r0.clearFocus()
            android.widget.EditText r0 = r6.f27014f0
            if (r0 == 0) goto L65
            java.lang.String r1 = ""
            r0.setText(r1)
            android.widget.EditText r0 = r6.f27014f0
            if (r0 == 0) goto L59
            pdf.pdfreader.viewer.editor.free.utils.extension.g.a(r0)
            goto L94
        L59:
            java.lang.String r0 = "H2RadCxlMHQ="
            java.lang.String r1 = "IOz3xH4o"
            java.lang.String r0 = ea.a.p(r0, r1)
            kotlin.jvm.internal.g.i(r0)
            throw r4
        L65:
            java.lang.String r0 = "S4CkHTfw"
            java.lang.String r0 = ea.a.p(r2, r0)
            kotlin.jvm.internal.g.i(r0)
            throw r4
        L6f:
            java.lang.String r0 = "fcdVu64Y"
            java.lang.String r0 = ea.a.p(r1, r0)
            kotlin.jvm.internal.g.i(r0)
            throw r4
        L79:
            pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType r0 = r6.u2()
            pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType r1 = pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType.AI_UPLOAD
            if (r0 != r1) goto L85
            super.onBackPressed()
            goto L94
        L85:
            pdf.pdfreader.viewer.editor.free.ads.n r0 = pdf.pdfreader.viewer.editor.free.ads.n.f23972a
            pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity$onBackPressed$1 r1 = new pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity$onBackPressed$1
            r1.<init>()
            pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity$onBackPressed$2 r2 = new pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity$onBackPressed$2
            r2.<init>()
            r0.c(r6, r1, r2)
        L94:
            return
        L95:
            java.lang.String r0 = "jGC1l5cu"
            java.lang.String r0 = ea.a.p(r2, r0)
            kotlin.jvm.internal.g.i(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity.onBackPressed():void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity, pdf.pdfreader.viewer.editor.free.ui.act.a, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        String str;
        String str2;
        if (bundle != null) {
            this.f27023o0 = bundle.getString(ea.a.p("PGVQchpoaGM1bj5lG3Q=", "XXRhmX8g"));
            this.U = bundle.getInt(ea.a.p("PGFHZSZ0TnBl", "ACBXCCMT"));
        }
        super.onCreate(bundle);
        if (bundle == null) {
            this.U = getIntent().getIntExtra(ea.a.p("O3lBZQ==", "4oMuFnDT"), 0);
            try {
                this.V = (AIQuickTag) getIntent().getSerializableExtra(ea.a.p("PnVYYxJfQ2Fn", "gRdZx3mg"));
            } catch (Exception unused) {
            }
        }
        int i10 = this.U;
        if (13 <= i10 && i10 < 19) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            tn.a.d(this, ea.a.p("WGk=", "4b9mny99"), ea.a.p("EGkuaS1lbnMgb3c=", "vkqHA1mo"), ea.a.p("EW9GYWw=", "94e2XOCi"), false);
            String p10 = ea.a.p("Umk=", "kQkftk51");
            String p11 = ea.a.p("LmlXaRVlaHMyb3c=", "F2W4JtKT");
            if (this.U == 18) {
                str = "M2gIdA==";
                str2 = "6wPi7eyg";
            } else {
                str = "J29cZQ==";
                str2 = "mutV2nOn";
            }
            tn.a.d(this, p10, p11, ea.a.p(str, str2), false);
            return;
        }
        tn.a.d(this, ea.a.p("R28kbABfAWgdb0dl", "FdFBc5aP"), ea.a.p("O29ebApfVGg1bzllE2kEZWpzBm93", "4Omotyxb"), r2(), false);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a1 a1Var = this.f27026r0;
        if (a1Var != null) {
            a1Var.b();
        }
        this.f27026r0 = null;
        s2().removeCallbacksAndMessages(null);
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        super.onPause();
        EditText editText = this.f27014f0;
        if (editText != null) {
            editText.clearFocus();
        } else {
            kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "uz8prnSY"));
            throw null;
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity, jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        boolean z10 = false;
        if (this.f27028t0) {
            finish();
            this.f27028t0 = false;
        }
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
            if (FileRepository.G || FileRepository.I) {
                z10 = true;
            }
            if (!z10) {
                ReaderPdfApplication.k().h(true);
                FileRepository.A(this, new i(this));
                ConstraintLayout constraintLayout = this.f27021m0;
                if (constraintLayout != null) {
                    if (constraintLayout.getVisibility() == 0) {
                        ConstraintLayout constraintLayout2 = this.f27021m0;
                        if (constraintLayout2 != null) {
                            constraintLayout2.setVisibility(8);
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("Q2U5bRpzEWkdbmBpGXMaYT1vR3Q=", "d7j7l5gK"));
                            throw null;
                        }
                    }
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("P2VDbRBzRGk1bh5pBXMkYUxvG3Q=", "hgAdxM2r"));
                    throw null;
                }
            }
        } else if (t2().isEmpty()) {
            ReaderPdfApplication.k().h(true);
            FileRepository.A(this, new e());
        }
        a1 a1Var = this.f27026r0;
        if (a1Var != null) {
            a1Var.b();
        }
        this.f27026r0 = null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity, jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        String str;
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        EditText editText = this.f27014f0;
        String str2 = null;
        if (editText != null) {
            Editable text = editText.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                String p10 = ea.a.p("QGUqchBoPWMdbkBlB3Q=", "HFW80x5O");
                EditText editText2 = this.f27014f0;
                if (editText2 != null) {
                    Editable text2 = editText2.getText();
                    if (text2 != null) {
                        str2 = text2.toString();
                    }
                    outState.putString(p10, str2);
                    outState.putInt(ea.a.p("QGE9ZSx0G3Bl", "iFp8AAn0"), this.U);
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("KmRYdC1lT3Q=", "moYP86yx"));
                throw null;
            }
            return;
        }
        kotlin.jvm.internal.g.i(ea.a.p("KmRYdC1lT3Q=", "PLYoPEOe"));
        throw null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity
    @SuppressLint({"NotifyDataSetChanged"})
    public final void w2() {
        RecyclerView recyclerView = this.f27010b0;
        if (recyclerView != null) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        kotlin.jvm.internal.g.i(ea.a.p("PWVSeRpsUnIMaS93", "JWhfe68I"));
        throw null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity
    public final void x2() {
        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(this)) {
            return;
        }
        if (!t2().isEmpty()) {
            w0.a().c.execute(new androidx.fragment.app.a1(19, this, new l<List<? extends PdfPreviewEntity>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity$onFileReload$1
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(List<? extends PdfPreviewEntity> list) {
                    invoke2(list);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(List<? extends PdfPreviewEntity> it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    PDFChooseActivity pDFChooseActivity = PDFChooseActivity.this;
                    PDFChooseActivity.a aVar = PDFChooseActivity.f27008u0;
                    pDFChooseActivity.D2();
                }
            }));
            return;
        }
        D2();
    }

    /* compiled from: TextView.kt */
    /* loaded from: classes3.dex */
    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String valueOf = String.valueOf(editable);
            boolean isEmpty = TextUtils.isEmpty(valueOf);
            boolean z10 = false;
            PDFChooseActivity pDFChooseActivity = PDFChooseActivity.this;
            if (isEmpty) {
                ImageView imageView = pDFChooseActivity.f27015g0;
                if (imageView != null) {
                    imageView.setVisibility(4);
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("UGwuYQFJDHAHdH1tZw==", "zaelLLQ8"));
                    throw null;
                }
            } else {
                ImageView imageView2 = pDFChooseActivity.f27015g0;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("UGwuYQFJDHAHdH1tZw==", "K0TYLo6L"));
                    throw null;
                }
            }
            String str = pDFChooseActivity.f27023o0;
            if ((str == null || str.length() == 0) ? true : true) {
                pDFChooseActivity.C2(valueOf);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
