package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.hssf.record.PrintSetupRecord;
import lib.zj.office.fc.ss.usermodel.PrintSetup;

/* loaded from: classes3.dex */
public class HSSFPrintSetup implements PrintSetup {
    PrintSetupRecord printSetupRecord;

    public HSSFPrintSetup(PrintSetupRecord printSetupRecord) {
        this.printSetupRecord = printSetupRecord;
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public short getCopies() {
        return this.printSetupRecord.getCopies();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public boolean getDraft() {
        return this.printSetupRecord.getDraft();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public short getFitHeight() {
        return this.printSetupRecord.getFitHeight();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public short getFitWidth() {
        return this.printSetupRecord.getFitWidth();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public double getFooterMargin() {
        return this.printSetupRecord.getFooterMargin();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public short getHResolution() {
        return this.printSetupRecord.getHResolution();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public double getHeaderMargin() {
        return this.printSetupRecord.getHeaderMargin();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public boolean getLandscape() {
        return !this.printSetupRecord.getLandscape();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public boolean getLeftToRight() {
        return this.printSetupRecord.getLeftToRight();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public boolean getNoColor() {
        return this.printSetupRecord.getNoColor();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public boolean getNoOrientation() {
        return this.printSetupRecord.getNoOrientation();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public boolean getNotes() {
        return this.printSetupRecord.getNotes();
    }

    public short getOptions() {
        return this.printSetupRecord.getOptions();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public short getPageStart() {
        return this.printSetupRecord.getPageStart();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public short getPaperSize() {
        return this.printSetupRecord.getPaperSize();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public short getScale() {
        return this.printSetupRecord.getScale();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public boolean getUsePage() {
        return this.printSetupRecord.getUsePage();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public short getVResolution() {
        return this.printSetupRecord.getVResolution();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public boolean getValidSettings() {
        return this.printSetupRecord.getValidSettings();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public void setCopies(short s4) {
        this.printSetupRecord.setCopies(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public void setDraft(boolean z10) {
        this.printSetupRecord.setDraft(z10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public void setFitHeight(short s4) {
        this.printSetupRecord.setFitHeight(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public void setFitWidth(short s4) {
        this.printSetupRecord.setFitWidth(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public void setFooterMargin(double d10) {
        this.printSetupRecord.setFooterMargin(d10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public void setHResolution(short s4) {
        this.printSetupRecord.setHResolution(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public void setHeaderMargin(double d10) {
        this.printSetupRecord.setHeaderMargin(d10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public void setLandscape(boolean z10) {
        this.printSetupRecord.setLandscape(!z10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public void setLeftToRight(boolean z10) {
        this.printSetupRecord.setLeftToRight(z10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public void setNoColor(boolean z10) {
        this.printSetupRecord.setNoColor(z10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public void setNoOrientation(boolean z10) {
        this.printSetupRecord.setNoOrientation(z10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public void setNotes(boolean z10) {
        this.printSetupRecord.setNotes(z10);
    }

    public void setOptions(short s4) {
        this.printSetupRecord.setOptions(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public void setPageStart(short s4) {
        this.printSetupRecord.setPageStart(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public void setPaperSize(short s4) {
        this.printSetupRecord.setPaperSize(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public void setScale(short s4) {
        this.printSetupRecord.setScale(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public void setUsePage(boolean z10) {
        this.printSetupRecord.setUsePage(z10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public void setVResolution(short s4) {
        this.printSetupRecord.setVResolution(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.PrintSetup
    public void setValidSettings(boolean z10) {
        this.printSetupRecord.setValidSettings(z10);
    }
}
