package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget;

import am.s2;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.play.core.assetpacks.c;
import ea.a;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: PageStyleView.kt */
/* loaded from: classes3.dex */
public final class PageStyleView extends ConstraintLayout {

    /* renamed from: q  reason: collision with root package name */
    public final s2 f25423q;

    /* renamed from: r  reason: collision with root package name */
    public final int f25424r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PageStyleView(Context context) {
        this(context, null);
        g.e(context, a.p("UG8ldBZ4dA==", "ieBxFQaI"));
    }

    public final int getPageBgColor() {
        return this.f25424r;
    }

    public final void setPageBgColor(int i10) {
        CardView cardView;
        s2 s2Var = this.f25423q;
        if (s2Var != null && (cardView = s2Var.f1457b) != null) {
            cardView.setCardBackgroundColor(i10);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        int i10;
        super.setSelected(z10);
        s2 s2Var = this.f25423q;
        if (s2Var != null) {
            s2Var.f1458d.setSelected(z10);
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            s2Var.c.setVisibility(i10);
            s2Var.f1459e.setSelected(z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageStyleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g.e(context, a.p("UG8ldBZ4dA==", "2a7lAiN5"));
        this.f25424r = -1;
        LayoutInflater.from(context).inflate(R.layout.layout_page_style_card, this);
        int i10 = R.id.page_style_card_blank;
        CardView cardView = (CardView) c.u(this, R.id.page_style_card_blank);
        if (cardView != null) {
            i10 = R.id.page_style_iv_fg;
            AppCompatImageView appCompatImageView = (AppCompatImageView) c.u(this, R.id.page_style_iv_fg);
            if (appCompatImageView != null) {
                i10 = R.id.page_style_iv_selected;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) c.u(this, R.id.page_style_iv_selected);
                if (appCompatImageView2 != null) {
                    i10 = R.id.page_style_tv_name;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) c.u(this, R.id.page_style_tv_name);
                    if (appCompatTextView != null) {
                        i10 = R.id.page_style_v_border;
                        View u7 = c.u(this, R.id.page_style_v_border);
                        if (u7 != null) {
                            this.f25423q = new s2(this, cardView, appCompatImageView, appCompatImageView2, appCompatTextView, u7);
                            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pdf.pdfreader.viewer.editor.free.a.f23893d);
                            g.d(obtainStyledAttributes, a.p("UG8ldBZ4Fi4dYkBhAG4FdD1sV2QHdDdy14D8ZR5QKGdWUz95H2U0aRd3PiBJIHYgZCASKQ==", "5Z0Im9tD"));
                            int i11 = obtainStyledAttributes.getInt(0, 0);
                            obtainStyledAttributes.recycle();
                            cardView.setCardBackgroundColor(-1);
                            appCompatImageView.setVisibility(i11 == 0 ? 4 : 0);
                            if (i11 == 0) {
                                appCompatTextView.setText(context.getString(R.string.arg_res_0x7f130086));
                                return;
                            } else if (i11 == 1) {
                                appCompatTextView.setText(context.getString(R.string.arg_res_0x7f1301ec));
                                appCompatImageView.setImageResource(R.drawable.bg_page_style_line);
                                return;
                            } else if (i11 == 2) {
                                appCompatTextView.setText(context.getString(R.string.arg_res_0x7f130189));
                                appCompatImageView.setImageResource(R.drawable.bg_page_style_grid);
                                return;
                            } else if (i11 != 3) {
                                return;
                            } else {
                                appCompatTextView.setText(context.getString(R.string.arg_res_0x7f130187));
                                appCompatImageView.setImageResource(R.drawable.bg_page_style_graph);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpAmhCSQg6IA==", "Q2gJvbLR").concat(getResources().getResourceName(i10)));
    }
}
