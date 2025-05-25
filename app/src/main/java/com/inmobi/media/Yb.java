package com.inmobi.media;

import com.adjust.sdk.Constants;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Yb {

    /* renamed from: h  reason: collision with root package name */
    public static final List f14892h = ge.a.I(ContentTypes.IMAGE_JPEG, ContentTypes.IMAGE_PNG, "image/jpg");

    /* renamed from: a  reason: collision with root package name */
    public final int f14893a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14894b;

    /* renamed from: d  reason: collision with root package name */
    public final String f14895d;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14898g;
    public String c = null;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f14896e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f14897f = new ArrayList();

    public Yb(int i10, int i11, String str) {
        this.f14893a = i10;
        this.f14894b = i11;
        this.f14895d = str;
    }

    public final ArrayList a(int i10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f14896e.iterator();
        while (it.hasNext()) {
            Xb xb2 = (Xb) it.next();
            if (xb2.f14858a == i10) {
                arrayList.add(xb2);
            }
        }
        return arrayList;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f14895d;
            if (str != null) {
                jSONObject.put(FacebookMediationAdapter.KEY_ID, str);
            }
            jSONObject.put(InMobiNetworkValues.WIDTH, this.f14893a);
            jSONObject.put(InMobiNetworkValues.HEIGHT, this.f14894b);
            jSONObject.put("clickThroughUrl", this.c);
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f14896e.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Xb) it.next()).toString());
            }
            jSONObject.put("resources", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f14897f.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((P7) it2.next()).toString());
            }
            jSONObject.put(Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH, jSONArray2);
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.g.d(jSONObject2, "toString(...)");
            return jSONObject2;
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
            return "";
        }
    }

    public final ArrayList a(String trackerEventType) {
        kotlin.jvm.internal.g.e(trackerEventType, "trackerEventType");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f14897f.iterator();
        while (it.hasNext()) {
            P7 p72 = (P7) it.next();
            if (kotlin.jvm.internal.g.a(p72.c, trackerEventType)) {
                arrayList.add(p72);
            }
        }
        return arrayList;
    }
}
