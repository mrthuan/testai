package pdf.pdfreader.viewer.editor.free.ui.act;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import industries.deepthought.decode.Decoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.bean.DataBridge;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.data.RecentAddRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptContainer;
import pdf.pdfreader.viewer.editor.free.merge.BaseMergeActivity;
import pdf.pdfreader.viewer.editor.free.merge.MergePdfData;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.adapter.l;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j2;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import wn.d;

/* compiled from: ReaderMergeChooserActivity.kt */
/* loaded from: classes3.dex */
public final class ReaderMergeChooserActivity extends BaseMergeActivity implements l.b, d.b {
    public ImageView L;
    public TextView M;
    public RecyclerView N;
    public TextView O;
    public Group P;
    public ImageView Q;
    public TextView R;
    public EditText S;
    public ImageView T;
    public TextView U;
    public Group V;
    public LinearLayout W;
    public LinearLayout X;
    public ConstraintLayout Y;
    public TextView Z;

    /* renamed from: a0  reason: collision with root package name */
    public View f26761a0;

    /* renamed from: d0  reason: collision with root package name */
    public String f26764d0;

    /* renamed from: f0  reason: collision with root package name */
    public final androidx.activity.result.c<String[]> f26766f0;

    /* renamed from: g0  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.utils.a1 f26767g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f26768h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f26769i0;

    /* renamed from: j0  reason: collision with root package name */
    public j2 f26770j0;

    /* renamed from: k0  reason: collision with root package name */
    public final pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c f26771k0;

    /* renamed from: l0  reason: collision with root package name */
    public final tf.c f26772l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f26773m0;

    /* renamed from: o0  reason: collision with root package name */
    public static final String f26760o0 = ea.a.p("JGVIXwlhUGUFZjhvbQ==", "kiNV6QVA");

    /* renamed from: n0  reason: collision with root package name */
    public static final a f26759n0 = new a();
    public final Handler K = new Handler(Looper.getMainLooper());

    /* renamed from: b0  reason: collision with root package name */
    public final tf.c f26762b0 = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.ui.adapter.l>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity$mergeAdapter$2
        {
            super(0);
        }

        @Override // cg.a
        public final pdf.pdfreader.viewer.editor.free.ui.adapter.l invoke() {
            ReaderMergeChooserActivity readerMergeChooserActivity = ReaderMergeChooserActivity.this;
            return new pdf.pdfreader.viewer.editor.free.ui.adapter.l(readerMergeChooserActivity, readerMergeChooserActivity);
        }
    });

    /* renamed from: c0  reason: collision with root package name */
    public final tf.c f26763c0 = kotlin.a.a(new cg.a<List<MergePdfData>>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity$backData$2
        @Override // cg.a
        public final List<MergePdfData> invoke() {
            return new ArrayList();
        }
    });

    /* renamed from: e0  reason: collision with root package name */
    public String f26765e0 = ea.a.p("IXVdbA==", "3MUFZhBL");

    /* compiled from: ReaderMergeChooserActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, String str) {
            kotlin.jvm.internal.g.e(context, "context");
            if (!TextUtils.equals(str, ea.a.p("LmRk", "yjrksnTu"))) {
                DataBridge.a().clear();
            }
            Intent intent = new Intent(context, ReaderMergeChooserActivity.class);
            intent.putExtra(ea.a.p("WGUyXwNhBWUtZkZvbQ==", "7QStNkxT"), str);
            context.startActivity(intent);
        }

        public static void b(Context context, String str, ArrayList arrayList) {
            kotlin.jvm.internal.g.e(context, "context");
            List a10 = DataBridge.a();
            a10.clear();
            a10.addAll(arrayList);
            Intent intent = new Intent(context, ReaderMergeChooserActivity.class);
            intent.putExtra(ea.a.p("WGUyXwNhBWUtZkZvbQ==", "K0EiJkN2"), str);
            context.startActivity(intent);
        }

        public static void c(Context context, MergePdfData mergePdfData, String str) {
            kotlin.jvm.internal.g.e(context, "context");
            List a10 = DataBridge.a();
            a10.clear();
            a10.add(mergePdfData);
            Intent intent = new Intent(context, ReaderMergeChooserActivity.class);
            intent.putExtra(ea.a.p("JmUvXwFhL2UXZhRvbQ==", "pVMVqHKj"), str);
            context.startActivity(intent);
        }
    }

    /* compiled from: ReaderMergeChooserActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements androidx.lifecycle.x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cg.l f26775a;

        public c(cg.l lVar) {
            ea.a.p("VXUlYwdpDW4=", "UAAZavsh");
            this.f26775a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final cg.l a() {
            return this.f26775a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.x) && (obj instanceof kotlin.jvm.internal.e)) {
                return kotlin.jvm.internal.g.a(this.f26775a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f26775a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f26775a.invoke(obj);
        }
    }

    public ReaderMergeChooserActivity() {
        androidx.activity.result.c<String[]> registerForActivityResult = registerForActivityResult(new j.b(), new h5.a(this, 17));
        kotlin.jvm.internal.g.d(registerForActivityResult, ea.a.p("QWUsaQB0B3I0b0ZBCnQ_di10S1IjczZstoDifVkgFiATIGsgUyBCIFJ9PiBJIHYgZCASfQ==", "TDS6F5To"));
        this.f26766f0 = registerForActivityResult;
        this.f26771k0 = new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c(this, 4);
        this.f26772l0 = kotlin.a.a(new cg.a<ArrayList<PdfPreviewEntity>>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity$pdfFiles$2
            @Override // cg.a
            public final ArrayList<PdfPreviewEntity> invoke() {
                return new ArrayList<>();
            }
        });
    }

    private final void X1(boolean z10) {
        j2 j2Var = new j2(this);
        this.f26770j0 = j2Var;
        if (z10) {
            v2(3);
            j2Var.c(1);
        } else {
            v2(2);
            j2Var.c(0);
        }
        j2Var.f27638i = new d(this, z10);
        j2 j2Var2 = this.f26770j0;
        if (j2Var2 != null) {
            j2Var2.show();
        }
    }

    public static void n2(ReaderMergeChooserActivity readerMergeChooserActivity, Map map) {
        kotlin.jvm.internal.g.e(readerMergeChooserActivity, ea.a.p("R2gic1cw", "ZyvLoSJ4"));
        readerMergeChooserActivity.I.removeCallbacks(readerMergeChooserActivity.f26771k0);
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue()) {
                z10 = false;
            }
        }
        if (!z10) {
            if (!k0.b.b(readerMergeChooserActivity, ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfLFgzRRhOJkwQU2VPK0FwRQ==", "QfFnigJg")) && !k0.b.b(readerMergeChooserActivity, ea.a.p("DG4Vcj9pLC44ZRRtXXMkaVdufFcbSWJFK0UpVBRSDEEhXyJUH1IJR0U=", "QTmqPHYy"))) {
                readerMergeChooserActivity.X1(true);
            } else {
                readerMergeChooserActivity.X1(false);
            }
        }
    }

    @Override // jl.a
    public final void C1() {
        boolean z10;
        View findViewById = findViewById(R.id.rootView);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQG8pdBVpJ3cp", "BXQ40Bzu"));
        this.f26761a0 = findViewById;
        View findViewById2 = findViewById(R.id.view_status_bar);
        ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        kotlin.jvm.internal.g.d(layoutParams, ea.a.p("IlZYZQ5TQ2EudTlCFHJGbFR5AXUxUARyVW1z", "NfEQ4QWL"));
        layoutParams.height = aj.b.B(this);
        findViewById2.setLayoutParams(layoutParams);
        View findViewById3 = findViewById(R.id.iv_select_back);
        kotlin.jvm.internal.g.d(findViewById3, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuB3YacwBsCWMZXzNhV2sp", "iXAllmQ4"));
        this.L = (ImageView) findViewById3;
        View findViewById4 = findViewById(R.id.tv_select_num);
        kotlin.jvm.internal.g.d(findViewById4, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuRnYZcyZsH2M4XwZ1BSk=", "zLhhdK5s"));
        this.M = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.merge_recycler_view);
        kotlin.jvm.internal.g.d(findViewById5, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuX2U0ZyZfR2VaeVVsCXJsdiJlBCk=", "596lArVz"));
        this.N = (RecyclerView) findViewById5;
        View findViewById6 = findViewById(R.id.tv_continue);
        kotlin.jvm.internal.g.d(findViewById6, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuRnYZYyxuRmkcdTcp", "2rR2czxS"));
        this.O = (TextView) findViewById6;
        View findViewById7 = findViewById(R.id.no_file_group);
        kotlin.jvm.internal.g.d(findViewById7, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuAG8aZgxsA18FciB1RCk=", "vsp2fbO4"));
        this.P = (Group) findViewById7;
        View findViewById8 = findViewById(R.id.no_file_iv);
        kotlin.jvm.internal.g.d(findViewById8, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuXG8ZZipsFl9Ydik=", "s1bAn4fa"));
        this.Q = (ImageView) findViewById8;
        View findViewById9 = findViewById(R.id.no_file_tv);
        kotlin.jvm.internal.g.d(findViewById9, ea.a.p("LmkYZBxpV3cKeS9kHFJ5aVwuPG8WZl9sEV8Fdik=", "TuHvJ2fI"));
        this.R = (TextView) findViewById9;
        View findViewById10 = findViewById(R.id.result_count_tv);
        kotlin.jvm.internal.g.d(findViewById10, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQGU1dS90KWNZdV90HXRFKQ==", "v61BFuat"));
        this.U = (TextView) findViewById10;
        View findViewById11 = findViewById(R.id.result_group);
        kotlin.jvm.internal.g.d(findViewById11, ea.a.p("UGkUZBxpXHcKeS9kHFJ5aVwuIGU6dVp0K2cDbyRwKQ==", "3c6zJ9yW"));
        this.V = (Group) findViewById11;
        View findViewById12 = findViewById(R.id.search_et);
        kotlin.jvm.internal.g.d(findViewById12, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQWUnciBoaGU7KQ==", "7OMcLB0V"));
        this.S = (EditText) findViewById12;
        String str = this.f26764d0;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            EditText editText = this.S;
            if (editText != null) {
                editText.setText(this.f26764d0);
                this.f26764d0 = "";
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("KmRYdC1lT3Q=", "BL88h2Ez"));
                throw null;
            }
        }
        View findViewById13 = findViewById(R.id.search_clear_iv);
        kotlin.jvm.internal.g.d(findViewById13, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHWUkcgZobGMuZQhyL2k5KQ==", "NuxU3Bip"));
        this.T = (ImageView) findViewById13;
        View findViewById14 = findViewById(R.id.ll_refresh_has_data);
        kotlin.jvm.internal.g.d(findViewById14, ea.a.p("M2lcZBdpXHcKeS9kHFJ5aVwuPmwWclNmBmUCaA5oI3MKZFN0ICk=", "VIU2A9tO"));
        this.W = (LinearLayout) findViewById14;
        View findViewById15 = findViewById(R.id.ll_refresh_no_data);
        kotlin.jvm.internal.g.d(findViewById15, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuXmwZciZmRmUjaDhuBF9XYT9hKQ==", "4Pgk0wqZ"));
        this.X = (LinearLayout) findViewById15;
        View findViewById16 = findViewById(R.id.permissionTipsLayout);
        kotlin.jvm.internal.g.d(findViewById16, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQmU0bSpzHmkBbh9pSHN_YTJvBnQp", "mnK8yS9f"));
        this.Y = (ConstraintLayout) findViewById16;
        View findViewById17 = findViewById(R.id.tvPermissionTips);
        kotlin.jvm.internal.g.d(findViewById17, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuRnYWZTFtPXMSaRpuA2lDcyk=", "TauW2h7E"));
        this.Z = (TextView) findViewById17;
    }

    @Override // jl.a
    public final View D1() {
        View view = this.f26761a0;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.g.i(ea.a.p("QW8kdCVpB3c=", "ClHGFzia"));
        throw null;
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_merge_pdf_chooser;
    }

    @Override // jl.a
    public final void K1() {
        View view = this.f26761a0;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.h0
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    int height;
                    boolean z10;
                    ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
                    String p10 = ea.a.p("O2hYc10w", "CwrEkzxp");
                    ReaderMergeChooserActivity readerMergeChooserActivity = ReaderMergeChooserActivity.this;
                    kotlin.jvm.internal.g.e(readerMergeChooserActivity, p10);
                    Rect rect = new Rect();
                    View view2 = readerMergeChooserActivity.f26761a0;
                    if (view2 != null) {
                        view2.getWindowVisibleDisplayFrame(rect);
                        View view3 = readerMergeChooserActivity.f26761a0;
                        if (view3 != null) {
                            if (height - rect.bottom > view3.getRootView().getHeight() * 0.15d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 != readerMergeChooserActivity.f26768h0) {
                                readerMergeChooserActivity.f26768h0 = z10;
                                if (z10) {
                                    EditText editText = readerMergeChooserActivity.S;
                                    if (editText != null) {
                                        if (editText.hasFocus()) {
                                            if (kotlin.jvm.internal.g.a(readerMergeChooserActivity.f26765e0, ea.a.p("R28kbHM=", "F3AuJT5X"))) {
                                                tn.a.d(readerMergeChooserActivity, ea.a.p("R28kbABfAWgdb0dl", "JJAr1HD0"), ea.a.p("O29ebApfRGU7ciloKmMEaVZr", "FJipuNiV"), ea.a.p("XmU5Z2U=", "KGGStgoW"), false);
                                            } else {
                                                tn.a.b(readerMergeChooserActivity, ea.a.p("ImVDZ2U=", "JRRfMDwI"), ea.a.p("UGgkbwBlBGkeZWtzDGEkYyxfUWwvY2s=", "BBNiStFQ"));
                                            }
                                        }
                                        ea.a.p("P2RXQxFvWHM_QSl0HHYBdHk=", "IxksAdtA");
                                        ea.a.p("QGgkd1NrB3kQb1VyZA==", "nmGo9aak");
                                        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                                        return;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWQudBNlDnQ=", "EM4GGv7k"));
                                    throw null;
                                }
                                ea.a.p("P2RXQxFvWHM_QSl0HHYBdHk=", "BEFP4itr");
                                ea.a.p("J2lVZVlrUnk4bytyZA==", "ywUGQXGX");
                                String str2 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                                return;
                            }
                            return;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("Q282dGFpEnc=", "Kq1Y7wTR"));
                        throw null;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("PW9edC9pUnc=", "1rQ6sAzJ"));
                    throw null;
                }
            });
            if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
                EventCenter.f(ea.a.p("R28kbHM=", "aQ1xU3M9"));
                EventCenter.c(this);
                ConstraintLayout constraintLayout = this.Y;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                    if (!pdf.pdfreader.viewer.editor.free.utils.h1.c()) {
                        String string = getString(R.string.arg_res_0x7f1302ae);
                        kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQG4gZQFfGHQCclVnVF89ZVBkJmZebD9zFTEp", "n4Qwkm41"));
                        TextView textView = this.Z;
                        if (textView != null) {
                            textView.setText(aj.b.T(androidx.core.content.a.getColor(this, R.color.colorAccent), string));
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("O3ZhZQttXnMpaSVuIWkYcw==", "rvjVi6Iu"));
                            throw null;
                        }
                    } else {
                        EventCenter.f28661h = ea.a.p("XW8_aRBlUzE=", "g5eRfM5M");
                        EventCenter.f28660g = ea.a.p("XmU5Z2U=", "VLj0Q3UZ");
                        EventCenter.e(this);
                        String string2 = getString(R.string.arg_res_0x7f130462);
                        kotlin.jvm.internal.g.d(string2, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQHMgbABjIV8ZbwBlFWYmbFRzJmFUYz9zOV8ScBwp", "kM6nUtrJ"));
                        TextView textView2 = this.Z;
                        if (textView2 != null) {
                            textView2.setText(aj.b.T(androidx.core.content.a.getColor(this, R.color.colorAccent), string2));
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("LHYAZRZtLXM7aQluYGkncw==", "DPXPdDp7"));
                            throw null;
                        }
                    }
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("P2VDbRBzRGk1bh5pBXMkYUxvG3Q=", "wyhGTfGF"));
                    throw null;
                }
            }
            ImageView imageView = this.L;
            if (imageView != null) {
                imageView.setOnClickListener(new d9.f(this, 16));
                ImageView imageView2 = this.T;
                if (imageView2 != null) {
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.e(imageView2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity$initView$3
                        {
                            super(1);
                        }

                        @Override // cg.l
                        public /* bridge */ /* synthetic */ tf.d invoke(View view2) {
                            invoke2(view2);
                            return tf.d.f30009a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(View it) {
                            kotlin.jvm.internal.g.e(it, "it");
                            EditText editText = ReaderMergeChooserActivity.this.S;
                            if (editText != null) {
                                editText.setText("");
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "FcEk4f0O"));
                                throw null;
                            }
                        }
                    });
                    ((InterceptTouchFrameLayout) findViewById(R.id.recycler_container)).setTopTouchListener(new d9.g(this, 17));
                    RecyclerView recyclerView = this.N;
                    if (recyclerView != null) {
                        recyclerView.setHasFixedSize(true);
                        recyclerView.setAdapter(q2());
                        ConstraintLayout constraintLayout2 = this.Y;
                        if (constraintLayout2 != null) {
                            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(constraintLayout2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity$initView$6
                                {
                                    super(1);
                                }

                                @Override // cg.l
                                public /* bridge */ /* synthetic */ tf.d invoke(View view2) {
                                    invoke2(view2);
                                    return tf.d.f30009a;
                                }

                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2(View it) {
                                    kotlin.jvm.internal.g.e(it, "it");
                                    AppOpenManager.c().f23907g = false;
                                    if (pdf.pdfreader.viewer.editor.free.utils.h1.c()) {
                                        pdf.pdfreader.viewer.editor.free.utils.r0.c(ReaderMergeChooserActivity.this);
                                        ReaderMergeChooserActivity readerMergeChooserActivity = ReaderMergeChooserActivity.this;
                                        if (readerMergeChooserActivity.f26767g0 == null) {
                                            readerMergeChooserActivity.f26767g0 = new pdf.pdfreader.viewer.editor.free.utils.a1(readerMergeChooserActivity, ReaderMergeChooserActivity.class, null);
                                        }
                                        pdf.pdfreader.viewer.editor.free.utils.a1 a1Var = ReaderMergeChooserActivity.this.f26767g0;
                                        if (a1Var != null) {
                                            a1Var.c();
                                            return;
                                        }
                                        return;
                                    }
                                    ReaderMergeChooserActivity readerMergeChooserActivity2 = ReaderMergeChooserActivity.this;
                                    ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
                                    readerMergeChooserActivity2.I.postDelayed(readerMergeChooserActivity2.f26771k0, 500L);
                                    ReaderMergeChooserActivity.this.f26766f0.a(new String[]{ea.a.p("U24wcgJpXS44ZRRtXXMkaVdufFIMQXJfMVglRQNOA0xtUwBPP0F-RQ==", "Wg2Tm9J2"), ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFcUSRdFDEVuVDBSAEF_XxhUPFIjR0U=", "S6uNQT7z")});
                                }
                            });
                            TextView textView3 = this.O;
                            if (textView3 != null) {
                                pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView3, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity$initView$7

                                    /* compiled from: ReaderMergeChooserActivity.kt */
                                    /* loaded from: classes3.dex */
                                    public static final class a implements DecryptAndCopyUIHelper.b {

                                        /* renamed from: a  reason: collision with root package name */
                                        public final /* synthetic */ ReaderMergeChooserActivity f26778a;

                                        public a(ReaderMergeChooserActivity readerMergeChooserActivity) {
                                            this.f26778a = readerMergeChooserActivity;
                                        }

                                        @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
                                        public final void a(List<DecryptContainer> result) {
                                            Object obj;
                                            boolean z10;
                                            kotlin.jvm.internal.g.e(result, "result");
                                            for (MergePdfData mergePdfData : DataBridge.a()) {
                                                Iterator<T> it = result.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        obj = it.next();
                                                        if (((DecryptContainer) obj).getPdfPreviewEntity().getId() == mergePdfData.getId()) {
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
                                                DecryptContainer decryptContainer = (DecryptContainer) obj;
                                                if (decryptContainer != null) {
                                                    mergePdfData.setCopyPath(decryptContainer.getNewPath());
                                                }
                                            }
                                            ReaderMergeChooserActivity readerMergeChooserActivity = this.f26778a;
                                            if (!kotlin.jvm.internal.g.a(readerMergeChooserActivity.f26765e0, ea.a.p("UmRk", "SFvbZslg"))) {
                                                tn.a.d(readerMergeChooserActivity, ea.a.p("XmU5Z2U=", "N9xIgQw0"), ea.a.p("XmU5ZxZfEWgddw==", "xhtS61yr"), ea.a.p("BGg2bwJlMGkkZQ==", "7ugYqVJP"), false);
                                            }
                                            int i10 = ReaderMergePdfActivity.f26780f0;
                                            ReaderMergePdfActivity.a.a(readerMergeChooserActivity, EmptyList.INSTANCE);
                                            readerMergeChooserActivity.finish();
                                        }
                                    }

                                    /* compiled from: ReaderMergeChooserActivity.kt */
                                    /* loaded from: classes3.dex */
                                    public static final class b implements DecryptAndCopyUIHelper.a {

                                        /* renamed from: a  reason: collision with root package name */
                                        public final /* synthetic */ ReaderMergeChooserActivity f26779a;

                                        public b(ReaderMergeChooserActivity readerMergeChooserActivity) {
                                            this.f26779a = readerMergeChooserActivity;
                                        }

                                        @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.a
                                        public final void a() {
                                            tn.a.d(this.f26779a, ea.a.p("R28kbABfAWgdb0dl", "YnxTB3aZ"), ea.a.p("O29ebApfR3MtZBVlB3IHcg==", "DLzKjbdM"), ea.a.p("XmU5Z2U=", "0We6H1I5"), false);
                                        }

                                        @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.a
                                        public final void b() {
                                            tn.a.d(this.f26779a, ea.a.p("Q28lbD5fNGgnbxVl", "Qs7JMWw3"), ea.a.p("O29ebApfR3MtZBVzHW93", "kgsx8O82"), ea.a.p("ImVDZ2U=", "YxykyFln"), false);
                                        }
                                    }

                                    {
                                        super(1);
                                    }

                                    @Override // cg.l
                                    public /* bridge */ /* synthetic */ tf.d invoke(View view2) {
                                        invoke2(view2);
                                        return tf.d.f30009a;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(View it) {
                                        int i10;
                                        kotlin.jvm.internal.g.e(it, "it");
                                        ReaderMergeChooserActivity readerMergeChooserActivity = ReaderMergeChooserActivity.this;
                                        if (readerMergeChooserActivity.f26769i0) {
                                            tn.a.b(readerMergeChooserActivity, ea.a.p("ImVDZ2U=", "eE6QQAKd"), ea.a.p("UGgkbwBlBGkeZWtzDGEkYyxfVm8oZQ==", "M9xZ5Qvl"));
                                        }
                                        ReaderMergeChooserActivity readerMergeChooserActivity2 = ReaderMergeChooserActivity.this;
                                        String p10 = ea.a.p("XmU5Z2U=", "W60N9qCW");
                                        String p11 = ea.a.p("LGhebwplUWk2ZRVjGm4caVt1C18mbAxjaw==", "MxEXRTgB");
                                        String str = ReaderMergeChooserActivity.this.f26765e0;
                                        List<MergePdfData> a10 = DataBridge.a();
                                        if ((a10 instanceof Collection) && a10.isEmpty()) {
                                            i10 = 0;
                                        } else {
                                            i10 = 0;
                                            for (MergePdfData mergePdfData : a10) {
                                                if (mergePdfData.getNeedPassword() && (i10 = i10 + 1) < 0) {
                                                    throw new ArithmeticException("Count overflow has happened.");
                                                }
                                            }
                                        }
                                        tn.a.d(readerMergeChooserActivity2, p10, p11, str + "_" + i10, false);
                                        ArrayList arrayList = new ArrayList();
                                        for (MergePdfData mergePdfData2 : DataBridge.a()) {
                                            if (mergePdfData2.getNeedPassword()) {
                                                if (mergePdfData2.getCopyPath().length() == 0) {
                                                    arrayList.add(mergePdfData2.getPdf());
                                                }
                                            }
                                        }
                                        if (arrayList.isEmpty()) {
                                            if (!kotlin.jvm.internal.g.a(ReaderMergeChooserActivity.this.f26765e0, ea.a.p("UmRk", "OnRoQqSK"))) {
                                                tn.a.d(ReaderMergeChooserActivity.this, ea.a.p("XmU5Z2U=", "AnivSiaG"), ea.a.p("XmU5ZxZfEWgddw==", "uN456XOr"), ea.a.p("UGgkbwBlBGkeZQ==", "5Cqo6glv"), false);
                                            }
                                            int i11 = ReaderMergePdfActivity.f26780f0;
                                            ReaderMergeChooserActivity context = ReaderMergeChooserActivity.this;
                                            kotlin.jvm.internal.g.e(context, "context");
                                            ReaderMergePdfActivity.a.a(context, EmptyList.INSTANCE);
                                            ReaderMergeChooserActivity.this.finish();
                                            return;
                                        }
                                        ReaderMergeChooserActivity readerMergeChooserActivity3 = ReaderMergeChooserActivity.this;
                                        DecryptAndCopyUIHelper decryptAndCopyUIHelper = new DecryptAndCopyUIHelper(readerMergeChooserActivity3, arrayList, new a(readerMergeChooserActivity3));
                                        ReaderMergeChooserActivity readerMergeChooserActivity4 = ReaderMergeChooserActivity.this;
                                        if (kotlin.jvm.internal.g.a(readerMergeChooserActivity4.f26765e0, ea.a.p("O29ebHM=", "xcnJM8uA"))) {
                                            decryptAndCopyUIHelper.f24225j = new b(readerMergeChooserActivity4);
                                        }
                                        decryptAndCopyUIHelper.g();
                                    }
                                });
                                EditText editText = this.S;
                                if (editText != null) {
                                    editText.setOnClickListener(new g(this, 2));
                                    EditText editText2 = this.S;
                                    if (editText2 != null) {
                                        editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.i0
                                            @Override // android.view.View.OnFocusChangeListener
                                            public final void onFocusChange(View view2, boolean z10) {
                                                ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
                                                String p10 = ea.a.p("R2gic1cw", "Iq2jSu7E");
                                                ReaderMergeChooserActivity readerMergeChooserActivity = ReaderMergeChooserActivity.this;
                                                kotlin.jvm.internal.g.e(readerMergeChooserActivity, p10);
                                                if (z10) {
                                                    readerMergeChooserActivity.f26769i0 = true;
                                                }
                                            }
                                        });
                                        final EditText editText3 = this.S;
                                        if (editText3 != null) {
                                            editText3.setImeOptions(268435459);
                                            editText3.addTextChangedListener(new b());
                                            editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.j0
                                                @Override // android.widget.TextView.OnEditorActionListener
                                                public final boolean onEditorAction(TextView textView4, int i10, KeyEvent keyEvent) {
                                                    ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
                                                    String p10 = ea.a.p("a3QqaTFfBXA4bHk=", "wGOBBdO7");
                                                    EditText editText4 = editText3;
                                                    kotlin.jvm.internal.g.e(editText4, p10);
                                                    String p11 = ea.a.p("R2gic1cw", "h25Ml4ah");
                                                    ReaderMergeChooserActivity readerMergeChooserActivity = this;
                                                    kotlin.jvm.internal.g.e(readerMergeChooserActivity, p11);
                                                    if (i10 == 0 || i10 == 3) {
                                                        CharSequence text = textView4.getText();
                                                        String str = (text == null || (str = text.toString()) == null) ? "" : "";
                                                        pdf.pdfreader.viewer.editor.free.utils.extension.g.a(editText4);
                                                        if (!TextUtils.isEmpty(str)) {
                                                            readerMergeChooserActivity.p2(str);
                                                            return true;
                                                        }
                                                    }
                                                    return false;
                                                }
                                            });
                                            if (!RecentAddRepository.f24181a) {
                                                FileRepository.A(this, new pdf.pdfreader.viewer.editor.free.merge.a(this));
                                                return;
                                            }
                                            FileRepository.f24155a.getClass();
                                            m2(FileRepository.m());
                                            return;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "4aIwUYAV"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "qW6gj70b"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("KmRYdC1lT3Q=", "gBj2chu1"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("Vng7bwF0IHRu", "rrAg8aZG"));
                            throw null;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("HmVEbV1zAmknbjJpRHMbYUFvJ3Q=", "ecn64qQE"));
                        throw null;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("XmU5ZxZSdg==", "3q05j77N"));
                    throw null;
                }
                kotlin.jvm.internal.g.i(ea.a.p("B2wCYQJJJnA9dC9tZw==", "vIdgpHb4"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("UWEoazptZw==", "fLVhpZSs"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("BW8MdDBpF3c=", "78wcfrxv"));
        throw null;
    }

    @Override // jl.a
    public final void L1() {
        ReaderPdfApplication.k().f28150g.e(this, new c(new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity$initViewModel$1
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
                if (bool == null || pdf.pdfreader.viewer.editor.free.utils.extension.a.b(ReaderMergeChooserActivity.this)) {
                    return;
                }
                if (bool.booleanValue()) {
                    ReaderMergeChooserActivity readerMergeChooserActivity = ReaderMergeChooserActivity.this;
                    ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
                    if (readerMergeChooserActivity.q2().getItemCount() > 0) {
                        LinearLayout linearLayout = ReaderMergeChooserActivity.this.W;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(0);
                            LinearLayout linearLayout2 = ReaderMergeChooserActivity.this.X;
                            if (linearLayout2 == null) {
                                kotlin.jvm.internal.g.i(ea.a.p("H2wQZVJyLXMgTglEVXRh", "1VsB4HPg"));
                                throw null;
                            }
                            linearLayout2.setVisibility(8);
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("I2xjZR9yUnMySCtzMWEcYQ==", "hG2kGM8o"));
                            throw null;
                        }
                    } else {
                        LinearLayout linearLayout3 = ReaderMergeChooserActivity.this.X;
                        if (linearLayout3 != null) {
                            linearLayout3.setVisibility(0);
                            LinearLayout linearLayout4 = ReaderMergeChooserActivity.this.W;
                            if (linearLayout4 != null) {
                                linearLayout4.setVisibility(8);
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("Kmw_ZR9yCHMgSAdzcGEjYQ==", "Q7FmymsH"));
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("I2xjZR9yUnMyTiVEFHRh", "yoObphQr"));
                            throw null;
                        }
                    }
                    Group group = ReaderMergeChooserActivity.this.P;
                    if (group != null) {
                        group.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("Vm07dApMA3kddXQ=", "uU2CRFq0"));
                        throw null;
                    }
                }
                LinearLayout linearLayout5 = ReaderMergeChooserActivity.this.W;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                    LinearLayout linearLayout6 = ReaderMergeChooserActivity.this.X;
                    if (linearLayout6 != null) {
                        linearLayout6.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("I2xjZR9yUnMyTiVEFHRh", "DkwiIoDk"));
                        throw null;
                    }
                }
                kotlin.jvm.internal.g.i(ea.a.p("OmwhZQJyBnMgSAdzcGEjYQ==", "YfVsdcHl"));
                throw null;
            }
        }));
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.l.b
    public final void a(int i10) {
        boolean z10;
        TextView textView = this.O;
        if (textView != null) {
            if (i10 > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            textView.setEnabled(z10);
            TextView textView2 = this.M;
            if (textView2 != null) {
                textView2.setText(getString(R.string.arg_res_0x7f130416, String.valueOf(i10)));
                return;
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("QGUnZRB0LHUfYlFyPXY=", "R5Lw1t6U"));
                throw null;
            }
        }
        kotlin.jvm.internal.g.i(ea.a.p("KnhBbwt0dXRu", "hWhoJOiP"));
        throw null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.l.b
    public final void b(int i10) {
        if (kotlin.jvm.internal.g.a(this.f26765e0, ea.a.p("O29ebHM=", "RmUAAThR"))) {
            tn.a.d(this, ea.a.p("O29ebApfVGg1bzll", "tgTIKEXe"), ea.a.p("EW8VbCdfLWkkZTljWGk0aw==", "49ezTKfW"), ea.a.p("ImVDZ2U=", "LlYyMUWW"), false);
        }
        final PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) kotlin.collections.m.t0(i10, q2().f27261f);
        if (pdfPreviewEntity != null) {
            if (q2().f27263h.contains(Long.valueOf(pdfPreviewEntity.getId()))) {
                q2().f27263h.remove(Long.valueOf(pdfPreviewEntity.getId()));
                q2().getClass();
                kotlin.collections.k.m0(DataBridge.a(), new cg.l<MergePdfData, Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity$onItemClick$1$1
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public final Boolean invoke(MergePdfData it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        return Boolean.valueOf(it.getId() == PdfPreviewEntity.this.getId());
                    }
                });
                a(q2().f27263h.size());
                q2().notifyItemChanged(i10, ge.a.H(""));
                return;
            }
            V1();
            pdf.pdfreader.viewer.editor.free.utils.w0.a().f28790a.execute(new yk.d(this, pdfPreviewEntity, i10));
        }
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
            u2();
        } else {
            t2(arrayList);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.merge.BaseMergeActivity
    @SuppressLint({"NotifyDataSetChanged"})
    public final void l2() {
        q2().notifyDataSetChanged();
    }

    @Override // pdf.pdfreader.viewer.editor.free.merge.BaseMergeActivity
    public final void m2(List<? extends PdfPreviewEntity> pdfList) {
        kotlin.jvm.internal.g.e(pdfList, "pdfList");
        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(this)) {
            return;
        }
        r2().clear();
        r2().addAll(pdfList);
        if (!r2().isEmpty()) {
            pdf.pdfreader.viewer.editor.free.utils.w0.a().c.execute(new l.r(27, this, new cg.l<List<? extends PdfPreviewEntity>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity$onPdfReady$1
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
                    ReaderMergeChooserActivity readerMergeChooserActivity = ReaderMergeChooserActivity.this;
                    ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
                    readerMergeChooserActivity.s2();
                }
            }));
            return;
        }
        s2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r0 == false) goto L42;
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBackPressed() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity.onBackPressed():void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.merge.BaseMergeActivity, pdf.pdfreader.viewer.editor.free.ui.act.a, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        char c10;
        char c11;
        if (bundle != null) {
            this.f26764d0 = bundle.getString(ea.a.p("PGVQchpoaGM1bj5lG3Q=", "AuLllDeI"));
        }
        super.onCreate(bundle);
        if (Decoder.f18572a) {
            try {
                String substring = gc.a.b(this).substring(2281, 2312);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset = kotlin.text.a.f19966b;
                byte[] bytes = substring.getBytes(charset);
                kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] bytes2 = "3c34342c8cd53f731aa5c551ab78de9".getBytes(charset);
                kotlin.jvm.internal.g.d(bytes2, "this as java.lang.String).getBytes(charset)");
                long j10 = 2;
                if (System.currentTimeMillis() % j10 == 0) {
                    int nextInt = gc.a.f17749a.nextInt(0, bytes.length / 2);
                    int i10 = 0;
                    while (true) {
                        if (i10 <= nextInt) {
                            if (bytes[i10] != bytes2[i10]) {
                                c11 = 16;
                                break;
                            }
                            i10++;
                        } else {
                            c11 = 0;
                            break;
                        }
                    }
                    if ((c11 ^ 0) != 0) {
                        gc.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes2, bytes)) {
                    gc.a.a();
                    throw null;
                }
                try {
                    String substring2 = tc.a.b(this).substring(1639, 1670);
                    kotlin.jvm.internal.g.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    Charset charset2 = kotlin.text.a.f19966b;
                    byte[] bytes3 = substring2.getBytes(charset2);
                    kotlin.jvm.internal.g.d(bytes3, "this as java.lang.String).getBytes(charset)");
                    byte[] bytes4 = "8e8c2084a97ea946376fbdc096921f5".getBytes(charset2);
                    kotlin.jvm.internal.g.d(bytes4, "this as java.lang.String).getBytes(charset)");
                    if (System.currentTimeMillis() % j10 == 0) {
                        int nextInt2 = tc.a.f29999a.nextInt(0, bytes3.length / 2);
                        int i11 = 0;
                        while (true) {
                            if (i11 <= nextInt2) {
                                if (bytes3[i11] != bytes4[i11]) {
                                    c10 = 16;
                                    break;
                                }
                                i11++;
                            } else {
                                c10 = 0;
                                break;
                            }
                        }
                        if ((c10 ^ 0) != 0) {
                            tc.a.a();
                            throw null;
                        }
                    } else if (!Arrays.equals(bytes4, bytes3)) {
                        tc.a.a();
                        throw null;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    tc.a.a();
                    throw null;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                gc.a.a();
                throw null;
            }
        } else {
            ReaderPdfApplication.o(this);
        }
        String stringExtra = getIntent().getStringExtra(f26760o0);
        if (stringExtra == null) {
            stringExtra = ea.a.p("XXUnbA==", "UkairDe2");
        }
        this.f26765e0 = stringExtra;
        if (kotlin.jvm.internal.g.a(stringExtra, ea.a.p("UmRk", "R1ztBh5t"))) {
            ((List) this.f26763c0.getValue()).addAll(kotlin.collections.m.E0(DataBridge.a()));
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.merge.BaseMergeActivity, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        j2 j2Var;
        super.onDestroy();
        j2 j2Var2 = this.f26770j0;
        boolean z10 = false;
        if (j2Var2 != null && j2Var2.isShowing()) {
            z10 = true;
        }
        if (z10 && (j2Var = this.f26770j0) != null) {
            j2Var.dismiss();
        }
        pdf.pdfreader.viewer.editor.free.utils.a1 a1Var = this.f26767g0;
        if (a1Var != null) {
            a1Var.b();
        }
        this.f26767g0 = null;
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        super.onPause();
        EditText editText = this.S;
        if (editText != null) {
            editText.clearFocus();
        } else {
            kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "G6iawrPL"));
            throw null;
        }
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        boolean z10 = false;
        if (this.f26773m0) {
            this.f26773m0 = false;
            this.K.postDelayed(new g0(this, 0), 10L);
            return;
        }
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
            if (FileRepository.G || FileRepository.I) {
                z10 = true;
            }
            if (!z10) {
                ReaderPdfApplication.k().h(true);
                FileRepository.A(this, new l0(this));
                ConstraintLayout constraintLayout = this.Y;
                if (constraintLayout != null) {
                    if (constraintLayout.getVisibility() == 0) {
                        ConstraintLayout constraintLayout2 = this.Y;
                        if (constraintLayout2 != null) {
                            constraintLayout2.setVisibility(8);
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("Q2U5bRpzEWkdbmBpGXMaYT1vR3Q=", "sZ3VWFlS"));
                            throw null;
                        }
                    }
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("P2VDbRBzRGk1bh5pBXMkYUxvG3Q=", "D6mZ1rvV"));
                    throw null;
                }
            }
        }
        pdf.pdfreader.viewer.editor.free.utils.a1 a1Var = this.f26767g0;
        if (a1Var != null) {
            a1Var.b();
        }
        this.f26767g0 = null;
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        String str;
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        EditText editText = this.S;
        String str2 = null;
        if (editText != null) {
            Editable text = editText.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                String p10 = ea.a.p("PGVQchpoaGM1bj5lG3Q=", "WOeQ3UdD");
                EditText editText2 = this.S;
                if (editText2 != null) {
                    Editable text2 = editText2.getText();
                    if (text2 != null) {
                        str2 = text2.toString();
                    }
                    outState.putString(p10, str2);
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("KmRYdC1lT3Q=", "U4gA3fWg"));
                throw null;
            }
            return;
        }
        kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "paePyxS4"));
        throw null;
    }

    public final void p2(String str) {
        if (str != null) {
            if (!r2().isEmpty()) {
                new wn.d(r2(), this).getFilter().filter(str);
            } else {
                u2();
            }
        }
    }

    public final pdf.pdfreader.viewer.editor.free.ui.adapter.l q2() {
        return (pdf.pdfreader.viewer.editor.free.ui.adapter.l) this.f26762b0.getValue();
    }

    public final ArrayList<PdfPreviewEntity> r2() {
        return (ArrayList) this.f26772l0.getValue();
    }

    public final void s2() {
        String str;
        EditText editText = this.S;
        String str2 = null;
        if (editText != null) {
            Editable text = editText.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                EditText editText2 = this.S;
                if (editText2 != null) {
                    Editable text2 = editText2.getText();
                    if (text2 != null) {
                        str2 = text2.toString();
                    }
                    p2(str2);
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "0IQy916w"));
                throw null;
            } else if (r2().isEmpty()) {
                u2();
                return;
            } else {
                t2(r2());
                return;
            }
        }
        kotlin.jvm.internal.g.i(ea.a.p("FGQMdA1lN3Q=", "CdqeYOQq"));
        throw null;
    }

    public final void t2(List<? extends PdfPreviewEntity> list) {
        LinearLayout linearLayout = this.W;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = this.X;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
                Group group = this.P;
                if (group != null) {
                    group.setVisibility(8);
                    Group group2 = this.V;
                    if (group2 != null) {
                        group2.setVisibility(0);
                        pdf.pdfreader.viewer.editor.free.ui.adapter.l q22 = q2();
                        EditText editText = this.S;
                        if (editText != null) {
                            Editable text = editText.getText();
                            String str = (text == null || (str = text.toString()) == null) ? "" : "";
                            q22.getClass();
                            q22.f27266k = str;
                            kotlin.jvm.internal.g.e(list, "list");
                            ArrayList arrayList = q22.f27262g;
                            arrayList.clear();
                            arrayList.addAll(list);
                            q22.h();
                            if (list.size() <= 1) {
                                TextView textView = this.U;
                                if (textView != null) {
                                    textView.setText(getString(R.string.arg_res_0x7f130413, String.valueOf(list.size())));
                                    return;
                                } else {
                                    kotlin.jvm.internal.g.i(ea.a.p("QWU4dR90IW8HbnQ=", "cS1bjPNi"));
                                    throw null;
                                }
                            }
                            TextView textView2 = this.U;
                            if (textView2 != null) {
                                textView2.setText(getString(R.string.arg_res_0x7f130415, String.valueOf(list.size())));
                                return;
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("QWU4dR90IW8HbnQ=", "BULSalmV"));
                                throw null;
                            }
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("KmRYdC1lT3Q=", "NGKs1XpI"));
                        throw null;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("AmU1dRZ0dXIndXA=", "HWpFz2js"));
                    throw null;
                }
                kotlin.jvm.internal.g.i(ea.a.p("Vm07dApMA3kddXQ=", "eYl5cQmc"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("I2xjZR9yUnMyTiVEFHRh", "oRRCXcv2"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("I2xjZR9yUnMySCtzMWEcYQ==", "PYMDkwZp"));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        if (r0 == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u2() {
        /*
            r5 = this;
            android.widget.EditText r0 = r5.S
            r1 = 0
            if (r0 == 0) goto Lb8
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
            java.lang.String r0 = "Km1BdABUdg=="
            if (r3 == 0) goto L50
            android.widget.ImageView r3 = r5.Q
            if (r3 == 0) goto L44
            r4 = 2131231488(0x7f080300, float:1.8079058E38)
            r3.setImageResource(r4)
            android.widget.TextView r3 = r5.R
            if (r3 == 0) goto L39
            r0 = 2131952515(0x7f130383, float:1.9541475E38)
            r3.setText(r0)
            goto L64
        L39:
            java.lang.String r2 = "xm1AfUKw"
            java.lang.String r0 = ea.a.p(r0, r2)
            kotlin.jvm.internal.g.i(r0)
            throw r1
        L44:
            java.lang.String r0 = "VG0KdBFJdg=="
            java.lang.String r2 = "HU1zhZQ9"
            java.lang.String r0 = ea.a.p(r0, r2)
            kotlin.jvm.internal.g.i(r0)
            throw r1
        L50:
            android.widget.ImageView r3 = r5.Q
            if (r3 == 0) goto Lac
            r4 = 2131755048(0x7f100028, float:1.9140964E38)
            r3.setImageResource(r4)
            android.widget.TextView r3 = r5.R
            if (r3 == 0) goto La2
            r0 = 2131952615(0x7f1303e7, float:1.9541678E38)
            r3.setText(r0)
        L64:
            androidx.constraintlayout.widget.Group r0 = r5.P
            if (r0 == 0) goto L96
            r0.setVisibility(r2)
            androidx.constraintlayout.widget.Group r0 = r5.V
            if (r0 == 0) goto L8a
            r2 = 4
            r0.setVisibility(r2)
            android.widget.TextView r0 = r5.M
            if (r0 == 0) goto L7e
            r1 = 2131952735(0x7f13045f, float:1.9541921E38)
            r0.setText(r1)
            return
        L7e:
            java.lang.String r0 = "QGUnZRB0LHUfYlFyPXY="
            java.lang.String r2 = "mXL0VB19"
            java.lang.String r0 = ea.a.p(r0, r2)
            kotlin.jvm.internal.g.i(r0)
            throw r1
        L8a:
            java.lang.String r0 = "PWVCdRV0cHI1dXA="
            java.lang.String r2 = "hAOuDOm2"
            java.lang.String r0 = ea.a.p(r0, r2)
            kotlin.jvm.internal.g.i(r0)
            throw r1
        L96:
            java.lang.String r0 = "K20fdA9MO3kndXQ="
            java.lang.String r2 = "BBNovZu7"
            java.lang.String r0 = ea.a.p(r0, r2)
            kotlin.jvm.internal.g.i(r0)
            throw r1
        La2:
            java.lang.String r2 = "Ugiw2YWm"
            java.lang.String r0 = ea.a.p(r0, r2)
            kotlin.jvm.internal.g.i(r0)
            throw r1
        Lac:
            java.lang.String r0 = "Vm07dApJdg=="
            java.lang.String r2 = "Ni6c5qE4"
            java.lang.String r0 = ea.a.p(r0, r2)
            kotlin.jvm.internal.g.i(r0)
            throw r1
        Lb8:
            java.lang.String r0 = "VmQidCdlGnQ="
            java.lang.String r2 = "o1K71GEa"
            java.lang.String r0 = ea.a.p(r0, r2)
            kotlin.jvm.internal.g.i(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity.u2():void");
    }

    public final void v2(int i10) {
        String p10 = ea.a.p("XmU5ZxYx", "3VzaSt3U");
        boolean z10 = EventCenter.f28655a;
        EventCenter.f28660g = p10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    EventCenter.f28661h = ea.a.p("P2VDMg==", "2vvnpxvL");
                }
            } else {
                EventCenter.f28661h = ea.a.p("O2U4MQ==", "GDKJN49L");
            }
        } else {
            EventCenter.f28661h = ea.a.p("BHkGMTA=", "qZwuJUYj");
        }
        EventCenter.d(this);
    }

    /* compiled from: ReaderMergeChooserActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d implements xn.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26776a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ReaderMergeChooserActivity f26777b;

        public d(ReaderMergeChooserActivity readerMergeChooserActivity, boolean z10) {
            this.f26776a = z10;
            this.f26777b = readerMergeChooserActivity;
        }

        @Override // xn.b
        public final void a() {
            boolean z10 = this.f26776a;
            ReaderMergeChooserActivity readerMergeChooserActivity = this.f26777b;
            if (z10) {
                pdf.pdfreader.viewer.editor.free.utils.h1.i(readerMergeChooserActivity);
            } else {
                readerMergeChooserActivity.f26766f0.a(new String[]{ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfBlhnRTdOKkwQU2VPK0FwRQ==", "c8bTC3ek"), ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFcUSRdFFUUvVCtSGEF_XxhUPFIjR0U=", "JwnVrN0I")});
            }
        }

        @Override // xn.b
        public final void b() {
        }
    }

    /* compiled from: TextView.kt */
    /* loaded from: classes3.dex */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String valueOf = String.valueOf(editable);
            boolean isEmpty = TextUtils.isEmpty(valueOf);
            boolean z10 = false;
            ReaderMergeChooserActivity readerMergeChooserActivity = ReaderMergeChooserActivity.this;
            if (isEmpty) {
                ImageView imageView = readerMergeChooserActivity.T;
                if (imageView != null) {
                    imageView.setVisibility(4);
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("UGwuYQFJDHAHdH1tZw==", "t5nxK7wJ"));
                    throw null;
                }
            } else {
                ImageView imageView2 = readerMergeChooserActivity.T;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("LGxUYQtJWXAvdANtZw==", "6hYMc3Vk"));
                    throw null;
                }
            }
            String str = readerMergeChooserActivity.f26764d0;
            if ((str == null || str.length() == 0) ? true : true) {
                readerMergeChooserActivity.p2(valueOf);
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
