package pdf.pdfreader.viewer.editor.free.ui.myview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.airbnb.lottie.LottieAnimationView;
import jl.a;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class ReaderLoadingView extends RelativeLayout {
    public ReaderLoadingView(Context context) {
        super(context);
        a(true);
    }

    public final void a(boolean z10) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_loading, (ViewGroup) null, false);
        ((LottieAnimationView) inflate.findViewById(R.id.loadingLottie)).setAnimation(R.raw.loading);
        View findViewById = inflate.findViewById(R.id.loading);
        if (z10) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
        addView(inflate, new RelativeLayout.LayoutParams(-1, -1));
    }

    public ReaderLoadingView(a aVar) {
        super(aVar);
        a(false);
    }

    public ReaderLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(true);
    }

    public ReaderLoadingView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(true);
    }
}
