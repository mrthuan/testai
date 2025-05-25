package pdf.pdfreader.viewer.editor.free.ui.act;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bm.c;
import java.io.File;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.bean.DataBridge;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.merge.BaseMergeActivity;
import pdf.pdfreader.viewer.editor.free.merge.MergePdfData;
import pdf.pdfreader.viewer.editor.free.merge.ReaderMergeManager;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;
import pdf.pdfreader.viewer.editor.free.ui.adapter.MergePdfAdapter;
import pdf.pdfreader.viewer.editor.free.ui.dialog.EnterFileNameDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperateInterceptDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j2;
import pdf.pdfreader.viewer.editor.free.ui.vm.AppViewModel;
import pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: ReaderMergePdfActivity.kt */
/* loaded from: classes3.dex */
public final class ReaderMergePdfActivity extends BaseMergeActivity implements pdf.pdfreader.viewer.editor.free.merge.b, MergePdfAdapter.a, EnterFileNameDialog.a {

    /* renamed from: f0  reason: collision with root package name */
    public static final /* synthetic */ int f26780f0 = 0;
    public View M;
    public RecyclerView N;
    public TextView O;
    public long P;
    public FrameLayout Q;
    public OperateExecuteTask R;
    public boolean T;
    public boolean U;
    public ArrayList<PdfPreviewEntity> V;
    public final androidx.activity.result.c<String[]> W;
    public final androidx.appcompat.widget.z0 X;
    public j2 Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public OperateInterceptDialog f26781a0;

    /* renamed from: b0  reason: collision with root package name */
    public OperatePdfFailedDialog f26782b0;

    /* renamed from: c0  reason: collision with root package name */
    public final tf.c f26783c0;

    /* renamed from: d0  reason: collision with root package name */
    public long f26784d0;

    /* renamed from: e0  reason: collision with root package name */
    public ReaderMergeManager f26785e0;
    public final String K = "ReaderMergePdfActivity";
    public final tf.c L = kotlin.a.a(new cg.a<MergePdfAdapter>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity$mergePdfAdapter$2
        {
            super(0);
        }

        @Override // cg.a
        public final MergePdfAdapter invoke() {
            ReaderMergePdfActivity readerMergePdfActivity = ReaderMergePdfActivity.this;
            return new MergePdfAdapter(readerMergePdfActivity, readerMergePdfActivity);
        }
    });
    public final tf.c S = kotlin.a.a(new cg.a<EnterFileNameDialog>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity$giveNameDialog$2
        {
            super(0);
        }

        @Override // cg.a
        public final EnterFileNameDialog invoke() {
            ReaderMergePdfActivity readerMergePdfActivity = ReaderMergePdfActivity.this;
            EnterFileNameDialog enterFileNameDialog = new EnterFileNameDialog(readerMergePdfActivity, readerMergePdfActivity, false);
            final ReaderMergePdfActivity readerMergePdfActivity2 = ReaderMergePdfActivity.this;
            enterFileNameDialog.f27435u = new cg.a<String>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity$giveNameDialog$2$1$1
                {
                    super(0);
                }

                @Override // cg.a
                public final String invoke() {
                    Locale locale;
                    LocaleList locales;
                    String p10 = ea.a.p("F3lIeQtNDGQsXy5IWW0=", "HuH1rATL");
                    if (Build.VERSION.SDK_INT >= 24) {
                        locales = ReaderMergePdfActivity.this.getResources().getConfiguration().getLocales();
                        locale = locales.get(0);
                    } else {
                        locale = ReaderMergePdfActivity.this.getResources().getConfiguration().locale;
                    }
                    return a6.h.c(ReaderMergePdfActivity.this.getString(R.string.arg_res_0x7f1303b2), new SimpleDateFormat(p10, locale).format(Long.valueOf(System.currentTimeMillis())));
                }
            };
            return enterFileNameDialog;
        }
    });

    /* compiled from: ReaderMergePdfActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, List data) {
            Intent intent;
            kotlin.jvm.internal.g.e(context, "context");
            kotlin.jvm.internal.g.e(data, "data");
            if (data.isEmpty()) {
                intent = new Intent(context, ReaderMergePdfActivity.class);
            } else {
                List a10 = DataBridge.a();
                a10.clear();
                a10.addAll(data);
                intent = new Intent(context, ReaderMergePdfActivity.class);
            }
            context.startActivity(intent);
        }
    }

    public ReaderMergePdfActivity() {
        androidx.activity.result.c<String[]> registerForActivityResult = registerForActivityResult(new j.b(), new pdf.pdfreader.viewer.editor.free.ui.act.b(this, 2));
        kotlin.jvm.internal.g.d(registerForActivityResult, ea.a.p("PWVWaQp0UnIcbzhBFnQBdlx0F1IgcxBsl4DCfWQgUCBvIBEgWSAXIHp9QCBVIEggFSBOfQ==", "4AKZudnp"));
        this.W = registerForActivityResult;
        this.X = new androidx.appcompat.widget.z0(this, 29);
        this.f26783c0 = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.ui.dialog.y>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity$horProgressDialog$2
            {
                super(0);
            }

            @Override // cg.a
            public final pdf.pdfreader.viewer.editor.free.ui.dialog.y invoke() {
                final ReaderMergePdfActivity readerMergePdfActivity = ReaderMergePdfActivity.this;
                pdf.pdfreader.viewer.editor.free.ui.dialog.y yVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.y(readerMergePdfActivity, new cg.p<Integer, Integer, String>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity$horProgressDialog$2.1
                    {
                        super(2);
                    }

                    public final String invoke(int i10, int i11) {
                        String string = ReaderMergePdfActivity.this.getString(R.string.arg_res_0x7f1303b3);
                        kotlin.jvm.internal.g.d(string, ea.a.p("VWUyUwFyCm4vKDQuR3QlaVZnfHIsYVJlloDXbTRyJWlcZxl3HHQLXyZvOXBGbzByXXMhKQ==", "xR2FucvH"));
                        return string;
                    }

                    @Override // cg.p
                    public /* bridge */ /* synthetic */ String invoke(Integer num, Integer num2) {
                        return invoke(num.intValue(), num2.intValue());
                    }
                });
                final ReaderMergePdfActivity readerMergePdfActivity2 = ReaderMergePdfActivity.this;
                yVar.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.m0
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(final DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                        String p10 = ea.a.p("R2gic1cw", "KDMeSn4W");
                        final ReaderMergePdfActivity readerMergePdfActivity3 = ReaderMergePdfActivity.this;
                        kotlin.jvm.internal.g.e(readerMergePdfActivity3, p10);
                        if (i10 == 4 && keyEvent.getAction() == 1) {
                            cg.a<tf.d> aVar = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity$horProgressDialog$2$2$1$1
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
                                    ReaderMergeManager readerMergeManager = ReaderMergePdfActivity.this.f26785e0;
                                    if (readerMergeManager != null) {
                                        readerMergeManager.f();
                                    }
                                    dialogInterface.cancel();
                                    ReaderMergePdfActivity.this.startActivity(new Intent(ReaderMergePdfActivity.this, ReaderHomeActivity.class));
                                }
                            };
                            int i11 = ReaderMergePdfActivity.f26780f0;
                            readerMergePdfActivity3.s2(aVar);
                            return true;
                        }
                        return false;
                    }
                });
                return yVar;
            }
        });
    }

    private final void X1(boolean z10) {
        j2 j2Var = new j2(this);
        this.Y = j2Var;
        if (z10) {
            u2(3);
            j2Var.c(1);
        } else {
            u2(2);
            j2Var.c(0);
        }
        j2Var.f27638i = new e(this, z10);
        j2 j2Var2 = this.Y;
        if (j2Var2 != null) {
            j2Var2.show();
        }
    }

    public static void n2(ReaderMergePdfActivity readerMergePdfActivity, Map map) {
        kotlin.jvm.internal.g.e(readerMergePdfActivity, ea.a.p("R2gic1cw", "qX0j17gH"));
        readerMergePdfActivity.I.removeCallbacks(readerMergePdfActivity.X);
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue()) {
                z10 = false;
            }
        }
        if (!z10) {
            if (!k0.b.b(readerMergePdfActivity, ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFIDQQdfdVgnRTROJkxsUx9PIUElRQ==", "0sfgeOn8")) && !k0.b.b(readerMergePdfActivity, ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFcXSTFFEEU7VCBSDEEDX2JUNlJ2R0U=", "R3j1OceB"))) {
                readerMergePdfActivity.X1(true);
            } else {
                readerMergePdfActivity.X1(false);
            }
        }
    }

    @Override // jl.a
    public final void C1() {
        View findViewById = findViewById(R.id.rootView);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQG8pdBVpMXcp", "T9hsp5ul"));
        this.M = findViewById;
        View findViewById2 = findViewById(R.id.view_status_bar);
        ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        kotlin.jvm.internal.g.d(layoutParams, ea.a.p("XlYiZQRTFmEGdUdCCHJ4bCV5XXUyUCJyVm1z", "7EiZVU0p"));
        layoutParams.height = aj.b.B(this);
        findViewById2.setLayoutParams(layoutParams);
        this.Q = (FrameLayout) findViewById(R.id.frResult);
        View findViewById3 = findViewById(R.id.merge_recycler_view);
        kotlin.jvm.internal.g.d(findViewById3, ea.a.p("PmlZZAdpJHcKeS9kHFJ5aVwuP2U7Z1NfBmUSeTJsJ3IHdl5lJik=", "A6X7QAJD"));
        this.N = (RecyclerView) findViewById3;
        View findViewById4 = findViewById(R.id.tv_continue);
        kotlin.jvm.internal.g.d(findViewById4, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuRnYZYyxuM2kXdSkp", "GyL0iHwj"));
        this.O = (TextView) findViewById4;
    }

    @Override // jl.a
    public final View D1() {
        View view = this.M;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.g.i(ea.a.p("QW8kdCVpB3c=", "fWf3eWa3"));
        throw null;
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_merge_pdf;
    }

    @Override // pdf.pdfreader.viewer.editor.free.merge.b
    public final void F(String str) {
        File file = new File(str);
        if (file.exists()) {
            String A0 = bg.b.A0(file);
            Locale locale = Locale.getDefault();
            String f10 = a6.h.f("KGVFRBxmVnU2dGIp", "3lztnDQW", locale, A0, locale);
            kotlin.jvm.internal.g.d(f10, ea.a.p("HGg4c1VhAiAiYRBhGmw2bl8uAXQ7aVhnXS4Fbx1vNWUaQzBzECgdbythCmUp", "P1hQuqxi"));
            if (kotlin.jvm.internal.g.a(f10, ea.a.p("HGRm", "2ql24RbL"))) {
                PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                pdfPreviewEntity.setDate(file.lastModified());
                pdfPreviewEntity.setPath(file.getAbsolutePath());
                pdfPreviewEntity.setSize(file.length());
                long size = pdfPreviewEntity.getSize();
                t1.b("file onMergeFinish path:" + str + "   size:" + size);
                pdfPreviewEntity.setName(bg.b.B0(file));
                pdfPreviewEntity.setOtherStrOne(ea.a.p("H0RG", "BFODxRwE"));
                bm.c.b(this).f(ge.a.H(pdfPreviewEntity), new b(str, this));
                return;
            }
        }
        o2().dismiss();
        ReaderHomeActivity.f26656t2 = false;
        t1.b("query onMergeFinish  111 skipSilentScanWithMergeOrSplit:false");
    }

    @Override // jl.a
    public final void K1() {
        View findViewById = findViewById(R.id.iv_select_back);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("CGk2ZD9pCXcKeS9kCFY-ZU8-elJnaVIuHXYuczRsJ2MaXzphCmsp", "CWnXilHL"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(findViewById, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity$initView$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                ReaderMergePdfActivity.this.onBackPressed();
            }
        });
        View findViewById2 = findViewById(R.id.add_pdf_iv);
        kotlin.jvm.internal.g.d(findViewById2, ea.a.p("KWlfZC9pUncYeQNkSVYBZUI-RlJraQEuJWQWXz1kCl8mdik=", "jAxfDrMl"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(findViewById2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity$initView$2
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                tn.a.b(ReaderMergePdfActivity.this, ea.a.p("ImVDZ2U=", "kMUEoOT3"), ea.a.p("WWUDZwZfEmQsZg9sUV80bFFjaw==", "6h4qcsCr"));
                tn.a.d(ReaderMergePdfActivity.this, ea.a.p("XmU5Z2U=", "mCmMs9Ya"), ea.a.p("LGhebwplUWk2ZRVzHW93", "KKrY8AB2"), ea.a.p("JGRk", "k7E9djm2"), false);
                ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
                ReaderMergePdfActivity readerMergePdfActivity = ReaderMergePdfActivity.this;
                String p10 = ea.a.p("LmRk", "yTvFoYj1");
                aVar.getClass();
                ReaderMergeChooserActivity.a.a(readerMergePdfActivity, p10);
            }
        });
        TextView textView = this.O;
        if (textView != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity$initView$3
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                    invoke2(view);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
                    billingConfigImpl.getClass();
                    if (BillingConfigImpl.s() && billingConfigImpl.z() && !billingConfigImpl.w()) {
                        ReaderMergePdfActivity.this.T = true;
                        BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
                        Context context = it.getContext();
                        kotlin.jvm.internal.g.d(context, ea.a.p("JnQfYxZuQ2UidA==", "MwpNnfA2"));
                        String p10 = ea.a.p("XmU5Z2U=", "LfLlT0rZ");
                        aVar.getClass();
                        BaseSubscriptionActivity.a.a(context, p10);
                        return;
                    }
                    tn.a.d(ReaderMergePdfActivity.this, ea.a.p("PWULZ2U=", "frPyHhGF"), ea.a.p("XmU5ZxZfD2UAZ1FfCmw_Y2s=", "FS940zGo"), String.valueOf(DataBridge.a().size()), false);
                    if (!pdf.pdfreader.viewer.editor.free.utils.h1.c() && !pdf.pdfreader.viewer.editor.free.utils.extension.c.g(ReaderMergePdfActivity.this)) {
                        ReaderMergePdfActivity readerMergePdfActivity = ReaderMergePdfActivity.this;
                        int i10 = ReaderMergePdfActivity.f26780f0;
                        readerMergePdfActivity.I.postDelayed(readerMergePdfActivity.X, 500L);
                        ReaderMergePdfActivity.this.W.a(new String[]{ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfL1giRTFOBEwQU2VPK0FwRQ==", "dmMJjvcE"), ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFcXSTFFEkUoVBVSCkEDX2JUNlJ2R0U=", "AtIYMpPD")});
                        return;
                    }
                    ReaderMergePdfActivity.this.P = 0L;
                    ReaderMergePdfActivity readerMergePdfActivity2 = ReaderMergePdfActivity.this;
                    for (MergePdfData mergePdfData : DataBridge.a()) {
                        readerMergePdfActivity2.P = mergePdfData.getPdf().getSize() + readerMergePdfActivity2.P;
                    }
                    if (!ReaderMergePdfActivity.this.q2()) {
                        tn.a.d(ReaderMergePdfActivity.this, ea.a.p("ImVDZ2U=", "QF32XeIj"), ea.a.p("ImVDZxxfUWEzbC9kKnMAb3c=", "g1mtsh4k"), ea.a.p("QW8mMA==", "jZ8TR0zk"), false);
                        new pdf.pdfreader.viewer.editor.free.ui.dialog.x(ReaderMergePdfActivity.this, 0).show();
                        return;
                    }
                    ((EnterFileNameDialog) ReaderMergePdfActivity.this.S.getValue()).show();
                }
            });
            RecyclerView recyclerView = this.N;
            if (recyclerView != null) {
                recyclerView.setHasFixedSize(true);
                androidx.recyclerview.widget.r rVar = new androidx.recyclerview.widget.r(new ep.b(p2(), 2));
                rVar.h(recyclerView);
                MergePdfAdapter p22 = p2();
                p22.getClass();
                p22.f27108h = rVar;
                recyclerView.setAdapter(p2());
                MergePdfAdapter p23 = p2();
                p23.f27105e.a(p23.f27106f.size());
                p23.notifyDataSetChanged();
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("PWVSeRpsUnIMaS93", "LKWZwcfu"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("O3Zybxd0Xm4vZQ==", "hul6CQcY"));
        throw null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.MergePdfAdapter.a
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
            String string = getString(R.string.arg_res_0x7f1303b1, String.valueOf(i10));
            kotlin.jvm.internal.g.d(string, ea.a.p("MmUWUxdyMG4vKDQuR3QlaVZnfHIsYVJlloDXXyksYnMwbAdjF04sbWZ0CVNAcj5uXyh7KQ==", "ZqUbcYWZ"));
            BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
            billingConfigImpl.getClass();
            if (BillingConfigImpl.s() && billingConfigImpl.z() && !billingConfigImpl.w()) {
                TextView textView2 = this.O;
                if (textView2 != null) {
                    String upperCase = string.toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.g.d(upperCase, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtncC4xb2FwM2U9Q1BzHCh7bzlhJmVbUidPYSk=", "32dPYE4C"));
                    SpannableString spannableString = new SpannableString(upperCase.concat("  "));
                    spannableString.setSpan(new so.b(this, R.drawable.ic_home_subscription), spannableString.length() - 1, spannableString.length(), 33);
                    textView2.setText(spannableString);
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("JnZ0bzt0HW49ZQ==", "bxR7Utrn"));
                throw null;
            }
            TextView textView3 = this.O;
            if (textView3 != null) {
                textView3.setText(string);
                return;
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("O3Zybxd0Xm4vZQ==", "FrrvVPrC"));
                throw null;
            }
        }
        kotlin.jvm.internal.g.i(ea.a.p("R3YIbx10C24HZQ==", "bixSVyZM"));
        throw null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.merge.b
    public final void b0() {
        this.f26784d0 = System.currentTimeMillis();
        o2().show();
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.EnterFileNameDialog.a
    public final void c(String str, boolean z10) {
        String p10;
        String p11;
        String p12;
        boolean z11;
        String p13 = ea.a.p("PWULZ2U=", "HePyZk6J");
        String p14 = ea.a.p("ImVDZxxfRWU0YSdlKm9r", "jpFprEXC");
        if (z10) {
            p10 = ea.a.p("WQ==", "tFiJh2OB");
        } else {
            p10 = ea.a.p("Tg==", "JRk6fQVq");
        }
        if (DataBridge.f24030b) {
            p11 = ea.a.p("WQ==", "x5QkVw7t");
        } else {
            p11 = ea.a.p("Tg==", "Bi5bkNOV");
        }
        if (DataBridge.c) {
            p12 = ea.a.p("WQ==", "8XI3tFJx");
        } else {
            p12 = ea.a.p("Tg==", "6N6VmsRI");
        }
        tn.a.d(this, p13, p14, p10 + "_" + p11 + "_" + p12, false);
        wk.b.b().e(new qo.i());
        List<MergePdfData> list = p2().f27106f;
        kotlin.jvm.internal.g.e(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (MergePdfData mergePdfData : list) {
            if (mergePdfData.getNeedPassword()) {
                if (mergePdfData.getCopyPath().length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    PdfPreviewEntity pdf2 = mergePdfData.getPdf();
                    pdf2.setPath(mergePdfData.getCopyPath());
                    arrayList.add(pdf2);
                }
            }
            arrayList.add(mergePdfData.getPdf());
        }
        ReaderMergeManager readerMergeManager = new ReaderMergeManager(this, arrayList);
        readerMergeManager.f25890d = this;
        String fileName = str.concat(".pdf");
        kotlin.jvm.internal.g.e(fileName, "fileName");
        ConcurrentHashMap<String, File> concurrentHashMap = pdf.pdfreader.viewer.editor.free.utils.v.f28781a;
        File file = new File(pdf.pdfreader.viewer.editor.free.utils.v.C(ea.a.p("AmVDZ2U=", "mRpgCEiX")));
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        readerMergeManager.f25891e = newSingleThreadExecutor;
        if (readerMergeManager.f25890d != null && newSingleThreadExecutor != null) {
            newSingleThreadExecutor.execute(new androidx.fragment.app.f(9, file, fileName, readerMergeManager));
        }
        this.f26785e0 = readerMergeManager;
        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.d(this, null);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.MergePdfAdapter.a
    public final void g0(int i10) {
        boolean z10;
        List<MergePdfData> list = p2().f27106f;
        if (i10 >= 0 && i10 < list.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && list.remove(list.get(i10))) {
            p2().notifyItemRemoved(i10);
            p2().notifyItemRangeChanged(i10, list.size() - 1);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.merge.BaseMergeActivity
    public final void m2(List<? extends PdfPreviewEntity> pdfList) {
        kotlin.jvm.internal.g.e(pdfList, "pdfList");
    }

    public final pdf.pdfreader.viewer.editor.free.ui.dialog.y o2() {
        return (pdf.pdfreader.viewer.editor.free.ui.dialog.y) this.f26783c0.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.U) {
            OperateExecuteTask operateExecuteTask = this.R;
            if (operateExecuteTask != null) {
                operateExecuteTask.n();
            }
            pdf.pdfreader.viewer.editor.free.ads.n.f23972a.c(this, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity$onBackPressed$1
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
                    ReaderMergePdfActivity readerMergePdfActivity = ReaderMergePdfActivity.this;
                    int i10 = ReaderMergePdfActivity.f26780f0;
                    readerMergePdfActivity.r2();
                }
            }, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity$onBackPressed$2
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
                    ReaderMergePdfActivity.this.Z = true;
                }
            });
            return;
        }
        s2(new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity$onBackPressed$3
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
                pdf.pdfreader.viewer.editor.free.ads.n nVar = pdf.pdfreader.viewer.editor.free.ads.n.f23972a;
                final ReaderMergePdfActivity readerMergePdfActivity = ReaderMergePdfActivity.this;
                cg.a<tf.d> aVar = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity$onBackPressed$3.1
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
                        ReaderMergePdfActivity readerMergePdfActivity2 = ReaderMergePdfActivity.this;
                        int i10 = ReaderMergePdfActivity.f26780f0;
                        readerMergePdfActivity2.r2();
                    }
                };
                final ReaderMergePdfActivity readerMergePdfActivity2 = ReaderMergePdfActivity.this;
                nVar.c(readerMergePdfActivity, aVar, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity$onBackPressed$3.2
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
                        ReaderMergePdfActivity.this.Z = true;
                    }
                });
            }
        });
    }

    @Override // pdf.pdfreader.viewer.editor.free.merge.BaseMergeActivity, pdf.pdfreader.viewer.editor.free.ui.act.a, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        ArrayList<PdfPreviewEntity> arrayList2 = null;
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable(ea.a.p("XmU5ZxZTB2wXY0BFB3Q_dC1lcw==", "S76iYv1P"));
            if (serializable instanceof ArrayList) {
                arrayList = (ArrayList) serializable;
            } else {
                arrayList = null;
            }
            if (arrayList != null && (!arrayList.isEmpty())) {
                DataBridge.a().clear();
                DataBridge.a().addAll(arrayList);
            }
        }
        super.onCreate(bundle);
        if (bundle != null) {
            this.U = bundle.getBoolean(ea.a.p("WnMYaBx3MGUBdVh0OWExZQ==", "lqwD0h81"), false);
            Serializable serializable2 = bundle.getSerializable(ea.a.p("HWVCdRV0e2kpdA==", "FVfE2s8U"));
            if (serializable2 instanceof ArrayList) {
                arrayList2 = (ArrayList) serializable2;
            }
            this.V = arrayList2;
            if (this.U && arrayList2 != null) {
                t2(arrayList2, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r0.isShowing() == true) goto L8;
     */
    @Override // pdf.pdfreader.viewer.editor.free.merge.BaseMergeActivity, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDestroy() {
        /*
            r2 = this;
            pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask r0 = r2.R
            if (r0 == 0) goto L7
            r0.k()
        L7:
            super.onDestroy()
            pdf.pdfreader.viewer.editor.free.ui.dialog.j2 r0 = r2.Y
            if (r0 == 0) goto L16
            boolean r0 = r0.isShowing()
            r1 = 1
            if (r0 != r1) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L20
            pdf.pdfreader.viewer.editor.free.ui.dialog.j2 r0 = r2.Y
            if (r0 == 0) goto L20
            r0.dismiss()
        L20:
            pdf.pdfreader.viewer.editor.free.merge.ReaderMergeManager r0 = r2.f26785e0
            if (r0 == 0) goto L27
            r0.f()
        L27:
            pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog r0 = r2.f26782b0
            if (r0 == 0) goto L2e
            r0.cancel()
        L2e:
            pdf.pdfreader.viewer.editor.free.ui.dialog.OperateInterceptDialog r0 = r2.f26781a0
            if (r0 == 0) goto L35
            r0.cancel()
        L35:
            pdf.pdfreader.viewer.editor.free.ui.dialog.y r0 = r2.o2()
            if (r0 == 0) goto L3e
            r0.cancel()
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity.onDestroy():void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        MergePdfAdapter p22 = p2();
        p22.f27105e.a(p22.f27106f.size());
        p22.notifyDataSetChanged();
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        OperateExecuteTask operateExecuteTask = this.R;
        if (operateExecuteTask != null) {
            operateExecuteTask.l();
        }
        if (this.Z) {
            this.Z = false;
            if (this.U) {
                r2();
            } else {
                finish();
            }
        }
        if (this.T) {
            this.T = false;
            if (BillingConfigImpl.c.w()) {
                MergePdfAdapter p22 = p2();
                p22.f27105e.a(p22.f27106f.size());
                p22.notifyDataSetChanged();
            }
        }
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(ea.a.p("WnMYaBx3MGUBdVh0OWExZQ==", "ggySFd80"), this.U);
        outState.putSerializable(ea.a.p("HWVCdRV0e2kpdA==", "QggTbO8s"), this.V);
        if (!DataBridge.a().isEmpty()) {
            String p10 = ea.a.p("XmU5ZxZTB2wXY0BFB3Q_dC1lcw==", "ecf5mYfH");
            List a10 = DataBridge.a();
            kotlin.jvm.internal.g.c(a10, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuDW5MbkVsNCBHeTtlU2oDdhMuQXQAbHhBNnJTeQppMHRecAVmHnA8ZkFlKmQWckx2G2VDZRsuM2QtdF1yaGYxZQcuDGVCZz0ufmU5ZxZQBmY2YUBhV3t2ayt0XmkoLiBvDmwEY0RpN25ALh95A2UjbBthR2UaSyIuBXJAYT9MKnMWPBFkVi4oZFVyLmEXZRAuBGlRdwxyeGUgaUZvNC4lcgdlT21Vcj9lHU0uchRlMmQURFV0CD52fQ==", "ba0Xut7m"));
            outState.putSerializable(p10, (ArrayList) a10);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.merge.b
    public final void p(int i10, int i11) {
        if (o2().isShowing()) {
            o2().c(i10, i11);
        } else {
            o2().d(i10, i11);
        }
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
    }

    public final MergePdfAdapter p2() {
        return (MergePdfAdapter) this.L.getValue();
    }

    public final boolean q2() {
        float a10 = pdf.pdfreader.viewer.editor.free.utils.f0.a();
        float f10 = ((((float) this.P) / 1000.0f) / 1000.0f) * 2.0f;
        t1.b("merge needSpace: " + f10 + " freeSize: " + a10);
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        if (a10 > f10 * 2) {
            return true;
        }
        return false;
    }

    public final void r2() {
        this.I.post(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c(this, 5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r5 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r4 == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // pdf.pdfreader.viewer.editor.free.merge.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.lang.Throwable r9) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity.s(java.lang.Throwable):void");
    }

    public final void s2(cg.a<tf.d> aVar) {
        boolean z10;
        if (this.f26781a0 == null) {
            String string = getResources().getString(R.string.arg_res_0x7f1303d0);
            kotlin.jvm.internal.g.d(string, ea.a.p("H2URbzJyWmU7LgFlQFMjclFuNSgbLkV0BmkfZ39yJ2EJZRBfNnVQdBdtA3JTaTlnKQ==", "bcmbG9GC"));
            String string2 = getResources().getString(R.string.arg_res_0x7f1303d2);
            kotlin.jvm.internal.g.d(string2, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0QGldZ0JyEGFXZTlfAnULdC10W2EadCk=", "23luoX5W"));
            this.f26781a0 = new OperateInterceptDialog(this, string, string2);
        }
        OperateInterceptDialog operateInterceptDialog = this.f26781a0;
        if (operateInterceptDialog != null && !operateInterceptDialog.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            OperateInterceptDialog operateInterceptDialog2 = this.f26781a0;
            if (operateInterceptDialog2 != null) {
                operateInterceptDialog2.A = new c(aVar);
            }
            if (operateInterceptDialog2 != null) {
                operateInterceptDialog2.show();
            }
        }
    }

    public final void t2(ArrayList<PdfPreviewEntity> arrayList, boolean z10) {
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            this.U = true;
            this.V = arrayList;
            frameLayout.setVisibility(0);
            FrameLayout frameLayout2 = this.Q;
            if (frameLayout2 != null) {
                frameLayout2.removeAllViews();
            }
            if (this.R == null) {
                this.R = new OperateExecuteTask();
            }
            String string = getString(R.string.arg_res_0x7f1303b0);
            kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHIjYSdlQF8AZQZnVF9AdShjFnMRKQ==", "2mt17SGy"));
            tn.a.b(this, ea.a.p("ImVDZ2U=", "Z8WARTk2"), ea.a.p("ImVDZxxfU280ZRVzAGMLZUZz", "eZ3lAjTm"));
            OperateExecuteTask operateExecuteTask = this.R;
            kotlin.jvm.internal.g.b(operateExecuteTask);
            String p10 = ea.a.p("ImVDZ2U=", "3l6prZxd");
            FrameLayout frameLayout3 = this.Q;
            kotlin.jvm.internal.g.b(frameLayout3);
            operateExecuteTask.q(4, p10, frameLayout3, string, arrayList, z10, new d(arrayList));
        }
    }

    public final void u2(int i10) {
        String p10 = ea.a.p("XmU5ZxYy", "t5NwqeNn");
        boolean z10 = EventCenter.f28655a;
        EventCenter.f28660g = p10;
        EventCenter.f(ea.a.p("R28kbHM=", "bdcSLO9k"));
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    EventCenter.f28661h = ea.a.p("P2VDMg==", "oJZgCKUV");
                }
            } else {
                EventCenter.f28661h = ea.a.p("HWU6MQ==", "vnmHyNWX");
            }
        } else {
            EventCenter.f28661h = ea.a.p("PHlCMTA=", "4FflIw28");
        }
        EventCenter.c(this);
        EventCenter.d(this);
    }

    /* compiled from: ReaderMergePdfActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements c.InterfaceC0042c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26786a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ReaderMergePdfActivity f26787b;

        public b(String str, ReaderMergePdfActivity readerMergePdfActivity) {
            this.f26786a = str;
            this.f26787b = readerMergePdfActivity;
        }

        public static void c(ReaderMergePdfActivity readerMergePdfActivity, List list) {
            kotlin.jvm.internal.g.e(readerMergePdfActivity, ea.a.p("R2gic1cw", "iKH8gQaG"));
            kotlin.jvm.internal.g.e(list, ea.a.p("a2xYcw1z", "861UFrKE"));
            if (readerMergePdfActivity.R == null) {
                readerMergePdfActivity.R = new OperateExecuteTask();
            }
            if (readerMergePdfActivity.R != null) {
                OperateExecuteTask.p(readerMergePdfActivity, readerMergePdfActivity.f26784d0);
            }
            readerMergePdfActivity.f26784d0 = 0L;
            readerMergePdfActivity.o2().dismiss();
            readerMergePdfActivity.t2((ArrayList) list, true);
        }

        @Override // bm.c.InterfaceC0042c
        public final void b(ArrayList arrayList) {
            String str;
            ReaderMergePdfActivity readerMergePdfActivity;
            if (!arrayList.isEmpty()) {
                str = ((PdfPreviewEntity) arrayList.get(0)).getPath();
            } else {
                str = this.f26786a;
            }
            ReaderHomeActivity.f26656t2 = false;
            t1.b("query onMergeFinish skipSilentScanWithMergeOrSplit:false");
            pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
            Context m10 = ReaderPdfApplication.m();
            kotlin.jvm.internal.g.d(m10, ea.a.p("KGVFSRdzQ2E0Yy8oKQ==", "f68KJQhb"));
            kotlin.jvm.internal.g.d(str, ea.a.p("P2FFaD9vRURi", "GrOp41Rm"));
            StorageFileObserver.c(m10, str, true);
            ToolsType toolsType = DataBridge.f24029a;
            DataBridge.f24029a = ToolsType.MERGE_PDF;
            DataBridge.f24030b = false;
            DataBridge.c = false;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                readerMergePdfActivity = this.f26787b;
                if (hasNext) {
                    PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) it.next();
                    long id2 = pdfPreviewEntity.getId();
                    String path = pdfPreviewEntity.getPath();
                    long size = pdfPreviewEntity.getSize();
                    t1.b("merge insert database id is:" + id2 + " path:" + path + " size:" + size);
                    String str2 = readerMergePdfActivity.K;
                    pdfPreviewEntity.getId();
                    String str3 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                    FileRepository.I(pdfPreviewEntity);
                } else {
                    try {
                        break;
                    } catch (Throwable th2) {
                        int i10 = ReaderMergePdfActivity.f26780f0;
                        readerMergePdfActivity.I.post(new l1.a(22, readerMergePdfActivity, arrayList));
                        throw th2;
                    }
                }
            }
            pdf.pdfreader.viewer.editor.free.utils.v.b();
            if (arrayList.size() == 1) {
                pdf.pdfreader.viewer.editor.free.utils.v.N(readerMergePdfActivity, str);
            }
            int i11 = ReaderMergePdfActivity.f26780f0;
            readerMergePdfActivity.I.post(new androidx.fragment.app.g(24, readerMergePdfActivity, arrayList));
        }

        @Override // bm.c.InterfaceC0042c
        public final void a() {
        }
    }

    /* compiled from: ReaderMergePdfActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements oo.b {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ cg.a<tf.d> f26789b;

        public c(cg.a<tf.d> aVar) {
            this.f26789b = aVar;
        }

        @Override // oo.b
        public final void a() {
            tn.a.b(ReaderMergePdfActivity.this, ea.a.p("ImVDZ2U=", "V1wFdN4o"), ea.a.p("ImVDZxxfRHQ1cBVxAGl0", "fp8iWCvL"));
            this.f26789b.invoke();
        }

        @Override // oo.b
        public final void cancel() {
        }
    }

    /* compiled from: ReaderMergePdfActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d implements OperateExecuteTask.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList<PdfPreviewEntity> f26791b;

        public d(ArrayList<PdfPreviewEntity> arrayList) {
            this.f26791b = arrayList;
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void a() {
            ReaderMergePdfActivity readerMergePdfActivity = ReaderMergePdfActivity.this;
            OperateExecuteTask operateExecuteTask = readerMergePdfActivity.R;
            readerMergePdfActivity.I.post(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.f(readerMergePdfActivity, 4));
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void b(PdfPreviewEntity pdfPreviewEntity) {
            String p10 = ea.a.p("XmU5Z2U=", "iRAZ68CS");
            String p11 = ea.a.p("VWUgZy1fLm8mZTlvRGVu", "jJ8RHJGb");
            ReaderMergePdfActivity readerMergePdfActivity = ReaderMergePdfActivity.this;
            tn.a.b(readerMergePdfActivity, p10, p11);
            AppViewModel k10 = ReaderPdfApplication.k();
            ToolsType toolsType = DataBridge.f24029a;
            String path = pdfPreviewEntity.getPath();
            kotlin.jvm.internal.g.d(path, ea.a.p("Q2QtUAFlFGkXd3FuHWkieWpwU3Ro", "2uBfuOaw"));
            k10.g(new nl.g(toolsType, path));
            Iterator<PdfPreviewEntity> it = this.f26791b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PdfPreviewEntity next = it.next();
                if (kotlin.jvm.internal.g.a(next.getPath(), pdfPreviewEntity.getPath())) {
                    next.setRecent(1);
                    next.setRecentDate(System.currentTimeMillis());
                    FileRepository.I(pdfPreviewEntity);
                    bm.c.b(readerMergePdfActivity).i(next);
                    if (eo.e.c(readerMergePdfActivity) == 2) {
                        eo.e.n(readerMergePdfActivity, 1);
                    }
                    if (eo.e.k(readerMergePdfActivity) == 2) {
                        eo.e.s(readerMergePdfActivity, 1);
                    }
                    ReaderPdfApplication.h();
                    pdf.pdfreader.viewer.editor.free.utils.k0.i(readerMergePdfActivity, next.getPath(), next, ea.a.p("dVIETSxBLkw=", "aD0V56U8"));
                }
            }
            OperateExecuteTask operateExecuteTask = readerMergePdfActivity.R;
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void c() {
            ReaderMergePdfActivity readerMergePdfActivity = ReaderMergePdfActivity.this;
            OperateExecuteTask operateExecuteTask = readerMergePdfActivity.R;
            readerMergePdfActivity.r2();
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void f(PdfPreviewEntity pdfPreviewEntity) {
            String p10 = ea.a.p("XmU5Z2U=", "aV0NMKCS");
            String p11 = ea.a.p("ImVDZxxfU280ZRVzHWEaZQ==", "Qc4sRcEn");
            ReaderMergePdfActivity readerMergePdfActivity = ReaderMergePdfActivity.this;
            tn.a.b(readerMergePdfActivity, p10, p11);
            pdf.pdfreader.viewer.editor.free.utils.e1.e(readerMergePdfActivity, pdfPreviewEntity);
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void d() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void g() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void e(PdfPreviewEntity pdfPreviewEntity) {
        }
    }

    /* compiled from: ReaderMergePdfActivity.kt */
    /* loaded from: classes3.dex */
    public static final class e implements xn.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26792a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ReaderMergePdfActivity f26793b;

        public e(ReaderMergePdfActivity readerMergePdfActivity, boolean z10) {
            this.f26792a = z10;
            this.f26793b = readerMergePdfActivity;
        }

        @Override // xn.b
        public final void a() {
            boolean z10 = this.f26792a;
            ReaderMergePdfActivity readerMergePdfActivity = this.f26793b;
            if (z10) {
                pdf.pdfreader.viewer.editor.free.utils.h1.i(readerMergePdfActivity);
            } else {
                readerMergePdfActivity.W.a(new String[]{ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfB1g_RT9OcEwQU2VPK0FwRQ==", "lE8dBkm1"), ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFcXSTFFa0UsVHZSJkEDX2JUNlJ2R0U=", "K2yD4t3h")});
            }
        }

        @Override // xn.b
        public final void b() {
        }
    }
}
