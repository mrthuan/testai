package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.fontbox.ttf.OpenTypeScript;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public class PDDocumentInformation implements COSObjectable {
    private final COSDictionary info;

    public PDDocumentInformation() {
        this.info = new COSDictionary();
    }

    public String getAuthor() {
        return this.info.getString(COSName.AUTHOR);
    }

    public Calendar getCreationDate() {
        return this.info.getDate(COSName.CREATION_DATE);
    }

    public String getCreator() {
        return this.info.getString(COSName.CREATOR);
    }

    public String getCustomMetadataValue(String str) {
        return this.info.getString(str);
    }

    public String getKeywords() {
        return this.info.getString(COSName.KEYWORDS);
    }

    public Set<String> getMetadataKeys() {
        TreeSet treeSet = new TreeSet();
        for (COSName cOSName : this.info.keySet()) {
            treeSet.add(cOSName.getName());
        }
        return treeSet;
    }

    public Calendar getModificationDate() {
        return this.info.getDate(COSName.MOD_DATE);
    }

    public String getProducer() {
        return this.info.getString(COSName.PRODUCER);
    }

    public Object getPropertyStringValue(String str) {
        return this.info.getString(str);
    }

    public String getSubject() {
        return this.info.getString(COSName.SUBJECT);
    }

    public String getTitle() {
        return this.info.getString(COSName.TITLE);
    }

    public String getTrapped() {
        return this.info.getNameAsString(COSName.TRAPPED);
    }

    public void setAuthor(String str) {
        this.info.setString(COSName.AUTHOR, str);
    }

    public void setCreationDate(Calendar calendar) {
        this.info.setDate(COSName.CREATION_DATE, calendar);
    }

    public void setCreator(String str) {
        this.info.setString(COSName.CREATOR, str);
    }

    public void setCustomMetadataValue(String str, String str2) {
        this.info.setString(str, str2);
    }

    public void setKeywords(String str) {
        this.info.setString(COSName.KEYWORDS, str);
    }

    public void setModificationDate(Calendar calendar) {
        this.info.setDate(COSName.MOD_DATE, calendar);
    }

    public void setProducer(String str) {
        this.info.setString(COSName.PRODUCER, str);
    }

    public void setSubject(String str) {
        this.info.setString(COSName.SUBJECT, str);
    }

    public void setTitle(String str) {
        this.info.setString(COSName.TITLE, str);
    }

    public void setTrapped(String str) {
        if (str != null && !str.equals("True") && !str.equals("False") && !str.equals(OpenTypeScript.UNKNOWN)) {
            throw new IllegalArgumentException("Valid values for trapped are 'True', 'False', or 'Unknown'");
        }
        this.info.setName(COSName.TRAPPED, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.info;
    }

    public PDDocumentInformation(COSDictionary cOSDictionary) {
        this.info = cOSDictionary;
    }
}
