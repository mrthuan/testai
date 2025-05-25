package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Um  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1182Um extends AbstractC04872e {
    public static byte[] A07;
    public static String[] A08 = {"YL1yLKFo15UZj59z8sTirpPX5rRsAE8", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "O6aHciR8nIcXgMvSQpLVacnv7HWgT320", "WCwGMxKVAM83NNo23MC3P4tNfApW0jy", "jLj4WTNtvai9N9Pzwov0sYarXBGRxB6J", "t8UiaIyNKCcrJZePb4XsdzT37H29Zzi", "ckjPU6sQ4thPoQS3sFeS4HnUH", ""};
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public final LinearLayout A00;
    public final RelativeLayout A01;
    public final AbstractC1456cD A02;
    public final C1314Zs A03;
    public final J7 A04;
    public final C0957Lv A05;
    public final MR A06;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 65);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A05() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A03);
        OU ou = new OU(this.A03);
        new AsyncTaskC1183Un(ou, this.A03).A05(A0D, A0D).A07(this.A02.A1S().A01());
        ou.setFullCircleCorners(true);
        M3.A0M(ou, 0);
        M3.A0K(ou);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0D, A0D);
        layoutParams.setMargins(A0C, A0C, A0C, A0C);
        layoutParams.addRule(14);
        relativeLayout.addView(ou, layoutParams);
        TextView textView = new TextView(this.A03);
        M3.A0K(textView);
        textView.setTextColor(this.A02.A1O().A01().A06(true));
        textView.setText(this.A02.A1P().A0F().A08());
        textView.setGravity(17);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(3, ou.getId());
        relativeLayout.addView(textView, layoutParams2);
        LinearLayout linearLayout = new LinearLayout(this.A03);
        M3.A0K(linearLayout);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A0C, 0, A0C, A0C);
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, textView.getId());
        relativeLayout.addView(linearLayout, layoutParams3);
        OW ow = new OW(this.A03, A0B, 5, A0A, -1);
        ow.setGravity(16);
        linearLayout.addView(ow, new LinearLayout.LayoutParams(-2, -1));
        TextView textView2 = new TextView(this.A03);
        textView2.setTextColor(this.A02.A1O().A01().A06(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        M3.A0Y(textView2, false, 14);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams4.leftMargin = A09;
        linearLayout.addView(textView2, layoutParams4);
        if (TextUtils.isEmpty(this.A02.A1P().A0F().A05())) {
            String[] strArr = A08;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[4] = "pDxc6WlcrgExZnzDlKhHZoNjTSnAqRc0";
            strArr2[2] = "JfppCwNpdT1PFGKwLRSAK2lJbowaAIWW";
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            ow.setRating(Float.parseFloat(this.A02.A1P().A0F().A05()));
            if (this.A02.A1P().A0F().A04() != null) {
                textView2.setText(A03(0, 1, 116) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A02.A1P().A0F().A04())) + A03(1, 1, 1));
            }
        }
        TextView textView3 = new TextView(this.A03);
        textView3.setTextColor(this.A02.A1O().A01().A06(true));
        textView3.setText(this.A02.A1P().A0F().A02());
        textView3.setGravity(17);
        textView3.setPadding(A0C, A0C, A0C, A0C);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, linearLayout.getId());
        relativeLayout.addView(textView3, layoutParams5);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 4;
        layoutParams6.weight = 0.8f;
        this.A00.addView(relativeLayout, layoutParams6);
    }

    public static void A06() {
        A07 = new byte[]{29, 105};
    }

    static {
        A06();
        A0C = (int) (AbstractC04872e.A08 * 12.0f);
        A0D = (int) (AbstractC04872e.A08 * 84.0f);
        A0B = (int) (AbstractC04872e.A08 * 14.0f);
        A09 = (int) (AbstractC04872e.A08 * 8.0f);
        A0A = AbstractC04982p.A01(-1, 77);
    }

    public C1182Um(C1314Zs c1314Zs, AbstractC1456cD abstractC1456cD, J7 j72, MR mr) {
        super(c1314Zs);
        this.A05 = new C0957Lv();
        this.A03 = c1314Zs;
        this.A02 = abstractC1456cD;
        this.A04 = j72;
        this.A06 = mr;
        this.A05.A05();
        setRadius(20.0f);
        setMaxCardElevation(75.0f);
        this.A01 = new RelativeLayout(c1314Zs);
        AbstractC1015Ob.A00(c1314Zs, this.A01, abstractC1456cD.A1P().A0E().A07());
        this.A00 = new LinearLayout(this.A03);
        this.A00.setOrientation(1);
        A05();
        A04();
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A04() {
        View$OnClickListenerC1178Ui view$OnClickListenerC1178Ui = new View$OnClickListenerC1178Ui(this.A03, EnumC1087Qv.A04.A03(), this.A02.A1O().A01(), this.A02.A1P().A0G().A06(), this.A04, this.A06, null, this.A05, this.A02.A1Q());
        view$OnClickListenerC1178Ui.setViewShowsOverMedia(true);
        M3.A0G(1001, view$OnClickListenerC1178Ui);
        view$OnClickListenerC1178Ui.setCta(this.A02.A1P().A0G(), this.A02.A1U(), new HashMap(), null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        view$OnClickListenerC1178Ui.setPadding(A0C, A0C, A0C, A0C);
        layoutParams.setMargins(A0C, A0C, A0C, A0C * 2);
        this.A00.addView(view$OnClickListenerC1178Ui, layoutParams);
    }
}
