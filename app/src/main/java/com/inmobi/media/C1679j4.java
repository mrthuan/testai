package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.inmobi.media.j4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1679j4 implements InterfaceC1746o3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1707l4 f15211a;

    public C1679j4(C1707l4 c1707l4) {
        this.f15211a = c1707l4;
    }

    public final void a(String expandInput, EnumC1733n3 inputType, float f10, boolean z10, long j10, L5 landingPageTelemetryMetaData) {
        String str;
        String str2;
        String creativeId;
        String impressionId;
        C1720m3 c1720m3;
        kotlin.jvm.internal.g.e(expandInput, "expandInput");
        kotlin.jvm.internal.g.e(inputType, "inputType");
        kotlin.jvm.internal.g.e(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
        C1707l4 c1707l4 = this.f15211a;
        Activity activity = (Activity) c1707l4.f15276a.get();
        if (activity != null) {
            if (c1707l4.f15279e == null) {
                C1720m3 c1720m32 = new C1720m3(activity);
                A4 a42 = c1707l4.f15282h;
                if (a42 != null) {
                    c1720m32.setLogger(a42);
                }
                c1720m32.setId(65518);
                c1720m32.setEmbeddedBrowserUpdateListener(c1707l4.f15283i);
                c1707l4.f15279e = c1720m32;
            }
            r rVar = c1707l4.f15277b;
            if ((rVar instanceof S9) && (c1720m3 = c1707l4.f15279e) != null) {
                c1720m3.setUserLeftApplicationListener(((S9) rVar).getListener());
            }
            C1720m3 c1720m33 = c1707l4.f15279e;
            if (c1720m33 != null) {
                r rVar2 = c1707l4.f15277b;
                String str3 = (rVar2 == null || (r6 = rVar2.getAdType()) == null) ? "banner" : "banner";
                r rVar3 = c1707l4.f15277b;
                if (rVar3 == null || (impressionId = rVar3.getImpressionId()) == null) {
                    str = "";
                } else {
                    str = impressionId;
                }
                r rVar4 = c1707l4.f15277b;
                if (rVar4 == null || (creativeId = rVar4.getCreativeId()) == null) {
                    str2 = "";
                } else {
                    str2 = creativeId;
                }
                if (c1720m33.f15299b == null) {
                    Context context = c1720m33.getContext();
                    kotlin.jvm.internal.g.d(context, "getContext(...)");
                    C1797s3 c1797s3 = new C1797s3(context, j10, str3, str, str2, c1720m33.f15302f);
                    c1720m33.f15299b = c1797s3;
                    c1797s3.setId(65517);
                }
                C1797s3 c1797s32 = c1720m33.f15299b;
                if (c1797s32 != null) {
                    c1797s32.setLandingPageTelemetryMetaData(landingPageTelemetryMetaData);
                }
                if (c1720m33.f15298a != expandInput.hashCode()) {
                    if (inputType == EnumC1733n3.f15339a) {
                        C1797s3 c1797s33 = c1720m33.f15299b;
                        if (c1797s33 != null) {
                            c1797s33.loadUrl(expandInput);
                        }
                    } else {
                        C1797s3 c1797s34 = c1720m33.f15299b;
                        if (c1797s34 != null) {
                            c1797s34.loadData(expandInput, "text/html", "UTF-8");
                        }
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(10);
                    layoutParams.addRule(2, 65533);
                    C1797s3 c1797s35 = c1720m33.f15299b;
                    if (c1797s35 != null) {
                        c1797s35.setLayoutParams(layoutParams);
                    }
                    if (c1720m33.findViewById(65517) == null) {
                        c1720m33.addView(c1720m33.f15299b, layoutParams);
                    }
                }
                c1720m33.f15298a = expandInput.hashCode();
                if (z10) {
                    if (c1720m33.findViewById(65533) == null) {
                        float f11 = AbstractC1692k3.d().c;
                        LinearLayout linearLayout = new LinearLayout(c1720m33.getContext());
                        linearLayout.setOrientation(0);
                        linearLayout.setId(65533);
                        linearLayout.setWeightSum(100.0f);
                        linearLayout.setBackgroundResource(17301658);
                        linearLayout.setBackgroundColor(-7829368);
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (48 * f11));
                        layoutParams2.addRule(12);
                        c1720m33.addView(linearLayout, layoutParams2);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
                        layoutParams3.weight = 25.0f;
                        c1720m33.b(linearLayout, layoutParams3);
                        c1720m33.d(linearLayout, layoutParams3);
                        c1720m33.a(linearLayout, layoutParams3);
                        c1720m33.c(linearLayout, layoutParams3);
                    }
                } else {
                    View findViewById = c1720m33.findViewById(65533);
                    if (findViewById != null) {
                        c1720m33.removeView(findViewById);
                    }
                }
            }
            float f12 = 1 - f10;
            c1707l4.f15281g = f12;
            B b10 = c1707l4.c;
            if (b10 != null) {
                b10.c = f12;
                b10.e();
            }
            c1707l4.c();
        }
    }
}
