package pdf.pdfreader.viewer.editor.free.ui.myview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.scwang.smart.refresh.classics.ClassicsAbstract;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import java.util.Objects;
import pdf.pdfreader.viewer.editor.free.R;
import yb.c;
import yb.e;

/* loaded from: classes3.dex */
public class RefreshHeader extends ClassicsAbstract<RefreshHeader> implements c {

    /* renamed from: q  reason: collision with root package name */
    public final LottieAnimationView f28110q;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28111a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f28111a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28111a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28111a[RefreshState.Refreshing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28111a[RefreshState.RefreshReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28111a[RefreshState.ReleaseToRefresh.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28111a[RefreshState.ReleaseToTwoLevel.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28111a[RefreshState.Loading.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RefreshHeader(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, bc.f
    public final void g(e eVar, RefreshState refreshState, RefreshState refreshState2) {
        ea.a.p("YWUtchZzCkgXYVBlcg==", "t4LVmTSq");
        ea.a.p("JmUBU0BhJGUg", "QFHv4P4A");
        Objects.toString(refreshState2);
        int i10 = a.f28111a[refreshState2.ordinal()];
        LottieAnimationView lottieAnimationView = this.f28110q;
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
        } else {
            lottieAnimationView.setRepeatCount(0);
            lottieAnimationView.d();
            lottieAnimationView.setVisibility(8);
        }
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.j();
    }

    @Override // com.scwang.smart.refresh.classics.ClassicsAbstract, com.scwang.smart.refresh.layout.simple.SimpleComponent, yb.a
    public final int i(e eVar, boolean z10) {
        ea.a.p("HWVXchxzX0g_YS5lcg==", "PhnGGWtn");
        ea.a.p("IG53aRdpRGgg", "6AxiOyWJ");
        return super.i(eVar, z10);
    }

    public RefreshHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.layout_home_refresh, this);
        this.f15869e = (ImageView) findViewById(R.id.srl_classics_arrow);
        TextView textView = (TextView) findViewById(R.id.srl_classics_update);
        this.f15870f = (ImageView) findViewById(R.id.srl_classics_progress);
        this.f15868d = (TextView) findViewById(R.id.refresh_tv);
        this.f28110q = (LottieAnimationView) findViewById(R.id.anim_view);
    }
}
