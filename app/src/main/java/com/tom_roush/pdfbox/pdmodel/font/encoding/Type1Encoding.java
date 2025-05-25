package com.tom_roush.pdfbox.pdmodel.font.encoding;

import com.tom_roush.fontbox.afm.CharMetric;
import com.tom_roush.fontbox.afm.FontMetrics;
import com.tom_roush.pdfbox.cos.COSBase;
import java.util.Map;

/* loaded from: classes2.dex */
public class Type1Encoding extends Encoding {
    public Type1Encoding() {
    }

    public static Type1Encoding fromFontBox(com.tom_roush.fontbox.encoding.Encoding encoding) {
        Map<Integer, String> codeToNameMap = encoding.getCodeToNameMap();
        Type1Encoding type1Encoding = new Type1Encoding();
        for (Map.Entry<Integer, String> entry : codeToNameMap.entrySet()) {
            type1Encoding.add(entry.getKey().intValue(), entry.getValue());
        }
        return type1Encoding;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.encoding.Encoding
    public String getEncodingName() {
        return "built-in (Type 1)";
    }

    public Type1Encoding(FontMetrics fontMetrics) {
        for (CharMetric charMetric : fontMetrics.getCharMetrics()) {
            add(charMetric.getCharacterCode(), charMetric.getName());
        }
    }
}
