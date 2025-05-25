package f6;

import android.util.Patterns;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.q;
import kotlin.jvm.internal.g;
import kotlin.text.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FeatureExtractor.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17119a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static Map<String, String> f17120b;
    public static Map<String, String> c;

    /* renamed from: d  reason: collision with root package name */
    public static Map<String, String> f17121d;

    /* renamed from: e  reason: collision with root package name */
    public static JSONObject f17122e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f17123f;

    public static final float[] a(String str, JSONObject jSONObject) {
        String lowerCase;
        JSONObject jSONObject2;
        String screenName;
        JSONArray jSONArray;
        a aVar;
        JSONObject b10;
        if (k6.a.b(a.class)) {
            return null;
        }
        try {
            if (!f17123f) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            try {
                lowerCase = str.toLowerCase();
                g.d(lowerCase, "this as java.lang.String).toLowerCase()");
                jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                screenName = jSONObject.optString("screenname");
                jSONArray = new JSONArray();
                aVar = f17119a;
                aVar.h(jSONObject2, jSONArray);
                aVar.k(fArr, aVar.g(jSONObject2));
                b10 = aVar.b(jSONObject2);
            } catch (JSONException unused) {
            }
            if (b10 == null) {
                return null;
            }
            g.d(screenName, "screenName");
            String jSONObject3 = jSONObject2.toString();
            g.d(jSONObject3, "viewTree.toString()");
            aVar.k(fArr, aVar.f(b10, jSONArray, screenName, jSONObject3, lowerCase));
            return fArr;
        } catch (Throwable th2) {
            k6.a.a(a.class, th2);
            return null;
        }
    }

    public static final String c(String str, String activityName, String str2) {
        if (k6.a.b(a.class)) {
            return null;
        }
        try {
            g.e(activityName, "activityName");
            String lowerCase = (str2 + " | " + activityName + ", " + str).toLowerCase();
            g.d(lowerCase, "this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th2) {
            k6.a.a(a.class, th2);
            return null;
        }
    }

    public static final void d(File file) {
        if (k6.a.b(a.class)) {
            return;
        }
        try {
            try {
                f17122e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f17122e = new JSONObject(new String(bArr, kotlin.text.a.f19966b));
                f17120b = q.A0(new Pair("ENGLISH", "1"), new Pair("GERMAN", "2"), new Pair("SPANISH", "3"), new Pair("JAPANESE", "4"));
                c = q.A0(new Pair("VIEW_CONTENT", PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES), new Pair("SEARCH", "1"), new Pair("ADD_TO_CART", "2"), new Pair("ADD_TO_WISHLIST", "3"), new Pair("INITIATE_CHECKOUT", "4"), new Pair("ADD_PAYMENT_INFO", "5"), new Pair("PURCHASE", "6"), new Pair("LEAD", "7"), new Pair("COMPLETE_REGISTRATION", "8"));
                f17121d = q.A0(new Pair("BUTTON_TEXT", "1"), new Pair("PAGE_TITLE", "2"), new Pair("RESOLVED_DOCUMENT_LINK", "3"), new Pair("BUTTON_ID", "4"));
                f17123f = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            k6.a.a(a.class, th2);
        }
    }

    public final JSONObject b(JSONObject jSONObject) {
        if (k6.a.b(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
            g.d(jSONObject2, "children.getJSONObject(i)");
            JSONObject b10 = b(jSONObject2);
            if (b10 != null) {
                return b10;
            }
        }
        return null;
    }

    public final boolean e(String[] strArr, String[] strArr2) {
        if (k6.a.b(this)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (k.O(str2, str, false)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[Catch: JSONException -> 0x006d, all -> 0x0168, TRY_LEAVE, TryCatch #0 {all -> 0x0168, blocks: (B:6:0x0018, B:9:0x001f, B:10:0x0024, B:12:0x002d, B:14:0x0031, B:15:0x0034, B:17:0x003b, B:28:0x0061, B:25:0x005b, B:31:0x0071, B:35:0x00b9, B:39:0x00c6, B:43:0x00d5, B:47:0x00e4, B:51:0x00f3, B:55:0x0102, B:59:0x0111, B:63:0x011e, B:67:0x012b, B:71:0x013a, B:75:0x0149, B:79:0x0156, B:83:0x0163), top: B:89:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float[] f(org.json.JSONObject r17, org.json.JSONArray r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.a.f(org.json.JSONObject, org.json.JSONArray, java.lang.String, java.lang.String, java.lang.String):float[]");
    }

    public final float[] g(JSONObject jSONObject) {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            String optString = jSONObject.optString("text");
            g.d(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            g.d(lowerCase, "this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint");
            g.d(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            g.d(lowerCase2, "this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString("classname");
            g.d(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            g.d(lowerCase3, "this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (e(new String[]{"$", "amount", InMobiNetworkValues.PRICE, "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (e(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (e(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (e(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 2 || optInt == 3) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (k.O(lowerCase3, "checkbox", false)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (e(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (k.O(lowerCase3, "radio", false) && k.O(lowerCase3, "button", false)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                    g.d(jSONObject2, "childViews.getJSONObject(i)");
                    k(fArr, g(jSONObject2));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    public final boolean h(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z10;
        if (k6.a.b(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int length = optJSONArray.length();
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (optJSONArray.getJSONObject(i10).optBoolean("is_interacted")) {
                        z10 = true;
                        break;
                    }
                    i10++;
                } else {
                    z10 = false;
                    break;
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            if (z10) {
                int length2 = optJSONArray.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    jSONArray.put(optJSONArray.getJSONObject(i11));
                }
            } else {
                int length3 = optJSONArray.length();
                for (int i12 = 0; i12 < length3; i12++) {
                    JSONObject child = optJSONArray.getJSONObject(i12);
                    g.d(child, "child");
                    if (h(child, jSONArray)) {
                        jSONArray2.put(child);
                        z10 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z10;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return false;
        }
    }

    public final boolean i(String str, String str2) {
        if (k6.a.b(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return false;
        }
    }

    public final boolean j(String str, String str2, String str3) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        if (k6.a.b(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = f17122e;
            String str4 = null;
            if (jSONObject != null) {
                JSONObject optJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
                if (optJSONObject3 != null) {
                    Map<String, String> map = f17120b;
                    if (map != null) {
                        JSONObject optJSONObject4 = optJSONObject3.optJSONObject(map.get("ENGLISH"));
                        if (optJSONObject4 != null && (optJSONObject = optJSONObject4.optJSONObject("rulesForEvent")) != null) {
                            Map<String, String> map2 = c;
                            if (map2 != null) {
                                JSONObject optJSONObject5 = optJSONObject.optJSONObject(map2.get(str));
                                if (optJSONObject5 != null && (optJSONObject2 = optJSONObject5.optJSONObject("positiveRules")) != null) {
                                    Map<String, String> map3 = f17121d;
                                    if (map3 != null) {
                                        str4 = optJSONObject2.optString(map3.get(str2));
                                    } else {
                                        g.i("textTypeInfo");
                                        throw null;
                                    }
                                }
                            } else {
                                g.i("eventInfo");
                                throw null;
                            }
                        }
                    } else {
                        g.i("languageInfo");
                        throw null;
                    }
                }
                if (str4 == null) {
                    return false;
                }
                return i(str4, str3);
            }
            g.i("rules");
            throw null;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return false;
        }
    }

    public final void k(float[] fArr, float[] fArr2) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            int length = fArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                fArr[i10] = fArr[i10] + fArr2[i10];
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    public final void l(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        boolean z10;
        if (k6.a.b(this)) {
            return;
        }
        try {
            String optString = jSONObject.optString("text", "");
            g.d(optString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = optString.toLowerCase();
            g.d(lowerCase, "this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint", "");
            g.d(optString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = optString2.toLowerCase();
            g.d(lowerCase2, "this as java.lang.String).toLowerCase()");
            boolean z11 = true;
            if (lowerCase.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                sb2.append(lowerCase);
                sb2.append(" ");
            }
            if (lowerCase2.length() <= 0) {
                z11 = false;
            }
            if (z11) {
                sb3.append(lowerCase2);
                sb3.append(" ");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return;
            }
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    JSONObject currentChildView = optJSONArray.getJSONObject(i10);
                    g.d(currentChildView, "currentChildView");
                    l(currentChildView, sb2, sb3);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
