package pdf.pdfreader.viewer.editor.free.ui.act.tools;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.n;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.o0;
import androidx.recyclerview.widget.RecyclerView;
import cg.l;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.adapter.ChoosePDFAdapter;
import pdf.pdfreader.viewer.editor.free.ui.adapter.u;
import pdf.pdfreader.viewer.editor.free.ui.adapter.v;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j1;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;
import pdf.pdfreader.viewer.editor.free.utils.l0;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import wn.d;

/* compiled from: SearchPDFWhenChooseActivity.kt */
/* loaded from: classes3.dex */
public final class SearchPDFWhenChooseActivity extends BaseOperatePDFActivity implements d.b {

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ int f27034m0 = 0;

    /* renamed from: a0  reason: collision with root package name */
    public View f27035a0;

    /* renamed from: b0  reason: collision with root package name */
    public RecyclerView f27036b0;

    /* renamed from: c0  reason: collision with root package name */
    public TextView f27037c0;

    /* renamed from: d0  reason: collision with root package name */
    public Group f27038d0;

    /* renamed from: e0  reason: collision with root package name */
    public Group f27039e0;

    /* renamed from: f0  reason: collision with root package name */
    public RecyclerView f27040f0;

    /* renamed from: g0  reason: collision with root package name */
    public EditText f27041g0;

    /* renamed from: h0  reason: collision with root package name */
    public ImageView f27042h0;

    /* renamed from: i0  reason: collision with root package name */
    public u f27043i0;

    /* renamed from: j0  reason: collision with root package name */
    public ChoosePDFAdapter f27044j0;

    /* renamed from: k0  reason: collision with root package name */
    public final a f27045k0 = new a();

    /* renamed from: l0  reason: collision with root package name */
    public final b f27046l0 = new b();

    /* compiled from: SearchPDFWhenChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a extends n {
        public a() {
            super(true);
        }

        @Override // androidx.activity.n
        public final void a() {
            boolean z10;
            SearchPDFWhenChooseActivity searchPDFWhenChooseActivity = SearchPDFWhenChooseActivity.this;
            Group group = searchPDFWhenChooseActivity.f27038d0;
            if (group != null) {
                if (group.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    searchPDFWhenChooseActivity.C2();
                    return;
                } else {
                    searchPDFWhenChooseActivity.finish();
                    return;
                }
            }
            kotlin.jvm.internal.g.i(ea.a.p("PWVCdRV0cHI1dXA=", "Xp2LDh6B"));
            throw null;
        }
    }

    /* compiled from: SearchPDFWhenChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b extends l0 {
        public b() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            Integer num;
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            SearchPDFWhenChooseActivity searchPDFWhenChooseActivity = SearchPDFWhenChooseActivity.this;
            if (num != null && num.intValue() == R.id.back_iv) {
                searchPDFWhenChooseActivity.finish();
            } else if (num != null && num.intValue() == R.id.search_clear_iv) {
                EditText editText = searchPDFWhenChooseActivity.f27041g0;
                if (editText != null) {
                    editText.setText("");
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "4GVut0G4"));
                    throw null;
                }
            }
        }
    }

    public final void B2(String str) {
        boolean z10;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && (true ^ t2().isEmpty())) {
            new wn.d(t2(), this).getFilter().filter(str);
        } else {
            D2();
        }
    }

    @Override // jl.a
    public final void C1() {
        View findViewById = findViewById(R.id.rootView);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQG8pdBVpAXcp", "dPs60AeM"));
        this.f27035a0 = findViewById;
        View findViewById2 = findViewById(R.id.view_status_bar);
        ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        kotlin.jvm.internal.g.d(layoutParams, ea.a.p("IlZYZQ5TQ2EudTlCFHJGbFR5AXUxUARyCG1z", "dsbCibvR"));
        layoutParams.height = aj.b.B(this);
        findViewById2.setLayoutParams(layoutParams);
        this.Q = (FrameLayout) findViewById(R.id.frResult);
        View findViewById3 = findViewById(R.id.search_choose_recycler);
        kotlin.jvm.internal.g.d(findViewById3, ea.a.p("Umk5ZGdpIncKeS9kHFJ5aVwuIWUoclVoK2MZbz5zJ19GZTR5Umwicik=", "944W1GIM"));
        this.f27036b0 = (RecyclerView) findViewById3;
        View findViewById4 = findViewById(R.id.result_count_tv);
        kotlin.jvm.internal.g.d(findViewById4, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHGU2dQl0LWMIdQt0BnQ5KQ==", "vTGkrgeY"));
        this.f27037c0 = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.result_group);
        kotlin.jvm.internal.g.d(findViewById5, ea.a.p("BWktZABpPXcKeS9kHFJ5aVwuIGU6dVp0K2cDbyRwKQ==", "FXcCVXNH"));
        this.f27038d0 = (Group) findViewById5;
        View findViewById6 = findViewById(R.id.no_result_group);
        kotlin.jvm.internal.g.d(findViewById6, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuXG8ZciZzMmwjXzRyVnVDKQ==", "GWS9QMBK"));
        this.f27039e0 = (Group) findViewById6;
        View findViewById7 = findViewById(R.id.search_history_recycler);
        kotlin.jvm.internal.g.d(findViewById7, ea.a.p("KGkBZG9pVncKeS9kHFJ5aVwuIWUoclVoK2gYcyVvMHkRcgpjQGNfZTop", "sWNo9396"));
        this.f27040f0 = (RecyclerView) findViewById7;
        View findViewById8 = findViewById(R.id.search_et);
        kotlin.jvm.internal.g.d(findViewById8, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHWUkcgZobWU2KQ==", "tYEP2B1W"));
        this.f27041g0 = (EditText) findViewById8;
        View findViewById9 = findViewById(R.id.search_clear_iv);
        kotlin.jvm.internal.g.d(findViewById9, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHWUkcgZoG2MjZTlyEWk5KQ==", "Xd4sDOXN"));
        this.f27042h0 = (ImageView) findViewById9;
    }

    public final void C2() {
        RecyclerView recyclerView = this.f27040f0;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
            Group group = this.f27038d0;
            if (group != null) {
                group.setVisibility(4);
                Group group2 = this.f27039e0;
                if (group2 != null) {
                    group2.setVisibility(4);
                    return;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("WW8QZRZ1CnQPcgl1cA==", "OW7BefWK"));
                    throw null;
                }
            }
            kotlin.jvm.internal.g.i(ea.a.p("MWU7dRt0EnIndXA=", "MLCHwUWM"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("CmkidChyLVItYx9jWGUlVlFldw==", "9jbQGTTB"));
        throw null;
    }

    @Override // jl.a
    public final View D1() {
        View view = this.f27035a0;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.g.i(ea.a.p("PW9edC9pUnc=", "nbVylW12"));
        throw null;
    }

    public final void D2() {
        Group group = this.f27039e0;
        if (group != null) {
            group.setVisibility(0);
            Group group2 = this.f27038d0;
            if (group2 != null) {
                group2.setVisibility(4);
                RecyclerView recyclerView = this.f27040f0;
                if (recyclerView != null) {
                    recyclerView.setVisibility(4);
                    return;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("J2lCdBZyTlI_YzNjGWUaVlxldw==", "fuYjUbdh"));
                    throw null;
                }
            }
            kotlin.jvm.internal.g.i(ea.a.p("A2VCdS50A3IndXA=", "HCq1BDRs"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("XW8ZZQB1DnQ1clt1cA==", "PsDGSBM4"));
        throw null;
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_choose_search;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity, jl.a
    public final void K1() {
        super.K1();
        View findViewById = findViewById(R.id.back_iv);
        b bVar = this.f27046l0;
        findViewById.setOnClickListener(bVar);
        findViewById(R.id.search_clear_iv).setOnClickListener(bVar);
        ((InterceptTouchFrameLayout) findViewById(R.id.recycler_container)).setTopTouchListener(new h5.e(this, 14));
        RecyclerView recyclerView = this.f27040f0;
        if (recyclerView != null) {
            u uVar = new u(new c(recyclerView));
            this.f27043i0 = uVar;
            recyclerView.setAdapter(uVar);
            RecyclerView recyclerView2 = this.f27036b0;
            if (recyclerView2 != null) {
                ChoosePDFAdapter choosePDFAdapter = new ChoosePDFAdapter(this, new l<PdfPreviewEntity, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.tools.SearchPDFWhenChooseActivity$initView$3$1
                    {
                        super(1);
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(PdfPreviewEntity it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        SearchPDFWhenChooseActivity.this.E0(it);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(PdfPreviewEntity pdfPreviewEntity) {
                        invoke2(pdfPreviewEntity);
                        return tf.d.f30009a;
                    }
                });
                this.f27044j0 = choosePDFAdapter;
                recyclerView2.setAdapter(choosePDFAdapter);
                EditText editText = this.f27041g0;
                if (editText != null) {
                    String string = getString(R.string.arg_res_0x7f1303e8);
                    editText.setHint(" " + string);
                    editText.setImeOptions(268435459);
                    editText.addTextChangedListener(new d());
                    editText.setOnEditorActionListener(new f(editText, this, 1));
                    s2().postDelayed(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b(this, 7), 200L);
                    C2();
                    w0.a().c.execute(new j(this, 0));
                    getOnBackPressedDispatcher().a(this, this.f27045k0);
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("KmRYdC1lT3Q=", "NDLis6RL"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("PWVCdRV0ZWU5eSlsEHI-aVB3", "k2pCMpUm"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("W2k4dBxyG1IXY01jBWUkVi1ldw==", "S1hqhd9N"));
        throw null;
    }

    @Override // wn.d.b
    public final void l1(ArrayList<PdfPreviewEntity> list) {
        boolean z10;
        if (list != null && !list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            D2();
            return;
        }
        RecyclerView recyclerView = this.f27040f0;
        if (recyclerView != null) {
            recyclerView.setVisibility(4);
            Group group = this.f27039e0;
            if (group != null) {
                group.setVisibility(4);
                Group group2 = this.f27038d0;
                if (group2 != null) {
                    group2.setVisibility(0);
                    ChoosePDFAdapter choosePDFAdapter = this.f27044j0;
                    if (choosePDFAdapter != null) {
                        EditText editText = this.f27041g0;
                        if (editText != null) {
                            Editable text = editText.getText();
                            choosePDFAdapter.f27097i = (text == null || (r4 = text.toString()) == null) ? "" : "";
                            kotlin.jvm.internal.g.e(list, "list");
                            choosePDFAdapter.h().clear();
                            choosePDFAdapter.h().addAll(list);
                            choosePDFAdapter.notifyDataSetChanged();
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("B2QYdGBlN3Q=", "1Wbq4OmN"));
                            throw null;
                        }
                    }
                    if (list.size() <= 1) {
                        TextView textView = this.f27037c0;
                        if (textView != null) {
                            textView.setText(getString(R.string.arg_res_0x7f130413, String.valueOf(list.size())));
                            return;
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("PWVCdRV0dG8vbnQ=", "UAYNfJBk"));
                            throw null;
                        }
                    }
                    TextView textView2 = this.f27037c0;
                    if (textView2 != null) {
                        textView2.setText(getString(R.string.arg_res_0x7f130415, String.valueOf(list.size())));
                        return;
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("QWU4dR90IW8HbnQ=", "bLFArg5T"));
                        throw null;
                    }
                }
                kotlin.jvm.internal.g.i(ea.a.p("PWVCdRV0cHI1dXA=", "VDob8gBt"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("IW9jZQp1W3QdciV1cA==", "LL1Zn81x"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("W2k4dBxyG1IXY01jBWUkVi1ldw==", "lkNpfvf0"));
        throw null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        w0.a().c.execute(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c(this, 10));
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        super.onPause();
        EditText editText = this.f27041g0;
        if (editText != null) {
            editText.clearFocus();
        } else {
            kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "xT3HcgSM"));
            throw null;
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity
    @SuppressLint({"NotifyDataSetChanged"})
    public final void w2() {
        ChoosePDFAdapter choosePDFAdapter = this.f27044j0;
        if (choosePDFAdapter != null) {
            choosePDFAdapter.notifyDataSetChanged();
        }
    }

    /* compiled from: SearchPDFWhenChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements v {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f27050b;

        public c(RecyclerView recyclerView) {
            this.f27050b = recyclerView;
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.v
        public final void a() {
            o0 o0Var = new o0(1);
            RecyclerView recyclerView = this.f27050b;
            o0Var.f3891a = recyclerView.getResources().getString(R.string.arg_res_0x7f130379);
            o0Var.f3892b = recyclerView.getResources().getString(R.string.arg_res_0x7f13037f);
            o0Var.f3893d = recyclerView.getResources().getString(R.string.arg_res_0x7f130377);
            SearchPDFWhenChooseActivity searchPDFWhenChooseActivity = SearchPDFWhenChooseActivity.this;
            i2.b(searchPDFWhenChooseActivity, o0Var, new a(searchPDFWhenChooseActivity));
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.v
        public final void b(String content) {
            kotlin.jvm.internal.g.e(content, "content");
            if (!TextUtils.isEmpty(content)) {
                int i10 = SearchPDFWhenChooseActivity.f27034m0;
                SearchPDFWhenChooseActivity searchPDFWhenChooseActivity = SearchPDFWhenChooseActivity.this;
                searchPDFWhenChooseActivity.B2(content);
                EditText editText = searchPDFWhenChooseActivity.f27041g0;
                if (editText != null) {
                    editText.setText(content);
                    EditText editText2 = searchPDFWhenChooseActivity.f27041g0;
                    if (editText2 != null) {
                        editText2.setSelection(content.length());
                        EditText editText3 = searchPDFWhenChooseActivity.f27041g0;
                        if (editText3 != null) {
                            pdf.pdfreader.viewer.editor.free.utils.extension.g.a(editText3);
                            return;
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("UmRadAVlAnQ=", "DJ73QzLI"));
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("KmRYdC1lT3Q=", "Cx3GVl4I"));
                    throw null;
                }
                kotlin.jvm.internal.g.i(ea.a.p("KmRYdC1lT3Q=", "DUY1PBVx"));
                throw null;
            }
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.v
        public final void remove() {
            SearchPDFWhenChooseActivity searchPDFWhenChooseActivity = SearchPDFWhenChooseActivity.this;
            u uVar = searchPDFWhenChooseActivity.f27043i0;
            if (uVar != null && uVar.f27310e.isEmpty()) {
                RecyclerView recyclerView = searchPDFWhenChooseActivity.f27040f0;
                if (recyclerView != null) {
                    recyclerView.setVisibility(4);
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("W2k4dBxyG1IXY01jBWUkVi1ldw==", "aMtzoORL"));
                    throw null;
                }
            }
        }

        /* compiled from: SearchPDFWhenChooseActivity.kt */
        /* loaded from: classes3.dex */
        public static final class a implements j1.c {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SearchPDFWhenChooseActivity f27051a;

            public a(SearchPDFWhenChooseActivity searchPDFWhenChooseActivity) {
                this.f27051a = searchPDFWhenChooseActivity;
            }

            @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.j1.c
            public final void b() {
                SearchPDFWhenChooseActivity searchPDFWhenChooseActivity = this.f27051a;
                u uVar = searchPDFWhenChooseActivity.f27043i0;
                if (uVar != null) {
                    EmptyList list = EmptyList.INSTANCE;
                    kotlin.jvm.internal.g.e(list, "list");
                    ArrayList arrayList = uVar.f27310e;
                    arrayList.clear();
                    arrayList.addAll(list);
                    uVar.notifyDataSetChanged();
                }
                RecyclerView recyclerView = searchPDFWhenChooseActivity.f27040f0;
                if (recyclerView != null) {
                    recyclerView.setVisibility(4);
                    i2.a();
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("W2k4dBxyG1IXY01jBWUkVi1ldw==", "aMtzoORL"));
                throw null;
            }

            @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.j1.c
            public final void a() {
            }
        }
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
            SearchPDFWhenChooseActivity searchPDFWhenChooseActivity = SearchPDFWhenChooseActivity.this;
            if (isEmpty) {
                int i10 = SearchPDFWhenChooseActivity.f27034m0;
                searchPDFWhenChooseActivity.C2();
                ImageView imageView = searchPDFWhenChooseActivity.f27042h0;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    return;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("AGxTYRVJIXA9dC9tZw==", "3Hc6gOy6"));
                    throw null;
                }
            }
            int i11 = SearchPDFWhenChooseActivity.f27034m0;
            searchPDFWhenChooseActivity.B2(valueOf);
            ImageView imageView2 = searchPDFWhenChooseActivity.f27042h0;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("VGwzYShJDXA9dC9tZw==", "OO7VZcKz"));
                throw null;
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
