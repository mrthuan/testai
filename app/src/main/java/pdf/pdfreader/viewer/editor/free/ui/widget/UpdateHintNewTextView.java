package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class UpdateHintNewTextView extends LinearLayout {
    public UpdateHintNewTextView(Context context) {
        this(context, null);
    }

    public UpdateHintNewTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UpdateHintNewTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0);
        LayoutInflater.from(context).inflate(R.layout.layout_update_new_red_hint, this);
        int i11 = R.id.img2PdfNewMarkTv;
        if (((TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.img2PdfNewMarkTv)) != null) {
            i11 = R.id.newMarkAllowIv;
            if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.newMarkAllowIv)) != null) {
                setGravity(8388613);
                setOrientation(1);
                return;
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpNWhWSQY6IA==", "ixxUAvBp").concat(getResources().getResourceName(i11)));
    }
}
