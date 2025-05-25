package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzai {

    /* renamed from: b  reason: collision with root package name */
    public static final zzai f11530b = new zzai(null, null);

    /* renamed from: a  reason: collision with root package name */
    public final EnumMap f11531a;

    public zzai(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(zzah.class);
        this.f11531a = enumMap;
        enumMap.put((EnumMap) zzah.AD_STORAGE, (zzah) bool);
        enumMap.put((EnumMap) zzah.ANALYTICS_STORAGE, (zzah) bool2);
    }

    public static zzai a(Bundle bundle) {
        zzah[] values;
        if (bundle == null) {
            return f11530b;
        }
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            String string = bundle.getString(zzahVar.zzd);
            Boolean bool = null;
            if (string != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
            }
            enumMap.put((EnumMap) zzahVar, (zzah) bool);
        }
        return new zzai(enumMap);
    }

    public static zzai b(String str) {
        EnumMap enumMap = new EnumMap(zzah.class);
        if (str != null) {
            int i10 = 0;
            while (true) {
                zzah[] zzahVarArr = zzah.zzc;
                int length = zzahVarArr.length;
                if (i10 >= 2) {
                    break;
                }
                zzah zzahVar = zzahVarArr[i10];
                int i11 = i10 + 2;
                if (i11 < str.length()) {
                    char charAt = str.charAt(i11);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt != '0') {
                            if (charAt == '1') {
                                bool = Boolean.TRUE;
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                    }
                    enumMap.put((EnumMap) zzahVar, (zzah) bool);
                }
                i10++;
            }
        }
        return new zzai(enumMap);
    }

    public final zzai c(zzai zzaiVar) {
        zzah[] values;
        boolean z10;
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            Boolean bool = (Boolean) this.f11531a.get(zzahVar);
            Boolean bool2 = (Boolean) zzaiVar.f11531a.get(zzahVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                if (bool.booleanValue() && bool2.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bool = Boolean.valueOf(z10);
            }
            enumMap.put((EnumMap) zzahVar, (zzah) bool);
        }
        return new zzai(enumMap);
    }

    public final zzai d(zzai zzaiVar) {
        zzah[] values;
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            Boolean bool = (Boolean) this.f11531a.get(zzahVar);
            if (bool == null) {
                bool = (Boolean) zzaiVar.f11531a.get(zzahVar);
            }
            enumMap.put((EnumMap) zzahVar, (zzah) bool);
        }
        return new zzai(enumMap);
    }

    public final String e() {
        char c;
        StringBuilder sb2 = new StringBuilder("G1");
        zzah[] zzahVarArr = zzah.zzc;
        int length = zzahVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            Boolean bool = (Boolean) this.f11531a.get(zzahVarArr[i10]);
            if (bool == null) {
                c = '-';
            } else if (bool.booleanValue()) {
                c = '1';
            } else {
                c = '0';
            }
            sb2.append(c);
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        zzah[] values = zzah.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= length) {
                return true;
            }
            zzah zzahVar = values[i10];
            Boolean bool = (Boolean) this.f11531a.get(zzahVar);
            if (bool == null) {
                z10 = false;
            } else if (bool.booleanValue()) {
                z10 = true;
            } else {
                z10 = true;
            }
            Boolean bool2 = (Boolean) zzaiVar.f11531a.get(zzahVar);
            if (bool2 == null) {
                z11 = false;
            } else if (!bool2.booleanValue()) {
                z11 = true;
            }
            if (z10 != z11) {
                return false;
            }
            i10++;
        }
    }

    public final boolean f(zzah zzahVar) {
        Boolean bool = (Boolean) this.f11531a.get(zzahVar);
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean g(zzai zzaiVar, zzah... zzahVarArr) {
        for (zzah zzahVar : zzahVarArr) {
            Boolean bool = (Boolean) this.f11531a.get(zzahVar);
            Boolean bool2 = (Boolean) zzaiVar.f11531a.get(zzahVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 17;
        for (Boolean bool : this.f11531a.values()) {
            int i12 = i11 * 31;
            if (bool == null) {
                i10 = 0;
            } else if (bool.booleanValue()) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            i11 = i12 + i10;
        }
        return i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("settings: ");
        zzah[] values = zzah.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            zzah zzahVar = values[i10];
            if (i10 != 0) {
                sb2.append(", ");
            }
            sb2.append(zzahVar.name());
            sb2.append("=");
            Boolean bool = (Boolean) this.f11531a.get(zzahVar);
            if (bool == null) {
                sb2.append("uninitialized");
            } else {
                if (true != bool.booleanValue()) {
                    str = "denied";
                } else {
                    str = "granted";
                }
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public zzai(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzah.class);
        this.f11531a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
