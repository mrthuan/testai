package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.customview.PAGButton;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.hm;
import com.bytedance.sdk.openadsdk.utils.zn;

/* compiled from: CustomCommonDialog.java */
/* loaded from: classes.dex */
public class Qhi extends Dialog {
    private int ABk;
    private PAGTextView CJ;
    private String Gm;
    public InterfaceC0133Qhi Qhi;
    private View ROR;
    private final Context Sf;
    private PAGButton Tgh;
    private String WAv;

    /* renamed from: ac  reason: collision with root package name */
    private PAGTextView f9261ac;
    private PAGImageView cJ;

    /* renamed from: fl  reason: collision with root package name */
    private PAGButton f9262fl;

    /* renamed from: hm  reason: collision with root package name */
    private String f9263hm;
    private boolean iMK;

    /* renamed from: zc  reason: collision with root package name */
    private String f9264zc;

    /* compiled from: CustomCommonDialog.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0133Qhi {
        void Qhi();

        void cJ();
    }

    public Qhi(Context context) {
        super(context, MQ.Tgh(context, "tt_custom_dialog"));
        this.ABk = -1;
        this.iMK = false;
        this.Sf = context;
    }

    private void Qhi() {
        this.Tgh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.Qhi.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0133Qhi interfaceC0133Qhi = Qhi.this.Qhi;
                if (interfaceC0133Qhi != null) {
                    interfaceC0133Qhi.Qhi();
                }
            }
        });
        this.f9262fl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.Qhi.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0133Qhi interfaceC0133Qhi = Qhi.this.Qhi;
                if (interfaceC0133Qhi != null) {
                    interfaceC0133Qhi.cJ();
                }
            }
        });
    }

    private void cJ() {
        if (!TextUtils.isEmpty(this.WAv)) {
            this.f9261ac.setText(this.WAv);
            this.f9261ac.setVisibility(0);
        } else {
            this.f9261ac.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f9263hm)) {
            this.CJ.setText(this.f9263hm);
        }
        if (!TextUtils.isEmpty(this.Gm)) {
            this.Tgh.setText(this.Gm);
        } else {
            this.Tgh.setText(MQ.Qhi(HzH.Qhi(), "tt_postive_txt"));
        }
        if (!TextUtils.isEmpty(this.f9264zc)) {
            this.f9262fl.setText(this.f9264zc);
        } else {
            this.f9262fl.setText(MQ.Qhi(HzH.Qhi(), "tt_negtive_txt"));
        }
        int i10 = this.ABk;
        if (i10 != -1) {
            this.cJ.setImageResource(i10);
            this.cJ.setVisibility(0);
        } else {
            this.cJ.setVisibility(8);
        }
        if (this.iMK) {
            this.ROR.setVisibility(8);
            this.f9262fl.setVisibility(8);
            return;
        }
        this.f9262fl.setVisibility(0);
        this.ROR.setVisibility(0);
    }

    public Qhi ac(String str) {
        this.f9264zc = str;
        return this;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Qhi(this.Sf));
        setCanceledOnTouchOutside(false);
        cJ();
        Qhi();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        cJ();
    }

    private View Qhi(Context context) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        pAGLinearLayout.setMinimumWidth(Qhi(260.0f));
        pAGLinearLayout.setPadding(0, Qhi(32.0f), 0, 0);
        pAGLinearLayout.setBackground(hm.Qhi(context, "tt_custom_dialog_bg"));
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams);
        this.f9261ac = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = Qhi(16.0f);
        layoutParams2.rightMargin = Qhi(16.0f);
        layoutParams2.bottomMargin = Qhi(16.0f);
        this.f9261ac.setGravity(17);
        this.f9261ac.setVisibility(0);
        this.f9261ac.setTextColor(Color.parseColor("#333333"));
        this.f9261ac.setTextSize(18.0f);
        this.f9261ac.setLayoutParams(layoutParams2);
        this.cJ = new PAGImageView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = Qhi(16.0f);
        layoutParams3.rightMargin = Qhi(16.0f);
        layoutParams3.bottomMargin = Qhi(10.0f);
        this.cJ.setMaxHeight(Qhi(150.0f));
        this.cJ.setMaxWidth(Qhi(150.0f));
        this.cJ.setVisibility(0);
        this.cJ.setLayoutParams(layoutParams3);
        this.CJ = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = Qhi(20.0f);
        layoutParams4.rightMargin = Qhi(20.0f);
        this.CJ.setGravity(17);
        this.CJ.setLineSpacing(Qhi(3.0f), 1.2f);
        this.CJ.setTextSize(18.0f);
        this.CJ.setTextColor(Color.parseColor("#000000"));
        this.CJ.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = Qhi(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout2.setLayoutParams(layoutParams6);
        PAGButton pAGButton = new PAGButton(context);
        this.f9262fl = pAGButton;
        pAGButton.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = Qhi(10.0f);
        layoutParams7.weight = 1.0f;
        this.f9262fl.setPadding(0, Qhi(16.0f), 0, Qhi(16.0f));
        this.f9262fl.setBackground(null);
        this.f9262fl.setGravity(17);
        this.f9262fl.setSingleLine(true);
        this.f9262fl.setTextColor(Color.parseColor("#999999"));
        this.f9262fl.setTextSize(16.0f);
        this.f9262fl.setLayoutParams(layoutParams7);
        this.ROR = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.ROR.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.ROR.setLayoutParams(layoutParams8);
        this.Tgh = new PAGButton(context);
        this.f9262fl.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = Qhi(10.0f);
        layoutParams9.weight = 1.0f;
        this.Tgh.setPadding(0, Qhi(16.0f), 0, Qhi(16.0f));
        this.Tgh.setBackground(null);
        this.Tgh.setGravity(17);
        this.Tgh.setSingleLine(true);
        this.Tgh.setTextColor(Color.parseColor("#38ADFF"));
        this.Tgh.setTextSize(16.0f);
        this.Tgh.setLayoutParams(layoutParams9);
        pAGRelativeLayout.addView(pAGLinearLayout);
        pAGLinearLayout.addView(this.f9261ac);
        pAGLinearLayout.addView(this.cJ);
        pAGLinearLayout.addView(this.CJ);
        pAGLinearLayout.addView(view);
        pAGLinearLayout.addView(pAGLinearLayout2);
        pAGLinearLayout2.addView(this.f9262fl);
        pAGLinearLayout2.addView(this.ROR);
        pAGLinearLayout2.addView(this.Tgh);
        return pAGRelativeLayout;
    }

    public Qhi cJ(String str) {
        this.Gm = str;
        return this;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    private int Qhi(float f10) {
        return zn.cJ(getContext(), f10);
    }

    public Qhi Qhi(InterfaceC0133Qhi interfaceC0133Qhi) {
        this.Qhi = interfaceC0133Qhi;
        return this;
    }

    public Qhi Qhi(String str) {
        this.f9263hm = str;
        return this;
    }
}
