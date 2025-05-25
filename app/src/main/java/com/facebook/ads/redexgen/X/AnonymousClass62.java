package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.AudienceNetworkActivity;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.62  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass62 {
    public static byte[] A03;
    public static String[] A04 = {"7eYgc6nX0dsf322XCwrRtT4qf3VEDMEl", "N2aCi32Gol", "cuafTeer1Z9Nb4my1kZzytDheJ", "azEUnMktT72nkCVYlmExjP7IGMIAzJqn", "aTKXKGIT8RKHn5PSJkltcYzomGOefmaB", "Nd0le1Epfxq6", "TvHh8Lt9J0iHJl7ueer52F53TQqp", "ytw5TrFQH6uy2HyuHBs1okCv8Ad5jbub"};
    public O6 A00;
    public final AudienceNetworkActivity A01;
    public final C1314Zs A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{98, -125, Byte.MIN_VALUE, -109, -123, -7, -15, -16, -11, -19, 0, -11, -5, -6, -48, -19, 0, -19, -27, -31, -42, -40, -38, -30, -38, -29, -23, -66, -39, -73, -86, -74, -70, -86, -72, -71, -103, -82, -78, -86};
    }

    static {
        A01();
    }

    public AnonymousClass62(C1314Zs c1314Zs, AudienceNetworkActivity audienceNetworkActivity) {
        this.A02 = c1314Zs;
        this.A01 = audienceNetworkActivity;
    }

    private void A02(int i10, int i11) {
        if (this.A01.getWindow() != null) {
            this.A01.getWindow().setFlags(i10, i11);
        }
    }

    public final QS A03(Intent intent, RelativeLayout relativeLayout) {
        String stringExtra = intent.getStringExtra(A00(5, 13, 116));
        if (stringExtra != null) {
            C1314Zs c1314Zs = this.A02;
            String[] strArr = A04;
            if (strArr[3].charAt(3) != strArr[4].charAt(3)) {
                A04[0] = "OM7lzL5hLk1NAc94R8uXA4rWzYteyBdY";
                QS A01 = QR.A01(c1314Zs, stringExtra);
                if (A01 != null) {
                    relativeLayout.addView(A01, new RelativeLayout.LayoutParams(-1, -1));
                }
                return A01;
            }
            throw new RuntimeException();
        }
        return null;
    }

    public final void A04() {
        if (C0877Im.A28(this.A01)) {
            A02(16777216, 16777216);
        }
    }

    public final void A05() {
        if (this.A00 != null && C0877Im.A16(this.A01)) {
            this.A00.A07();
        }
    }

    public final void A06() {
        if (C0877Im.A2G(this.A01)) {
            A02(128, 128);
        }
    }

    public final void A07(Intent intent, KG kg2, final RelativeLayout relativeLayout) {
        if (C0877Im.A16(this.A01)) {
            KG kg3 = KG.A03;
            if (A04[1].length() == 14) {
                throw new RuntimeException();
            }
            A04[7] = "MXPR3PNgo3gwYNs9J3I1TINqSxswEDcD";
            if (kg2 != kg3 && Build.VERSION.SDK_INT >= 18) {
                this.A00 = new O6();
                this.A00.A0C(intent.getStringExtra(A00(18, 11, 93)));
                O6 o62 = this.A00;
                String placementId = this.A01.getPackageName();
                o62.A0B(placementId);
                String placementId2 = A00(29, 11, 45);
                long longExtra = intent.getLongExtra(placementId2, 0L);
                if (longExtra != 0) {
                    this.A00.A09(longExtra);
                }
                TextView textView = new TextView(this.A01);
                String placementId3 = A00(0, 5, 6);
                textView.setText(placementId3);
                textView.setTextColor(-1);
                M3.A0M(textView, Color.argb(160, 0, 0, 0));
                textView.setPadding(5, 5, 5, 5);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                layoutParams.addRule(11, -1);
                textView.setLayoutParams(layoutParams);
                final O6 o63 = this.A00;
                View.OnLongClickListener onLongClickListener = new View.OnLongClickListener(o63, relativeLayout) { // from class: com.facebook.ads.redexgen.X.5c
                    public static String[] A02 = {"kWMETALBgXQPxa1caUNWOxECFuDqqQMg", "ZdkMlJfyQLC9xkOOBWIiDwjfHp6c9jbv", "0ZcfP2jVUcrv9OHIQZTLnU8", "f1ui83cs7IfjD0PNLw4msBb2GPSJERBF", "Csxj5aYvqiT2vPBDwP7", "SUYUZZDjraqMGfRe", "xuktTTnzvvF5Ho58lD7oBLq", ""};
                    public final RelativeLayout A00;
                    public final O6 A01;

                    {
                        this.A01 = o63;
                        this.A00 = relativeLayout;
                    }

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        if (this.A01 != null && this.A00 != null) {
                            O6 o64 = this.A01;
                            int width = this.A00.getWidth();
                            RelativeLayout relativeLayout2 = this.A00;
                            String[] strArr = A02;
                            if (strArr[0].charAt(28) == strArr[1].charAt(28)) {
                                throw new RuntimeException();
                            }
                            A02[7] = "";
                            o64.setBounds(0, 0, width, relativeLayout2.getHeight());
                            this.A01.A0D(!this.A01.A0E());
                        }
                        return true;
                    }
                };
                textView.setOnLongClickListener(onLongClickListener);
                relativeLayout.setOnLongClickListener(onLongClickListener);
                relativeLayout.getOverlay().add(this.A00);
            }
        }
    }

    public final void A08(KG kg2, boolean z10) {
        if (C0877Im.A2j(this.A02)) {
            KG kg3 = KG.A03;
            if (A04[6].length() != 28) {
                throw new RuntimeException();
            }
            A04[7] = "F6KEK3QPfCxrYVAsBDZ1FiU7CVmTBzj2";
            if (kg2 == kg3 && z10) {
                String[] strArr = A04;
                if (strArr[2].length() != strArr[5].length()) {
                    A04[7] = "F5zIc02zmRZruFOjSfi1BFnSSwvtFdhl";
                    A02(512, 512);
                    return;
                }
                A04[6] = "OJkKw3fFO6sWC1hd1CstPV3CXDwl";
                A02(512, 512);
                return;
            }
        }
        this.A01.requestWindowFeature(1);
        A02(1024, 1024);
    }
}
