package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class NW extends LinearLayout {
    public static final int A03 = (int) (LP.A02 * 40.0f);
    public static final int A04 = (int) (LP.A02 * 20.0f);
    public static final int A05 = (int) (LP.A02 * 10.0f);
    public final C2W A00;
    public final C1314Zs A01;
    public final NG A02;

    public NW(C1314Zs c1314Zs, C2W c2w, NG ng2, MB mb2) {
        this(c1314Zs, c2w, ng2, null, mb2);
    }

    public NW(C1314Zs c1314Zs, C2W c2w, NG ng2, String str, MB mb2) {
        super(c1314Zs);
        this.A01 = c1314Zs;
        this.A00 = c2w;
        this.A02 = ng2;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View headerView = A01(str);
            headerView.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            M3.A0M(view, -10459280);
            addView(headerView, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View A00 = A00(mb2, this.A00.A03());
            A00.setPadding(0, A05, 0, A05);
            addView(A00, layoutParams);
        }
        C0990Nc A032 = A03();
        A032.setPadding(0, A05, 0, 0);
        addView(A032, layoutParams);
    }

    private View A00(MB mb2, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(MC.A01(mb2));
        TextView textView = new TextView(getContext());
        M3.A0Y(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(MC.A01(MB.BACK_ARROW));
        imageView.setPadding(0, A05, A05 * 2, A05);
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(A03, A03);
        imageView.setOnClickListener(new NU(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        M3.A0Y(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, A03, 0);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, titleParams);
        linearLayout.addView(textView, layoutParams);
        return linearLayout;
    }

    private C0990Nc A03() {
        C0990Nc c0990Nc = new C0990Nc(this.A01);
        for (C2W c2w : this.A00.A05()) {
            NI ni2 = new NI(this.A01);
            ni2.setData(c2w.A04(), null);
            ni2.setOnClickListener(new NV(this, ni2, c2w));
            c0990Nc.addView(ni2);
        }
        return c0990Nc;
    }
}
