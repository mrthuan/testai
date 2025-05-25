package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Context;
import android.text.TextUtils;
import fn.c;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.bean.c;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;

/* compiled from: ToolsDataManager.kt */
/* loaded from: classes3.dex */
public final class m1 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f28726a = "[\n{\n  \"groupIdentity\": \"AI Assistant\",\n  \"childList\": []\n},\n{\n  \"groupIdentity\": \"convert\",\n  \"childList\": [\n    {\n      \"isAd\": false,\n      \"identity\": \"image to pdf\"\n    },\n    {\n      \"isAd\": false,\n      \"identity\": \"scan to pdf\"\n    },\n     {\n      \"isAd\": false,\n      \"identity\": \"docx to pdf\"\n    },\n    {\n      \"isAd\": false,\n      \"identity\": \"pdf to word\"\n    },\n    {\n      \"isAd\": false,\n      \"identity\": \"pdf to image\"\n    },\n    {\n      \"isAd\": false,\n      \"identity\": \"pdf to long image\"\n    },\n    {\n      \"isAd\": false,\n      \"identity\": \"image to text\"\n    }\n  ]\n},\n\n{\n  \"groupIdentity\": \"Edit\",\n  \"childList\": [\n    {\n      \"isAd\": false,\n      \"identity\": \"edit text\"\n    },\n    {\n      \"isAd\": false,\n      \"identity\": \"annotate\"\n    },\n    {\n      \"isAd\": false,\n      \"identity\": \"signature\"\n    },\n    {\n      \"isAd\": false,\n      \"identity\": \"merge pdf\"\n    },\n    {\n      \"isAd\": false,\n      \"identity\": \"split pdf\"\n    },\n    {\n      \"isAd\": false,\n      \"identity\": \"add text\"\n    }\n  ]\n},\n\n{\n  \"groupIdentity\": \"Document Management\",\n  \"childList\": [\n    {\n      \"isAd\": false,\n      \"identity\": \"import files\"\n    },\n    {\n      \"isAd\": false,\n      \"identity\": \"create pdf\"\n    },\n    {\n      \"isAd\": false,\n      \"identity\": \"print pdf\"\n    },\n    {\n      \"isAd\": false,\n      \"identity\": \"lock pdf\"\n    },\n    {\n      \"isAd\": false,\n      \"identity\": \"unlock pdf\"\n    }\n  ]\n}\n]";

    public static ArrayList a(Context context) {
        if (context == null) {
            context = ReaderPdfApplication.m().getApplicationContext();
        }
        String h10 = de.e.h("tools_unit_data_166", "");
        if (TextUtils.isEmpty(h10)) {
            String str = n0.f28727a;
            h10 = f28726a;
        } else {
            String str2 = n0.f28727a;
        }
        kotlin.jvm.internal.g.b(context);
        return d(context, h10);
    }

    public static String b(Context context, String str) {
        if (context == null) {
            context = ReaderPdfApplication.m().getApplicationContext();
        }
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.g.d(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.g.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        switch (lowerCase.hashCode()) {
            case -628846362:
                if (lowerCase.equals("ai assistant")) {
                    return "ai";
                }
                return null;
            case 3108362:
                if (lowerCase.equals("edit")) {
                    kotlin.jvm.internal.g.b(context);
                    return context.getString(R.string.arg_res_0x7f13010d);
                }
                return null;
            case 951590323:
                if (lowerCase.equals("convert")) {
                    kotlin.jvm.internal.g.b(context);
                    return context.getString(R.string.arg_res_0x7f1300ce);
                }
                return null;
            case 1680855144:
                if (lowerCase.equals("document management")) {
                    kotlin.jvm.internal.g.b(context);
                    return context.getString(R.string.arg_res_0x7f13023f);
                }
                return null;
            default:
                return null;
        }
    }

    public static c.a c(Context context, String str) {
        if (context == null) {
            context = ReaderPdfApplication.m().getApplicationContext();
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.g.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (kotlin.jvm.internal.g.a(lowerCase, "image to pdf")) {
                return new c.a(R.drawable.ic_tools_imagetopdf, context.getString(R.string.arg_res_0x7f13019b), q0.E(context));
            }
            if (kotlin.jvm.internal.g.a(lowerCase, "scan to pdf")) {
                String string = context.getString(R.string.arg_res_0x7f130453);
                jn.a.c.getClass();
                return new c.a(R.drawable.ic_tools_scan, string, jn.a.m());
            } else if (kotlin.jvm.internal.g.a(lowerCase, "annotate")) {
                return new c.a(R.drawable.ic_tools_edit, context.getString(R.string.arg_res_0x7f13005a), false);
            } else {
                if (kotlin.jvm.internal.g.a(lowerCase, "merge pdf")) {
                    return new c.a(R.drawable.ic_tools_merge, context.getString(R.string.arg_res_0x7f130259), false);
                }
                if (kotlin.jvm.internal.g.a(lowerCase, "split pdf")) {
                    return new c.a(R.drawable.ic_tools_split, context.getString(R.string.arg_res_0x7f130486), false);
                }
                if (kotlin.jvm.internal.g.a(lowerCase, "print pdf")) {
                    return new c.a(R.drawable.ic_tools_print, context.getString(R.string.arg_res_0x7f130328), false);
                }
                if (kotlin.jvm.internal.g.a(lowerCase, "lock pdf")) {
                    return new c.a(R.drawable.ic_tools_lock, context.getString(R.string.arg_res_0x7f130229), false);
                }
                if (kotlin.jvm.internal.g.a(lowerCase, "unlock pdf")) {
                    return new c.a(R.drawable.ic_tools_unlock, context.getString(R.string.arg_res_0x7f130565), false);
                }
                if (kotlin.jvm.internal.g.a(lowerCase, "add text")) {
                    return new c.a(R.drawable.ic_tools_addtext, context.getString(R.string.arg_res_0x7f13002f), q0.D(context));
                }
                if (kotlin.jvm.internal.g.a(lowerCase, "image to text")) {
                    BillingConfigImpl.c.getClass();
                    if (BillingConfigImpl.r()) {
                        return new c.a(R.drawable.ic_tools_ocr_new, context.getString(R.string.arg_res_0x7f13012b), q0.g(context, 95, "ocr_update_red_dot_in_175"));
                    }
                    if (!c1.J(context)) {
                        return null;
                    }
                    return new c.a(false, R.drawable.ic_tools_ocr_new, context.getString(R.string.arg_res_0x7f13019e), !h1.b(context, "pdfscanner.scan.pdf.scanner.free"), true);
                } else if (kotlin.jvm.internal.g.a(lowerCase, "import files")) {
                    return new c.a(R.drawable.ic_tools_manager, context.getString(R.string.arg_res_0x7f130343), false);
                } else {
                    if (kotlin.jvm.internal.g.a(lowerCase, "signature")) {
                        return new c.a(R.drawable.ic_tools_signature, context.getString(R.string.arg_res_0x7f130479), q0.s(context));
                    }
                    if (kotlin.jvm.internal.g.a(lowerCase, "docx to pdf")) {
                        return new c.a(R.drawable.ic_tools_docxtopdf, context.getString(R.string.arg_res_0x7f13058f), q0.r(context));
                    }
                    if (kotlin.jvm.internal.g.a(lowerCase, "pdf to image")) {
                        return new c.a(R.drawable.ic_tools_pdftoimg, context.getString(R.string.arg_res_0x7f13033f), q0.F(context));
                    }
                    if (kotlin.jvm.internal.g.a(lowerCase, "pdf to long image")) {
                        return new c.a(R.drawable.ic_tools_pdftolongimg, context.getString(R.string.arg_res_0x7f130340), q0.F(context));
                    }
                    if (kotlin.jvm.internal.g.a(lowerCase, "pdf to word")) {
                        return new c.a(R.drawable.ic_tools_pdftodocx, context.getString(R.string.arg_res_0x7f1301a7), q0.G(context));
                    }
                    if (kotlin.jvm.internal.g.a(lowerCase, "edit text")) {
                        String string2 = context.getString(R.string.arg_res_0x7f13035d);
                        fn.c.c.getClass();
                        return new c.a(R.drawable.ic_tools_edit_text, string2, c.a.c(context));
                    } else if (kotlin.jvm.internal.g.a(lowerCase, "create pdf")) {
                        String string3 = context.getString(R.string.arg_res_0x7f1300da);
                        wm.a.c.getClass();
                        return new c.a(R.drawable.ic_tools_create_pdf, string3, wm.a.h(context));
                    }
                }
            }
        }
        return null;
    }

    public static ArrayList d(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String groupIdentity = jSONObject.getString("groupIdentity");
                kotlin.jvm.internal.g.d(groupIdentity, "groupIdentity");
                String b10 = b(context, groupIdentity);
                if (b10 != null) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("childList");
                    if (TextUtils.equals(b10, "ai")) {
                        if (c1.E(context)) {
                            q0.C(context);
                            arrayList.add(new pdf.pdfreader.viewer.editor.free.bean.b());
                        }
                    } else {
                        arrayList.add(new pdf.pdfreader.viewer.editor.free.bean.a(groupIdentity));
                    }
                    int length2 = jSONArray2.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i11);
                        jSONObject2.getBoolean("isAd");
                        String identity = jSONObject2.getString("identity");
                        kotlin.jvm.internal.g.d(identity, "identity");
                        if (c(context, identity) != null) {
                            arrayList.add(new pdf.pdfreader.viewer.editor.free.bean.c(identity));
                        }
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            e10.toString();
            String str2 = n0.f28727a;
            String str3 = f28726a;
            if (!TextUtils.equals(str3, str)) {
                d(context, str3);
            }
        }
        return arrayList;
    }
}
