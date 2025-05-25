package com.google.android.gms.internal.play_billing;

import a0.d;
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
/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzee {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzec zzecVar, String str) {
        StringBuilder g10 = d.g("# ", str);
        zzd(zzecVar, g10, 0);
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
                sb2.append(zzfd.zza(new zzbn(((String) obj).getBytes(zzda.zzb))));
                sb2.append('\"');
            } else if (obj instanceof zzbq) {
                sb2.append(": \"");
                sb2.append(zzfd.zza((zzbq) obj));
                sb2.append('\"');
            } else if (obj instanceof zzcs) {
                sb2.append(" {");
                zzd((zzcs) obj, sb2, i10 + 2);
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

    private static void zzd(zzec zzecVar, StringBuilder sb2, int i10) {
        int i11;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzecVar.getClass().getDeclaredMethods();
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
                zzb(sb2, i10, substring.substring(0, substring.length() - 4), zzcs.zzp(method2, zzecVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i10, substring.substring(0, substring.length() - 3), zzcs.zzp(method, zzecVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzp = zzcs.zzp(method4, zzecVar, new Object[0]);
                    if (method5 == null) {
                        if (zzp instanceof Boolean) {
                            if (!((Boolean) zzp).booleanValue()) {
                            }
                            zzb(sb2, i10, substring, zzp);
                        } else if (zzp instanceof Integer) {
                            if (((Integer) zzp).intValue() == 0) {
                            }
                            zzb(sb2, i10, substring, zzp);
                        } else if (zzp instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzp).floatValue()) == 0) {
                            }
                            zzb(sb2, i10, substring, zzp);
                        } else if (zzp instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzp).doubleValue()) == 0) {
                            }
                            zzb(sb2, i10, substring, zzp);
                        } else {
                            if (zzp instanceof String) {
                                equals = zzp.equals("");
                            } else if (zzp instanceof zzbq) {
                                equals = zzp.equals(zzbq.zzb);
                            } else if (zzp instanceof zzec) {
                                if (zzp == ((zzec) zzp).zzh()) {
                                }
                                zzb(sb2, i10, substring, zzp);
                            } else {
                                if ((zzp instanceof Enum) && ((Enum) zzp).ordinal() == 0) {
                                }
                                zzb(sb2, i10, substring, zzp);
                            }
                            if (equals) {
                            }
                            zzb(sb2, i10, substring, zzp);
                        }
                    } else {
                        if (!((Boolean) zzcs.zzp(method5, zzecVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb2, i10, substring, zzp);
                    }
                }
            }
            i11 = 3;
        }
        if (zzecVar instanceof zzco) {
            Iterator zzf = ((zzco) zzecVar).zzb.zzf();
            if (zzf.hasNext()) {
                zzcp zzcpVar = (zzcp) ((Map.Entry) zzf.next()).getKey();
                throw null;
            }
        }
        zzfg zzfgVar = ((zzcs) zzecVar).zzc;
        if (zzfgVar != null) {
            zzfgVar.zzi(sb2, i10);
        }
    }
}
