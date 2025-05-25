package pdf.pdfreader.viewer.editor.free.ui.adapter;

import am.h2;
import am.m3;
import am.n3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.bean.IToolsItem;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PDF2WordSoDownLoadStateView;
import pdf.pdfreader.viewer.editor.free.ui.widget.UpdateHintNewTextView;

/* compiled from: ToolsItemAdapter.kt */
/* loaded from: classes3.dex */
public final class b0 extends RecyclerView.Adapter<a<? extends i2.a>> {

    /* renamed from: d  reason: collision with root package name */
    public final Context f27121d;

    /* renamed from: e  reason: collision with root package name */
    public final b f27122e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f27123f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f27124g = new ArrayList();

    /* compiled from: ToolsItemAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class a<V extends i2.a> extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final V f27125b;

        public a(V v10) {
            super(v10.b());
            this.f27125b = v10;
        }
    }

    /* compiled from: ToolsItemAdapter.kt */
    /* loaded from: classes3.dex */
    public interface b {
        void k(boolean z10, String str, boolean z11);
    }

    public b0(Context context, b bVar) {
        this.f27121d = context;
        this.f27122e = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f27124g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        IToolsItem.ToolsItemType a10;
        IToolsItem iToolsItem = (IToolsItem) kotlin.collections.m.t0(i10, this.f27124g);
        if (iToolsItem != null && (a10 = iToolsItem.a()) != null) {
            return a10.ordinal();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(r5) == true) goto L22;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBindViewHolder(pdf.pdfreader.viewer.editor.free.ui.adapter.b0.a<? extends i2.a> r20, final int r21) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.adapter.b0.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a<? extends i2.a> onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        if (i10 == IToolsItem.ToolsItemType.header.ordinal()) {
            View i11 = androidx.activity.f.i(parent, R.layout.list_item_tools_header, parent, false);
            if (i11 != null) {
                n3 n3Var = new n3((TextView) i11);
                ea.a.p("UG4BbBF0EChCIEYgFCB3IBggciBpIBYgloDXIHFmI2xKZW0gUCBVIGggRiAUIHcgGCByKQ==", "Vt9gpusn");
                return new a<>(n3Var);
            }
            throw new NullPointerException(ea.a.p("QW8kdCVpB3c=", "oq2wqoaq"));
        } else if (i10 == IToolsItem.ToolsItemType.AI.ordinal()) {
            View i12 = androidx.activity.f.i(parent, R.layout.layout_ai_tools, parent, false);
            ConstraintLayout constraintLayout = (ConstraintLayout) i12;
            int i13 = R.id.con_bg;
            if (((ConstraintLayout) com.google.android.play.core.assetpacks.c.u(i12, R.id.con_bg)) != null) {
                i13 = R.id.iv_ai_bg;
                AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(i12, R.id.iv_ai_bg);
                if (appCompatImageView != null) {
                    i13 = R.id.new_tips_ai;
                    UpdateHintNewTextView updateHintNewTextView = (UpdateHintNewTextView) com.google.android.play.core.assetpacks.c.u(i12, R.id.new_tips_ai);
                    if (updateHintNewTextView != null) {
                        i13 = R.id.tv_ai_des;
                        if (((TextView) com.google.android.play.core.assetpacks.c.u(i12, R.id.tv_ai_des)) != null) {
                            i13 = R.id.tv_ai_title;
                            TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(i12, R.id.tv_ai_title);
                            if (textView != null) {
                                i13 = R.id.tv_ai_try;
                                if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(i12, R.id.tv_ai_try)) != null) {
                                    h2 h2Var = new h2(constraintLayout, constraintLayout, appCompatImageView, updateHintNewTextView, textView);
                                    ea.a.p("Jm5XbBh0UihQIGogVSBIIBUgTiBlIEUgi4DoIElmEmw8ZTsgWSAXIHogaiBVIEggFSBOKQ==", "dBXeiNis");
                                    return new a<>(h2Var);
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpImh4SQM6IA==", "CDJIVXGT").concat(i12.getResources().getResourceName(i13)));
        } else {
            View i14 = androidx.activity.f.i(parent, R.layout.list_item_tools, parent, false);
            int i15 = R.id.iv_mark_ad;
            ImageView imageView = (ImageView) com.google.android.play.core.assetpacks.c.u(i14, R.id.iv_mark_ad);
            if (imageView != null) {
                i15 = R.id.iv_mark_arrow;
                ImageView imageView2 = (ImageView) com.google.android.play.core.assetpacks.c.u(i14, R.id.iv_mark_arrow);
                if (imageView2 != null) {
                    i15 = R.id.iv_tools_item_icon;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(i14, R.id.iv_tools_item_icon);
                    if (appCompatImageView2 != null) {
                        i15 = R.id.iv_tools_item_lottie;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(i14, R.id.iv_tools_item_lottie);
                        if (lottieAnimationView != null) {
                            i15 = R.id.pdf_tools_download_state;
                            PDF2WordSoDownLoadStateView pDF2WordSoDownLoadStateView = (PDF2WordSoDownLoadStateView) com.google.android.play.core.assetpacks.c.u(i14, R.id.pdf_tools_download_state);
                            if (pDF2WordSoDownLoadStateView != null) {
                                i15 = R.id.tv_mark_new;
                                TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(i14, R.id.tv_mark_new);
                                if (textView2 != null) {
                                    i15 = R.id.tv_tools_item_name;
                                    TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(i14, R.id.tv_tools_item_name);
                                    if (textView3 != null) {
                                        i15 = R.id.v_mark_view;
                                        View u7 = com.google.android.play.core.assetpacks.c.u(i14, R.id.v_mark_view);
                                        if (u7 != null) {
                                            m3 m3Var = new m3((ConstraintLayout) i14, imageView, imageView2, appCompatImageView2, lottieAnimationView, pDF2WordSoDownLoadStateView, textView2, textView3, u7);
                                            ea.a.p("Wm4tbBJ0Byg-YU1vHHQfbiJsU3Qjcm1m04CQLjtvN3RWeD8pXyASYQBlWnRFIDBhKHNXKQ==", "16XYnP9a");
                                            return new a<>(m3Var);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException(ea.a.p("J2k7cyFuICA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "IIjHHGN3").concat(i14.getResources().getResourceName(i15)));
        }
    }
}
