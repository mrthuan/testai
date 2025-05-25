package com.bykv.vk.openvk.component.video.Qhi.cJ;

import android.net.Uri;
import android.text.TextUtils;
import androidx.activity.r;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Request.java */
/* loaded from: classes.dex */
public class WAv {
    public final ac Qhi;

    /* renamed from: ac  reason: collision with root package name */
    public final Qhi f7151ac;
    public final List<cJ> cJ;

    /* compiled from: Request.java */
    /* loaded from: classes.dex */
    public static final class Qhi {
        final int CJ;
        final int Qhi;
        final List<String> ROR;
        final String Tgh;

        /* renamed from: ac  reason: collision with root package name */
        final String f7152ac;
        final String cJ;

        /* renamed from: fl  reason: collision with root package name */
        final int f7153fl;

        private Qhi(int i10, String str, String str2, int i11, int i12, String str3, List<String> list) {
            this.Qhi = i10;
            this.cJ = str;
            this.f7152ac = str2;
            this.CJ = i11;
            this.f7153fl = i12;
            this.Tgh = str3;
            this.ROR = list;
        }

        public static Qhi Qhi(ac acVar, List<cJ> list) {
            String str;
            int i10;
            int i11;
            int indexOf = acVar.cJ.indexOf("?");
            if (indexOf != -1) {
                ArrayList arrayList = new ArrayList();
                String str2 = null;
                String str3 = null;
                String str4 = null;
                int i12 = 0;
                for (String str5 : acVar.cJ.substring(indexOf + 1).split("&")) {
                    String[] split = str5.split("=");
                    if (split.length == 2) {
                        if ("rk".equals(split[0])) {
                            str3 = Uri.decode(split[1]);
                        } else if (OperatorName.NON_STROKING_CMYK.equals(split[0])) {
                            str4 = Uri.decode(split[1]);
                        } else if (split[0].startsWith("u")) {
                            arrayList.add(Uri.decode(split[1]));
                        } else if ("f".equals(split[0]) && com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.cJ(split[1]) == 1) {
                            i12 = 1;
                        }
                    }
                }
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    if (list != null) {
                        i11 = 0;
                        int i13 = 0;
                        for (cJ cJVar : list) {
                            if (cJVar != null && "Range".equalsIgnoreCase(cJVar.Qhi)) {
                                int indexOf2 = cJVar.cJ.indexOf("=");
                                if (indexOf2 != -1) {
                                    if ("bytes".equalsIgnoreCase(cJVar.cJ.substring(0, indexOf2).trim())) {
                                        String substring = cJVar.cJ.substring(indexOf2 + 1);
                                        if (!substring.contains(",")) {
                                            int indexOf3 = substring.indexOf("-");
                                            if (indexOf3 != -1) {
                                                String trim = substring.substring(0, indexOf3).trim();
                                                String trim2 = substring.substring(indexOf3 + 1).trim();
                                                try {
                                                    if (trim.length() > 0) {
                                                        i11 = Integer.parseInt(trim);
                                                    }
                                                    if (trim2.length() > 0 && i11 > (i13 = Integer.parseInt(trim2))) {
                                                        throw new fl("Range format error, Range: " + cJVar.cJ);
                                                    }
                                                    str2 = cJVar.cJ;
                                                } catch (NumberFormatException unused) {
                                                    throw new fl("Range format error, Range: " + cJVar.cJ);
                                                }
                                            } else {
                                                throw new fl("Range format error, Range: " + cJVar.cJ);
                                            }
                                        } else {
                                            throw new fl("Range format error, Range: " + cJVar.cJ);
                                        }
                                    } else {
                                        throw new fl("Range format error, Range: " + cJVar.cJ);
                                    }
                                } else {
                                    throw new fl("Range format error, Range: " + cJVar.cJ);
                                }
                            }
                        }
                        i10 = i13;
                        str = str2;
                    } else {
                        str = null;
                        i10 = 0;
                        i11 = 0;
                    }
                    if (!arrayList.isEmpty()) {
                        return new Qhi(i12, str3, str4, i11, i10, str, arrayList);
                    }
                    throw new fl("no url found: path: " + acVar.cJ);
                }
                throw new fl("rawKey or key is empty, path: " + acVar.cJ);
            }
            throw new fl("path format error, path: " + acVar.cJ);
        }

        public String toString() {
            return "Extra{flag=" + this.Qhi + ", rawKey='" + this.cJ + "', key='" + this.f7152ac + "', from=" + this.CJ + ", to=" + this.f7153fl + ", urls=" + this.ROR + '}';
        }
    }

    /* compiled from: Request.java */
    /* loaded from: classes.dex */
    public static final class ac {
        final String Qhi;

        /* renamed from: ac  reason: collision with root package name */
        final String f7154ac;
        final String cJ;

        private ac(String str, String str2, String str3) {
            this.Qhi = str;
            this.cJ = str2;
            this.f7154ac = str3;
        }

        public static ac Qhi(String str) {
            int indexOf = str.indexOf(32);
            if (indexOf != -1) {
                int lastIndexOf = str.lastIndexOf(32);
                if (lastIndexOf > indexOf) {
                    String trim = str.substring(0, indexOf).trim();
                    String trim2 = str.substring(indexOf + 1, lastIndexOf).trim();
                    String trim3 = str.substring(lastIndexOf + 1).trim();
                    if (trim.length() != 0 && trim2.length() != 0 && trim3.length() != 0) {
                        return new ac(trim, trim2, trim3);
                    }
                    throw new fl("request line format error, line: ".concat(str));
                }
                throw new fl("request line format error, line: ".concat(str));
            }
            throw new fl("request line format error, line: ".concat(str));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("RequestLine{method='");
            sb2.append(this.Qhi);
            sb2.append("', path='");
            sb2.append(this.cJ);
            sb2.append("', version='");
            return r.g(sb2, this.f7154ac, "'}");
        }
    }

    /* compiled from: Request.java */
    /* loaded from: classes.dex */
    public static final class cJ {
        public final String Qhi;
        public final String cJ;

        public cJ(String str, String str2) {
            this.Qhi = str;
            this.cJ = str2;
        }

        public static cJ Qhi(String str) {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                String trim = str.substring(0, indexOf).trim();
                String trim2 = str.substring(indexOf + 1).trim();
                if (trim.length() != 0 && trim2.length() != 0) {
                    return new cJ(trim, trim2);
                }
                throw new fl("request header format error, header: ".concat(str));
            }
            throw new fl("request header format error, header: ".concat(str));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Header{name='");
            sb2.append(this.Qhi);
            sb2.append("', value='");
            return r.g(sb2, this.cJ, "'}");
        }
    }

    /* compiled from: Request.java */
    /* loaded from: classes.dex */
    public static final class fl extends Exception {
        public fl(String str) {
            super(str);
        }
    }

    public WAv(ac acVar, List<cJ> list, Qhi qhi) {
        this.Qhi = acVar;
        this.cJ = list;
        this.f7151ac = qhi;
    }

    public static WAv Qhi(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi));
        ArrayList arrayList = new ArrayList();
        ac acVar = null;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                break;
            }
            String trim = readLine.trim();
            if (acVar == null) {
                acVar = ac.Qhi(trim);
            } else {
                arrayList.add(cJ.Qhi(trim));
            }
        }
        if (acVar != null) {
            return new WAv(acVar, arrayList, Qhi.Qhi(acVar, arrayList));
        }
        throw new fl("request line is null");
    }

    public String toString() {
        return "Request{requestLine=" + this.Qhi + ", headers=" + this.cJ + ", extra=" + this.f7151ac + '}';
    }

    public static String Qhi(String str, String str2, List<String> list) {
        StringBuilder sb2 = new StringBuilder(512);
        String str3 = null;
        do {
            if (str3 != null) {
                if (list.size() == 1) {
                    return null;
                }
                list.remove(list.size() - 1);
            }
            str3 = Qhi(sb2, str, str2, list);
        } while (str3.length() > 3072);
        return str3;
    }

    private static String Qhi(StringBuilder sb2, String str, String str2, List<String> list) {
        sb2.delete(0, sb2.length());
        sb2.append("rk=");
        sb2.append(Uri.encode(str));
        sb2.append("&k=");
        sb2.append(Uri.encode(str2));
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append("&u");
            sb2.append(i10);
            sb2.append("=");
            sb2.append(Uri.encode(list.get(i10)));
        }
        return sb2.toString();
    }
}
