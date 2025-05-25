package com.tom_roush.fontbox.ttf;

/* loaded from: classes2.dex */
public class MaximumProfileTable extends TTFTable {
    public static final String TAG = "maxp";
    private int maxComponentDepth;
    private int maxComponentElements;
    private int maxCompositeContours;
    private int maxCompositePoints;
    private int maxContours;
    private int maxFunctionDefs;
    private int maxInstructionDefs;
    private int maxPoints;
    private int maxSizeOfInstructions;
    private int maxStackElements;
    private int maxStorage;
    private int maxTwilightPoints;
    private int maxZones;
    private int numGlyphs;
    private float version;

    public MaximumProfileTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    public int getMaxComponentDepth() {
        return this.maxComponentDepth;
    }

    public int getMaxComponentElements() {
        return this.maxComponentElements;
    }

    public int getMaxCompositeContours() {
        return this.maxCompositeContours;
    }

    public int getMaxCompositePoints() {
        return this.maxCompositePoints;
    }

    public int getMaxContours() {
        return this.maxContours;
    }

    public int getMaxFunctionDefs() {
        return this.maxFunctionDefs;
    }

    public int getMaxInstructionDefs() {
        return this.maxInstructionDefs;
    }

    public int getMaxPoints() {
        return this.maxPoints;
    }

    public int getMaxSizeOfInstructions() {
        return this.maxSizeOfInstructions;
    }

    public int getMaxStackElements() {
        return this.maxStackElements;
    }

    public int getMaxStorage() {
        return this.maxStorage;
    }

    public int getMaxTwilightPoints() {
        return this.maxTwilightPoints;
    }

    public int getMaxZones() {
        return this.maxZones;
    }

    public int getNumGlyphs() {
        return this.numGlyphs;
    }

    public float getVersion() {
        return this.version;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    public void read(TrueTypeFont trueTypeFont, TTFDataStream tTFDataStream) {
        this.version = tTFDataStream.read32Fixed();
        this.numGlyphs = tTFDataStream.readUnsignedShort();
        this.maxPoints = tTFDataStream.readUnsignedShort();
        this.maxContours = tTFDataStream.readUnsignedShort();
        this.maxCompositePoints = tTFDataStream.readUnsignedShort();
        this.maxCompositeContours = tTFDataStream.readUnsignedShort();
        this.maxZones = tTFDataStream.readUnsignedShort();
        this.maxTwilightPoints = tTFDataStream.readUnsignedShort();
        this.maxStorage = tTFDataStream.readUnsignedShort();
        this.maxFunctionDefs = tTFDataStream.readUnsignedShort();
        this.maxInstructionDefs = tTFDataStream.readUnsignedShort();
        this.maxStackElements = tTFDataStream.readUnsignedShort();
        this.maxSizeOfInstructions = tTFDataStream.readUnsignedShort();
        this.maxComponentElements = tTFDataStream.readUnsignedShort();
        this.maxComponentDepth = tTFDataStream.readUnsignedShort();
        this.initialized = true;
    }

    public void setMaxComponentDepth(int i10) {
        this.maxComponentDepth = i10;
    }

    public void setMaxComponentElements(int i10) {
        this.maxComponentElements = i10;
    }

    public void setMaxCompositeContours(int i10) {
        this.maxCompositeContours = i10;
    }

    public void setMaxCompositePoints(int i10) {
        this.maxCompositePoints = i10;
    }

    public void setMaxContours(int i10) {
        this.maxContours = i10;
    }

    public void setMaxFunctionDefs(int i10) {
        this.maxFunctionDefs = i10;
    }

    public void setMaxInstructionDefs(int i10) {
        this.maxInstructionDefs = i10;
    }

    public void setMaxPoints(int i10) {
        this.maxPoints = i10;
    }

    public void setMaxSizeOfInstructions(int i10) {
        this.maxSizeOfInstructions = i10;
    }

    public void setMaxStackElements(int i10) {
        this.maxStackElements = i10;
    }

    public void setMaxStorage(int i10) {
        this.maxStorage = i10;
    }

    public void setMaxTwilightPoints(int i10) {
        this.maxTwilightPoints = i10;
    }

    public void setMaxZones(int i10) {
        this.maxZones = i10;
    }

    public void setNumGlyphs(int i10) {
        this.numGlyphs = i10;
    }

    public void setVersion(float f10) {
        this.version = f10;
    }
}
