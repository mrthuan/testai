package com.bykv.vk.openvk.component.video.Qhi.ac;

import a6.h;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.Qhi.cJ.Tgh;
import com.bykv.vk.openvk.component.video.Qhi.cJ.WAv;
import com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.ac;
import com.bytedance.sdk.component.Sf.ROR;
import com.bytedance.sdk.component.Sf.hm;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import org.json.JSONObject;

/* compiled from: Util.java */
/* loaded from: classes.dex */
public final class Qhi {
    private static final Handler cJ = new Handler(Looper.getMainLooper());
    public static final Charset Qhi = Charset.forName("UTF-8");

    /* compiled from: Util.java */
    /* renamed from: com.bykv.vk.openvk.component.video.Qhi.ac.Qhi$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static class AnonymousClass1 implements FilenameFilter {
        private Pattern Qhi = Pattern.compile("^cpu[0-9]+$");

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.Qhi.matcher(str).matches();
        }
    }

    public static void Qhi(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean ac(String str) {
        if (str != null) {
            if (str.startsWith("video/") || "application/octet-stream".equals(str) || "binary/octet-stream".equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static int cJ(String str) {
        return Qhi(str, 0);
    }

    public static void Qhi(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static String cJ(int i10, int i11) {
        if (i10 >= 0 && i11 > 0) {
            return i10 + "-" + i11;
        } else if (i10 > 0) {
            return i10 + "-";
        } else if (i10 >= 0 || i11 <= 0) {
            return null;
        } else {
            return "-".concat(String.valueOf(i11));
        }
    }

    public static void Qhi(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void Qhi(RandomAccessFile randomAccessFile) {
        if (randomAccessFile != null) {
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean cJ() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static boolean Qhi(String str) {
        if (str != null) {
            return str.startsWith("http://") || str.startsWith("https://");
        }
        return false;
    }

    public static String cJ(List<WAv.cJ> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            WAv.cJ cJVar = list.get(0);
            if (cJVar != null) {
                sb2.append(cJVar.Qhi);
                sb2.append(": ");
                sb2.append(cJVar.cJ);
                sb2.append("\r\n");
            }
        }
        return sb2.toString();
    }

    public static int Qhi(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return i10;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static String Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.fl.Qhi qhi, int i10) {
        int Qhi2;
        if (qhi == null || !qhi.cJ()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(qhi.fl().toUpperCase());
        sb2.append(' ');
        sb2.append(qhi.Qhi());
        sb2.append(' ');
        sb2.append(qhi.Tgh());
        sb2.append("\r\n");
        if (Tgh.f7143ac) {
            qhi.fl().toUpperCase();
            qhi.Qhi();
            qhi.Tgh();
        }
        List<WAv.cJ> Qhi3 = Qhi(qhi.ac());
        boolean z10 = true;
        if (Qhi3 != null) {
            int size = Qhi3.size();
            for (int i11 = 0; i11 < size; i11++) {
                WAv.cJ cJVar = Qhi3.get(i11);
                if (cJVar != null) {
                    String str = cJVar.Qhi;
                    String str2 = cJVar.cJ;
                    h.l(sb2, str, ": ", str2, "\r\n");
                    if ("Content-Range".equalsIgnoreCase(str) || ("Accept-Ranges".equalsIgnoreCase(str) && "bytes".equalsIgnoreCase(str2))) {
                        z10 = false;
                    }
                }
            }
        }
        if (z10 && (Qhi2 = Qhi(qhi)) > 0) {
            sb2.append("Content-Range: bytes ");
            sb2.append(Math.max(i10, 0));
            sb2.append("-");
            sb2.append(Qhi2 - 1);
            sb2.append(PackagingURIHelper.FORWARD_SLASH_STRING);
            sb2.append(Qhi2);
            sb2.append("\r\n");
        }
        sb2.append("Connection: close\r\n\r\n");
        String sb3 = sb2.toString();
        boolean z11 = Tgh.f7143ac;
        return sb3;
    }

    public static String cJ(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append((Object) entry.getKey());
            sb2.append(": ");
            sb2.append((Object) entry.getValue());
            sb2.append("\r\n");
        }
        return sb2.toString();
    }

    public static String Qhi(int i10, int i11) {
        String cJ2 = cJ(i10, i11);
        if (cJ2 == null) {
            return null;
        }
        return "bytes=".concat(cJ2);
    }

    public static List<String> Qhi(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (Qhi(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static String Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.Qhi qhi, int i10) {
        StringBuilder sb2 = new StringBuilder();
        if (i10 <= 0) {
            sb2.append("HTTP/1.1 200 OK\r\n");
        } else {
            sb2.append("HTTP/1.1 206 Partial Content\r\n");
        }
        sb2.append("Accept-Ranges: bytes\r\nContent-Type: ");
        sb2.append(qhi.cJ);
        sb2.append("\r\n");
        if (i10 <= 0) {
            sb2.append("Content-Length: ");
            sb2.append(qhi.f7158ac);
            sb2.append("\r\n");
        } else {
            sb2.append("Content-Range: bytes ");
            sb2.append(i10);
            sb2.append("-");
            sb2.append(qhi.f7158ac - 1);
            sb2.append(PackagingURIHelper.FORWARD_SLASH_STRING);
            sb2.append(qhi.f7158ac);
            sb2.append("\r\nContent-Length: ");
            sb2.append(qhi.f7158ac - i10);
            sb2.append("\r\n");
        }
        sb2.append("Connection: close\r\n\r\n");
        String sb3 = sb2.toString();
        boolean z10 = Tgh.f7143ac;
        return sb3;
    }

    public static int Qhi() {
        return Math.max(Runtime.getRuntime().availableProcessors(), 1);
    }

    public static int Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.fl.Qhi qhi) {
        int lastIndexOf;
        if (qhi == null) {
            return -1;
        }
        if (qhi.Qhi() == 200) {
            return Qhi(qhi.Qhi("Content-Length", null), -1);
        }
        if (qhi.Qhi() == 206) {
            String Qhi2 = qhi.Qhi("Content-Range", null);
            if (!TextUtils.isEmpty(Qhi2) && (lastIndexOf = Qhi2.lastIndexOf(PackagingURIHelper.FORWARD_SLASH_STRING)) >= 0 && lastIndexOf < Qhi2.length() - 1) {
                return Qhi(Qhi2.substring(lastIndexOf + 1), -1);
            }
        }
        return -1;
    }

    public static String Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.fl.Qhi qhi, boolean z10, boolean z11) {
        String Qhi2;
        if (qhi == null) {
            boolean z12 = Tgh.f7143ac;
            return "response null";
        } else if (!qhi.cJ()) {
            if (Tgh.f7143ac) {
                qhi.Qhi();
            }
            return "response code: " + qhi.Qhi();
        } else {
            String Qhi3 = qhi.Qhi("Content-Type", null);
            if (!ac(Qhi3)) {
                if (Tgh.f7143ac) {
                    "Content-Type: ".concat(String.valueOf(Qhi3));
                }
                return "Content-Type: ".concat(String.valueOf(Qhi3));
            }
            int Qhi4 = Qhi(qhi);
            if (Qhi4 <= 0) {
                if (Tgh.f7143ac) {
                    "Content-Length: ".concat(String.valueOf(Qhi4));
                }
                return "Content-Length: ".concat(String.valueOf(Qhi4));
            } else if (z10 && ((Qhi2 = qhi.Qhi("Accept-Ranges", null)) == null || !Qhi2.contains("bytes"))) {
                if (Tgh.f7143ac) {
                    "Accept-Ranges: ".concat(String.valueOf(Qhi2));
                }
                return "Accept-Ranges: ".concat(String.valueOf(Qhi2));
            } else if (z11 && qhi.CJ() == null) {
                boolean z13 = Tgh.f7143ac;
                return "response body null";
            } else {
                return null;
            }
        }
    }

    public static void Qhi(hm hmVar) {
        if (hmVar != null) {
            if (cJ()) {
                ROR.cJ(hmVar);
                boolean z10 = Tgh.f7143ac;
                return;
            }
            hmVar.run();
            boolean z11 = Tgh.f7143ac;
        }
    }

    public static void Qhi(Runnable runnable) {
        if (runnable != null) {
            if (cJ()) {
                runnable.run();
            } else {
                cJ.post(runnable);
            }
        }
    }

    public static List<WAv.cJ> Qhi(List<WAv.cJ> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        if (Tgh.f7143ac) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (WAv.cJ cJVar : list) {
            if ("Host".equals(cJVar.Qhi) || "Keep-Alive".equals(cJVar.Qhi) || "Connection".equals(cJVar.Qhi) || "Proxy-Connection".equals(cJVar.Qhi)) {
                arrayList.add(cJVar);
            }
        }
        list.removeAll(arrayList);
        if (Tgh.f7143ac) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                list.get(i11);
            }
        }
        return list;
    }

    public static List<WAv.cJ> Qhi(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            try {
                Set<Map.Entry<String, String>> entrySet = map.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : entrySet) {
                    arrayList.add(new WAv.cJ(entry.getKey(), entry.getValue()));
                }
                return arrayList;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.Qhi Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.fl.Qhi qhi, ac acVar, String str, int i10) {
        String str2;
        String str3;
        String str4;
        com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.Qhi Qhi2 = acVar.Qhi(str, i10);
        if (Qhi2 == null) {
            int Qhi3 = Qhi(qhi);
            String Qhi4 = qhi.Qhi("Content-Type", null);
            if (Qhi3 <= 0 || TextUtils.isEmpty(Qhi4)) {
                return Qhi2;
            }
            com.bykv.vk.openvk.component.video.Qhi.cJ.fl.Tgh ROR = qhi.ROR();
            if (ROR != null) {
                str3 = ROR.cJ;
                str2 = cJ(ROR.f7171fl);
            } else {
                str2 = "";
                str3 = str2;
            }
            String cJ2 = cJ(qhi.ac());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("requestUrl", str3);
                jSONObject.put("requestHeaders", str2);
                jSONObject.put("responseHeaders", cJ2);
                str4 = jSONObject.toString();
            } catch (Throwable unused) {
                str4 = "";
            }
            com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.Qhi qhi2 = new com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.Qhi(str, Qhi4, Qhi3, i10, str4);
            acVar.Qhi(qhi2);
            return qhi2;
        }
        return Qhi2;
    }
}
