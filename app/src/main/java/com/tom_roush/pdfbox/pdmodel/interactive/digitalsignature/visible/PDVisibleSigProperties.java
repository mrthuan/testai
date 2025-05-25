package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible;

import java.io.InputStream;

/* loaded from: classes2.dex */
public class PDVisibleSigProperties {
    private int page;
    private PDVisibleSignDesigner pdVisibleSignature;
    private int preferredSize;
    private String signatureReason;
    private String signerLocation;
    private String signerName;
    private InputStream visibleSignature;
    private boolean visualSignEnabled;

    public void buildSignature() {
        setVisibleSignature(new PDFTemplateCreator(new PDVisibleSigBuilder()).buildPDF(getPdVisibleSignature()));
    }

    public int getPage() {
        return this.page;
    }

    public PDVisibleSignDesigner getPdVisibleSignature() {
        return this.pdVisibleSignature;
    }

    public int getPreferredSize() {
        return this.preferredSize;
    }

    public String getSignatureReason() {
        return this.signatureReason;
    }

    public String getSignerLocation() {
        return this.signerLocation;
    }

    public String getSignerName() {
        return this.signerName;
    }

    public InputStream getVisibleSignature() {
        return this.visibleSignature;
    }

    public boolean isVisualSignEnabled() {
        return this.visualSignEnabled;
    }

    public PDVisibleSigProperties page(int i10) {
        this.page = i10;
        return this;
    }

    public PDVisibleSigProperties preferredSize(int i10) {
        this.preferredSize = i10;
        return this;
    }

    public PDVisibleSigProperties setPdVisibleSignature(PDVisibleSignDesigner pDVisibleSignDesigner) {
        this.pdVisibleSignature = pDVisibleSignDesigner;
        return this;
    }

    public void setVisibleSignature(InputStream inputStream) {
        this.visibleSignature = inputStream;
    }

    public PDVisibleSigProperties signatureReason(String str) {
        this.signatureReason = str;
        return this;
    }

    public PDVisibleSigProperties signerLocation(String str) {
        this.signerLocation = str;
        return this;
    }

    public PDVisibleSigProperties signerName(String str) {
        this.signerName = str;
        return this;
    }

    public PDVisibleSigProperties visualSignEnabled(boolean z10) {
        this.visualSignEnabled = z10;
        return this;
    }
}
