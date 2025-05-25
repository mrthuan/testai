package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.fontbox.cmap.CMap;
import com.tom_roush.fontbox.cmap.CMapParser;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CmapManager.java */
/* loaded from: classes2.dex */
public final class CMapManager {
    static Map<String, CMap> cMapCache = Collections.synchronizedMap(new HashMap());

    private CMapManager() {
    }

    public static CMap getPredefinedCMap(String str) {
        CMap cMap = cMapCache.get(str);
        if (cMap != null) {
            return cMap;
        }
        CMap parsePredefined = new CMapParser().parsePredefined(str);
        cMapCache.put(parsePredefined.getName(), parsePredefined);
        return parsePredefined;
    }

    public static CMap parseCMap(InputStream inputStream) {
        if (inputStream != null) {
            return new CMapParser(true).parse(inputStream);
        }
        return null;
    }
}
