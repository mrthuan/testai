package com.apm.insight.nativecrash;

import android.text.TextUtils;
import com.apm.insight.l.h;
import com.apm.insight.l.j;
import com.apm.insight.l.n;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class d {

    /* loaded from: classes.dex */
    public static class a extends c {
        public a(File file) {
            super(file);
            this.f6687b = "Total FD Count:";
            this.c = ":";
            this.f6688d = -2;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends c {
        public b(File file) {
            super(file);
            this.f6687b = "VmSize:";
            this.c = "\\s+";
            this.f6688d = -1;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        protected File f6686a;

        /* renamed from: b  reason: collision with root package name */
        protected String f6687b;
        protected String c;

        /* renamed from: d  reason: collision with root package name */
        protected int f6688d;

        public c(File file) {
            this.f6686a = file;
        }

        public int a() {
            int i10;
            Throwable th2;
            if (!this.f6686a.exists() || !this.f6686a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f6686a));
                int i11 = -1;
                do {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        i11 = a(readLine);
                    } catch (Throwable th3) {
                        th2 = th3;
                        i10 = i11;
                        bufferedReader = bufferedReader2;
                        try {
                            com.apm.insight.c.a().a("NPTH_CATCH", th2);
                            return i10;
                        } finally {
                            if (bufferedReader != null) {
                                j.a(bufferedReader);
                            }
                        }
                    }
                } while (i11 == -1);
                j.a(bufferedReader2);
                return i11;
            } catch (Throwable th4) {
                i10 = -1;
                th2 = th4;
            }
        }

        public int a(String str) {
            int i10 = this.f6688d;
            if (str.startsWith(this.f6687b)) {
                try {
                    i10 = Integer.parseInt(str.split(this.c)[1].trim());
                } catch (NumberFormatException e10) {
                    com.apm.insight.c.a().a("NPTH_CATCH", e10);
                }
                if (i10 < 0) {
                    return -2;
                }
                return i10;
            }
            return i10;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0052d extends c {
        public C0052d(File file) {
            super(file);
        }

        public HashMap<String, List<String>> b() {
            JSONArray b10;
            String str;
            HashMap<String, List<String>> hashMap = new HashMap<>();
            try {
                b10 = h.b(this.f6686a.getAbsolutePath());
            } catch (IOException unused) {
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
            if (b10 == null) {
                return hashMap;
            }
            for (int i10 = 0; i10 < b10.length(); i10++) {
                String optString = b10.optString(i10);
                if (!TextUtils.isEmpty(optString) && optString.startsWith("[tid:0") && optString.endsWith("sigstack:0x0]")) {
                    int indexOf = optString.indexOf("[routine:0x");
                    int i11 = indexOf + 11;
                    int indexOf2 = optString.indexOf(93, i11);
                    if (indexOf > 0) {
                        str = optString.substring(i11, indexOf2);
                    } else {
                        str = "unknown addr";
                    }
                    List<String> list = hashMap.get(str);
                    if (list == null) {
                        list = new ArrayList<>();
                        hashMap.put(str, list);
                    }
                    list.add(optString);
                }
            }
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends c {
        public e(File file) {
            super(file);
        }

        public JSONArray a(HashMap<String, List<String>> hashMap) {
            JSONArray b10;
            int indexOf;
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (hashMap.isEmpty()) {
                return jSONArray;
            }
            try {
                b10 = h.b(this.f6686a.getAbsolutePath());
            } catch (IOException unused) {
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
            if (b10 == null) {
                return jSONArray;
            }
            for (int i10 = 0; i10 < b10.length(); i10++) {
                String optString = b10.optString(i10);
                if (!TextUtils.isEmpty(optString) && (indexOf = optString.indexOf(":")) > 2) {
                    String substring = optString.substring(2, indexOf);
                    if (hashMap.containsKey(substring) && (list = hashMap.get(substring)) != null) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(it.next() + " " + optString);
                        }
                        hashMap.remove(substring);
                    }
                }
            }
            for (List<String> list2 : hashMap.values()) {
                Iterator<String> it2 = list2.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next() + "  0x000000:unknown");
                }
            }
            return jSONArray;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends c {
        public f(File file) {
            super(file);
            this.f6687b = "Total Threads Count:";
            this.c = ":";
            this.f6688d = -2;
        }
    }

    public static int a(String str) {
        return new a(n.b(str)).a();
    }

    public static int b(String str) {
        return new f(n.c(str)).a();
    }

    public static int c(String str) {
        return new b(n.d(str)).a();
    }

    public static JSONArray a(File file, File file2) {
        return new e(file2).a(new C0052d(file).b());
    }
}
