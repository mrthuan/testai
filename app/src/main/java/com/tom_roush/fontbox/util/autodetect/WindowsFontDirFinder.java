package com.tom_roush.fontbox.util.autodetect;

import a0.a;
import androidx.activity.r;
import com.tom_roush.fontbox.util.Charsets;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes2.dex */
public class WindowsFontDirFinder implements FontDirFinder {
    private String getWinDir(String str) {
        Process exec;
        Runtime runtime = Runtime.getRuntime();
        if (str.startsWith("Windows 9")) {
            exec = runtime.exec("command.com /c echo %windir%");
        } else {
            exec = runtime.exec("cmd.exe /c echo %windir%");
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream(), Charsets.ISO_8859_1));
        String readLine = bufferedReader.readLine();
        bufferedReader.close();
        return readLine;
    }

    @Override // com.tom_roush.fontbox.util.autodetect.FontDirFinder
    public List<File> find() {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        try {
            str = System.getProperty("env.windir");
        } catch (SecurityException unused) {
            str = null;
        }
        String property = System.getProperty("os.name");
        if (str == null) {
            try {
                str = getWinDir(property);
            } catch (IOException | SecurityException unused2) {
            }
        }
        if (str != null && str.length() > 2) {
            if (str.endsWith(PackagingURIHelper.FORWARD_SLASH_STRING)) {
                str = str.substring(0, str.length() - 1);
            }
            StringBuilder k10 = a.k(str);
            String str3 = File.separator;
            File file = new File(r.g(k10, str3, "FONTS"));
            if (file.exists() && file.canRead()) {
                arrayList.add(file);
            }
            File file2 = new File(str.substring(0, 2) + str3 + "PSFONTS");
            if (file2.exists() && file2.canRead()) {
                arrayList.add(file2);
            }
        } else {
            if (property.endsWith("NT")) {
                str2 = "WINNT";
            } else {
                str2 = "WINDOWS";
            }
            for (char c = 'C'; c <= 'E'; c = (char) (c + 1)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c);
                sb2.append(":");
                String str4 = File.separator;
                sb2.append(str4);
                sb2.append(str2);
                sb2.append(str4);
                sb2.append("FONTS");
                File file3 = new File(sb2.toString());
                try {
                    if (file3.exists() && file3.canRead()) {
                        arrayList.add(file3);
                        break;
                    }
                } catch (SecurityException unused3) {
                }
            }
            for (char c10 = 'C'; c10 <= 'E'; c10 = (char) (c10 + 1)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(c10);
                sb3.append(":");
                File file4 = new File(r.g(sb3, File.separator, "PSFONTS"));
                try {
                    if (file4.exists() && file4.canRead()) {
                        arrayList.add(file4);
                        break;
                    }
                } catch (SecurityException unused4) {
                }
            }
        }
        return arrayList;
    }
}
