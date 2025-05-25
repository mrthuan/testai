package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.zn;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTPrivacyAdReportDialog.java */
/* loaded from: classes.dex */
public class hm extends Dialog {
    private static final String[] cJ = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};
    private TextView CJ;
    private final Handler Qhi;
    private ImageView Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private String f8739ac;

    /* renamed from: fl  reason: collision with root package name */
    private Button f8740fl;

    public hm(Context context) {
        super(context, MQ.Tgh(context, "tt_privacy_dialog_theme_ad_report"));
        this.Qhi = new Handler(Looper.getMainLooper());
        this.f8739ac = "";
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Qhi(getContext()), new ViewGroup.LayoutParams(zn.ac(getContext()), (int) (zn.CJ(getContext()) * 0.9d)));
        cJ();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.Qhi.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.hm.3
                @Override // java.lang.Runnable
                public void run() {
                    hm.this.CJ.setText(hm.this.f8739ac);
                }
            }, 1000L);
        } catch (Exception e10) {
            ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", e10);
        }
    }

    private void cJ() {
        final String fl2 = js.fl();
        final String ROR = js.ROR();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        this.f8740fl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.hm.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) hm.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb2 = new StringBuilder();
                    String[] strArr = {BuildConfig.VERSION_NAME, fl2, ROR, str, str2, hm.this.f8739ac};
                    for (int i10 = 0; i10 < hm.cJ.length; i10++) {
                        sb2.append(hm.cJ[i10]);
                        sb2.append(": ");
                        sb2.append(strArr[i10]);
                        sb2.append("\n");
                    }
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb2));
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        this.Tgh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.hm.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                hm.this.CJ.setText("loading ...");
                hm.this.cancel();
            }
        });
    }

    public void Qhi(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f8739ac = com.bytedance.sdk.component.utils.Qhi.Qhi(new JSONObject(str)).toString();
        } catch (JSONException e10) {
            ABk.Qhi("TTPrivacyAdReportDialog", e10.getMessage());
        }
    }

    private View Qhi(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        pAGLinearLayout.setBackground(com.bytedance.sdk.openadsdk.utils.hm.Qhi(context, "tt_ad_report_info_bg"));
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, Qhi(44.0f)));
        PAGTextView pAGTextView = new PAGTextView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(Qhi(191.0f), Qhi(24.0f));
        layoutParams2.addRule(13);
        pAGTextView.setGravity(17);
        pAGTextView.setText("Ad Report");
        pAGTextView.setTextColor(Color.parseColor("#161823"));
        pAGTextView.setTextSize(1, 17.0f);
        pAGTextView.setLayoutParams(layoutParams2);
        this.Tgh = new PAGImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(Qhi(40.0f), Qhi(44.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = Qhi(8.0f);
        this.Tgh.setPadding(Qhi(12.0f), Qhi(14.0f), Qhi(12.0f), Qhi(14.0f));
        this.Tgh.setImageResource(MQ.CJ(context, "tt_ad_xmark"));
        this.Tgh.setLayoutParams(layoutParams3);
        View view = new View(context);
        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, Qhi(0.5f));
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        view.setLayoutParams(layoutParams4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.leftMargin = Qhi(16.0f);
        layoutParams5.rightMargin = Qhi(16.0f);
        layoutParams5.weight = 1.0f;
        layoutParams5.setMarginStart(Qhi(16.0f));
        layoutParams5.setMarginEnd(Qhi(16.0f));
        scrollView.setLayoutParams(layoutParams5);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -1);
        pAGLinearLayout2.setOrientation(1);
        pAGLinearLayout2.setLayoutParams(layoutParams6);
        String fl2 = js.fl();
        String ROR = js.ROR();
        PAGLinearLayout Qhi = Qhi(context, "SDK version", BuildConfig.VERSION_NAME);
        PAGLinearLayout Qhi2 = Qhi(context, "App", fl2);
        PAGLinearLayout Qhi3 = Qhi(context, "App version", ROR);
        PAGLinearLayout Qhi4 = Qhi(context, "OS", "Android " + Build.VERSION.RELEASE);
        PAGLinearLayout Qhi5 = Qhi(context, "Device", Build.BRAND + " " + Build.MODEL);
        PAGLinearLayout Qhi6 = Qhi(context, "Creative info", "loading ...");
        PAGLinearLayout pAGLinearLayout3 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, Qhi(76.0f));
        pAGLinearLayout3.setBackgroundColor(-1);
        pAGLinearLayout3.setLayoutParams(layoutParams7);
        this.f8740fl = new Button(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        int Qhi7 = Qhi(16.0f);
        layoutParams8.setMargins(Qhi7, Qhi7, Qhi7, Qhi7);
        this.f8740fl.setBackground(com.bytedance.sdk.openadsdk.utils.hm.Qhi(context, "tt_ad_report_info_button_bg"));
        this.f8740fl.setText("copy all");
        this.f8740fl.setTextColor(Color.parseColor("#333333"));
        this.f8740fl.setTextSize(14.0f);
        this.f8740fl.setLayoutParams(layoutParams8);
        pAGLinearLayout.addView(pAGRelativeLayout);
        pAGRelativeLayout.addView(pAGTextView);
        pAGRelativeLayout.addView(this.Tgh);
        pAGLinearLayout.addView(view);
        pAGLinearLayout.addView(scrollView);
        scrollView.addView(pAGLinearLayout2);
        pAGLinearLayout2.addView(Qhi);
        pAGLinearLayout2.addView(Qhi2);
        pAGLinearLayout2.addView(Qhi3);
        pAGLinearLayout2.addView(Qhi4);
        pAGLinearLayout2.addView(Qhi5);
        pAGLinearLayout2.addView(Qhi6);
        pAGLinearLayout.addView(pAGLinearLayout3);
        pAGLinearLayout3.addView(this.f8740fl);
        return pAGLinearLayout;
    }

    private PAGLinearLayout Qhi(Context context, String str, String str2) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, str.equals("Creative info") ? -2 : Qhi(74.0f));
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setPadding(0, Qhi(16.0f), 0, Qhi(16.0f));
        pAGLinearLayout.setLayoutParams(layoutParams);
        PAGTextView pAGTextView = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = Qhi(7.0f);
        pAGTextView.setIncludeFontPadding(false);
        pAGTextView.setText(str);
        pAGTextView.setTextColor(Color.parseColor("#333333"));
        pAGTextView.setTextSize(16.0f);
        pAGTextView.setTypeface(Typeface.defaultFromStyle(1));
        pAGTextView.setLayoutParams(layoutParams2);
        pAGLinearLayout.addView(pAGTextView);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        if (str.equals("Creative info")) {
            this.CJ = pAGTextView2;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        pAGTextView2.setIncludeFontPadding(false);
        pAGTextView2.setTextColor(Color.parseColor("#666666"));
        pAGTextView2.setText(str2);
        pAGTextView2.setTextSize(14.0f);
        pAGTextView2.setLayoutParams(layoutParams3);
        pAGLinearLayout.addView(pAGTextView2);
        return pAGLinearLayout;
    }

    private int Qhi(float f10) {
        return zn.cJ(getContext(), f10);
    }
}
