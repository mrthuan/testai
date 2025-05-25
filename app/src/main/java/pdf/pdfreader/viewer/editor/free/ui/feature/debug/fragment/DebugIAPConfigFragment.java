package pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;
import kotlinx.coroutines.flow.StateFlowImpl;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugViewModel;

/* compiled from: DebugIAPConfigFragment.kt */
/* loaded from: classes3.dex */
public final class DebugIAPConfigFragment extends b<am.p0> {

    /* renamed from: e0  reason: collision with root package name */
    public static final /* synthetic */ int f27857e0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final androidx.lifecycle.k0 f27858d0 = androidx.fragment.app.y0.a(this, kotlin.jvm.internal.i.a(ReaderDebugViewModel.class), new cg.a<androidx.lifecycle.o0>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugIAPConfigFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final androidx.lifecycle.o0 invoke() {
            androidx.lifecycle.o0 viewModelStore = Fragment.this.f0().getViewModelStore();
            kotlin.jvm.internal.g.d(viewModelStore, ea.a.p("QWU6dRpyB0ERdF12AHQvKG0uRGkjdw5vU2U6U0dvNWU=", "7V3GW8qa"));
            return viewModelStore;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugIAPConfigFragment$special$$inlined$activityViewModels$default$2
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // cg.a
        public final n1.a invoke() {
            n1.a aVar;
            cg.a aVar2 = cg.a.this;
            if (aVar2 == null || (aVar = (n1.a) aVar2.invoke()) == null) {
                n1.a defaultViewModelCreationExtras = this.f0().getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.g.d(defaultViewModelCreationExtras, ea.a.p("PWVAdRByUkE5dCN2HHQRKBwuCmUjYRBsM1YGZQBNV2QqbHJyHGFDaTVuD3gBcglz", "LDERGow8"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugIAPConfigFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = Fragment.this.f0().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.g.d(defaultViewModelProviderFactory, ea.a.p("QWU6dRpyB0ERdF12AHQvKG0uVmUgYTZsRFYuZSBNHmRWbBtyHHYLZBdycmEKdDlyeQ==", "0GWqs5oN"));
            return defaultViewModelProviderFactory;
        }
    });

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final i2.a p0(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_debug_iap, viewGroup, false);
        int i10 = R.id.alwaysShowSplashSubscribe;
        CheckBox checkBox = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.alwaysShowSplashSubscribe);
        if (checkBox != null) {
            i10 = R.id.billingTestL1Plan;
            if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.billingTestL1Plan)) != null) {
                i10 = R.id.billingTestLChange;
                RadioGroup radioGroup = (RadioGroup) com.google.android.play.core.assetpacks.c.u(inflate, R.id.billingTestLChange);
                if (radioGroup != null) {
                    i10 = R.id.billingTestLNoPlan;
                    if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.billingTestLNoPlan)) != null) {
                        i10 = R.id.billingTestLPlan;
                        if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.billingTestLPlan)) != null) {
                            i10 = R.id.goToBlackFridayPage;
                            Button button = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.goToBlackFridayPage);
                            if (button != null) {
                                i10 = R.id.ocr_always_show_tip_switch;
                                CheckBox checkBox2 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ocr_always_show_tip_switch);
                                if (checkBox2 != null) {
                                    i10 = R.id.ocr_display_subscribe_switch;
                                    Button button2 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ocr_display_subscribe_switch);
                                    if (button2 != null) {
                                        i10 = R.id.operate_pdf_need_premium_switch;
                                        CheckBox checkBox3 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.operate_pdf_need_premium_switch);
                                        if (checkBox3 != null) {
                                            i10 = R.id.resetSplashSubscription;
                                            Button button3 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.resetSplashSubscription);
                                            if (button3 != null) {
                                                i10 = R.id.splashSubscriptionLoadingBtn;
                                                Button button4 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.splashSubscriptionLoadingBtn);
                                                if (button4 != null) {
                                                    i10 = R.id.subscriptionHappyNewYear2025Cb;
                                                    CheckBox checkBox4 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscriptionHappyNewYear2025Cb);
                                                    if (checkBox4 != null) {
                                                        i10 = R.id.subscriptionSplashLoadingCb;
                                                        CheckBox checkBox5 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscriptionSplashLoadingCb);
                                                        if (checkBox5 != null) {
                                                            i10 = R.id.subscriptionSplashShowTimeBtn;
                                                            Button button5 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscriptionSplashShowTimeBtn);
                                                            if (button5 != null) {
                                                                i10 = R.id.subscriptionSplashShowTimeEt;
                                                                EditText editText = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscriptionSplashShowTimeEt);
                                                                if (editText != null) {
                                                                    i10 = R.id.user_premium_switch;
                                                                    CheckBox checkBox6 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.user_premium_switch);
                                                                    if (checkBox6 != null) {
                                                                        am.p0 p0Var = new am.p0((NestedScrollView) inflate, checkBox, radioGroup, button, checkBox2, button2, checkBox3, button3, button4, checkBox4, checkBox5, button5, editText, checkBox6);
                                                                        ea.a.p("Jm5XbBh0UigzbixsFHQNchkgDW8rdARpAmUULGJmMGw8ZSk=", "vufWlfBQ");
                                                                        return p0Var;
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
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpR2hNSS06IA==", "oJGr3mid").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void r0() {
        int i10;
        VB vb2 = this.Y;
        kotlin.jvm.internal.g.b(vb2);
        ((am.p0) vb2).f1291f.setOnClickListener(new d9.f(this, 27));
        pdf.pdfreader.viewer.editor.free.utils.c cVar = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
        String p10 = ea.a.p("K2VTdR5CXmw2aSRnIWUbdHlDAW4jaWc=", "QwOkLyol");
        SharedPreferences sharedPreferences = pdf.pdfreader.viewer.editor.free.utils.c.f28559b;
        String str = "";
        String string = sharedPreferences.getString(p10, "");
        if (string != null) {
            str = string;
        }
        VB vb3 = this.Y;
        kotlin.jvm.internal.g.b(vb3);
        am.p0 p0Var = (am.p0) vb3;
        if (kotlin.jvm.internal.g.a(str, ea.a.p("dDE=", "2J87jAoV"))) {
            i10 = R.id.billingTestL1Plan;
        } else if (kotlin.jvm.internal.g.a(str, ea.a.p("IG5daRdl", "JcNiJtAU"))) {
            i10 = R.id.billingTestLPlan;
        } else {
            i10 = R.id.billingTestLNoPlan;
        }
        p0Var.c.check(i10);
        VB vb4 = this.Y;
        kotlin.jvm.internal.g.b(vb4);
        ((am.p0) vb4).c.setOnCheckedChangeListener(new p(1));
        VB vb5 = this.Y;
        kotlin.jvm.internal.g.b(vb5);
        ((am.p0) vb5).f1289d.setOnClickListener(new f5.d(this, 26));
        pdf.pdfreader.viewer.editor.free.utils.c.f28558a.getClass();
        int i11 = sharedPreferences.getInt(ea.a.p("V2UpdRRfEXAeYUdoNnM-bzNfRmkrZRwxcDg=", "EmOODP0X"), 3);
        VB vb6 = this.Y;
        kotlin.jvm.internal.g.b(vb6);
        ((am.p0) vb6).f1298m.setText(String.valueOf(i11));
        VB vb7 = this.Y;
        kotlin.jvm.internal.g.b(vb7);
        ((am.p0) vb7).f1297l.setOnClickListener(new f5.e(this, 25));
        VB vb8 = this.Y;
        kotlin.jvm.internal.g.b(vb8);
        ((am.p0) vb8).f1293h.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.s(3));
        boolean z10 = ReaderDebugActivity.f27840s;
        VB vb9 = this.Y;
        kotlin.jvm.internal.g.b(vb9);
        String p11 = ea.a.p("UWklZBpuBS4dY0ZBBXc3eTdTWm8xVCpwYHdYdAho", "31k4WMj0");
        CheckBox checkBox = ((am.p0) vb9).f1290e;
        kotlin.jvm.internal.g.d(checkBox, p11);
        b.t0(z10, checkBox, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugIAPConfigFragment$initView$6
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z11) {
                boolean z12 = ReaderDebugActivity.f27826e;
                ReaderDebugActivity.f27840s = z11;
            }
        });
        boolean z11 = sharedPreferences.getBoolean(ea.a.p("d0UJVTRfMUg9V2tIKFAGWRtOd1cZWQZBP193MGE1b1ByR0U=", "mES0D4gY"), true);
        VB vb10 = this.Y;
        kotlin.jvm.internal.g.b(vb10);
        String p12 = ea.a.p("DGkDZC9uJi47dQRzV3I-cExpPW4BYUZwDU4UdwhlI3JcMF81BWI=", "f7nmFAOr");
        CheckBox checkBox2 = ((am.p0) vb10).f1295j;
        kotlin.jvm.internal.g.d(checkBox2, p12);
        b.t0(z11, checkBox2, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugIAPConfigFragment$initView$7
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z12) {
                a6.h.j("HEVzVTRfAkgHVzlIdVAHWWdOF1cWWXNBJl9DMGM1HVAZR0U=", "7zX1sQUI", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z12);
            }
        });
        boolean z12 = sharedPreferences.getBoolean(ea.a.p("V2UpdRRfEXAeYUdoNnMjYjdjQGk2dCpvIF8Zby1kWW5UXzhoHHc9MUc2", "NuL0a9gn"), true);
        VB vb11 = this.Y;
        kotlin.jvm.internal.g.b(vb11);
        String p13 = ea.a.p("LWlfZBBuUC4pdShzFnIBcEFpAW4WcAlhF2h_b1dkH24oQ2I=", "WWtNd36v");
        CheckBox checkBox3 = ((am.p0) vb11).f1296k;
        kotlin.jvm.internal.g.d(checkBox3, p13);
        b.t0(z12, checkBox3, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugIAPConfigFragment$initView$8
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z13) {
                a6.h.j("V2UpdRRfEXAeYUdoNnMjYjdjQGk2dCpvNF9cbzJkWG5UXzhoHHc9MUc2", "Z0S1grZf", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z13);
            }
        });
        boolean z13 = sharedPreferences.getBoolean(ea.a.p("V2UpdRRfA2wFYU1zNnM-bzNfQXAqYTBoCXNDYgBjFmlRZRQxRjY=", "V6sdMF00"), false);
        VB vb12 = this.Y;
        kotlin.jvm.internal.g.b(vb12);
        String p14 = ea.a.p("LWlfZBBuUC47bD1hDHM7aFp3PXApYRZoK3Urc1dyAGJl", "OPfLxI4i");
        CheckBox checkBox4 = ((am.p0) vb12).f1288b;
        kotlin.jvm.internal.g.d(checkBox4, p14);
        b.t0(z13, checkBox4, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugIAPConfigFragment$initView$9
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z14) {
                a6.h.j("V2UpdRRfA2wFYU1zNnM-bzNfQXAqYTBoCnM8YkNjGGlRZRQxRjY=", "UI0jKv3y", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z14);
            }
        });
        BillingConfigImpl.c.getClass();
        ig.h<Object>[] hVarArr = BillingConfigImpl.f24850d;
        boolean booleanValue = ((Boolean) BillingConfigImpl.f24855i.b(hVarArr[1])).booleanValue();
        VB vb13 = this.Y;
        kotlin.jvm.internal.g.b(vb13);
        String p15 = ea.a.p("UWklZBpuBS4Hc1FyOXIzbS11X1MxaTdjaA==", "XdkSIwCG");
        CheckBox checkBox5 = ((am.p0) vb13).f1299n;
        kotlin.jvm.internal.g.d(checkBox5, p15);
        b.t0(booleanValue, checkBox5, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugIAPConfigFragment$initView$10
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z14) {
                Object b10;
                BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
                billingConfigImpl.getClass();
                BillingConfigImpl.f24855i.c(BillingConfigImpl.f24850d[1], Boolean.valueOf(z14));
                StateFlowImpl stateFlowImpl = BillingConfigImpl.f24856j;
                do {
                    b10 = stateFlowImpl.b();
                    ((Boolean) b10).booleanValue();
                } while (!stateFlowImpl.c(b10, Boolean.valueOf(billingConfigImpl.w())));
            }
        });
        boolean booleanValue2 = ((Boolean) BillingConfigImpl.F.b(hVarArr[10])).booleanValue();
        VB vb14 = this.Y;
        kotlin.jvm.internal.g.b(vb14);
        String p16 = ea.a.p("VWktZA1uPi4ncANyVXQyUFxmHGUsZGZyEW0YdTxTNWlDY2g=", "EC7CdYfW");
        CheckBox checkBox6 = ((am.p0) vb14).f1292g;
        kotlin.jvm.internal.g.d(checkBox6, p16);
        b.t0(booleanValue2, checkBox6, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugIAPConfigFragment$initView$11
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z14) {
                BillingConfigImpl.c.getClass();
                BillingConfigImpl.F.c(BillingConfigImpl.f24850d[10], Boolean.valueOf(z14));
            }
        });
        VB vb15 = this.Y;
        kotlin.jvm.internal.g.b(vb15);
        ((am.p0) vb15).f1294i.setOnClickListener(new u4.g(this, 23));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void s0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void q0(Bundle bundle) {
    }
}
