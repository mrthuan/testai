package com.tom_roush.pdfbox.pdmodel.font.encoding;

import com.tom_roush.pdfbox.cos.COSBase;
import java.util.Map;

/* loaded from: classes2.dex */
public class BuiltInEncoding extends Encoding {
    public BuiltInEncoding(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            add(entry.getKey().intValue(), entry.getValue());
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        throw new UnsupportedOperationException("Built-in encodings cannot be serialized");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.encoding.Encoding
    public String getEncodingName() {
        return "built-in (TTF)";
    }
}
