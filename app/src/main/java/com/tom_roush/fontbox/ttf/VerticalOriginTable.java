package com.tom_roush.fontbox.ttf;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class VerticalOriginTable extends TTFTable {
    public static final String TAG = "VORG";
    private int defaultVertOriginY;
    private Map<Integer, Integer> origins;
    private float version;

    public VerticalOriginTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    public int getOriginY(int i10) {
        if (this.origins.containsKey(Integer.valueOf(i10))) {
            return this.origins.get(Integer.valueOf(i10)).intValue();
        }
        return this.defaultVertOriginY;
    }

    public float getVersion() {
        return this.version;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    public void read(TrueTypeFont trueTypeFont, TTFDataStream tTFDataStream) {
        this.version = tTFDataStream.read32Fixed();
        this.defaultVertOriginY = tTFDataStream.readSignedShort();
        int readUnsignedShort = tTFDataStream.readUnsignedShort();
        this.origins = new ConcurrentHashMap(readUnsignedShort);
        for (int i10 = 0; i10 < readUnsignedShort; i10++) {
            this.origins.put(Integer.valueOf(tTFDataStream.readUnsignedShort()), Integer.valueOf(tTFDataStream.readSignedShort()));
        }
        this.initialized = true;
    }
}
