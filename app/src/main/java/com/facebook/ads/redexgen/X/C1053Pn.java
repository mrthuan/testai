package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Pn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1053Pn {
    public final String A00;
    public final ArrayList<String> A01;
    public final ArrayList<String> A02;
    public final ArrayList<String> A03;
    public final JSONObject A04;
    public final boolean A05;

    public C1053Pn(JSONObject jSONObject, String str, ArrayList<String> imageUrls, ArrayList<String> videoUrls, ArrayList<String> fileUrls, boolean z10) {
        this.A04 = jSONObject;
        this.A00 = str;
        this.A02 = imageUrls;
        this.A03 = videoUrls;
        this.A01 = fileUrls;
        this.A05 = z10;
    }
}
