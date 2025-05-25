package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class MapUtils {
    @KeepForSdk
    public static void a(StringBuilder sb2, HashMap<String, String> hashMap) {
        sb2.append("{");
        boolean z10 = true;
        for (String str : hashMap.keySet()) {
            if (!z10) {
                sb2.append(",");
            }
            String str2 = hashMap.get(str);
            sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            sb2.append(str);
            sb2.append("\":");
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                sb2.append(str2);
                sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            }
            z10 = false;
        }
        sb2.append("}");
    }
}
