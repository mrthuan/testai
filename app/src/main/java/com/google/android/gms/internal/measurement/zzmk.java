package com.google.android.gms.internal.measurement;

import a0.d;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzmk {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzmi zzmiVar, String str) {
        StringBuilder g10 = d.g("# ", str);
        zzd(zzmiVar, g10, 0);
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
                sb2.append(zzni.zza(new zzjx(((String) obj).getBytes(zzlj.zzb))));
                sb2.append('\"');
            } else if (obj instanceof zzka) {
                sb2.append(": \"");
                sb2.append(zzni.zza((zzka) obj));
                sb2.append('\"');
            } else if (obj instanceof zzlb) {
                sb2.append(" {");
                zzd((zzlb) obj, sb2, i10 + 2);
                sb2.append("\n");
                zzc(i10, sb2);
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i12 = i10 + 2;
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

    private static void zzd(zzmi zzmiVar, StringBuilder sb2, int i10) {
        int i11;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzmiVar.getClass().getDeclaredMethods();
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
                zzb(sb2, i10, substring.substring(0, substring.length() - 4), zzlb.zzbK(method2, zzmiVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i10, substring.substring(0, substring.length() - 3), zzlb.zzbK(method, zzmiVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzbK = zzlb.zzbK(method4, zzmiVar, new Object[0]);
                    if (method5 == null) {
                        if (zzbK instanceof Boolean) {
                            if (!((Boolean) zzbK).booleanValue()) {
                            }
                            zzb(sb2, i10, substring, zzbK);
                        } else if (zzbK instanceof Integer) {
                            if (((Integer) zzbK).intValue() == 0) {
                            }
                            zzb(sb2, i10, substring, zzbK);
                        } else if (zzbK instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzbK).floatValue()) == 0) {
                            }
                            zzb(sb2, i10, substring, zzbK);
                        } else if (zzbK instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzbK).doubleValue()) == 0) {
                            }
                            zzb(sb2, i10, substring, zzbK);
                        } else {
                            if (zzbK instanceof String) {
                                equals = zzbK.equals("");
                            } else if (zzbK instanceof zzka) {
                                equals = zzbK.equals(zzka.zzb);
                            } else if (zzbK instanceof zzmi) {
                                if (zzbK == ((zzmi) zzbK).zzbV()) {
                                }
                                zzb(sb2, i10, substring, zzbK);
                            } else {
                                if ((zzbK instanceof Enum) && ((Enum) zzbK).ordinal() == 0) {
                                }
                                zzb(sb2, i10, substring, zzbK);
                            }
                            if (equals) {
                            }
                            zzb(sb2, i10, substring, zzbK);
                        }
                    } else {
                        if (!((Boolean) zzlb.zzbK(method5, zzmiVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb2, i10, substring, zzbK);
                    }
                }
            }
            i11 = 3;
        }
        if (!(zzmiVar instanceof zzky)) {
            zznl zznlVar = ((zzlb) zzmiVar).zzc;
            if (zznlVar != null) {
                zznlVar.zzi(sb2, i10);
                return;
            }
            return;
        }
        zzky zzkyVar = (zzky) zzmiVar;
        throw null;
    }
}
