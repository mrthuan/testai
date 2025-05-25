package pdf.pdfreader.viewer.editor.free.ui.widget;

import am.a3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.a0;

/* loaded from: classes3.dex */
public class SignSizeBottomSheetView extends BaseBottomSheetView<a3> {
    public b B;

    /* loaded from: classes3.dex */
    public interface b {
        void a(int i10);

        void b(int i10);
    }

    public SignSizeBottomSheetView(Context context) {
        super(context);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView
    public final a3 D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout_sign_size_bottom_sheet, viewGroup, false);
        viewGroup.addView(inflate);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i10 = R.id.seekBarSpace;
        if (((Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.seekBarSpace)) != null) {
            i10 = R.id.sign_size_circle;
            FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.sign_size_circle);
            if (frameLayout != null) {
                i10 = R.id.sign_size_circle_view;
                View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.sign_size_circle_view);
                if (u7 != null) {
                    i10 = R.id.sign_size_cl_root;
                    ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.sign_size_cl_root);
                    if (constraintLayout != null) {
                        i10 = R.id.sign_size_seek_bar;
                        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) com.google.android.play.core.assetpacks.c.u(inflate, R.id.sign_size_seek_bar);
                        if (appCompatSeekBar != null) {
                            i10 = R.id.sign_size_tv_size;
                            TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.sign_size_tv_size);
                            if (textView != null) {
                                i10 = R.id.sign_size_tv_title;
                                TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.sign_size_tv_title);
                                if (textView2 != null) {
                                    i10 = R.id.tvSpace;
                                    if (((Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tvSpace)) != null) {
                                        return new a3(linearLayout, frameLayout, u7, constraintLayout, appCompatSeekBar, textView, textView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("fGkCcxNuEyA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "jI1qztK8").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView
    public final void F(Context context) {
        TextView textView = ((a3) this.f28172y).f721f;
        textView.setText(((a3) this.f28172y).f720e.getProgress() + "");
        J(((a3) this.f28172y).f720e.getProgress());
        if (a0.i(context)) {
            ((a3) this.f28172y).f720e.setLayoutDirection(1);
        } else {
            ((a3) this.f28172y).f720e.setLayoutDirection(0);
        }
        ((a3) this.f28172y).f720e.setOnSeekBarChangeListener(new a());
    }

    public final void J(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_22);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp_1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(((a3) this.f28172y).c.getWidth(), ((a3) this.f28172y).c.getHeight());
        int i11 = (int) ((((i10 * 1.0f) / 100.0f) * dimensionPixelSize) + dimensionPixelSize2);
        layoutParams.width = i11;
        layoutParams.height = i11;
        layoutParams.gravity = 17;
        ((a3) this.f28172y).c.setLayoutParams(layoutParams);
    }

    public void setHasSign(boolean z10) {
        T t4 = this.f28172y;
        if (t4 == 0) {
            return;
        }
        if (z10) {
            ((a3) t4).f718b.setVisibility(8);
        } else {
            ((a3) t4).f718b.setVisibility(0);
        }
    }

    public void setOnSizeChangeCallBack(b bVar) {
        this.B = bVar;
    }

    public void setSize(int i10) {
        ((a3) this.f28172y).f720e.setProgress(i10 - 1);
    }

    public SignSizeBottomSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SignSizeBottomSheetView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView
    public final void E() {
    }

    /* loaded from: classes3.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            int i11 = i10 + 1;
            SignSizeBottomSheetView signSizeBottomSheetView = SignSizeBottomSheetView.this;
            signSizeBottomSheetView.J(i11);
            TextView textView = ((a3) signSizeBottomSheetView.f28172y).f721f;
            textView.setText(i11 + "");
            b bVar = signSizeBottomSheetView.B;
            if (bVar != null) {
                bVar.b(i11);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            b bVar = SignSizeBottomSheetView.this.B;
            if (bVar != null) {
                bVar.a(seekBar.getProgress() + 1);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }
    }
}
