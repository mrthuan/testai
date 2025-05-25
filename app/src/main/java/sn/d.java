package sn;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.os.Environment;
import android.text.TextUtils;
import androidx.activity.f;
import androidx.activity.r;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.utils.v;

/* compiled from: PdfResManager.java */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f29829a = ea.a.p("DloRUhxhZA==", "BdADXOC4");

    /* renamed from: b  reason: collision with root package name */
    public static final String f29830b = ea.a.p("H0R3ICtlVmQ_cg==", "ynEBvGZh");
    public static final String c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f29831d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f29832e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f29833f;

    /* renamed from: g  reason: collision with root package name */
    public static final String f29834g;

    /* renamed from: h  reason: collision with root package name */
    public static final String f29835h;

    /* renamed from: i  reason: collision with root package name */
    public static d f29836i;

    static {
        ea.a.p("Km82dhRydA==", "miIXqXq9");
        ea.a.p("UHIuYQdl", "diYmhaId");
        ea.a.p("KnhFchhjdA==", "8tKmlwse");
        f29832e = ea.a.p("UnA7bBpjA3Qbb1ovGWRm", "MeS85Idh");
        f29833f = ea.a.p("Jm1QZxwvXXA_Zw==", "szTbl6eU");
        f29834g = ea.a.p("Wm0qZxYvEm5n", "0Ba2zeQ1");
        ea.a.p("UG8ldBZuFjpdLw==", "L0VACbBf");
        f29835h = ea.a.p("HGlWbhh0QnI_SSdhEmU=", "oTOJrKTp");
        c = Environment.DIRECTORY_DOCUMENTS;
        f29831d = Environment.DIRECTORY_PICTURES;
    }

    public d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ReaderPdfApplication.m().getFilesDir());
        String str = File.separator;
        sb2.append(str);
        File file = new File(r.g(sb2, f29830b, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(e());
        if (!file2.exists()) {
            file2.mkdirs();
        }
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            File file = new File(e() + str);
            if (!file.exists()) {
                file = new File(f() + str);
            }
            return file.exists();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e());
        sb2.append(str2);
        String str3 = File.separator;
        File file2 = new File(r.g(sb2, str3, str));
        if (!file2.exists()) {
            file2 = new File(f() + str2 + str3 + str);
        }
        return file2.exists();
    }

    public static String b() {
        return Environment.getExternalStoragePublicDirectory(c).toString() + File.separator;
    }

    public static String c() {
        return Environment.getExternalStoragePublicDirectory(f29831d).toString() + File.separator;
    }

    public static synchronized d d() {
        d dVar;
        synchronized (d.class) {
            if (f29836i == null) {
                f29836i = new d();
            }
            dVar = f29836i;
        }
        return dVar;
    }

    public static String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStoragePublicDirectory(c).toString());
        String str = File.separator;
        sb2.append(str);
        return r.g(sb2, f29830b, str);
    }

    public static String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStoragePublicDirectory(c).toString());
        String str = File.separator;
        sb2.append(str);
        return r.g(sb2, f29829a, str);
    }

    public static String g(boolean z10) {
        String str = f29835h;
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ReaderPdfApplication.m().getFilesDir());
            String str2 = File.separator;
            return f.o(sb2, str2, str, str2);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(ReaderPdfApplication.m().getCacheDir());
        String str3 = File.separator;
        return f.o(sb3, str3, str, str3);
    }

    public static void h(Context context, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            String[] strArr = new String[size];
            for (int i10 = 0; i10 < size; i10++) {
                strArr[i10] = (String) arrayList.get(i10);
            }
            MediaScannerConnection.scanFile(context, strArr, null, null);
        }
    }

    public static String i(String str) {
        String str2;
        Matcher matcher;
        ConcurrentHashMap<String, File> concurrentHashMap = v.f28781a;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf > 0 && lastIndexOf < str.length() - 1) {
            str2 = str.substring(lastIndexOf + 1);
        } else {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        while (v.G(str)) {
            Matcher matcher2 = Pattern.compile(ea.a.p("DChtMG45HysUKS4=", "3HP6CBUU") + str2 + ea.a.p("JA==", "H7oVksjF")).matcher(str);
            if (matcher2.find()) {
                String group = matcher2.group();
                if (Pattern.compile(ea.a.p("aDBmOS4r", "q9a3BeJp")).matcher(group).find()) {
                    str = str.replace(group, ea.a.p("KA==", "9qAT90mI") + (Integer.parseInt(matcher.group()) + 1) + ea.a.p("Zi4=", "cCpg8pgW") + str2);
                }
            } else {
                str = str.replace(ea.a.p("Lg==", "IyIKGGJ1") + str2, ea.a.p("GzFiLg==", "ya9zUDt1") + str2);
            }
        }
        return str;
    }

    public static String j(Context context, File file, String str, a aVar) {
        String str2;
        Context applicationContext = context.getApplicationContext();
        String str3 = c;
        boolean isEmpty = TextUtils.isEmpty(str);
        String str4 = f29830b;
        if (!isEmpty) {
            str2 = r.g(a0.a.k(str4), File.separator, str);
        } else {
            str2 = str4;
        }
        return l(applicationContext, file, f29832e, str3, str2, file.getName(), true, aVar);
    }

    public static void k(Context context, File file, String str, a aVar) {
        ArrayList arrayList = new ArrayList();
        String j10 = j(context, file, str, aVar);
        if (!TextUtils.isEmpty(j10)) {
            arrayList.add(j10);
        }
        h(context, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f2 A[Catch: all -> 0x03c8, TRY_LEAVE, TryCatch #14 {all -> 0x03c8, blocks: (B:143:0x02ed, B:145:0x02f2, B:165:0x0359, B:167:0x035e, B:191:0x03d3, B:193:0x03de, B:195:0x03f0, B:201:0x03fb, B:203:0x0401, B:199:0x03f6), top: B:245:0x003e, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0300 A[Catch: Exception -> 0x0383, TRY_ENTER, TryCatch #27 {Exception -> 0x0383, blocks: (B:147:0x0300, B:149:0x0315, B:151:0x031a, B:153:0x0320, B:155:0x0325, B:158:0x0332, B:159:0x0335, B:115:0x02b9, B:169:0x036c, B:173:0x0389, B:175:0x038e, B:177:0x0394, B:179:0x0399, B:182:0x03a6, B:183:0x03a9, B:205:0x0406, B:207:0x041d, B:209:0x0422, B:211:0x0428, B:213:0x042d, B:216:0x043a, B:217:0x043d, B:104:0x0267, B:106:0x027f, B:108:0x0285, B:110:0x028a, B:113:0x0297, B:114:0x029a), top: B:248:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0315 A[Catch: Exception -> 0x0383, TryCatch #27 {Exception -> 0x0383, blocks: (B:147:0x0300, B:149:0x0315, B:151:0x031a, B:153:0x0320, B:155:0x0325, B:158:0x0332, B:159:0x0335, B:115:0x02b9, B:169:0x036c, B:173:0x0389, B:175:0x038e, B:177:0x0394, B:179:0x0399, B:182:0x03a6, B:183:0x03a9, B:205:0x0406, B:207:0x041d, B:209:0x0422, B:211:0x0428, B:213:0x042d, B:216:0x043a, B:217:0x043d, B:104:0x0267, B:106:0x027f, B:108:0x0285, B:110:0x028a, B:113:0x0297, B:114:0x029a), top: B:248:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x031a A[Catch: Exception -> 0x0383, TryCatch #27 {Exception -> 0x0383, blocks: (B:147:0x0300, B:149:0x0315, B:151:0x031a, B:153:0x0320, B:155:0x0325, B:158:0x0332, B:159:0x0335, B:115:0x02b9, B:169:0x036c, B:173:0x0389, B:175:0x038e, B:177:0x0394, B:179:0x0399, B:182:0x03a6, B:183:0x03a9, B:205:0x0406, B:207:0x041d, B:209:0x0422, B:211:0x0428, B:213:0x042d, B:216:0x043a, B:217:0x043d, B:104:0x0267, B:106:0x027f, B:108:0x0285, B:110:0x028a, B:113:0x0297, B:114:0x029a), top: B:248:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0325 A[Catch: Exception -> 0x0383, TryCatch #27 {Exception -> 0x0383, blocks: (B:147:0x0300, B:149:0x0315, B:151:0x031a, B:153:0x0320, B:155:0x0325, B:158:0x0332, B:159:0x0335, B:115:0x02b9, B:169:0x036c, B:173:0x0389, B:175:0x038e, B:177:0x0394, B:179:0x0399, B:182:0x03a6, B:183:0x03a9, B:205:0x0406, B:207:0x041d, B:209:0x0422, B:211:0x0428, B:213:0x042d, B:216:0x043a, B:217:0x043d, B:104:0x0267, B:106:0x027f, B:108:0x0285, B:110:0x028a, B:113:0x0297, B:114:0x029a), top: B:248:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x035e A[Catch: all -> 0x03c8, TRY_LEAVE, TryCatch #14 {all -> 0x03c8, blocks: (B:143:0x02ed, B:145:0x02f2, B:165:0x0359, B:167:0x035e, B:191:0x03d3, B:193:0x03de, B:195:0x03f0, B:201:0x03fb, B:203:0x0401, B:199:0x03f6), top: B:245:0x003e, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x036c A[Catch: Exception -> 0x0383, TRY_ENTER, TryCatch #27 {Exception -> 0x0383, blocks: (B:147:0x0300, B:149:0x0315, B:151:0x031a, B:153:0x0320, B:155:0x0325, B:158:0x0332, B:159:0x0335, B:115:0x02b9, B:169:0x036c, B:173:0x0389, B:175:0x038e, B:177:0x0394, B:179:0x0399, B:182:0x03a6, B:183:0x03a9, B:205:0x0406, B:207:0x041d, B:209:0x0422, B:211:0x0428, B:213:0x042d, B:216:0x043a, B:217:0x043d, B:104:0x0267, B:106:0x027f, B:108:0x0285, B:110:0x028a, B:113:0x0297, B:114:0x029a), top: B:248:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0389 A[Catch: Exception -> 0x0383, TryCatch #27 {Exception -> 0x0383, blocks: (B:147:0x0300, B:149:0x0315, B:151:0x031a, B:153:0x0320, B:155:0x0325, B:158:0x0332, B:159:0x0335, B:115:0x02b9, B:169:0x036c, B:173:0x0389, B:175:0x038e, B:177:0x0394, B:179:0x0399, B:182:0x03a6, B:183:0x03a9, B:205:0x0406, B:207:0x041d, B:209:0x0422, B:211:0x0428, B:213:0x042d, B:216:0x043a, B:217:0x043d, B:104:0x0267, B:106:0x027f, B:108:0x0285, B:110:0x028a, B:113:0x0297, B:114:0x029a), top: B:248:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x038e A[Catch: Exception -> 0x0383, TryCatch #27 {Exception -> 0x0383, blocks: (B:147:0x0300, B:149:0x0315, B:151:0x031a, B:153:0x0320, B:155:0x0325, B:158:0x0332, B:159:0x0335, B:115:0x02b9, B:169:0x036c, B:173:0x0389, B:175:0x038e, B:177:0x0394, B:179:0x0399, B:182:0x03a6, B:183:0x03a9, B:205:0x0406, B:207:0x041d, B:209:0x0422, B:211:0x0428, B:213:0x042d, B:216:0x043a, B:217:0x043d, B:104:0x0267, B:106:0x027f, B:108:0x0285, B:110:0x028a, B:113:0x0297, B:114:0x029a), top: B:248:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0399 A[Catch: Exception -> 0x0383, TryCatch #27 {Exception -> 0x0383, blocks: (B:147:0x0300, B:149:0x0315, B:151:0x031a, B:153:0x0320, B:155:0x0325, B:158:0x0332, B:159:0x0335, B:115:0x02b9, B:169:0x036c, B:173:0x0389, B:175:0x038e, B:177:0x0394, B:179:0x0399, B:182:0x03a6, B:183:0x03a9, B:205:0x0406, B:207:0x041d, B:209:0x0422, B:211:0x0428, B:213:0x042d, B:216:0x043a, B:217:0x043d, B:104:0x0267, B:106:0x027f, B:108:0x0285, B:110:0x028a, B:113:0x0297, B:114:0x029a), top: B:248:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0406 A[Catch: Exception -> 0x0383, TRY_ENTER, TryCatch #27 {Exception -> 0x0383, blocks: (B:147:0x0300, B:149:0x0315, B:151:0x031a, B:153:0x0320, B:155:0x0325, B:158:0x0332, B:159:0x0335, B:115:0x02b9, B:169:0x036c, B:173:0x0389, B:175:0x038e, B:177:0x0394, B:179:0x0399, B:182:0x03a6, B:183:0x03a9, B:205:0x0406, B:207:0x041d, B:209:0x0422, B:211:0x0428, B:213:0x042d, B:216:0x043a, B:217:0x043d, B:104:0x0267, B:106:0x027f, B:108:0x0285, B:110:0x028a, B:113:0x0297, B:114:0x029a), top: B:248:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x041d A[Catch: Exception -> 0x0383, TryCatch #27 {Exception -> 0x0383, blocks: (B:147:0x0300, B:149:0x0315, B:151:0x031a, B:153:0x0320, B:155:0x0325, B:158:0x0332, B:159:0x0335, B:115:0x02b9, B:169:0x036c, B:173:0x0389, B:175:0x038e, B:177:0x0394, B:179:0x0399, B:182:0x03a6, B:183:0x03a9, B:205:0x0406, B:207:0x041d, B:209:0x0422, B:211:0x0428, B:213:0x042d, B:216:0x043a, B:217:0x043d, B:104:0x0267, B:106:0x027f, B:108:0x0285, B:110:0x028a, B:113:0x0297, B:114:0x029a), top: B:248:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0422 A[Catch: Exception -> 0x0383, TryCatch #27 {Exception -> 0x0383, blocks: (B:147:0x0300, B:149:0x0315, B:151:0x031a, B:153:0x0320, B:155:0x0325, B:158:0x0332, B:159:0x0335, B:115:0x02b9, B:169:0x036c, B:173:0x0389, B:175:0x038e, B:177:0x0394, B:179:0x0399, B:182:0x03a6, B:183:0x03a9, B:205:0x0406, B:207:0x041d, B:209:0x0422, B:211:0x0428, B:213:0x042d, B:216:0x043a, B:217:0x043d, B:104:0x0267, B:106:0x027f, B:108:0x0285, B:110:0x028a, B:113:0x0297, B:114:0x029a), top: B:248:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x042d A[Catch: Exception -> 0x0383, TryCatch #27 {Exception -> 0x0383, blocks: (B:147:0x0300, B:149:0x0315, B:151:0x031a, B:153:0x0320, B:155:0x0325, B:158:0x0332, B:159:0x0335, B:115:0x02b9, B:169:0x036c, B:173:0x0389, B:175:0x038e, B:177:0x0394, B:179:0x0399, B:182:0x03a6, B:183:0x03a9, B:205:0x0406, B:207:0x041d, B:209:0x0422, B:211:0x0428, B:213:0x042d, B:216:0x043a, B:217:0x043d, B:104:0x0267, B:106:0x027f, B:108:0x0285, B:110:0x028a, B:113:0x0297, B:114:0x029a), top: B:248:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v65 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String l(android.content.Context r16, java.io.File r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, sn.a r23) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sn.d.l(android.content.Context, java.io.File, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, sn.a):java.lang.String");
    }
}
