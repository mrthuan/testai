package ge;

import android.content.Context;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigUtils.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f17772a = {"loc", "tzo", "lan", "suc", "ron", "ven", "pve", "apm", "density", "manu", "extends"};

    /* renamed from: b  reason: collision with root package name */
    public final Context f17773b;
    public final String c;

    public e(Context context) {
        this.c = "app_name";
        this.f17773b = context;
        this.c = context.getPackageName();
    }

    public final String a(int i10, String str) {
        String[] strArr = this.f17772a;
        JSONObject jSONObject = new JSONObject();
        Context context = this.f17773b;
        int i11 = de.e.i(context).getInt("request_version", 2);
        try {
            jSONObject.put(strArr[0], Locale.getDefault().getCountry());
            String format = new SimpleDateFormat("Z", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis()));
            if (format.startsWith("-")) {
                format = format.replace("-", "n");
            } else if (format.startsWith("+")) {
                format = format.replace("+", "p");
            }
            jSONObject.put(strArr[1], format);
            jSONObject.put(strArr[2], Locale.getDefault().getLanguage());
            jSONObject.put(strArr[3], 0);
            jSONObject.put(strArr[4], str);
            jSONObject.put(strArr[5], i10);
            jSONObject.put(strArr[6], Build.VERSION.SDK_INT);
            jSONObject.put(strArr[7], this.c);
            jSONObject.put(strArr[8], context.getResources().getDisplayMetrics().density);
            if (i11 == 3) {
                String str2 = strArr[9];
                jSONObject.put(str2, (Build.MANUFACTURER + "").toLowerCase());
                jSONObject.put(strArr[10], de.e.i(context).getString("extends_request_data", ""));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("version=" + i11);
        stringBuffer.append("&data=");
        stringBuffer.append(jSONObject2);
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f0, code lost:
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010b, code lost:
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0113: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:69:0x0113 */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5 A[Catch: IOException -> 0x0104, TRY_ENTER, TryCatch #7 {IOException -> 0x0104, blocks: (B:49:0x00e5, B:51:0x00ed, B:34:0x00cc, B:59:0x00fd, B:63:0x0108, B:31:0x00c1, B:33:0x00c9), top: B:82:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed A[Catch: IOException -> 0x0104, TRY_LEAVE, TryCatch #7 {IOException -> 0x0104, blocks: (B:49:0x00e5, B:51:0x00ed, B:34:0x00cc, B:59:0x00fd, B:63:0x0108, B:31:0x00c1, B:33:0x00c9), top: B:82:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fd A[Catch: IOException -> 0x0104, TRY_ENTER, TryCatch #7 {IOException -> 0x0104, blocks: (B:49:0x00e5, B:51:0x00ed, B:34:0x00cc, B:59:0x00fd, B:63:0x0108, B:31:0x00c1, B:33:0x00c9), top: B:82:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0108 A[Catch: IOException -> 0x0104, TRY_LEAVE, TryCatch #7 {IOException -> 0x0104, blocks: (B:49:0x00e5, B:51:0x00ed, B:34:0x00cc, B:59:0x00fd, B:63:0x0108, B:31:0x00c1, B:33:0x00c9), top: B:82:0x0005 }] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.io.Reader, java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.InputStreamReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.e.b():java.lang.String");
    }
}
