package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.dislike.Tgh;
import com.bytedance.sdk.openadsdk.dislike.ac;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class TTAdDislikeDialog extends PAGFrameLayout {
    private com.bytedance.sdk.openadsdk.dislike.Tgh ABk;
    private RelativeLayout CJ;
    private String Gm;
    private View Qhi;
    private ac.cJ ROR;
    private tP Sf;
    private ac.cJ Tgh;
    private Context WAv;

    /* renamed from: ac  reason: collision with root package name */
    private TTDislikeListView f8723ac;
    private TTDislikeListView cJ;

    /* renamed from: fl  reason: collision with root package name */
    private View f8724fl;

    /* renamed from: hm  reason: collision with root package name */
    private Qhi f8725hm;

    /* renamed from: zc  reason: collision with root package name */
    private boolean f8726zc;

    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi(int i10, FilterWord filterWord);

        void Qhi(View view);

        void cJ(View view);
    }

    public TTAdDislikeDialog(Context context, tP tPVar) {
        this(context.getApplicationContext());
        this.WAv = context;
        this.Sf = tPVar;
        CJ();
    }

    private void CJ() {
        if (this.Sf == null) {
            return;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        ac.cJ cJVar = new ac.cJ(from, this.Sf.VnT());
        this.Tgh = cJVar;
        this.cJ.setAdapter((ListAdapter) cJVar);
        ac.cJ cJVar2 = new ac.cJ(from, new ArrayList());
        this.ROR = cJVar2;
        cJVar2.Qhi(false);
        this.f8723ac.setAdapter((ListAdapter) this.ROR);
        this.cJ.setMaterialMeta(this.Sf.EGK());
        this.f8723ac.setMaterialMeta(this.Sf.EGK());
    }

    private Tgh.Qhi ROR() {
        return new Tgh.Qhi() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.6
            @Override // com.bytedance.sdk.openadsdk.dislike.Tgh.Qhi
            public void Qhi() {
                TTAdDislikeDialog.this.setVisibility(8);
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.Tgh.Qhi
            public void ac() {
                TTAdDislikeDialog.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.Tgh.Qhi
            public void cJ() {
                TTAdDislikeDialog.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.Tgh.Qhi
            public void Qhi(int i10, FilterWord filterWord) {
                if (TTAdDislikeDialog.this.f8725hm != null) {
                    TTAdDislikeDialog.this.f8725hm.Qhi(i10, filterWord);
                    TTAdDislikeDialog.this.f8725hm.cJ(TTAdDislikeDialog.this);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tgh() {
        RelativeLayout relativeLayout = this.CJ;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.f8724fl;
        if (view != null) {
            view.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView = this.cJ;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(0);
        }
        ac.cJ cJVar = this.ROR;
        if (cJVar != null) {
            cJVar.Qhi();
        }
        TTDislikeListView tTDislikeListView2 = this.f8723ac;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(8);
        }
    }

    private void fl() {
        this.CJ = (RelativeLayout) this.Qhi.findViewById(iMK.Em);
        this.f8724fl = this.Qhi.findViewById(iMK.wI);
        PAGTextView pAGTextView = (PAGTextView) this.Qhi.findViewById(iMK.wv);
        TextView textView = (TextView) this.Qhi.findViewById(iMK.f9383qb);
        textView.setText(MQ.Qhi(getContext(), "tt_dislike_header_tv_back"));
        ((TextView) this.Qhi.findViewById(iMK.up)).setText(MQ.Qhi(getContext(), "tt_dislike_header_tv_title"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTAdDislikeDialog.this.Tgh();
                if (TTAdDislikeDialog.this.f8725hm != null) {
                    Qhi unused = TTAdDislikeDialog.this.f8725hm;
                }
            }
        });
        if (pAGTextView != null) {
            pAGTextView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTAdDislikeDialog.this.ac();
                }
            });
        }
        TTDislikeListView tTDislikeListView = (TTDislikeListView) this.Qhi.findViewById(iMK.gSh);
        this.cJ = tTDislikeListView;
        tTDislikeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.4
            /* JADX WARN: Type inference failed for: r1v6, types: [android.widget.Adapter] */
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                try {
                    FilterWord filterWord = (FilterWord) adapterView.getAdapter().getItem(i10);
                    if (filterWord.hasSecondOptions()) {
                        TTAdDislikeDialog.this.Qhi(filterWord);
                        if (TTAdDislikeDialog.this.f8725hm != null) {
                            TTAdDislikeDialog.this.f8725hm.Qhi(i10, filterWord);
                            return;
                        }
                        return;
                    }
                } catch (Throwable unused) {
                }
                if (TTAdDislikeDialog.this.f8725hm != null) {
                    try {
                        TTAdDislikeDialog.this.f8725hm.Qhi(i10, TTAdDislikeDialog.this.Sf.VnT().get(i10));
                    } catch (Throwable unused2) {
                    }
                }
                TTAdDislikeDialog.this.cJ();
            }
        });
        TTDislikeListView tTDislikeListView2 = (TTDislikeListView) this.Qhi.findViewById(iMK.GN);
        this.f8723ac = tTDislikeListView2;
        tTDislikeListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.5
            /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.Adapter] */
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                if (TTAdDislikeDialog.this.f8725hm != null) {
                    try {
                        TTAdDislikeDialog.this.f8725hm.Qhi(i10, (FilterWord) adapterView.getAdapter().getItem(i10));
                    } catch (Throwable unused) {
                    }
                }
                TTAdDislikeDialog.this.cJ();
            }
        });
    }

    public void setCallback(Qhi qhi) {
        this.f8725hm = qhi;
    }

    public void setDislikeSource(String str) {
        this.Gm = str;
        this.cJ.setDislikeSource(str);
        this.f8723ac.setDislikeSource(this.Gm);
    }

    public void ac() {
        Context context = this.WAv;
        if (context instanceof Activity) {
            boolean z10 = !((Activity) context).isFinishing();
            com.bytedance.sdk.openadsdk.dislike.Tgh tgh = new com.bytedance.sdk.openadsdk.dislike.Tgh(this.WAv);
            this.ABk = tgh;
            tgh.Qhi(ROR());
            this.ABk.Qhi(this.Sf.EGK(), this.Sf.mZ().toString());
            this.ABk.Qhi(this.Gm);
            if (!z10 || this.ABk.isShowing()) {
                return;
            }
            this.ABk.show();
        }
    }

    public void cJ() {
        setVisibility(8);
        this.f8726zc = false;
        Qhi qhi = this.f8725hm;
        if (qhi != null) {
            qhi.cJ(this);
        }
    }

    private void Qhi(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTAdDislikeDialog.this.cJ();
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.Qhi = new com.bytedance.sdk.openadsdk.dislike.fl().Qhi(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = zn.cJ(getContext(), 20.0f);
        layoutParams.rightMargin = zn.cJ(getContext(), 20.0f);
        this.Qhi.setLayoutParams(layoutParams);
        this.Qhi.setClickable(true);
        fl();
        CJ();
    }

    public TTAdDislikeDialog(Context context) {
        this(context, (AttributeSet) null);
    }

    public TTAdDislikeDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeDialog(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8726zc = false;
        Qhi(context, attributeSet);
    }

    public void Qhi() {
        if (this.Qhi.getParent() == null) {
            addView(this.Qhi);
        }
        Tgh();
        setVisibility(0);
        this.f8726zc = true;
        Qhi qhi = this.f8725hm;
        if (qhi != null) {
            qhi.Qhi(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        ac.cJ cJVar = this.ROR;
        if (cJVar != null) {
            cJVar.Qhi(filterWord.getOptions());
        }
        RelativeLayout relativeLayout = this.CJ;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        View view = this.f8724fl;
        if (view != null) {
            view.setVisibility(0);
        }
        TTDislikeListView tTDislikeListView = this.cJ;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView2 = this.f8723ac;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(0);
        }
    }
}
