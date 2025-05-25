package com.google.android.gms.internal.ads;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgzl {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzgzj zzgzjVar, String str) {
        StringBuilder g10 = a0.d.g("# ", str);
        zzd(zzgzjVar, g10, 0);
        return g10.toString();
    }

    public static void zzb(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb2, i10, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb2, i10, str, entry);
            }
        } else {
            sb2.append('\n');
            zzc(i10, sb2);
            if (!str.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Character.toLowerCase(str.charAt(0)));
                for (int i11 = 1; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (Character.isUpperCase(charAt)) {
                        sb3.append("_");
                    }
                    sb3.append(Character.toLowerCase(charAt));
                }
                str = sb3.toString();
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(zzhaq.zza(zzgwm.zzw((String) obj)));
                sb2.append('\"');
            } else if (obj instanceof zzgwm) {
                sb2.append(": \"");
                sb2.append(zzhaq.zza((zzgwm) obj));
                sb2.append('\"');
            } else if (obj instanceof zzgxy) {
                sb2.append(" {");
                zzd((zzgxy) obj, sb2, i10 + 2);
                sb2.append("\n");
                zzc(i10, sb2);
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                int i12 = i10 + 2;
                sb2.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                zzb(sb2, i12, "key", entry2.getKey());
                zzb(sb2, i12, "value", entry2.getValue());
                sb2.append("\n");
                zzc(i10, sb2);
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    private static void zzc(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(zza, 0, i11);
            i10 -= i11;
        }
    }

    private static void zzd(zzgzj zzgzjVar, StringBuilder sb2, int i10) {
        int i11;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzgzjVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (substring.endsWith(PDListAttributeObject.OWNER_LIST) && !substring.endsWith("OrBuilderList") && !substring.equals(PDListAttributeObject.OWNER_LIST) && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i10, substring.substring(0, substring.length() - 4), zzgxy.zzbR(method2, zzgzjVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i10, substring.substring(0, substring.length() - 3), zzgxy.zzbR(method, zzgzjVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzbR = zzgxy.zzbR(method4, zzgzjVar, new Object[0]);
                    if (method5 == null) {
                        if (zzbR instanceof Boolean) {
                            if (!((Boolean) zzbR).booleanValue()) {
                            }
                            zzb(sb2, i10, substring, zzbR);
                        } else if (zzbR instanceof Integer) {
                            if (((Integer) zzbR).intValue() == 0) {
                            }
                            zzb(sb2, i10, substring, zzbR);
                        } else if (zzbR instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzbR).floatValue()) == 0) {
                            }
                            zzb(sb2, i10, substring, zzbR);
                        } else if (zzbR instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzbR).doubleValue()) == 0) {
                            }
                            zzb(sb2, i10, substring, zzbR);
                        } else {
                            if (zzbR instanceof String) {
                                equals = zzbR.equals("");
                            } else if (zzbR instanceof zzgwm) {
                                equals = zzbR.equals(zzgwm.zzb);
                            } else if (zzbR instanceof zzgzj) {
                                if (zzbR == ((zzgzj) zzbR).zzbt()) {
                                }
                                zzb(sb2, i10, substring, zzbR);
                            } else {
                                if ((zzbR instanceof Enum) && ((Enum) zzbR).ordinal() == 0) {
                                }
                                zzb(sb2, i10, substring, zzbR);
                            }
                            if (equals) {
                            }
                            zzb(sb2, i10, substring, zzbR);
                        }
                    } else {
                        if (!((Boolean) zzgxy.zzbR(method5, zzgzjVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb2, i10, substring, zzbR);
                    }
                }
            }
            i11 = 3;
        }
        if (zzgzjVar instanceof zzgxu) {
            Iterator zzf = ((zzgxu) zzgzjVar).zza.zzf();
            while (zzf.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzf.next();
                zzb(sb2, i10, a0.a.g("[", ((zzgxv) entry2.getKey()).zza, "]"), entry2.getValue());
            }
        }
        zzhat zzhatVar = ((zzgxy) zzgzjVar).zzt;
        if (zzhatVar != null) {
            zzhatVar.zzi(sb2, i10);
        }
    }
}
