package com.tom_roush.pdfbox.pdmodel.graphics.color;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class PDOutputIntent implements COSObjectable {
    private final COSDictionary dictionary;

    public PDOutputIntent(PDDocument pDDocument, InputStream inputStream) {
        COSDictionary cOSDictionary = new COSDictionary();
        this.dictionary = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.OUTPUT_INTENT);
        cOSDictionary.setItem(COSName.S, (COSBase) COSName.GTS_PDFA1);
        cOSDictionary.setItem(COSName.DEST_OUTPUT_PROFILE, configureOutputProfile(pDDocument, inputStream));
    }

    private PDStream configureOutputProfile(PDDocument pDDocument, InputStream inputStream) {
        PDStream pDStream = new PDStream(pDDocument, inputStream, COSName.FLATE_DECODE);
        pDStream.getStream().setInt(COSName.N, 3);
        return pDStream;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.dictionary;
    }

    public COSStream getDestOutputIntent() {
        return (COSStream) this.dictionary.getDictionaryObject(COSName.DEST_OUTPUT_PROFILE);
    }

    public String getInfo() {
        return this.dictionary.getString(COSName.INFO);
    }

    public String getOutputCondition() {
        return this.dictionary.getString(COSName.OUTPUT_CONDITION);
    }

    public String getOutputConditionIdentifier() {
        return this.dictionary.getString(COSName.OUTPUT_CONDITION_IDENTIFIER);
    }

    public String getRegistryName() {
        return this.dictionary.getString(COSName.REGISTRY_NAME);
    }

    public void setInfo(String str) {
        this.dictionary.setString(COSName.INFO, str);
    }

    public void setOutputCondition(String str) {
        this.dictionary.setString(COSName.OUTPUT_CONDITION, str);
    }

    public void setOutputConditionIdentifier(String str) {
        this.dictionary.setString(COSName.OUTPUT_CONDITION_IDENTIFIER, str);
    }

    public void setRegistryName(String str) {
        this.dictionary.setString(COSName.REGISTRY_NAME, str);
    }

    public PDOutputIntent(COSDictionary cOSDictionary) {
        this.dictionary = cOSDictionary;
    }
}
