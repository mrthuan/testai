package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.w;
import java.io.Serializable;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;
import pdf.pdfreader.viewer.editor.free.feature.ai.data.AIQuickTag;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import qb.j0;

/* compiled from: BaseAISubscriptionActivity.kt */
/* loaded from: classes3.dex */
public abstract class BaseAISubscriptionActivity extends BaseSubscriptionActivity {
    public static final String U;
    public boolean S;
    public boolean T;

    /* compiled from: BaseAISubscriptionActivity.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24882a;

        static {
            int[] iArr = new int[SubscriptionType.values().length];
            try {
                iArr[SubscriptionType.MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionType.YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubscriptionType.YEAR_TRIAL_3D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SubscriptionType.YEAR_TRIAL_7D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SubscriptionType.YEAR_TRIAL_14D.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f24882a = iArr;
        }
    }

    /* compiled from: BaseAISubscriptionActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f24884e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f24885f;

        public b(String str, String str2) {
            this.f24884e = str;
            this.f24885f = str2;
        }

        @Override // oo.a
        public final void a() {
            Context m10 = ReaderPdfApplication.m();
            String p10 = ea.a.p("WmFw", "4SLbiQ9s");
            String p11 = ea.a.p("O2EncgB0KWkmXxV0VXIjX1tsO2Nr", "TIRWeHhA");
            BaseAISubscriptionActivity baseAISubscriptionActivity = BaseAISubscriptionActivity.this;
            String str = this.f24884e;
            String str2 = this.f24885f;
            tn.a.d(m10, p10, p11, baseAISubscriptionActivity.g2(str, str2, false), false);
            tn.a.d(ReaderPdfApplication.m(), ea.a.p("IGFw", "9tIvNcbN"), ea.a.p("JGE4cgx0B2kmXxV0VXIjX1tsO2Nr", "U4MHifEf"), baseAISubscriptionActivity.g2(str, str2, true), false);
            SubscriptionType subscriptionType = SubscriptionType.YEAR_TRIAL_7D;
            baseAISubscriptionActivity.J = subscriptionType;
            baseAISubscriptionActivity.w2(subscriptionType, str);
        }

        @Override // androidx.fragment.app.w, oo.a
        public final void cancel() {
            Context m10 = ReaderPdfApplication.m();
            String p10 = ea.a.p("JmFw", "iOLt2M4P");
            String p11 = ea.a.p("WmE7chZ0A2kcX1hlCHYzXydsW2Nr", "BE5w2P36");
            BaseAISubscriptionActivity baseAISubscriptionActivity = BaseAISubscriptionActivity.this;
            String str = this.f24884e;
            String str2 = this.f24885f;
            tn.a.d(m10, p10, p11, baseAISubscriptionActivity.g2(str, str2, false), false);
            tn.a.d(ReaderPdfApplication.m(), ea.a.p("JmFw", "imjTkv3c"), ea.a.p("JmFBchx0Vmk0XyZlFHYNX1ZsB2Nr", "wM3KCZGJ"), baseAISubscriptionActivity.g2(str, str2, true), false);
            baseAISubscriptionActivity.finish();
        }
    }

    static {
        ea.a.p("DWFCZThJZHU4cylyHHAcaVpuL2MxaRNpI3k=", "Is1fWoTr");
        U = ea.a.p("JGVIXxhpaGovbTpfAWEaZ1B0", "rvcKpA2h");
    }

    public abstract AppCompatImageView B2();

    public abstract TextView C2();

    public abstract TextView D2();

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    public abstract TextView E2();

    @Override // jl.a
    public final int F1() {
        return -16645881;
    }

    public abstract TextView F2();

    public abstract TextView G2();

    public abstract ConstraintLayout H2();

    public abstract TextView I2();

    public abstract TextView J2();

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a
    public void K1() {
        super.K1();
        G2().getPaint().setFlags(G2().getPaintFlags() | 8);
        E2().getPaint().setFlags(E2().getPaintFlags() | 8);
        B2().setOnClickListener(new k9.c(this, 2));
        F2().setOnClickListener(new u4.g(this, 3));
        C2().setOnClickListener(new u4.j(this, 5));
        G2().setOnClickListener(new d9.f(this, 4));
        E2().setOnClickListener(new j0(this, 4));
        H2().setOnClickListener(new f5.d(this, 5));
        D2().setOnClickListener(new f5.e(this, 3));
    }

    public abstract AppCompatImageView K2();

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a
    public final void L1() {
        super.L1();
        t0.d0(b.b.x(this), null, null, new BaseAISubscriptionActivity$initViewModel$1(this, null), 3);
    }

    public abstract TextView L2();

    @Override // android.app.Activity
    public final void finish() {
        AIJumpTarget aIJumpTarget;
        if (!this.S && !this.T) {
            this.S = true;
            Intent intent = getIntent();
            String str = U;
            if (intent.hasExtra(str)) {
                Serializable serializableExtra = intent.getSerializableExtra(str);
                if (serializableExtra instanceof AIJumpTarget) {
                    aIJumpTarget = (AIJumpTarget) serializableExtra;
                } else {
                    aIJumpTarget = null;
                }
                if (aIJumpTarget != null) {
                    Class<?> target = aIJumpTarget.getTarget();
                    if (BillingConfigImpl.c.w()) {
                        if (kotlin.jvm.internal.g.a(target, PDFChooseActivity.class) && aIJumpTarget.getAiChooseFileParams() != null) {
                            PDFChooseActivity.a aVar = PDFChooseActivity.f27008u0;
                            ToolsType toolsType = aIJumpTarget.getAiChooseFileParams().getToolsType();
                            int aiType = aIJumpTarget.getAiChooseFileParams().getAiType();
                            AIQuickTag aiQuickTag = aIJumpTarget.getAiChooseFileParams().getAiQuickTag();
                            aVar.getClass();
                            PDFChooseActivity.a.a(this, toolsType, aiType, aiQuickTag);
                        } else if (kotlin.jvm.internal.g.a(target, AIHomeActivity.class)) {
                            AIHomeActivity.a aVar2 = AIHomeActivity.J;
                            String str2 = this.f24889w;
                            aVar2.getClass();
                            AIHomeActivity.a.a(this, str2);
                        } else if (kotlin.jvm.internal.g.a(target, AIChatActivity.class) && aIJumpTarget.getChatPageParams() != null) {
                            AIChatActivity.a aVar3 = AIChatActivity.f24356v0;
                            AIQuickTag aiQuickTag2 = aIJumpTarget.getChatPageParams().getAiQuickTag();
                            String filePath = aIJumpTarget.getChatPageParams().getFilePath();
                            int fileType = aIJumpTarget.getChatPageParams().getFileType();
                            int fromSource = aIJumpTarget.getChatPageParams().getFromSource();
                            aVar3.getClass();
                            AIChatActivity.a.a(this, aiQuickTag2, filePath, fileType, fromSource);
                        }
                    } else if (kotlin.jvm.internal.g.a(target, AIHomeActivity.class)) {
                        AIHomeActivity.a aVar4 = AIHomeActivity.J;
                        String str3 = this.f24889w;
                        aVar4.getClass();
                        AIHomeActivity.a.a(this, str3);
                    } else if (q0.k(this) > 0 && kotlin.jvm.internal.g.a(target, AIChatActivity.class) && aIJumpTarget.getChatPageParams() != null) {
                        AIChatActivity.a aVar5 = AIChatActivity.f24356v0;
                        AIQuickTag aiQuickTag3 = aIJumpTarget.getChatPageParams().getAiQuickTag();
                        String filePath2 = aIJumpTarget.getChatPageParams().getFilePath();
                        int fileType2 = aIJumpTarget.getChatPageParams().getFileType();
                        int fromSource2 = aIJumpTarget.getChatPageParams().getFromSource();
                        aVar5.getClass();
                        AIChatActivity.a.a(this, aiQuickTag3, filePath2, fileType2, fromSource2);
                    }
                }
            }
        }
        super.finish();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final boolean k2() {
        return false;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f19294h = true;
        Window window = getWindow();
        kotlin.jvm.internal.g.d(window, ea.a.p("RGklZBx3", "65EjgtnQ"));
        pdf.pdfreader.viewer.editor.free.utils.extension.i.b(window, false);
        Window window2 = getWindow();
        kotlin.jvm.internal.g.d(window2, ea.a.p("RGklZBx3", "GU2tc75v"));
        pdf.pdfreader.viewer.editor.free.utils.extension.i.a(window2, false);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        j2().o(z10);
        if (z10 && B2().getVisibility() != 0) {
            AppCompatImageView B2 = B2();
            if (B2.getVisibility() != 0 && hasWindowFocus()) {
                B2.postDelayed(new l1.a(16, this, B2), c1.c(this));
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final void p2() {
        Object obj;
        boolean z10;
        s2();
        if (m2() && !this.f24892z && j2().g(this.f24891y)) {
            Iterator<T> it = j2().e(this.f24891y).c.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((ol.i) obj).f23489a == SubscriptionType.YEAR_TRIAL_7D) {
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
            ol.i iVar = (ol.i) obj;
            if (iVar != null) {
                String p10 = ea.a.p("UGwkc2U=", "42mC0BfC");
                String str = iVar.f23491d;
                b bVar = new b(p10, str);
                if (l2()) {
                    pdf.pdfreader.viewer.editor.free.feature.billing.dialog.a aVar = new pdf.pdfreader.viewer.editor.free.feature.billing.dialog.a(this, iVar.f23491d, iVar.c, iVar.f23492e);
                    aVar.f23542t = bVar;
                    aVar.show();
                } else {
                    pdf.pdfreader.viewer.editor.free.feature.billing.dialog.b bVar2 = new pdf.pdfreader.viewer.editor.free.feature.billing.dialog.b(this, str, iVar.c);
                    bVar2.f23542t = bVar;
                    bVar2.show();
                }
                this.f24892z = true;
                tn.a.d(this, ea.a.p("WmFw", "IsTsWSgr"), ea.a.p("GGE8cgx0L2kmXxVoW3c=", "YpqLiNws"), g2(p10, str, false), false);
                tn.a.d(this, ea.a.p("JmFw", "IiKeoVsP"), ea.a.p("WmE7chZ0A2kcX0doBnc=", "W3azv644"), g2(p10, str, true), false);
                return;
            }
        }
        finish();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final void q2(boolean z10, boolean z11) {
        int i10;
        H2().setSelected(z10);
        D2().setSelected(!z10);
        AppCompatImageView K2 = K2();
        int i11 = 4;
        int i12 = 0;
        if (z10 && z11) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        K2.setVisibility(i10);
        TextView L2 = L2();
        if (z10 && z11) {
            i11 = 0;
        }
        L2.setVisibility(i11);
        TextView J2 = J2();
        if (!z11) {
            i12 = 8;
        }
        J2.setVisibility(i12);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final void u2(ol.d info) {
        kotlin.jvm.internal.g.e(info, "info");
        TextView L2 = L2();
        String string = getString(R.string.arg_res_0x7f13034e, info.f23477b);
        L2.setText(string + " ");
        for (ol.i iVar : info.c) {
            int i10 = a.f24882a[iVar.f23489a.ordinal()];
            String str = iVar.c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        J2().setText(getString(R.string.arg_res_0x7f13057d, str));
                        I2().setText(getString(R.string.arg_res_0x7f1300e1, iVar.f23491d));
                    }
                } else {
                    I2().setText(getString(R.string.arg_res_0x7f130263, str));
                }
            } else {
                D2().setText(getString(R.string.arg_res_0x7f130268, str));
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final void z2(String str, boolean z10) {
        int i10;
        boolean z11 = !z10;
        if (z10) {
            i10 = R.drawable.ic_subscription_positive;
        } else {
            i10 = R.drawable.ic_subscription_negative;
        }
        j1.i(this, str, z11, i10);
    }

    @Override // jl.a
    public final void C1() {
    }
}
