package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.hm;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: NativeVideoDetailLayout.java */
/* loaded from: classes.dex */
public class fl extends Tgh {
    private float DaO;
    private TextView Dq;
    private ColorStateList EGK;
    private TextView FQ;
    private final com.bytedance.sdk.openadsdk.core.widget.fl Gy;
    private int HLI;
    private final Rect HUk;
    private ImageView Hf;
    private ImageView MND;
    private final CQU NBs;
    private ColorStateList Oy;
    private TextView PAe;
    private final int PER;
    private View Qe;
    private final Rect ReL;
    private int Ri;
    private float SL;
    private ColorStateList SO;
    private final Rect TKG;
    private final int Ura;
    private final Rect VnT;
    private float XH;
    private SeekBar YB;
    private TextView cjC;
    private boolean dI;
    private TextView dIT;
    private boolean dVA;
    private ImageView es;
    private final View.OnTouchListener et;
    private float gga;

    /* renamed from: ip  reason: collision with root package name */
    private TextView f9246ip;
    private View jPH;
    private float mZ;
    private int oU;
    private int ots;
    private int pv;
    private final Rect rB;
    private ImageView xyz;
    private View yN;
    private int zjb;

    /* renamed from: zn  reason: collision with root package name */
    private TextView f9247zn;

    public fl(Context context, ViewGroup viewGroup, boolean z10, int i10, tP tPVar, com.bykv.vk.openvk.component.video.api.CJ.fl flVar, boolean z11) {
        super(context, viewGroup, z10, i10, tPVar, flVar, z11);
        this.NBs = new CQU(this);
        this.dI = false;
        this.dVA = false;
        this.zjb = 0;
        this.ots = 0;
        this.HLI = 0;
        this.oU = 0;
        this.pv = 0;
        this.ReL = new Rect();
        this.VnT = new Rect();
        this.Ri = 0;
        this.et = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.fl.7
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        view.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                } else {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                return false;
            }
        };
        this.rB = new Rect();
        this.HUk = new Rect();
        this.TKG = new Rect();
        this.pM = HzH.Qhi().getApplicationContext();
        CJ(z11);
        this.f9236ac = viewGroup;
        this.qMt = z10;
        com.bytedance.sdk.openadsdk.core.widget.fl flVar2 = new com.bytedance.sdk.openadsdk.core.widget.fl(this);
        this.Gy = flVar2;
        flVar2.Qhi(this.qMt);
        DisplayMetrics displayMetrics = this.pM.getResources().getDisplayMetrics();
        this.Ura = displayMetrics.widthPixels;
        this.PER = displayMetrics.heightPixels;
        this.Dww = i10;
        this.lB = flVar;
        this.CQU = tPVar;
        CJ(8);
        Qhi(context, this.f9236ac);
        CJ();
        zc();
    }

    private void CQU() {
        DisplayMetrics displayMetrics = this.pM.getResources().getDisplayMetrics();
        TextView textView = this.Dq;
        if (textView != null) {
            this.SL = textView.getTextSize();
            this.Dq.setTextSize(2, 14.0f);
            ColorStateList textColors = this.Dq.getTextColors();
            this.Oy = textColors;
            if (textColors != null) {
                this.Dq.setTextColor(-1);
            }
            this.DaO = this.Dq.getAlpha();
            this.Dq.setAlpha(0.85f);
            this.Dq.setShadowLayer(0.0f, zn.cJ(this.pM, 0.5f), zn.cJ(this.pM, 0.5f), MQ.ROR(this.pM, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams = this.Dq.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.rB.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                zn.Qhi(this.Dq, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.rB.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.rB.bottom);
            }
        }
        TextView textView2 = this.cjC;
        if (textView2 != null) {
            this.mZ = textView2.getTextSize();
            this.cjC.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.cjC.getTextColors();
            this.SO = textColors2;
            if (textColors2 != null) {
                this.cjC.setTextColor(-1);
            }
            this.XH = this.cjC.getAlpha();
            this.cjC.setAlpha(0.85f);
            this.cjC.setShadowLayer(0.0f, zn.cJ(this.pM, 0.5f), zn.cJ(this.pM, 0.5f), MQ.ROR(this.pM, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams2 = this.cjC.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.HUk.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                Rect rect = this.HUk;
                zn.Qhi(this.cjC, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), rect.top, rect.right, rect.bottom);
            }
        }
        ImageView imageView = this.Hf;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.TKG.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                ImageView imageView2 = this.Hf;
                Rect rect2 = this.TKG;
                zn.Qhi(imageView2, rect2.left, rect2.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.TKG.bottom);
            }
        }
        ImageView imageView3 = this.Hf;
        if (imageView3 != null) {
            imageView3.setImageDrawable(MQ.ac(this.pM, "tt_shrink_fullscreen"));
        }
        TextView textView3 = this.PAe;
        if (textView3 != null) {
            ColorStateList textColors3 = textView3.getTextColors();
            this.EGK = textColors3;
            if (textColors3 != null) {
                this.PAe.setTextColor(-1);
            }
            this.gga = this.PAe.getAlpha();
            this.PAe.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.PAe.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.VnT.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                Rect rect3 = this.HUk;
                zn.Qhi(this.PAe, (int) TypedValue.applyDimension(1, 1.0f, displayMetrics), rect3.top, rect3.right, rect3.bottom);
            }
        }
        View view = this.yN;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.Ri = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.yN.setLayoutParams(layoutParams5);
            this.yN.setBackgroundResource(MQ.CJ(this.pM, "tt_shadow_fullscreen_top"));
        }
        cJ(false, true);
    }

    private void pM() {
        TextView textView = this.Dq;
        if (textView != null) {
            textView.setTextSize(0, this.SL);
            ColorStateList colorStateList = this.Oy;
            if (colorStateList != null) {
                this.Dq.setTextColor(colorStateList);
            }
            this.Dq.setAlpha(this.DaO);
            this.Dq.setShadowLayer(zn.cJ(this.pM, 1.0f), 0.0f, 0.0f, MQ.ROR(this.pM, "tt_72000000"));
            TextView textView2 = this.Dq;
            Rect rect = this.rB;
            zn.Qhi(textView2, rect.left, rect.top, rect.right, rect.bottom);
        }
        TextView textView3 = this.cjC;
        if (textView3 != null) {
            textView3.setTextSize(0, this.mZ);
            ColorStateList colorStateList2 = this.SO;
            if (colorStateList2 != null) {
                this.cjC.setTextColor(colorStateList2);
            }
            this.cjC.setAlpha(this.XH);
            this.cjC.setShadowLayer(zn.cJ(this.pM, 1.0f), 0.0f, 0.0f, MQ.ROR(this.pM, "tt_72000000"));
            TextView textView4 = this.cjC;
            Rect rect2 = this.HUk;
            zn.Qhi(textView4, rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        ImageView imageView = this.Hf;
        if (imageView != null) {
            Rect rect3 = this.TKG;
            zn.Qhi(imageView, rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ImageView imageView2 = this.Hf;
        if (imageView2 != null) {
            imageView2.setImageDrawable(MQ.ac(this.pM, "tt_enlarge_video"));
        }
        TextView textView5 = this.PAe;
        if (textView5 != null) {
            ColorStateList colorStateList3 = this.EGK;
            if (colorStateList3 != null) {
                textView5.setTextColor(colorStateList3);
            }
            this.PAe.setAlpha(this.gga);
            TextView textView6 = this.PAe;
            Rect rect4 = this.HUk;
            zn.Qhi(textView6, rect4.left, rect4.top, rect4.right, rect4.bottom);
        }
        View view = this.yN;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.Ri;
            this.yN.setLayoutParams(layoutParams);
            this.yN.setBackground(hm.Qhi(this.pM, "tt_video_black_desc_gradient"));
        }
        cJ(false, true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    @SuppressLint({"ClickableViewAccessibility"})
    public void CJ() {
        int i10;
        super.CJ();
        this.Gy.Qhi(this.f9236ac);
        ImageView imageView = this.es;
        int i11 = 8;
        if (!this.qMt && (this.Dww & 1) != 1) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        zn.Qhi((View) imageView, i10);
        this.es.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.fl.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (fl.this.hpZ()) {
                    fl flVar = fl.this;
                    flVar.aP.ac(flVar, view);
                }
            }
        });
        TextView textView = this.f9247zn;
        if (!this.qMt || (this.Dww & 2) == 2) {
            i11 = 0;
        }
        zn.Qhi((View) textView, i11);
        this.f9247zn.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.fl.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (fl.this.hpZ()) {
                    fl flVar = fl.this;
                    flVar.aP.CJ(flVar, view);
                }
            }
        });
        this.xyz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.fl.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (fl.this.hpZ()) {
                    fl flVar = fl.this;
                    flVar.aP.fl(flVar, view);
                }
            }
        });
        this.MND.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.fl.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                fl.this.cJ(false, true);
                fl.this.Sf();
                fl.this.ROR();
                fl.this.hpZ();
            }
        });
        this.Hf.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.fl.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (fl.this.hpZ()) {
                    fl flVar = fl.this;
                    flVar.aP.cJ(flVar, view);
                }
            }
        });
        this.YB.setThumbOffset(0);
        this.YB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.fl.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i12, boolean z10) {
                if (fl.this.hpZ()) {
                    fl flVar = fl.this;
                    flVar.aP.Qhi(flVar, i12, z10);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!fl.this.dI && fl.this.pM != null) {
                    seekBar.setThumb(hm.Qhi(HzH.Qhi(), "tt_seek_thumb_press"));
                }
                if (fl.this.hpZ()) {
                    seekBar.setThumbOffset(0);
                    fl flVar = fl.this;
                    flVar.aP.cJ(flVar, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!fl.this.dI && fl.this.pM != null) {
                    seekBar.setThumb(hm.Qhi(HzH.Qhi(), "tt_seek_thumb_normal"));
                }
                if (fl.this.hpZ()) {
                    seekBar.setThumbOffset(0);
                    fl flVar = fl.this;
                    flVar.aP.Qhi(flVar, seekBar.getProgress());
                }
            }
        });
        this.YB.setOnTouchListener(this.et);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh, com.bytedance.sdk.openadsdk.core.widget.Tgh.cJ
    public void Gm() {
        Qhi(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh, com.bykv.vk.openvk.component.video.api.CJ.ac
    @SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ void Qhi(tP tPVar, WeakReference weakReference, boolean z10) {
        Qhi(tPVar, (WeakReference<Context>) weakReference, z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    public void ROR() {
        tP tPVar;
        zn.Tgh(this.Tgh);
        zn.Tgh(this.ROR);
        zn.fl(this.jPH);
        if (this.Sf != null && (tPVar = this.CQU) != null && tPVar.FQ() != null && this.CQU.FQ().WAv() != null) {
            zn.Tgh(this.Sf);
            com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(this.CQU.FQ().WAv(), this.CQU.FQ().ac(), this.CQU.FQ().cJ(), this.Sf, this.CQU);
        }
        if (this.f9237fl.getVisibility() == 0) {
            zn.Qhi((View) this.f9237fl, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    public void Sf() {
        zn.fl(this.Tgh);
        zn.fl(this.jPH);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    public void Tgh() {
        this.NBs.removeMessages(1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh, com.bytedance.sdk.openadsdk.core.widget.Tgh.cJ
    public boolean WAv() {
        return this.dI;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    public void ac(boolean z10) {
        int i10;
        TextView textView = this.FQ;
        if (textView != null) {
            if (!this.qMt && z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            zn.Qhi((View) textView, i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    public void cJ(boolean z10) {
        int i10 = WAv() ? this.PER : this.HzH;
        int i11 = WAv() ? this.Ura : this.kYc;
        if (this.MQ <= 0 || this.tP <= 0 || i10 <= 0) {
            return;
        }
        if (!qMt() && !WAv() && (this.Dww & 8) != 8) {
            i11 = zn.cJ(this.pM, 228.0f);
        }
        int i12 = this.tP;
        int i13 = this.MQ;
        int i14 = (int) (i13 * ((i10 * 1.0f) / i12));
        if (i14 > i11) {
            i10 = (int) (i12 * ((i11 * 1.0f) / i13));
        } else {
            i11 = i14;
        }
        if (!z10 && !WAv()) {
            i10 = this.HzH;
            i11 = this.kYc;
        }
        this.CJ.Qhi(i10, i11);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    public void fl() {
        this.NBs.removeMessages(1);
        this.NBs.sendMessageDelayed(this.NBs.obtainMessage(1), 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    public void hm() {
        this.YB.setProgress(0);
        this.YB.setSecondaryProgress(0);
        this.cjC.setText(MQ.cJ(this.pM, "tt_00_00"));
        this.Dq.setText(MQ.cJ(this.pM, "tt_00_00"));
        CJ(8);
        if (Dww()) {
            this.CJ.setVisibility(8);
        }
        ImageView imageView = this.Sf;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        CJ(8);
        zn.Qhi(this.Qe, 8);
        zn.Qhi(this.WAv, 8);
        zn.Qhi((View) this.Gm, 8);
        zn.Qhi(this.f9239zc, 8);
        zn.Qhi((View) this.ABk, 8);
        zn.Qhi((View) this.iMK, 8);
        zn.Qhi((View) this.pA, 8);
        com.bytedance.sdk.openadsdk.core.widget.Tgh tgh = this.Eh;
        if (tgh != null) {
            tgh.Qhi(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    public void Qhi(Context context, View view) {
        super.Qhi(context, view);
        this.f9247zn = (TextView) view.findViewById(iMK.ejU);
        this.es = (ImageView) view.findViewById(iMK.Ohm);
        this.yN = view.findViewById(iMK.yy);
        this.xyz = (ImageView) view.findViewById(iMK.mz);
        this.FQ = (TextView) view.findViewById(iMK.Ki);
        this.PAe = (TextView) view.findViewById(iMK.Ls);
        this.f9246ip = (TextView) view.findViewById(iMK.sqa);
        this.jPH = view.findViewById(iMK.f9382ne);
        this.MND = (ImageView) view.findViewById(iMK.zTC);
        TextView textView = (TextView) view.findViewById(iMK.LcF);
        this.dIT = textView;
        textView.setText(MQ.Qhi(context, "tt_video_retry_des_txt"));
        this.YB = (SeekBar) view.findViewById(iMK.rP);
        this.cjC = (TextView) view.findViewById(iMK.LpL);
        this.Dq = (TextView) view.findViewById(iMK.sRC);
        this.Qe = view.findViewById(iMK.eN);
        this.Hf = (ImageView) view.findViewById(iMK.iWr);
        this.f9238hm = view.findViewById(iMK.VV);
    }

    private void fl(boolean z10) {
        if (z10) {
            CQU();
        } else {
            pM();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    public void cJ(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        ABk.Qhi("FullScreen", "Detail exitFullScreen.....");
        if (viewGroup == null || (viewGroup2 = this.f9236ac) == null || !(viewGroup2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.dI = false;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9236ac.getLayoutParams();
        marginLayoutParams.width = this.HLI;
        marginLayoutParams.height = this.oU;
        marginLayoutParams.leftMargin = this.ots;
        marginLayoutParams.topMargin = this.zjb;
        this.f9236ac.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, this.pv);
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Rect rect = this.ReL;
            zn.Qhi(viewGroup, rect.left, rect.top, rect.right, rect.bottom);
        }
        cJ(true);
        this.Hf.setImageDrawable(MQ.ac(this.pM, "tt_enlarge_video"));
        this.YB.setThumb(hm.Qhi(this.pM, "tt_seek_thumb_normal"));
        this.YB.setThumbOffset(0);
        com.bykv.vk.openvk.component.video.Qhi.fl.Qhi.Qhi((View) this.f9236ac, true);
        fl(this.dI);
        zn.Qhi(this.yN, 8);
        if ((this.Dww & 2) == 2) {
            zn.Qhi((View) this.f9247zn, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    public void Qhi(String str) {
        TextView textView = this.FQ;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.PAe;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    public void Qhi(int i10) {
        View view = this.Qe;
        if (view == null || view.getVisibility() != 0) {
            this.YB.setProgress(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    public void Qhi(long j10, long j11) {
        this.cjC.setText(com.bykv.vk.openvk.component.video.Qhi.fl.Qhi.Qhi(j11));
        this.Dq.setText(com.bykv.vk.openvk.component.video.Qhi.fl.Qhi.Qhi(j10));
        this.YB.setProgress(com.bykv.vk.openvk.component.video.Qhi.fl.Qhi.Qhi(j10, j11));
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh, com.bykv.vk.openvk.component.video.api.CJ.ac
    public void Qhi() {
        Qhi(false, this.qMt);
        tP();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    public void Qhi(long j10) {
        this.Dq.setText(com.bykv.vk.openvk.component.video.Qhi.fl.Qhi.Qhi(j10));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    @SuppressLint({"ClickableViewAccessibility"})
    public void Qhi(tP tPVar, WeakReference<Context> weakReference, boolean z10) {
        String zjb;
        String Qhi;
        tP tPVar2;
        if (tPVar == null) {
            return;
        }
        Qhi(this.f9236ac, HzH.Qhi());
        Qhi(false, this.qMt);
        zn.Qhi(this.WAv, 0);
        zn.Qhi((View) this.Gm, 0);
        zn.Qhi(this.f9239zc, 0);
        if (this.Gm != null && (tPVar2 = this.CQU) != null && tPVar2.FQ() != null && this.CQU.FQ().WAv() != null) {
            com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(this.CQU.FQ().WAv(), this.CQU.FQ().ac(), this.CQU.FQ().cJ(), this.Gm, this.CQU);
        }
        if (!TextUtils.isEmpty(tPVar.PAe())) {
            zjb = tPVar.PAe();
        } else if (!TextUtils.isEmpty(tPVar.dVA())) {
            zjb = tPVar.dVA();
        } else {
            zjb = !TextUtils.isEmpty(tPVar.zjb()) ? tPVar.zjb() : "";
        }
        tP tPVar3 = this.CQU;
        if (tPVar3 != null && tPVar3.dIT() != null && this.CQU.dIT().Qhi() != null) {
            zn.Qhi((View) this.ABk, 0);
            zn.Qhi((View) this.iMK, 4);
            if (this.ABk != null) {
                com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(this.CQU.dIT(), this.ABk, tPVar);
                this.ABk.setOnClickListener(this.lG);
                this.ABk.setOnTouchListener(this.lG);
            }
        } else if (!TextUtils.isEmpty(zjb)) {
            zn.Qhi((View) this.ABk, 4);
            zn.Qhi((View) this.iMK, 0);
            TextView textView = this.iMK;
            if (textView != null) {
                textView.setText(zjb.substring(0, 1));
                this.iMK.setOnClickListener(this.lG);
                this.iMK.setOnTouchListener(this.lG);
            }
        }
        if (this.pA != null && !TextUtils.isEmpty(zjb)) {
            this.pA.setText(zjb);
        }
        zn.Qhi((View) this.pA, 0);
        zn.Qhi((View) this.hpZ, 0);
        int ip2 = tPVar.ip();
        if (ip2 == 4) {
            Qhi = MQ.Qhi(this.pM, "tt_video_download_apk");
        } else if (ip2 != 5) {
            Qhi = MQ.Qhi(this.pM, "tt_video_mobile_go_detail");
        } else {
            Qhi = MQ.Qhi(this.pM, "tt_video_dial_phone");
        }
        TextView textView2 = this.hpZ;
        if (textView2 != null) {
            textView2.setText(Qhi);
            this.hpZ.setOnClickListener(this.lG);
            this.hpZ.setOnTouchListener(this.lG);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    public boolean cJ(int i10) {
        SeekBar seekBar = this.YB;
        return seekBar != null && i10 > seekBar.getSecondaryProgress();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    public void Qhi(ViewGroup viewGroup) {
        if (viewGroup != null && (this.f9236ac.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.dI = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9236ac.getLayoutParams();
            this.ots = marginLayoutParams.leftMargin;
            this.zjb = marginLayoutParams.topMargin;
            this.HLI = marginLayoutParams.width;
            this.oU = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.f9236ac.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.pv = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.ReL.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                zn.Qhi(viewGroup, 0, 0, 0, 0);
            }
            cJ(true);
            this.Hf.setImageDrawable(MQ.ac(this.pM, "tt_shrink_video"));
            this.YB.setThumb(hm.Qhi(this.pM, "tt_seek_thumb_fullscreen_selector"));
            this.YB.setThumbOffset(0);
            com.bykv.vk.openvk.component.video.Qhi.fl.Qhi.Qhi((View) this.f9236ac, false);
            fl(this.dI);
            zn.Qhi(this.yN, 8);
            if (!this.qMt) {
                zn.Qhi((View) this.es, 8);
                zn.Qhi((View) this.f9247zn, 8);
            } else if ((this.Dww & 1) == 1) {
                zn.Qhi((View) this.es, 8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh, com.bytedance.sdk.component.utils.CQU.Qhi
    public void Qhi(Message message) {
        if (message.what != 1) {
            return;
        }
        Gm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    public void Qhi(boolean z10, boolean z11, boolean z12) {
        zn.Qhi(this.Qe, 0);
        if (this.dI) {
            zn.Qhi(this.yN, 0);
            zn.Qhi((View) this.PAe, 0);
        } else if (z12) {
            zn.Qhi(this.yN, 8);
        }
        zn.Qhi((View) this.f9237fl, (!z10 || this.Tgh.getVisibility() == 0) ? 8 : 0);
        if (!this.qMt && !this.dI) {
            if ((this.Dww & 1) != 1 && !z12) {
                zn.Qhi((View) this.es, 0);
            }
            zn.Qhi((View) this.f9247zn, z12 ? 8 : 0);
        }
        zn.Qhi((View) this.cjC, 0);
        zn.Qhi((View) this.Dq, 0);
        zn.Qhi((View) this.YB, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh
    public void Qhi(boolean z10, boolean z11) {
        zn.Qhi(this.Qe, 8);
        zn.Qhi(this.yN, 8);
        zn.Qhi((View) this.f9237fl, 8);
        if (!this.qMt && !this.dI) {
            zn.Qhi((View) this.es, 8);
            if ((this.Dww & 2) != 2) {
                zn.Qhi((View) this.f9247zn, 8);
            }
        } else if ((this.Dww & 1) == 1) {
            zn.Qhi((View) this.es, 8);
        }
        if (z11) {
            zn.Qhi((View) this.es, 8);
            zn.Qhi((View) this.f9247zn, 8);
        }
        ac(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Tgh, com.bytedance.sdk.openadsdk.core.widget.fl.Qhi
    public void Qhi(View view, boolean z10) {
        if (WAv()) {
            String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            tP tPVar = this.CQU;
            if (tPVar != null && !TextUtils.isEmpty(tPVar.dVA())) {
                Qhi(this.CQU.dVA());
            }
            this.f9246ip.setText(format);
        } else {
            Qhi("");
            this.f9246ip.setText("");
        }
        if (this.NFd) {
            return;
        }
        ac(this.qMt && !this.dI);
        if (hpZ()) {
            this.aP.Qhi(this, view, true, this.Tgh.getVisibility() != 0);
        }
    }
}
