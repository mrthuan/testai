package pdf.pdfreader.viewer.editor.free.feature.billing.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ea.a;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.widget.scroll.ReaderNestedScrollView;
import pdf.pdfreader.viewer.editor.free.widget.text.ItalicTextView;
import tf.c;

/* compiled from: BillingIntroduceDetailView.kt */
/* loaded from: classes3.dex */
public final class BillingIntroduceDetailView extends ReaderNestedScrollView {
    public final boolean E;
    public final boolean F;
    public final c G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingIntroduceDetailView(Context context) {
        super(context);
        g.e(context, a.p("UG8ldBZ4dA==", "NSK5wHr4"));
        this.E = BillingConfigImpl.c.q();
        this.F = BillingConfigImpl.r();
        this.G = kotlin.a.a(new cg.a<LayoutInflater>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.widget.BillingIntroduceDetailView$inflater$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final LayoutInflater invoke() {
                return LayoutInflater.from(BillingIntroduceDetailView.this.getContext());
            }
        });
        x();
    }

    public final LayoutInflater getInflater() {
        Object value = this.G.getValue();
        g.d(value, a.p("D2cudF5pDGYeYUBlGz5-LmouKQ==", "M4OQuaJq"));
        return (LayoutInflater) value;
    }

    public final void x() {
        int i10;
        setBackgroundResource(R.drawable.bg_billing_detail_test_i_bg);
        getInflater().inflate(R.layout.layout_subscription_privileges_i1, this);
        int i11 = R.id.aiGroup;
        Group group = (Group) com.google.android.play.core.assetpacks.c.u(this, R.id.aiGroup);
        if (group != null) {
            i11 = R.id.basicAIImg;
            if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.basicAIImg)) != null) {
                i11 = R.id.basicTv;
                if (((TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.basicTv)) != null) {
                    i11 = R.id.ocr_basic_iv;
                    if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.ocr_basic_iv)) != null) {
                        i11 = R.id.ocrGroup;
                        Group group2 = (Group) com.google.android.play.core.assetpacks.c.u(this, R.id.ocrGroup);
                        if (group2 != null) {
                            i11 = R.id.ocr_pro_iv;
                            if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.ocr_pro_iv)) != null) {
                                i11 = R.id.privileges01Tv;
                                if (((TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.privileges01Tv)) != null) {
                                    i11 = R.id.privileges02Tv;
                                    if (((TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.privileges02Tv)) != null) {
                                        i11 = R.id.privileges03Tv;
                                        if (((TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.privileges03Tv)) != null) {
                                            i11 = R.id.privileges041Tv;
                                            if (((TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.privileges041Tv)) != null) {
                                                i11 = R.id.privileges04Tv;
                                                if (((TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.privileges04Tv)) != null) {
                                                    i11 = R.id.privileges05Tv;
                                                    if (((TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.privileges05Tv)) != null) {
                                                        i11 = R.id.privileges06Tv;
                                                        if (((TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.privileges06Tv)) != null) {
                                                            i11 = R.id.privileges07Tv;
                                                            if (((TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.privileges07Tv)) != null) {
                                                                i11 = R.id.privileges08Tv;
                                                                if (((TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.privileges08Tv)) != null) {
                                                                    i11 = R.id.privilegesAITv;
                                                                    if (((TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.privilegesAITv)) != null) {
                                                                        i11 = R.id.privilegesTitleTv;
                                                                        if (((TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.privilegesTitleTv)) != null) {
                                                                            i11 = R.id.proAIImg;
                                                                            if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.proAIImg)) != null) {
                                                                                i11 = R.id.proBgIv;
                                                                                if (com.google.android.play.core.assetpacks.c.u(this, R.id.proBgIv) != null) {
                                                                                    i11 = R.id.proIv;
                                                                                    if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.proIv)) != null) {
                                                                                        i11 = R.id.proTv;
                                                                                        if (((ItalicTextView) com.google.android.play.core.assetpacks.c.u(this, R.id.proTv)) != null) {
                                                                                            i11 = R.id.subscriptionPrivilegesCl;
                                                                                            if (((ConstraintLayout) com.google.android.play.core.assetpacks.c.u(this, R.id.subscriptionPrivilegesCl)) != null) {
                                                                                                a.p("Wm4tbBJ0BygbblJsCHQzcmggRmgvcyk=", "57CNTeKI");
                                                                                                int i12 = 0;
                                                                                                if (this.E) {
                                                                                                    i10 = 0;
                                                                                                } else {
                                                                                                    i10 = 8;
                                                                                                }
                                                                                                group.setVisibility(i10);
                                                                                                if (!this.F) {
                                                                                                    i12 = 8;
                                                                                                }
                                                                                                group2.setVisibility(i12);
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
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpGWhpSSE6IA==", "FMBZmIeE").concat(getResources().getResourceName(i11)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingIntroduceDetailView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, a.p("LG9fdBx4dA==", "rFZJc4rC"));
        g.e(attributeSet, a.p("LnRFcnM=", "6yhWJxsP"));
        this.E = BillingConfigImpl.c.q();
        this.F = BillingConfigImpl.r();
        this.G = kotlin.a.a(new cg.a<LayoutInflater>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.widget.BillingIntroduceDetailView$inflater$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final LayoutInflater invoke() {
                return LayoutInflater.from(BillingIntroduceDetailView.this.getContext());
            }
        });
        x();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingIntroduceDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g.e(context, a.p("LG9fdBx4dA==", "rQAlooFx"));
        g.e(attributeSet, a.p("F3QxcnM=", "J7vE4oj1"));
        this.E = BillingConfigImpl.c.q();
        this.F = BillingConfigImpl.r();
        this.G = kotlin.a.a(new cg.a<LayoutInflater>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.widget.BillingIntroduceDetailView$inflater$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final LayoutInflater invoke() {
                return LayoutInflater.from(BillingIntroduceDetailView.this.getContext());
            }
        });
        x();
    }
}
