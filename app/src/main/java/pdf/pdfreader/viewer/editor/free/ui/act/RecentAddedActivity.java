package pdf.pdfreader.viewer.editor.free.ui.act;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.lib.flutter.encrypt.EngineHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import lib.zj.pdfeditor.ReaderPDFCore;
import org.greenrobot.eventbus.ThreadMode;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.ads.FullScreenManage;
import pdf.pdfreader.viewer.editor.free.ads.anim.BannerLoadingAnimation;
import pdf.pdfreader.viewer.editor.free.data.RecentAddRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptContainer;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.fnbridge.impl.NativeItemClickApiImpl;
import pdf.pdfreader.viewer.editor.free.merge.MergePdfData;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.ui.vm.AppViewModel;
import pdf.pdfreader.viewer.editor.free.utils.AdUtils;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: RecentAddedActivity.kt */
/* loaded from: classes3.dex */
public final class RecentAddedActivity extends OperatePDFWatcherActivity implements ro.c, View.OnClickListener, pdf.pdfreader.viewer.editor.free.fnbridge.a {

    /* renamed from: l0  reason: collision with root package name */
    public static final a f26850l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final String f26851m0;
    public final pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.f H = new pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.f();
    public final pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b I = new pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b(this);
    public final tf.c J = kotlin.a.a(new cg.a<LinearLayout>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$llRecentHeader$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final LinearLayout invoke() {
            return (LinearLayout) RecentAddedActivity.this.findViewById(R.id.llRecentHeader);
        }
    });
    public final tf.c K = kotlin.a.a(new cg.a<AppCompatImageView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$ivBack$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final AppCompatImageView invoke() {
            return (AppCompatImageView) RecentAddedActivity.this.findViewById(R.id.ivRecentBack);
        }
    });
    public final tf.c L = kotlin.a.a(new cg.a<TextView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$tvTitle$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final TextView invoke() {
            return (TextView) RecentAddedActivity.this.findViewById(R.id.tvRecentTitle);
        }
    });
    public final tf.c M = kotlin.a.a(new cg.a<ImageView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$ivSelectAll$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final ImageView invoke() {
            return (ImageView) RecentAddedActivity.this.findViewById(R.id.ivRecentSelectAll);
        }
    });
    public final tf.c N = kotlin.a.a(new cg.a<TextView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$tvNum$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final TextView invoke() {
            return (TextView) RecentAddedActivity.this.findViewById(R.id.tvRecentNum);
        }
    });
    public final tf.c O = kotlin.a.a(new cg.a<LinearLayout>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$llSelectContainer$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final LinearLayout invoke() {
            return (LinearLayout) RecentAddedActivity.this.findViewById(R.id.llRecentSelect);
        }
    });
    public final tf.c P = kotlin.a.a(new cg.a<AppCompatImageView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$ivSelectBack$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final AppCompatImageView invoke() {
            return (AppCompatImageView) RecentAddedActivity.this.findViewById(R.id.ivRecentSelectBack);
        }
    });
    public final tf.c Q = kotlin.a.a(new cg.a<TextView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$tvSelectNum$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final TextView invoke() {
            return (TextView) RecentAddedActivity.this.findViewById(R.id.tvRecentSelectNum);
        }
    });
    public final tf.c R = kotlin.a.a(new cg.a<TextView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$tvSelectAll$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final TextView invoke() {
            return (TextView) RecentAddedActivity.this.findViewById(R.id.tvRecentSelectAll);
        }
    });
    public final tf.c S = kotlin.a.a(new cg.a<LinearLayout>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$llSelectAll$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final LinearLayout invoke() {
            return (LinearLayout) RecentAddedActivity.this.findViewById(R.id.llRecentSelectAll);
        }
    });
    public final tf.c T = kotlin.a.a(new cg.a<CheckBox>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$cbSelectAll$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final CheckBox invoke() {
            return (CheckBox) RecentAddedActivity.this.findViewById(R.id.cbRecentSelectAll);
        }
    });
    public final tf.c U = kotlin.a.a(new cg.a<LinearLayout>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$bottomLayout$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final LinearLayout invoke() {
            return (LinearLayout) RecentAddedActivity.this.findViewById(R.id.ll_mul_select_bottom_wrapper);
        }
    });
    public final tf.c V = kotlin.a.a(new cg.a<View>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$bottomDelete$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final View invoke() {
            return RecentAddedActivity.this.findViewById(R.id.tv_select_delete);
        }
    });
    public final tf.c W = kotlin.a.a(new cg.a<View>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$bottomMerge$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final View invoke() {
            return RecentAddedActivity.this.findViewById(R.id.tv_select_merge);
        }
    });
    public final tf.c X = kotlin.a.a(new cg.a<View>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$bottomShare$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final View invoke() {
            return RecentAddedActivity.this.findViewById(R.id.tv_select_share);
        }
    });
    public final tf.c Y = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.ui.frag.n>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$fragment$2
        @Override // cg.a
        public final pdf.pdfreader.viewer.editor.free.ui.frag.n invoke() {
            return new pdf.pdfreader.viewer.editor.free.ui.frag.n();
        }
    });
    public final tf.c Z = kotlin.a.a(new cg.a<String>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$mFrom$2
        {
            super(0);
        }

        @Override // cg.a
        public final String invoke() {
            return RecentAddedActivity.this.getIntent().getStringExtra(ea.a.p("KXJebQ==", "nTQTyhdA"));
        }
    });

    /* renamed from: a0  reason: collision with root package name */
    public final tf.c f26852a0;

    /* renamed from: b0  reason: collision with root package name */
    public final tf.c f26853b0;

    /* renamed from: c0  reason: collision with root package name */
    public final ArrayList<PdfPreviewEntity> f26854c0;

    /* renamed from: d0  reason: collision with root package name */
    public final b f26855d0;

    /* renamed from: e0  reason: collision with root package name */
    public final i f26856e0;

    /* renamed from: f0  reason: collision with root package name */
    public final e f26857f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f26858g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f26859h0;

    /* renamed from: i0  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.ui.dialog.w f26860i0;

    /* renamed from: j0  reason: collision with root package name */
    public final tf.c f26861j0;

    /* renamed from: k0  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.ui.dialog.d f26862k0;

    /* compiled from: RecentAddedActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static Intent a(Context context, int i10, String str) {
            kotlin.jvm.internal.g.e(context, "context");
            Intent intent = new Intent(context, RecentAddedActivity.class);
            intent.putExtra(ea.a.p("VXIkbQ==", "PSVoSU5P"), str);
            intent.putExtra(ea.a.p("KWldZS15R2U=", "8Qn3wGeJ"), i10);
            return intent;
        }
    }

    /* compiled from: RecentAddedActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements com.lib.flutter.encrypt.e {
        public b() {
        }

        @Override // com.lib.flutter.encrypt.e
        public final void a(String str) {
            boolean z10;
            if (BillingConfigImpl.c.w()) {
                String p10 = ea.a.p("P3JUbRB1WiAvcy9yWSAba1xwTmgqbQBCG3QXbyxCNG4hZUMgCmhYdw==", "NKbmtcAU");
                int i10 = zk.a.f32399a;
                t1.b(p10);
                return;
            }
            a aVar = RecentAddedActivity.f26850l0;
            RecentAddedActivity recentAddedActivity = RecentAddedActivity.this;
            if (recentAddedActivity.p2() != null) {
                if (o9.d.c.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    tn.a.b(ReaderPdfApplication.m(), ea.a.p("K2VTdR5fX184XyhhG24Ncg==", "KfiNkggG"), "action_flutter_show_".concat(o9.d.f22759b));
                    tn.a.b(ReaderPdfApplication.m(), ea.a.p("K2VTdR5fX184XyhhG24Ncg==", "DDOCrOTI"), ea.a.p("LmNFaRZuaGY2dT50EHI3c11vGV8xbxFhbA==", "QwnKoBwR"));
                }
                gl.b bVar = gl.b.f17914a;
                LinearLayout p22 = recentAddedActivity.p2();
                bVar.getClass();
                gl.b.c(str, p22);
                gl.c.f17916o.d();
                gl.d.f17917o.d();
            }
        }

        @Override // com.lib.flutter.encrypt.e
        public final void b() {
            View childAt;
            a aVar = RecentAddedActivity.f26850l0;
            RecentAddedActivity recentAddedActivity = RecentAddedActivity.this;
            if (recentAddedActivity.p2() != null && recentAddedActivity.p2().getChildCount() > 0 && (childAt = recentAddedActivity.p2().getChildAt(0)) != null && (childAt instanceof BannerLoadingAnimation)) {
                recentAddedActivity.p2().removeAllViews();
            }
        }
    }

    /* compiled from: RecentAddedActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements gl.a {
        public c() {
        }

        @Override // gl.a
        public final int a() {
            return RecentAddedActivity.this.f26854c0.size();
        }
    }

    /* compiled from: RecentAddedActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d extends ge.a {
    }

    /* compiled from: RecentAddedActivity.kt */
    /* loaded from: classes3.dex */
    public static final class f extends androidx.fragment.app.w {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ArrayList<PdfPreviewEntity> f26866e;

        public f(ArrayList<PdfPreviewEntity> arrayList) {
            this.f26866e = arrayList;
        }

        @Override // oo.a
        public final void a() {
            a aVar = RecentAddedActivity.f26850l0;
            RecentAddedActivity recentAddedActivity = RecentAddedActivity.this;
            pdf.pdfreader.viewer.editor.free.ui.frag.n q22 = recentAddedActivity.q2();
            ArrayList<PdfPreviewEntity> arrayList = this.f26866e;
            q22.A0(arrayList);
            androidx.lifecycle.w<ArrayList<PdfPreviewEntity>> wVar = wn.b.f31386a;
            androidx.lifecycle.w<ArrayList<PdfPreviewEntity>> wVar2 = wn.b.f31386a;
            ArrayList<PdfPreviewEntity> d10 = wVar2.d();
            if (d10 == null) {
                d10 = new ArrayList<>();
            }
            d10.addAll(arrayList);
            wVar2.j(d10);
            if (recentAddedActivity.q2().F0.size() == 0) {
                recentAddedActivity.m2(false);
                recentAddedActivity.q2().C0();
            }
        }
    }

    /* compiled from: RecentAddedActivity.kt */
    /* loaded from: classes3.dex */
    public static final class g implements DecryptAndCopyUIHelper.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList<MergePdfData> f26867a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ WeakReference<Context> f26868b;

        public g(WeakReference weakReference, ArrayList arrayList) {
            this.f26867a = arrayList;
            this.f26868b = weakReference;
        }

        @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
        public final void a(List<DecryptContainer> result) {
            kotlin.jvm.internal.g.e(result, "result");
            Iterator<DecryptContainer> it = result.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList<MergePdfData> arrayList = this.f26867a;
                if (hasNext) {
                    DecryptContainer next = it.next();
                    PdfPreviewEntity component1 = next.component1();
                    String component3 = next.component3();
                    Iterator<MergePdfData> it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            MergePdfData next2 = it2.next();
                            if (next2.getId() == component1.getId()) {
                                next2.setCopyPath(component3);
                                break;
                            }
                        }
                    }
                } else {
                    int i10 = ReaderMergePdfActivity.f26780f0;
                    Context context = this.f26868b.get();
                    kotlin.jvm.internal.g.b(context);
                    ReaderMergePdfActivity.a.a(context, arrayList);
                    return;
                }
            }
        }
    }

    /* compiled from: RecentAddedActivity.kt */
    /* loaded from: classes3.dex */
    public static final class h implements androidx.lifecycle.x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cg.l f26869a;

        public h(cg.l lVar) {
            ea.a.p("K3U_YwZpA24=", "74MQrlDe");
            this.f26869a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final cg.l a() {
            return this.f26869a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.x) && (obj instanceof kotlin.jvm.internal.e)) {
                return kotlin.jvm.internal.g.a(this.f26869a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f26869a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f26869a.invoke(obj);
        }
    }

    /* compiled from: RecentAddedActivity.kt */
    /* loaded from: classes3.dex */
    public static final class i implements com.lib.flutter.encrypt.e {
        public i() {
        }

        @Override // com.lib.flutter.encrypt.e
        public final void a(String str) {
            if (BillingConfigImpl.c.w()) {
                String p10 = ea.a.p("P3JUbRB1WiAvcy9yWSAba1xwTmgqbQBTOmElQiNuA2U9IEJoFnc=", "UB2cYKBm");
                int i10 = zk.a.f32399a;
                t1.b(p10);
                return;
            }
            a aVar = RecentAddedActivity.f26850l0;
            RecentAddedActivity recentAddedActivity = RecentAddedActivity.this;
            if (recentAddedActivity.p2() != null) {
                gl.h hVar = gl.h.f17923a;
                LinearLayout p22 = recentAddedActivity.p2();
                hVar.getClass();
                gl.h.c(str, p22);
                gl.i.f17925o.d();
                gl.j.f17926o.d();
            }
        }

        @Override // com.lib.flutter.encrypt.e
        public final void b() {
            View childAt;
            a aVar = RecentAddedActivity.f26850l0;
            RecentAddedActivity recentAddedActivity = RecentAddedActivity.this;
            if (recentAddedActivity.p2() != null && recentAddedActivity.p2().getChildCount() > 0 && (childAt = recentAddedActivity.p2().getChildAt(0)) != null && (childAt instanceof BannerLoadingAnimation)) {
                recentAddedActivity.p2().removeAllViews();
            }
        }
    }

    static {
        ea.a.p("VXIkbSxoDW1l", "yyaIQ7U9");
        f26851m0 = ea.a.p("VXIkbSxuDXQbZl1jCHQ_b24=", "T4M3Vtqa");
        ea.a.p("VXIkbSxuDXQbZl1jCHQ_bypfVXIpdXA=", "S5JpP4qf");
        ea.a.p("KXJebSZuWHQzZiNjFHQBb1tfGmkoZQ==", "dfgYuA6T");
        f26850l0 = new a();
    }

    public RecentAddedActivity() {
        kotlin.a.a(new cg.a<String>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$mNotifyFrom$2
            {
                super(0);
            }

            @Override // cg.a
            public final String invoke() {
                return RecentAddedActivity.this.getIntent().getStringExtra(ea.a.p("VXIkbTI=", "RHAriNS5"));
            }
        });
        this.f26852a0 = kotlin.a.a(new cg.a<Integer>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$mFileType$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final Integer invoke() {
                return Integer.valueOf(RecentAddedActivity.this.getIntent().getIntExtra(ea.a.p("J2kfZRN5HmU=", "XhAsGne7"), 0));
            }
        });
        this.f26853b0 = kotlin.a.a(new cg.a<LinearLayout>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$bannerBottomAd$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final LinearLayout invoke() {
                return (LinearLayout) RecentAddedActivity.this.findViewById(R.id.bottomAd_RecentAdd);
            }
        });
        this.f26854c0 = new ArrayList<>();
        this.f26855d0 = new b();
        this.f26856e0 = new i();
        this.f26857f0 = new e();
        this.f26861j0 = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$mHandler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final Handler invoke() {
                return new Handler(Looper.getMainLooper());
            }
        });
    }

    public static void l2(RecentAddedActivity recentAddedActivity) {
        kotlin.jvm.internal.g.e(recentAddedActivity, ea.a.p("O2hYc10w", "KeRcog1O"));
        pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar = recentAddedActivity.f26862k0;
        if (dVar != null) {
            dVar.cancel();
        }
        recentAddedActivity.f26862k0 = null;
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_recent_added;
    }

    @Override // jl.a
    public final int F1() {
        return androidx.core.content.a.getColor(this, R.color.colorPrimary);
    }

    @Override // jl.a
    public final int G1() {
        int i10;
        int r22 = r2();
        if (r22 != 1) {
            if (r22 != 2) {
                if (r22 != 3) {
                    if (r22 != 4) {
                        i10 = R.color.colorPrimary;
                    } else {
                        i10 = R.color.colorPPT;
                    }
                } else {
                    i10 = R.color.colorExcel;
                }
            } else {
                i10 = R.color.colorWord;
            }
        } else {
            i10 = R.color.colorPDF;
        }
        return androidx.core.content.a.getColor(this, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f6  */
    @Override // jl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K1() {
        /*
            Method dump skipped, instructions count: 840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity.K1():void");
    }

    @Override // jl.a
    public final void L1() {
        kotlinx.coroutines.flow.r rVar;
        ReaderPdfApplication.k().f28152i.e(this, new h(new cg.l<no.d, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$initViewModel$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(no.d dVar) {
                invoke2(dVar);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(no.d dVar) {
                RecentAddedActivity recentAddedActivity = RecentAddedActivity.this;
                RecentAddedActivity.a aVar = RecentAddedActivity.f26850l0;
                Context context = recentAddedActivity.f19296j;
                if (context == null || dVar == null) {
                    return;
                }
                pdf.pdfreader.viewer.editor.free.utils.v.K(recentAddedActivity, context, dVar.f22614a, dVar.f22615b);
                ReaderPdfApplication.k().i(null);
            }
        }));
        BillingConfigImpl.c.getClass();
        BillingConfigImpl.x().e(this, new h(new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity$initViewModel$2
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
                kotlin.jvm.internal.g.d(bool, ea.a.p("WnQ=", "TF7Ac0p7"));
                if (bool.booleanValue()) {
                    RecentAddedActivity recentAddedActivity = RecentAddedActivity.this;
                    RecentAddedActivity.a aVar = RecentAddedActivity.f26850l0;
                    recentAddedActivity.p2().removeAllViews();
                    RecentAddedActivity.this.p2().setVisibility(8);
                    RecentAddedActivity recentAddedActivity2 = RecentAddedActivity.this;
                    gl.h.f17923a.getClass();
                    gl.h.b(recentAddedActivity2);
                    gl.b.f17914a.getClass();
                    gl.b.a(recentAddedActivity2);
                    gl.e eVar = gl.e.f17918a;
                    RecentAddedActivity recentAddedActivity3 = RecentAddedActivity.this;
                    eVar.getClass();
                    gl.e.a(recentAddedActivity3);
                }
            }
        }));
        int r22 = r2();
        if (r22 != 1) {
            if (r22 != 2) {
                if (r22 != 3) {
                    if (r22 != 4) {
                        rVar = RecentAddRepository.f24196q;
                    } else {
                        rVar = RecentAddRepository.f24200u;
                    }
                } else {
                    rVar = RecentAddRepository.f24199t;
                }
            } else {
                rVar = RecentAddRepository.f24198s;
            }
        } else {
            rVar = RecentAddRepository.f24197r;
        }
        pdf.pdfreader.viewer.editor.free.utils.t0.d0(b.b.x(this), null, null, new RecentAddedActivity$initViewModel$3(this, rVar, null), 3);
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public final void itemClickEvent(qo.g event) {
        int indexOf;
        kotlin.jvm.internal.g.e(event, "event");
        if (this.f19289b) {
            return;
        }
        String p10 = ea.a.p("D29aZTVmGmxl", "V4g7jsUk");
        String p11 = ea.a.p("W29aZRVmA2wtXwVsXWNr", "Eu37JjNk");
        String n22 = n2();
        Locale locale = Locale.ROOT;
        String f10 = a6.h.f("GE94VA==", "WHJ7gRQd", locale, n22, locale);
        kotlin.jvm.internal.g.d(f10, ea.a.p("R2gic1NhESAYYUJhR2w3biMuYXQ0aS1nWy45bx9vJmVBQypzFigObxFhWGUp", "rMSQMxF2"));
        tn.a.d(this, p10, p11, "added_".concat(f10), false);
        PdfPreviewEntity pdfPreviewEntity = event.f29402b;
        pdfPreviewEntity.setRecent(1);
        pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar = q2().E0;
        if (dVar != null && (indexOf = dVar.f27210e.indexOf(pdfPreviewEntity)) > -1) {
            dVar.notifyItemChanged(indexOf);
        }
        if (AdUtils.b(this)) {
            if (!pdf.pdfreader.viewer.editor.free.ads.f.m().e() && !pdf.pdfreader.viewer.editor.free.ads.g.m().e() && !pdf.pdfreader.viewer.editor.free.ads.l.m().e()) {
                s2(event, true);
                return;
            }
            pdf.pdfreader.viewer.editor.free.ads.f m10 = pdf.pdfreader.viewer.editor.free.ads.f.m();
            h5.f fVar = new h5.f(7, this, event);
            m10.getClass();
            this.f26860i0 = pdf.pdfreader.viewer.editor.free.ads.a.l(this, fVar);
            return;
        }
        s2(event, false);
    }

    public final void m2(boolean z10) {
        tf.c cVar = this.U;
        tf.c cVar2 = this.O;
        tf.c cVar3 = this.J;
        if (z10) {
            ((LinearLayout) cVar3.getValue()).setVisibility(8);
            ((LinearLayout) cVar2.getValue()).setVisibility(0);
            ((LinearLayout) cVar.getValue()).setVisibility(0);
            ((TextView) this.Q.getValue()).setText(getString(R.string.arg_res_0x7f130416, ea.a.p("MA==", "DLGeItvy")));
            ((View) this.V.getValue()).setEnabled(false);
            ((View) this.W.getValue()).setEnabled(false);
            ((View) this.X.getValue()).setEnabled(false);
            return;
        }
        ((CheckBox) this.T.getValue()).setChecked(false);
        ((LinearLayout) cVar3.getValue()).setVisibility(0);
        ((LinearLayout) cVar2.getValue()).setVisibility(8);
        ((LinearLayout) cVar.getValue()).setVisibility(8);
    }

    @Override // pdf.pdfreader.viewer.editor.free.fnbridge.a
    public final void n() {
        pdf.pdfreader.viewer.editor.free.ads.f.m().n(this, ReaderHomeActivity.f26653q2);
    }

    public final String n2() {
        int r22 = r2();
        if (r22 != 1) {
            if (r22 != 2) {
                if (r22 != 3) {
                    if (r22 != 4) {
                        return ea.a.p("CExM", "LZI7nfHh");
                    }
                    return ea.a.p("F1BU", "RLGL7q4R");
                }
                return ea.a.p("dlgIRUw=", "QaexOuVf");
            }
            return ea.a.p("ZE8ZRA==", "U14g3SjE");
        }
        return ea.a.p("H0RG", "wWB8zEzR");
    }

    public final void o2() {
        NativeItemClickApiImpl nativeItemClickApiImpl = NativeItemClickApiImpl.f25884a;
        ((ArrayList) NativeItemClickApiImpl.f25885b.getValue()).remove(this);
        EngineHelper engineHelper = EngineHelper.f15726a;
        String p10 = ea.a.p("W28mZTFvFnQdbXZhB24zcgV8Wm8rZQFvMHQIbQRhGW5WckI=", "DgFwS3M5");
        engineHelper.getClass();
        LinkedHashMap linkedHashMap = EngineHelper.f15732h;
        linkedHashMap.remove(p10);
        linkedHashMap.remove(ea.a.p("B29cZSpjVm4YYSRuEHIpfH1vA2UWYwRuBmEsbgJyQg==", "wkipDBgx"));
        linkedHashMap.remove(ea.a.p("B29cZTVpRHQYYSRuEHIpfH1vA2UJaRZ0CWEebiZyQg==", "tsZ4KpCZ"));
        AppViewModel k10 = ReaderPdfApplication.k();
        k10.f28147d.j(Boolean.TRUE);
        startActivity(new Intent(this, ReaderHomeActivity.class));
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (((LinearLayout) this.J.getValue()).getVisibility() != 0) {
            m2(false);
            q2().C0();
            return;
        }
        o2();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.tv_select_delete) {
            ArrayList<PdfPreviewEntity> arrayList = q2().E0.f27213h;
            if (arrayList.size() > 0) {
                pdf.pdfreader.viewer.editor.free.ui.dialog.h hVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.h(this);
                hVar.f23542t = new f(arrayList);
                hVar.show();
            }
            String p10 = ea.a.p("LGhebwpl", "rwxrVOCR");
            String p11 = ea.a.p("LGhebwplaGQ_bC90EF8LbFxjaw==", "AUXxoGfd");
            String n22 = n2();
            Locale locale = Locale.ROOT;
            String f10 = a6.h.f("Ck8fVA==", "PrXPoB7x", locale, n22, locale);
            kotlin.jvm.internal.g.d(f10, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnWy4_bwlvOWU9Q1BzHChbbzlhJmUp", "dstfrKEN"));
            tn.a.d(this, p10, p11, "added_".concat(f10), false);
        } else if (num != null && num.intValue() == R.id.tv_select_merge) {
            final ArrayList<PdfPreviewEntity> arrayList2 = q2().E0.f27213h;
            if (arrayList2.size() < 2) {
                return;
            }
            final ArrayList arrayList3 = new ArrayList();
            final WeakReference weakReference = new WeakReference(this);
            final Handler handler = new Handler(Looper.getMainLooper());
            pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.d(this, false);
            this.f26862k0 = dVar;
            dVar.a(R.string.arg_res_0x7f1303a8);
            pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar2 = this.f26862k0;
            if (dVar2 != null) {
                dVar2.show();
            }
            pdf.pdfreader.viewer.editor.free.utils.w0.a().f28790a.execute(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.f1
                @Override // java.lang.Runnable
                public final void run() {
                    String p12;
                    String p13;
                    String str;
                    String str2;
                    int i10;
                    ArrayList arrayList4 = arrayList2;
                    RecentAddedActivity.a aVar = RecentAddedActivity.f26850l0;
                    String p14 = ea.a.p("F3cuYRhDDW4GZUx0", "25Z9mlun");
                    WeakReference weakReference2 = weakReference;
                    kotlin.jvm.internal.g.e(weakReference2, p14);
                    String p15 = ea.a.p("TG4vZTFQEHM7dwlyUEU5dFF0eQ==", "DPhJUqKE");
                    ArrayList arrayList5 = arrayList3;
                    kotlin.jvm.internal.g.e(arrayList5, p15);
                    String p16 = ea.a.p("F20uchRlL2EbbnxhB2Q6ZXI=", "oDp0D1H5");
                    Handler handler2 = handler;
                    kotlin.jvm.internal.g.e(handler2, p16);
                    String p17 = ea.a.p("R2gic1cw", "doSZacIv");
                    RecentAddedActivity recentAddedActivity = this;
                    kotlin.jvm.internal.g.e(recentAddedActivity, p17);
                    try {
                        try {
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it = arrayList4.iterator();
                            boolean z10 = false;
                            while (it.hasNext()) {
                                PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) it.next();
                                try {
                                    if (new ReaderPDFCore((Context) weakReference2.get(), pdfPreviewEntity.getPath()).needsPassword()) {
                                        PdfPreviewEntity l10 = aj.b.l(pdfPreviewEntity);
                                        arrayList5.add(l10);
                                        kotlin.jvm.internal.g.d(l10, ea.a.p("XWU8RR10C3R5", "aPvyJRbl"));
                                        arrayList6.add(new MergePdfData(l10, true, "", pdfPreviewEntity.getId()));
                                    } else {
                                        PdfPreviewEntity l11 = aj.b.l(pdfPreviewEntity);
                                        kotlin.jvm.internal.g.d(l11, ea.a.p("UG87eSNkBFAAZUJpDHcTbjBpRnluZS10GHQSKQ==", "qkHmLsaF"));
                                        arrayList6.add(new MergePdfData(l11, false, "", pdfPreviewEntity.getId()));
                                    }
                                } catch (Exception unused) {
                                    z10 = true;
                                }
                            }
                            if (z10) {
                                if (arrayList6.isEmpty()) {
                                    i10 = R.string.arg_res_0x7f1303ec;
                                } else {
                                    i10 = R.string.arg_res_0x7f130408;
                                }
                                handler2.post(new lib.zj.office.system.l(weakReference2, recentAddedActivity, i10, 4));
                            }
                            if (!arrayList6.isEmpty()) {
                                if (arrayList5.isEmpty()) {
                                    handler2.post(new f0.s(27, weakReference2, arrayList6));
                                } else {
                                    handler2.post(new qb.c1(6, weakReference2, arrayList5, arrayList6));
                                }
                            }
                            handler2.post(new g1(recentAddedActivity, 0));
                            p12 = ea.a.p("C2hZb0tl", "nWh6891f");
                            p13 = ea.a.p("UGgkbwBlPW0XclNlNmM6aSdr", "g5H4N5j7");
                            str = "VmQhZWQ=";
                            str2 = "BJ7EMl2T";
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            o9.d.s(ea.a.p("W28mZT5lEGcXUFBm", "k5LL4OVv"), e10.toString());
                            handler2.post(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c(recentAddedActivity, 7));
                            p12 = ea.a.p("UGgkbwBl", "zctiiSo6");
                            p13 = ea.a.p("UGgkbwBlPW0XclNlNmM6aSdr", "KYYepICa");
                            str = "KGQMZWQ=";
                            str2 = "7ZIhsE4M";
                        }
                        tn.a.d(recentAddedActivity, p12, p13, ea.a.p(str, str2), false);
                    } catch (Throwable th2) {
                        handler2.post(new r(recentAddedActivity, 1));
                        tn.a.d(recentAddedActivity, ea.a.p("EGgDbyFl", "6hslRXqo"), ea.a.p("LGhebwplaG0_ci1lKmMEaVZr", "bp4WCVZE"), ea.a.p("UmQvZWQ=", "yX4AxkSO"), false);
                        throw th2;
                    }
                }
            });
        } else if (num != null && num.intValue() == R.id.tv_select_share) {
            ArrayList<PdfPreviewEntity> arrayList4 = q2().E0.f27213h;
            if (arrayList4.size() > 0) {
                pdf.pdfreader.viewer.editor.free.utils.e1.f(this, arrayList4);
            }
            String p12 = ea.a.p("V2gHbx9l", "7O4hleJ1");
            String p13 = ea.a.p("UGgkbwBlPXMaYUZlNmM6aSdr", "yaqML1wC");
            String n23 = n2();
            Locale locale2 = Locale.ROOT;
            String f11 = a6.h.f("YU8EVA==", "qMpQ5Mkz", locale2, n23, locale2);
            kotlin.jvm.internal.g.d(f11, ea.a.p("R2gic1NhESAYYUJhR2w3biMuYXQ0aS1nGS4ybzZvJ2VBQypzFigObxFhWGUp", "0FzP4R9R"));
            tn.a.d(this, p12, p13, "added_".concat(f11), false);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        wk.b.b().k(this);
        pdf.pdfreader.viewer.editor.free.ui.dialog.w wVar = this.f26860i0;
        if (wVar != null) {
            if (wVar.isShowing()) {
                wVar.dismiss();
            }
            this.f26860i0 = null;
        }
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public final void onEventBottomButtons(qo.n ev) {
        kotlin.jvm.internal.g.e(ev, "ev");
        if (this.f19289b) {
            return;
        }
        ((LinearLayout) this.U.getValue()).setVisibility(0);
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(qo.q event) {
        boolean z10;
        boolean z11;
        boolean z12;
        kotlin.jvm.internal.g.e(event, "event");
        if (this.f19289b) {
            return;
        }
        boolean z13 = true;
        m2(true);
        int i10 = event.f29411a;
        ((TextView) this.Q.getValue()).setText(getString(R.string.arg_res_0x7f130416, String.valueOf(i10)));
        CheckBox checkBox = (CheckBox) this.T.getValue();
        if (i10 >= event.f29412b) {
            z10 = true;
        } else {
            z10 = false;
        }
        checkBox.setChecked(z10);
        View view = (View) this.V.getValue();
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        view.setEnabled(z11);
        View view2 = (View) this.W.getValue();
        if (i10 > 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        view2.setEnabled(z12);
        View view3 = (View) this.X.getValue();
        if (i10 <= 0) {
            z13 = false;
        }
        view3.setEnabled(z13);
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        super.onPause();
        gl.h.f17923a.getClass();
        gl.i.f17925o.l();
        gl.j.f17926o.l();
        gl.b.f17914a.getClass();
        gl.c.f17916o.l();
        gl.d.f17917o.l();
        gl.e.f17918a.getClass();
        gl.f.f17921p.h();
        gl.g.f17922p.h();
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        gl.h.f17923a.getClass();
        gl.i.f17925o.m();
        gl.j.f17926o.m();
        gl.b.f17914a.getClass();
        gl.c.f17916o.m();
        gl.d.f17917o.m();
        gl.e.f17918a.getClass();
        gl.f.f17921p.i();
        gl.g.f17922p.i();
        if (this.f26858g0) {
            this.f26858g0 = false;
            qo.g gVar = ReaderHomeActivity.f26652p2;
            if (gVar != null) {
                PdfPreviewEntity pdfPreviewEntity = gVar.f29402b;
                pdf.pdfreader.viewer.editor.free.utils.k0.f(0, this, gVar.f29401a, "", pdfPreviewEntity, new h1(this, pdfPreviewEntity), false);
            }
            ReaderHomeActivity.f26652p2 = null;
            return;
        }
        AppOpenManager.c().f23907g = true;
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.f26858g0) {
            this.f26858g0 = false;
            ReaderHomeActivity.f26651o2 = true;
        }
    }

    public final LinearLayout p2() {
        return (LinearLayout) this.f26853b0.getValue();
    }

    public final pdf.pdfreader.viewer.editor.free.ui.frag.n q2() {
        return (pdf.pdfreader.viewer.editor.free.ui.frag.n) this.Y.getValue();
    }

    public final int r2() {
        return ((Number) this.f26852a0.getValue()).intValue();
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public final void refreshList(qo.h event) {
        kotlin.jvm.internal.g.e(event, "event");
        pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar = q2().E0;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    public final void s2(qo.g gVar, boolean z10) {
        if (gVar == null) {
            return;
        }
        if (!z10) {
            PdfPreviewEntity pdfPreviewEntity = gVar.f29402b;
            pdf.pdfreader.viewer.editor.free.utils.k0.f(0, this, gVar.f29401a, "", pdfPreviewEntity, new h1(this, pdfPreviewEntity), false);
            return;
        }
        boolean c10 = FullScreenManage.c(2, this, false);
        ReaderHomeActivity.f26652p2 = gVar;
        if (c10 && BillingConfigImpl.c.w()) {
            String p10 = ea.a.p("P3JUbRB1WiAvcy9yWSAba1xwTmkxZQhDNGkKayB1BmwOZBFzEW93", "oecPXifj");
            int i10 = zk.a.f32399a;
            t1.b(p10);
            qo.g gVar2 = ReaderHomeActivity.f26652p2;
            if (gVar2 != null) {
                PdfPreviewEntity pdfPreviewEntity2 = gVar2.f29402b;
                pdf.pdfreader.viewer.editor.free.utils.k0.f(0, this, gVar2.f29401a, "", pdfPreviewEntity2, new h1(this, pdfPreviewEntity2), false);
            }
            ReaderHomeActivity.f26652p2 = null;
        } else if (c10) {
            String p11 = ea.a.p("EkRG", "uJBqkNLJ");
            PdfPreviewEntity pdfPreviewEntity3 = gVar.f29402b;
            if (TextUtils.equals(p11, pdfPreviewEntity3.getOtherStrOne()) && !TextUtils.isEmpty(pdfPreviewEntity3.getPath())) {
                V1();
                pdf.pdfreader.viewer.editor.free.utils.w0.a().c.execute(new com.facebook.appevents.g(23, this, gVar));
                return;
            }
            u2();
        } else {
            qo.g gVar3 = ReaderHomeActivity.f26652p2;
            if (gVar3 != null) {
                PdfPreviewEntity pdfPreviewEntity4 = gVar3.f29402b;
                pdf.pdfreader.viewer.editor.free.utils.k0.f(0, this, gVar3.f29401a, "", pdfPreviewEntity4, new h1(this, pdfPreviewEntity4), false);
            }
            ReaderHomeActivity.f26652p2 = null;
        }
    }

    public final void t2() {
        I1();
        if (!this.f19289b) {
            String string = getString(R.string.arg_res_0x7f130391);
            kotlin.jvm.internal.g.d(string, ea.a.p("M2UhU0dyJm4vKDQuR3QlaVZnfHIsYVJlBl8XaT1lHWUsYzBwR2kgbik=", "9MTU3ODI"));
            String string2 = getString(R.string.arg_res_0x7f130390);
            kotlin.jvm.internal.g.d(string2, ea.a.p("LmUsUx9yIW4vKDQuR3QlaVZnfHIsYVJlloDXZjhsJ18qbypyHnA8XythCG5bdAhvSGU8KQ==", "JnIXkHDG"));
            i3 i3Var = new i3(this, string, string2, null);
            i3Var.setCanceledOnTouchOutside(false);
            i3Var.setCancelable(true);
            i3Var.show();
        }
    }

    public final void u2() {
        I1();
        if (!this.f19289b) {
            this.f26858g0 = true;
            tf.c cVar = FullScreenManage.f23914a;
            FullScreenManage.h(this, ea.a.p("OWlUdw==", "llD6pXYI"), false);
            NativeItemClickApiImpl.f25884a.n();
        }
    }

    /* compiled from: RecentAddedActivity.kt */
    /* loaded from: classes3.dex */
    public static final class e implements com.lib.flutter.encrypt.e {
        @Override // com.lib.flutter.encrypt.e
        public final void a(String str) {
            if (BillingConfigImpl.c.w()) {
                String p10 = ea.a.p("P3JUbRB1WiAvcy9yWSAba1xwTmgqbQBMAXNCQhtuPmU9IEJoFnc=", "PbCVh6zP");
                int i10 = zk.a.f32399a;
                t1.b(p10);
                return;
            }
            gl.e.f17918a.getClass();
            gl.e.f(str);
        }

        @Override // com.lib.flutter.encrypt.e
        public final void b() {
        }
    }

    @Override // jl.a
    public final void C1() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.fnbridge.a
    public final void k() {
    }
}
