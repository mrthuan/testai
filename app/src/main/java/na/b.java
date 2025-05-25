package na;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: KeysMap.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f22371a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final int f22372b = 64;
    public final int c;

    public b(int i10) {
        this.c = i10;
    }

    public static String b(int i10, String str) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > i10) {
                return trim.substring(0, i10);
            }
            return trim;
        }
        return str;
    }

    public final synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f22371a));
    }

    public final synchronized boolean c(String str, String str2) {
        boolean equals;
        if (str != null) {
            String b10 = b(this.c, str);
            if (this.f22371a.size() >= this.f22372b && !this.f22371a.containsKey(b10)) {
                return false;
            }
            String b11 = b(this.c, str2);
            String str3 = (String) this.f22371a.get(b10);
            if (str3 == null) {
                if (b11 == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = str3.equals(b11);
            }
            if (equals) {
                return false;
            }
            HashMap hashMap = this.f22371a;
            if (str2 == null) {
                b11 = "";
            }
            hashMap.put(b10, b11);
            return true;
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public final synchronized void d(Map<String, String> map) {
        String b10;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                String b11 = b(this.c, key);
                if (this.f22371a.size() < this.f22372b || this.f22371a.containsKey(b11)) {
                    String value = entry.getValue();
                    HashMap hashMap = this.f22371a;
                    if (value == null) {
                        b10 = "";
                    } else {
                        b10 = b(this.c, value);
                    }
                    hashMap.put(b11, b10);
                }
            } else {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
        }
    }
}
