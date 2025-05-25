package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.activity.r;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: MimeDetector.java */
/* loaded from: classes.dex */
public class pA {

    /* renamed from: ac  reason: collision with root package name */
    private static volatile pA f8430ac;
    private Context CJ;
    private Map<String, String> Qhi;
    private volatile boolean cJ = false;

    private pA(Context context) {
        if (context != null && this.CJ == null) {
            this.CJ = context.getApplicationContext();
            Qhi();
        }
        this.CJ = context;
    }

    private String CJ(String str) {
        String str2;
        String fl2 = fl(str);
        if (fl2.isEmpty()) {
            return null;
        }
        Qhi();
        Map<String, String> map = this.Qhi;
        if (map == null || map.isEmpty()) {
            return null;
        }
        do {
            str2 = this.Qhi.get(fl2);
            if (str2 == null) {
                fl2 = fl(fl2);
            }
            if (str2 != null) {
                break;
            }
        } while (!fl2.isEmpty());
        return str2;
    }

    private void Tgh(String str) {
        String trim = str.trim();
        if (!trim.isEmpty()) {
            if (trim.charAt(0) != '#') {
                String replaceAll = trim.replaceAll("\\s*#.*", "");
                if (replaceAll.indexOf(61) > 0) {
                    Matcher matcher = Pattern.compile("\\btype=(\"\\p{Graph}+?/\\p{Graph}+?\"|\\p{Graph}+/\\p{Graph}+\\b)").matcher(replaceAll);
                    if (matcher.find()) {
                        String substring = matcher.group().substring(5);
                        if (substring.charAt(0) == '\"') {
                            substring = r.e(substring, 1, 1);
                        }
                        Matcher matcher2 = Pattern.compile("\\bexts=(\"[\\p{Graph}|\\p{Blank}]+?\"|\\p{Graph}+\\b)").matcher(replaceAll);
                        if (matcher2.find()) {
                            String substring2 = matcher2.group().substring(5);
                            if (substring2.charAt(0) == '\"') {
                                substring2 = r.e(substring2, 1, 1);
                            }
                            for (String str2 : substring2.split("[\\p{Blank}|\\p{Punct}]+")) {
                                Qhi(str2, substring);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                String[] split = replaceAll.split("\\s+");
                for (int i10 = 1; i10 < split.length; i10++) {
                    Qhi(split[i10], split[0]);
                }
            }
        }
    }

    private static boolean ac(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (!Qhi(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    private static String cJ(String str) {
        String substring;
        int indexOf = str.indexOf(47);
        int indexOf2 = str.indexOf(59);
        if (indexOf < 0) {
            return null;
        }
        String trim = str.substring(0, indexOf).trim();
        Locale locale = Locale.ENGLISH;
        String lowerCase = trim.toLowerCase(locale);
        if (!ac(lowerCase)) {
            return null;
        }
        int i10 = indexOf + 1;
        if (indexOf2 < 0) {
            substring = str.substring(i10);
        } else {
            substring = str.substring(i10, indexOf2);
        }
        String lowerCase2 = substring.trim().toLowerCase(locale);
        if (!ac(lowerCase2)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(lowerCase2.length() + lowerCase.length() + 1);
        sb2.append(lowerCase);
        sb2.append(PackagingURIHelper.FORWARD_SLASH_CHAR);
        sb2.append(lowerCase2);
        return sb2.toString();
    }

    private static String fl(String str) {
        int indexOf;
        if (str != null && !str.isEmpty() && (indexOf = str.indexOf(46)) >= 0 && indexOf < str.length() - 1) {
            return str.substring(indexOf + 1);
        }
        return "";
    }

    public static String Qhi(Context context, String str) {
        if (str != null) {
            try {
                if (str.startsWith("http") && str.contains("?")) {
                    str = str.split("\\?")[0];
                    if (str.endsWith(PackagingURIHelper.FORWARD_SLASH_STRING)) {
                        str = str.substring(0, str.length() - 1);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return Qhi(context).Qhi(str);
    }

    public static pA Qhi(Context context) {
        if (f8430ac == null) {
            synchronized (pA.class) {
                if (f8430ac == null) {
                    f8430ac = new pA(context);
                }
            }
        }
        return f8430ac;
    }

    public final String Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String CJ = CJ(str);
        if (TextUtils.isEmpty(CJ)) {
            return null;
        }
        return cJ(CJ);
    }

    private static boolean Qhi(char c) {
        return c > ' ' && c < 127 && "()<>@,;:/[]?=\\\"".indexOf(c) < 0;
    }

    private void Qhi() {
        if (this.CJ == null || this.cJ) {
            return;
        }
        synchronized (this) {
            if (!this.cJ) {
                List list = (List) AccessController.doPrivileged(new PrivilegedAction<List<String>>() { // from class: com.bytedance.sdk.component.utils.pA.1
                    @Override // java.security.PrivilegedAction
                    /* renamed from: Qhi */
                    public List<String> run() {
                        BufferedReader bufferedReader;
                        InputStream inputStream = null;
                        try {
                            ArrayList arrayList = new ArrayList();
                            InputStream open = pA.this.CJ.getAssets().open("tt_mime_type.pro");
                            try {
                                bufferedReader = new BufferedReader(new InputStreamReader(open));
                                while (true) {
                                    try {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine == null) {
                                            break;
                                        } else if (!TextUtils.isEmpty(readLine)) {
                                            arrayList.add(readLine);
                                        }
                                    } catch (Throwable unused) {
                                        inputStream = open;
                                        try {
                                            List<String> emptyList = Collections.emptyList();
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            return emptyList;
                                        } finally {
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Throwable unused3) {
                                                }
                                            }
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (Throwable unused4) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (open != null) {
                                    try {
                                        open.close();
                                    } catch (Throwable unused5) {
                                    }
                                }
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused6) {
                                }
                                return arrayList;
                            } catch (Throwable unused7) {
                                bufferedReader = null;
                            }
                        } catch (Throwable unused8) {
                            bufferedReader = null;
                        }
                    }
                });
                this.Qhi = new HashMap(list.size());
                String str = "";
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = str + ((String) it.next());
                    if (str2.endsWith("\\")) {
                        str = str2.substring(0, str2.length() - 1);
                    } else {
                        Tgh(str2);
                        str = "";
                    }
                }
                if (!str.isEmpty()) {
                    Tgh(str);
                }
                this.cJ = true;
            }
        }
    }

    private void Qhi(String str, String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || this.Qhi.containsKey(str)) {
            return;
        }
        this.Qhi.put(str, str2);
    }
}
