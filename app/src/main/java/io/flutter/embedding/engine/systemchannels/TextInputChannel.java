package io.flutter.embedding.engine.systemchannels;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.s;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.fontbox.ttf.NamingTable;
import gf.h;
import io.flutter.plugin.editing.TextInputPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wk.g;

/* loaded from: classes.dex */
public final class TextInputChannel {

    /* renamed from: a  reason: collision with root package name */
    public final h f18704a;

    /* renamed from: b  reason: collision with root package name */
    public e f18705b;

    /* loaded from: classes.dex */
    public enum TextCapitalization {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");
        
        private final String encodedName;

        TextCapitalization(String str) {
            this.encodedName = str;
        }

        public static TextCapitalization fromValue(String str) {
            TextCapitalization[] values;
            for (TextCapitalization textCapitalization : values()) {
                if (textCapitalization.encodedName.equals(str)) {
                    return textCapitalization;
                }
            }
            throw new NoSuchFieldException(a0.a.h("No such TextCapitalization: ", str));
        }
    }

    /* loaded from: classes.dex */
    public enum TextInputType {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");
        
        private final String encodedName;

        TextInputType(String str) {
            this.encodedName = str;
        }

        public static TextInputType fromValue(String str) {
            TextInputType[] values;
            for (TextInputType textInputType : values()) {
                if (textInputType.encodedName.equals(str)) {
                    return textInputType;
                }
            }
            throw new NoSuchFieldException(a0.a.h("No such TextInputType: ", str));
        }
    }

    /* loaded from: classes.dex */
    public class a implements h.b {
        public a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // gf.h.b
        public final void a(g gVar, gf.g gVar2) {
            char c;
            Bundle bundle;
            c cVar;
            boolean z10;
            TextInputChannel textInputChannel = TextInputChannel.this;
            if (textInputChannel.f18705b == null) {
                return;
            }
            String str = (String) gVar.f31333a;
            str.getClass();
            boolean z11 = true;
            switch (str.hashCode()) {
                case -1779068172:
                    if (str.equals("TextInput.setPlatformViewClient")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1015421462:
                    if (str.equals("TextInput.setEditingState")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -37561188:
                    if (str.equals("TextInput.setClient")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 270476819:
                    if (str.equals("TextInput.hide")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 270803918:
                    if (str.equals("TextInput.show")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 649192816:
                    if (str.equals("TextInput.sendAppPrivateCommand")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1204752139:
                    if (str.equals("TextInput.setEditableSizeAndTransform")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1727570905:
                    if (str.equals("TextInput.finishAutofillContext")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1904427655:
                    if (str.equals("TextInput.clearClient")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 2113369584:
                    if (str.equals("TextInput.requestAutofill")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            Object obj = gVar.f31334b;
            switch (c) {
                case 0:
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        ((TextInputPlugin.a) textInputChannel.f18705b).f(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                        gVar2.c(null);
                        return;
                    } catch (JSONException e10) {
                        gVar2.a("error", e10.getMessage(), null);
                        return;
                    }
                case 1:
                    try {
                        ((TextInputPlugin.a) textInputChannel.f18705b).e(d.a((JSONObject) obj));
                        gVar2.c(null);
                        return;
                    } catch (JSONException e11) {
                        gVar2.a("error", e11.getMessage(), null);
                        return;
                    }
                case 2:
                    try {
                        JSONArray jSONArray = (JSONArray) obj;
                        ((TextInputPlugin.a) textInputChannel.f18705b).c(jSONArray.getInt(0), b.a(jSONArray.getJSONObject(1)));
                        gVar2.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e12) {
                        gVar2.a("error", e12.getMessage(), null);
                        return;
                    }
                case 3:
                    ((TextInputPlugin.a) textInputChannel.f18705b).b();
                    gVar2.c(null);
                    return;
                case 4:
                    TextInputPlugin textInputPlugin = TextInputPlugin.this;
                    View view = textInputPlugin.f18730a;
                    b bVar = textInputPlugin.f18734f;
                    if (bVar != null && (cVar = bVar.f18714g) != null && cVar.f18723a == TextInputType.NONE) {
                        z11 = false;
                    }
                    InputMethodManager inputMethodManager = textInputPlugin.f18731b;
                    if (z11) {
                        view.requestFocus();
                        inputMethodManager.showSoftInput(view, 0);
                    } else {
                        textInputPlugin.e();
                        inputMethodManager.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
                    }
                    gVar2.c(null);
                    return;
                case 5:
                    try {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String string = jSONObject2.getString("action");
                        String string2 = jSONObject2.getString("data");
                        if (string2 != null && !string2.isEmpty()) {
                            bundle = new Bundle();
                            bundle.putString("data", string2);
                        } else {
                            bundle = null;
                        }
                        TextInputPlugin textInputPlugin2 = TextInputPlugin.this;
                        textInputPlugin2.f18731b.sendAppPrivateCommand(textInputPlugin2.f18730a, string, bundle);
                        gVar2.c(null);
                        return;
                    } catch (JSONException e13) {
                        gVar2.a("error", e13.getMessage(), null);
                        return;
                    }
                case 6:
                    try {
                        JSONObject jSONObject3 = (JSONObject) obj;
                        double d10 = jSONObject3.getDouble(InMobiNetworkValues.WIDTH);
                        double d11 = jSONObject3.getDouble(InMobiNetworkValues.HEIGHT);
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                        double[] dArr = new double[16];
                        for (int i10 = 0; i10 < 16; i10++) {
                            dArr[i10] = jSONArray2.getDouble(i10);
                        }
                        ((TextInputPlugin.a) textInputChannel.f18705b).d(d10, d11, dArr);
                        gVar2.c(null);
                        return;
                    } catch (JSONException e14) {
                        gVar2.a("error", e14.getMessage(), null);
                        return;
                    }
                case 7:
                    e eVar = textInputChannel.f18705b;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    TextInputPlugin.a aVar = (TextInputPlugin.a) eVar;
                    if (Build.VERSION.SDK_INT >= 26) {
                        AutofillManager autofillManager = TextInputPlugin.this.c;
                        if (autofillManager != null) {
                            if (booleanValue) {
                                autofillManager.commit();
                            } else {
                                autofillManager.cancel();
                            }
                        }
                    } else {
                        aVar.getClass();
                    }
                    gVar2.c(null);
                    return;
                case '\b':
                    ((TextInputPlugin.a) textInputChannel.f18705b).a();
                    gVar2.c(null);
                    return;
                case '\t':
                    int i11 = Build.VERSION.SDK_INT;
                    TextInputPlugin textInputPlugin3 = TextInputPlugin.this;
                    if (i11 >= 26) {
                        AutofillManager autofillManager2 = textInputPlugin3.c;
                        if (autofillManager2 != null) {
                            if (textInputPlugin3.f18735g != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                String str2 = textInputPlugin3.f18734f.f18717j.f18720a;
                                int[] iArr = new int[2];
                                View view2 = textInputPlugin3.f18730a;
                                view2.getLocationOnScreen(iArr);
                                Rect rect = new Rect(textInputPlugin3.f18740l);
                                rect.offset(iArr[0], iArr[1]);
                                autofillManager2.notifyViewEntered(view2, str2.hashCode(), rect);
                            }
                        }
                    } else {
                        textInputPlugin3.getClass();
                    }
                    gVar2.c(null);
                    return;
                default:
                    gVar2.b();
                    return;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f18709a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f18710b;
        public final boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f18711d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f18712e;

        /* renamed from: f  reason: collision with root package name */
        public final TextCapitalization f18713f;

        /* renamed from: g  reason: collision with root package name */
        public final c f18714g;

        /* renamed from: h  reason: collision with root package name */
        public final Integer f18715h;

        /* renamed from: i  reason: collision with root package name */
        public final String f18716i;

        /* renamed from: j  reason: collision with root package name */
        public final a f18717j;

        /* renamed from: k  reason: collision with root package name */
        public final String[] f18718k;

        /* renamed from: l  reason: collision with root package name */
        public final b[] f18719l;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final String f18720a;

            /* renamed from: b  reason: collision with root package name */
            public final String[] f18721b;
            public final d c;

            /* renamed from: d  reason: collision with root package name */
            public final String f18722d;

            public a(String str, String[] strArr, String str2, d dVar) {
                this.f18720a = str;
                this.f18721b = strArr;
                this.f18722d = str2;
                this.c = dVar;
            }
        }

        public b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, TextCapitalization textCapitalization, c cVar, Integer num, String str, a aVar, String[] strArr, b[] bVarArr) {
            this.f18709a = z10;
            this.f18710b = z11;
            this.c = z12;
            this.f18711d = z13;
            this.f18712e = z14;
            this.f18713f = textCapitalization;
            this.f18714g = cVar;
            this.f18715h = num;
            this.f18716i = str;
            this.f18717j = aVar;
            this.f18718k = strArr;
            this.f18719l = bVarArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static b a(JSONObject jSONObject) {
            b[] bVarArr;
            char c;
            int i10;
            Integer num;
            JSONArray jSONArray;
            b bVar;
            String string;
            String string2;
            ArrayList arrayList;
            boolean z10;
            b bVar2;
            boolean z11;
            c cVar;
            boolean z12;
            boolean z13;
            boolean z14;
            a aVar;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            b bVar3;
            ArrayList arrayList2;
            String str;
            String str2;
            JSONObject jSONObject2;
            int i11;
            String[] strArr;
            char c10;
            String string3 = jSONObject.getString("inputAction");
            if (string3 != null) {
                if (!jSONObject.isNull("fields")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("fields");
                    int length = jSONArray2.length();
                    b[] bVarArr2 = new b[length];
                    for (int i12 = 0; i12 < length; i12++) {
                        bVarArr2[i12] = a(jSONArray2.getJSONObject(i12));
                    }
                    bVarArr = bVarArr2;
                } else {
                    bVarArr = null;
                }
                switch (string3.hashCode()) {
                    case -737377923:
                        if (string3.equals("TextInputAction.done")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -737089298:
                        if (string3.equals("TextInputAction.next")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -737080013:
                        if (string3.equals("TextInputAction.none")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -736940669:
                        if (string3.equals("TextInputAction.send")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 469250275:
                        if (string3.equals("TextInputAction.search")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1241689507:
                        if (string3.equals("TextInputAction.go")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1539450297:
                        if (string3.equals("TextInputAction.newline")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2110497650:
                        if (string3.equals("TextInputAction.previous")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        i10 = 6;
                        num = i10;
                        break;
                    case 1:
                        i10 = 5;
                        num = i10;
                        break;
                    case 2:
                    case 6:
                        num = 1;
                        break;
                    case 3:
                        i10 = 4;
                        num = i10;
                        break;
                    case 4:
                        i10 = 3;
                        num = i10;
                        break;
                    case 5:
                        i10 = 2;
                        num = i10;
                        break;
                    case 7:
                        i10 = 7;
                        num = i10;
                        break;
                    default:
                        num = 0;
                        break;
                }
                ArrayList arrayList3 = new ArrayList();
                if (jSONObject.isNull("contentCommitMimeTypes")) {
                    jSONArray = null;
                } else {
                    jSONArray = jSONObject.getJSONArray("contentCommitMimeTypes");
                }
                if (jSONArray != null) {
                    for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                        arrayList3.add(jSONArray.optString(i13));
                    }
                }
                boolean optBoolean = jSONObject.optBoolean("obscureText");
                boolean optBoolean2 = jSONObject.optBoolean("autocorrect", true);
                boolean optBoolean3 = jSONObject.optBoolean("enableSuggestions");
                boolean optBoolean4 = jSONObject.optBoolean("enableIMEPersonalizedLearning");
                boolean optBoolean5 = jSONObject.optBoolean("enableDeltaModel");
                TextCapitalization fromValue = TextCapitalization.fromValue(jSONObject.getString("textCapitalization"));
                JSONObject jSONObject3 = jSONObject.getJSONObject("inputType");
                int i14 = 0;
                c cVar2 = new c(TextInputType.fromValue(jSONObject3.getString(NamingTable.TAG)), jSONObject3.optBoolean("signed", false), jSONObject3.optBoolean("decimal", false));
                if (jSONObject.isNull("actionLabel")) {
                    string = null;
                } else {
                    string = jSONObject.getString("actionLabel");
                }
                if (jSONObject.isNull("autofill")) {
                    arrayList = arrayList3;
                    z10 = optBoolean4;
                    bVar2 = bVar;
                    z11 = optBoolean5;
                    cVar = cVar2;
                    z12 = optBoolean;
                    z13 = optBoolean2;
                    z14 = optBoolean3;
                    aVar = null;
                } else {
                    JSONObject jSONObject4 = jSONObject.getJSONObject("autofill");
                    String string4 = jSONObject4.getString("uniqueIdentifier");
                    JSONArray jSONArray3 = jSONObject4.getJSONArray("hints");
                    if (jSONObject4.isNull("hintText")) {
                        string2 = null;
                    } else {
                        string2 = jSONObject4.getString("hintText");
                    }
                    JSONObject jSONObject5 = jSONObject4.getJSONObject("editingValue");
                    String[] strArr2 = new String[jSONArray3.length()];
                    while (i14 < jSONArray3.length()) {
                        String string5 = jSONArray3.getString(i14);
                        JSONArray jSONArray4 = jSONArray3;
                        c cVar3 = cVar2;
                        if (Build.VERSION.SDK_INT < 26) {
                            jSONObject2 = jSONObject5;
                            arrayList2 = arrayList3;
                            z16 = optBoolean4;
                            bVar3 = bVar;
                            z15 = optBoolean5;
                            z19 = optBoolean;
                            z18 = optBoolean2;
                            str = string4;
                            str2 = string2;
                            i11 = i14;
                            strArr = strArr2;
                            z17 = optBoolean3;
                        } else {
                            string5.getClass();
                            z15 = optBoolean5;
                            z16 = optBoolean4;
                            z17 = optBoolean3;
                            z18 = optBoolean2;
                            z19 = optBoolean;
                            bVar3 = bVar;
                            arrayList2 = arrayList3;
                            str = string4;
                            str2 = string2;
                            jSONObject2 = jSONObject5;
                            i11 = i14;
                            strArr = strArr2;
                            switch (string5.hashCode()) {
                                case -2058889126:
                                    if (string5.equals("birthdayYear")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1917283616:
                                    if (string5.equals("oneTimeCode")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1844815832:
                                    if (string5.equals("creditCardExpirationMonth")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1825589953:
                                    if (string5.equals("telephoneNumberNational")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1821235109:
                                    if (string5.equals("newPassword")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1757573738:
                                    if (string5.equals("creditCardSecurityCode")) {
                                        c10 = 5;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1682373820:
                                    if (string5.equals("creditCardExpirationDay")) {
                                        c10 = 6;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1658955742:
                                    if (string5.equals("fullStreetAddress")) {
                                        c10 = 7;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1567118045:
                                    if (string5.equals("telephoneNumberDevice")) {
                                        c10 = '\b';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1476752575:
                                    if (string5.equals("countryName")) {
                                        c10 = '\t';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1413737489:
                                    if (string5.equals("middleInitial")) {
                                        c10 = '\n';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1377792129:
                                    if (string5.equals("addressCity")) {
                                        c10 = 11;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1249512767:
                                    if (string5.equals("gender")) {
                                        c10 = '\f';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1186060294:
                                    if (string5.equals("postalAddressExtendedPostalCode")) {
                                        c10 = '\r';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1151034798:
                                    if (string5.equals("creditCardNumber")) {
                                        c10 = 14;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -835992323:
                                    if (string5.equals("namePrefix")) {
                                        c10 = 15;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -818219584:
                                    if (string5.equals("middleName")) {
                                        c10 = 16;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -747304516:
                                    if (string5.equals("nameSuffix")) {
                                        c10 = 17;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -613980922:
                                    if (string5.equals("creditCardExpirationDate")) {
                                        c10 = 18;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -613352043:
                                    if (string5.equals("creditCardExpirationYear")) {
                                        c10 = 19;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -549230602:
                                    if (string5.equals("telephoneNumberCountryCode")) {
                                        c10 = 20;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -265713450:
                                    if (string5.equals("username")) {
                                        c10 = 21;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 3373707:
                                    if (string5.equals(NamingTable.TAG)) {
                                        c10 = 22;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 96619420:
                                    if (string5.equals("email")) {
                                        c10 = 23;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 253202685:
                                    if (string5.equals("addressState")) {
                                        c10 = 24;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 588174851:
                                    if (string5.equals("birthdayMonth")) {
                                        c10 = 25;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 798554127:
                                    if (string5.equals("familyName")) {
                                        c10 = 26;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 892233837:
                                    if (string5.equals("telephoneNumber")) {
                                        c10 = 27;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 991032982:
                                    if (string5.equals("newUsername")) {
                                        c10 = 28;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1069376125:
                                    if (string5.equals("birthday")) {
                                        c10 = 29;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1216985755:
                                    if (string5.equals("password")) {
                                        c10 = 30;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1469046696:
                                    if (string5.equals("givenName")) {
                                        c10 = 31;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1662667945:
                                    if (string5.equals("postalAddress")) {
                                        c10 = ' ';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1921869058:
                                    if (string5.equals("postalAddressExtended")) {
                                        c10 = '!';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 2011152728:
                                    if (string5.equals("postalCode")) {
                                        c10 = '\"';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 2011773919:
                                    if (string5.equals("birthdayDay")) {
                                        c10 = '#';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                    string5 = "birthDateYear";
                                    continue;
                                case 1:
                                    string5 = "smsOTPCode";
                                    continue;
                                case 2:
                                    string5 = "creditCardExpirationMonth";
                                    continue;
                                case 3:
                                    string5 = "phoneNational";
                                    continue;
                                case 4:
                                    string5 = "newPassword";
                                    continue;
                                case 5:
                                    string5 = "creditCardSecurityCode";
                                    continue;
                                case 6:
                                    string5 = "creditCardExpirationDay";
                                    continue;
                                case 7:
                                    string5 = "streetAddress";
                                    continue;
                                case '\b':
                                    string5 = "phoneNumberDevice";
                                    continue;
                                case '\t':
                                    string5 = "addressCountry";
                                    continue;
                                case '\n':
                                    string5 = "personMiddleInitial";
                                    continue;
                                case 11:
                                    string5 = "addressLocality";
                                    continue;
                                case '\f':
                                    string5 = "gender";
                                    continue;
                                case '\r':
                                    string5 = "extendedPostalCode";
                                    continue;
                                case 14:
                                    string5 = "creditCardNumber";
                                    continue;
                                case 15:
                                    string5 = "personNamePrefix";
                                    continue;
                                case 16:
                                    string5 = "personMiddleName";
                                    continue;
                                case 17:
                                    string5 = "personNameSuffix";
                                    continue;
                                case 18:
                                    string5 = "creditCardExpirationDate";
                                    continue;
                                case 19:
                                    string5 = "creditCardExpirationYear";
                                    continue;
                                case 20:
                                    string5 = "phoneCountryCode";
                                    continue;
                                case 21:
                                    string5 = "username";
                                    continue;
                                case 22:
                                    string5 = "personName";
                                    continue;
                                case 23:
                                    string5 = "emailAddress";
                                    continue;
                                case 24:
                                    string5 = "addressRegion";
                                    continue;
                                case 25:
                                    string5 = "birthDateMonth";
                                    continue;
                                case 26:
                                    string5 = "personFamilyName";
                                    continue;
                                case 27:
                                    string5 = "phoneNumber";
                                    continue;
                                case 28:
                                    string5 = "newUsername";
                                    continue;
                                case 29:
                                    string5 = "birthDateFull";
                                    continue;
                                case 30:
                                    string5 = "password";
                                    continue;
                                case 31:
                                    string5 = "personGivenName";
                                    continue;
                                case ' ':
                                    string5 = "postalAddress";
                                    continue;
                                case '!':
                                    string5 = "extendedAddress";
                                    continue;
                                case '\"':
                                    string5 = "postalCode";
                                    continue;
                                case '#':
                                    string5 = "birthDateDay";
                                    continue;
                            }
                        }
                        strArr[i11] = string5;
                        i14 = i11 + 1;
                        jSONArray3 = jSONArray4;
                        cVar2 = cVar3;
                        optBoolean5 = z15;
                        optBoolean4 = z16;
                        optBoolean3 = z17;
                        optBoolean2 = z18;
                        optBoolean = z19;
                        bVar = bVar3;
                        arrayList3 = arrayList2;
                        string4 = str;
                        string2 = str2;
                        jSONObject5 = jSONObject2;
                        strArr2 = strArr;
                    }
                    arrayList = arrayList3;
                    z10 = optBoolean4;
                    bVar2 = bVar;
                    z11 = optBoolean5;
                    cVar = cVar2;
                    z12 = optBoolean;
                    z13 = optBoolean2;
                    z14 = optBoolean3;
                    aVar = new a(string4, strArr2, string2, d.a(jSONObject5));
                }
                new b(z12, z13, z14, z10, z11, fromValue, cVar, num, string, aVar, (String[]) arrayList.toArray(new String[arrayList.size()]), bVarArr);
                return bVar2;
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final TextInputType f18723a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f18724b;
        public final boolean c;

        public c(TextInputType textInputType, boolean z10, boolean z11) {
            this.f18723a = textInputType;
            this.f18724b = z10;
            this.c = z11;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f18725a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18726b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f18727d;

        /* renamed from: e  reason: collision with root package name */
        public final int f18728e;

        public d(String str, int i10, int i11, int i12, int i13) {
            if ((i10 == -1 && i11 == -1) || (i10 >= 0 && i11 >= 0)) {
                if ((i12 == -1 && i13 == -1) || (i12 >= 0 && i12 <= i13)) {
                    if (i13 <= str.length()) {
                        if (i10 <= str.length()) {
                            if (i11 <= str.length()) {
                                this.f18725a = str;
                                this.f18726b = i10;
                                this.c = i11;
                                this.f18727d = i12;
                                this.f18728e = i13;
                                return;
                            }
                            throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i11));
                        }
                        throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i10));
                    }
                    throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i12));
                }
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i12) + ", " + String.valueOf(i13) + ")");
            }
            throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i10) + ", " + String.valueOf(i11) + ")");
        }

        public static d a(JSONObject jSONObject) {
            return new d(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    public TextInputChannel(we.a aVar) {
        a aVar2 = new a();
        h hVar = new h(aVar, "flutter/textinput", s.f1849d);
        this.f18704a = hVar;
        hVar.b(aVar2);
    }

    public static HashMap<Object, Object> a(String str, int i10, int i11, int i12, int i13) {
        HashMap<Object, Object> h10 = a6.h.h("text", str);
        h10.put("selectionBase", Integer.valueOf(i10));
        h10.put("selectionExtent", Integer.valueOf(i11));
        h10.put("composingBase", Integer.valueOf(i12));
        h10.put("composingExtent", Integer.valueOf(i13));
        return h10;
    }
}
