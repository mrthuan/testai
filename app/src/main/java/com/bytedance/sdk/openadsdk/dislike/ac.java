package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.settings.HzH;
import com.bytedance.sdk.openadsdk.utils.hm;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TTDislikeDialogDefault.java */
/* loaded from: classes.dex */
public class ac extends TTDislikeDialogAbstract {
    private View CJ;
    private TTDislikeListView Qhi;
    private Qhi ROR;
    private String Sf;
    private cJ Tgh;
    private List<FilterWord> WAv;

    /* renamed from: ac  reason: collision with root package name */
    private RelativeLayout f9304ac;
    private TTDislikeListView cJ;

    /* renamed from: fl  reason: collision with root package name */
    private cJ f9305fl;

    /* renamed from: hm  reason: collision with root package name */
    private String f9306hm;

    /* compiled from: TTDislikeDialogDefault.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi();

        void Qhi(int i10, FilterWord filterWord);

        void ac();

        void cJ();
    }

    /* compiled from: TTDislikeDialogDefault.java */
    /* loaded from: classes.dex */
    public static class cJ extends BaseAdapter {
        private boolean Qhi = true;

        /* renamed from: ac  reason: collision with root package name */
        private final LayoutInflater f9307ac;
        private final List<FilterWord> cJ;

        /* compiled from: TTDislikeDialogDefault.java */
        /* loaded from: classes.dex */
        public static class Qhi {
            TextView Qhi;
            ImageView cJ;

            private Qhi() {
            }
        }

        public cJ(LayoutInflater layoutInflater, List<FilterWord> list) {
            this.cJ = list;
            this.f9307ac = layoutInflater;
        }

        public void Qhi(boolean z10) {
            this.Qhi = z10;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<FilterWord> list = this.cJ;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return this.cJ.get(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2;
            Qhi qhi;
            if (view == null) {
                qhi = new Qhi();
                view2 = Qhi(this.f9307ac.getContext());
                qhi.Qhi = (TextView) view2.findViewById(iMK.ZRq);
                qhi.cJ = (ImageView) view2.findViewById(iMK.MIe);
                view2.setTag(qhi);
            } else {
                view2 = view;
                qhi = (Qhi) view.getTag();
            }
            FilterWord filterWord = this.cJ.get(i10);
            qhi.Qhi.setText(filterWord.getName());
            if (HzH.YD().YB()) {
                qhi.Qhi.setBackground(hm.Qhi(this.f9307ac.getContext(), "tt_dislike_middle_seletor"));
            } else if (i10 != this.cJ.size() - 1) {
                qhi.Qhi.setBackground(hm.Qhi(this.f9307ac.getContext(), "tt_dislike_middle_seletor"));
            } else {
                qhi.Qhi.setBackground(hm.Qhi(this.f9307ac.getContext(), "tt_dislike_bottom_seletor"));
            }
            if (this.Qhi && i10 == 0) {
                qhi.Qhi.setBackground(hm.Qhi(this.f9307ac.getContext(), "tt_dislike_top_seletor"));
            }
            if (filterWord.hasSecondOptions()) {
                qhi.cJ.setVisibility(0);
            } else {
                qhi.cJ.setVisibility(8);
            }
            return view2;
        }

        private View Qhi(Context context) {
            PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
            pAGFrameLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
            PAGTextView pAGTextView = new PAGTextView(context);
            pAGTextView.setId(iMK.ZRq);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, zn.cJ(context, 44.0f));
            layoutParams.gravity = 17;
            pAGTextView.setLayoutParams(layoutParams);
            pAGTextView.setGravity(17);
            pAGTextView.setTextColor(Color.parseColor("#FF4A4A4A"));
            pAGTextView.setTextSize(16.0f);
            PAGImageView pAGImageView = new PAGImageView(context);
            pAGImageView.setId(iMK.MIe);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(zn.cJ(context, 44.0f), zn.cJ(context, 44.0f));
            layoutParams2.gravity = 8388629;
            pAGImageView.setLayoutParams(layoutParams2);
            pAGImageView.setRotation(180.0f);
            pAGImageView.setScaleType(ImageView.ScaleType.CENTER);
            pAGImageView.setImageDrawable(hm.Qhi(context, "tt_lefterbackicon_titlebar_press_wrapper"));
            pAGFrameLayout.addView(pAGTextView);
            pAGFrameLayout.addView(pAGImageView);
            return pAGFrameLayout;
        }

        public void Qhi(List<FilterWord> list) {
            if (list == null || list.isEmpty()) {
                return;
            }
            this.cJ.clear();
            this.cJ.addAll(list);
            notifyDataSetChanged();
        }

        public void Qhi() {
            this.cJ.clear();
            notifyDataSetChanged();
        }
    }

    public ac(Context context, String str, List<FilterWord> list, String str2) {
        super(context, MQ.Tgh(context, "tt_dislikeDialog"), str2);
        this.f9306hm = str;
        this.WAv = list;
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(zn.ac(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new fl().Qhi(getContext());
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public int[] getTTDislikeListViewIds() {
        return new int[]{iMK.gSh, iMK.GN};
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            Qhi();
            Qhi(getContext());
            cJ();
            setMaterialMeta(this.f9306hm, this.WAv);
        } catch (Throwable unused) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            ac();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        RelativeLayout relativeLayout = this.f9304ac;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.CJ;
        if (view != null) {
            view.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView = this.Qhi;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(0);
        }
        cJ cJVar = this.Tgh;
        if (cJVar != null) {
            cJVar.Qhi();
        }
        TTDislikeListView tTDislikeListView2 = this.cJ;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(8);
        }
    }

    private void cJ() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.dislike.ac.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (ac.this.ROR != null) {
                    Qhi unused = ac.this.ROR;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.dislike.ac.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (ac.this.ROR != null) {
                    ac.this.ROR.cJ();
                }
            }
        });
        cJ cJVar = new cJ(getLayoutInflater(), this.WAv);
        this.f9305fl = cJVar;
        this.Qhi.setAdapter((ListAdapter) cJVar);
        cJ cJVar2 = new cJ(getLayoutInflater(), new ArrayList());
        this.Tgh = cJVar2;
        cJVar2.Qhi(false);
        this.cJ.setAdapter((ListAdapter) this.Tgh);
    }

    public void Qhi(String str, List<FilterWord> list) {
        cJ cJVar = this.f9305fl;
        if (cJVar == null || this.WAv == null || str == null) {
            return;
        }
        this.f9306hm = str;
        this.WAv = list;
        cJVar.Qhi(list);
        setMaterialMeta(str, list);
    }

    public void Qhi(Qhi qhi) {
        this.ROR = qhi;
    }

    public void Qhi(String str) {
        this.Sf = str;
    }

    private void Qhi() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.y = 50;
            window.setAttributes(attributes);
        }
    }

    private void Qhi(Context context) {
        this.f9304ac = (RelativeLayout) findViewById(iMK.Em);
        this.CJ = findViewById(iMK.wI);
        TextView textView = (TextView) findViewById(iMK.f9383qb);
        PAGTextView pAGTextView = (PAGTextView) findViewById(iMK.wv);
        textView.setText(MQ.Qhi(getContext(), "tt_dislike_header_tv_back"));
        ((TextView) findViewById(iMK.up)).setText(MQ.Qhi(getContext(), "tt_dislike_header_tv_title"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.ac.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ac.this.ac();
                if (ac.this.ROR != null) {
                    ac.this.ROR.ac();
                }
            }
        });
        if (pAGTextView != null) {
            pAGTextView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.ac.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ac.this.ROR.Qhi();
                }
            });
        }
        TTDislikeListView tTDislikeListView = (TTDislikeListView) findViewById(iMK.gSh);
        this.Qhi = tTDislikeListView;
        tTDislikeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.ac.5
            /* JADX WARN: Type inference failed for: r1v6, types: [android.widget.Adapter] */
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                try {
                    FilterWord filterWord = (FilterWord) adapterView.getAdapter().getItem(i10);
                    if (filterWord.hasSecondOptions()) {
                        ac.this.Qhi(filterWord);
                        if (ac.this.ROR != null) {
                            ac.this.ROR.Qhi(i10, filterWord);
                            return;
                        }
                        return;
                    }
                } catch (Throwable unused) {
                }
                if (ac.this.ROR != null) {
                    try {
                        ac.this.ROR.Qhi(i10, (FilterWord) ac.this.WAv.get(i10));
                    } catch (Throwable unused2) {
                    }
                }
                ac.this.dismiss();
            }
        });
        this.Qhi.setClosedListenerKey(this.Sf);
        TTDislikeListView tTDislikeListView2 = (TTDislikeListView) findViewById(iMK.GN);
        this.cJ = tTDislikeListView2;
        tTDislikeListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.ac.6
            /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.Adapter] */
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                if (ac.this.ROR != null) {
                    try {
                        ac.this.ROR.Qhi(i10, (FilterWord) adapterView.getAdapter().getItem(i10));
                    } catch (Throwable unused) {
                    }
                }
                ac.this.dismiss();
            }
        });
        this.cJ.setClosedListenerKey(this.Sf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        cJ cJVar = this.Tgh;
        if (cJVar != null) {
            cJVar.Qhi(filterWord.getOptions());
        }
        RelativeLayout relativeLayout = this.f9304ac;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        View view = this.CJ;
        if (view != null) {
            view.setVisibility(0);
        }
        TTDislikeListView tTDislikeListView = this.Qhi;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView2 = this.cJ;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(0);
        }
    }
}
