package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ViewSettingDialog.java */
/* loaded from: classes3.dex */
public final class o3 extends oo.g implements View.OnClickListener {
    public static int D;
    public ImageView A;
    public ImageView B;
    public a C;

    /* renamed from: y  reason: collision with root package name */
    public ImageView f27720y;

    /* renamed from: z  reason: collision with root package name */
    public ImageView f27721z;

    /* compiled from: ViewSettingDialog.java */
    /* loaded from: classes3.dex */
    public interface a {
    }

    static {
        ea.a.p("GWlUdyplQ3Qzbi1EHGEEb2c=", "TXeIInXp");
        D = 0;
    }

    public o3(ReaderPreviewActivity readerPreviewActivity) {
        super(readerPreviewActivity);
    }

    @Override // oo.g
    public final boolean A() {
        return true;
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    public final void H() {
        ImageView imageView = this.f27720y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.f27721z;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = this.A;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = this.B;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
        dismiss();
        a aVar = this.C;
        if (aVar != null) {
            ((ao.v1) aVar).a(D);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (view.getId()) {
            case R.id.horizontal_continuous_layout /* 2131362735 */:
                ImageView imageView = this.A;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                D = 2;
                H();
                return;
            case R.id.horizontal_discontinuous_layout /* 2131362736 */:
                ImageView imageView2 = this.B;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                D = 3;
                H();
                return;
            case R.id.tv_cancel /* 2131364339 */:
                dismiss();
                a aVar = this.C;
                if (aVar != null) {
                    aVar.getClass();
                    return;
                }
                return;
            case R.id.tv_ok /* 2131364424 */:
                dismiss();
                a aVar2 = this.C;
                if (aVar2 != null) {
                    ((ao.v1) aVar2).a(D);
                    return;
                }
                return;
            case R.id.vertical_continuous_layout /* 2131364581 */:
                ImageView imageView3 = this.f27720y;
                if (imageView3 != null) {
                    imageView3.setVisibility(0);
                }
                D = 0;
                H();
                return;
            case R.id.vertical_discontinuous_layout /* 2131364582 */:
                ImageView imageView4 = this.f27721z;
                if (imageView4 != null) {
                    imageView4.setVisibility(0);
                }
                D = 1;
                H();
                return;
            default:
                return;
        }
    }

    @Override // oo.g
    public final int w() {
        return R.layout.layout_preview_setting_dialog;
    }

    @Override // oo.g
    public final void z() {
        View x4 = x();
        ((TextView) x4.findViewById(R.id.tv_cancel)).setOnClickListener(this);
        ((TextView) x4.findViewById(R.id.tv_ok)).setOnClickListener(this);
        ((LinearLayout) x4.findViewById(R.id.vertical_continuous_layout)).setOnClickListener(this);
        ((LinearLayout) x4.findViewById(R.id.vertical_discontinuous_layout)).setOnClickListener(this);
        ((LinearLayout) x4.findViewById(R.id.horizontal_continuous_layout)).setOnClickListener(this);
        ((LinearLayout) x4.findViewById(R.id.horizontal_discontinuous_layout)).setOnClickListener(this);
        this.f27720y = (ImageView) x4.findViewById(R.id.select_vertical_continuous);
        this.f27721z = (ImageView) x4.findViewById(R.id.select_vertical_discontinuous);
        this.A = (ImageView) x4.findViewById(R.id.select_horizontal_continuous);
        this.B = (ImageView) x4.findViewById(R.id.select_horizontal_discontinuous);
        int l10 = pdf.pdfreader.viewer.editor.free.utils.q0.l(x4.getContext(), 0, ea.a.p("OWlUdyZtWGRl", "BILBxplr"));
        D = l10;
        if (l10 != 0) {
            if (l10 != 1) {
                if (l10 != 2) {
                    if (l10 == 3) {
                        this.B.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.A.setVisibility(0);
                return;
            }
            this.f27721z.setVisibility(0);
            return;
        }
        this.f27720y.setVisibility(0);
    }
}
